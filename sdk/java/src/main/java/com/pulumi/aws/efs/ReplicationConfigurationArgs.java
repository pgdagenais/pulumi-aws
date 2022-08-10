// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.efs;

import com.pulumi.aws.efs.inputs.ReplicationConfigurationDestinationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ReplicationConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ReplicationConfigurationArgs Empty = new ReplicationConfigurationArgs();

    /**
     * A destination configuration block (documented below).
     * 
     */
    @Import(name="destination", required=true)
    private Output<ReplicationConfigurationDestinationArgs> destination;

    /**
     * @return A destination configuration block (documented below).
     * 
     */
    public Output<ReplicationConfigurationDestinationArgs> destination() {
        return this.destination;
    }

    /**
     * The ID of the file system that is to be replicated.
     * 
     */
    @Import(name="sourceFileSystemId", required=true)
    private Output<String> sourceFileSystemId;

    /**
     * @return The ID of the file system that is to be replicated.
     * 
     */
    public Output<String> sourceFileSystemId() {
        return this.sourceFileSystemId;
    }

    private ReplicationConfigurationArgs() {}

    private ReplicationConfigurationArgs(ReplicationConfigurationArgs $) {
        this.destination = $.destination;
        this.sourceFileSystemId = $.sourceFileSystemId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReplicationConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReplicationConfigurationArgs $;

        public Builder() {
            $ = new ReplicationConfigurationArgs();
        }

        public Builder(ReplicationConfigurationArgs defaults) {
            $ = new ReplicationConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param destination A destination configuration block (documented below).
         * 
         * @return builder
         * 
         */
        public Builder destination(Output<ReplicationConfigurationDestinationArgs> destination) {
            $.destination = destination;
            return this;
        }

        /**
         * @param destination A destination configuration block (documented below).
         * 
         * @return builder
         * 
         */
        public Builder destination(ReplicationConfigurationDestinationArgs destination) {
            return destination(Output.of(destination));
        }

        /**
         * @param sourceFileSystemId The ID of the file system that is to be replicated.
         * 
         * @return builder
         * 
         */
        public Builder sourceFileSystemId(Output<String> sourceFileSystemId) {
            $.sourceFileSystemId = sourceFileSystemId;
            return this;
        }

        /**
         * @param sourceFileSystemId The ID of the file system that is to be replicated.
         * 
         * @return builder
         * 
         */
        public Builder sourceFileSystemId(String sourceFileSystemId) {
            return sourceFileSystemId(Output.of(sourceFileSystemId));
        }

        public ReplicationConfigurationArgs build() {
            $.destination = Objects.requireNonNull($.destination, "expected parameter 'destination' to be non-null");
            $.sourceFileSystemId = Objects.requireNonNull($.sourceFileSystemId, "expected parameter 'sourceFileSystemId' to be non-null");
            return $;
        }
    }

}