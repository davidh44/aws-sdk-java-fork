/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.computeoptimizer.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/PutRecommendationPreferences"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutRecommendationPreferencesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The target resource type of the recommendation preference to create.
     * </p>
     * <p>
     * The <code>Ec2Instance</code> option encompasses standalone instances and instances that are part of Auto Scaling
     * groups. The <code>AutoScalingGroup</code> option encompasses only instances that are part of an Auto Scaling
     * group.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * An object that describes the scope of the recommendation preference to create.
     * </p>
     * <p>
     * You can create recommendation preferences at the organization level (for management accounts of an organization
     * only), account level, and resource level. For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/enhanced-infrastructure-metrics.html">Activating
     * enhanced infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * <note>
     * <p>
     * You cannot create recommendation preferences for Auto Scaling groups at the organization and account levels. You
     * can create recommendation preferences for Auto Scaling groups only at the resource level by specifying a scope
     * name of <code>ResourceArn</code> and a scope value of the Auto Scaling group Amazon Resource Name (ARN). This
     * will configure the preference for all instances that are part of the specified the Auto Scaling group.
     * </p>
     * </note>
     */
    private Scope scope;
    /**
     * <p>
     * The status of the enhanced infrastructure metrics recommendation preference to create or update.
     * </p>
     * <p>
     * A status of <code>Active</code> confirms that the preference is applied in the latest recommendation refresh, and
     * a status of <code>Inactive</code> confirms that it's not yet applied.
     * </p>
     */
    private String enhancedInfrastructureMetrics;

    /**
     * <p>
     * The target resource type of the recommendation preference to create.
     * </p>
     * <p>
     * The <code>Ec2Instance</code> option encompasses standalone instances and instances that are part of Auto Scaling
     * groups. The <code>AutoScalingGroup</code> option encompasses only instances that are part of an Auto Scaling
     * group.
     * </p>
     * 
     * @param resourceType
     *        The target resource type of the recommendation preference to create.</p>
     *        <p>
     *        The <code>Ec2Instance</code> option encompasses standalone instances and instances that are part of Auto
     *        Scaling groups. The <code>AutoScalingGroup</code> option encompasses only instances that are part of an
     *        Auto Scaling group.
     * @see ResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The target resource type of the recommendation preference to create.
     * </p>
     * <p>
     * The <code>Ec2Instance</code> option encompasses standalone instances and instances that are part of Auto Scaling
     * groups. The <code>AutoScalingGroup</code> option encompasses only instances that are part of an Auto Scaling
     * group.
     * </p>
     * 
     * @return The target resource type of the recommendation preference to create.</p>
     *         <p>
     *         The <code>Ec2Instance</code> option encompasses standalone instances and instances that are part of Auto
     *         Scaling groups. The <code>AutoScalingGroup</code> option encompasses only instances that are part of an
     *         Auto Scaling group.
     * @see ResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The target resource type of the recommendation preference to create.
     * </p>
     * <p>
     * The <code>Ec2Instance</code> option encompasses standalone instances and instances that are part of Auto Scaling
     * groups. The <code>AutoScalingGroup</code> option encompasses only instances that are part of an Auto Scaling
     * group.
     * </p>
     * 
     * @param resourceType
     *        The target resource type of the recommendation preference to create.</p>
     *        <p>
     *        The <code>Ec2Instance</code> option encompasses standalone instances and instances that are part of Auto
     *        Scaling groups. The <code>AutoScalingGroup</code> option encompasses only instances that are part of an
     *        Auto Scaling group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public PutRecommendationPreferencesRequest withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The target resource type of the recommendation preference to create.
     * </p>
     * <p>
     * The <code>Ec2Instance</code> option encompasses standalone instances and instances that are part of Auto Scaling
     * groups. The <code>AutoScalingGroup</code> option encompasses only instances that are part of an Auto Scaling
     * group.
     * </p>
     * 
     * @param resourceType
     *        The target resource type of the recommendation preference to create.</p>
     *        <p>
     *        The <code>Ec2Instance</code> option encompasses standalone instances and instances that are part of Auto
     *        Scaling groups. The <code>AutoScalingGroup</code> option encompasses only instances that are part of an
     *        Auto Scaling group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public PutRecommendationPreferencesRequest withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * An object that describes the scope of the recommendation preference to create.
     * </p>
     * <p>
     * You can create recommendation preferences at the organization level (for management accounts of an organization
     * only), account level, and resource level. For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/enhanced-infrastructure-metrics.html">Activating
     * enhanced infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * <note>
     * <p>
     * You cannot create recommendation preferences for Auto Scaling groups at the organization and account levels. You
     * can create recommendation preferences for Auto Scaling groups only at the resource level by specifying a scope
     * name of <code>ResourceArn</code> and a scope value of the Auto Scaling group Amazon Resource Name (ARN). This
     * will configure the preference for all instances that are part of the specified the Auto Scaling group.
     * </p>
     * </note>
     * 
     * @param scope
     *        An object that describes the scope of the recommendation preference to create.</p>
     *        <p>
     *        You can create recommendation preferences at the organization level (for management accounts of an
     *        organization only), account level, and resource level. For more information, see <a
     *        href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/enhanced-infrastructure-metrics.html"
     *        >Activating enhanced infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        You cannot create recommendation preferences for Auto Scaling groups at the organization and account
     *        levels. You can create recommendation preferences for Auto Scaling groups only at the resource level by
     *        specifying a scope name of <code>ResourceArn</code> and a scope value of the Auto Scaling group Amazon
     *        Resource Name (ARN). This will configure the preference for all instances that are part of the specified
     *        the Auto Scaling group.
     *        </p>
     */

    public void setScope(Scope scope) {
        this.scope = scope;
    }

    /**
     * <p>
     * An object that describes the scope of the recommendation preference to create.
     * </p>
     * <p>
     * You can create recommendation preferences at the organization level (for management accounts of an organization
     * only), account level, and resource level. For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/enhanced-infrastructure-metrics.html">Activating
     * enhanced infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * <note>
     * <p>
     * You cannot create recommendation preferences for Auto Scaling groups at the organization and account levels. You
     * can create recommendation preferences for Auto Scaling groups only at the resource level by specifying a scope
     * name of <code>ResourceArn</code> and a scope value of the Auto Scaling group Amazon Resource Name (ARN). This
     * will configure the preference for all instances that are part of the specified the Auto Scaling group.
     * </p>
     * </note>
     * 
     * @return An object that describes the scope of the recommendation preference to create.</p>
     *         <p>
     *         You can create recommendation preferences at the organization level (for management accounts of an
     *         organization only), account level, and resource level. For more information, see <a
     *         href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/enhanced-infrastructure-metrics.html"
     *         >Activating enhanced infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     *         </p>
     *         <note>
     *         <p>
     *         You cannot create recommendation preferences for Auto Scaling groups at the organization and account
     *         levels. You can create recommendation preferences for Auto Scaling groups only at the resource level by
     *         specifying a scope name of <code>ResourceArn</code> and a scope value of the Auto Scaling group Amazon
     *         Resource Name (ARN). This will configure the preference for all instances that are part of the specified
     *         the Auto Scaling group.
     *         </p>
     */

    public Scope getScope() {
        return this.scope;
    }

    /**
     * <p>
     * An object that describes the scope of the recommendation preference to create.
     * </p>
     * <p>
     * You can create recommendation preferences at the organization level (for management accounts of an organization
     * only), account level, and resource level. For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/enhanced-infrastructure-metrics.html">Activating
     * enhanced infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * <note>
     * <p>
     * You cannot create recommendation preferences for Auto Scaling groups at the organization and account levels. You
     * can create recommendation preferences for Auto Scaling groups only at the resource level by specifying a scope
     * name of <code>ResourceArn</code> and a scope value of the Auto Scaling group Amazon Resource Name (ARN). This
     * will configure the preference for all instances that are part of the specified the Auto Scaling group.
     * </p>
     * </note>
     * 
     * @param scope
     *        An object that describes the scope of the recommendation preference to create.</p>
     *        <p>
     *        You can create recommendation preferences at the organization level (for management accounts of an
     *        organization only), account level, and resource level. For more information, see <a
     *        href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/enhanced-infrastructure-metrics.html"
     *        >Activating enhanced infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        You cannot create recommendation preferences for Auto Scaling groups at the organization and account
     *        levels. You can create recommendation preferences for Auto Scaling groups only at the resource level by
     *        specifying a scope name of <code>ResourceArn</code> and a scope value of the Auto Scaling group Amazon
     *        Resource Name (ARN). This will configure the preference for all instances that are part of the specified
     *        the Auto Scaling group.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRecommendationPreferencesRequest withScope(Scope scope) {
        setScope(scope);
        return this;
    }

    /**
     * <p>
     * The status of the enhanced infrastructure metrics recommendation preference to create or update.
     * </p>
     * <p>
     * A status of <code>Active</code> confirms that the preference is applied in the latest recommendation refresh, and
     * a status of <code>Inactive</code> confirms that it's not yet applied.
     * </p>
     * 
     * @param enhancedInfrastructureMetrics
     *        The status of the enhanced infrastructure metrics recommendation preference to create or update.</p>
     *        <p>
     *        A status of <code>Active</code> confirms that the preference is applied in the latest recommendation
     *        refresh, and a status of <code>Inactive</code> confirms that it's not yet applied.
     * @see EnhancedInfrastructureMetrics
     */

    public void setEnhancedInfrastructureMetrics(String enhancedInfrastructureMetrics) {
        this.enhancedInfrastructureMetrics = enhancedInfrastructureMetrics;
    }

    /**
     * <p>
     * The status of the enhanced infrastructure metrics recommendation preference to create or update.
     * </p>
     * <p>
     * A status of <code>Active</code> confirms that the preference is applied in the latest recommendation refresh, and
     * a status of <code>Inactive</code> confirms that it's not yet applied.
     * </p>
     * 
     * @return The status of the enhanced infrastructure metrics recommendation preference to create or update.</p>
     *         <p>
     *         A status of <code>Active</code> confirms that the preference is applied in the latest recommendation
     *         refresh, and a status of <code>Inactive</code> confirms that it's not yet applied.
     * @see EnhancedInfrastructureMetrics
     */

    public String getEnhancedInfrastructureMetrics() {
        return this.enhancedInfrastructureMetrics;
    }

    /**
     * <p>
     * The status of the enhanced infrastructure metrics recommendation preference to create or update.
     * </p>
     * <p>
     * A status of <code>Active</code> confirms that the preference is applied in the latest recommendation refresh, and
     * a status of <code>Inactive</code> confirms that it's not yet applied.
     * </p>
     * 
     * @param enhancedInfrastructureMetrics
     *        The status of the enhanced infrastructure metrics recommendation preference to create or update.</p>
     *        <p>
     *        A status of <code>Active</code> confirms that the preference is applied in the latest recommendation
     *        refresh, and a status of <code>Inactive</code> confirms that it's not yet applied.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnhancedInfrastructureMetrics
     */

    public PutRecommendationPreferencesRequest withEnhancedInfrastructureMetrics(String enhancedInfrastructureMetrics) {
        setEnhancedInfrastructureMetrics(enhancedInfrastructureMetrics);
        return this;
    }

    /**
     * <p>
     * The status of the enhanced infrastructure metrics recommendation preference to create or update.
     * </p>
     * <p>
     * A status of <code>Active</code> confirms that the preference is applied in the latest recommendation refresh, and
     * a status of <code>Inactive</code> confirms that it's not yet applied.
     * </p>
     * 
     * @param enhancedInfrastructureMetrics
     *        The status of the enhanced infrastructure metrics recommendation preference to create or update.</p>
     *        <p>
     *        A status of <code>Active</code> confirms that the preference is applied in the latest recommendation
     *        refresh, and a status of <code>Inactive</code> confirms that it's not yet applied.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnhancedInfrastructureMetrics
     */

    public PutRecommendationPreferencesRequest withEnhancedInfrastructureMetrics(EnhancedInfrastructureMetrics enhancedInfrastructureMetrics) {
        this.enhancedInfrastructureMetrics = enhancedInfrastructureMetrics.toString();
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
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getScope() != null)
            sb.append("Scope: ").append(getScope()).append(",");
        if (getEnhancedInfrastructureMetrics() != null)
            sb.append("EnhancedInfrastructureMetrics: ").append(getEnhancedInfrastructureMetrics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutRecommendationPreferencesRequest == false)
            return false;
        PutRecommendationPreferencesRequest other = (PutRecommendationPreferencesRequest) obj;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getScope() == null ^ this.getScope() == null)
            return false;
        if (other.getScope() != null && other.getScope().equals(this.getScope()) == false)
            return false;
        if (other.getEnhancedInfrastructureMetrics() == null ^ this.getEnhancedInfrastructureMetrics() == null)
            return false;
        if (other.getEnhancedInfrastructureMetrics() != null
                && other.getEnhancedInfrastructureMetrics().equals(this.getEnhancedInfrastructureMetrics()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getScope() == null) ? 0 : getScope().hashCode());
        hashCode = prime * hashCode + ((getEnhancedInfrastructureMetrics() == null) ? 0 : getEnhancedInfrastructureMetrics().hashCode());
        return hashCode;
    }

    @Override
    public PutRecommendationPreferencesRequest clone() {
        return (PutRecommendationPreferencesRequest) super.clone();
    }

}
