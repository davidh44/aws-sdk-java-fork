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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreateCustomEntityType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCustomEntityTypeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String name;

    private String regexString;

    private java.util.List<String> contextWords;

    /**
     * @param name
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return
     */

    public String getName() {
        return this.name;
    }

    /**
     * @param name
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomEntityTypeRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * @param regexString
     */

    public void setRegexString(String regexString) {
        this.regexString = regexString;
    }

    /**
     * @return
     */

    public String getRegexString() {
        return this.regexString;
    }

    /**
     * @param regexString
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomEntityTypeRequest withRegexString(String regexString) {
        setRegexString(regexString);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<String> getContextWords() {
        return contextWords;
    }

    /**
     * @param contextWords
     */

    public void setContextWords(java.util.Collection<String> contextWords) {
        if (contextWords == null) {
            this.contextWords = null;
            return;
        }

        this.contextWords = new java.util.ArrayList<String>(contextWords);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContextWords(java.util.Collection)} or {@link #withContextWords(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param contextWords
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomEntityTypeRequest withContextWords(String... contextWords) {
        if (this.contextWords == null) {
            setContextWords(new java.util.ArrayList<String>(contextWords.length));
        }
        for (String ele : contextWords) {
            this.contextWords.add(ele);
        }
        return this;
    }

    /**
     * @param contextWords
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomEntityTypeRequest withContextWords(java.util.Collection<String> contextWords) {
        setContextWords(contextWords);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getRegexString() != null)
            sb.append("RegexString: ").append(getRegexString()).append(",");
        if (getContextWords() != null)
            sb.append("ContextWords: ").append(getContextWords());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCustomEntityTypeRequest == false)
            return false;
        CreateCustomEntityTypeRequest other = (CreateCustomEntityTypeRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRegexString() == null ^ this.getRegexString() == null)
            return false;
        if (other.getRegexString() != null && other.getRegexString().equals(this.getRegexString()) == false)
            return false;
        if (other.getContextWords() == null ^ this.getContextWords() == null)
            return false;
        if (other.getContextWords() != null && other.getContextWords().equals(this.getContextWords()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRegexString() == null) ? 0 : getRegexString().hashCode());
        hashCode = prime * hashCode + ((getContextWords() == null) ? 0 : getContextWords().hashCode());
        return hashCode;
    }

    @Override
    public CreateCustomEntityTypeRequest clone() {
        return (CreateCustomEntityTypeRequest) super.clone();
    }

}
