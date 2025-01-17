// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Sagemaker.Inputs
{

    public sealed class EndpointConfigurationAsyncInferenceConfigClientConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The maximum number of concurrent requests sent by the SageMaker client to the model container. If no value is provided, Amazon SageMaker will choose an optimal value for you.
        /// </summary>
        [Input("maxConcurrentInvocationsPerInstance")]
        public Input<int>? MaxConcurrentInvocationsPerInstance { get; set; }

        public EndpointConfigurationAsyncInferenceConfigClientConfigArgs()
        {
        }
        public static new EndpointConfigurationAsyncInferenceConfigClientConfigArgs Empty => new EndpointConfigurationAsyncInferenceConfigClientConfigArgs();
    }
}
