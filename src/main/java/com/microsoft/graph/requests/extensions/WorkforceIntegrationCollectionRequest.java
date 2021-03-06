// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workforce Integration Collection Request.
 */
public class WorkforceIntegrationCollectionRequest extends BaseCollectionRequest<WorkforceIntegrationCollectionResponse, IWorkforceIntegrationCollectionPage> implements IWorkforceIntegrationCollectionRequest {

    /**
     * The request builder for this collection of WorkforceIntegration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkforceIntegrationCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkforceIntegrationCollectionResponse.class, IWorkforceIntegrationCollectionPage.class);
    }

    public void get(final ICallback<IWorkforceIntegrationCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IWorkforceIntegrationCollectionPage get() throws ClientException {
        final WorkforceIntegrationCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final WorkforceIntegration newWorkforceIntegration, final ICallback<WorkforceIntegration> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new WorkforceIntegrationRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newWorkforceIntegration, callback);
    }

    public WorkforceIntegration post(final WorkforceIntegration newWorkforceIntegration) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new WorkforceIntegrationRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newWorkforceIntegration);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IWorkforceIntegrationCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (WorkforceIntegrationCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IWorkforceIntegrationCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (WorkforceIntegrationCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IWorkforceIntegrationCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (WorkforceIntegrationCollectionRequest)this;
    }

    public IWorkforceIntegrationCollectionPage buildFromResponse(final WorkforceIntegrationCollectionResponse response) {
        final IWorkforceIntegrationCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new WorkforceIntegrationCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final WorkforceIntegrationCollectionPage page = new WorkforceIntegrationCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
