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
package com.amazonaws.services.wafv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The criteria for inspecting responses to login requests, used by the ATP rule group to track login failure rates.
 * </p>
 * <p>
 * The ATP rule group evaluates the responses that your protected resources send back to client login attempts, keeping
 * count of successful and failed attempts from each IP address and client session. Using this information, the rule
 * group labels and mitigates requests from client sessions and IP addresses that submit too many failed login attempts
 * in a short amount of time.
 * </p>
 * <note>
 * <p>
 * Response inspection is available only in web ACLs that protect Amazon CloudFront distributions.
 * </p>
 * </note>
 * <p>
 * This is part of the <code>AWSManagedRulesATPRuleSet</code> configuration in <code>ManagedRuleGroupConfig</code>.
 * </p>
 * <p>
 * Enable login response inspection by configuring exactly one component of the response to inspect. You can't configure
 * more than one. If you don't configure any of the response inspection options, response inspection is disabled.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/ResponseInspection" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResponseInspection implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Configures inspection of the response status code.
     * </p>
     */
    private ResponseInspectionStatusCode statusCode;
    /**
     * <p>
     * Configures inspection of the response header.
     * </p>
     */
    private ResponseInspectionHeader header;
    /**
     * <p>
     * Configures inspection of the response body.
     * </p>
     */
    private ResponseInspectionBodyContains bodyContains;
    /**
     * <p>
     * Configures inspection of the response JSON.
     * </p>
     */
    private ResponseInspectionJson json;

    /**
     * <p>
     * Configures inspection of the response status code.
     * </p>
     * 
     * @param statusCode
     *        Configures inspection of the response status code.
     */

    public void setStatusCode(ResponseInspectionStatusCode statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * <p>
     * Configures inspection of the response status code.
     * </p>
     * 
     * @return Configures inspection of the response status code.
     */

    public ResponseInspectionStatusCode getStatusCode() {
        return this.statusCode;
    }

    /**
     * <p>
     * Configures inspection of the response status code.
     * </p>
     * 
     * @param statusCode
     *        Configures inspection of the response status code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseInspection withStatusCode(ResponseInspectionStatusCode statusCode) {
        setStatusCode(statusCode);
        return this;
    }

    /**
     * <p>
     * Configures inspection of the response header.
     * </p>
     * 
     * @param header
     *        Configures inspection of the response header.
     */

    public void setHeader(ResponseInspectionHeader header) {
        this.header = header;
    }

    /**
     * <p>
     * Configures inspection of the response header.
     * </p>
     * 
     * @return Configures inspection of the response header.
     */

    public ResponseInspectionHeader getHeader() {
        return this.header;
    }

    /**
     * <p>
     * Configures inspection of the response header.
     * </p>
     * 
     * @param header
     *        Configures inspection of the response header.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseInspection withHeader(ResponseInspectionHeader header) {
        setHeader(header);
        return this;
    }

    /**
     * <p>
     * Configures inspection of the response body.
     * </p>
     * 
     * @param bodyContains
     *        Configures inspection of the response body.
     */

    public void setBodyContains(ResponseInspectionBodyContains bodyContains) {
        this.bodyContains = bodyContains;
    }

    /**
     * <p>
     * Configures inspection of the response body.
     * </p>
     * 
     * @return Configures inspection of the response body.
     */

    public ResponseInspectionBodyContains getBodyContains() {
        return this.bodyContains;
    }

    /**
     * <p>
     * Configures inspection of the response body.
     * </p>
     * 
     * @param bodyContains
     *        Configures inspection of the response body.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseInspection withBodyContains(ResponseInspectionBodyContains bodyContains) {
        setBodyContains(bodyContains);
        return this;
    }

    /**
     * <p>
     * Configures inspection of the response JSON.
     * </p>
     * 
     * @param json
     *        Configures inspection of the response JSON.
     */

    public void setJson(ResponseInspectionJson json) {
        this.json = json;
    }

    /**
     * <p>
     * Configures inspection of the response JSON.
     * </p>
     * 
     * @return Configures inspection of the response JSON.
     */

    public ResponseInspectionJson getJson() {
        return this.json;
    }

    /**
     * <p>
     * Configures inspection of the response JSON.
     * </p>
     * 
     * @param json
     *        Configures inspection of the response JSON.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseInspection withJson(ResponseInspectionJson json) {
        setJson(json);
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
        if (getStatusCode() != null)
            sb.append("StatusCode: ").append(getStatusCode()).append(",");
        if (getHeader() != null)
            sb.append("Header: ").append(getHeader()).append(",");
        if (getBodyContains() != null)
            sb.append("BodyContains: ").append(getBodyContains()).append(",");
        if (getJson() != null)
            sb.append("Json: ").append(getJson());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResponseInspection == false)
            return false;
        ResponseInspection other = (ResponseInspection) obj;
        if (other.getStatusCode() == null ^ this.getStatusCode() == null)
            return false;
        if (other.getStatusCode() != null && other.getStatusCode().equals(this.getStatusCode()) == false)
            return false;
        if (other.getHeader() == null ^ this.getHeader() == null)
            return false;
        if (other.getHeader() != null && other.getHeader().equals(this.getHeader()) == false)
            return false;
        if (other.getBodyContains() == null ^ this.getBodyContains() == null)
            return false;
        if (other.getBodyContains() != null && other.getBodyContains().equals(this.getBodyContains()) == false)
            return false;
        if (other.getJson() == null ^ this.getJson() == null)
            return false;
        if (other.getJson() != null && other.getJson().equals(this.getJson()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatusCode() == null) ? 0 : getStatusCode().hashCode());
        hashCode = prime * hashCode + ((getHeader() == null) ? 0 : getHeader().hashCode());
        hashCode = prime * hashCode + ((getBodyContains() == null) ? 0 : getBodyContains().hashCode());
        hashCode = prime * hashCode + ((getJson() == null) ? 0 : getJson().hashCode());
        return hashCode;
    }

    @Override
    public ResponseInspection clone() {
        try {
            return (ResponseInspection) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.ResponseInspectionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
