// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.S3.Outputs
{

    [OutputType]
    public sealed class BucketV2Website
    {
        /// <summary>
        /// An absolute path to the document to return in case of a 4XX error.
        /// </summary>
        public readonly string? ErrorDocument;
        /// <summary>
        /// Amazon S3 returns this index document when requests are made to the root domain or any of the subfolders.
        /// </summary>
        public readonly string? IndexDocument;
        /// <summary>
        /// A hostname to redirect all website requests for this bucket to. Hostname can optionally be prefixed with a protocol (`http://` or `https://`) to use when redirecting requests. The default is the protocol that is used in the original request.
        /// </summary>
        public readonly string? RedirectAllRequestsTo;
        /// <summary>
        /// A json array containing [routing rules](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules.html)
        /// describing redirect behavior and when redirects are applied.
        /// </summary>
        public readonly string? RoutingRules;

        [OutputConstructor]
        private BucketV2Website(
            string? errorDocument,

            string? indexDocument,

            string? redirectAllRequestsTo,

            string? routingRules)
        {
            ErrorDocument = errorDocument;
            IndexDocument = indexDocument;
            RedirectAllRequestsTo = redirectAllRequestsTo;
            RoutingRules = routingRules;
        }
    }
}