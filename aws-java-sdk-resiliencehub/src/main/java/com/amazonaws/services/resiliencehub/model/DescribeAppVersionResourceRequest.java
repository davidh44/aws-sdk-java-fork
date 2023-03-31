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
package com.amazonaws.services.resiliencehub.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/DescribeAppVersionResource"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAppVersionResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Resilience Hub application. The format for this ARN is: arn:
     * <code>partition</code>:resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more
     * information about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     * Amazon Resource Names (ARNs)</a> in the <i>AWS General Reference</i> guide.
     * </p>
     */
    private String appArn;
    /**
     * <p>
     * The Resilience Hub application version.
     * </p>
     */
    private String appVersion;
    /**
     * <p>
     * The Amazon Web Services account that owns the physical resource.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * The Amazon Web Services region that owns the physical resource.
     * </p>
     */
    private String awsRegion;
    /**
     * <p>
     * The logical identifier of the resource.
     * </p>
     */
    private LogicalResourceId logicalResourceId;
    /**
     * <p>
     * The physical identifier of the resource.
     * </p>
     */
    private String physicalResourceId;
    /**
     * <p>
     * The name of the resource.
     * </p>
     */
    private String resourceName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Resilience Hub application. The format for this ARN is: arn:
     * <code>partition</code>:resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more
     * information about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     * Amazon Resource Names (ARNs)</a> in the <i>AWS General Reference</i> guide.
     * </p>
     * 
     * @param appArn
     *        The Amazon Resource Name (ARN) of the Resilience Hub application. The format for this ARN is: arn:
     *        <code>partition</code>:resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For
     *        more information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     *        (ARNs)</a> in the <i>AWS General Reference</i> guide.
     */

    public void setAppArn(String appArn) {
        this.appArn = appArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Resilience Hub application. The format for this ARN is: arn:
     * <code>partition</code>:resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more
     * information about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     * Amazon Resource Names (ARNs)</a> in the <i>AWS General Reference</i> guide.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Resilience Hub application. The format for this ARN is: arn:
     *         <code>partition</code>:resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>.
     *         For more information about ARNs, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     *         (ARNs)</a> in the <i>AWS General Reference</i> guide.
     */

    public String getAppArn() {
        return this.appArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Resilience Hub application. The format for this ARN is: arn:
     * <code>partition</code>:resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more
     * information about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     * Amazon Resource Names (ARNs)</a> in the <i>AWS General Reference</i> guide.
     * </p>
     * 
     * @param appArn
     *        The Amazon Resource Name (ARN) of the Resilience Hub application. The format for this ARN is: arn:
     *        <code>partition</code>:resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For
     *        more information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     *        (ARNs)</a> in the <i>AWS General Reference</i> guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAppVersionResourceRequest withAppArn(String appArn) {
        setAppArn(appArn);
        return this;
    }

    /**
     * <p>
     * The Resilience Hub application version.
     * </p>
     * 
     * @param appVersion
     *        The Resilience Hub application version.
     */

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    /**
     * <p>
     * The Resilience Hub application version.
     * </p>
     * 
     * @return The Resilience Hub application version.
     */

    public String getAppVersion() {
        return this.appVersion;
    }

    /**
     * <p>
     * The Resilience Hub application version.
     * </p>
     * 
     * @param appVersion
     *        The Resilience Hub application version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAppVersionResourceRequest withAppVersion(String appVersion) {
        setAppVersion(appVersion);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services account that owns the physical resource.
     * </p>
     * 
     * @param awsAccountId
     *        The Amazon Web Services account that owns the physical resource.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The Amazon Web Services account that owns the physical resource.
     * </p>
     * 
     * @return The Amazon Web Services account that owns the physical resource.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The Amazon Web Services account that owns the physical resource.
     * </p>
     * 
     * @param awsAccountId
     *        The Amazon Web Services account that owns the physical resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAppVersionResourceRequest withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services region that owns the physical resource.
     * </p>
     * 
     * @param awsRegion
     *        The Amazon Web Services region that owns the physical resource.
     */

    public void setAwsRegion(String awsRegion) {
        this.awsRegion = awsRegion;
    }

    /**
     * <p>
     * The Amazon Web Services region that owns the physical resource.
     * </p>
     * 
     * @return The Amazon Web Services region that owns the physical resource.
     */

    public String getAwsRegion() {
        return this.awsRegion;
    }

    /**
     * <p>
     * The Amazon Web Services region that owns the physical resource.
     * </p>
     * 
     * @param awsRegion
     *        The Amazon Web Services region that owns the physical resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAppVersionResourceRequest withAwsRegion(String awsRegion) {
        setAwsRegion(awsRegion);
        return this;
    }

    /**
     * <p>
     * The logical identifier of the resource.
     * </p>
     * 
     * @param logicalResourceId
     *        The logical identifier of the resource.
     */

    public void setLogicalResourceId(LogicalResourceId logicalResourceId) {
        this.logicalResourceId = logicalResourceId;
    }

    /**
     * <p>
     * The logical identifier of the resource.
     * </p>
     * 
     * @return The logical identifier of the resource.
     */

    public LogicalResourceId getLogicalResourceId() {
        return this.logicalResourceId;
    }

    /**
     * <p>
     * The logical identifier of the resource.
     * </p>
     * 
     * @param logicalResourceId
     *        The logical identifier of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAppVersionResourceRequest withLogicalResourceId(LogicalResourceId logicalResourceId) {
        setLogicalResourceId(logicalResourceId);
        return this;
    }

    /**
     * <p>
     * The physical identifier of the resource.
     * </p>
     * 
     * @param physicalResourceId
     *        The physical identifier of the resource.
     */

    public void setPhysicalResourceId(String physicalResourceId) {
        this.physicalResourceId = physicalResourceId;
    }

    /**
     * <p>
     * The physical identifier of the resource.
     * </p>
     * 
     * @return The physical identifier of the resource.
     */

    public String getPhysicalResourceId() {
        return this.physicalResourceId;
    }

    /**
     * <p>
     * The physical identifier of the resource.
     * </p>
     * 
     * @param physicalResourceId
     *        The physical identifier of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAppVersionResourceRequest withPhysicalResourceId(String physicalResourceId) {
        setPhysicalResourceId(physicalResourceId);
        return this;
    }

    /**
     * <p>
     * The name of the resource.
     * </p>
     * 
     * @param resourceName
     *        The name of the resource.
     */

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * <p>
     * The name of the resource.
     * </p>
     * 
     * @return The name of the resource.
     */

    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * <p>
     * The name of the resource.
     * </p>
     * 
     * @param resourceName
     *        The name of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAppVersionResourceRequest withResourceName(String resourceName) {
        setResourceName(resourceName);
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
        if (getAppArn() != null)
            sb.append("AppArn: ").append(getAppArn()).append(",");
        if (getAppVersion() != null)
            sb.append("AppVersion: ").append(getAppVersion()).append(",");
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: ").append(getAwsAccountId()).append(",");
        if (getAwsRegion() != null)
            sb.append("AwsRegion: ").append(getAwsRegion()).append(",");
        if (getLogicalResourceId() != null)
            sb.append("LogicalResourceId: ").append(getLogicalResourceId()).append(",");
        if (getPhysicalResourceId() != null)
            sb.append("PhysicalResourceId: ").append(getPhysicalResourceId()).append(",");
        if (getResourceName() != null)
            sb.append("ResourceName: ").append(getResourceName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAppVersionResourceRequest == false)
            return false;
        DescribeAppVersionResourceRequest other = (DescribeAppVersionResourceRequest) obj;
        if (other.getAppArn() == null ^ this.getAppArn() == null)
            return false;
        if (other.getAppArn() != null && other.getAppArn().equals(this.getAppArn()) == false)
            return false;
        if (other.getAppVersion() == null ^ this.getAppVersion() == null)
            return false;
        if (other.getAppVersion() != null && other.getAppVersion().equals(this.getAppVersion()) == false)
            return false;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getAwsRegion() == null ^ this.getAwsRegion() == null)
            return false;
        if (other.getAwsRegion() != null && other.getAwsRegion().equals(this.getAwsRegion()) == false)
            return false;
        if (other.getLogicalResourceId() == null ^ this.getLogicalResourceId() == null)
            return false;
        if (other.getLogicalResourceId() != null && other.getLogicalResourceId().equals(this.getLogicalResourceId()) == false)
            return false;
        if (other.getPhysicalResourceId() == null ^ this.getPhysicalResourceId() == null)
            return false;
        if (other.getPhysicalResourceId() != null && other.getPhysicalResourceId().equals(this.getPhysicalResourceId()) == false)
            return false;
        if (other.getResourceName() == null ^ this.getResourceName() == null)
            return false;
        if (other.getResourceName() != null && other.getResourceName().equals(this.getResourceName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppArn() == null) ? 0 : getAppArn().hashCode());
        hashCode = prime * hashCode + ((getAppVersion() == null) ? 0 : getAppVersion().hashCode());
        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getAwsRegion() == null) ? 0 : getAwsRegion().hashCode());
        hashCode = prime * hashCode + ((getLogicalResourceId() == null) ? 0 : getLogicalResourceId().hashCode());
        hashCode = prime * hashCode + ((getPhysicalResourceId() == null) ? 0 : getPhysicalResourceId().hashCode());
        hashCode = prime * hashCode + ((getResourceName() == null) ? 0 : getResourceName().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAppVersionResourceRequest clone() {
        return (DescribeAppVersionResourceRequest) super.clone();
    }

}
