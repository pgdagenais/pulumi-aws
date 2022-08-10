// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lakeformation.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PermissionsDataLocation {
    /**
     * @return Amazon Resource Name (ARN) that uniquely identifies the data location resource.
     * 
     */
    private final String arn;
    /**
     * @return Identifier for the Data Catalog. By default, it is the account ID of the caller.
     * 
     */
    private final @Nullable String catalogId;

    @CustomType.Constructor
    private PermissionsDataLocation(
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("catalogId") @Nullable String catalogId) {
        this.arn = arn;
        this.catalogId = catalogId;
    }

    /**
     * @return Amazon Resource Name (ARN) that uniquely identifies the data location resource.
     * 
     */
    public String arn() {
        return this.arn;
    }
    /**
     * @return Identifier for the Data Catalog. By default, it is the account ID of the caller.
     * 
     */
    public Optional<String> catalogId() {
        return Optional.ofNullable(this.catalogId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PermissionsDataLocation defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private @Nullable String catalogId;

        public Builder() {
    	      // Empty
        }

        public Builder(PermissionsDataLocation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.catalogId = defaults.catalogId;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder catalogId(@Nullable String catalogId) {
            this.catalogId = catalogId;
            return this;
        }        public PermissionsDataLocation build() {
            return new PermissionsDataLocation(arn, catalogId);
        }
    }
}