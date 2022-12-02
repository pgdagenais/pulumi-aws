// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.IvsChat.Inputs
{

    public sealed class LoggingConfigurationDestinationConfigurationCloudwatchLogsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the Amazon Cloudwatch Logs destination where chat activity will be logged.
        /// </summary>
        [Input("logGroupName", required: true)]
        public Input<string> LogGroupName { get; set; } = null!;

        public LoggingConfigurationDestinationConfigurationCloudwatchLogsArgs()
        {
        }
        public static new LoggingConfigurationDestinationConfigurationCloudwatchLogsArgs Empty => new LoggingConfigurationDestinationConfigurationCloudwatchLogsArgs();
    }
}