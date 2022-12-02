// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.medialive.outputs;

import com.pulumi.aws.medialive.outputs.ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverCondition;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ChannelInputAttachmentAutomaticInputFailoverSettings {
    private @Nullable Integer errorClearTimeMsec;
    private @Nullable List<ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverCondition> failoverConditions;
    private @Nullable String inputPreference;
    private String secondaryInputId;

    private ChannelInputAttachmentAutomaticInputFailoverSettings() {}
    public Optional<Integer> errorClearTimeMsec() {
        return Optional.ofNullable(this.errorClearTimeMsec);
    }
    public List<ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverCondition> failoverConditions() {
        return this.failoverConditions == null ? List.of() : this.failoverConditions;
    }
    public Optional<String> inputPreference() {
        return Optional.ofNullable(this.inputPreference);
    }
    public String secondaryInputId() {
        return this.secondaryInputId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChannelInputAttachmentAutomaticInputFailoverSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer errorClearTimeMsec;
        private @Nullable List<ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverCondition> failoverConditions;
        private @Nullable String inputPreference;
        private String secondaryInputId;
        public Builder() {}
        public Builder(ChannelInputAttachmentAutomaticInputFailoverSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errorClearTimeMsec = defaults.errorClearTimeMsec;
    	      this.failoverConditions = defaults.failoverConditions;
    	      this.inputPreference = defaults.inputPreference;
    	      this.secondaryInputId = defaults.secondaryInputId;
        }

        @CustomType.Setter
        public Builder errorClearTimeMsec(@Nullable Integer errorClearTimeMsec) {
            this.errorClearTimeMsec = errorClearTimeMsec;
            return this;
        }
        @CustomType.Setter
        public Builder failoverConditions(@Nullable List<ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverCondition> failoverConditions) {
            this.failoverConditions = failoverConditions;
            return this;
        }
        public Builder failoverConditions(ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverCondition... failoverConditions) {
            return failoverConditions(List.of(failoverConditions));
        }
        @CustomType.Setter
        public Builder inputPreference(@Nullable String inputPreference) {
            this.inputPreference = inputPreference;
            return this;
        }
        @CustomType.Setter
        public Builder secondaryInputId(String secondaryInputId) {
            this.secondaryInputId = Objects.requireNonNull(secondaryInputId);
            return this;
        }
        public ChannelInputAttachmentAutomaticInputFailoverSettings build() {
            final var o = new ChannelInputAttachmentAutomaticInputFailoverSettings();
            o.errorClearTimeMsec = errorClearTimeMsec;
            o.failoverConditions = failoverConditions;
            o.inputPreference = inputPreference;
            o.secondaryInputId = secondaryInputId;
            return o;
        }
    }
}