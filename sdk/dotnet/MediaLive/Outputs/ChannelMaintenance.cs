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
    public sealed class ChannelMaintenance
    {
        /// <summary>
        /// The day of the week to use for maintenance.
        /// </summary>
        public readonly string MaintenanceDay;
        /// <summary>
        /// The hour maintenance will start.
        /// </summary>
        public readonly string MaintenanceStartTime;

        [OutputConstructor]
        private ChannelMaintenance(
            string maintenanceDay,

            string maintenanceStartTime)
        {
            MaintenanceDay = maintenanceDay;
            MaintenanceStartTime = maintenanceStartTime;
        }
    }
}