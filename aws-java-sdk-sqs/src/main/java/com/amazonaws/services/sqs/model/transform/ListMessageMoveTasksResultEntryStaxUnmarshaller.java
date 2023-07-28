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

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.sqs.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * ListMessageMoveTasksResultEntry StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListMessageMoveTasksResultEntryStaxUnmarshaller implements Unmarshaller<ListMessageMoveTasksResultEntry, StaxUnmarshallerContext> {

    public ListMessageMoveTasksResultEntry unmarshall(StaxUnmarshallerContext context) throws Exception {
        ListMessageMoveTasksResultEntry listMessageMoveTasksResultEntry = new ListMessageMoveTasksResultEntry();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return listMessageMoveTasksResultEntry;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("TaskHandle", targetDepth)) {
                    listMessageMoveTasksResultEntry.setTaskHandle(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Status", targetDepth)) {
                    listMessageMoveTasksResultEntry.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SourceArn", targetDepth)) {
                    listMessageMoveTasksResultEntry.setSourceArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DestinationArn", targetDepth)) {
                    listMessageMoveTasksResultEntry.setDestinationArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MaxNumberOfMessagesPerSecond", targetDepth)) {
                    listMessageMoveTasksResultEntry.setMaxNumberOfMessagesPerSecond(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ApproximateNumberOfMessagesMoved", targetDepth)) {
                    listMessageMoveTasksResultEntry.setApproximateNumberOfMessagesMoved(LongStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ApproximateNumberOfMessagesToMove", targetDepth)) {
                    listMessageMoveTasksResultEntry.setApproximateNumberOfMessagesToMove(LongStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("FailureReason", targetDepth)) {
                    listMessageMoveTasksResultEntry.setFailureReason(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("StartedTimestamp", targetDepth)) {
                    listMessageMoveTasksResultEntry.setStartedTimestamp(LongStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return listMessageMoveTasksResultEntry;
                }
            }
        }
    }

    private static ListMessageMoveTasksResultEntryStaxUnmarshaller instance;

    public static ListMessageMoveTasksResultEntryStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListMessageMoveTasksResultEntryStaxUnmarshaller();
        return instance;
    }
}
