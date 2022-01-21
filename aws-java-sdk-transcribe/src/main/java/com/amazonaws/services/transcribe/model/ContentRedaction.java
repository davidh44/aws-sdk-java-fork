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
package com.amazonaws.services.transcribe.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Settings for content redaction within a transcription job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/ContentRedaction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContentRedaction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Request parameter that defines the entities to be redacted. The only accepted value is <code>PII</code>.
     * </p>
     */
    private String redactionType;
    /**
     * <p>
     * The output transcript file stored in either the default S3 bucket or in a bucket you specify.
     * </p>
     * <p>
     * When you choose <code>redacted</code> Amazon Transcribe outputs only the redacted transcript.
     * </p>
     * <p>
     * When you choose <code>redacted_and_unredacted</code> Amazon Transcribe outputs both the redacted and unredacted
     * transcripts.
     * </p>
     */
    private String redactionOutput;
    /**
     * <p>
     * The types of personally identifiable information (PII) you want to redact in your transcript.
     * </p>
     */
    private java.util.List<String> piiEntityTypes;

    /**
     * <p>
     * Request parameter that defines the entities to be redacted. The only accepted value is <code>PII</code>.
     * </p>
     * 
     * @param redactionType
     *        Request parameter that defines the entities to be redacted. The only accepted value is <code>PII</code>.
     * @see RedactionType
     */

    public void setRedactionType(String redactionType) {
        this.redactionType = redactionType;
    }

    /**
     * <p>
     * Request parameter that defines the entities to be redacted. The only accepted value is <code>PII</code>.
     * </p>
     * 
     * @return Request parameter that defines the entities to be redacted. The only accepted value is <code>PII</code>.
     * @see RedactionType
     */

    public String getRedactionType() {
        return this.redactionType;
    }

    /**
     * <p>
     * Request parameter that defines the entities to be redacted. The only accepted value is <code>PII</code>.
     * </p>
     * 
     * @param redactionType
     *        Request parameter that defines the entities to be redacted. The only accepted value is <code>PII</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RedactionType
     */

    public ContentRedaction withRedactionType(String redactionType) {
        setRedactionType(redactionType);
        return this;
    }

    /**
     * <p>
     * Request parameter that defines the entities to be redacted. The only accepted value is <code>PII</code>.
     * </p>
     * 
     * @param redactionType
     *        Request parameter that defines the entities to be redacted. The only accepted value is <code>PII</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RedactionType
     */

    public ContentRedaction withRedactionType(RedactionType redactionType) {
        this.redactionType = redactionType.toString();
        return this;
    }

    /**
     * <p>
     * The output transcript file stored in either the default S3 bucket or in a bucket you specify.
     * </p>
     * <p>
     * When you choose <code>redacted</code> Amazon Transcribe outputs only the redacted transcript.
     * </p>
     * <p>
     * When you choose <code>redacted_and_unredacted</code> Amazon Transcribe outputs both the redacted and unredacted
     * transcripts.
     * </p>
     * 
     * @param redactionOutput
     *        The output transcript file stored in either the default S3 bucket or in a bucket you specify.</p>
     *        <p>
     *        When you choose <code>redacted</code> Amazon Transcribe outputs only the redacted transcript.
     *        </p>
     *        <p>
     *        When you choose <code>redacted_and_unredacted</code> Amazon Transcribe outputs both the redacted and
     *        unredacted transcripts.
     * @see RedactionOutput
     */

    public void setRedactionOutput(String redactionOutput) {
        this.redactionOutput = redactionOutput;
    }

    /**
     * <p>
     * The output transcript file stored in either the default S3 bucket or in a bucket you specify.
     * </p>
     * <p>
     * When you choose <code>redacted</code> Amazon Transcribe outputs only the redacted transcript.
     * </p>
     * <p>
     * When you choose <code>redacted_and_unredacted</code> Amazon Transcribe outputs both the redacted and unredacted
     * transcripts.
     * </p>
     * 
     * @return The output transcript file stored in either the default S3 bucket or in a bucket you specify.</p>
     *         <p>
     *         When you choose <code>redacted</code> Amazon Transcribe outputs only the redacted transcript.
     *         </p>
     *         <p>
     *         When you choose <code>redacted_and_unredacted</code> Amazon Transcribe outputs both the redacted and
     *         unredacted transcripts.
     * @see RedactionOutput
     */

    public String getRedactionOutput() {
        return this.redactionOutput;
    }

    /**
     * <p>
     * The output transcript file stored in either the default S3 bucket or in a bucket you specify.
     * </p>
     * <p>
     * When you choose <code>redacted</code> Amazon Transcribe outputs only the redacted transcript.
     * </p>
     * <p>
     * When you choose <code>redacted_and_unredacted</code> Amazon Transcribe outputs both the redacted and unredacted
     * transcripts.
     * </p>
     * 
     * @param redactionOutput
     *        The output transcript file stored in either the default S3 bucket or in a bucket you specify.</p>
     *        <p>
     *        When you choose <code>redacted</code> Amazon Transcribe outputs only the redacted transcript.
     *        </p>
     *        <p>
     *        When you choose <code>redacted_and_unredacted</code> Amazon Transcribe outputs both the redacted and
     *        unredacted transcripts.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RedactionOutput
     */

    public ContentRedaction withRedactionOutput(String redactionOutput) {
        setRedactionOutput(redactionOutput);
        return this;
    }

    /**
     * <p>
     * The output transcript file stored in either the default S3 bucket or in a bucket you specify.
     * </p>
     * <p>
     * When you choose <code>redacted</code> Amazon Transcribe outputs only the redacted transcript.
     * </p>
     * <p>
     * When you choose <code>redacted_and_unredacted</code> Amazon Transcribe outputs both the redacted and unredacted
     * transcripts.
     * </p>
     * 
     * @param redactionOutput
     *        The output transcript file stored in either the default S3 bucket or in a bucket you specify.</p>
     *        <p>
     *        When you choose <code>redacted</code> Amazon Transcribe outputs only the redacted transcript.
     *        </p>
     *        <p>
     *        When you choose <code>redacted_and_unredacted</code> Amazon Transcribe outputs both the redacted and
     *        unredacted transcripts.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RedactionOutput
     */

    public ContentRedaction withRedactionOutput(RedactionOutput redactionOutput) {
        this.redactionOutput = redactionOutput.toString();
        return this;
    }

    /**
     * <p>
     * The types of personally identifiable information (PII) you want to redact in your transcript.
     * </p>
     * 
     * @return The types of personally identifiable information (PII) you want to redact in your transcript.
     * @see PiiEntityType
     */

    public java.util.List<String> getPiiEntityTypes() {
        return piiEntityTypes;
    }

    /**
     * <p>
     * The types of personally identifiable information (PII) you want to redact in your transcript.
     * </p>
     * 
     * @param piiEntityTypes
     *        The types of personally identifiable information (PII) you want to redact in your transcript.
     * @see PiiEntityType
     */

    public void setPiiEntityTypes(java.util.Collection<String> piiEntityTypes) {
        if (piiEntityTypes == null) {
            this.piiEntityTypes = null;
            return;
        }

        this.piiEntityTypes = new java.util.ArrayList<String>(piiEntityTypes);
    }

    /**
     * <p>
     * The types of personally identifiable information (PII) you want to redact in your transcript.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPiiEntityTypes(java.util.Collection)} or {@link #withPiiEntityTypes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param piiEntityTypes
     *        The types of personally identifiable information (PII) you want to redact in your transcript.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PiiEntityType
     */

    public ContentRedaction withPiiEntityTypes(String... piiEntityTypes) {
        if (this.piiEntityTypes == null) {
            setPiiEntityTypes(new java.util.ArrayList<String>(piiEntityTypes.length));
        }
        for (String ele : piiEntityTypes) {
            this.piiEntityTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The types of personally identifiable information (PII) you want to redact in your transcript.
     * </p>
     * 
     * @param piiEntityTypes
     *        The types of personally identifiable information (PII) you want to redact in your transcript.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PiiEntityType
     */

    public ContentRedaction withPiiEntityTypes(java.util.Collection<String> piiEntityTypes) {
        setPiiEntityTypes(piiEntityTypes);
        return this;
    }

    /**
     * <p>
     * The types of personally identifiable information (PII) you want to redact in your transcript.
     * </p>
     * 
     * @param piiEntityTypes
     *        The types of personally identifiable information (PII) you want to redact in your transcript.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PiiEntityType
     */

    public ContentRedaction withPiiEntityTypes(PiiEntityType... piiEntityTypes) {
        java.util.ArrayList<String> piiEntityTypesCopy = new java.util.ArrayList<String>(piiEntityTypes.length);
        for (PiiEntityType value : piiEntityTypes) {
            piiEntityTypesCopy.add(value.toString());
        }
        if (getPiiEntityTypes() == null) {
            setPiiEntityTypes(piiEntityTypesCopy);
        } else {
            getPiiEntityTypes().addAll(piiEntityTypesCopy);
        }
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
        if (getRedactionType() != null)
            sb.append("RedactionType: ").append(getRedactionType()).append(",");
        if (getRedactionOutput() != null)
            sb.append("RedactionOutput: ").append(getRedactionOutput()).append(",");
        if (getPiiEntityTypes() != null)
            sb.append("PiiEntityTypes: ").append(getPiiEntityTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContentRedaction == false)
            return false;
        ContentRedaction other = (ContentRedaction) obj;
        if (other.getRedactionType() == null ^ this.getRedactionType() == null)
            return false;
        if (other.getRedactionType() != null && other.getRedactionType().equals(this.getRedactionType()) == false)
            return false;
        if (other.getRedactionOutput() == null ^ this.getRedactionOutput() == null)
            return false;
        if (other.getRedactionOutput() != null && other.getRedactionOutput().equals(this.getRedactionOutput()) == false)
            return false;
        if (other.getPiiEntityTypes() == null ^ this.getPiiEntityTypes() == null)
            return false;
        if (other.getPiiEntityTypes() != null && other.getPiiEntityTypes().equals(this.getPiiEntityTypes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRedactionType() == null) ? 0 : getRedactionType().hashCode());
        hashCode = prime * hashCode + ((getRedactionOutput() == null) ? 0 : getRedactionOutput().hashCode());
        hashCode = prime * hashCode + ((getPiiEntityTypes() == null) ? 0 : getPiiEntityTypes().hashCode());
        return hashCode;
    }

    @Override
    public ContentRedaction clone() {
        try {
            return (ContentRedaction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transcribe.model.transform.ContentRedactionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
