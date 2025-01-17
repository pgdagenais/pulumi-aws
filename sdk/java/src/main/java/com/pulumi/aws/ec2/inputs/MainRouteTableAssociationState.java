// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MainRouteTableAssociationState extends com.pulumi.resources.ResourceArgs {

    public static final MainRouteTableAssociationState Empty = new MainRouteTableAssociationState();

    /**
     * Used internally, see **Notes** below
     * 
     */
    @Import(name="originalRouteTableId")
    private @Nullable Output<String> originalRouteTableId;

    /**
     * @return Used internally, see **Notes** below
     * 
     */
    public Optional<Output<String>> originalRouteTableId() {
        return Optional.ofNullable(this.originalRouteTableId);
    }

    /**
     * The ID of the Route Table to set as the new
     * main route table for the target VPC
     * 
     */
    @Import(name="routeTableId")
    private @Nullable Output<String> routeTableId;

    /**
     * @return The ID of the Route Table to set as the new
     * main route table for the target VPC
     * 
     */
    public Optional<Output<String>> routeTableId() {
        return Optional.ofNullable(this.routeTableId);
    }

    /**
     * The ID of the VPC whose main route table should be set
     * 
     */
    @Import(name="vpcId")
    private @Nullable Output<String> vpcId;

    /**
     * @return The ID of the VPC whose main route table should be set
     * 
     */
    public Optional<Output<String>> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    private MainRouteTableAssociationState() {}

    private MainRouteTableAssociationState(MainRouteTableAssociationState $) {
        this.originalRouteTableId = $.originalRouteTableId;
        this.routeTableId = $.routeTableId;
        this.vpcId = $.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MainRouteTableAssociationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MainRouteTableAssociationState $;

        public Builder() {
            $ = new MainRouteTableAssociationState();
        }

        public Builder(MainRouteTableAssociationState defaults) {
            $ = new MainRouteTableAssociationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param originalRouteTableId Used internally, see **Notes** below
         * 
         * @return builder
         * 
         */
        public Builder originalRouteTableId(@Nullable Output<String> originalRouteTableId) {
            $.originalRouteTableId = originalRouteTableId;
            return this;
        }

        /**
         * @param originalRouteTableId Used internally, see **Notes** below
         * 
         * @return builder
         * 
         */
        public Builder originalRouteTableId(String originalRouteTableId) {
            return originalRouteTableId(Output.of(originalRouteTableId));
        }

        /**
         * @param routeTableId The ID of the Route Table to set as the new
         * main route table for the target VPC
         * 
         * @return builder
         * 
         */
        public Builder routeTableId(@Nullable Output<String> routeTableId) {
            $.routeTableId = routeTableId;
            return this;
        }

        /**
         * @param routeTableId The ID of the Route Table to set as the new
         * main route table for the target VPC
         * 
         * @return builder
         * 
         */
        public Builder routeTableId(String routeTableId) {
            return routeTableId(Output.of(routeTableId));
        }

        /**
         * @param vpcId The ID of the VPC whose main route table should be set
         * 
         * @return builder
         * 
         */
        public Builder vpcId(@Nullable Output<String> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        /**
         * @param vpcId The ID of the VPC whose main route table should be set
         * 
         * @return builder
         * 
         */
        public Builder vpcId(String vpcId) {
            return vpcId(Output.of(vpcId));
        }

        public MainRouteTableAssociationState build() {
            return $;
        }
    }

}
