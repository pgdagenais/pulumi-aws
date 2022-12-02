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
    /// Resource for managing an AWS SESv2 (Simple Email V2) Email Identity Mail From Attributes.
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
    ///     var exampleEmailIdentity = new Aws.SesV2.EmailIdentity("exampleEmailIdentity", new()
    ///     {
    ///         EmailIdentityDetails = "example.com",
    ///     });
    /// 
    ///     var exampleEmailIdentityMailFromAttributes = new Aws.SesV2.EmailIdentityMailFromAttributes("exampleEmailIdentityMailFromAttributes", new()
    ///     {
    ///         EmailIdentity = exampleEmailIdentity.EmailIdentityDetails,
    ///         BehaviorOnMxFailure = "REJECT_MESSAGE",
    ///         MailFromDomain = exampleEmailIdentity.EmailIdentityDetails.Apply(emailIdentity =&gt; $"subdomain.{emailIdentity}"),
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// SESv2 (Simple Email V2) Email Identity Mail From Attributes can be imported using the `email_identity`, e.g.,
    /// 
    /// ```sh
    ///  $ pulumi import aws:sesv2/emailIdentityMailFromAttributes:EmailIdentityMailFromAttributes example example.com
    /// ```
    /// </summary>
    [AwsResourceType("aws:sesv2/emailIdentityMailFromAttributes:EmailIdentityMailFromAttributes")]
    public partial class EmailIdentityMailFromAttributes : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The action to take if the required MX record isn't found when you send an email. Valid values: `USE_DEFAULT_VALUE`, `REJECT_MESSAGE`.
        /// </summary>
        [Output("behaviorOnMxFailure")]
        public Output<string?> BehaviorOnMxFailure { get; private set; } = null!;

        /// <summary>
        /// The verified email identity.
        /// </summary>
        [Output("emailIdentity")]
        public Output<string> EmailIdentity { get; private set; } = null!;

        /// <summary>
        /// The custom MAIL FROM domain that you want the verified identity to use. Required if `behavior_on_mx_failure` is `REJECT_MESSAGE`.
        /// </summary>
        [Output("mailFromDomain")]
        public Output<string?> MailFromDomain { get; private set; } = null!;


        /// <summary>
        /// Create a EmailIdentityMailFromAttributes resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public EmailIdentityMailFromAttributes(string name, EmailIdentityMailFromAttributesArgs args, CustomResourceOptions? options = null)
            : base("aws:sesv2/emailIdentityMailFromAttributes:EmailIdentityMailFromAttributes", name, args ?? new EmailIdentityMailFromAttributesArgs(), MakeResourceOptions(options, ""))
        {
        }

        private EmailIdentityMailFromAttributes(string name, Input<string> id, EmailIdentityMailFromAttributesState? state = null, CustomResourceOptions? options = null)
            : base("aws:sesv2/emailIdentityMailFromAttributes:EmailIdentityMailFromAttributes", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing EmailIdentityMailFromAttributes resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static EmailIdentityMailFromAttributes Get(string name, Input<string> id, EmailIdentityMailFromAttributesState? state = null, CustomResourceOptions? options = null)
        {
            return new EmailIdentityMailFromAttributes(name, id, state, options);
        }
    }

    public sealed class EmailIdentityMailFromAttributesArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The action to take if the required MX record isn't found when you send an email. Valid values: `USE_DEFAULT_VALUE`, `REJECT_MESSAGE`.
        /// </summary>
        [Input("behaviorOnMxFailure")]
        public Input<string>? BehaviorOnMxFailure { get; set; }

        /// <summary>
        /// The verified email identity.
        /// </summary>
        [Input("emailIdentity", required: true)]
        public Input<string> EmailIdentity { get; set; } = null!;

        /// <summary>
        /// The custom MAIL FROM domain that you want the verified identity to use. Required if `behavior_on_mx_failure` is `REJECT_MESSAGE`.
        /// </summary>
        [Input("mailFromDomain")]
        public Input<string>? MailFromDomain { get; set; }

        public EmailIdentityMailFromAttributesArgs()
        {
        }
        public static new EmailIdentityMailFromAttributesArgs Empty => new EmailIdentityMailFromAttributesArgs();
    }

    public sealed class EmailIdentityMailFromAttributesState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The action to take if the required MX record isn't found when you send an email. Valid values: `USE_DEFAULT_VALUE`, `REJECT_MESSAGE`.
        /// </summary>
        [Input("behaviorOnMxFailure")]
        public Input<string>? BehaviorOnMxFailure { get; set; }

        /// <summary>
        /// The verified email identity.
        /// </summary>
        [Input("emailIdentity")]
        public Input<string>? EmailIdentity { get; set; }

        /// <summary>
        /// The custom MAIL FROM domain that you want the verified identity to use. Required if `behavior_on_mx_failure` is `REJECT_MESSAGE`.
        /// </summary>
        [Input("mailFromDomain")]
        public Input<string>? MailFromDomain { get; set; }

        public EmailIdentityMailFromAttributesState()
        {
        }
        public static new EmailIdentityMailFromAttributesState Empty => new EmailIdentityMailFromAttributesState();
    }
}