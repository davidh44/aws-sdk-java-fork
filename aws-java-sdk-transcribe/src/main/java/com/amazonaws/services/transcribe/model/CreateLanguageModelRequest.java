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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/CreateLanguageModel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLanguageModelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The language of your custom language model; note that the language code you select must match the language of
     * your training and tuning data.
     * </p>
     */
    private String languageCode;
    /**
     * <p>
     * The Amazon Transcribe standard language model, or base model, used to create your custom language model. Amazon
     * Transcribe offers two options for base models: Wideband and Narrowband.
     * </p>
     * <p>
     * If the audio you want to transcribe has a sample rate of 16,000 Hz or greater, choose <code>WideBand</code>. To
     * transcribe audio with a sample rate less than 16,000 Hz, choose <code>NarrowBand</code>.
     * </p>
     */
    private String baseModelName;
    /**
     * <p>
     * The name of your new custom language model.
     * </p>
     * <p>
     * This name is case sensitive, cannot contain spaces, and must be unique within an Amazon Web Services account. If
     * you try to create a language model with the same name as a previous language model, you get a
     * <code>ConflictException</code> error.
     * </p>
     */
    private String modelName;
    /**
     * <p>
     * Contains your data access role ARN (Amazon Resource Name) and the Amazon S3 locations of your training (
     * <code>S3Uri</code>) and tuning (<code>TuningDataS3Uri</code>) data.
     * </p>
     */
    private InputDataConfig inputDataConfig;
    /**
     * <p>
     * Optionally add tags, each in the form of a key:value pair, to your new language model. See also: .
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The language of your custom language model; note that the language code you select must match the language of
     * your training and tuning data.
     * </p>
     * 
     * @param languageCode
     *        The language of your custom language model; note that the language code you select must match the language
     *        of your training and tuning data.
     * @see CLMLanguageCode
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language of your custom language model; note that the language code you select must match the language of
     * your training and tuning data.
     * </p>
     * 
     * @return The language of your custom language model; note that the language code you select must match the
     *         language of your training and tuning data.
     * @see CLMLanguageCode
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * <p>
     * The language of your custom language model; note that the language code you select must match the language of
     * your training and tuning data.
     * </p>
     * 
     * @param languageCode
     *        The language of your custom language model; note that the language code you select must match the language
     *        of your training and tuning data.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CLMLanguageCode
     */

    public CreateLanguageModelRequest withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * <p>
     * The language of your custom language model; note that the language code you select must match the language of
     * your training and tuning data.
     * </p>
     * 
     * @param languageCode
     *        The language of your custom language model; note that the language code you select must match the language
     *        of your training and tuning data.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CLMLanguageCode
     */

    public CreateLanguageModelRequest withLanguageCode(CLMLanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Transcribe standard language model, or base model, used to create your custom language model. Amazon
     * Transcribe offers two options for base models: Wideband and Narrowband.
     * </p>
     * <p>
     * If the audio you want to transcribe has a sample rate of 16,000 Hz or greater, choose <code>WideBand</code>. To
     * transcribe audio with a sample rate less than 16,000 Hz, choose <code>NarrowBand</code>.
     * </p>
     * 
     * @param baseModelName
     *        The Amazon Transcribe standard language model, or base model, used to create your custom language model.
     *        Amazon Transcribe offers two options for base models: Wideband and Narrowband.</p>
     *        <p>
     *        If the audio you want to transcribe has a sample rate of 16,000 Hz or greater, choose
     *        <code>WideBand</code>. To transcribe audio with a sample rate less than 16,000 Hz, choose
     *        <code>NarrowBand</code>.
     * @see BaseModelName
     */

    public void setBaseModelName(String baseModelName) {
        this.baseModelName = baseModelName;
    }

    /**
     * <p>
     * The Amazon Transcribe standard language model, or base model, used to create your custom language model. Amazon
     * Transcribe offers two options for base models: Wideband and Narrowband.
     * </p>
     * <p>
     * If the audio you want to transcribe has a sample rate of 16,000 Hz or greater, choose <code>WideBand</code>. To
     * transcribe audio with a sample rate less than 16,000 Hz, choose <code>NarrowBand</code>.
     * </p>
     * 
     * @return The Amazon Transcribe standard language model, or base model, used to create your custom language model.
     *         Amazon Transcribe offers two options for base models: Wideband and Narrowband.</p>
     *         <p>
     *         If the audio you want to transcribe has a sample rate of 16,000 Hz or greater, choose
     *         <code>WideBand</code>. To transcribe audio with a sample rate less than 16,000 Hz, choose
     *         <code>NarrowBand</code>.
     * @see BaseModelName
     */

    public String getBaseModelName() {
        return this.baseModelName;
    }

    /**
     * <p>
     * The Amazon Transcribe standard language model, or base model, used to create your custom language model. Amazon
     * Transcribe offers two options for base models: Wideband and Narrowband.
     * </p>
     * <p>
     * If the audio you want to transcribe has a sample rate of 16,000 Hz or greater, choose <code>WideBand</code>. To
     * transcribe audio with a sample rate less than 16,000 Hz, choose <code>NarrowBand</code>.
     * </p>
     * 
     * @param baseModelName
     *        The Amazon Transcribe standard language model, or base model, used to create your custom language model.
     *        Amazon Transcribe offers two options for base models: Wideband and Narrowband.</p>
     *        <p>
     *        If the audio you want to transcribe has a sample rate of 16,000 Hz or greater, choose
     *        <code>WideBand</code>. To transcribe audio with a sample rate less than 16,000 Hz, choose
     *        <code>NarrowBand</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BaseModelName
     */

    public CreateLanguageModelRequest withBaseModelName(String baseModelName) {
        setBaseModelName(baseModelName);
        return this;
    }

    /**
     * <p>
     * The Amazon Transcribe standard language model, or base model, used to create your custom language model. Amazon
     * Transcribe offers two options for base models: Wideband and Narrowband.
     * </p>
     * <p>
     * If the audio you want to transcribe has a sample rate of 16,000 Hz or greater, choose <code>WideBand</code>. To
     * transcribe audio with a sample rate less than 16,000 Hz, choose <code>NarrowBand</code>.
     * </p>
     * 
     * @param baseModelName
     *        The Amazon Transcribe standard language model, or base model, used to create your custom language model.
     *        Amazon Transcribe offers two options for base models: Wideband and Narrowband.</p>
     *        <p>
     *        If the audio you want to transcribe has a sample rate of 16,000 Hz or greater, choose
     *        <code>WideBand</code>. To transcribe audio with a sample rate less than 16,000 Hz, choose
     *        <code>NarrowBand</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BaseModelName
     */

    public CreateLanguageModelRequest withBaseModelName(BaseModelName baseModelName) {
        this.baseModelName = baseModelName.toString();
        return this;
    }

    /**
     * <p>
     * The name of your new custom language model.
     * </p>
     * <p>
     * This name is case sensitive, cannot contain spaces, and must be unique within an Amazon Web Services account. If
     * you try to create a language model with the same name as a previous language model, you get a
     * <code>ConflictException</code> error.
     * </p>
     * 
     * @param modelName
     *        The name of your new custom language model.</p>
     *        <p>
     *        This name is case sensitive, cannot contain spaces, and must be unique within an Amazon Web Services
     *        account. If you try to create a language model with the same name as a previous language model, you get a
     *        <code>ConflictException</code> error.
     */

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * <p>
     * The name of your new custom language model.
     * </p>
     * <p>
     * This name is case sensitive, cannot contain spaces, and must be unique within an Amazon Web Services account. If
     * you try to create a language model with the same name as a previous language model, you get a
     * <code>ConflictException</code> error.
     * </p>
     * 
     * @return The name of your new custom language model.</p>
     *         <p>
     *         This name is case sensitive, cannot contain spaces, and must be unique within an Amazon Web Services
     *         account. If you try to create a language model with the same name as a previous language model, you get a
     *         <code>ConflictException</code> error.
     */

    public String getModelName() {
        return this.modelName;
    }

    /**
     * <p>
     * The name of your new custom language model.
     * </p>
     * <p>
     * This name is case sensitive, cannot contain spaces, and must be unique within an Amazon Web Services account. If
     * you try to create a language model with the same name as a previous language model, you get a
     * <code>ConflictException</code> error.
     * </p>
     * 
     * @param modelName
     *        The name of your new custom language model.</p>
     *        <p>
     *        This name is case sensitive, cannot contain spaces, and must be unique within an Amazon Web Services
     *        account. If you try to create a language model with the same name as a previous language model, you get a
     *        <code>ConflictException</code> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLanguageModelRequest withModelName(String modelName) {
        setModelName(modelName);
        return this;
    }

    /**
     * <p>
     * Contains your data access role ARN (Amazon Resource Name) and the Amazon S3 locations of your training (
     * <code>S3Uri</code>) and tuning (<code>TuningDataS3Uri</code>) data.
     * </p>
     * 
     * @param inputDataConfig
     *        Contains your data access role ARN (Amazon Resource Name) and the Amazon S3 locations of your training (
     *        <code>S3Uri</code>) and tuning (<code>TuningDataS3Uri</code>) data.
     */

    public void setInputDataConfig(InputDataConfig inputDataConfig) {
        this.inputDataConfig = inputDataConfig;
    }

    /**
     * <p>
     * Contains your data access role ARN (Amazon Resource Name) and the Amazon S3 locations of your training (
     * <code>S3Uri</code>) and tuning (<code>TuningDataS3Uri</code>) data.
     * </p>
     * 
     * @return Contains your data access role ARN (Amazon Resource Name) and the Amazon S3 locations of your training (
     *         <code>S3Uri</code>) and tuning (<code>TuningDataS3Uri</code>) data.
     */

    public InputDataConfig getInputDataConfig() {
        return this.inputDataConfig;
    }

    /**
     * <p>
     * Contains your data access role ARN (Amazon Resource Name) and the Amazon S3 locations of your training (
     * <code>S3Uri</code>) and tuning (<code>TuningDataS3Uri</code>) data.
     * </p>
     * 
     * @param inputDataConfig
     *        Contains your data access role ARN (Amazon Resource Name) and the Amazon S3 locations of your training (
     *        <code>S3Uri</code>) and tuning (<code>TuningDataS3Uri</code>) data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLanguageModelRequest withInputDataConfig(InputDataConfig inputDataConfig) {
        setInputDataConfig(inputDataConfig);
        return this;
    }

    /**
     * <p>
     * Optionally add tags, each in the form of a key:value pair, to your new language model. See also: .
     * </p>
     * 
     * @return Optionally add tags, each in the form of a key:value pair, to your new language model. See also: .
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Optionally add tags, each in the form of a key:value pair, to your new language model. See also: .
     * </p>
     * 
     * @param tags
     *        Optionally add tags, each in the form of a key:value pair, to your new language model. See also: .
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Optionally add tags, each in the form of a key:value pair, to your new language model. See also: .
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Optionally add tags, each in the form of a key:value pair, to your new language model. See also: .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLanguageModelRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Optionally add tags, each in the form of a key:value pair, to your new language model. See also: .
     * </p>
     * 
     * @param tags
     *        Optionally add tags, each in the form of a key:value pair, to your new language model. See also: .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLanguageModelRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getLanguageCode() != null)
            sb.append("LanguageCode: ").append(getLanguageCode()).append(",");
        if (getBaseModelName() != null)
            sb.append("BaseModelName: ").append(getBaseModelName()).append(",");
        if (getModelName() != null)
            sb.append("ModelName: ").append(getModelName()).append(",");
        if (getInputDataConfig() != null)
            sb.append("InputDataConfig: ").append(getInputDataConfig()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateLanguageModelRequest == false)
            return false;
        CreateLanguageModelRequest other = (CreateLanguageModelRequest) obj;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getBaseModelName() == null ^ this.getBaseModelName() == null)
            return false;
        if (other.getBaseModelName() != null && other.getBaseModelName().equals(this.getBaseModelName()) == false)
            return false;
        if (other.getModelName() == null ^ this.getModelName() == null)
            return false;
        if (other.getModelName() != null && other.getModelName().equals(this.getModelName()) == false)
            return false;
        if (other.getInputDataConfig() == null ^ this.getInputDataConfig() == null)
            return false;
        if (other.getInputDataConfig() != null && other.getInputDataConfig().equals(this.getInputDataConfig()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getBaseModelName() == null) ? 0 : getBaseModelName().hashCode());
        hashCode = prime * hashCode + ((getModelName() == null) ? 0 : getModelName().hashCode());
        hashCode = prime * hashCode + ((getInputDataConfig() == null) ? 0 : getInputDataConfig().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateLanguageModelRequest clone() {
        return (CreateLanguageModelRequest) super.clone();
    }

}
