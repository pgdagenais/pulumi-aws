// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AppConfig
{
    public static class GetEnvironment
    {
        /// <summary>
        /// Provides access to an AppConfig Environment.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// ### Basic Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Aws.AppConfig.GetEnvironment.Invoke(new()
        ///     {
        ///         ApplicationId = "b5d5gpj",
        ///         EnvironmentId = "qrbb1c1",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetEnvironmentResult> InvokeAsync(GetEnvironmentArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetEnvironmentResult>("aws:appconfig/getEnvironment:getEnvironment", args ?? new GetEnvironmentArgs(), options.WithDefaults());

        /// <summary>
        /// Provides access to an AppConfig Environment.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// ### Basic Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Aws.AppConfig.GetEnvironment.Invoke(new()
        ///     {
        ///         ApplicationId = "b5d5gpj",
        ///         EnvironmentId = "qrbb1c1",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetEnvironmentResult> Invoke(GetEnvironmentInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetEnvironmentResult>("aws:appconfig/getEnvironment:getEnvironment", args ?? new GetEnvironmentInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetEnvironmentArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ID of the AppConfig Application to which this Environment belongs.
        /// </summary>
        [Input("applicationId", required: true)]
        public string ApplicationId { get; set; } = null!;

        /// <summary>
        /// ID of the AppConfig Environment.
        /// </summary>
        [Input("environmentId", required: true)]
        public string EnvironmentId { get; set; } = null!;

        [Input("tags")]
        private Dictionary<string, string>? _tags;

        /// <summary>
        /// Map of tags for the resource.
        /// </summary>
        public Dictionary<string, string> Tags
        {
            get => _tags ?? (_tags = new Dictionary<string, string>());
            set => _tags = value;
        }

        public GetEnvironmentArgs()
        {
        }
        public static new GetEnvironmentArgs Empty => new GetEnvironmentArgs();
    }

    public sealed class GetEnvironmentInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ID of the AppConfig Application to which this Environment belongs.
        /// </summary>
        [Input("applicationId", required: true)]
        public Input<string> ApplicationId { get; set; } = null!;

        /// <summary>
        /// ID of the AppConfig Environment.
        /// </summary>
        [Input("environmentId", required: true)]
        public Input<string> EnvironmentId { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Map of tags for the resource.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public GetEnvironmentInvokeArgs()
        {
        }
        public static new GetEnvironmentInvokeArgs Empty => new GetEnvironmentInvokeArgs();
    }


    [OutputType]
    public sealed class GetEnvironmentResult
    {
        public readonly string ApplicationId;
        /// <summary>
        /// ARN of the environment.
        /// </summary>
        public readonly string Arn;
        /// <summary>
        /// Name of the environment.
        /// </summary>
        public readonly string Description;
        public readonly string EnvironmentId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Set of Amazon CloudWatch alarms to monitor during the deployment process.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetEnvironmentMonitorResult> Monitors;
        /// <summary>
        /// Name of the environment.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// State of the environment. Possible values are `READY_FOR_DEPLOYMENT`, `DEPLOYING`, `ROLLING_BACK`
        /// or `ROLLED_BACK`.
        /// </summary>
        public readonly string State;
        /// <summary>
        /// Map of tags for the resource.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Tags;

        [OutputConstructor]
        private GetEnvironmentResult(
            string applicationId,

            string arn,

            string description,

            string environmentId,

            string id,

            ImmutableArray<Outputs.GetEnvironmentMonitorResult> monitors,

            string name,

            string state,

            ImmutableDictionary<string, string> tags)
        {
            ApplicationId = applicationId;
            Arn = arn;
            Description = description;
            EnvironmentId = environmentId;
            Id = id;
            Monitors = monitors;
            Name = name;
            State = state;
            Tags = tags;
        }
    }
}