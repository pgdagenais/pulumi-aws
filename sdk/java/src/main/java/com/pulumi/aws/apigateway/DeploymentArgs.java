// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigateway;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeploymentArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeploymentArgs Empty = new DeploymentArgs();

    /**
     * Description of the deployment
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the deployment
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * REST API identifier.
     * 
     */
    @Import(name="restApi", required=true)
    private Output<String> restApi;

    /**
     * @return REST API identifier.
     * 
     */
    public Output<String> restApi() {
        return this.restApi;
    }

    /**
     * Description to set on the stage managed by the `stage_name` argument.
     * 
     */
    @Import(name="stageDescription")
    private @Nullable Output<String> stageDescription;

    /**
     * @return Description to set on the stage managed by the `stage_name` argument.
     * 
     */
    public Optional<Output<String>> stageDescription() {
        return Optional.ofNullable(this.stageDescription);
    }

    /**
     * Name of the stage to create with this deployment. If the specified stage already exists, it will be updated to point to the new deployment. It is recommended to use the `aws.apigateway.Stage` resource instead to manage stages.
     * 
     */
    @Import(name="stageName")
    private @Nullable Output<String> stageName;

    /**
     * @return Name of the stage to create with this deployment. If the specified stage already exists, it will be updated to point to the new deployment. It is recommended to use the `aws.apigateway.Stage` resource instead to manage stages.
     * 
     */
    public Optional<Output<String>> stageName() {
        return Optional.ofNullable(this.stageName);
    }

    /**
     * Map of arbitrary keys and values that, when changed, will trigger a redeployment.
     * 
     */
    @Import(name="triggers")
    private @Nullable Output<Map<String,String>> triggers;

    /**
     * @return Map of arbitrary keys and values that, when changed, will trigger a redeployment.
     * 
     */
    public Optional<Output<Map<String,String>>> triggers() {
        return Optional.ofNullable(this.triggers);
    }

    /**
     * Map to set on the stage managed by the `stage_name` argument.
     * 
     */
    @Import(name="variables")
    private @Nullable Output<Map<String,String>> variables;

    /**
     * @return Map to set on the stage managed by the `stage_name` argument.
     * 
     */
    public Optional<Output<Map<String,String>>> variables() {
        return Optional.ofNullable(this.variables);
    }

    private DeploymentArgs() {}

    private DeploymentArgs(DeploymentArgs $) {
        this.description = $.description;
        this.restApi = $.restApi;
        this.stageDescription = $.stageDescription;
        this.stageName = $.stageName;
        this.triggers = $.triggers;
        this.variables = $.variables;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeploymentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeploymentArgs $;

        public Builder() {
            $ = new DeploymentArgs();
        }

        public Builder(DeploymentArgs defaults) {
            $ = new DeploymentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Description of the deployment
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the deployment
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param restApi REST API identifier.
         * 
         * @return builder
         * 
         */
        public Builder restApi(Output<String> restApi) {
            $.restApi = restApi;
            return this;
        }

        /**
         * @param restApi REST API identifier.
         * 
         * @return builder
         * 
         */
        public Builder restApi(String restApi) {
            return restApi(Output.of(restApi));
        }

        /**
         * @param stageDescription Description to set on the stage managed by the `stage_name` argument.
         * 
         * @return builder
         * 
         */
        public Builder stageDescription(@Nullable Output<String> stageDescription) {
            $.stageDescription = stageDescription;
            return this;
        }

        /**
         * @param stageDescription Description to set on the stage managed by the `stage_name` argument.
         * 
         * @return builder
         * 
         */
        public Builder stageDescription(String stageDescription) {
            return stageDescription(Output.of(stageDescription));
        }

        /**
         * @param stageName Name of the stage to create with this deployment. If the specified stage already exists, it will be updated to point to the new deployment. It is recommended to use the `aws.apigateway.Stage` resource instead to manage stages.
         * 
         * @return builder
         * 
         */
        public Builder stageName(@Nullable Output<String> stageName) {
            $.stageName = stageName;
            return this;
        }

        /**
         * @param stageName Name of the stage to create with this deployment. If the specified stage already exists, it will be updated to point to the new deployment. It is recommended to use the `aws.apigateway.Stage` resource instead to manage stages.
         * 
         * @return builder
         * 
         */
        public Builder stageName(String stageName) {
            return stageName(Output.of(stageName));
        }

        /**
         * @param triggers Map of arbitrary keys and values that, when changed, will trigger a redeployment.
         * 
         * @return builder
         * 
         */
        public Builder triggers(@Nullable Output<Map<String,String>> triggers) {
            $.triggers = triggers;
            return this;
        }

        /**
         * @param triggers Map of arbitrary keys and values that, when changed, will trigger a redeployment.
         * 
         * @return builder
         * 
         */
        public Builder triggers(Map<String,String> triggers) {
            return triggers(Output.of(triggers));
        }

        /**
         * @param variables Map to set on the stage managed by the `stage_name` argument.
         * 
         * @return builder
         * 
         */
        public Builder variables(@Nullable Output<Map<String,String>> variables) {
            $.variables = variables;
            return this;
        }

        /**
         * @param variables Map to set on the stage managed by the `stage_name` argument.
         * 
         * @return builder
         * 
         */
        public Builder variables(Map<String,String> variables) {
            return variables(Output.of(variables));
        }

        public DeploymentArgs build() {
            $.restApi = Objects.requireNonNull($.restApi, "expected parameter 'restApi' to be non-null");
            return $;
        }
    }

}