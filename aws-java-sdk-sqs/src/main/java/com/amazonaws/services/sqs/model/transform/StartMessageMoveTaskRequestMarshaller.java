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
 * StartMessageMoveTaskRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartMessageMoveTaskRequestMarshaller implements Marshaller<Request<StartMessageMoveTaskRequest>, StartMessageMoveTaskRequest> {

    public Request<StartMessageMoveTaskRequest> marshall(StartMessageMoveTaskRequest startMessageMoveTaskRequest) {

        if (startMessageMoveTaskRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<StartMessageMoveTaskRequest> request = new DefaultRequest<StartMessageMoveTaskRequest>(startMessageMoveTaskRequest, "AmazonSQS");
        request.addParameter("Action", "StartMessageMoveTask");
        request.addParameter("Version", "2012-11-05");
        request.setHttpMethod(HttpMethodName.POST);

        if (startMessageMoveTaskRequest.getSourceArn() != null) {
            request.addParameter("SourceArn", StringUtils.fromString(startMessageMoveTaskRequest.getSourceArn()));
        }

        if (startMessageMoveTaskRequest.getDestinationArn() != null) {
            request.addParameter("DestinationArn", StringUtils.fromString(startMessageMoveTaskRequest.getDestinationArn()));
        }

        if (startMessageMoveTaskRequest.getMaxNumberOfMessagesPerSecond() != null) {
            request.addParameter("MaxNumberOfMessagesPerSecond", StringUtils.fromInteger(startMessageMoveTaskRequest.getMaxNumberOfMessagesPerSecond()));
        }

        return request;
    }

}
