// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.gamelift.inputs;

import com.pulumi.aws.gamelift.inputs.FleetRuntimeConfigurationServerProcessArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FleetRuntimeConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final FleetRuntimeConfigurationArgs Empty = new FleetRuntimeConfigurationArgs();

    /**
     * Maximum amount of time (in seconds) that a game session can remain in status `ACTIVATING`.
     * 
     */
    @Import(name="gameSessionActivationTimeoutSeconds")
    private @Nullable Output<Integer> gameSessionActivationTimeoutSeconds;

    /**
     * @return Maximum amount of time (in seconds) that a game session can remain in status `ACTIVATING`.
     * 
     */
    public Optional<Output<Integer>> gameSessionActivationTimeoutSeconds() {
        return Optional.ofNullable(this.gameSessionActivationTimeoutSeconds);
    }

    /**
     * Maximum number of game sessions with status `ACTIVATING` to allow on an instance simultaneously.
     * 
     */
    @Import(name="maxConcurrentGameSessionActivations")
    private @Nullable Output<Integer> maxConcurrentGameSessionActivations;

    /**
     * @return Maximum number of game sessions with status `ACTIVATING` to allow on an instance simultaneously.
     * 
     */
    public Optional<Output<Integer>> maxConcurrentGameSessionActivations() {
        return Optional.ofNullable(this.maxConcurrentGameSessionActivations);
    }

    /**
     * Collection of server process configurations that describe which server processes to run on each instance in a fleet. See below.
     * 
     */
    @Import(name="serverProcesses")
    private @Nullable Output<List<FleetRuntimeConfigurationServerProcessArgs>> serverProcesses;

    /**
     * @return Collection of server process configurations that describe which server processes to run on each instance in a fleet. See below.
     * 
     */
    public Optional<Output<List<FleetRuntimeConfigurationServerProcessArgs>>> serverProcesses() {
        return Optional.ofNullable(this.serverProcesses);
    }

    private FleetRuntimeConfigurationArgs() {}

    private FleetRuntimeConfigurationArgs(FleetRuntimeConfigurationArgs $) {
        this.gameSessionActivationTimeoutSeconds = $.gameSessionActivationTimeoutSeconds;
        this.maxConcurrentGameSessionActivations = $.maxConcurrentGameSessionActivations;
        this.serverProcesses = $.serverProcesses;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FleetRuntimeConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FleetRuntimeConfigurationArgs $;

        public Builder() {
            $ = new FleetRuntimeConfigurationArgs();
        }

        public Builder(FleetRuntimeConfigurationArgs defaults) {
            $ = new FleetRuntimeConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param gameSessionActivationTimeoutSeconds Maximum amount of time (in seconds) that a game session can remain in status `ACTIVATING`.
         * 
         * @return builder
         * 
         */
        public Builder gameSessionActivationTimeoutSeconds(@Nullable Output<Integer> gameSessionActivationTimeoutSeconds) {
            $.gameSessionActivationTimeoutSeconds = gameSessionActivationTimeoutSeconds;
            return this;
        }

        /**
         * @param gameSessionActivationTimeoutSeconds Maximum amount of time (in seconds) that a game session can remain in status `ACTIVATING`.
         * 
         * @return builder
         * 
         */
        public Builder gameSessionActivationTimeoutSeconds(Integer gameSessionActivationTimeoutSeconds) {
            return gameSessionActivationTimeoutSeconds(Output.of(gameSessionActivationTimeoutSeconds));
        }

        /**
         * @param maxConcurrentGameSessionActivations Maximum number of game sessions with status `ACTIVATING` to allow on an instance simultaneously.
         * 
         * @return builder
         * 
         */
        public Builder maxConcurrentGameSessionActivations(@Nullable Output<Integer> maxConcurrentGameSessionActivations) {
            $.maxConcurrentGameSessionActivations = maxConcurrentGameSessionActivations;
            return this;
        }

        /**
         * @param maxConcurrentGameSessionActivations Maximum number of game sessions with status `ACTIVATING` to allow on an instance simultaneously.
         * 
         * @return builder
         * 
         */
        public Builder maxConcurrentGameSessionActivations(Integer maxConcurrentGameSessionActivations) {
            return maxConcurrentGameSessionActivations(Output.of(maxConcurrentGameSessionActivations));
        }

        /**
         * @param serverProcesses Collection of server process configurations that describe which server processes to run on each instance in a fleet. See below.
         * 
         * @return builder
         * 
         */
        public Builder serverProcesses(@Nullable Output<List<FleetRuntimeConfigurationServerProcessArgs>> serverProcesses) {
            $.serverProcesses = serverProcesses;
            return this;
        }

        /**
         * @param serverProcesses Collection of server process configurations that describe which server processes to run on each instance in a fleet. See below.
         * 
         * @return builder
         * 
         */
        public Builder serverProcesses(List<FleetRuntimeConfigurationServerProcessArgs> serverProcesses) {
            return serverProcesses(Output.of(serverProcesses));
        }

        /**
         * @param serverProcesses Collection of server process configurations that describe which server processes to run on each instance in a fleet. See below.
         * 
         * @return builder
         * 
         */
        public Builder serverProcesses(FleetRuntimeConfigurationServerProcessArgs... serverProcesses) {
            return serverProcesses(List.of(serverProcesses));
        }

        public FleetRuntimeConfigurationArgs build() {
            return $;
        }
    }

}