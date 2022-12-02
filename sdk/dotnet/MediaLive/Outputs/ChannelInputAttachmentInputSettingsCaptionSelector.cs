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
    public sealed class ChannelInputAttachmentInputSettingsCaptionSelector
    {
        /// <summary>
        /// When specified this field indicates the three letter language code of the caption track to extract from the source.
        /// </summary>
        public readonly string? LanguageCode;
        /// <summary>
        /// The name of the video description.
        /// </summary>
        public readonly string Name;
        public readonly Outputs.ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettings? SelectorSettings;

        [OutputConstructor]
        private ChannelInputAttachmentInputSettingsCaptionSelector(
            string? languageCode,

            string name,

            Outputs.ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettings? selectorSettings)
        {
            LanguageCode = languageCode;
            Name = name;
            SelectorSettings = selectorSettings;
        }
    }
}