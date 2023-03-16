/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A list of features which will be configured for the organization.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/OrganizationFeatureConfigurationResult"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OrganizationFeatureConfigurationResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the feature that is configured for the member accounts within the organization.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Describes how The status of the feature that are configured for the member accounts within the organization.
     * </p>
     * <p>
     * If you set <code>AutoEnable</code> to <code>NEW</code>, a feature will be configured for only the new accounts
     * when they join the organization.
     * </p>
     * <p>
     * If you set <code>AutoEnable</code> to <code>NONE</code>, no feature will be configured for the accounts when they
     * join the organization.
     * </p>
     */
    private String autoEnable;

    /**
     * <p>
     * The name of the feature that is configured for the member accounts within the organization.
     * </p>
     * 
     * @param name
     *        The name of the feature that is configured for the member accounts within the organization.
     * @see OrgFeature
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the feature that is configured for the member accounts within the organization.
     * </p>
     * 
     * @return The name of the feature that is configured for the member accounts within the organization.
     * @see OrgFeature
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the feature that is configured for the member accounts within the organization.
     * </p>
     * 
     * @param name
     *        The name of the feature that is configured for the member accounts within the organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrgFeature
     */

    public OrganizationFeatureConfigurationResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of the feature that is configured for the member accounts within the organization.
     * </p>
     * 
     * @param name
     *        The name of the feature that is configured for the member accounts within the organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrgFeature
     */

    public OrganizationFeatureConfigurationResult withName(OrgFeature name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * Describes how The status of the feature that are configured for the member accounts within the organization.
     * </p>
     * <p>
     * If you set <code>AutoEnable</code> to <code>NEW</code>, a feature will be configured for only the new accounts
     * when they join the organization.
     * </p>
     * <p>
     * If you set <code>AutoEnable</code> to <code>NONE</code>, no feature will be configured for the accounts when they
     * join the organization.
     * </p>
     * 
     * @param autoEnable
     *        Describes how The status of the feature that are configured for the member accounts within the
     *        organization.</p>
     *        <p>
     *        If you set <code>AutoEnable</code> to <code>NEW</code>, a feature will be configured for only the new
     *        accounts when they join the organization.
     *        </p>
     *        <p>
     *        If you set <code>AutoEnable</code> to <code>NONE</code>, no feature will be configured for the accounts
     *        when they join the organization.
     * @see OrgFeatureStatus
     */

    public void setAutoEnable(String autoEnable) {
        this.autoEnable = autoEnable;
    }

    /**
     * <p>
     * Describes how The status of the feature that are configured for the member accounts within the organization.
     * </p>
     * <p>
     * If you set <code>AutoEnable</code> to <code>NEW</code>, a feature will be configured for only the new accounts
     * when they join the organization.
     * </p>
     * <p>
     * If you set <code>AutoEnable</code> to <code>NONE</code>, no feature will be configured for the accounts when they
     * join the organization.
     * </p>
     * 
     * @return Describes how The status of the feature that are configured for the member accounts within the
     *         organization.</p>
     *         <p>
     *         If you set <code>AutoEnable</code> to <code>NEW</code>, a feature will be configured for only the new
     *         accounts when they join the organization.
     *         </p>
     *         <p>
     *         If you set <code>AutoEnable</code> to <code>NONE</code>, no feature will be configured for the accounts
     *         when they join the organization.
     * @see OrgFeatureStatus
     */

    public String getAutoEnable() {
        return this.autoEnable;
    }

    /**
     * <p>
     * Describes how The status of the feature that are configured for the member accounts within the organization.
     * </p>
     * <p>
     * If you set <code>AutoEnable</code> to <code>NEW</code>, a feature will be configured for only the new accounts
     * when they join the organization.
     * </p>
     * <p>
     * If you set <code>AutoEnable</code> to <code>NONE</code>, no feature will be configured for the accounts when they
     * join the organization.
     * </p>
     * 
     * @param autoEnable
     *        Describes how The status of the feature that are configured for the member accounts within the
     *        organization.</p>
     *        <p>
     *        If you set <code>AutoEnable</code> to <code>NEW</code>, a feature will be configured for only the new
     *        accounts when they join the organization.
     *        </p>
     *        <p>
     *        If you set <code>AutoEnable</code> to <code>NONE</code>, no feature will be configured for the accounts
     *        when they join the organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrgFeatureStatus
     */

    public OrganizationFeatureConfigurationResult withAutoEnable(String autoEnable) {
        setAutoEnable(autoEnable);
        return this;
    }

    /**
     * <p>
     * Describes how The status of the feature that are configured for the member accounts within the organization.
     * </p>
     * <p>
     * If you set <code>AutoEnable</code> to <code>NEW</code>, a feature will be configured for only the new accounts
     * when they join the organization.
     * </p>
     * <p>
     * If you set <code>AutoEnable</code> to <code>NONE</code>, no feature will be configured for the accounts when they
     * join the organization.
     * </p>
     * 
     * @param autoEnable
     *        Describes how The status of the feature that are configured for the member accounts within the
     *        organization.</p>
     *        <p>
     *        If you set <code>AutoEnable</code> to <code>NEW</code>, a feature will be configured for only the new
     *        accounts when they join the organization.
     *        </p>
     *        <p>
     *        If you set <code>AutoEnable</code> to <code>NONE</code>, no feature will be configured for the accounts
     *        when they join the organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrgFeatureStatus
     */

    public OrganizationFeatureConfigurationResult withAutoEnable(OrgFeatureStatus autoEnable) {
        this.autoEnable = autoEnable.toString();
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getAutoEnable() != null)
            sb.append("AutoEnable: ").append(getAutoEnable());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OrganizationFeatureConfigurationResult == false)
            return false;
        OrganizationFeatureConfigurationResult other = (OrganizationFeatureConfigurationResult) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getAutoEnable() == null ^ this.getAutoEnable() == null)
            return false;
        if (other.getAutoEnable() != null && other.getAutoEnable().equals(this.getAutoEnable()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getAutoEnable() == null) ? 0 : getAutoEnable().hashCode());
        return hashCode;
    }

    @Override
    public OrganizationFeatureConfigurationResult clone() {
        try {
            return (OrganizationFeatureConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.OrganizationFeatureConfigurationResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
