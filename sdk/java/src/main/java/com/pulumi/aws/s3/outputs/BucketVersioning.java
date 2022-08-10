// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BucketVersioning {
    /**
     * @return Enable versioning. Once you version-enable a bucket, it can never return to an unversioned state. You can, however, suspend versioning on that bucket.
     * 
     */
    private final @Nullable Boolean enabled;
    /**
     * @return Enable MFA delete for either `Change the versioning state of your bucket` or `Permanently delete an object version`. Default is `false`. This cannot be used to toggle this setting but is available to allow managed buckets to reflect the state in AWS
     * 
     */
    private final @Nullable Boolean mfaDelete;

    @CustomType.Constructor
    private BucketVersioning(
        @CustomType.Parameter("enabled") @Nullable Boolean enabled,
        @CustomType.Parameter("mfaDelete") @Nullable Boolean mfaDelete) {
        this.enabled = enabled;
        this.mfaDelete = mfaDelete;
    }

    /**
     * @return Enable versioning. Once you version-enable a bucket, it can never return to an unversioned state. You can, however, suspend versioning on that bucket.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return Enable MFA delete for either `Change the versioning state of your bucket` or `Permanently delete an object version`. Default is `false`. This cannot be used to toggle this setting but is available to allow managed buckets to reflect the state in AWS
     * 
     */
    public Optional<Boolean> mfaDelete() {
        return Optional.ofNullable(this.mfaDelete);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketVersioning defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable Boolean mfaDelete;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketVersioning defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.mfaDelete = defaults.mfaDelete;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder mfaDelete(@Nullable Boolean mfaDelete) {
            this.mfaDelete = mfaDelete;
            return this;
        }        public BucketVersioning build() {
            return new BucketVersioning(enabled, mfaDelete);
        }
    }
}