// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.SesV2
{
    /// <summary>
    /// Resource for managing an AWS SESv2 (Simple Email V2) Configuration Set.
    /// 
    /// ## Example Usage
    /// ### Basic Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.SesV2.ConfigurationSet("example", new()
    ///     {
    ///         ConfigurationSetName = "example",
    ///         DeliveryOptions = new Aws.SesV2.Inputs.ConfigurationSetDeliveryOptionsArgs
    ///         {
    ///             TlsPolicy = "REQUIRE",
    ///         },
    ///         ReputationOptions = new Aws.SesV2.Inputs.ConfigurationSetReputationOptionsArgs
    ///         {
    ///             ReputationMetricsEnabled = false,
    ///         },
    ///         SendingOptions = new Aws.SesV2.Inputs.ConfigurationSetSendingOptionsArgs
    ///         {
    ///             SendingEnabled = true,
    ///         },
    ///         SuppressionOptions = new Aws.SesV2.Inputs.ConfigurationSetSuppressionOptionsArgs
    ///         {
    ///             SuppressedReasons = new[]
    ///             {
    ///                 "BOUNCE",
    ///                 "COMPLAINT",
    ///             },
    ///         },
    ///         TrackingOptions = new Aws.SesV2.Inputs.ConfigurationSetTrackingOptionsArgs
    ///         {
    ///             CustomRedirectDomain = "example.com",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// SESv2 (Simple Email V2) Configuration Set can be imported using the `configuration_set_name`, e.g.,
    /// 
    /// ```sh
    ///  $ pulumi import aws:sesv2/configurationSet:ConfigurationSet example example
    /// ```
    /// </summary>
    [AwsResourceType("aws:sesv2/configurationSet:ConfigurationSet")]
    public partial class ConfigurationSet : global::Pulumi.CustomResource
    {
        /// <summary>
        /// ARN of the Configuration Set.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// The name of the configuration set.
        /// </summary>
        [Output("configurationSetName")]
        public Output<string> ConfigurationSetName { get; private set; } = null!;

        /// <summary>
        /// An object that defines the dedicated IP pool that is used to send emails that you send using the configuration set.
        /// </summary>
        [Output("deliveryOptions")]
        public Output<Outputs.ConfigurationSetDeliveryOptions?> DeliveryOptions { get; private set; } = null!;

        /// <summary>
        /// An object that defines whether or not Amazon SES collects reputation metrics for the emails that you send that use the configuration set.
        /// </summary>
        [Output("reputationOptions")]
        public Output<Outputs.ConfigurationSetReputationOptions> ReputationOptions { get; private set; } = null!;

        /// <summary>
        /// An object that defines whether or not Amazon SES can send email that you send using the configuration set.
        /// </summary>
        [Output("sendingOptions")]
        public Output<Outputs.ConfigurationSetSendingOptions> SendingOptions { get; private set; } = null!;

        /// <summary>
        /// An object that contains information about the suppression list preferences for your account.
        /// </summary>
        [Output("suppressionOptions")]
        public Output<Outputs.ConfigurationSetSuppressionOptions?> SuppressionOptions { get; private set; } = null!;

        /// <summary>
        /// A map of tags to assign to the service. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;

        /// <summary>
        /// An object that defines the open and click tracking options for emails that you send using the configuration set.
        /// </summary>
        [Output("trackingOptions")]
        public Output<Outputs.ConfigurationSetTrackingOptions?> TrackingOptions { get; private set; } = null!;


        /// <summary>
        /// Create a ConfigurationSet resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ConfigurationSet(string name, ConfigurationSetArgs args, CustomResourceOptions? options = null)
            : base("aws:sesv2/configurationSet:ConfigurationSet", name, args ?? new ConfigurationSetArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ConfigurationSet(string name, Input<string> id, ConfigurationSetState? state = null, CustomResourceOptions? options = null)
            : base("aws:sesv2/configurationSet:ConfigurationSet", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ConfigurationSet resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ConfigurationSet Get(string name, Input<string> id, ConfigurationSetState? state = null, CustomResourceOptions? options = null)
        {
            return new ConfigurationSet(name, id, state, options);
        }
    }

    public sealed class ConfigurationSetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the configuration set.
        /// </summary>
        [Input("configurationSetName", required: true)]
        public Input<string> ConfigurationSetName { get; set; } = null!;

        /// <summary>
        /// An object that defines the dedicated IP pool that is used to send emails that you send using the configuration set.
        /// </summary>
        [Input("deliveryOptions")]
        public Input<Inputs.ConfigurationSetDeliveryOptionsArgs>? DeliveryOptions { get; set; }

        /// <summary>
        /// An object that defines whether or not Amazon SES collects reputation metrics for the emails that you send that use the configuration set.
        /// </summary>
        [Input("reputationOptions")]
        public Input<Inputs.ConfigurationSetReputationOptionsArgs>? ReputationOptions { get; set; }

        /// <summary>
        /// An object that defines whether or not Amazon SES can send email that you send using the configuration set.
        /// </summary>
        [Input("sendingOptions")]
        public Input<Inputs.ConfigurationSetSendingOptionsArgs>? SendingOptions { get; set; }

        /// <summary>
        /// An object that contains information about the suppression list preferences for your account.
        /// </summary>
        [Input("suppressionOptions")]
        public Input<Inputs.ConfigurationSetSuppressionOptionsArgs>? SuppressionOptions { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the service. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// An object that defines the open and click tracking options for emails that you send using the configuration set.
        /// </summary>
        [Input("trackingOptions")]
        public Input<Inputs.ConfigurationSetTrackingOptionsArgs>? TrackingOptions { get; set; }

        public ConfigurationSetArgs()
        {
        }
        public static new ConfigurationSetArgs Empty => new ConfigurationSetArgs();
    }

    public sealed class ConfigurationSetState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// ARN of the Configuration Set.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// The name of the configuration set.
        /// </summary>
        [Input("configurationSetName")]
        public Input<string>? ConfigurationSetName { get; set; }

        /// <summary>
        /// An object that defines the dedicated IP pool that is used to send emails that you send using the configuration set.
        /// </summary>
        [Input("deliveryOptions")]
        public Input<Inputs.ConfigurationSetDeliveryOptionsGetArgs>? DeliveryOptions { get; set; }

        /// <summary>
        /// An object that defines whether or not Amazon SES collects reputation metrics for the emails that you send that use the configuration set.
        /// </summary>
        [Input("reputationOptions")]
        public Input<Inputs.ConfigurationSetReputationOptionsGetArgs>? ReputationOptions { get; set; }

        /// <summary>
        /// An object that defines whether or not Amazon SES can send email that you send using the configuration set.
        /// </summary>
        [Input("sendingOptions")]
        public Input<Inputs.ConfigurationSetSendingOptionsGetArgs>? SendingOptions { get; set; }

        /// <summary>
        /// An object that contains information about the suppression list preferences for your account.
        /// </summary>
        [Input("suppressionOptions")]
        public Input<Inputs.ConfigurationSetSuppressionOptionsGetArgs>? SuppressionOptions { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the service. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("tagsAll")]
        private InputMap<string>? _tagsAll;
        public InputMap<string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new InputMap<string>());
            set => _tagsAll = value;
        }

        /// <summary>
        /// An object that defines the open and click tracking options for emails that you send using the configuration set.
        /// </summary>
        [Input("trackingOptions")]
        public Input<Inputs.ConfigurationSetTrackingOptionsGetArgs>? TrackingOptions { get; set; }

        public ConfigurationSetState()
        {
        }
        public static new ConfigurationSetState Empty => new ConfigurationSetState();
    }
}