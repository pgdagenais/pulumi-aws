// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class BucketPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketPolicyArgs Empty = new BucketPolicyArgs();

    /**
     * The name of the bucket to which to apply the policy.
     * 
     */
    @Import(name="bucket", required=true)
    private Output<String> bucket;

    /**
     * @return The name of the bucket to which to apply the policy.
     * 
     */
    public Output<String> bucket() {
        return this.bucket;
    }

    /**
     * The text of the policy. Although this is a bucket policy rather than an IAM policy, the `aws.iam.getPolicyDocument` data source may be used, so long as it specifies a principal. Note: Bucket policies are limited to 20 KB in size.
     * 
     */
    @Import(name="policy", required=true)
    private Output<String> policy;

    /**
     * @return The text of the policy. Although this is a bucket policy rather than an IAM policy, the `aws.iam.getPolicyDocument` data source may be used, so long as it specifies a principal. Note: Bucket policies are limited to 20 KB in size.
     * 
     */
    public Output<String> policy() {
        return this.policy;
    }

    private BucketPolicyArgs() {}

    private BucketPolicyArgs(BucketPolicyArgs $) {
        this.bucket = $.bucket;
        this.policy = $.policy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketPolicyArgs $;

        public Builder() {
            $ = new BucketPolicyArgs();
        }

        public Builder(BucketPolicyArgs defaults) {
            $ = new BucketPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucket The name of the bucket to which to apply the policy.
         * 
         * @return builder
         * 
         */
        public Builder bucket(Output<String> bucket) {
            $.bucket = bucket;
            return this;
        }

        /**
         * @param bucket The name of the bucket to which to apply the policy.
         * 
         * @return builder
         * 
         */
        public Builder bucket(String bucket) {
            return bucket(Output.of(bucket));
        }

        /**
         * @param policy The text of the policy. Although this is a bucket policy rather than an IAM policy, the `aws.iam.getPolicyDocument` data source may be used, so long as it specifies a principal. Note: Bucket policies are limited to 20 KB in size.
         * 
         * @return builder
         * 
         */
        public Builder policy(Output<String> policy) {
            $.policy = policy;
            return this;
        }

        /**
         * @param policy The text of the policy. Although this is a bucket policy rather than an IAM policy, the `aws.iam.getPolicyDocument` data source may be used, so long as it specifies a principal. Note: Bucket policies are limited to 20 KB in size.
         * 
         * @return builder
         * 
         */
        public Builder policy(String policy) {
            return policy(Output.of(policy));
        }

        public BucketPolicyArgs build() {
            $.bucket = Objects.requireNonNull($.bucket, "expected parameter 'bucket' to be non-null");
            $.policy = Objects.requireNonNull($.policy, "expected parameter 'policy' to be non-null");
            return $;
        }
    }

}