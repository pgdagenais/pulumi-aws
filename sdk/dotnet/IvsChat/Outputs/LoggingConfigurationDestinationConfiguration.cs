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
    public sealed class LoggingConfigurationDestinationConfiguration
    {
        /// <summary>
        /// An Amazon CloudWatch Logs destination configuration where chat activity will be logged.
        /// </summary>
        public readonly Outputs.LoggingConfigurationDestinationConfigurationCloudwatchLogs? CloudwatchLogs;
        /// <summary>
        /// An Amazon Kinesis Data Firehose destination configuration where chat activity will be logged.
        /// </summary>
        public readonly Outputs.LoggingConfigurationDestinationConfigurationFirehose? Firehose;
        /// <summary>
        /// An Amazon S3 destination configuration where chat activity will be logged.
        /// </summary>
        public readonly Outputs.LoggingConfigurationDestinationConfigurationS3? S3;

        [OutputConstructor]
        private LoggingConfigurationDestinationConfiguration(
            Outputs.LoggingConfigurationDestinationConfigurationCloudwatchLogs? cloudwatchLogs,

            Outputs.LoggingConfigurationDestinationConfigurationFirehose? firehose,

            Outputs.LoggingConfigurationDestinationConfigurationS3? s3)
        {
            CloudwatchLogs = cloudwatchLogs;
            Firehose = firehose;
            S3 = s3;
        }
    }
}