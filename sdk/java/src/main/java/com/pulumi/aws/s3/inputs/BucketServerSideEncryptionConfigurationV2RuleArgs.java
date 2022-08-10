// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.inputs;

import com.pulumi.aws.s3.inputs.BucketServerSideEncryptionConfigurationV2RuleApplyServerSideEncryptionByDefaultArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BucketServerSideEncryptionConfigurationV2RuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketServerSideEncryptionConfigurationV2RuleArgs Empty = new BucketServerSideEncryptionConfigurationV2RuleArgs();

    /**
     * A single object for setting server-side encryption by default documented below
     * 
     */
    @Import(name="applyServerSideEncryptionByDefault")
    private @Nullable Output<BucketServerSideEncryptionConfigurationV2RuleApplyServerSideEncryptionByDefaultArgs> applyServerSideEncryptionByDefault;

    /**
     * @return A single object for setting server-side encryption by default documented below
     * 
     */
    public Optional<Output<BucketServerSideEncryptionConfigurationV2RuleApplyServerSideEncryptionByDefaultArgs>> applyServerSideEncryptionByDefault() {
        return Optional.ofNullable(this.applyServerSideEncryptionByDefault);
    }

    /**
     * Whether or not to use [Amazon S3 Bucket Keys](https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-key.html) for SSE-KMS.
     * 
     */
    @Import(name="bucketKeyEnabled")
    private @Nullable Output<Boolean> bucketKeyEnabled;

    /**
     * @return Whether or not to use [Amazon S3 Bucket Keys](https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-key.html) for SSE-KMS.
     * 
     */
    public Optional<Output<Boolean>> bucketKeyEnabled() {
        return Optional.ofNullable(this.bucketKeyEnabled);
    }

    private BucketServerSideEncryptionConfigurationV2RuleArgs() {}

    private BucketServerSideEncryptionConfigurationV2RuleArgs(BucketServerSideEncryptionConfigurationV2RuleArgs $) {
        this.applyServerSideEncryptionByDefault = $.applyServerSideEncryptionByDefault;
        this.bucketKeyEnabled = $.bucketKeyEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketServerSideEncryptionConfigurationV2RuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketServerSideEncryptionConfigurationV2RuleArgs $;

        public Builder() {
            $ = new BucketServerSideEncryptionConfigurationV2RuleArgs();
        }

        public Builder(BucketServerSideEncryptionConfigurationV2RuleArgs defaults) {
            $ = new BucketServerSideEncryptionConfigurationV2RuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param applyServerSideEncryptionByDefault A single object for setting server-side encryption by default documented below
         * 
         * @return builder
         * 
         */
        public Builder applyServerSideEncryptionByDefault(@Nullable Output<BucketServerSideEncryptionConfigurationV2RuleApplyServerSideEncryptionByDefaultArgs> applyServerSideEncryptionByDefault) {
            $.applyServerSideEncryptionByDefault = applyServerSideEncryptionByDefault;
            return this;
        }

        /**
         * @param applyServerSideEncryptionByDefault A single object for setting server-side encryption by default documented below
         * 
         * @return builder
         * 
         */
        public Builder applyServerSideEncryptionByDefault(BucketServerSideEncryptionConfigurationV2RuleApplyServerSideEncryptionByDefaultArgs applyServerSideEncryptionByDefault) {
            return applyServerSideEncryptionByDefault(Output.of(applyServerSideEncryptionByDefault));
        }

        /**
         * @param bucketKeyEnabled Whether or not to use [Amazon S3 Bucket Keys](https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-key.html) for SSE-KMS.
         * 
         * @return builder
         * 
         */
        public Builder bucketKeyEnabled(@Nullable Output<Boolean> bucketKeyEnabled) {
            $.bucketKeyEnabled = bucketKeyEnabled;
            return this;
        }

        /**
         * @param bucketKeyEnabled Whether or not to use [Amazon S3 Bucket Keys](https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-key.html) for SSE-KMS.
         * 
         * @return builder
         * 
         */
        public Builder bucketKeyEnabled(Boolean bucketKeyEnabled) {
            return bucketKeyEnabled(Output.of(bucketKeyEnabled));
        }

        public BucketServerSideEncryptionConfigurationV2RuleArgs build() {
            return $;
        }
    }

}