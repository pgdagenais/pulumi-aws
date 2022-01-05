// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.WafV2.Outputs
{

    [OutputType]
    public sealed class RuleGroupCustomResponseBody
    {
        /// <summary>
        /// The payload of the custom response.
        /// </summary>
        public readonly string Content;
        /// <summary>
        /// The type of content in the payload that you are defining in the `content` argument. Valid values are `TEXT_PLAIN`, `TEXT_HTML`, or `APPLICATION_JSON`.
        /// </summary>
        public readonly string ContentType;
        /// <summary>
        /// A unique key identifying the custom response body. This is referenced by the `custom_response_body_key` argument in the Custom Response block.
        /// </summary>
        public readonly string Key;

        [OutputConstructor]
        private RuleGroupCustomResponseBody(
            string content,

            string contentType,

            string key)
        {
            Content = content;
            ContentType = contentType;
            Key = key;
        }
    }
}