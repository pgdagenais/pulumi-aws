// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.MediaLive.Outputs
{

    [OutputType]
    public sealed class ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsHlsSettings
    {
        public readonly Outputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsHlsSettingsAudioOnlyHlsSettings? AudioOnlyHlsSettings;
        public readonly Outputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsHlsSettingsFmp4HlsSettings? Fmp4HlsSettings;
        public readonly Outputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsHlsSettingsFrameCaptureHlsSettings? FrameCaptureHlsSettings;
        public readonly Outputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsHlsSettingsStandardHlsSettings? StandardHlsSettings;

        [OutputConstructor]
        private ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsHlsSettings(
            Outputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsHlsSettingsAudioOnlyHlsSettings? audioOnlyHlsSettings,

            Outputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsHlsSettingsFmp4HlsSettings? fmp4HlsSettings,

            Outputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsHlsSettingsFrameCaptureHlsSettings? frameCaptureHlsSettings,

            Outputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsHlsSettingsStandardHlsSettings? standardHlsSettings)
        {
            AudioOnlyHlsSettings = audioOnlyHlsSettings;
            Fmp4HlsSettings = fmp4HlsSettings;
            FrameCaptureHlsSettings = frameCaptureHlsSettings;
            StandardHlsSettings = standardHlsSettings;
        }
    }
}