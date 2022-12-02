// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.medialive.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsDvbTdtSettings {
    private @Nullable String ocrLanguage;
    private @Nullable Integer pid;

    private ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsDvbTdtSettings() {}
    public Optional<String> ocrLanguage() {
        return Optional.ofNullable(this.ocrLanguage);
    }
    public Optional<Integer> pid() {
        return Optional.ofNullable(this.pid);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsDvbTdtSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String ocrLanguage;
        private @Nullable Integer pid;
        public Builder() {}
        public Builder(ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsDvbTdtSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ocrLanguage = defaults.ocrLanguage;
    	      this.pid = defaults.pid;
        }

        @CustomType.Setter
        public Builder ocrLanguage(@Nullable String ocrLanguage) {
            this.ocrLanguage = ocrLanguage;
            return this;
        }
        @CustomType.Setter
        public Builder pid(@Nullable Integer pid) {
            this.pid = pid;
            return this;
        }
        public ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsDvbTdtSettings build() {
            final var o = new ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsDvbTdtSettings();
            o.ocrLanguage = ocrLanguage;
            o.pid = pid;
            return o;
        }
    }
}