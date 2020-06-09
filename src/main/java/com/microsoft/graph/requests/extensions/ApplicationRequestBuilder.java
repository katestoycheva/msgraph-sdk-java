// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IApplicationRequest;
import com.microsoft.graph.requests.extensions.ApplicationRequest;
import com.microsoft.graph.requests.extensions.IExtensionPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ExtensionPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IExtensionPropertyRequestBuilder;
import com.microsoft.graph.requests.extensions.ExtensionPropertyRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.ITokenLifetimePolicyCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.TokenLifetimePolicyCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.ITokenLifetimePolicyWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.TokenLifetimePolicyWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.ITokenIssuancePolicyCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.TokenIssuancePolicyCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.ITokenIssuancePolicyWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.TokenIssuancePolicyWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IApplicationStreamRequestBuilder;
import com.microsoft.graph.requests.extensions.ApplicationStreamRequestBuilder;
import com.microsoft.graph.models.extensions.KeyCredential;
import com.microsoft.graph.models.extensions.PasswordCredential;
import com.microsoft.graph.requests.extensions.IApplicationAddKeyRequestBuilder;
import com.microsoft.graph.requests.extensions.ApplicationAddKeyRequestBuilder;
import com.microsoft.graph.models.extensions.PasswordCredential;
import com.microsoft.graph.requests.extensions.IApplicationAddPasswordRequestBuilder;
import com.microsoft.graph.requests.extensions.ApplicationAddPasswordRequestBuilder;
import com.microsoft.graph.requests.extensions.IApplicationRemoveKeyRequestBuilder;
import com.microsoft.graph.requests.extensions.ApplicationRemoveKeyRequestBuilder;
import com.microsoft.graph.requests.extensions.IApplicationRemovePasswordRequestBuilder;
import com.microsoft.graph.requests.extensions.ApplicationRemovePasswordRequestBuilder;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Application Request Builder.
 */
public class ApplicationRequestBuilder extends BaseRequestBuilder implements IApplicationRequestBuilder {

    /**
     * The request builder for the Application
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ApplicationRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IApplicationRequest instance
     */
    public IApplicationRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IApplicationRequest instance
     */
    public IApplicationRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new ApplicationRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IExtensionPropertyCollectionRequestBuilder extensionProperties() {
        return new ExtensionPropertyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("extensionProperties"), getClient(), null);
    }

    public IExtensionPropertyRequestBuilder extensionProperties(final String id) {
        return new ExtensionPropertyRequestBuilder(getRequestUrlWithAdditionalSegment("extensionProperties") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for DirectoryObject
     *
     * @return the IDirectoryObjectWithReferenceRequestBuilder instance
     */
    public IDirectoryObjectWithReferenceRequestBuilder createdOnBehalfOf() {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("createdOnBehalfOf"), getClient(), null);
    }
    public IDirectoryObjectCollectionWithReferencesRequestBuilder owners() {
        return new DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("owners"), getClient(), null);
    }

    public IDirectoryObjectWithReferenceRequestBuilder owners(final String id) {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/" + id, getClient(), null);
    }
    public ITokenLifetimePolicyCollectionWithReferencesRequestBuilder tokenLifetimePolicies() {
        return new TokenLifetimePolicyCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("tokenLifetimePolicies"), getClient(), null);
    }

    public ITokenLifetimePolicyWithReferenceRequestBuilder tokenLifetimePolicies(final String id) {
        return new TokenLifetimePolicyWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("tokenLifetimePolicies") + "/" + id, getClient(), null);
    }
    public ITokenIssuancePolicyCollectionWithReferencesRequestBuilder tokenIssuancePolicies() {
        return new TokenIssuancePolicyCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("tokenIssuancePolicies"), getClient(), null);
    }

    public ITokenIssuancePolicyWithReferenceRequestBuilder tokenIssuancePolicies(final String id) {
        return new TokenIssuancePolicyWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("tokenIssuancePolicies") + "/" + id, getClient(), null);
    }

    public IApplicationStreamRequestBuilder logo() {
        return new ApplicationStreamRequestBuilder(getRequestUrlWithAdditionalSegment("logo"), getClient(), null);
    }

    public IApplicationAddKeyRequestBuilder addKey(final KeyCredential keyCredential, final PasswordCredential passwordCredential, final String proof) {
        return new ApplicationAddKeyRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.addKey"), getClient(), null, keyCredential, passwordCredential, proof);
    }

    public IApplicationAddPasswordRequestBuilder addPassword(final PasswordCredential passwordCredential) {
        return new ApplicationAddPasswordRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.addPassword"), getClient(), null, passwordCredential);
    }

    public IApplicationRemoveKeyRequestBuilder removeKey(final java.util.UUID keyId, final String proof) {
        return new ApplicationRemoveKeyRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.removeKey"), getClient(), null, keyId, proof);
    }

    public IApplicationRemovePasswordRequestBuilder removePassword(final java.util.UUID keyId) {
        return new ApplicationRemovePasswordRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.removePassword"), getClient(), null, keyId);
    }
}

