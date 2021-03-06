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
 * The class for the Application Delta Collection Request.
 */
public class ApplicationDeltaCollectionRequest extends BaseCollectionRequest<ApplicationDeltaCollectionResponse, IApplicationDeltaCollectionPage> implements IApplicationDeltaCollectionRequest {


    /**
     * The request for this ApplicationDelta
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ApplicationDeltaCollectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, ApplicationDeltaCollectionResponse.class, IApplicationDeltaCollectionPage.class);
    }


    public void get(final ICallback<IApplicationDeltaCollectionPage> callback) {
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

    public IApplicationDeltaCollectionPage get() throws ClientException {
        final ApplicationDeltaCollectionResponse response = send();
        return buildFromResponse(response);
    }


    public IApplicationDeltaCollectionPage buildFromResponse(final ApplicationDeltaCollectionResponse response) {
        final IApplicationDeltaCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new ApplicationDeltaCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final IApplicationDeltaCollectionPage page = new ApplicationDeltaCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IApplicationDeltaCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (IApplicationDeltaCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IApplicationDeltaCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value+""));
        return (IApplicationDeltaCollectionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IApplicationDeltaCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (IApplicationDeltaCollectionRequest)this;
    }

}
