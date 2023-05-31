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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/AssociatePrincipalWithPortfolio"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociatePrincipalWithPortfolioRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     */
    private String acceptLanguage;
    /**
     * <p>
     * The portfolio identifier.
     * </p>
     */
    private String portfolioId;
    /**
     * <p>
     * The ARN of the principal (user, role, or group). The supported value is a fully defined <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns">
     * <code>IAM</code> ARN</a> if the <code>PrincipalType</code> is <code>IAM</code>. If the <code>PrincipalType</code>
     * is <code>IAM_PATTERN</code>, the supported value is an <code>IAM</code> ARN without an AccountID in the following
     * format:
     * </p>
     * <p>
     * <i>arn:partition:iam:::resource-type/resource-id</i>
     * </p>
     * <p>
     * The resource-id can be either of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Fully formed, for example <i>arn:aws:iam:::role/resource-name</i> or
     * <i>arn:aws:iam:::role/resource-path/resource-name</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * A wildcard ARN. The wildcard ARN accepts <code>IAM_PATTERN</code> values with a "*" or "?" in the resource-id
     * segment of the ARN, for example <i>arn:partition:service:::resource-type/resource-path/resource-name</i>. The new
     * symbols are exclusive to the <b>resource-path</b> and <b>resource-name</b> and cannot be used to replace the
     * <b>resource-type</b> or other ARN values.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Examples of an <b>acceptable</b> wildcard ARN:
     * </p>
     * <ul>
     * <li>
     * <p>
     * arn:aws:iam:::role/ResourceName_*
     * </p>
     * </li>
     * <li>
     * <p>
     * arn:aws:iam:::role/*&#47;ResourceName_?
     * </p>
     * </li>
     * </ul>
     * <p>
     * Examples of an <b>unacceptable</b> wildcard ARN:
     * </p>
     * <ul>
     * <li>
     * <p>
     * arn:aws:iam:::*&#47;ResourceName
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can associate multiple <code>IAM_PATTERN</code>s even if the account has no principal with that name.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * The ARN path and principal name allow unlimited wildcard characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * The "?" wildcard character matches zero or one of any character. This is similar to ".?" in regular regex
     * context.
     * </p>
     * </li>
     * <li>
     * <p>
     * The "*" wildcard character matches any number of any characters. This is similar ".*" in regular regex context.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the IAM Principal ARNs format (arn:partition:iam:::resource-type/resource-path/resource-name), valid
     * <b>resource-type</b> values include user/, group/, or role/. The "?" and "*" are allowed only after the
     * <b>resource-type</b>, in the resource-id segment. You can use special characters anywhere within the
     * <b>resource-id</b>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The "*" also matches the "/" character, allowing paths to be formed within the <b>resource-id</b>. For example,
     * arn:aws:iam:::role/*&#47;ResourceName_? matches both arn:aws:iam:::role/pathA/pathB/ResourceName_1 and
     * arn:aws:iam:::role/pathA/ResourceName_1.
     * </p>
     * </li>
     * </ul>
     * </note>
     */
    private String principalARN;
    /**
     * <p>
     * The principal type. The supported value is <code>IAM</code> if you use a fully defined ARN, or
     * <code>IAM_PATTERN</code> if you use an ARN with no <code>accountID</code>, with or without wildcard characters.
     * </p>
     */
    private String principalType;

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     * 
     * @param acceptLanguage
     *        The language code.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>jp</code> - Japanese
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>zh</code> - Chinese
     *        </p>
     *        </li>
     */

    public void setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     * 
     * @return The language code.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>jp</code> - Japanese
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>zh</code> - Chinese
     *         </p>
     *         </li>
     */

    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     * 
     * @param acceptLanguage
     *        The language code.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>jp</code> - Japanese
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>zh</code> - Chinese
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociatePrincipalWithPortfolioRequest withAcceptLanguage(String acceptLanguage) {
        setAcceptLanguage(acceptLanguage);
        return this;
    }

    /**
     * <p>
     * The portfolio identifier.
     * </p>
     * 
     * @param portfolioId
     *        The portfolio identifier.
     */

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    /**
     * <p>
     * The portfolio identifier.
     * </p>
     * 
     * @return The portfolio identifier.
     */

    public String getPortfolioId() {
        return this.portfolioId;
    }

    /**
     * <p>
     * The portfolio identifier.
     * </p>
     * 
     * @param portfolioId
     *        The portfolio identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociatePrincipalWithPortfolioRequest withPortfolioId(String portfolioId) {
        setPortfolioId(portfolioId);
        return this;
    }

    /**
     * <p>
     * The ARN of the principal (user, role, or group). The supported value is a fully defined <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns">
     * <code>IAM</code> ARN</a> if the <code>PrincipalType</code> is <code>IAM</code>. If the <code>PrincipalType</code>
     * is <code>IAM_PATTERN</code>, the supported value is an <code>IAM</code> ARN without an AccountID in the following
     * format:
     * </p>
     * <p>
     * <i>arn:partition:iam:::resource-type/resource-id</i>
     * </p>
     * <p>
     * The resource-id can be either of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Fully formed, for example <i>arn:aws:iam:::role/resource-name</i> or
     * <i>arn:aws:iam:::role/resource-path/resource-name</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * A wildcard ARN. The wildcard ARN accepts <code>IAM_PATTERN</code> values with a "*" or "?" in the resource-id
     * segment of the ARN, for example <i>arn:partition:service:::resource-type/resource-path/resource-name</i>. The new
     * symbols are exclusive to the <b>resource-path</b> and <b>resource-name</b> and cannot be used to replace the
     * <b>resource-type</b> or other ARN values.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Examples of an <b>acceptable</b> wildcard ARN:
     * </p>
     * <ul>
     * <li>
     * <p>
     * arn:aws:iam:::role/ResourceName_*
     * </p>
     * </li>
     * <li>
     * <p>
     * arn:aws:iam:::role/*&#47;ResourceName_?
     * </p>
     * </li>
     * </ul>
     * <p>
     * Examples of an <b>unacceptable</b> wildcard ARN:
     * </p>
     * <ul>
     * <li>
     * <p>
     * arn:aws:iam:::*&#47;ResourceName
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can associate multiple <code>IAM_PATTERN</code>s even if the account has no principal with that name.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * The ARN path and principal name allow unlimited wildcard characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * The "?" wildcard character matches zero or one of any character. This is similar to ".?" in regular regex
     * context.
     * </p>
     * </li>
     * <li>
     * <p>
     * The "*" wildcard character matches any number of any characters. This is similar ".*" in regular regex context.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the IAM Principal ARNs format (arn:partition:iam:::resource-type/resource-path/resource-name), valid
     * <b>resource-type</b> values include user/, group/, or role/. The "?" and "*" are allowed only after the
     * <b>resource-type</b>, in the resource-id segment. You can use special characters anywhere within the
     * <b>resource-id</b>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The "*" also matches the "/" character, allowing paths to be formed within the <b>resource-id</b>. For example,
     * arn:aws:iam:::role/*&#47;ResourceName_? matches both arn:aws:iam:::role/pathA/pathB/ResourceName_1 and
     * arn:aws:iam:::role/pathA/ResourceName_1.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param principalARN
     *        The ARN of the principal (user, role, or group). The supported value is a fully defined <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns">
     *        <code>IAM</code> ARN</a> if the <code>PrincipalType</code> is <code>IAM</code>. If the
     *        <code>PrincipalType</code> is <code>IAM_PATTERN</code>, the supported value is an <code>IAM</code> ARN
     *        without an AccountID in the following format:</p>
     *        <p>
     *        <i>arn:partition:iam:::resource-type/resource-id</i>
     *        </p>
     *        <p>
     *        The resource-id can be either of the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Fully formed, for example <i>arn:aws:iam:::role/resource-name</i> or
     *        <i>arn:aws:iam:::role/resource-path/resource-name</i>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A wildcard ARN. The wildcard ARN accepts <code>IAM_PATTERN</code> values with a "*" or "?" in the
     *        resource-id segment of the ARN, for example
     *        <i>arn:partition:service:::resource-type/resource-path/resource-name</i>. The new symbols are exclusive to
     *        the <b>resource-path</b> and <b>resource-name</b> and cannot be used to replace the <b>resource-type</b>
     *        or other ARN values.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Examples of an <b>acceptable</b> wildcard ARN:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        arn:aws:iam:::role/ResourceName_*
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        arn:aws:iam:::role/*&#47;ResourceName_?
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Examples of an <b>unacceptable</b> wildcard ARN:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        arn:aws:iam:::*&#47;ResourceName
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You can associate multiple <code>IAM_PATTERN</code>s even if the account has no principal with that name.
     *        </p>
     *        <note>
     *        <ul>
     *        <li>
     *        <p>
     *        The ARN path and principal name allow unlimited wildcard characters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The "?" wildcard character matches zero or one of any character. This is similar to ".?" in regular regex
     *        context.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The "*" wildcard character matches any number of any characters. This is similar ".*" in regular regex
     *        context.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In the IAM Principal ARNs format (arn:partition:iam:::resource-type/resource-path/resource-name), valid
     *        <b>resource-type</b> values include user/, group/, or role/. The "?" and "*" are allowed only after the
     *        <b>resource-type</b>, in the resource-id segment. You can use special characters anywhere within the
     *        <b>resource-id</b>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The "*" also matches the "/" character, allowing paths to be formed within the <b>resource-id</b>. For
     *        example, arn:aws:iam:::role/*&#47;ResourceName_? matches both
     *        arn:aws:iam:::role/pathA/pathB/ResourceName_1 and arn:aws:iam:::role/pathA/ResourceName_1.
     *        </p>
     *        </li>
     *        </ul>
     */

    public void setPrincipalARN(String principalARN) {
        this.principalARN = principalARN;
    }

    /**
     * <p>
     * The ARN of the principal (user, role, or group). The supported value is a fully defined <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns">
     * <code>IAM</code> ARN</a> if the <code>PrincipalType</code> is <code>IAM</code>. If the <code>PrincipalType</code>
     * is <code>IAM_PATTERN</code>, the supported value is an <code>IAM</code> ARN without an AccountID in the following
     * format:
     * </p>
     * <p>
     * <i>arn:partition:iam:::resource-type/resource-id</i>
     * </p>
     * <p>
     * The resource-id can be either of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Fully formed, for example <i>arn:aws:iam:::role/resource-name</i> or
     * <i>arn:aws:iam:::role/resource-path/resource-name</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * A wildcard ARN. The wildcard ARN accepts <code>IAM_PATTERN</code> values with a "*" or "?" in the resource-id
     * segment of the ARN, for example <i>arn:partition:service:::resource-type/resource-path/resource-name</i>. The new
     * symbols are exclusive to the <b>resource-path</b> and <b>resource-name</b> and cannot be used to replace the
     * <b>resource-type</b> or other ARN values.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Examples of an <b>acceptable</b> wildcard ARN:
     * </p>
     * <ul>
     * <li>
     * <p>
     * arn:aws:iam:::role/ResourceName_*
     * </p>
     * </li>
     * <li>
     * <p>
     * arn:aws:iam:::role/*&#47;ResourceName_?
     * </p>
     * </li>
     * </ul>
     * <p>
     * Examples of an <b>unacceptable</b> wildcard ARN:
     * </p>
     * <ul>
     * <li>
     * <p>
     * arn:aws:iam:::*&#47;ResourceName
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can associate multiple <code>IAM_PATTERN</code>s even if the account has no principal with that name.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * The ARN path and principal name allow unlimited wildcard characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * The "?" wildcard character matches zero or one of any character. This is similar to ".?" in regular regex
     * context.
     * </p>
     * </li>
     * <li>
     * <p>
     * The "*" wildcard character matches any number of any characters. This is similar ".*" in regular regex context.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the IAM Principal ARNs format (arn:partition:iam:::resource-type/resource-path/resource-name), valid
     * <b>resource-type</b> values include user/, group/, or role/. The "?" and "*" are allowed only after the
     * <b>resource-type</b>, in the resource-id segment. You can use special characters anywhere within the
     * <b>resource-id</b>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The "*" also matches the "/" character, allowing paths to be formed within the <b>resource-id</b>. For example,
     * arn:aws:iam:::role/*&#47;ResourceName_? matches both arn:aws:iam:::role/pathA/pathB/ResourceName_1 and
     * arn:aws:iam:::role/pathA/ResourceName_1.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @return The ARN of the principal (user, role, or group). The supported value is a fully defined <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns">
     *         <code>IAM</code> ARN</a> if the <code>PrincipalType</code> is <code>IAM</code>. If the
     *         <code>PrincipalType</code> is <code>IAM_PATTERN</code>, the supported value is an <code>IAM</code> ARN
     *         without an AccountID in the following format:</p>
     *         <p>
     *         <i>arn:partition:iam:::resource-type/resource-id</i>
     *         </p>
     *         <p>
     *         The resource-id can be either of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Fully formed, for example <i>arn:aws:iam:::role/resource-name</i> or
     *         <i>arn:aws:iam:::role/resource-path/resource-name</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A wildcard ARN. The wildcard ARN accepts <code>IAM_PATTERN</code> values with a "*" or "?" in the
     *         resource-id segment of the ARN, for example
     *         <i>arn:partition:service:::resource-type/resource-path/resource-name</i>. The new symbols are exclusive
     *         to the <b>resource-path</b> and <b>resource-name</b> and cannot be used to replace the
     *         <b>resource-type</b> or other ARN values.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Examples of an <b>acceptable</b> wildcard ARN:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         arn:aws:iam:::role/ResourceName_*
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         arn:aws:iam:::role/*&#47;ResourceName_?
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Examples of an <b>unacceptable</b> wildcard ARN:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         arn:aws:iam:::*&#47;ResourceName
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         You can associate multiple <code>IAM_PATTERN</code>s even if the account has no principal with that name.
     *         </p>
     *         <note>
     *         <ul>
     *         <li>
     *         <p>
     *         The ARN path and principal name allow unlimited wildcard characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The "?" wildcard character matches zero or one of any character. This is similar to ".?" in regular regex
     *         context.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The "*" wildcard character matches any number of any characters. This is similar ".*" in regular regex
     *         context.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         In the IAM Principal ARNs format (arn:partition:iam:::resource-type/resource-path/resource-name), valid
     *         <b>resource-type</b> values include user/, group/, or role/. The "?" and "*" are allowed only after the
     *         <b>resource-type</b>, in the resource-id segment. You can use special characters anywhere within the
     *         <b>resource-id</b>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The "*" also matches the "/" character, allowing paths to be formed within the <b>resource-id</b>. For
     *         example, arn:aws:iam:::role/*&#47;ResourceName_? matches both
     *         arn:aws:iam:::role/pathA/pathB/ResourceName_1 and arn:aws:iam:::role/pathA/ResourceName_1.
     *         </p>
     *         </li>
     *         </ul>
     */

    public String getPrincipalARN() {
        return this.principalARN;
    }

    /**
     * <p>
     * The ARN of the principal (user, role, or group). The supported value is a fully defined <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns">
     * <code>IAM</code> ARN</a> if the <code>PrincipalType</code> is <code>IAM</code>. If the <code>PrincipalType</code>
     * is <code>IAM_PATTERN</code>, the supported value is an <code>IAM</code> ARN without an AccountID in the following
     * format:
     * </p>
     * <p>
     * <i>arn:partition:iam:::resource-type/resource-id</i>
     * </p>
     * <p>
     * The resource-id can be either of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Fully formed, for example <i>arn:aws:iam:::role/resource-name</i> or
     * <i>arn:aws:iam:::role/resource-path/resource-name</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * A wildcard ARN. The wildcard ARN accepts <code>IAM_PATTERN</code> values with a "*" or "?" in the resource-id
     * segment of the ARN, for example <i>arn:partition:service:::resource-type/resource-path/resource-name</i>. The new
     * symbols are exclusive to the <b>resource-path</b> and <b>resource-name</b> and cannot be used to replace the
     * <b>resource-type</b> or other ARN values.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Examples of an <b>acceptable</b> wildcard ARN:
     * </p>
     * <ul>
     * <li>
     * <p>
     * arn:aws:iam:::role/ResourceName_*
     * </p>
     * </li>
     * <li>
     * <p>
     * arn:aws:iam:::role/*&#47;ResourceName_?
     * </p>
     * </li>
     * </ul>
     * <p>
     * Examples of an <b>unacceptable</b> wildcard ARN:
     * </p>
     * <ul>
     * <li>
     * <p>
     * arn:aws:iam:::*&#47;ResourceName
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can associate multiple <code>IAM_PATTERN</code>s even if the account has no principal with that name.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * The ARN path and principal name allow unlimited wildcard characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * The "?" wildcard character matches zero or one of any character. This is similar to ".?" in regular regex
     * context.
     * </p>
     * </li>
     * <li>
     * <p>
     * The "*" wildcard character matches any number of any characters. This is similar ".*" in regular regex context.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the IAM Principal ARNs format (arn:partition:iam:::resource-type/resource-path/resource-name), valid
     * <b>resource-type</b> values include user/, group/, or role/. The "?" and "*" are allowed only after the
     * <b>resource-type</b>, in the resource-id segment. You can use special characters anywhere within the
     * <b>resource-id</b>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The "*" also matches the "/" character, allowing paths to be formed within the <b>resource-id</b>. For example,
     * arn:aws:iam:::role/*&#47;ResourceName_? matches both arn:aws:iam:::role/pathA/pathB/ResourceName_1 and
     * arn:aws:iam:::role/pathA/ResourceName_1.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param principalARN
     *        The ARN of the principal (user, role, or group). The supported value is a fully defined <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns">
     *        <code>IAM</code> ARN</a> if the <code>PrincipalType</code> is <code>IAM</code>. If the
     *        <code>PrincipalType</code> is <code>IAM_PATTERN</code>, the supported value is an <code>IAM</code> ARN
     *        without an AccountID in the following format:</p>
     *        <p>
     *        <i>arn:partition:iam:::resource-type/resource-id</i>
     *        </p>
     *        <p>
     *        The resource-id can be either of the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Fully formed, for example <i>arn:aws:iam:::role/resource-name</i> or
     *        <i>arn:aws:iam:::role/resource-path/resource-name</i>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A wildcard ARN. The wildcard ARN accepts <code>IAM_PATTERN</code> values with a "*" or "?" in the
     *        resource-id segment of the ARN, for example
     *        <i>arn:partition:service:::resource-type/resource-path/resource-name</i>. The new symbols are exclusive to
     *        the <b>resource-path</b> and <b>resource-name</b> and cannot be used to replace the <b>resource-type</b>
     *        or other ARN values.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Examples of an <b>acceptable</b> wildcard ARN:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        arn:aws:iam:::role/ResourceName_*
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        arn:aws:iam:::role/*&#47;ResourceName_?
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Examples of an <b>unacceptable</b> wildcard ARN:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        arn:aws:iam:::*&#47;ResourceName
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You can associate multiple <code>IAM_PATTERN</code>s even if the account has no principal with that name.
     *        </p>
     *        <note>
     *        <ul>
     *        <li>
     *        <p>
     *        The ARN path and principal name allow unlimited wildcard characters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The "?" wildcard character matches zero or one of any character. This is similar to ".?" in regular regex
     *        context.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The "*" wildcard character matches any number of any characters. This is similar ".*" in regular regex
     *        context.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In the IAM Principal ARNs format (arn:partition:iam:::resource-type/resource-path/resource-name), valid
     *        <b>resource-type</b> values include user/, group/, or role/. The "?" and "*" are allowed only after the
     *        <b>resource-type</b>, in the resource-id segment. You can use special characters anywhere within the
     *        <b>resource-id</b>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The "*" also matches the "/" character, allowing paths to be formed within the <b>resource-id</b>. For
     *        example, arn:aws:iam:::role/*&#47;ResourceName_? matches both
     *        arn:aws:iam:::role/pathA/pathB/ResourceName_1 and arn:aws:iam:::role/pathA/ResourceName_1.
     *        </p>
     *        </li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociatePrincipalWithPortfolioRequest withPrincipalARN(String principalARN) {
        setPrincipalARN(principalARN);
        return this;
    }

    /**
     * <p>
     * The principal type. The supported value is <code>IAM</code> if you use a fully defined ARN, or
     * <code>IAM_PATTERN</code> if you use an ARN with no <code>accountID</code>, with or without wildcard characters.
     * </p>
     * 
     * @param principalType
     *        The principal type. The supported value is <code>IAM</code> if you use a fully defined ARN, or
     *        <code>IAM_PATTERN</code> if you use an ARN with no <code>accountID</code>, with or without wildcard
     *        characters.
     * @see PrincipalType
     */

    public void setPrincipalType(String principalType) {
        this.principalType = principalType;
    }

    /**
     * <p>
     * The principal type. The supported value is <code>IAM</code> if you use a fully defined ARN, or
     * <code>IAM_PATTERN</code> if you use an ARN with no <code>accountID</code>, with or without wildcard characters.
     * </p>
     * 
     * @return The principal type. The supported value is <code>IAM</code> if you use a fully defined ARN, or
     *         <code>IAM_PATTERN</code> if you use an ARN with no <code>accountID</code>, with or without wildcard
     *         characters.
     * @see PrincipalType
     */

    public String getPrincipalType() {
        return this.principalType;
    }

    /**
     * <p>
     * The principal type. The supported value is <code>IAM</code> if you use a fully defined ARN, or
     * <code>IAM_PATTERN</code> if you use an ARN with no <code>accountID</code>, with or without wildcard characters.
     * </p>
     * 
     * @param principalType
     *        The principal type. The supported value is <code>IAM</code> if you use a fully defined ARN, or
     *        <code>IAM_PATTERN</code> if you use an ARN with no <code>accountID</code>, with or without wildcard
     *        characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PrincipalType
     */

    public AssociatePrincipalWithPortfolioRequest withPrincipalType(String principalType) {
        setPrincipalType(principalType);
        return this;
    }

    /**
     * <p>
     * The principal type. The supported value is <code>IAM</code> if you use a fully defined ARN, or
     * <code>IAM_PATTERN</code> if you use an ARN with no <code>accountID</code>, with or without wildcard characters.
     * </p>
     * 
     * @param principalType
     *        The principal type. The supported value is <code>IAM</code> if you use a fully defined ARN, or
     *        <code>IAM_PATTERN</code> if you use an ARN with no <code>accountID</code>, with or without wildcard
     *        characters.
     * @see PrincipalType
     */

    public void setPrincipalType(PrincipalType principalType) {
        withPrincipalType(principalType);
    }

    /**
     * <p>
     * The principal type. The supported value is <code>IAM</code> if you use a fully defined ARN, or
     * <code>IAM_PATTERN</code> if you use an ARN with no <code>accountID</code>, with or without wildcard characters.
     * </p>
     * 
     * @param principalType
     *        The principal type. The supported value is <code>IAM</code> if you use a fully defined ARN, or
     *        <code>IAM_PATTERN</code> if you use an ARN with no <code>accountID</code>, with or without wildcard
     *        characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PrincipalType
     */

    public AssociatePrincipalWithPortfolioRequest withPrincipalType(PrincipalType principalType) {
        this.principalType = principalType.toString();
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
        if (getAcceptLanguage() != null)
            sb.append("AcceptLanguage: ").append(getAcceptLanguage()).append(",");
        if (getPortfolioId() != null)
            sb.append("PortfolioId: ").append(getPortfolioId()).append(",");
        if (getPrincipalARN() != null)
            sb.append("PrincipalARN: ").append(getPrincipalARN()).append(",");
        if (getPrincipalType() != null)
            sb.append("PrincipalType: ").append(getPrincipalType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociatePrincipalWithPortfolioRequest == false)
            return false;
        AssociatePrincipalWithPortfolioRequest other = (AssociatePrincipalWithPortfolioRequest) obj;
        if (other.getAcceptLanguage() == null ^ this.getAcceptLanguage() == null)
            return false;
        if (other.getAcceptLanguage() != null && other.getAcceptLanguage().equals(this.getAcceptLanguage()) == false)
            return false;
        if (other.getPortfolioId() == null ^ this.getPortfolioId() == null)
            return false;
        if (other.getPortfolioId() != null && other.getPortfolioId().equals(this.getPortfolioId()) == false)
            return false;
        if (other.getPrincipalARN() == null ^ this.getPrincipalARN() == null)
            return false;
        if (other.getPrincipalARN() != null && other.getPrincipalARN().equals(this.getPrincipalARN()) == false)
            return false;
        if (other.getPrincipalType() == null ^ this.getPrincipalType() == null)
            return false;
        if (other.getPrincipalType() != null && other.getPrincipalType().equals(this.getPrincipalType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAcceptLanguage() == null) ? 0 : getAcceptLanguage().hashCode());
        hashCode = prime * hashCode + ((getPortfolioId() == null) ? 0 : getPortfolioId().hashCode());
        hashCode = prime * hashCode + ((getPrincipalARN() == null) ? 0 : getPrincipalARN().hashCode());
        hashCode = prime * hashCode + ((getPrincipalType() == null) ? 0 : getPrincipalType().hashCode());
        return hashCode;
    }

    @Override
    public AssociatePrincipalWithPortfolioRequest clone() {
        return (AssociatePrincipalWithPortfolioRequest) super.clone();
    }

}
