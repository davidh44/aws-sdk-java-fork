/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connectwisdom.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/PutFeedback" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutFeedbackRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Wisdom assistant. Can be either the ID or the ARN. URLs cannot contain the ARN.
     * </p>
     */
    private String assistantId;
    /**
     * <p>
     * The feedback.
     * </p>
     */
    private FeedbackData feedback;
    /**
     * <p>
     * The identifier of a recommendation. or The identifier of the result data.
     * </p>
     */
    private String targetId;
    /**
     * <p>
     * The type of the targetId for which The feedback. is targeted.
     * </p>
     */
    private String targetType;

    /**
     * <p>
     * The identifier of the Wisdom assistant. Can be either the ID or the ARN. URLs cannot contain the ARN.
     * </p>
     * 
     * @param assistantId
     *        The identifier of the Wisdom assistant. Can be either the ID or the ARN. URLs cannot contain the ARN.
     */

    public void setAssistantId(String assistantId) {
        this.assistantId = assistantId;
    }

    /**
     * <p>
     * The identifier of the Wisdom assistant. Can be either the ID or the ARN. URLs cannot contain the ARN.
     * </p>
     * 
     * @return The identifier of the Wisdom assistant. Can be either the ID or the ARN. URLs cannot contain the ARN.
     */

    public String getAssistantId() {
        return this.assistantId;
    }

    /**
     * <p>
     * The identifier of the Wisdom assistant. Can be either the ID or the ARN. URLs cannot contain the ARN.
     * </p>
     * 
     * @param assistantId
     *        The identifier of the Wisdom assistant. Can be either the ID or the ARN. URLs cannot contain the ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutFeedbackRequest withAssistantId(String assistantId) {
        setAssistantId(assistantId);
        return this;
    }

    /**
     * <p>
     * The feedback.
     * </p>
     * 
     * @param feedback
     *        The feedback.
     */

    public void setFeedback(FeedbackData feedback) {
        this.feedback = feedback;
    }

    /**
     * <p>
     * The feedback.
     * </p>
     * 
     * @return The feedback.
     */

    public FeedbackData getFeedback() {
        return this.feedback;
    }

    /**
     * <p>
     * The feedback.
     * </p>
     * 
     * @param feedback
     *        The feedback.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutFeedbackRequest withFeedback(FeedbackData feedback) {
        setFeedback(feedback);
        return this;
    }

    /**
     * <p>
     * The identifier of a recommendation. or The identifier of the result data.
     * </p>
     * 
     * @param targetId
     *        The identifier of a recommendation. or The identifier of the result data.
     */

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    /**
     * <p>
     * The identifier of a recommendation. or The identifier of the result data.
     * </p>
     * 
     * @return The identifier of a recommendation. or The identifier of the result data.
     */

    public String getTargetId() {
        return this.targetId;
    }

    /**
     * <p>
     * The identifier of a recommendation. or The identifier of the result data.
     * </p>
     * 
     * @param targetId
     *        The identifier of a recommendation. or The identifier of the result data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutFeedbackRequest withTargetId(String targetId) {
        setTargetId(targetId);
        return this;
    }

    /**
     * <p>
     * The type of the targetId for which The feedback. is targeted.
     * </p>
     * 
     * @param targetType
     *        The type of the targetId for which The feedback. is targeted.
     * @see TargetType
     */

    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    /**
     * <p>
     * The type of the targetId for which The feedback. is targeted.
     * </p>
     * 
     * @return The type of the targetId for which The feedback. is targeted.
     * @see TargetType
     */

    public String getTargetType() {
        return this.targetType;
    }

    /**
     * <p>
     * The type of the targetId for which The feedback. is targeted.
     * </p>
     * 
     * @param targetType
     *        The type of the targetId for which The feedback. is targeted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetType
     */

    public PutFeedbackRequest withTargetType(String targetType) {
        setTargetType(targetType);
        return this;
    }

    /**
     * <p>
     * The type of the targetId for which The feedback. is targeted.
     * </p>
     * 
     * @param targetType
     *        The type of the targetId for which The feedback. is targeted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetType
     */

    public PutFeedbackRequest withTargetType(TargetType targetType) {
        this.targetType = targetType.toString();
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
        if (getAssistantId() != null)
            sb.append("AssistantId: ").append(getAssistantId()).append(",");
        if (getFeedback() != null)
            sb.append("Feedback: ").append(getFeedback()).append(",");
        if (getTargetId() != null)
            sb.append("TargetId: ").append(getTargetId()).append(",");
        if (getTargetType() != null)
            sb.append("TargetType: ").append(getTargetType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutFeedbackRequest == false)
            return false;
        PutFeedbackRequest other = (PutFeedbackRequest) obj;
        if (other.getAssistantId() == null ^ this.getAssistantId() == null)
            return false;
        if (other.getAssistantId() != null && other.getAssistantId().equals(this.getAssistantId()) == false)
            return false;
        if (other.getFeedback() == null ^ this.getFeedback() == null)
            return false;
        if (other.getFeedback() != null && other.getFeedback().equals(this.getFeedback()) == false)
            return false;
        if (other.getTargetId() == null ^ this.getTargetId() == null)
            return false;
        if (other.getTargetId() != null && other.getTargetId().equals(this.getTargetId()) == false)
            return false;
        if (other.getTargetType() == null ^ this.getTargetType() == null)
            return false;
        if (other.getTargetType() != null && other.getTargetType().equals(this.getTargetType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssistantId() == null) ? 0 : getAssistantId().hashCode());
        hashCode = prime * hashCode + ((getFeedback() == null) ? 0 : getFeedback().hashCode());
        hashCode = prime * hashCode + ((getTargetId() == null) ? 0 : getTargetId().hashCode());
        hashCode = prime * hashCode + ((getTargetType() == null) ? 0 : getTargetType().hashCode());
        return hashCode;
    }

    @Override
    public PutFeedbackRequest clone() {
        return (PutFeedbackRequest) super.clone();
    }

}
