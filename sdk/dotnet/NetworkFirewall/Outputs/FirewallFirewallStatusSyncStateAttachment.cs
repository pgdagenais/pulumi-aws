// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.NetworkFirewall.Outputs
{

    [OutputType]
    public sealed class FirewallFirewallStatusSyncStateAttachment
    {
        /// <summary>
        /// The identifier of the firewall endpoint that AWS Network Firewall has instantiated in the subnet. You use this to identify the firewall endpoint in the VPC route tables, when you redirect the VPC traffic through the endpoint.
        /// </summary>
        public readonly string? EndpointId;
        /// <summary>
        /// The unique identifier for the subnet.
        /// </summary>
        public readonly string? SubnetId;

        [OutputConstructor]
        private FirewallFirewallStatusSyncStateAttachment(
            string? endpointId,

            string? subnetId)
        {
            EndpointId = endpointId;
            SubnetId = subnetId;
        }
    }
}