// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.AverageComparativeScore;
import com.microsoft.graph.models.extensions.ControlScore;
import com.microsoft.graph.models.extensions.SecurityVendorInformation;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Secure Score.
 */
public class SecureScore extends Entity implements IJsonBackedObject {


    /**
     * The Active User Count.
     * Active user count of the given tenant.
     */
    @SerializedName("activeUserCount")
    @Expose
    public Integer activeUserCount;

    /**
     * The Average Comparative Scores.
     * Average score by different scopes (for example, average by industry, average by seating) and control category (Identity, Data, Device, Apps, Infrastructure) within the scope.
     */
    @SerializedName("averageComparativeScores")
    @Expose
    public java.util.List<AverageComparativeScore> averageComparativeScores;

    /**
     * The Azure Tenant Id.
     * GUID string for tenant ID.
     */
    @SerializedName("azureTenantId")
    @Expose
    public String azureTenantId;

    /**
     * The Control Scores.
     * Contains tenant scores for a set of controls.
     */
    @SerializedName("controlScores")
    @Expose
    public java.util.List<ControlScore> controlScores;

    /**
     * The Created Date Time.
     * The date when the entity is created.
     */
    @SerializedName("createdDateTime")
    @Expose
    public java.util.Calendar createdDateTime;

    /**
     * The Current Score.
     * Tenant current attained score on specified date.
     */
    @SerializedName("currentScore")
    @Expose
    public Double currentScore;

    /**
     * The Enabled Services.
     * Microsoft-provided services for the tenant (for example, Exchange online, Skype, Sharepoint).
     */
    @SerializedName("enabledServices")
    @Expose
    public java.util.List<String> enabledServices;

    /**
     * The Licensed User Count.
     * Licensed user count of the given tenant.
     */
    @SerializedName("licensedUserCount")
    @Expose
    public Integer licensedUserCount;

    /**
     * The Max Score.
     * Tenant maximum possible score on specified date.
     */
    @SerializedName("maxScore")
    @Expose
    public Double maxScore;

    /**
     * The Vendor Information.
     * Complex type containing details about the security product/service vendor, provider, and subprovider (for example, vendor=Microsoft; provider=SecureScore). Required.
     */
    @SerializedName("vendorInformation")
    @Expose
    public SecurityVendorInformation vendorInformation;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}
