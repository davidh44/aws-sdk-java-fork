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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/PutFeedback" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutFeedbackResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Wisdom assistant.
     * </p>
     */
    private String assistantArn;
    /**
     * <p>
     * The identifier of the Wisdom assistant.
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
     * The Amazon Resource Name (ARN) of the Wisdom assistant.
     * </p>
     * 
     * @param assistantArn
     *        The Amazon Resource Name (ARN) of the Wisdom assistant.
     */

    public void setAssistantArn(String assistantArn) {
        this.assistantArn = assistantArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Wisdom assistant.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Wisdom assistant.
     */

    public String getAssistantArn() {
        return this.assistantArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Wisdom assistant.
     * </p>
     * 
     * @param assistantArn
     *        The Amazon Resource Name (ARN) of the Wisdom assistant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutFeedbackResult withAssistantArn(String assistantArn) {
        setAssistantArn(assistantArn);
        return this;
    }

    /**
     * <p>
     * The identifier of the Wisdom assistant.
     * </p>
     * 
     * @param assistantId
     *        The identifier of the Wisdom assistant.
     */

    public void setAssistantId(String assistantId) {
        this.assistantId = assistantId;
    }

    /**
     * <p>
     * The identifier of the Wisdom assistant.
     * </p>
     * 
     * @return The identifier of the Wisdom assistant.
     */

    public String getAssistantId() {
        return this.assistantId;
    }

    /**
     * <p>
     * The identifier of the Wisdom assistant.
     * </p>
     * 
     * @param assistantId
     *        The identifier of the Wisdom assistant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutFeedbackResult withAssistantId(String assistantId) {
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

    public PutFeedbackResult withFeedback(FeedbackData feedback) {
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

    public PutFeedbackResult withTargetId(String targetId) {
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

    public PutFeedbackResult withTargetType(String targetType) {
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

    public PutFeedbackResult withTargetType(TargetType targetType) {
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
        if (getAssistantArn() != null)
            sb.append("AssistantArn: ").append(getAssistantArn()).append(",");
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

        if (obj instanceof PutFeedbackResult == false)
            return false;
        PutFeedbackResult other = (PutFeedbackResult) obj;
        if (other.getAssistantArn() == null ^ this.getAssistantArn() == null)
            return false;
        if (other.getAssistantArn() != null && other.getAssistantArn().equals(this.getAssistantArn()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getAssistantArn() == null) ? 0 : getAssistantArn().hashCode());
        hashCode = prime * hashCode + ((getAssistantId() == null) ? 0 : getAssistantId().hashCode());
        hashCode = prime * hashCode + ((getFeedback() == null) ? 0 : getFeedback().hashCode());
        hashCode = prime * hashCode + ((getTargetId() == null) ? 0 : getTargetId().hashCode());
        hashCode = prime * hashCode + ((getTargetType() == null) ? 0 : getTargetType().hashCode());
        return hashCode;
    }

    @Override
    public PutFeedbackResult clone() {
        try {
            return (PutFeedbackResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
