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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The feedback to submit to Wisdom.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/FeedbackData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FeedbackData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The relevance of the target this feedback is for.
     * </p>
     */
    private String relevance;

    /**
     * <p>
     * The relevance of the target this feedback is for.
     * </p>
     * 
     * @param relevance
     *        The relevance of the target this feedback is for.
     * @see Relevance
     */

    public void setRelevance(String relevance) {
        this.relevance = relevance;
    }

    /**
     * <p>
     * The relevance of the target this feedback is for.
     * </p>
     * 
     * @return The relevance of the target this feedback is for.
     * @see Relevance
     */

    public String getRelevance() {
        return this.relevance;
    }

    /**
     * <p>
     * The relevance of the target this feedback is for.
     * </p>
     * 
     * @param relevance
     *        The relevance of the target this feedback is for.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Relevance
     */

    public FeedbackData withRelevance(String relevance) {
        setRelevance(relevance);
        return this;
    }

    /**
     * <p>
     * The relevance of the target this feedback is for.
     * </p>
     * 
     * @param relevance
     *        The relevance of the target this feedback is for.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Relevance
     */

    public FeedbackData withRelevance(Relevance relevance) {
        this.relevance = relevance.toString();
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
        if (getRelevance() != null)
            sb.append("Relevance: ").append(getRelevance());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FeedbackData == false)
            return false;
        FeedbackData other = (FeedbackData) obj;
        if (other.getRelevance() == null ^ this.getRelevance() == null)
            return false;
        if (other.getRelevance() != null && other.getRelevance().equals(this.getRelevance()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRelevance() == null) ? 0 : getRelevance().hashCode());
        return hashCode;
    }

    @Override
    public FeedbackData clone() {
        try {
            return (FeedbackData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connectwisdom.model.transform.FeedbackDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
