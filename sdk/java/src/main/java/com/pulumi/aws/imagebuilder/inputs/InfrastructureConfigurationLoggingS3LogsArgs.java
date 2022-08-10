// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.imagebuilder.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InfrastructureConfigurationLoggingS3LogsArgs extends com.pulumi.resources.ResourceArgs {

    public static final InfrastructureConfigurationLoggingS3LogsArgs Empty = new InfrastructureConfigurationLoggingS3LogsArgs();

    /**
     * Name of the S3 Bucket.
     * 
     */
    @Import(name="s3BucketName", required=true)
    private Output<String> s3BucketName;

    /**
     * @return Name of the S3 Bucket.
     * 
     */
    public Output<String> s3BucketName() {
        return this.s3BucketName;
    }

    /**
     * Prefix to use for S3 logs. Defaults to `/`.
     * 
     */
    @Import(name="s3KeyPrefix")
    private @Nullable Output<String> s3KeyPrefix;

    /**
     * @return Prefix to use for S3 logs. Defaults to `/`.
     * 
     */
    public Optional<Output<String>> s3KeyPrefix() {
        return Optional.ofNullable(this.s3KeyPrefix);
    }

    private InfrastructureConfigurationLoggingS3LogsArgs() {}

    private InfrastructureConfigurationLoggingS3LogsArgs(InfrastructureConfigurationLoggingS3LogsArgs $) {
        this.s3BucketName = $.s3BucketName;
        this.s3KeyPrefix = $.s3KeyPrefix;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InfrastructureConfigurationLoggingS3LogsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InfrastructureConfigurationLoggingS3LogsArgs $;

        public Builder() {
            $ = new InfrastructureConfigurationLoggingS3LogsArgs();
        }

        public Builder(InfrastructureConfigurationLoggingS3LogsArgs defaults) {
            $ = new InfrastructureConfigurationLoggingS3LogsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param s3BucketName Name of the S3 Bucket.
         * 
         * @return builder
         * 
         */
        public Builder s3BucketName(Output<String> s3BucketName) {
            $.s3BucketName = s3BucketName;
            return this;
        }

        /**
         * @param s3BucketName Name of the S3 Bucket.
         * 
         * @return builder
         * 
         */
        public Builder s3BucketName(String s3BucketName) {
            return s3BucketName(Output.of(s3BucketName));
        }

        /**
         * @param s3KeyPrefix Prefix to use for S3 logs. Defaults to `/`.
         * 
         * @return builder
         * 
         */
        public Builder s3KeyPrefix(@Nullable Output<String> s3KeyPrefix) {
            $.s3KeyPrefix = s3KeyPrefix;
            return this;
        }

        /**
         * @param s3KeyPrefix Prefix to use for S3 logs. Defaults to `/`.
         * 
         * @return builder
         * 
         */
        public Builder s3KeyPrefix(String s3KeyPrefix) {
            return s3KeyPrefix(Output.of(s3KeyPrefix));
        }

        public InfrastructureConfigurationLoggingS3LogsArgs build() {
            $.s3BucketName = Objects.requireNonNull($.s3BucketName, "expected parameter 's3BucketName' to be non-null");
            return $;
        }
    }

}