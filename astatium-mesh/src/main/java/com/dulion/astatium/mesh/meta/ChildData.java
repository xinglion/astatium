/**
 * Copyright 2016 Phillip DuLion
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.dulion.astatium.mesh.meta;

import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import org.joda.beans.Bean;
import org.joda.beans.BeanDefinition;
import org.joda.beans.ImmutableBean;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaProperty;
import org.joda.beans.Property;
import org.joda.beans.PropertyDefinition;
import org.joda.beans.impl.direct.DirectFieldsBeanBuilder;
import org.joda.beans.impl.direct.DirectMetaBean;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;

@BeanDefinition(style = "minimal")
public class ChildData implements ImmutableBean
{
	@PropertyDefinition
	private final int m_index;
	
	@PropertyDefinition
	private final int m_contextId;
	
	//------------------------- AUTOGENERATED START -------------------------
	///CLOVER:OFF
	/**
	 * The meta-bean for {@code ChildData}.
	 * @return the meta-bean, not null
	 */
	public static ChildData.Meta meta() {
		return ChildData.Meta.INSTANCE;
	}

	static {
		JodaBeanUtils.registerMetaBean(ChildData.Meta.INSTANCE);
	}

	/**
	 * Returns a builder used to create an instance of the bean.
	 * @return the builder, not null
	 */
	public static ChildData.Builder builder() {
		return new ChildData.Builder();
	}

	/**
	 * Restricted constructor.
	 * @param builder  the builder to copy from, not null
	 */
	protected ChildData(ChildData.Builder builder) {
		this.m_index = builder.m_index;
		this.m_contextId = builder.m_contextId;
	}

	@Override
	public ChildData.Meta metaBean() {
		return ChildData.Meta.INSTANCE;
	}

	@Override
	public <R> Property<R> property(String propertyName) {
		return metaBean().<R>metaProperty(propertyName).createProperty(this);
	}

	@Override
	public Set<String> propertyNames() {
		return metaBean().metaPropertyMap().keySet();
	}

	//-----------------------------------------------------------------------
	/**
	 * Gets the index.
	 * @return the value of the property
	 */
	public int getIndex() {
		return m_index;
	}

	//-----------------------------------------------------------------------
	/**
	 * Gets the contextId.
	 * @return the value of the property
	 */
	public int getContextId() {
		return m_contextId;
	}

	//-----------------------------------------------------------------------
	/**
	 * Returns a builder that allows this bean to be mutated.
	 * @return the mutable builder, not null
	 */
	public Builder toBuilder() {
		return new Builder(this);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (obj != null && obj.getClass() == this.getClass()) {
			ChildData other = (ChildData) obj;
			return (m_index == other.m_index) &&
					(m_contextId == other.m_contextId);
		}
		return false;
	}

	@Override
	public int hashCode() {
		int hash = getClass().hashCode();
		hash = hash * 31 + JodaBeanUtils.hashCode(m_index);
		hash = hash * 31 + JodaBeanUtils.hashCode(m_contextId);
		return hash;
	}

	@Override
	public String toString() {
		StringBuilder buf = new StringBuilder(96);
		buf.append("ChildData{");
		int len = buf.length();
		toString(buf);
		if (buf.length() > len) {
			buf.setLength(buf.length() - 2);
		}
		buf.append('}');
		return buf.toString();
	}

	protected void toString(StringBuilder buf) {
		buf.append("index").append('=').append(JodaBeanUtils.toString(m_index)).append(',').append(' ');
		buf.append("contextId").append('=').append(JodaBeanUtils.toString(m_contextId)).append(',').append(' ');
	}

	//-----------------------------------------------------------------------
	/**
	 * The meta-bean for {@code ChildData}.
	 */
	public static class Meta extends DirectMetaBean {
		/**
		 * The singleton instance of the meta-bean.
		 */
		static final Meta INSTANCE = new Meta();

		/**
		 * The meta-property for the {@code index} property.
		 */
		private final MetaProperty<Integer> m_index = DirectMetaProperty.ofImmutable(
				this, "index", ChildData.class, Integer.TYPE);
		/**
		 * The meta-property for the {@code contextId} property.
		 */
		private final MetaProperty<Integer> m_contextId = DirectMetaProperty.ofImmutable(
				this, "contextId", ChildData.class, Integer.TYPE);
		/**
		 * The meta-properties.
		 */
		private final Map<String, MetaProperty<?>> m_metaPropertyMap$ = new DirectMetaPropertyMap(
				this, null,
				"index",
				"contextId");

		/**
		 * Restricted constructor.
		 */
		protected Meta() {
		}

		@Override
		protected MetaProperty<?> metaPropertyGet(String propertyName) {
			switch (propertyName.hashCode()) {
				case 100346066:  // index
					return m_index;
				case -406810838:  // contextId
					return m_contextId;
			}
			return super.metaPropertyGet(propertyName);
		}

		@Override
		public ChildData.Builder builder() {
			return new ChildData.Builder();
		}

		@Override
		public Class<? extends ChildData> beanType() {
			return ChildData.class;
		}

		@Override
		public Map<String, MetaProperty<?>> metaPropertyMap() {
			return m_metaPropertyMap$;
		}

		//-----------------------------------------------------------------------
		@Override
		protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
			switch (propertyName.hashCode()) {
				case 100346066:  // index
					return ((ChildData) bean).getIndex();
				case -406810838:  // contextId
					return ((ChildData) bean).getContextId();
			}
			return super.propertyGet(bean, propertyName, quiet);
		}

		@Override
		protected void propertySet(Bean bean, String propertyName, Object newValue, boolean quiet) {
			metaProperty(propertyName);
			if (quiet) {
				return;
			}
			throw new UnsupportedOperationException("Property cannot be written: " + propertyName);
		}

	}

	//-----------------------------------------------------------------------
	/**
	 * The bean-builder for {@code ChildData}.
	 */
	public static class Builder extends DirectFieldsBeanBuilder<ChildData> {

		private int m_index;
		private int m_contextId;

		/**
		 * Restricted constructor.
		 */
		protected Builder() {
		}

		/**
		 * Restricted copy constructor.
		 * @param beanToCopy  the bean to copy from, not null
		 */
		protected Builder(ChildData beanToCopy) {
			this.m_index = beanToCopy.getIndex();
			this.m_contextId = beanToCopy.getContextId();
		}

		//-----------------------------------------------------------------------
		@Override
		public Object get(String propertyName) {
			switch (propertyName.hashCode()) {
				case 100346066:  // index
					return m_index;
				case -406810838:  // contextId
					return m_contextId;
				default:
					throw new NoSuchElementException("Unknown property: " + propertyName);
			}
		}

		@Override
		public Builder set(String propertyName, Object newValue) {
			switch (propertyName.hashCode()) {
				case 100346066:  // index
					this.m_index = (Integer) newValue;
					break;
				case -406810838:  // contextId
					this.m_contextId = (Integer) newValue;
					break;
				default:
					throw new NoSuchElementException("Unknown property: " + propertyName);
			}
			return this;
		}

		@Override
		public Builder set(MetaProperty<?> property, Object value) {
			super.set(property, value);
			return this;
		}

		@Override
		public Builder setString(String propertyName, String value) {
			setString(meta().metaProperty(propertyName), value);
			return this;
		}

		@Override
		public Builder setString(MetaProperty<?> property, String value) {
			super.setString(property, value);
			return this;
		}

		@Override
		public Builder setAll(Map<String, ? extends Object> propertyValueMap) {
			super.setAll(propertyValueMap);
			return this;
		}

		@Override
		public ChildData build() {
			return new ChildData(this);
		}

		//-----------------------------------------------------------------------
		/**
		 * Sets the index.
		 * @param index  the new value
		 * @return this, for chaining, not null
		 */
		public Builder index(int index) {
			this.m_index = index;
			return this;
		}

		/**
		 * Sets the contextId.
		 * @param contextId  the new value
		 * @return this, for chaining, not null
		 */
		public Builder contextId(int contextId) {
			this.m_contextId = contextId;
			return this;
		}

		//-----------------------------------------------------------------------
		@Override
		public String toString() {
			StringBuilder buf = new StringBuilder(96);
			buf.append("ChildData.Builder{");
			int len = buf.length();
			toString(buf);
			if (buf.length() > len) {
				buf.setLength(buf.length() - 2);
			}
			buf.append('}');
			return buf.toString();
		}

		protected void toString(StringBuilder buf) {
			buf.append("index").append('=').append(JodaBeanUtils.toString(m_index)).append(',').append(' ');
			buf.append("contextId").append('=').append(JodaBeanUtils.toString(m_contextId)).append(',').append(' ');
		}

	}

	///CLOVER:ON
	//-------------------------- AUTOGENERATED END --------------------------
}
