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
public final class ContextData implements ImmutableBean
{
	@PropertyDefinition
	private final int m_contextId;

	@PropertyDefinition
	private final ContextType m_type;
	
	@PropertyDefinition
	private final String m_namespace;

	@PropertyDefinition
	private final String m_name;

	//------------------------- AUTOGENERATED START -------------------------
	///CLOVER:OFF
	/**
	 * The meta-bean for {@code ContextData}.
	 * @return the meta-bean, not null
	 */
	public static ContextData.Meta meta() {
		return ContextData.Meta.INSTANCE;
	}

	static {
		JodaBeanUtils.registerMetaBean(ContextData.Meta.INSTANCE);
	}

	/**
	 * Returns a builder used to create an instance of the bean.
	 * @return the builder, not null
	 */
	public static ContextData.Builder builder() {
		return new ContextData.Builder();
	}

	private ContextData(
			int contextId,
			ContextType type,
			String namespace,
			String name) {
		this.m_contextId = contextId;
		this.m_type = type;
		this.m_namespace = namespace;
		this.m_name = name;
	}

	@Override
	public ContextData.Meta metaBean() {
		return ContextData.Meta.INSTANCE;
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
	 * Gets the contextId.
	 * @return the value of the property
	 */
	public int getContextId() {
		return m_contextId;
	}

	//-----------------------------------------------------------------------
	/**
	 * Gets the type.
	 * @return the value of the property
	 */
	public ContextType getType() {
		return m_type;
	}

	//-----------------------------------------------------------------------
	/**
	 * Gets the namespace.
	 * @return the value of the property
	 */
	public String getNamespace() {
		return m_namespace;
	}

	//-----------------------------------------------------------------------
	/**
	 * Gets the name.
	 * @return the value of the property
	 */
	public String getName() {
		return m_name;
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
			ContextData other = (ContextData) obj;
			return (m_contextId == other.m_contextId) &&
					JodaBeanUtils.equal(m_type, other.m_type) &&
					JodaBeanUtils.equal(m_namespace, other.m_namespace) &&
					JodaBeanUtils.equal(m_name, other.m_name);
		}
		return false;
	}

	@Override
	public int hashCode() {
		int hash = getClass().hashCode();
		hash = hash * 31 + JodaBeanUtils.hashCode(m_contextId);
		hash = hash * 31 + JodaBeanUtils.hashCode(m_type);
		hash = hash * 31 + JodaBeanUtils.hashCode(m_namespace);
		hash = hash * 31 + JodaBeanUtils.hashCode(m_name);
		return hash;
	}

	@Override
	public String toString() {
		StringBuilder buf = new StringBuilder(160);
		buf.append("ContextData{");
		buf.append("contextId").append('=').append(m_contextId).append(',').append(' ');
		buf.append("type").append('=').append(m_type).append(',').append(' ');
		buf.append("namespace").append('=').append(m_namespace).append(',').append(' ');
		buf.append("name").append('=').append(JodaBeanUtils.toString(m_name));
		buf.append('}');
		return buf.toString();
	}

	//-----------------------------------------------------------------------
	/**
	 * The meta-bean for {@code ContextData}.
	 */
	public static final class Meta extends DirectMetaBean {
		/**
		 * The singleton instance of the meta-bean.
		 */
		static final Meta INSTANCE = new Meta();

		/**
		 * The meta-property for the {@code contextId} property.
		 */
		private final MetaProperty<Integer> m_contextId = DirectMetaProperty.ofImmutable(
				this, "contextId", ContextData.class, Integer.TYPE);
		/**
		 * The meta-property for the {@code type} property.
		 */
		private final MetaProperty<ContextType> m_type = DirectMetaProperty.ofImmutable(
				this, "type", ContextData.class, ContextType.class);
		/**
		 * The meta-property for the {@code namespace} property.
		 */
		private final MetaProperty<String> m_namespace = DirectMetaProperty.ofImmutable(
				this, "namespace", ContextData.class, String.class);
		/**
		 * The meta-property for the {@code name} property.
		 */
		private final MetaProperty<String> m_name = DirectMetaProperty.ofImmutable(
				this, "name", ContextData.class, String.class);
		/**
		 * The meta-properties.
		 */
		private final Map<String, MetaProperty<?>> m_metaPropertyMap$ = new DirectMetaPropertyMap(
				this, null,
				"contextId",
				"type",
				"namespace",
				"name");

		/**
		 * Restricted constructor.
		 */
		private Meta() {
		}

		@Override
		protected MetaProperty<?> metaPropertyGet(String propertyName) {
			switch (propertyName.hashCode()) {
				case -406810838:  // contextId
					return m_contextId;
				case 3575610:  // type
					return m_type;
				case 1252218203:  // namespace
					return m_namespace;
				case 3373707:  // name
					return m_name;
			}
			return super.metaPropertyGet(propertyName);
		}

		@Override
		public ContextData.Builder builder() {
			return new ContextData.Builder();
		}

		@Override
		public Class<? extends ContextData> beanType() {
			return ContextData.class;
		}

		@Override
		public Map<String, MetaProperty<?>> metaPropertyMap() {
			return m_metaPropertyMap$;
		}

		//-----------------------------------------------------------------------
		@Override
		protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
			switch (propertyName.hashCode()) {
				case -406810838:  // contextId
					return ((ContextData) bean).getContextId();
				case 3575610:  // type
					return ((ContextData) bean).getType();
				case 1252218203:  // namespace
					return ((ContextData) bean).getNamespace();
				case 3373707:  // name
					return ((ContextData) bean).getName();
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
	 * The bean-builder for {@code ContextData}.
	 */
	public static final class Builder extends DirectFieldsBeanBuilder<ContextData> {

		private int m_contextId;
		private ContextType m_type;
		private String m_namespace;
		private String m_name;

		/**
		 * Restricted constructor.
		 */
		private Builder() {
		}

		/**
		 * Restricted copy constructor.
		 * @param beanToCopy  the bean to copy from, not null
		 */
		private Builder(ContextData beanToCopy) {
			this.m_contextId = beanToCopy.getContextId();
			this.m_type = beanToCopy.getType();
			this.m_namespace = beanToCopy.getNamespace();
			this.m_name = beanToCopy.getName();
		}

		//-----------------------------------------------------------------------
		@Override
		public Object get(String propertyName) {
			switch (propertyName.hashCode()) {
				case -406810838:  // contextId
					return m_contextId;
				case 3575610:  // type
					return m_type;
				case 1252218203:  // namespace
					return m_namespace;
				case 3373707:  // name
					return m_name;
				default:
					throw new NoSuchElementException("Unknown property: " + propertyName);
			}
		}

		@Override
		public Builder set(String propertyName, Object newValue) {
			switch (propertyName.hashCode()) {
				case -406810838:  // contextId
					this.m_contextId = (Integer) newValue;
					break;
				case 3575610:  // type
					this.m_type = (ContextType) newValue;
					break;
				case 1252218203:  // namespace
					this.m_namespace = (String) newValue;
					break;
				case 3373707:  // name
					this.m_name = (String) newValue;
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
		public ContextData build() {
			return new ContextData(
					m_contextId,
					m_type,
					m_namespace,
					m_name);
		}

		//-----------------------------------------------------------------------
		/**
		 * Sets the contextId.
		 * @param contextId  the new value
		 * @return this, for chaining, not null
		 */
		public Builder contextId(int contextId) {
			this.m_contextId = contextId;
			return this;
		}

		/**
		 * Sets the type.
		 * @param type  the new value
		 * @return this, for chaining, not null
		 */
		public Builder type(ContextType type) {
			this.m_type = type;
			return this;
		}

		/**
		 * Sets the namespace.
		 * @param namespace  the new value
		 * @return this, for chaining, not null
		 */
		public Builder namespace(String namespace) {
			this.m_namespace = namespace;
			return this;
		}

		/**
		 * Sets the name.
		 * @param name  the new value
		 * @return this, for chaining, not null
		 */
		public Builder name(String name) {
			this.m_name = name;
			return this;
		}

		//-----------------------------------------------------------------------
		@Override
		public String toString() {
			StringBuilder buf = new StringBuilder(160);
			buf.append("ContextData.Builder{");
			buf.append("contextId").append('=').append(JodaBeanUtils.toString(m_contextId)).append(',').append(' ');
			buf.append("type").append('=').append(JodaBeanUtils.toString(m_type)).append(',').append(' ');
			buf.append("namespace").append('=').append(JodaBeanUtils.toString(m_namespace)).append(',').append(' ');
			buf.append("name").append('=').append(JodaBeanUtils.toString(m_name));
			buf.append('}');
			return buf.toString();
		}

	}

	///CLOVER:ON
	//-------------------------- AUTOGENERATED END --------------------------
}
