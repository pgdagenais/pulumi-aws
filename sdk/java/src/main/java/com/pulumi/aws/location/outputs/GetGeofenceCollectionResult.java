// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.location.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetGeofenceCollectionResult {
    /**
     * @return The Amazon Resource Name (ARN) for the geofence collection resource. Used when you need to specify a resource across all AWS.
     * 
     */
    private final String collectionArn;
    private final String collectionName;
    /**
     * @return The timestamp for when the geofence collection resource was created in ISO 8601 format.
     * 
     */
    private final String createTime;
    /**
     * @return The optional description of the geofence collection resource.
     * 
     */
    private final String description;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return A key identifier for an AWS KMS customer managed key assigned to the Amazon Location resource.
     * 
     */
    private final String kmsKeyId;
    /**
     * @return Key-value map of resource tags for the geofence collection.
     * 
     */
    private final Map<String,String> tags;
    /**
     * @return The timestamp for when the geofence collection resource was last updated in ISO 8601 format.
     * 
     */
    private final String updateTime;

    @CustomType.Constructor
    private GetGeofenceCollectionResult(
        @CustomType.Parameter("collectionArn") String collectionArn,
        @CustomType.Parameter("collectionName") String collectionName,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("kmsKeyId") String kmsKeyId,
        @CustomType.Parameter("tags") Map<String,String> tags,
        @CustomType.Parameter("updateTime") String updateTime) {
        this.collectionArn = collectionArn;
        this.collectionName = collectionName;
        this.createTime = createTime;
        this.description = description;
        this.id = id;
        this.kmsKeyId = kmsKeyId;
        this.tags = tags;
        this.updateTime = updateTime;
    }

    /**
     * @return The Amazon Resource Name (ARN) for the geofence collection resource. Used when you need to specify a resource across all AWS.
     * 
     */
    public String collectionArn() {
        return this.collectionArn;
    }
    public String collectionName() {
        return this.collectionName;
    }
    /**
     * @return The timestamp for when the geofence collection resource was created in ISO 8601 format.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The optional description of the geofence collection resource.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A key identifier for an AWS KMS customer managed key assigned to the Amazon Location resource.
     * 
     */
    public String kmsKeyId() {
        return this.kmsKeyId;
    }
    /**
     * @return Key-value map of resource tags for the geofence collection.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }
    /**
     * @return The timestamp for when the geofence collection resource was last updated in ISO 8601 format.
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGeofenceCollectionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String collectionArn;
        private String collectionName;
        private String createTime;
        private String description;
        private String id;
        private String kmsKeyId;
        private Map<String,String> tags;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGeofenceCollectionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.collectionArn = defaults.collectionArn;
    	      this.collectionName = defaults.collectionName;
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.tags = defaults.tags;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder collectionArn(String collectionArn) {
            this.collectionArn = Objects.requireNonNull(collectionArn);
            return this;
        }
        public Builder collectionName(String collectionName) {
            this.collectionName = Objects.requireNonNull(collectionName);
            return this;
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder kmsKeyId(String kmsKeyId) {
            this.kmsKeyId = Objects.requireNonNull(kmsKeyId);
            return this;
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }        public GetGeofenceCollectionResult build() {
            return new GetGeofenceCollectionResult(collectionArn, collectionName, createTime, description, id, kmsKeyId, tags, updateTime);
        }
    }
}