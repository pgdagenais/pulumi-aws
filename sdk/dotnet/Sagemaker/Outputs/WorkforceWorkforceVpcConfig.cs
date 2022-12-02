// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Sagemaker.Outputs
{

    [OutputType]
    public sealed class WorkforceWorkforceVpcConfig
    {
        /// <summary>
        /// The VPC security group IDs. The security groups must be for the same VPC as specified in the subnet.
        /// </summary>
        public readonly ImmutableArray<string> SecurityGroupIds;
        /// <summary>
        /// The ID of the subnets in the VPC that you want to connect.
        /// </summary>
        public readonly ImmutableArray<string> Subnets;
        public readonly string? VpcEndpointId;
        /// <summary>
        /// The ID of the VPC that the workforce uses for communication.
        /// </summary>
        public readonly string? VpcId;

        [OutputConstructor]
        private WorkforceWorkforceVpcConfig(
            ImmutableArray<string> securityGroupIds,

            ImmutableArray<string> subnets,

            string? vpcEndpointId,

            string? vpcId)
        {
            SecurityGroupIds = securityGroupIds;
            Subnets = subnets;
            VpcEndpointId = vpcEndpointId;
            VpcId = vpcId;
        }
    }
}