// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.MediaLive.Inputs
{

    public sealed class ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsHlsSettingsAudioOnlyHlsSettingsArgs : global::Pulumi.ResourceArgs
    {
        [Input("audioGroupId")]
        public Input<string>? AudioGroupId { get; set; }

        [Input("audioOnlyImage")]
        public Input<Inputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsHlsSettingsAudioOnlyHlsSettingsAudioOnlyImageArgs>? AudioOnlyImage { get; set; }

        [Input("audioTrackType")]
        public Input<string>? AudioTrackType { get; set; }

        [Input("segmentType")]
        public Input<string>? SegmentType { get; set; }

        public ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsHlsSettingsAudioOnlyHlsSettingsArgs()
        {
        }
        public static new ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsHlsSettingsAudioOnlyHlsSettingsArgs Empty => new ChannelEncoderSettingsOutputGroupOutputOutputSettingsHlsOutputSettingsHlsSettingsAudioOnlyHlsSettingsArgs();
    }
}