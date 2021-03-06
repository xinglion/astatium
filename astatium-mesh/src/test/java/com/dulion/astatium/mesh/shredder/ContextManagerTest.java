/**
 * Copyright 2016 Phillip DuLion
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.dulion.astatium.mesh.shredder;

import static org.junit.Assert.assertEquals;

import com.dulion.astatium.mesh.Context;
import com.dulion.astatium.mesh.MetaGraph;
import com.dulion.astatium.mesh.meta.ContextBuilder;
import com.dulion.astatium.mesh.meta.ContextLoader;
import com.dulion.astatium.mesh.meta.memory.MemoryContextBuilder;
import com.dulion.astatium.mesh.meta.memory.MemoryContextLoader;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.xml.namespace.QName;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader = AnnotationConfigContextLoader.class)
public class ContextManagerTest {
  @Configuration
  static class SpringConfiguration {
    @Bean
    public MetaGraph factory(ContextLoader loader, ContextBuilder builder) {
      return new ContextManager(loader, builder);
    }

    @Bean
    public ContextLoader contextLoader() {
      return new MemoryContextLoader();
    }

    @Bean
    public ContextBuilder contextBuilder() {
      return new MemoryContextBuilder();
    }
  }

  @Resource
  private ContextManager manager;

  private final List<Context> nodes = new ArrayList<>();

  @Test
  public void childOrdering() throws Exception {
    // Create
    nodes.add(manager.getRootContext());
    populate("/", 4, 3);
    nodes.remove(0); // Remove base element.

    System.out.println("Natural Order");
    nodes.stream()
        .forEach(node -> System.out.printf("%-19s %s\n", node.getRange(), node.getName()));

    // Sort
    List<Context> copy = new ArrayList<>(nodes);
    copy.sort(Context.byContext());

    System.out.println("Sorted by Locator");
    copy.stream().forEach(node -> System.out.printf("%-19s %s\n", node.getRange(), node.getName()));

    assertEquals(nodes, copy);
  }

  private void populate(CharSequence path, int width, int depth) {
    if (depth < 0) {
      return;
    }

    Context parent = nodes.get(nodes.size() - 1);
    for (int j = 0; j < width; j++) {
      StringBuilder text = new StringBuilder(path);
      text.append(j);
      nodes.add(manager.getElementContext(parent, new QName(text.toString())));
      text.append('/');
      populate(text, width, depth - 1);
    }
  }
}
