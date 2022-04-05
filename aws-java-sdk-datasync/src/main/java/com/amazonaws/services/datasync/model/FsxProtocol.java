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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents the protocol that DataSync uses to access your Amazon FSx for OpenZFS file system.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/FsxProtocol" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FsxProtocol implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Represents the Network File System (NFS) protocol that DataSync uses to access your FSx for OpenZFS file system.
     * </p>
     */
    private FsxProtocolNfs nFS;

    /**
     * <p>
     * Represents the Network File System (NFS) protocol that DataSync uses to access your FSx for OpenZFS file system.
     * </p>
     * 
     * @param nFS
     *        Represents the Network File System (NFS) protocol that DataSync uses to access your FSx for OpenZFS file
     *        system.
     */

    public void setNFS(FsxProtocolNfs nFS) {
        this.nFS = nFS;
    }

    /**
     * <p>
     * Represents the Network File System (NFS) protocol that DataSync uses to access your FSx for OpenZFS file system.
     * </p>
     * 
     * @return Represents the Network File System (NFS) protocol that DataSync uses to access your FSx for OpenZFS file
     *         system.
     */

    public FsxProtocolNfs getNFS() {
        return this.nFS;
    }

    /**
     * <p>
     * Represents the Network File System (NFS) protocol that DataSync uses to access your FSx for OpenZFS file system.
     * </p>
     * 
     * @param nFS
     *        Represents the Network File System (NFS) protocol that DataSync uses to access your FSx for OpenZFS file
     *        system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FsxProtocol withNFS(FsxProtocolNfs nFS) {
        setNFS(nFS);
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
        if (getNFS() != null)
            sb.append("NFS: ").append(getNFS());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FsxProtocol == false)
            return false;
        FsxProtocol other = (FsxProtocol) obj;
        if (other.getNFS() == null ^ this.getNFS() == null)
            return false;
        if (other.getNFS() != null && other.getNFS().equals(this.getNFS()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNFS() == null) ? 0 : getNFS().hashCode());
        return hashCode;
    }

    @Override
    public FsxProtocol clone() {
        try {
            return (FsxProtocol) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datasync.model.transform.FsxProtocolMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
