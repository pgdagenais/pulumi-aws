// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BucketVersioningV2VersioningConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketVersioningV2VersioningConfigurationArgs Empty = new BucketVersioningV2VersioningConfigurationArgs();

    /**
     * Specifies whether MFA delete is enabled in the bucket versioning configuration. Valid values: `Enabled` or `Disabled`.
     * 
     */
    @Import(name="mfaDelete")
    private @Nullable Output<String> mfaDelete;

    /**
     * @return Specifies whether MFA delete is enabled in the bucket versioning configuration. Valid values: `Enabled` or `Disabled`.
     * 
     */
    public Optional<Output<String>> mfaDelete() {
        return Optional.ofNullable(this.mfaDelete);
    }

    /**
     * The versioning state of the bucket. Valid values: `Enabled`, `Suspended`, or `Disabled`. `Disabled` should only be used when creating or importing resources that correspond to unversioned S3 buckets.
     * 
     */
    @Import(name="status", required=true)
    private Output<String> status;

    /**
     * @return The versioning state of the bucket. Valid values: `Enabled`, `Suspended`, or `Disabled`. `Disabled` should only be used when creating or importing resources that correspond to unversioned S3 buckets.
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    private BucketVersioningV2VersioningConfigurationArgs() {}

    private BucketVersioningV2VersioningConfigurationArgs(BucketVersioningV2VersioningConfigurationArgs $) {
        this.mfaDelete = $.mfaDelete;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketVersioningV2VersioningConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketVersioningV2VersioningConfigurationArgs $;

        public Builder() {
            $ = new BucketVersioningV2VersioningConfigurationArgs();
        }

        public Builder(BucketVersioningV2VersioningConfigurationArgs defaults) {
            $ = new BucketVersioningV2VersioningConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param mfaDelete Specifies whether MFA delete is enabled in the bucket versioning configuration. Valid values: `Enabled` or `Disabled`.
         * 
         * @return builder
         * 
         */
        public Builder mfaDelete(@Nullable Output<String> mfaDelete) {
            $.mfaDelete = mfaDelete;
            return this;
        }

        /**
         * @param mfaDelete Specifies whether MFA delete is enabled in the bucket versioning configuration. Valid values: `Enabled` or `Disabled`.
         * 
         * @return builder
         * 
         */
        public Builder mfaDelete(String mfaDelete) {
            return mfaDelete(Output.of(mfaDelete));
        }

        /**
         * @param status The versioning state of the bucket. Valid values: `Enabled`, `Suspended`, or `Disabled`. `Disabled` should only be used when creating or importing resources that correspond to unversioned S3 buckets.
         * 
         * @return builder
         * 
         */
        public Builder status(Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The versioning state of the bucket. Valid values: `Enabled`, `Suspended`, or `Disabled`. `Disabled` should only be used when creating or importing resources that correspond to unversioned S3 buckets.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public BucketVersioningV2VersioningConfigurationArgs build() {
            $.status = Objects.requireNonNull($.status, "expected parameter 'status' to be non-null");
            return $;
        }
    }

}