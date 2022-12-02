// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.medialive.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


public final class ChannelEncoderSettingsAudioDescriptionAudioWatermarkSettingsNielsenWatermarksSettingsNielsenNaesIiNwSettingArgs extends com.pulumi.resources.ResourceArgs {

    public static final ChannelEncoderSettingsAudioDescriptionAudioWatermarkSettingsNielsenWatermarksSettingsNielsenNaesIiNwSettingArgs Empty = new ChannelEncoderSettingsAudioDescriptionAudioWatermarkSettingsNielsenWatermarksSettingsNielsenNaesIiNwSettingArgs();

    @Import(name="checkDigitString", required=true)
    private Output<String> checkDigitString;

    public Output<String> checkDigitString() {
        return this.checkDigitString;
    }

    /**
     * The Nielsen Source ID to include in the watermark.
     * 
     */
    @Import(name="sid", required=true)
    private Output<Double> sid;

    /**
     * @return The Nielsen Source ID to include in the watermark.
     * 
     */
    public Output<Double> sid() {
        return this.sid;
    }

    private ChannelEncoderSettingsAudioDescriptionAudioWatermarkSettingsNielsenWatermarksSettingsNielsenNaesIiNwSettingArgs() {}

    private ChannelEncoderSettingsAudioDescriptionAudioWatermarkSettingsNielsenWatermarksSettingsNielsenNaesIiNwSettingArgs(ChannelEncoderSettingsAudioDescriptionAudioWatermarkSettingsNielsenWatermarksSettingsNielsenNaesIiNwSettingArgs $) {
        this.checkDigitString = $.checkDigitString;
        this.sid = $.sid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ChannelEncoderSettingsAudioDescriptionAudioWatermarkSettingsNielsenWatermarksSettingsNielsenNaesIiNwSettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ChannelEncoderSettingsAudioDescriptionAudioWatermarkSettingsNielsenWatermarksSettingsNielsenNaesIiNwSettingArgs $;

        public Builder() {
            $ = new ChannelEncoderSettingsAudioDescriptionAudioWatermarkSettingsNielsenWatermarksSettingsNielsenNaesIiNwSettingArgs();
        }

        public Builder(ChannelEncoderSettingsAudioDescriptionAudioWatermarkSettingsNielsenWatermarksSettingsNielsenNaesIiNwSettingArgs defaults) {
            $ = new ChannelEncoderSettingsAudioDescriptionAudioWatermarkSettingsNielsenWatermarksSettingsNielsenNaesIiNwSettingArgs(Objects.requireNonNull(defaults));
        }

        public Builder checkDigitString(Output<String> checkDigitString) {
            $.checkDigitString = checkDigitString;
            return this;
        }

        public Builder checkDigitString(String checkDigitString) {
            return checkDigitString(Output.of(checkDigitString));
        }

        /**
         * @param sid The Nielsen Source ID to include in the watermark.
         * 
         * @return builder
         * 
         */
        public Builder sid(Output<Double> sid) {
            $.sid = sid;
            return this;
        }

        /**
         * @param sid The Nielsen Source ID to include in the watermark.
         * 
         * @return builder
         * 
         */
        public Builder sid(Double sid) {
            return sid(Output.of(sid));
        }

        public ChannelEncoderSettingsAudioDescriptionAudioWatermarkSettingsNielsenWatermarksSettingsNielsenNaesIiNwSettingArgs build() {
            $.checkDigitString = Objects.requireNonNull($.checkDigitString, "expected parameter 'checkDigitString' to be non-null");
            $.sid = Objects.requireNonNull($.sid, "expected parameter 'sid' to be non-null");
            return $;
        }
    }

}