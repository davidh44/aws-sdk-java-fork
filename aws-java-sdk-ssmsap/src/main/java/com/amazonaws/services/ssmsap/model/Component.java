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
package com.amazonaws.services.ssmsap.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The SAP component of your application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/Component" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Component implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the component.
     * </p>
     */
    private String componentId;
    /**
     * <p>
     * The ID of the application.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The type of the component.
     * </p>
     */
    private String componentType;
    /**
     * <p>
     * The status of the component.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The SAP HANA databases of the component.
     * </p>
     */
    private java.util.List<String> databases;
    /**
     * <p>
     * The hosts of the component.
     * </p>
     */
    private java.util.List<Host> hosts;
    /**
     * <p>
     * The primary host of the component.
     * </p>
     */
    private String primaryHost;
    /**
     * <p>
     * The time at which the component was last updated.
     * </p>
     */
    private java.util.Date lastUpdated;

    /**
     * <p>
     * The ID of the component.
     * </p>
     * 
     * @param componentId
     *        The ID of the component.
     */

    public void setComponentId(String componentId) {
        this.componentId = componentId;
    }

    /**
     * <p>
     * The ID of the component.
     * </p>
     * 
     * @return The ID of the component.
     */

    public String getComponentId() {
        return this.componentId;
    }

    /**
     * <p>
     * The ID of the component.
     * </p>
     * 
     * @param componentId
     *        The ID of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Component withComponentId(String componentId) {
        setComponentId(componentId);
        return this;
    }

    /**
     * <p>
     * The ID of the application.
     * </p>
     * 
     * @param applicationId
     *        The ID of the application.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The ID of the application.
     * </p>
     * 
     * @return The ID of the application.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The ID of the application.
     * </p>
     * 
     * @param applicationId
     *        The ID of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Component withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The type of the component.
     * </p>
     * 
     * @param componentType
     *        The type of the component.
     * @see ComponentType
     */

    public void setComponentType(String componentType) {
        this.componentType = componentType;
    }

    /**
     * <p>
     * The type of the component.
     * </p>
     * 
     * @return The type of the component.
     * @see ComponentType
     */

    public String getComponentType() {
        return this.componentType;
    }

    /**
     * <p>
     * The type of the component.
     * </p>
     * 
     * @param componentType
     *        The type of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComponentType
     */

    public Component withComponentType(String componentType) {
        setComponentType(componentType);
        return this;
    }

    /**
     * <p>
     * The type of the component.
     * </p>
     * 
     * @param componentType
     *        The type of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComponentType
     */

    public Component withComponentType(ComponentType componentType) {
        this.componentType = componentType.toString();
        return this;
    }

    /**
     * <p>
     * The status of the component.
     * </p>
     * 
     * @param status
     *        The status of the component.
     * @see ComponentStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the component.
     * </p>
     * 
     * @return The status of the component.
     * @see ComponentStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the component.
     * </p>
     * 
     * @param status
     *        The status of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComponentStatus
     */

    public Component withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the component.
     * </p>
     * 
     * @param status
     *        The status of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComponentStatus
     */

    public Component withStatus(ComponentStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The SAP HANA databases of the component.
     * </p>
     * 
     * @return The SAP HANA databases of the component.
     */

    public java.util.List<String> getDatabases() {
        return databases;
    }

    /**
     * <p>
     * The SAP HANA databases of the component.
     * </p>
     * 
     * @param databases
     *        The SAP HANA databases of the component.
     */

    public void setDatabases(java.util.Collection<String> databases) {
        if (databases == null) {
            this.databases = null;
            return;
        }

        this.databases = new java.util.ArrayList<String>(databases);
    }

    /**
     * <p>
     * The SAP HANA databases of the component.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDatabases(java.util.Collection)} or {@link #withDatabases(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param databases
     *        The SAP HANA databases of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Component withDatabases(String... databases) {
        if (this.databases == null) {
            setDatabases(new java.util.ArrayList<String>(databases.length));
        }
        for (String ele : databases) {
            this.databases.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The SAP HANA databases of the component.
     * </p>
     * 
     * @param databases
     *        The SAP HANA databases of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Component withDatabases(java.util.Collection<String> databases) {
        setDatabases(databases);
        return this;
    }

    /**
     * <p>
     * The hosts of the component.
     * </p>
     * 
     * @return The hosts of the component.
     */

    public java.util.List<Host> getHosts() {
        return hosts;
    }

    /**
     * <p>
     * The hosts of the component.
     * </p>
     * 
     * @param hosts
     *        The hosts of the component.
     */

    public void setHosts(java.util.Collection<Host> hosts) {
        if (hosts == null) {
            this.hosts = null;
            return;
        }

        this.hosts = new java.util.ArrayList<Host>(hosts);
    }

    /**
     * <p>
     * The hosts of the component.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHosts(java.util.Collection)} or {@link #withHosts(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param hosts
     *        The hosts of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Component withHosts(Host... hosts) {
        if (this.hosts == null) {
            setHosts(new java.util.ArrayList<Host>(hosts.length));
        }
        for (Host ele : hosts) {
            this.hosts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The hosts of the component.
     * </p>
     * 
     * @param hosts
     *        The hosts of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Component withHosts(java.util.Collection<Host> hosts) {
        setHosts(hosts);
        return this;
    }

    /**
     * <p>
     * The primary host of the component.
     * </p>
     * 
     * @param primaryHost
     *        The primary host of the component.
     */

    public void setPrimaryHost(String primaryHost) {
        this.primaryHost = primaryHost;
    }

    /**
     * <p>
     * The primary host of the component.
     * </p>
     * 
     * @return The primary host of the component.
     */

    public String getPrimaryHost() {
        return this.primaryHost;
    }

    /**
     * <p>
     * The primary host of the component.
     * </p>
     * 
     * @param primaryHost
     *        The primary host of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Component withPrimaryHost(String primaryHost) {
        setPrimaryHost(primaryHost);
        return this;
    }

    /**
     * <p>
     * The time at which the component was last updated.
     * </p>
     * 
     * @param lastUpdated
     *        The time at which the component was last updated.
     */

    public void setLastUpdated(java.util.Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * <p>
     * The time at which the component was last updated.
     * </p>
     * 
     * @return The time at which the component was last updated.
     */

    public java.util.Date getLastUpdated() {
        return this.lastUpdated;
    }

    /**
     * <p>
     * The time at which the component was last updated.
     * </p>
     * 
     * @param lastUpdated
     *        The time at which the component was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Component withLastUpdated(java.util.Date lastUpdated) {
        setLastUpdated(lastUpdated);
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
        if (getComponentId() != null)
            sb.append("ComponentId: ").append(getComponentId()).append(",");
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getComponentType() != null)
            sb.append("ComponentType: ").append(getComponentType()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getDatabases() != null)
            sb.append("Databases: ").append(getDatabases()).append(",");
        if (getHosts() != null)
            sb.append("Hosts: ").append(getHosts()).append(",");
        if (getPrimaryHost() != null)
            sb.append("PrimaryHost: ").append(getPrimaryHost()).append(",");
        if (getLastUpdated() != null)
            sb.append("LastUpdated: ").append(getLastUpdated());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Component == false)
            return false;
        Component other = (Component) obj;
        if (other.getComponentId() == null ^ this.getComponentId() == null)
            return false;
        if (other.getComponentId() != null && other.getComponentId().equals(this.getComponentId()) == false)
            return false;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getComponentType() == null ^ this.getComponentType() == null)
            return false;
        if (other.getComponentType() != null && other.getComponentType().equals(this.getComponentType()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getDatabases() == null ^ this.getDatabases() == null)
            return false;
        if (other.getDatabases() != null && other.getDatabases().equals(this.getDatabases()) == false)
            return false;
        if (other.getHosts() == null ^ this.getHosts() == null)
            return false;
        if (other.getHosts() != null && other.getHosts().equals(this.getHosts()) == false)
            return false;
        if (other.getPrimaryHost() == null ^ this.getPrimaryHost() == null)
            return false;
        if (other.getPrimaryHost() != null && other.getPrimaryHost().equals(this.getPrimaryHost()) == false)
            return false;
        if (other.getLastUpdated() == null ^ this.getLastUpdated() == null)
            return false;
        if (other.getLastUpdated() != null && other.getLastUpdated().equals(this.getLastUpdated()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComponentId() == null) ? 0 : getComponentId().hashCode());
        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getComponentType() == null) ? 0 : getComponentType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getDatabases() == null) ? 0 : getDatabases().hashCode());
        hashCode = prime * hashCode + ((getHosts() == null) ? 0 : getHosts().hashCode());
        hashCode = prime * hashCode + ((getPrimaryHost() == null) ? 0 : getPrimaryHost().hashCode());
        hashCode = prime * hashCode + ((getLastUpdated() == null) ? 0 : getLastUpdated().hashCode());
        return hashCode;
    }

    @Override
    public Component clone() {
        try {
            return (Component) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssmsap.model.transform.ComponentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
