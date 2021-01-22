// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.ApiGatewayV2.Inputs
{

    public sealed class IntegrationResponseParameterGetArgs : Pulumi.ResourceArgs
    {
        [Input("mappings", required: true)]
        private InputMap<string>? _mappings;

        /// <summary>
        /// A key-value map. The key of ths map identifies the location of the request parameter to change, and how to change it. The corresponding value specifies the new data for the parameter.
        /// See the [Amazon API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-parameter-mapping.html) for details.
        /// </summary>
        public InputMap<string> Mappings
        {
            get => _mappings ?? (_mappings = new InputMap<string>());
            set => _mappings = value;
        }

        /// <summary>
        /// The HTTP status code in the range 200-599.
        /// </summary>
        [Input("statusCode", required: true)]
        public Input<string> StatusCode { get; set; } = null!;

        public IntegrationResponseParameterGetArgs()
        {
        }
    }
}