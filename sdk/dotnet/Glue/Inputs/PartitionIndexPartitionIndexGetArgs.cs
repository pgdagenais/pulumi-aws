// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Glue.Inputs
{

    public sealed class PartitionIndexPartitionIndexGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the partition index.
        /// </summary>
        [Input("indexName")]
        public Input<string>? IndexName { get; set; }

        [Input("indexStatus")]
        public Input<string>? IndexStatus { get; set; }

        [Input("keys")]
        private InputList<string>? _keys;

        /// <summary>
        /// Keys for the partition index.
        /// </summary>
        public InputList<string> Keys
        {
            get => _keys ?? (_keys = new InputList<string>());
            set => _keys = value;
        }

        public PartitionIndexPartitionIndexGetArgs()
        {
        }
    }
}