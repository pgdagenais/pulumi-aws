// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appflow.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesRedshift {
    /**
     * @return The name of the Amazon S3 bucket associated with Snowflake.
     * 
     */
    private final String bucketName;
    /**
     * @return The bucket path that refers to the Amazon S3 bucket associated with Snowflake.
     * 
     */
    private final @Nullable String bucketPrefix;
    /**
     * @return The JDBC URL of the Amazon Redshift cluster.
     * 
     */
    private final @Nullable String databaseUrl;
    /**
     * @return The Amazon Resource Name (ARN) of the IAM role.
     * 
     */
    private final String roleArn;

    @CustomType.Constructor
    private ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesRedshift(
        @CustomType.Parameter("bucketName") String bucketName,
        @CustomType.Parameter("bucketPrefix") @Nullable String bucketPrefix,
        @CustomType.Parameter("databaseUrl") @Nullable String databaseUrl,
        @CustomType.Parameter("roleArn") String roleArn) {
        this.bucketName = bucketName;
        this.bucketPrefix = bucketPrefix;
        this.databaseUrl = databaseUrl;
        this.roleArn = roleArn;
    }

    /**
     * @return The name of the Amazon S3 bucket associated with Snowflake.
     * 
     */
    public String bucketName() {
        return this.bucketName;
    }
    /**
     * @return The bucket path that refers to the Amazon S3 bucket associated with Snowflake.
     * 
     */
    public Optional<String> bucketPrefix() {
        return Optional.ofNullable(this.bucketPrefix);
    }
    /**
     * @return The JDBC URL of the Amazon Redshift cluster.
     * 
     */
    public Optional<String> databaseUrl() {
        return Optional.ofNullable(this.databaseUrl);
    }
    /**
     * @return The Amazon Resource Name (ARN) of the IAM role.
     * 
     */
    public String roleArn() {
        return this.roleArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesRedshift defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucketName;
        private @Nullable String bucketPrefix;
        private @Nullable String databaseUrl;
        private String roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesRedshift defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.bucketPrefix = defaults.bucketPrefix;
    	      this.databaseUrl = defaults.databaseUrl;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder bucketName(String bucketName) {
            this.bucketName = Objects.requireNonNull(bucketName);
            return this;
        }
        public Builder bucketPrefix(@Nullable String bucketPrefix) {
            this.bucketPrefix = bucketPrefix;
            return this;
        }
        public Builder databaseUrl(@Nullable String databaseUrl) {
            this.databaseUrl = databaseUrl;
            return this;
        }
        public Builder roleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }        public ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesRedshift build() {
            return new ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesRedshift(bucketName, bucketPrefix, databaseUrl, roleArn);
        }
    }
}