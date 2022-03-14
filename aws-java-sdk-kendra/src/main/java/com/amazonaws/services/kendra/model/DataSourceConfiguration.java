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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides the configuration information for an Amazon Kendra data source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DataSourceConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataSourceConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Provides the configuration information to connect to an Amazon S3 bucket as your data source.
     * </p>
     */
    private S3DataSourceConfiguration s3Configuration;
    /**
     * <p>
     * Provides the configuration information to connect to Microsoft SharePoint as your data source.
     * </p>
     */
    private SharePointConfiguration sharePointConfiguration;
    /**
     * <p>
     * Provides the configuration information to connect to a database as your data source.
     * </p>
     */
    private DatabaseConfiguration databaseConfiguration;
    /**
     * <p>
     * Provides the configuration information to connect to Salesforce as your data source.
     * </p>
     */
    private SalesforceConfiguration salesforceConfiguration;
    /**
     * <p>
     * Provides the configuration information to connect to Microsoft OneDrive as your data source.
     * </p>
     */
    private OneDriveConfiguration oneDriveConfiguration;
    /**
     * <p>
     * Provides the configuration information to connect to ServiceNow as your data source.
     * </p>
     */
    private ServiceNowConfiguration serviceNowConfiguration;
    /**
     * <p>
     * Provides the configuration information to connect to Confluence as your data source.
     * </p>
     */
    private ConfluenceConfiguration confluenceConfiguration;
    /**
     * <p>
     * Provides the configuration information to connect to Google Drive as your data source.
     * </p>
     */
    private GoogleDriveConfiguration googleDriveConfiguration;

    private WebCrawlerConfiguration webCrawlerConfiguration;
    /**
     * <p>
     * Provides the configuration information to connect to Amazon WorkDocs as your data source.
     * </p>
     */
    private WorkDocsConfiguration workDocsConfiguration;
    /**
     * <p>
     * Provides the configuration information to connect to Amazon FSx as your data source.
     * </p>
     */
    private FsxConfiguration fsxConfiguration;
    /**
     * <p>
     * Provides the configuration information to connect to Slack as your data source.
     * </p>
     */
    private SlackConfiguration slackConfiguration;

    /**
     * <p>
     * Provides the configuration information to connect to an Amazon S3 bucket as your data source.
     * </p>
     * 
     * @param s3Configuration
     *        Provides the configuration information to connect to an Amazon S3 bucket as your data source.
     */

    public void setS3Configuration(S3DataSourceConfiguration s3Configuration) {
        this.s3Configuration = s3Configuration;
    }

    /**
     * <p>
     * Provides the configuration information to connect to an Amazon S3 bucket as your data source.
     * </p>
     * 
     * @return Provides the configuration information to connect to an Amazon S3 bucket as your data source.
     */

    public S3DataSourceConfiguration getS3Configuration() {
        return this.s3Configuration;
    }

    /**
     * <p>
     * Provides the configuration information to connect to an Amazon S3 bucket as your data source.
     * </p>
     * 
     * @param s3Configuration
     *        Provides the configuration information to connect to an Amazon S3 bucket as your data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceConfiguration withS3Configuration(S3DataSourceConfiguration s3Configuration) {
        setS3Configuration(s3Configuration);
        return this;
    }

    /**
     * <p>
     * Provides the configuration information to connect to Microsoft SharePoint as your data source.
     * </p>
     * 
     * @param sharePointConfiguration
     *        Provides the configuration information to connect to Microsoft SharePoint as your data source.
     */

    public void setSharePointConfiguration(SharePointConfiguration sharePointConfiguration) {
        this.sharePointConfiguration = sharePointConfiguration;
    }

    /**
     * <p>
     * Provides the configuration information to connect to Microsoft SharePoint as your data source.
     * </p>
     * 
     * @return Provides the configuration information to connect to Microsoft SharePoint as your data source.
     */

    public SharePointConfiguration getSharePointConfiguration() {
        return this.sharePointConfiguration;
    }

    /**
     * <p>
     * Provides the configuration information to connect to Microsoft SharePoint as your data source.
     * </p>
     * 
     * @param sharePointConfiguration
     *        Provides the configuration information to connect to Microsoft SharePoint as your data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceConfiguration withSharePointConfiguration(SharePointConfiguration sharePointConfiguration) {
        setSharePointConfiguration(sharePointConfiguration);
        return this;
    }

    /**
     * <p>
     * Provides the configuration information to connect to a database as your data source.
     * </p>
     * 
     * @param databaseConfiguration
     *        Provides the configuration information to connect to a database as your data source.
     */

    public void setDatabaseConfiguration(DatabaseConfiguration databaseConfiguration) {
        this.databaseConfiguration = databaseConfiguration;
    }

    /**
     * <p>
     * Provides the configuration information to connect to a database as your data source.
     * </p>
     * 
     * @return Provides the configuration information to connect to a database as your data source.
     */

    public DatabaseConfiguration getDatabaseConfiguration() {
        return this.databaseConfiguration;
    }

    /**
     * <p>
     * Provides the configuration information to connect to a database as your data source.
     * </p>
     * 
     * @param databaseConfiguration
     *        Provides the configuration information to connect to a database as your data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceConfiguration withDatabaseConfiguration(DatabaseConfiguration databaseConfiguration) {
        setDatabaseConfiguration(databaseConfiguration);
        return this;
    }

    /**
     * <p>
     * Provides the configuration information to connect to Salesforce as your data source.
     * </p>
     * 
     * @param salesforceConfiguration
     *        Provides the configuration information to connect to Salesforce as your data source.
     */

    public void setSalesforceConfiguration(SalesforceConfiguration salesforceConfiguration) {
        this.salesforceConfiguration = salesforceConfiguration;
    }

    /**
     * <p>
     * Provides the configuration information to connect to Salesforce as your data source.
     * </p>
     * 
     * @return Provides the configuration information to connect to Salesforce as your data source.
     */

    public SalesforceConfiguration getSalesforceConfiguration() {
        return this.salesforceConfiguration;
    }

    /**
     * <p>
     * Provides the configuration information to connect to Salesforce as your data source.
     * </p>
     * 
     * @param salesforceConfiguration
     *        Provides the configuration information to connect to Salesforce as your data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceConfiguration withSalesforceConfiguration(SalesforceConfiguration salesforceConfiguration) {
        setSalesforceConfiguration(salesforceConfiguration);
        return this;
    }

    /**
     * <p>
     * Provides the configuration information to connect to Microsoft OneDrive as your data source.
     * </p>
     * 
     * @param oneDriveConfiguration
     *        Provides the configuration information to connect to Microsoft OneDrive as your data source.
     */

    public void setOneDriveConfiguration(OneDriveConfiguration oneDriveConfiguration) {
        this.oneDriveConfiguration = oneDriveConfiguration;
    }

    /**
     * <p>
     * Provides the configuration information to connect to Microsoft OneDrive as your data source.
     * </p>
     * 
     * @return Provides the configuration information to connect to Microsoft OneDrive as your data source.
     */

    public OneDriveConfiguration getOneDriveConfiguration() {
        return this.oneDriveConfiguration;
    }

    /**
     * <p>
     * Provides the configuration information to connect to Microsoft OneDrive as your data source.
     * </p>
     * 
     * @param oneDriveConfiguration
     *        Provides the configuration information to connect to Microsoft OneDrive as your data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceConfiguration withOneDriveConfiguration(OneDriveConfiguration oneDriveConfiguration) {
        setOneDriveConfiguration(oneDriveConfiguration);
        return this;
    }

    /**
     * <p>
     * Provides the configuration information to connect to ServiceNow as your data source.
     * </p>
     * 
     * @param serviceNowConfiguration
     *        Provides the configuration information to connect to ServiceNow as your data source.
     */

    public void setServiceNowConfiguration(ServiceNowConfiguration serviceNowConfiguration) {
        this.serviceNowConfiguration = serviceNowConfiguration;
    }

    /**
     * <p>
     * Provides the configuration information to connect to ServiceNow as your data source.
     * </p>
     * 
     * @return Provides the configuration information to connect to ServiceNow as your data source.
     */

    public ServiceNowConfiguration getServiceNowConfiguration() {
        return this.serviceNowConfiguration;
    }

    /**
     * <p>
     * Provides the configuration information to connect to ServiceNow as your data source.
     * </p>
     * 
     * @param serviceNowConfiguration
     *        Provides the configuration information to connect to ServiceNow as your data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceConfiguration withServiceNowConfiguration(ServiceNowConfiguration serviceNowConfiguration) {
        setServiceNowConfiguration(serviceNowConfiguration);
        return this;
    }

    /**
     * <p>
     * Provides the configuration information to connect to Confluence as your data source.
     * </p>
     * 
     * @param confluenceConfiguration
     *        Provides the configuration information to connect to Confluence as your data source.
     */

    public void setConfluenceConfiguration(ConfluenceConfiguration confluenceConfiguration) {
        this.confluenceConfiguration = confluenceConfiguration;
    }

    /**
     * <p>
     * Provides the configuration information to connect to Confluence as your data source.
     * </p>
     * 
     * @return Provides the configuration information to connect to Confluence as your data source.
     */

    public ConfluenceConfiguration getConfluenceConfiguration() {
        return this.confluenceConfiguration;
    }

    /**
     * <p>
     * Provides the configuration information to connect to Confluence as your data source.
     * </p>
     * 
     * @param confluenceConfiguration
     *        Provides the configuration information to connect to Confluence as your data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceConfiguration withConfluenceConfiguration(ConfluenceConfiguration confluenceConfiguration) {
        setConfluenceConfiguration(confluenceConfiguration);
        return this;
    }

    /**
     * <p>
     * Provides the configuration information to connect to Google Drive as your data source.
     * </p>
     * 
     * @param googleDriveConfiguration
     *        Provides the configuration information to connect to Google Drive as your data source.
     */

    public void setGoogleDriveConfiguration(GoogleDriveConfiguration googleDriveConfiguration) {
        this.googleDriveConfiguration = googleDriveConfiguration;
    }

    /**
     * <p>
     * Provides the configuration information to connect to Google Drive as your data source.
     * </p>
     * 
     * @return Provides the configuration information to connect to Google Drive as your data source.
     */

    public GoogleDriveConfiguration getGoogleDriveConfiguration() {
        return this.googleDriveConfiguration;
    }

    /**
     * <p>
     * Provides the configuration information to connect to Google Drive as your data source.
     * </p>
     * 
     * @param googleDriveConfiguration
     *        Provides the configuration information to connect to Google Drive as your data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceConfiguration withGoogleDriveConfiguration(GoogleDriveConfiguration googleDriveConfiguration) {
        setGoogleDriveConfiguration(googleDriveConfiguration);
        return this;
    }

    /**
     * @param webCrawlerConfiguration
     */

    public void setWebCrawlerConfiguration(WebCrawlerConfiguration webCrawlerConfiguration) {
        this.webCrawlerConfiguration = webCrawlerConfiguration;
    }

    /**
     * @return
     */

    public WebCrawlerConfiguration getWebCrawlerConfiguration() {
        return this.webCrawlerConfiguration;
    }

    /**
     * @param webCrawlerConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceConfiguration withWebCrawlerConfiguration(WebCrawlerConfiguration webCrawlerConfiguration) {
        setWebCrawlerConfiguration(webCrawlerConfiguration);
        return this;
    }

    /**
     * <p>
     * Provides the configuration information to connect to Amazon WorkDocs as your data source.
     * </p>
     * 
     * @param workDocsConfiguration
     *        Provides the configuration information to connect to Amazon WorkDocs as your data source.
     */

    public void setWorkDocsConfiguration(WorkDocsConfiguration workDocsConfiguration) {
        this.workDocsConfiguration = workDocsConfiguration;
    }

    /**
     * <p>
     * Provides the configuration information to connect to Amazon WorkDocs as your data source.
     * </p>
     * 
     * @return Provides the configuration information to connect to Amazon WorkDocs as your data source.
     */

    public WorkDocsConfiguration getWorkDocsConfiguration() {
        return this.workDocsConfiguration;
    }

    /**
     * <p>
     * Provides the configuration information to connect to Amazon WorkDocs as your data source.
     * </p>
     * 
     * @param workDocsConfiguration
     *        Provides the configuration information to connect to Amazon WorkDocs as your data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceConfiguration withWorkDocsConfiguration(WorkDocsConfiguration workDocsConfiguration) {
        setWorkDocsConfiguration(workDocsConfiguration);
        return this;
    }

    /**
     * <p>
     * Provides the configuration information to connect to Amazon FSx as your data source.
     * </p>
     * 
     * @param fsxConfiguration
     *        Provides the configuration information to connect to Amazon FSx as your data source.
     */

    public void setFsxConfiguration(FsxConfiguration fsxConfiguration) {
        this.fsxConfiguration = fsxConfiguration;
    }

    /**
     * <p>
     * Provides the configuration information to connect to Amazon FSx as your data source.
     * </p>
     * 
     * @return Provides the configuration information to connect to Amazon FSx as your data source.
     */

    public FsxConfiguration getFsxConfiguration() {
        return this.fsxConfiguration;
    }

    /**
     * <p>
     * Provides the configuration information to connect to Amazon FSx as your data source.
     * </p>
     * 
     * @param fsxConfiguration
     *        Provides the configuration information to connect to Amazon FSx as your data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceConfiguration withFsxConfiguration(FsxConfiguration fsxConfiguration) {
        setFsxConfiguration(fsxConfiguration);
        return this;
    }

    /**
     * <p>
     * Provides the configuration information to connect to Slack as your data source.
     * </p>
     * 
     * @param slackConfiguration
     *        Provides the configuration information to connect to Slack as your data source.
     */

    public void setSlackConfiguration(SlackConfiguration slackConfiguration) {
        this.slackConfiguration = slackConfiguration;
    }

    /**
     * <p>
     * Provides the configuration information to connect to Slack as your data source.
     * </p>
     * 
     * @return Provides the configuration information to connect to Slack as your data source.
     */

    public SlackConfiguration getSlackConfiguration() {
        return this.slackConfiguration;
    }

    /**
     * <p>
     * Provides the configuration information to connect to Slack as your data source.
     * </p>
     * 
     * @param slackConfiguration
     *        Provides the configuration information to connect to Slack as your data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceConfiguration withSlackConfiguration(SlackConfiguration slackConfiguration) {
        setSlackConfiguration(slackConfiguration);
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
        if (getS3Configuration() != null)
            sb.append("S3Configuration: ").append(getS3Configuration()).append(",");
        if (getSharePointConfiguration() != null)
            sb.append("SharePointConfiguration: ").append(getSharePointConfiguration()).append(",");
        if (getDatabaseConfiguration() != null)
            sb.append("DatabaseConfiguration: ").append(getDatabaseConfiguration()).append(",");
        if (getSalesforceConfiguration() != null)
            sb.append("SalesforceConfiguration: ").append(getSalesforceConfiguration()).append(",");
        if (getOneDriveConfiguration() != null)
            sb.append("OneDriveConfiguration: ").append(getOneDriveConfiguration()).append(",");
        if (getServiceNowConfiguration() != null)
            sb.append("ServiceNowConfiguration: ").append(getServiceNowConfiguration()).append(",");
        if (getConfluenceConfiguration() != null)
            sb.append("ConfluenceConfiguration: ").append(getConfluenceConfiguration()).append(",");
        if (getGoogleDriveConfiguration() != null)
            sb.append("GoogleDriveConfiguration: ").append(getGoogleDriveConfiguration()).append(",");
        if (getWebCrawlerConfiguration() != null)
            sb.append("WebCrawlerConfiguration: ").append(getWebCrawlerConfiguration()).append(",");
        if (getWorkDocsConfiguration() != null)
            sb.append("WorkDocsConfiguration: ").append(getWorkDocsConfiguration()).append(",");
        if (getFsxConfiguration() != null)
            sb.append("FsxConfiguration: ").append(getFsxConfiguration()).append(",");
        if (getSlackConfiguration() != null)
            sb.append("SlackConfiguration: ").append(getSlackConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataSourceConfiguration == false)
            return false;
        DataSourceConfiguration other = (DataSourceConfiguration) obj;
        if (other.getS3Configuration() == null ^ this.getS3Configuration() == null)
            return false;
        if (other.getS3Configuration() != null && other.getS3Configuration().equals(this.getS3Configuration()) == false)
            return false;
        if (other.getSharePointConfiguration() == null ^ this.getSharePointConfiguration() == null)
            return false;
        if (other.getSharePointConfiguration() != null && other.getSharePointConfiguration().equals(this.getSharePointConfiguration()) == false)
            return false;
        if (other.getDatabaseConfiguration() == null ^ this.getDatabaseConfiguration() == null)
            return false;
        if (other.getDatabaseConfiguration() != null && other.getDatabaseConfiguration().equals(this.getDatabaseConfiguration()) == false)
            return false;
        if (other.getSalesforceConfiguration() == null ^ this.getSalesforceConfiguration() == null)
            return false;
        if (other.getSalesforceConfiguration() != null && other.getSalesforceConfiguration().equals(this.getSalesforceConfiguration()) == false)
            return false;
        if (other.getOneDriveConfiguration() == null ^ this.getOneDriveConfiguration() == null)
            return false;
        if (other.getOneDriveConfiguration() != null && other.getOneDriveConfiguration().equals(this.getOneDriveConfiguration()) == false)
            return false;
        if (other.getServiceNowConfiguration() == null ^ this.getServiceNowConfiguration() == null)
            return false;
        if (other.getServiceNowConfiguration() != null && other.getServiceNowConfiguration().equals(this.getServiceNowConfiguration()) == false)
            return false;
        if (other.getConfluenceConfiguration() == null ^ this.getConfluenceConfiguration() == null)
            return false;
        if (other.getConfluenceConfiguration() != null && other.getConfluenceConfiguration().equals(this.getConfluenceConfiguration()) == false)
            return false;
        if (other.getGoogleDriveConfiguration() == null ^ this.getGoogleDriveConfiguration() == null)
            return false;
        if (other.getGoogleDriveConfiguration() != null && other.getGoogleDriveConfiguration().equals(this.getGoogleDriveConfiguration()) == false)
            return false;
        if (other.getWebCrawlerConfiguration() == null ^ this.getWebCrawlerConfiguration() == null)
            return false;
        if (other.getWebCrawlerConfiguration() != null && other.getWebCrawlerConfiguration().equals(this.getWebCrawlerConfiguration()) == false)
            return false;
        if (other.getWorkDocsConfiguration() == null ^ this.getWorkDocsConfiguration() == null)
            return false;
        if (other.getWorkDocsConfiguration() != null && other.getWorkDocsConfiguration().equals(this.getWorkDocsConfiguration()) == false)
            return false;
        if (other.getFsxConfiguration() == null ^ this.getFsxConfiguration() == null)
            return false;
        if (other.getFsxConfiguration() != null && other.getFsxConfiguration().equals(this.getFsxConfiguration()) == false)
            return false;
        if (other.getSlackConfiguration() == null ^ this.getSlackConfiguration() == null)
            return false;
        if (other.getSlackConfiguration() != null && other.getSlackConfiguration().equals(this.getSlackConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Configuration() == null) ? 0 : getS3Configuration().hashCode());
        hashCode = prime * hashCode + ((getSharePointConfiguration() == null) ? 0 : getSharePointConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDatabaseConfiguration() == null) ? 0 : getDatabaseConfiguration().hashCode());
        hashCode = prime * hashCode + ((getSalesforceConfiguration() == null) ? 0 : getSalesforceConfiguration().hashCode());
        hashCode = prime * hashCode + ((getOneDriveConfiguration() == null) ? 0 : getOneDriveConfiguration().hashCode());
        hashCode = prime * hashCode + ((getServiceNowConfiguration() == null) ? 0 : getServiceNowConfiguration().hashCode());
        hashCode = prime * hashCode + ((getConfluenceConfiguration() == null) ? 0 : getConfluenceConfiguration().hashCode());
        hashCode = prime * hashCode + ((getGoogleDriveConfiguration() == null) ? 0 : getGoogleDriveConfiguration().hashCode());
        hashCode = prime * hashCode + ((getWebCrawlerConfiguration() == null) ? 0 : getWebCrawlerConfiguration().hashCode());
        hashCode = prime * hashCode + ((getWorkDocsConfiguration() == null) ? 0 : getWorkDocsConfiguration().hashCode());
        hashCode = prime * hashCode + ((getFsxConfiguration() == null) ? 0 : getFsxConfiguration().hashCode());
        hashCode = prime * hashCode + ((getSlackConfiguration() == null) ? 0 : getSlackConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public DataSourceConfiguration clone() {
        try {
            return (DataSourceConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.DataSourceConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
