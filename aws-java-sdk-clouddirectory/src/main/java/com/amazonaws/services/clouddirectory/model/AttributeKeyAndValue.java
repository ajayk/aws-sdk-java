/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.clouddirectory.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The combination of an attribute key and an attribute value.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/AttributeKeyAndValue"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AttributeKeyAndValue implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The key of the attribute.
     * </p>
     */
    private AttributeKey key;
    /**
     * <p>
     * The value of the attribute.
     * </p>
     */
    private TypedAttributeValue value;

    /**
     * <p>
     * The key of the attribute.
     * </p>
     * 
     * @param key
     *        The key of the attribute.
     */

    public void setKey(AttributeKey key) {
        this.key = key;
    }

    /**
     * <p>
     * The key of the attribute.
     * </p>
     * 
     * @return The key of the attribute.
     */

    public AttributeKey getKey() {
        return this.key;
    }

    /**
     * <p>
     * The key of the attribute.
     * </p>
     * 
     * @param key
     *        The key of the attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeKeyAndValue withKey(AttributeKey key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The value of the attribute.
     * </p>
     * 
     * @param value
     *        The value of the attribute.
     */

    public void setValue(TypedAttributeValue value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the attribute.
     * </p>
     * 
     * @return The value of the attribute.
     */

    public TypedAttributeValue getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of the attribute.
     * </p>
     * 
     * @param value
     *        The value of the attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeKeyAndValue withValue(TypedAttributeValue value) {
        setValue(value);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttributeKeyAndValue == false)
            return false;
        AttributeKeyAndValue other = (AttributeKeyAndValue) obj;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public AttributeKeyAndValue clone() {
        try {
            return (AttributeKeyAndValue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.clouddirectory.model.transform.AttributeKeyAndValueMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
