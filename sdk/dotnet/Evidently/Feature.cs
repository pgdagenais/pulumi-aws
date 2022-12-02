// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Evidently
{
    /// <summary>
    /// Provides a CloudWatch Evidently Feature resource.
    /// 
    /// ## Example Usage
    /// ### Basic
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.Evidently.Feature("example", new()
    ///     {
    ///         Project = aws_evidently_project.Example.Name,
    ///         Description = "example description",
    ///         Variations = new[]
    ///         {
    ///             new Aws.Evidently.Inputs.FeatureVariationArgs
    ///             {
    ///                 Name = "Variation1",
    ///                 Value = new Aws.Evidently.Inputs.FeatureVariationValueArgs
    ///                 {
    ///                     StringValue = "example",
    ///                 },
    ///             },
    ///         },
    ///         Tags = 
    ///         {
    ///             { "Key1", "example Feature" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### With default variation
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.Evidently.Feature("example", new()
    ///     {
    ///         Project = aws_evidently_project.Example.Name,
    ///         DefaultVariation = "Variation2",
    ///         Variations = new[]
    ///         {
    ///             new Aws.Evidently.Inputs.FeatureVariationArgs
    ///             {
    ///                 Name = "Variation1",
    ///                 Value = new Aws.Evidently.Inputs.FeatureVariationValueArgs
    ///                 {
    ///                     StringValue = "exampleval1",
    ///                 },
    ///             },
    ///             new Aws.Evidently.Inputs.FeatureVariationArgs
    ///             {
    ///                 Name = "Variation2",
    ///                 Value = new Aws.Evidently.Inputs.FeatureVariationValueArgs
    ///                 {
    ///                     StringValue = "exampleval2",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### With entity overrides
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.Evidently.Feature("example", new()
    ///     {
    ///         Project = aws_evidently_project.Example.Name,
    ///         EntityOverrides = 
    ///         {
    ///             { "test1", "Variation1" },
    ///         },
    ///         Variations = new[]
    ///         {
    ///             new Aws.Evidently.Inputs.FeatureVariationArgs
    ///             {
    ///                 Name = "Variation1",
    ///                 Value = new Aws.Evidently.Inputs.FeatureVariationValueArgs
    ///                 {
    ///                     StringValue = "exampleval1",
    ///                 },
    ///             },
    ///             new Aws.Evidently.Inputs.FeatureVariationArgs
    ///             {
    ///                 Name = "Variation2",
    ///                 Value = new Aws.Evidently.Inputs.FeatureVariationValueArgs
    ///                 {
    ///                     StringValue = "exampleval2",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### With evaluation strategy
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.Evidently.Feature("example", new()
    ///     {
    ///         Project = aws_evidently_project.Example.Name,
    ///         EvaluationStrategy = "ALL_RULES",
    ///         EntityOverrides = 
    ///         {
    ///             { "test1", "Variation1" },
    ///         },
    ///         Variations = new[]
    ///         {
    ///             new Aws.Evidently.Inputs.FeatureVariationArgs
    ///             {
    ///                 Name = "Variation1",
    ///                 Value = new Aws.Evidently.Inputs.FeatureVariationValueArgs
    ///                 {
    ///                     StringValue = "exampleval1",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// CloudWatch Evidently Feature can be imported using the feature `name` and `name` or `arn` of the hosting CloudWatch Evidently Project separated by a `:`, e.g.,
    /// 
    /// ```sh
    ///  $ pulumi import aws:evidently/feature:Feature example exampleFeatureName:arn:aws:evidently:us-east-1:123456789012:project/example
    /// ```
    /// </summary>
    [AwsResourceType("aws:evidently/feature:Feature")]
    public partial class Feature : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ARN of the feature.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// The date and time that the feature is created.
        /// </summary>
        [Output("createdTime")]
        public Output<string> CreatedTime { get; private set; } = null!;

        /// <summary>
        /// The name of the variation to use as the default variation. The default variation is served to users who are not allocated to any ongoing launches or experiments of this feature. This variation must also be listed in the `variations` structure. If you omit `default_variation`, the first variation listed in the `variations` structure is used as the default variation.
        /// </summary>
        [Output("defaultVariation")]
        public Output<string> DefaultVariation { get; private set; } = null!;

        /// <summary>
        /// Specifies the description of the feature.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Specify users that should always be served a specific variation of a feature. Each user is specified by a key-value pair . For each key, specify a user by entering their user ID, account ID, or some other identifier. For the value, specify the name of the variation that they are to be served.
        /// </summary>
        [Output("entityOverrides")]
        public Output<ImmutableDictionary<string, string>?> EntityOverrides { get; private set; } = null!;

        /// <summary>
        /// One or more blocks that define the evaluation rules for the feature. Detailed below
        /// </summary>
        [Output("evaluationRules")]
        public Output<ImmutableArray<Outputs.FeatureEvaluationRule>> EvaluationRules { get; private set; } = null!;

        /// <summary>
        /// Specify `ALL_RULES` to activate the traffic allocation specified by any ongoing launches or experiments. Specify `DEFAULT_VARIATION` to serve the default variation to all users instead.
        /// </summary>
        [Output("evaluationStrategy")]
        public Output<string> EvaluationStrategy { get; private set; } = null!;

        /// <summary>
        /// The date and time that the feature was most recently updated.
        /// </summary>
        [Output("lastUpdatedTime")]
        public Output<string> LastUpdatedTime { get; private set; } = null!;

        /// <summary>
        /// The name for the new feature. Minimum length of `1`. Maximum length of `127`.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The name or ARN of the project that is to contain the new feature.
        /// </summary>
        [Output("project")]
        public Output<string> Project { get; private set; } = null!;

        /// <summary>
        /// The current state of the feature. Valid values are `AVAILABLE` and `UPDATING`.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// Tags to apply to the feature. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;

        /// <summary>
        /// Defines the type of value used to define the different feature variations. Valid Values: `STRING`, `LONG`, `DOUBLE`, `BOOLEAN`.
        /// </summary>
        [Output("valueType")]
        public Output<string> ValueType { get; private set; } = null!;

        /// <summary>
        /// One or more blocks that contain the configuration of the feature's different variations. Detailed below
        /// </summary>
        [Output("variations")]
        public Output<ImmutableArray<Outputs.FeatureVariation>> Variations { get; private set; } = null!;


        /// <summary>
        /// Create a Feature resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Feature(string name, FeatureArgs args, CustomResourceOptions? options = null)
            : base("aws:evidently/feature:Feature", name, args ?? new FeatureArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Feature(string name, Input<string> id, FeatureState? state = null, CustomResourceOptions? options = null)
            : base("aws:evidently/feature:Feature", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Feature resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Feature Get(string name, Input<string> id, FeatureState? state = null, CustomResourceOptions? options = null)
        {
            return new Feature(name, id, state, options);
        }
    }

    public sealed class FeatureArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the variation to use as the default variation. The default variation is served to users who are not allocated to any ongoing launches or experiments of this feature. This variation must also be listed in the `variations` structure. If you omit `default_variation`, the first variation listed in the `variations` structure is used as the default variation.
        /// </summary>
        [Input("defaultVariation")]
        public Input<string>? DefaultVariation { get; set; }

        /// <summary>
        /// Specifies the description of the feature.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("entityOverrides")]
        private InputMap<string>? _entityOverrides;

        /// <summary>
        /// Specify users that should always be served a specific variation of a feature. Each user is specified by a key-value pair . For each key, specify a user by entering their user ID, account ID, or some other identifier. For the value, specify the name of the variation that they are to be served.
        /// </summary>
        public InputMap<string> EntityOverrides
        {
            get => _entityOverrides ?? (_entityOverrides = new InputMap<string>());
            set => _entityOverrides = value;
        }

        /// <summary>
        /// Specify `ALL_RULES` to activate the traffic allocation specified by any ongoing launches or experiments. Specify `DEFAULT_VARIATION` to serve the default variation to all users instead.
        /// </summary>
        [Input("evaluationStrategy")]
        public Input<string>? EvaluationStrategy { get; set; }

        /// <summary>
        /// The name for the new feature. Minimum length of `1`. Maximum length of `127`.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The name or ARN of the project that is to contain the new feature.
        /// </summary>
        [Input("project", required: true)]
        public Input<string> Project { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Tags to apply to the feature. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("variations", required: true)]
        private InputList<Inputs.FeatureVariationArgs>? _variations;

        /// <summary>
        /// One or more blocks that contain the configuration of the feature's different variations. Detailed below
        /// </summary>
        public InputList<Inputs.FeatureVariationArgs> Variations
        {
            get => _variations ?? (_variations = new InputList<Inputs.FeatureVariationArgs>());
            set => _variations = value;
        }

        public FeatureArgs()
        {
        }
        public static new FeatureArgs Empty => new FeatureArgs();
    }

    public sealed class FeatureState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ARN of the feature.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// The date and time that the feature is created.
        /// </summary>
        [Input("createdTime")]
        public Input<string>? CreatedTime { get; set; }

        /// <summary>
        /// The name of the variation to use as the default variation. The default variation is served to users who are not allocated to any ongoing launches or experiments of this feature. This variation must also be listed in the `variations` structure. If you omit `default_variation`, the first variation listed in the `variations` structure is used as the default variation.
        /// </summary>
        [Input("defaultVariation")]
        public Input<string>? DefaultVariation { get; set; }

        /// <summary>
        /// Specifies the description of the feature.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("entityOverrides")]
        private InputMap<string>? _entityOverrides;

        /// <summary>
        /// Specify users that should always be served a specific variation of a feature. Each user is specified by a key-value pair . For each key, specify a user by entering their user ID, account ID, or some other identifier. For the value, specify the name of the variation that they are to be served.
        /// </summary>
        public InputMap<string> EntityOverrides
        {
            get => _entityOverrides ?? (_entityOverrides = new InputMap<string>());
            set => _entityOverrides = value;
        }

        [Input("evaluationRules")]
        private InputList<Inputs.FeatureEvaluationRuleGetArgs>? _evaluationRules;

        /// <summary>
        /// One or more blocks that define the evaluation rules for the feature. Detailed below
        /// </summary>
        public InputList<Inputs.FeatureEvaluationRuleGetArgs> EvaluationRules
        {
            get => _evaluationRules ?? (_evaluationRules = new InputList<Inputs.FeatureEvaluationRuleGetArgs>());
            set => _evaluationRules = value;
        }

        /// <summary>
        /// Specify `ALL_RULES` to activate the traffic allocation specified by any ongoing launches or experiments. Specify `DEFAULT_VARIATION` to serve the default variation to all users instead.
        /// </summary>
        [Input("evaluationStrategy")]
        public Input<string>? EvaluationStrategy { get; set; }

        /// <summary>
        /// The date and time that the feature was most recently updated.
        /// </summary>
        [Input("lastUpdatedTime")]
        public Input<string>? LastUpdatedTime { get; set; }

        /// <summary>
        /// The name for the new feature. Minimum length of `1`. Maximum length of `127`.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The name or ARN of the project that is to contain the new feature.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// The current state of the feature. Valid values are `AVAILABLE` and `UPDATING`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Tags to apply to the feature. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("tagsAll")]
        private InputMap<string>? _tagsAll;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        public InputMap<string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new InputMap<string>());
            set => _tagsAll = value;
        }

        /// <summary>
        /// Defines the type of value used to define the different feature variations. Valid Values: `STRING`, `LONG`, `DOUBLE`, `BOOLEAN`.
        /// </summary>
        [Input("valueType")]
        public Input<string>? ValueType { get; set; }

        [Input("variations")]
        private InputList<Inputs.FeatureVariationGetArgs>? _variations;

        /// <summary>
        /// One or more blocks that contain the configuration of the feature's different variations. Detailed below
        /// </summary>
        public InputList<Inputs.FeatureVariationGetArgs> Variations
        {
            get => _variations ?? (_variations = new InputList<Inputs.FeatureVariationGetArgs>());
            set => _variations = value;
        }

        public FeatureState()
        {
        }
        public static new FeatureState Empty => new FeatureState();
    }
}