// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.scheduler.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ScheduleTargetSqsParameters {
    /**
     * @return FIFO message group ID to use as the target.
     * 
     */
    private @Nullable String messageGroupId;

    private ScheduleTargetSqsParameters() {}
    /**
     * @return FIFO message group ID to use as the target.
     * 
     */
    public Optional<String> messageGroupId() {
        return Optional.ofNullable(this.messageGroupId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduleTargetSqsParameters defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String messageGroupId;
        public Builder() {}
        public Builder(ScheduleTargetSqsParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.messageGroupId = defaults.messageGroupId;
        }

        @CustomType.Setter
        public Builder messageGroupId(@Nullable String messageGroupId) {
            this.messageGroupId = messageGroupId;
            return this;
        }
        public ScheduleTargetSqsParameters build() {
            final var o = new ScheduleTargetSqsParameters();
            o.messageGroupId = messageGroupId;
            return o;
        }
    }
}