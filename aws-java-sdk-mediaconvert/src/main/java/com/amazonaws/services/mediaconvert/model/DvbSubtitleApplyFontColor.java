/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mediaconvert.model;

import javax.annotation.Generated;

/**
 * Ignore this setting unless your input captions are STL, any type of 608, teletext, or TTML, and your output captions
 * are DVB-SUB. Specify how the service applies the color specified in the setting Font color (DvbSubtitleFontColor). By
 * default, this color is white. When you choose WHITE_TEXT_ONLY, the service uses the specified font color only for
 * text that is white in the input. When you choose ALL_TEXT, the service uses the specified font color for all output
 * captions text. If you leave both settings at their default value, your output font color is the same as your input
 * font color.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum DvbSubtitleApplyFontColor {

    WHITE_TEXT_ONLY("WHITE_TEXT_ONLY"),
    ALL_TEXT("ALL_TEXT");

    private String value;

    private DvbSubtitleApplyFontColor(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *        real value
     * @return DvbSubtitleApplyFontColor corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static DvbSubtitleApplyFontColor fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (DvbSubtitleApplyFontColor enumEntry : DvbSubtitleApplyFontColor.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
