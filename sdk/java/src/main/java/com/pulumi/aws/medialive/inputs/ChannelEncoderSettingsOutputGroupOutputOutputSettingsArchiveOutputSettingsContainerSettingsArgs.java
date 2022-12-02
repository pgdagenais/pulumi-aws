// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.medialive.inputs;

import com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsArchiveOutputSettingsContainerSettingsM2tsSettingsArgs;
import com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsArchiveOutputSettingsContainerSettingsRawSettingsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ChannelEncoderSettingsOutputGroupOutputOutputSettingsArchiveOutputSettingsContainerSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ChannelEncoderSettingsOutputGroupOutputOutputSettingsArchiveOutputSettingsContainerSettingsArgs Empty = new ChannelEncoderSettingsOutputGroupOutputOutputSettingsArchiveOutputSettingsContainerSettingsArgs();

    /**
     * M2ts Settings. See [M2ts Settings](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-m2tssettings.html) for more details.
     * 
     */
    @Import(name="m2tsSettings")
    private @Nullable Output<ChannelEncoderSettingsOutputGroupOutputOutputSettingsArchiveOutputSettingsContainerSettingsM2tsSettingsArgs> m2tsSettings;

    /**
     * @return M2ts Settings. See [M2ts Settings](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-m2tssettings.html) for more details.
     * 
     */
    public Optional<Output<ChannelEncoderSettingsOutputGroupOutputOutputSettingsArchiveOutputSettingsContainerSettingsM2tsSettingsArgs>> m2tsSettings() {
        return Optional.ofNullable(this.m2tsSettings);
    }

    /**
     * Raw Settings. This can be set as an empty block.
     * 
     */
    @Import(name="rawSettings")
    private @Nullable Output<ChannelEncoderSettingsOutputGroupOutputOutputSettingsArchiveOutputSettingsContainerSettingsRawSettingsArgs> rawSettings;

    /**
     * @return Raw Settings. This can be set as an empty block.
     * 
     */
    public Optional<Output<ChannelEncoderSettingsOutputGroupOutputOutputSettingsArchiveOutputSettingsContainerSettingsRawSettingsArgs>> rawSettings() {
        return Optional.ofNullable(this.rawSettings);
    }

    private ChannelEncoderSettingsOutputGroupOutputOutputSettingsArchiveOutputSettingsContainerSettingsArgs() {}

    private ChannelEncoderSettingsOutputGroupOutputOutputSettingsArchiveOutputSettingsContainerSettingsArgs(ChannelEncoderSettingsOutputGroupOutputOutputSettingsArchiveOutputSettingsContainerSettingsArgs $) {
        this.m2tsSettings = $.m2tsSettings;
        this.rawSettings = $.rawSettings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ChannelEncoderSettingsOutputGroupOutputOutputSettingsArchiveOutputSettingsContainerSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ChannelEncoderSettingsOutputGroupOutputOutputSettingsArchiveOutputSettingsContainerSettingsArgs $;

        public Builder() {
            $ = new ChannelEncoderSettingsOutputGroupOutputOutputSettingsArchiveOutputSettingsContainerSettingsArgs();
        }

        public Builder(ChannelEncoderSettingsOutputGroupOutputOutputSettingsArchiveOutputSettingsContainerSettingsArgs defaults) {
            $ = new ChannelEncoderSettingsOutputGroupOutputOutputSettingsArchiveOutputSettingsContainerSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param m2tsSettings M2ts Settings. See [M2ts Settings](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-m2tssettings.html) for more details.
         * 
         * @return builder
         * 
         */
        public Builder m2tsSettings(@Nullable Output<ChannelEncoderSettingsOutputGroupOutputOutputSettingsArchiveOutputSettingsContainerSettingsM2tsSettingsArgs> m2tsSettings) {
            $.m2tsSettings = m2tsSettings;
            return this;
        }

        /**
         * @param m2tsSettings M2ts Settings. See [M2ts Settings](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-m2tssettings.html) for more details.
         * 
         * @return builder
         * 
         */
        public Builder m2tsSettings(ChannelEncoderSettingsOutputGroupOutputOutputSettingsArchiveOutputSettingsContainerSettingsM2tsSettingsArgs m2tsSettings) {
            return m2tsSettings(Output.of(m2tsSettings));
        }

        /**
         * @param rawSettings Raw Settings. This can be set as an empty block.
         * 
         * @return builder
         * 
         */
        public Builder rawSettings(@Nullable Output<ChannelEncoderSettingsOutputGroupOutputOutputSettingsArchiveOutputSettingsContainerSettingsRawSettingsArgs> rawSettings) {
            $.rawSettings = rawSettings;
            return this;
        }

        /**
         * @param rawSettings Raw Settings. This can be set as an empty block.
         * 
         * @return builder
         * 
         */
        public Builder rawSettings(ChannelEncoderSettingsOutputGroupOutputOutputSettingsArchiveOutputSettingsContainerSettingsRawSettingsArgs rawSettings) {
            return rawSettings(Output.of(rawSettings));
        }

        public ChannelEncoderSettingsOutputGroupOutputOutputSettingsArchiveOutputSettingsContainerSettingsArgs build() {
            return $;
        }
    }

}