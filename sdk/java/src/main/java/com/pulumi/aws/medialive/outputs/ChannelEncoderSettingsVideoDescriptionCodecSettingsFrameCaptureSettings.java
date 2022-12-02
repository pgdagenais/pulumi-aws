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
public final class ChannelEncoderSettingsVideoDescriptionCodecSettingsFrameCaptureSettings {
    /**
     * @return The frequency at which to capture frames for inclusion in the output.
     * 
     */
    private @Nullable Integer captureInterval;
    /**
     * @return Unit for the frame capture interval.
     * 
     */
    private @Nullable String captureIntervalUnits;

    private ChannelEncoderSettingsVideoDescriptionCodecSettingsFrameCaptureSettings() {}
    /**
     * @return The frequency at which to capture frames for inclusion in the output.
     * 
     */
    public Optional<Integer> captureInterval() {
        return Optional.ofNullable(this.captureInterval);
    }
    /**
     * @return Unit for the frame capture interval.
     * 
     */
    public Optional<String> captureIntervalUnits() {
        return Optional.ofNullable(this.captureIntervalUnits);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChannelEncoderSettingsVideoDescriptionCodecSettingsFrameCaptureSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer captureInterval;
        private @Nullable String captureIntervalUnits;
        public Builder() {}
        public Builder(ChannelEncoderSettingsVideoDescriptionCodecSettingsFrameCaptureSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.captureInterval = defaults.captureInterval;
    	      this.captureIntervalUnits = defaults.captureIntervalUnits;
        }

        @CustomType.Setter
        public Builder captureInterval(@Nullable Integer captureInterval) {
            this.captureInterval = captureInterval;
            return this;
        }
        @CustomType.Setter
        public Builder captureIntervalUnits(@Nullable String captureIntervalUnits) {
            this.captureIntervalUnits = captureIntervalUnits;
            return this;
        }
        public ChannelEncoderSettingsVideoDescriptionCodecSettingsFrameCaptureSettings build() {
            final var o = new ChannelEncoderSettingsVideoDescriptionCodecSettingsFrameCaptureSettings();
            o.captureInterval = captureInterval;
            o.captureIntervalUnits = captureIntervalUnits;
            return o;
        }
    }
}