// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Room;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Room Request.
 */
public interface IRoomRequest extends IHttpRequest {

    /**
     * Gets the Room from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<Room> callback);

    /**
     * Gets the Room from the service
     *
     * @return the Room from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Room get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<Room> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this Room with a source
     *
     * @param sourceRoom the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final Room sourceRoom, final ICallback<Room> callback);

    /**
     * Patches this Room with a source
     *
     * @param sourceRoom the source object with updates
     * @return the updated Room
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Room patch(final Room sourceRoom) throws ClientException;

    /**
     * Posts a Room with a new object
     *
     * @param newRoom the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final Room newRoom, final ICallback<Room> callback);

    /**
     * Posts a Room with a new object
     *
     * @param newRoom the new object to create
     * @return the created Room
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Room post(final Room newRoom) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IRoomRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IRoomRequest expand(final String value);

}

