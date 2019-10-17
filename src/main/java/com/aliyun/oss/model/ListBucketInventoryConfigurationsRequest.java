/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.aliyun.oss.model;

/**
 * Request object to list inventory configurations of a bucket.
 */
public class ListBucketInventoryConfigurationsRequest extends GenericRequest {

    /** The name of the bucket to list the inventory configurations. */
    private String bucketName;

    /**
     * Optional parameter which allows list to be continued from a specific point.
     * ContinuationToken is provided in truncated list results.
     */
    private String continuationToken;

    public ListBucketInventoryConfigurationsRequest () {};

    public ListBucketInventoryConfigurationsRequest(String bucketName) {
        this.bucketName = bucketName;
    }

    public ListBucketInventoryConfigurationsRequest(String bucketName, String continuationToken) {
        this.bucketName = bucketName;
        this.continuationToken = continuationToken;
    }

    /**
     * Gets the name of the bucket whose
     * inventory configurations are to be listed.
     *
     * @return The name of the bucket whose
     *         inventory configurations are to be listed.
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * Sets the name of the  bucket whose inventory configurations are to be listed.
     *
     * @param bucketName
     *            The name of the bucket whose inventory configurations are to be listed.
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * Sets the name of the bucket whose inventory configurations are to be listed.
     *
     * @param bucketName
     *            The name of the  bucket whose inventory configurations are to be listed.
     *
     * @return The {@link ListBucketInventoryConfigurationsRequest} object itself.
     */
    public ListBucketInventoryConfigurationsRequest withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * Gets the optional continuation token.  Continuation token allows a list to be
     * continued from a specific point. ContinuationToken is provided in truncated list results.
     *
     * @return The optional continuation token associated with this request.
     */
    public String getContinuationToken() {
        return continuationToken;
    }

    /**
     * Sets the optional continuation token.  Continuation token allows a list to be
     * continued from a specific point. ContinuationToken is provided in truncated list results.
     *
     * @param continuationToken
     *                     The optional continuation token to associate with this request.
     */
    public void setContinuationToken(String continuationToken) {
        this.continuationToken = continuationToken;
    }

    /**
     * Sets the optional continuation token.  Continuation token allows a list to be
     * continued from a specific point. ContinuationToken is provided in truncated list results.
     *
     * @param continuationToken
     *                     The optional continuation token to associate with this request.
     *
     * @return The {@link ListBucketInventoryConfigurationsRequest} object itself.
     */
    public ListBucketInventoryConfigurationsRequest withContinuationToken(String continuationToken) {
        setContinuationToken(continuationToken);
        return this;
    }
}