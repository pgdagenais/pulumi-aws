// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.MediaLive.Inputs
{

    public sealed class ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsHlsCdnSettingArgs : global::Pulumi.ResourceArgs
    {
        [Input("hlsAkamaiSettings")]
        public Input<Inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsHlsCdnSettingHlsAkamaiSettingsArgs>? HlsAkamaiSettings { get; set; }

        [Input("hlsBasicPutSettings")]
        public Input<Inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsHlsCdnSettingHlsBasicPutSettingsArgs>? HlsBasicPutSettings { get; set; }

        [Input("hlsMediaStoreSettings")]
        public Input<Inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsHlsCdnSettingHlsMediaStoreSettingsArgs>? HlsMediaStoreSettings { get; set; }

        [Input("hlsS3Settings")]
        public Input<Inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsHlsCdnSettingHlsS3SettingsArgs>? HlsS3Settings { get; set; }

        [Input("hlsWebdavSettings")]
        public Input<Inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsHlsCdnSettingHlsWebdavSettingsArgs>? HlsWebdavSettings { get; set; }

        public ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsHlsCdnSettingArgs()
        {
        }
        public static new ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsHlsCdnSettingArgs Empty => new ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsHlsCdnSettingArgs();
    }
}