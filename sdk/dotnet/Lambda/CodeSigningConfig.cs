// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Lambda
{
    /// <summary>
    /// Provides a Lambda Code Signing Config resource. A code signing configuration defines a list of allowed signing profiles and defines the code-signing validation policy (action to be taken if deployment validation checks fail).
    /// 
    /// For information about Lambda code signing configurations and how to use them, see [configuring code signing for Lambda functions](https://docs.aws.amazon.com/lambda/latest/dg/configuration-codesigning.html)
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var newCsc = new Aws.Lambda.CodeSigningConfig("newCsc", new Aws.Lambda.CodeSigningConfigArgs
    ///         {
    ///             AllowedPublishers = new Aws.Lambda.Inputs.CodeSigningConfigAllowedPublishersArgs
    ///             {
    ///                 SigningProfileVersionArns = 
    ///                 {
    ///                     aws_signer_signing_profile.Example1.Arn,
    ///                     aws_signer_signing_profile.Example2.Arn,
    ///                 },
    ///             },
    ///             Policies = new Aws.Lambda.Inputs.CodeSigningConfigPoliciesArgs
    ///             {
    ///                 UntrustedArtifactOnDeployment = "Warn",
    ///             },
    ///             Description = "My awesome code signing config.",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Code Signing Configs can be imported using their ARN, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import aws:lambda/codeSigningConfig:CodeSigningConfig imported_csc arn:aws:lambda:us-west-2:123456789012:code-signing-config:csc-0f6c334abcdea4d8b
    /// ```
    /// </summary>
    [AwsResourceType("aws:lambda/codeSigningConfig:CodeSigningConfig")]
    public partial class CodeSigningConfig : Pulumi.CustomResource
    {
        /// <summary>
        /// A configuration block of allowed publishers as signing profiles for this code signing configuration. Detailed below.
        /// </summary>
        [Output("allowedPublishers")]
        public Output<Outputs.CodeSigningConfigAllowedPublishers> AllowedPublishers { get; private set; } = null!;

        /// <summary>
        /// The Amazon Resource Name (ARN) of the code signing configuration.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// Unique identifier for the code signing configuration.
        /// </summary>
        [Output("configId")]
        public Output<string> ConfigId { get; private set; } = null!;

        /// <summary>
        /// Descriptive name for this code signing configuration.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The date and time that the code signing configuration was last modified.
        /// </summary>
        [Output("lastModified")]
        public Output<string> LastModified { get; private set; } = null!;

        /// <summary>
        /// A configuration block of code signing policies that define the actions to take if the validation checks fail. Detailed below.
        /// </summary>
        [Output("policies")]
        public Output<Outputs.CodeSigningConfigPolicies> Policies { get; private set; } = null!;


        /// <summary>
        /// Create a CodeSigningConfig resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public CodeSigningConfig(string name, CodeSigningConfigArgs args, CustomResourceOptions? options = null)
            : base("aws:lambda/codeSigningConfig:CodeSigningConfig", name, args ?? new CodeSigningConfigArgs(), MakeResourceOptions(options, ""))
        {
        }

        private CodeSigningConfig(string name, Input<string> id, CodeSigningConfigState? state = null, CustomResourceOptions? options = null)
            : base("aws:lambda/codeSigningConfig:CodeSigningConfig", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing CodeSigningConfig resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static CodeSigningConfig Get(string name, Input<string> id, CodeSigningConfigState? state = null, CustomResourceOptions? options = null)
        {
            return new CodeSigningConfig(name, id, state, options);
        }
    }

    public sealed class CodeSigningConfigArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// A configuration block of allowed publishers as signing profiles for this code signing configuration. Detailed below.
        /// </summary>
        [Input("allowedPublishers", required: true)]
        public Input<Inputs.CodeSigningConfigAllowedPublishersArgs> AllowedPublishers { get; set; } = null!;

        /// <summary>
        /// Descriptive name for this code signing configuration.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// A configuration block of code signing policies that define the actions to take if the validation checks fail. Detailed below.
        /// </summary>
        [Input("policies")]
        public Input<Inputs.CodeSigningConfigPoliciesArgs>? Policies { get; set; }

        public CodeSigningConfigArgs()
        {
        }
    }

    public sealed class CodeSigningConfigState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// A configuration block of allowed publishers as signing profiles for this code signing configuration. Detailed below.
        /// </summary>
        [Input("allowedPublishers")]
        public Input<Inputs.CodeSigningConfigAllowedPublishersGetArgs>? AllowedPublishers { get; set; }

        /// <summary>
        /// The Amazon Resource Name (ARN) of the code signing configuration.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// Unique identifier for the code signing configuration.
        /// </summary>
        [Input("configId")]
        public Input<string>? ConfigId { get; set; }

        /// <summary>
        /// Descriptive name for this code signing configuration.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The date and time that the code signing configuration was last modified.
        /// </summary>
        [Input("lastModified")]
        public Input<string>? LastModified { get; set; }

        /// <summary>
        /// A configuration block of code signing policies that define the actions to take if the validation checks fail. Detailed below.
        /// </summary>
        [Input("policies")]
        public Input<Inputs.CodeSigningConfigPoliciesGetArgs>? Policies { get; set; }

        public CodeSigningConfigState()
        {
        }
    }
}