// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker.inputs;

import com.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EndpointState extends com.pulumi.resources.ResourceArgs {

    public static final EndpointState Empty = new EndpointState();

    /**
     * The Amazon Resource Name (ARN) assigned by AWS to this endpoint.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) assigned by AWS to this endpoint.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The deployment configuration for an endpoint, which contains the desired deployment strategy and rollback configurations. See Deployment Config.
     * 
     */
    @Import(name="deploymentConfig")
    private @Nullable Output<EndpointDeploymentConfigArgs> deploymentConfig;

    /**
     * @return The deployment configuration for an endpoint, which contains the desired deployment strategy and rollback configurations. See Deployment Config.
     * 
     */
    public Optional<Output<EndpointDeploymentConfigArgs>> deploymentConfig() {
        return Optional.ofNullable(this.deploymentConfig);
    }

    /**
     * The name of the endpoint configuration to use.
     * 
     */
    @Import(name="endpointConfigName")
    private @Nullable Output<String> endpointConfigName;

    /**
     * @return The name of the endpoint configuration to use.
     * 
     */
    public Optional<Output<String>> endpointConfigName() {
        return Optional.ofNullable(this.endpointConfigName);
    }

    /**
     * The name of the endpoint.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the endpoint.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    private EndpointState() {}

    private EndpointState(EndpointState $) {
        this.arn = $.arn;
        this.deploymentConfig = $.deploymentConfig;
        this.endpointConfigName = $.endpointConfigName;
        this.name = $.name;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EndpointState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EndpointState $;

        public Builder() {
            $ = new EndpointState();
        }

        public Builder(EndpointState defaults) {
            $ = new EndpointState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The Amazon Resource Name (ARN) assigned by AWS to this endpoint.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The Amazon Resource Name (ARN) assigned by AWS to this endpoint.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param deploymentConfig The deployment configuration for an endpoint, which contains the desired deployment strategy and rollback configurations. See Deployment Config.
         * 
         * @return builder
         * 
         */
        public Builder deploymentConfig(@Nullable Output<EndpointDeploymentConfigArgs> deploymentConfig) {
            $.deploymentConfig = deploymentConfig;
            return this;
        }

        /**
         * @param deploymentConfig The deployment configuration for an endpoint, which contains the desired deployment strategy and rollback configurations. See Deployment Config.
         * 
         * @return builder
         * 
         */
        public Builder deploymentConfig(EndpointDeploymentConfigArgs deploymentConfig) {
            return deploymentConfig(Output.of(deploymentConfig));
        }

        /**
         * @param endpointConfigName The name of the endpoint configuration to use.
         * 
         * @return builder
         * 
         */
        public Builder endpointConfigName(@Nullable Output<String> endpointConfigName) {
            $.endpointConfigName = endpointConfigName;
            return this;
        }

        /**
         * @param endpointConfigName The name of the endpoint configuration to use.
         * 
         * @return builder
         * 
         */
        public Builder endpointConfigName(String endpointConfigName) {
            return endpointConfigName(Output.of(endpointConfigName));
        }

        /**
         * @param name The name of the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param tags A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider .
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider .
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        public EndpointState build() {
            return $;
        }
    }

}