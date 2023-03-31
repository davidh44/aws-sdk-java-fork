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
package com.amazonaws.services.internetmonitor.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/CreateMonitor" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateMonitorRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the monitor.
     * </p>
     */
    private String monitorName;
    /**
     * <p>
     * The resources to include in a monitor, which you provide as a set of Amazon Resource Names (ARNs).
     * </p>
     * <p>
     * You can add a combination of Amazon Virtual Private Clouds (VPCs) and Amazon CloudFront distributions, or you can
     * add Amazon WorkSpaces directories. You can't add all three types of resources.
     * </p>
     * <note>
     * <p>
     * If you add only VPC resources, at least one VPC must have an Internet Gateway attached to it, to make sure that
     * it has internet connectivity.
     * </p>
     * </note>
     */
    private java.util.List<String> resources;
    /**
     * <p>
     * A unique, case-sensitive string of up to 64 ASCII characters that you specify to make an idempotent API request.
     * Don't reuse the same client token for other API requests.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The tags for a monitor. You can add a maximum of 50 tags in Internet Monitor.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The maximum number of city-networks to monitor for your resources. A city-network is the location (city) where
     * clients access your application resources from and the network or ASN, such as an internet service provider
     * (ISP), that clients access the resources through. This limit helps control billing costs.
     * </p>
     * <p>
     * To learn more, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/IMCityNetworksMaximum.html">Choosing a
     * city-network maximum value </a> in the Amazon CloudWatch Internet Monitor section of the <i>CloudWatch User
     * Guide</i>.
     * </p>
     */
    private Integer maxCityNetworksToMonitor;
    /**
     * <p>
     * Publish internet measurements for Internet Monitor to another location, such as an Amazon S3 bucket. The
     * measurements are also published to Amazon CloudWatch Logs.
     * </p>
     */
    private InternetMeasurementsLogDelivery internetMeasurementsLogDelivery;

    /**
     * <p>
     * The name of the monitor.
     * </p>
     * 
     * @param monitorName
     *        The name of the monitor.
     */

    public void setMonitorName(String monitorName) {
        this.monitorName = monitorName;
    }

    /**
     * <p>
     * The name of the monitor.
     * </p>
     * 
     * @return The name of the monitor.
     */

    public String getMonitorName() {
        return this.monitorName;
    }

    /**
     * <p>
     * The name of the monitor.
     * </p>
     * 
     * @param monitorName
     *        The name of the monitor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMonitorRequest withMonitorName(String monitorName) {
        setMonitorName(monitorName);
        return this;
    }

    /**
     * <p>
     * The resources to include in a monitor, which you provide as a set of Amazon Resource Names (ARNs).
     * </p>
     * <p>
     * You can add a combination of Amazon Virtual Private Clouds (VPCs) and Amazon CloudFront distributions, or you can
     * add Amazon WorkSpaces directories. You can't add all three types of resources.
     * </p>
     * <note>
     * <p>
     * If you add only VPC resources, at least one VPC must have an Internet Gateway attached to it, to make sure that
     * it has internet connectivity.
     * </p>
     * </note>
     * 
     * @return The resources to include in a monitor, which you provide as a set of Amazon Resource Names (ARNs).</p>
     *         <p>
     *         You can add a combination of Amazon Virtual Private Clouds (VPCs) and Amazon CloudFront distributions, or
     *         you can add Amazon WorkSpaces directories. You can't add all three types of resources.
     *         </p>
     *         <note>
     *         <p>
     *         If you add only VPC resources, at least one VPC must have an Internet Gateway attached to it, to make
     *         sure that it has internet connectivity.
     *         </p>
     */

    public java.util.List<String> getResources() {
        return resources;
    }

    /**
     * <p>
     * The resources to include in a monitor, which you provide as a set of Amazon Resource Names (ARNs).
     * </p>
     * <p>
     * You can add a combination of Amazon Virtual Private Clouds (VPCs) and Amazon CloudFront distributions, or you can
     * add Amazon WorkSpaces directories. You can't add all three types of resources.
     * </p>
     * <note>
     * <p>
     * If you add only VPC resources, at least one VPC must have an Internet Gateway attached to it, to make sure that
     * it has internet connectivity.
     * </p>
     * </note>
     * 
     * @param resources
     *        The resources to include in a monitor, which you provide as a set of Amazon Resource Names (ARNs).</p>
     *        <p>
     *        You can add a combination of Amazon Virtual Private Clouds (VPCs) and Amazon CloudFront distributions, or
     *        you can add Amazon WorkSpaces directories. You can't add all three types of resources.
     *        </p>
     *        <note>
     *        <p>
     *        If you add only VPC resources, at least one VPC must have an Internet Gateway attached to it, to make sure
     *        that it has internet connectivity.
     *        </p>
     */

    public void setResources(java.util.Collection<String> resources) {
        if (resources == null) {
            this.resources = null;
            return;
        }

        this.resources = new java.util.ArrayList<String>(resources);
    }

    /**
     * <p>
     * The resources to include in a monitor, which you provide as a set of Amazon Resource Names (ARNs).
     * </p>
     * <p>
     * You can add a combination of Amazon Virtual Private Clouds (VPCs) and Amazon CloudFront distributions, or you can
     * add Amazon WorkSpaces directories. You can't add all three types of resources.
     * </p>
     * <note>
     * <p>
     * If you add only VPC resources, at least one VPC must have an Internet Gateway attached to it, to make sure that
     * it has internet connectivity.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResources(java.util.Collection)} or {@link #withResources(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resources
     *        The resources to include in a monitor, which you provide as a set of Amazon Resource Names (ARNs).</p>
     *        <p>
     *        You can add a combination of Amazon Virtual Private Clouds (VPCs) and Amazon CloudFront distributions, or
     *        you can add Amazon WorkSpaces directories. You can't add all three types of resources.
     *        </p>
     *        <note>
     *        <p>
     *        If you add only VPC resources, at least one VPC must have an Internet Gateway attached to it, to make sure
     *        that it has internet connectivity.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMonitorRequest withResources(String... resources) {
        if (this.resources == null) {
            setResources(new java.util.ArrayList<String>(resources.length));
        }
        for (String ele : resources) {
            this.resources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The resources to include in a monitor, which you provide as a set of Amazon Resource Names (ARNs).
     * </p>
     * <p>
     * You can add a combination of Amazon Virtual Private Clouds (VPCs) and Amazon CloudFront distributions, or you can
     * add Amazon WorkSpaces directories. You can't add all three types of resources.
     * </p>
     * <note>
     * <p>
     * If you add only VPC resources, at least one VPC must have an Internet Gateway attached to it, to make sure that
     * it has internet connectivity.
     * </p>
     * </note>
     * 
     * @param resources
     *        The resources to include in a monitor, which you provide as a set of Amazon Resource Names (ARNs).</p>
     *        <p>
     *        You can add a combination of Amazon Virtual Private Clouds (VPCs) and Amazon CloudFront distributions, or
     *        you can add Amazon WorkSpaces directories. You can't add all three types of resources.
     *        </p>
     *        <note>
     *        <p>
     *        If you add only VPC resources, at least one VPC must have an Internet Gateway attached to it, to make sure
     *        that it has internet connectivity.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMonitorRequest withResources(java.util.Collection<String> resources) {
        setResources(resources);
        return this;
    }

    /**
     * <p>
     * A unique, case-sensitive string of up to 64 ASCII characters that you specify to make an idempotent API request.
     * Don't reuse the same client token for other API requests.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive string of up to 64 ASCII characters that you specify to make an idempotent API
     *        request. Don't reuse the same client token for other API requests.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive string of up to 64 ASCII characters that you specify to make an idempotent API request.
     * Don't reuse the same client token for other API requests.
     * </p>
     * 
     * @return A unique, case-sensitive string of up to 64 ASCII characters that you specify to make an idempotent API
     *         request. Don't reuse the same client token for other API requests.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive string of up to 64 ASCII characters that you specify to make an idempotent API request.
     * Don't reuse the same client token for other API requests.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive string of up to 64 ASCII characters that you specify to make an idempotent API
     *        request. Don't reuse the same client token for other API requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMonitorRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The tags for a monitor. You can add a maximum of 50 tags in Internet Monitor.
     * </p>
     * 
     * @return The tags for a monitor. You can add a maximum of 50 tags in Internet Monitor.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags for a monitor. You can add a maximum of 50 tags in Internet Monitor.
     * </p>
     * 
     * @param tags
     *        The tags for a monitor. You can add a maximum of 50 tags in Internet Monitor.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags for a monitor. You can add a maximum of 50 tags in Internet Monitor.
     * </p>
     * 
     * @param tags
     *        The tags for a monitor. You can add a maximum of 50 tags in Internet Monitor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMonitorRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateMonitorRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateMonitorRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMonitorRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The maximum number of city-networks to monitor for your resources. A city-network is the location (city) where
     * clients access your application resources from and the network or ASN, such as an internet service provider
     * (ISP), that clients access the resources through. This limit helps control billing costs.
     * </p>
     * <p>
     * To learn more, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/IMCityNetworksMaximum.html">Choosing a
     * city-network maximum value </a> in the Amazon CloudWatch Internet Monitor section of the <i>CloudWatch User
     * Guide</i>.
     * </p>
     * 
     * @param maxCityNetworksToMonitor
     *        The maximum number of city-networks to monitor for your resources. A city-network is the location (city)
     *        where clients access your application resources from and the network or ASN, such as an internet service
     *        provider (ISP), that clients access the resources through. This limit helps control billing costs.</p>
     *        <p>
     *        To learn more, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/IMCityNetworksMaximum.html">Choosing
     *        a city-network maximum value </a> in the Amazon CloudWatch Internet Monitor section of the <i>CloudWatch
     *        User Guide</i>.
     */

    public void setMaxCityNetworksToMonitor(Integer maxCityNetworksToMonitor) {
        this.maxCityNetworksToMonitor = maxCityNetworksToMonitor;
    }

    /**
     * <p>
     * The maximum number of city-networks to monitor for your resources. A city-network is the location (city) where
     * clients access your application resources from and the network or ASN, such as an internet service provider
     * (ISP), that clients access the resources through. This limit helps control billing costs.
     * </p>
     * <p>
     * To learn more, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/IMCityNetworksMaximum.html">Choosing a
     * city-network maximum value </a> in the Amazon CloudWatch Internet Monitor section of the <i>CloudWatch User
     * Guide</i>.
     * </p>
     * 
     * @return The maximum number of city-networks to monitor for your resources. A city-network is the location (city)
     *         where clients access your application resources from and the network or ASN, such as an internet service
     *         provider (ISP), that clients access the resources through. This limit helps control billing costs.</p>
     *         <p>
     *         To learn more, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/IMCityNetworksMaximum.html">Choosing
     *         a city-network maximum value </a> in the Amazon CloudWatch Internet Monitor section of the <i>CloudWatch
     *         User Guide</i>.
     */

    public Integer getMaxCityNetworksToMonitor() {
        return this.maxCityNetworksToMonitor;
    }

    /**
     * <p>
     * The maximum number of city-networks to monitor for your resources. A city-network is the location (city) where
     * clients access your application resources from and the network or ASN, such as an internet service provider
     * (ISP), that clients access the resources through. This limit helps control billing costs.
     * </p>
     * <p>
     * To learn more, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/IMCityNetworksMaximum.html">Choosing a
     * city-network maximum value </a> in the Amazon CloudWatch Internet Monitor section of the <i>CloudWatch User
     * Guide</i>.
     * </p>
     * 
     * @param maxCityNetworksToMonitor
     *        The maximum number of city-networks to monitor for your resources. A city-network is the location (city)
     *        where clients access your application resources from and the network or ASN, such as an internet service
     *        provider (ISP), that clients access the resources through. This limit helps control billing costs.</p>
     *        <p>
     *        To learn more, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/IMCityNetworksMaximum.html">Choosing
     *        a city-network maximum value </a> in the Amazon CloudWatch Internet Monitor section of the <i>CloudWatch
     *        User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMonitorRequest withMaxCityNetworksToMonitor(Integer maxCityNetworksToMonitor) {
        setMaxCityNetworksToMonitor(maxCityNetworksToMonitor);
        return this;
    }

    /**
     * <p>
     * Publish internet measurements for Internet Monitor to another location, such as an Amazon S3 bucket. The
     * measurements are also published to Amazon CloudWatch Logs.
     * </p>
     * 
     * @param internetMeasurementsLogDelivery
     *        Publish internet measurements for Internet Monitor to another location, such as an Amazon S3 bucket. The
     *        measurements are also published to Amazon CloudWatch Logs.
     */

    public void setInternetMeasurementsLogDelivery(InternetMeasurementsLogDelivery internetMeasurementsLogDelivery) {
        this.internetMeasurementsLogDelivery = internetMeasurementsLogDelivery;
    }

    /**
     * <p>
     * Publish internet measurements for Internet Monitor to another location, such as an Amazon S3 bucket. The
     * measurements are also published to Amazon CloudWatch Logs.
     * </p>
     * 
     * @return Publish internet measurements for Internet Monitor to another location, such as an Amazon S3 bucket. The
     *         measurements are also published to Amazon CloudWatch Logs.
     */

    public InternetMeasurementsLogDelivery getInternetMeasurementsLogDelivery() {
        return this.internetMeasurementsLogDelivery;
    }

    /**
     * <p>
     * Publish internet measurements for Internet Monitor to another location, such as an Amazon S3 bucket. The
     * measurements are also published to Amazon CloudWatch Logs.
     * </p>
     * 
     * @param internetMeasurementsLogDelivery
     *        Publish internet measurements for Internet Monitor to another location, such as an Amazon S3 bucket. The
     *        measurements are also published to Amazon CloudWatch Logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMonitorRequest withInternetMeasurementsLogDelivery(InternetMeasurementsLogDelivery internetMeasurementsLogDelivery) {
        setInternetMeasurementsLogDelivery(internetMeasurementsLogDelivery);
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
        if (getMonitorName() != null)
            sb.append("MonitorName: ").append(getMonitorName()).append(",");
        if (getResources() != null)
            sb.append("Resources: ").append(getResources()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getMaxCityNetworksToMonitor() != null)
            sb.append("MaxCityNetworksToMonitor: ").append(getMaxCityNetworksToMonitor()).append(",");
        if (getInternetMeasurementsLogDelivery() != null)
            sb.append("InternetMeasurementsLogDelivery: ").append(getInternetMeasurementsLogDelivery());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateMonitorRequest == false)
            return false;
        CreateMonitorRequest other = (CreateMonitorRequest) obj;
        if (other.getMonitorName() == null ^ this.getMonitorName() == null)
            return false;
        if (other.getMonitorName() != null && other.getMonitorName().equals(this.getMonitorName()) == false)
            return false;
        if (other.getResources() == null ^ this.getResources() == null)
            return false;
        if (other.getResources() != null && other.getResources().equals(this.getResources()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getMaxCityNetworksToMonitor() == null ^ this.getMaxCityNetworksToMonitor() == null)
            return false;
        if (other.getMaxCityNetworksToMonitor() != null && other.getMaxCityNetworksToMonitor().equals(this.getMaxCityNetworksToMonitor()) == false)
            return false;
        if (other.getInternetMeasurementsLogDelivery() == null ^ this.getInternetMeasurementsLogDelivery() == null)
            return false;
        if (other.getInternetMeasurementsLogDelivery() != null
                && other.getInternetMeasurementsLogDelivery().equals(this.getInternetMeasurementsLogDelivery()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMonitorName() == null) ? 0 : getMonitorName().hashCode());
        hashCode = prime * hashCode + ((getResources() == null) ? 0 : getResources().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getMaxCityNetworksToMonitor() == null) ? 0 : getMaxCityNetworksToMonitor().hashCode());
        hashCode = prime * hashCode + ((getInternetMeasurementsLogDelivery() == null) ? 0 : getInternetMeasurementsLogDelivery().hashCode());
        return hashCode;
    }

    @Override
    public CreateMonitorRequest clone() {
        return (CreateMonitorRequest) super.clone();
    }

}
