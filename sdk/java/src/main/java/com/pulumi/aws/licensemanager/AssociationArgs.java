// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.licensemanager;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class AssociationArgs extends com.pulumi.resources.ResourceArgs {

    public static final AssociationArgs Empty = new AssociationArgs();

    /**
     * ARN of the license configuration.
     * 
     */
    @Import(name="licenseConfigurationArn", required=true)
    private Output<String> licenseConfigurationArn;

    /**
     * @return ARN of the license configuration.
     * 
     */
    public Output<String> licenseConfigurationArn() {
        return this.licenseConfigurationArn;
    }

    /**
     * ARN of the resource associated with the license configuration.
     * 
     */
    @Import(name="resourceArn", required=true)
    private Output<String> resourceArn;

    /**
     * @return ARN of the resource associated with the license configuration.
     * 
     */
    public Output<String> resourceArn() {
        return this.resourceArn;
    }

    private AssociationArgs() {}

    private AssociationArgs(AssociationArgs $) {
        this.licenseConfigurationArn = $.licenseConfigurationArn;
        this.resourceArn = $.resourceArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AssociationArgs $;

        public Builder() {
            $ = new AssociationArgs();
        }

        public Builder(AssociationArgs defaults) {
            $ = new AssociationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param licenseConfigurationArn ARN of the license configuration.
         * 
         * @return builder
         * 
         */
        public Builder licenseConfigurationArn(Output<String> licenseConfigurationArn) {
            $.licenseConfigurationArn = licenseConfigurationArn;
            return this;
        }

        /**
         * @param licenseConfigurationArn ARN of the license configuration.
         * 
         * @return builder
         * 
         */
        public Builder licenseConfigurationArn(String licenseConfigurationArn) {
            return licenseConfigurationArn(Output.of(licenseConfigurationArn));
        }

        /**
         * @param resourceArn ARN of the resource associated with the license configuration.
         * 
         * @return builder
         * 
         */
        public Builder resourceArn(Output<String> resourceArn) {
            $.resourceArn = resourceArn;
            return this;
        }

        /**
         * @param resourceArn ARN of the resource associated with the license configuration.
         * 
         * @return builder
         * 
         */
        public Builder resourceArn(String resourceArn) {
            return resourceArn(Output.of(resourceArn));
        }

        public AssociationArgs build() {
            $.licenseConfigurationArn = Objects.requireNonNull($.licenseConfigurationArn, "expected parameter 'licenseConfigurationArn' to be non-null");
            $.resourceArn = Objects.requireNonNull($.resourceArn, "expected parameter 'resourceArn' to be non-null");
            return $;
        }
    }

}