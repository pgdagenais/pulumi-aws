// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.IvsChat.Outputs
{

    [OutputType]
    public sealed class LoggingConfigurationDestinationConfigurationS3
    {
        /// <summary>
        /// Name of the Amazon S3 bucket where chat activity will be logged.
        /// </summary>
        public readonly string BucketName;

        [OutputConstructor]
        private LoggingConfigurationDestinationConfigurationS3(string bucketName)
        {
            BucketName = bucketName;
        }
    }
}