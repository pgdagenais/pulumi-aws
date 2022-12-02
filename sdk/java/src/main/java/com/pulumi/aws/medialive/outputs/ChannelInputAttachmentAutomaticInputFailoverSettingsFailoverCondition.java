// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.medialive.outputs;

import com.pulumi.aws.medialive.outputs.ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettings;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverCondition {
    private @Nullable ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettings failoverConditionSettings;

    private ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverCondition() {}
    public Optional<ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettings> failoverConditionSettings() {
        return Optional.ofNullable(this.failoverConditionSettings);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverCondition defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettings failoverConditionSettings;
        public Builder() {}
        public Builder(ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.failoverConditionSettings = defaults.failoverConditionSettings;
        }

        @CustomType.Setter
        public Builder failoverConditionSettings(@Nullable ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionFailoverConditionSettings failoverConditionSettings) {
            this.failoverConditionSettings = failoverConditionSettings;
            return this;
        }
        public ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverCondition build() {
            final var o = new ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverCondition();
            o.failoverConditionSettings = failoverConditionSettings;
            return o;
        }
    }
}