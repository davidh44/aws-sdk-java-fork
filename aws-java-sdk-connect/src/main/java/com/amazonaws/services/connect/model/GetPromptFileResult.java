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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/GetPromptFile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPromptFileResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A generated URL to the prompt that can be given to an unauthorized user so they can access the prompt in S3.
     * </p>
     */
    private String promptPresignedUrl;

    /**
     * <p>
     * A generated URL to the prompt that can be given to an unauthorized user so they can access the prompt in S3.
     * </p>
     * 
     * @param promptPresignedUrl
     *        A generated URL to the prompt that can be given to an unauthorized user so they can access the prompt in
     *        S3.
     */

    public void setPromptPresignedUrl(String promptPresignedUrl) {
        this.promptPresignedUrl = promptPresignedUrl;
    }

    /**
     * <p>
     * A generated URL to the prompt that can be given to an unauthorized user so they can access the prompt in S3.
     * </p>
     * 
     * @return A generated URL to the prompt that can be given to an unauthorized user so they can access the prompt in
     *         S3.
     */

    public String getPromptPresignedUrl() {
        return this.promptPresignedUrl;
    }

    /**
     * <p>
     * A generated URL to the prompt that can be given to an unauthorized user so they can access the prompt in S3.
     * </p>
     * 
     * @param promptPresignedUrl
     *        A generated URL to the prompt that can be given to an unauthorized user so they can access the prompt in
     *        S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPromptFileResult withPromptPresignedUrl(String promptPresignedUrl) {
        setPromptPresignedUrl(promptPresignedUrl);
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
        if (getPromptPresignedUrl() != null)
            sb.append("PromptPresignedUrl: ").append(getPromptPresignedUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPromptFileResult == false)
            return false;
        GetPromptFileResult other = (GetPromptFileResult) obj;
        if (other.getPromptPresignedUrl() == null ^ this.getPromptPresignedUrl() == null)
            return false;
        if (other.getPromptPresignedUrl() != null && other.getPromptPresignedUrl().equals(this.getPromptPresignedUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPromptPresignedUrl() == null) ? 0 : getPromptPresignedUrl().hashCode());
        return hashCode;
    }

    @Override
    public GetPromptFileResult clone() {
        try {
            return (GetPromptFileResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
