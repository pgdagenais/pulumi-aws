// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.ImageBuilder.Inputs
{

    public sealed class DistributionConfigurationDistributionFastLaunchConfigurationGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account ID that this configuration applies to.
        /// </summary>
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        /// <summary>
        /// A Boolean that represents the current state of faster launching for the Windows AMI. Set to `true` to start using Windows faster launching, or `false` to stop using it.
        /// </summary>
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        /// <summary>
        /// Configuration block for the launch template that the fast-launch enabled Windows AMI uses when it launches Windows instances to create pre-provisioned snapshots. Detailed below.
        /// </summary>
        [Input("launchTemplate")]
        public Input<Inputs.DistributionConfigurationDistributionFastLaunchConfigurationLaunchTemplateGetArgs>? LaunchTemplate { get; set; }

        /// <summary>
        /// The maximum number of parallel instances that are launched for creating resources.
        /// </summary>
        [Input("maxParallelLaunches")]
        public Input<int>? MaxParallelLaunches { get; set; }

        /// <summary>
        /// Configuration block for managing the number of snapshots that are created from pre-provisioned instances for the Windows AMI when faster launching is enabled. Detailed below.
        /// </summary>
        [Input("snapshotConfiguration")]
        public Input<Inputs.DistributionConfigurationDistributionFastLaunchConfigurationSnapshotConfigurationGetArgs>? SnapshotConfiguration { get; set; }

        public DistributionConfigurationDistributionFastLaunchConfigurationGetArgs()
        {
        }
    }
}