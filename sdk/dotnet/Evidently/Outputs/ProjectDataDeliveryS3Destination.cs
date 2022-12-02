// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Evidently.Outputs
{

    [OutputType]
    public sealed class ProjectDataDeliveryS3Destination
    {
        /// <summary>
        /// The name of the bucket in which Evidently stores evaluation events.
        /// </summary>
        public readonly string? Bucket;
        /// <summary>
        /// The bucket prefix in which Evidently stores evaluation events.
        /// </summary>
        public readonly string? Prefix;

        [OutputConstructor]
        private ProjectDataDeliveryS3Destination(
            string? bucket,

            string? prefix)
        {
            Bucket = bucket;
            Prefix = prefix;
        }
    }
}