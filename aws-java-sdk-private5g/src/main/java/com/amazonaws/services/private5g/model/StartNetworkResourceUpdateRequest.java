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
package com.amazonaws.services.private5g.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/StartNetworkResourceUpdate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartNetworkResourceUpdateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the network resource.
     * </p>
     */
    private String networkResourceArn;
    /**
     * <p>
     * The reason for the return. Providing a reason for a return is optional.
     * </p>
     */
    private String returnReason;
    /**
     * <p>
     * The shipping address. If you don't provide a shipping address when replacing or returning a network resource, we
     * use the address from the original order for the network resource.
     * </p>
     */
    private Address shippingAddress;
    /**
     * <p>
     * The update type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>REPLACE</code> - Submits a request to replace a defective radio unit. We provide a shipping label that you
     * can use for the return process and we ship a replacement radio unit to you.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RETURN</code> - Submits a request to replace a radio unit that you no longer need. We provide a shipping
     * label that you can use for the return process.
     * </p>
     * </li>
     * </ul>
     */
    private String updateType;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the network resource.
     * </p>
     * 
     * @param networkResourceArn
     *        The Amazon Resource Name (ARN) of the network resource.
     */

    public void setNetworkResourceArn(String networkResourceArn) {
        this.networkResourceArn = networkResourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the network resource.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the network resource.
     */

    public String getNetworkResourceArn() {
        return this.networkResourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the network resource.
     * </p>
     * 
     * @param networkResourceArn
     *        The Amazon Resource Name (ARN) of the network resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartNetworkResourceUpdateRequest withNetworkResourceArn(String networkResourceArn) {
        setNetworkResourceArn(networkResourceArn);
        return this;
    }

    /**
     * <p>
     * The reason for the return. Providing a reason for a return is optional.
     * </p>
     * 
     * @param returnReason
     *        The reason for the return. Providing a reason for a return is optional.
     */

    public void setReturnReason(String returnReason) {
        this.returnReason = returnReason;
    }

    /**
     * <p>
     * The reason for the return. Providing a reason for a return is optional.
     * </p>
     * 
     * @return The reason for the return. Providing a reason for a return is optional.
     */

    public String getReturnReason() {
        return this.returnReason;
    }

    /**
     * <p>
     * The reason for the return. Providing a reason for a return is optional.
     * </p>
     * 
     * @param returnReason
     *        The reason for the return. Providing a reason for a return is optional.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartNetworkResourceUpdateRequest withReturnReason(String returnReason) {
        setReturnReason(returnReason);
        return this;
    }

    /**
     * <p>
     * The shipping address. If you don't provide a shipping address when replacing or returning a network resource, we
     * use the address from the original order for the network resource.
     * </p>
     * 
     * @param shippingAddress
     *        The shipping address. If you don't provide a shipping address when replacing or returning a network
     *        resource, we use the address from the original order for the network resource.
     */

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    /**
     * <p>
     * The shipping address. If you don't provide a shipping address when replacing or returning a network resource, we
     * use the address from the original order for the network resource.
     * </p>
     * 
     * @return The shipping address. If you don't provide a shipping address when replacing or returning a network
     *         resource, we use the address from the original order for the network resource.
     */

    public Address getShippingAddress() {
        return this.shippingAddress;
    }

    /**
     * <p>
     * The shipping address. If you don't provide a shipping address when replacing or returning a network resource, we
     * use the address from the original order for the network resource.
     * </p>
     * 
     * @param shippingAddress
     *        The shipping address. If you don't provide a shipping address when replacing or returning a network
     *        resource, we use the address from the original order for the network resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartNetworkResourceUpdateRequest withShippingAddress(Address shippingAddress) {
        setShippingAddress(shippingAddress);
        return this;
    }

    /**
     * <p>
     * The update type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>REPLACE</code> - Submits a request to replace a defective radio unit. We provide a shipping label that you
     * can use for the return process and we ship a replacement radio unit to you.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RETURN</code> - Submits a request to replace a radio unit that you no longer need. We provide a shipping
     * label that you can use for the return process.
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateType
     *        The update type.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>REPLACE</code> - Submits a request to replace a defective radio unit. We provide a shipping label
     *        that you can use for the return process and we ship a replacement radio unit to you.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RETURN</code> - Submits a request to replace a radio unit that you no longer need. We provide a
     *        shipping label that you can use for the return process.
     *        </p>
     *        </li>
     * @see UpdateType
     */

    public void setUpdateType(String updateType) {
        this.updateType = updateType;
    }

    /**
     * <p>
     * The update type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>REPLACE</code> - Submits a request to replace a defective radio unit. We provide a shipping label that you
     * can use for the return process and we ship a replacement radio unit to you.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RETURN</code> - Submits a request to replace a radio unit that you no longer need. We provide a shipping
     * label that you can use for the return process.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The update type.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>REPLACE</code> - Submits a request to replace a defective radio unit. We provide a shipping label
     *         that you can use for the return process and we ship a replacement radio unit to you.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RETURN</code> - Submits a request to replace a radio unit that you no longer need. We provide a
     *         shipping label that you can use for the return process.
     *         </p>
     *         </li>
     * @see UpdateType
     */

    public String getUpdateType() {
        return this.updateType;
    }

    /**
     * <p>
     * The update type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>REPLACE</code> - Submits a request to replace a defective radio unit. We provide a shipping label that you
     * can use for the return process and we ship a replacement radio unit to you.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RETURN</code> - Submits a request to replace a radio unit that you no longer need. We provide a shipping
     * label that you can use for the return process.
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateType
     *        The update type.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>REPLACE</code> - Submits a request to replace a defective radio unit. We provide a shipping label
     *        that you can use for the return process and we ship a replacement radio unit to you.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RETURN</code> - Submits a request to replace a radio unit that you no longer need. We provide a
     *        shipping label that you can use for the return process.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdateType
     */

    public StartNetworkResourceUpdateRequest withUpdateType(String updateType) {
        setUpdateType(updateType);
        return this;
    }

    /**
     * <p>
     * The update type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>REPLACE</code> - Submits a request to replace a defective radio unit. We provide a shipping label that you
     * can use for the return process and we ship a replacement radio unit to you.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RETURN</code> - Submits a request to replace a radio unit that you no longer need. We provide a shipping
     * label that you can use for the return process.
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateType
     *        The update type.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>REPLACE</code> - Submits a request to replace a defective radio unit. We provide a shipping label
     *        that you can use for the return process and we ship a replacement radio unit to you.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RETURN</code> - Submits a request to replace a radio unit that you no longer need. We provide a
     *        shipping label that you can use for the return process.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdateType
     */

    public StartNetworkResourceUpdateRequest withUpdateType(UpdateType updateType) {
        this.updateType = updateType.toString();
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
        if (getNetworkResourceArn() != null)
            sb.append("NetworkResourceArn: ").append(getNetworkResourceArn()).append(",");
        if (getReturnReason() != null)
            sb.append("ReturnReason: ").append(getReturnReason()).append(",");
        if (getShippingAddress() != null)
            sb.append("ShippingAddress: ").append(getShippingAddress()).append(",");
        if (getUpdateType() != null)
            sb.append("UpdateType: ").append(getUpdateType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartNetworkResourceUpdateRequest == false)
            return false;
        StartNetworkResourceUpdateRequest other = (StartNetworkResourceUpdateRequest) obj;
        if (other.getNetworkResourceArn() == null ^ this.getNetworkResourceArn() == null)
            return false;
        if (other.getNetworkResourceArn() != null && other.getNetworkResourceArn().equals(this.getNetworkResourceArn()) == false)
            return false;
        if (other.getReturnReason() == null ^ this.getReturnReason() == null)
            return false;
        if (other.getReturnReason() != null && other.getReturnReason().equals(this.getReturnReason()) == false)
            return false;
        if (other.getShippingAddress() == null ^ this.getShippingAddress() == null)
            return false;
        if (other.getShippingAddress() != null && other.getShippingAddress().equals(this.getShippingAddress()) == false)
            return false;
        if (other.getUpdateType() == null ^ this.getUpdateType() == null)
            return false;
        if (other.getUpdateType() != null && other.getUpdateType().equals(this.getUpdateType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNetworkResourceArn() == null) ? 0 : getNetworkResourceArn().hashCode());
        hashCode = prime * hashCode + ((getReturnReason() == null) ? 0 : getReturnReason().hashCode());
        hashCode = prime * hashCode + ((getShippingAddress() == null) ? 0 : getShippingAddress().hashCode());
        hashCode = prime * hashCode + ((getUpdateType() == null) ? 0 : getUpdateType().hashCode());
        return hashCode;
    }

    @Override
    public StartNetworkResourceUpdateRequest clone() {
        return (StartNetworkResourceUpdateRequest) super.clone();
    }

}
