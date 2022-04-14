/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.util;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import utils.EnvironmentVariableHelper;

public class TraceIdEnvironmentVariableTest {

    private static final EnvironmentVariableHelper helper = new EnvironmentVariableHelper();

    @Before
    public void restoreOriginal() {
        helper.reset();
    }

    @Test
    public void noEnvSettings_doesNotReturnTraceId() {
        Assert.assertNull(RuntimeHttpUtils.getLambdaEnvironmentTraceId());
    }

    @Test
    public void correctEnvSettings_ReturnsTraceId() {
        helper.set("AWS_LAMBDA_FUNCTION_NAME", "foo");
        helper.set("_X_AMZN_TRACE_ID", "bar");
        Assert.assertEquals("bar", RuntimeHttpUtils.getLambdaEnvironmentTraceId());
    }

    @Test
    public void noLambdaFunctionNameEnv_doesNotReturnTraceId() {
        helper.set("_X_AMZN_TRACE_ID", "bar");
        Assert.assertNull(RuntimeHttpUtils.getLambdaEnvironmentTraceId());
    }

    @Test
    public void noTraceIdEnv_doesNotReturnTraceId() {
        helper.set("AWS_LAMBDA_FUNCTION_NAME", "foo");
        Assert.assertNull(RuntimeHttpUtils.getLambdaEnvironmentTraceId());
    }
}
