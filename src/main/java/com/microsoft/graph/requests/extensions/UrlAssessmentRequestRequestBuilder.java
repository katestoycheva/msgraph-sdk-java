// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IUrlAssessmentRequestRequest;
import com.microsoft.graph.requests.extensions.UrlAssessmentRequestRequest;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Url Assessment Request Request Builder.
 */
public class UrlAssessmentRequestRequestBuilder extends BaseRequestBuilder implements IUrlAssessmentRequestRequestBuilder {

    /**
     * The request builder for the UrlAssessmentRequest
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UrlAssessmentRequestRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IUrlAssessmentRequestRequest instance
     */
    public IUrlAssessmentRequestRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IUrlAssessmentRequestRequest instance
     */
    public IUrlAssessmentRequestRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new UrlAssessmentRequestRequest(getRequestUrl(), getClient(), requestOptions);
    }


}

