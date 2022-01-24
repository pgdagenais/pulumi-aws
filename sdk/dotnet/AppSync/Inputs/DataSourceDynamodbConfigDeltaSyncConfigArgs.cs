// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AppSync.Inputs
{

    public sealed class DataSourceDynamodbConfigDeltaSyncConfigArgs : Pulumi.ResourceArgs
    {
        [Input("baseTableTtl")]
        public Input<int>? BaseTableTtl { get; set; }

        [Input("deltaSyncTableName", required: true)]
        public Input<string> DeltaSyncTableName { get; set; } = null!;

        [Input("deltaSyncTableTtl")]
        public Input<int>? DeltaSyncTableTtl { get; set; }

        public DataSourceDynamodbConfigDeltaSyncConfigArgs()
        {
        }
    }
}