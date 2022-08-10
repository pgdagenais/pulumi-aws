// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.efs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ReplicationConfigurationDestinationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ReplicationConfigurationDestinationArgs Empty = new ReplicationConfigurationDestinationArgs();

    /**
     * The availability zone in which the replica should be created. If specified, the replica will be created with One Zone storage. If omitted, regional storage will be used.
     * 
     */
    @Import(name="availabilityZoneName")
    private @Nullable Output<String> availabilityZoneName;

    /**
     * @return The availability zone in which the replica should be created. If specified, the replica will be created with One Zone storage. If omitted, regional storage will be used.
     * 
     */
    public Optional<Output<String>> availabilityZoneName() {
        return Optional.ofNullable(this.availabilityZoneName);
    }

    @Import(name="fileSystemId")
    private @Nullable Output<String> fileSystemId;

    public Optional<Output<String>> fileSystemId() {
        return Optional.ofNullable(this.fileSystemId);
    }

    /**
     * The Key ID, ARN, alias, or alias ARN of the KMS key that should be used to encrypt the replica file system. If omitted, the default KMS key for EFS `/aws/elasticfilesystem` will be used.
     * 
     */
    @Import(name="kmsKeyId")
    private @Nullable Output<String> kmsKeyId;

    /**
     * @return The Key ID, ARN, alias, or alias ARN of the KMS key that should be used to encrypt the replica file system. If omitted, the default KMS key for EFS `/aws/elasticfilesystem` will be used.
     * 
     */
    public Optional<Output<String>> kmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }

    /**
     * The region in which the replica should be created.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return The region in which the replica should be created.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    @Import(name="status")
    private @Nullable Output<String> status;

    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private ReplicationConfigurationDestinationArgs() {}

    private ReplicationConfigurationDestinationArgs(ReplicationConfigurationDestinationArgs $) {
        this.availabilityZoneName = $.availabilityZoneName;
        this.fileSystemId = $.fileSystemId;
        this.kmsKeyId = $.kmsKeyId;
        this.region = $.region;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReplicationConfigurationDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReplicationConfigurationDestinationArgs $;

        public Builder() {
            $ = new ReplicationConfigurationDestinationArgs();
        }

        public Builder(ReplicationConfigurationDestinationArgs defaults) {
            $ = new ReplicationConfigurationDestinationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param availabilityZoneName The availability zone in which the replica should be created. If specified, the replica will be created with One Zone storage. If omitted, regional storage will be used.
         * 
         * @return builder
         * 
         */
        public Builder availabilityZoneName(@Nullable Output<String> availabilityZoneName) {
            $.availabilityZoneName = availabilityZoneName;
            return this;
        }

        /**
         * @param availabilityZoneName The availability zone in which the replica should be created. If specified, the replica will be created with One Zone storage. If omitted, regional storage will be used.
         * 
         * @return builder
         * 
         */
        public Builder availabilityZoneName(String availabilityZoneName) {
            return availabilityZoneName(Output.of(availabilityZoneName));
        }

        public Builder fileSystemId(@Nullable Output<String> fileSystemId) {
            $.fileSystemId = fileSystemId;
            return this;
        }

        public Builder fileSystemId(String fileSystemId) {
            return fileSystemId(Output.of(fileSystemId));
        }

        /**
         * @param kmsKeyId The Key ID, ARN, alias, or alias ARN of the KMS key that should be used to encrypt the replica file system. If omitted, the default KMS key for EFS `/aws/elasticfilesystem` will be used.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            $.kmsKeyId = kmsKeyId;
            return this;
        }

        /**
         * @param kmsKeyId The Key ID, ARN, alias, or alias ARN of the KMS key that should be used to encrypt the replica file system. If omitted, the default KMS key for EFS `/aws/elasticfilesystem` will be used.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyId(String kmsKeyId) {
            return kmsKeyId(Output.of(kmsKeyId));
        }

        /**
         * @param region The region in which the replica should be created.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The region in which the replica should be created.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        public Builder status(String status) {
            return status(Output.of(status));
        }

        public ReplicationConfigurationDestinationArgs build() {
            return $;
        }
    }

}