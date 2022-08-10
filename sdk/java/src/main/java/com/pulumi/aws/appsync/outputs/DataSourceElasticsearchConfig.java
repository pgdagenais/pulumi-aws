// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appsync.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DataSourceElasticsearchConfig {
    /**
     * @return HTTP URL.
     * 
     */
    private final String endpoint;
    /**
     * @return AWS Region for RDS HTTP endpoint. Defaults to current region.
     * 
     */
    private final @Nullable String region;

    @CustomType.Constructor
    private DataSourceElasticsearchConfig(
        @CustomType.Parameter("endpoint") String endpoint,
        @CustomType.Parameter("region") @Nullable String region) {
        this.endpoint = endpoint;
        this.region = region;
    }

    /**
     * @return HTTP URL.
     * 
     */
    public String endpoint() {
        return this.endpoint;
    }
    /**
     * @return AWS Region for RDS HTTP endpoint. Defaults to current region.
     * 
     */
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceElasticsearchConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endpoint;
        private @Nullable String region;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceElasticsearchConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpoint = defaults.endpoint;
    	      this.region = defaults.region;
        }

        public Builder endpoint(String endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }
        public Builder region(@Nullable String region) {
            this.region = region;
            return this;
        }        public DataSourceElasticsearchConfig build() {
            return new DataSourceElasticsearchConfig(endpoint, region);
        }
    }
}