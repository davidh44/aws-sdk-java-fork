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
package com.amazonaws.services.sqs.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.sqs.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * ListMessageMoveTasksRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListMessageMoveTasksRequestMarshaller implements Marshaller<Request<ListMessageMoveTasksRequest>, ListMessageMoveTasksRequest> {

    public Request<ListMessageMoveTasksRequest> marshall(ListMessageMoveTasksRequest listMessageMoveTasksRequest) {

        if (listMessageMoveTasksRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListMessageMoveTasksRequest> request = new DefaultRequest<ListMessageMoveTasksRequest>(listMessageMoveTasksRequest, "AmazonSQS");
        request.addParameter("Action", "ListMessageMoveTasks");
        request.addParameter("Version", "2012-11-05");
        request.setHttpMethod(HttpMethodName.POST);

        if (listMessageMoveTasksRequest.getSourceArn() != null) {
            request.addParameter("SourceArn", StringUtils.fromString(listMessageMoveTasksRequest.getSourceArn()));
        }

        if (listMessageMoveTasksRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(listMessageMoveTasksRequest.getMaxResults()));
        }

        return request;
    }

}
