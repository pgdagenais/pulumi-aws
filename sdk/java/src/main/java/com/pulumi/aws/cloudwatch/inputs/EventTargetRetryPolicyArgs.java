// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudwatch.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EventTargetRetryPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final EventTargetRetryPolicyArgs Empty = new EventTargetRetryPolicyArgs();

    /**
     * The age in seconds to continue to make retry attempts.
     * 
     */
    @Import(name="maximumEventAgeInSeconds")
    private @Nullable Output<Integer> maximumEventAgeInSeconds;

    /**
     * @return The age in seconds to continue to make retry attempts.
     * 
     */
    public Optional<Output<Integer>> maximumEventAgeInSeconds() {
        return Optional.ofNullable(this.maximumEventAgeInSeconds);
    }

    /**
     * maximum number of retry attempts to make before the request fails
     * 
     */
    @Import(name="maximumRetryAttempts")
    private @Nullable Output<Integer> maximumRetryAttempts;

    /**
     * @return maximum number of retry attempts to make before the request fails
     * 
     */
    public Optional<Output<Integer>> maximumRetryAttempts() {
        return Optional.ofNullable(this.maximumRetryAttempts);
    }

    private EventTargetRetryPolicyArgs() {}

    private EventTargetRetryPolicyArgs(EventTargetRetryPolicyArgs $) {
        this.maximumEventAgeInSeconds = $.maximumEventAgeInSeconds;
        this.maximumRetryAttempts = $.maximumRetryAttempts;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventTargetRetryPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventTargetRetryPolicyArgs $;

        public Builder() {
            $ = new EventTargetRetryPolicyArgs();
        }

        public Builder(EventTargetRetryPolicyArgs defaults) {
            $ = new EventTargetRetryPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param maximumEventAgeInSeconds The age in seconds to continue to make retry attempts.
         * 
         * @return builder
         * 
         */
        public Builder maximumEventAgeInSeconds(@Nullable Output<Integer> maximumEventAgeInSeconds) {
            $.maximumEventAgeInSeconds = maximumEventAgeInSeconds;
            return this;
        }

        /**
         * @param maximumEventAgeInSeconds The age in seconds to continue to make retry attempts.
         * 
         * @return builder
         * 
         */
        public Builder maximumEventAgeInSeconds(Integer maximumEventAgeInSeconds) {
            return maximumEventAgeInSeconds(Output.of(maximumEventAgeInSeconds));
        }

        /**
         * @param maximumRetryAttempts maximum number of retry attempts to make before the request fails
         * 
         * @return builder
         * 
         */
        public Builder maximumRetryAttempts(@Nullable Output<Integer> maximumRetryAttempts) {
            $.maximumRetryAttempts = maximumRetryAttempts;
            return this;
        }

        /**
         * @param maximumRetryAttempts maximum number of retry attempts to make before the request fails
         * 
         * @return builder
         * 
         */
        public Builder maximumRetryAttempts(Integer maximumRetryAttempts) {
            return maximumRetryAttempts(Output.of(maximumRetryAttempts));
        }

        public EventTargetRetryPolicyArgs build() {
            return $;
        }
    }

}