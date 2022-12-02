// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.CloudWatch
{
    /// <summary>
    /// Provides a CloudWatch Log Data Protection Policy resource.
    /// 
    /// Read more about protecting sensitive user data in the [User Guide](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/mask-sensitive-log-data.html).
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Text.Json;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var exampleLogGroup = new Aws.CloudWatch.LogGroup("exampleLogGroup");
    /// 
    ///     var exampleBucketV2 = new Aws.S3.BucketV2("exampleBucketV2");
    /// 
    ///     var exampleLogDataProtectionPolicy = new Aws.CloudWatch.LogDataProtectionPolicy("exampleLogDataProtectionPolicy", new()
    ///     {
    ///         LogGroupName = exampleLogGroup.Name,
    ///         PolicyDocument = exampleBucketV2.Bucket.Apply(bucket =&gt; JsonSerializer.Serialize(new Dictionary&lt;string, object?&gt;
    ///         {
    ///             ["Name"] = "Example",
    ///             ["Version"] = "2021-06-01",
    ///             ["Statement"] = new[]
    ///             {
    ///                 new Dictionary&lt;string, object?&gt;
    ///                 {
    ///                     ["Sid"] = "Audit",
    ///                     ["DataIdentifier"] = new[]
    ///                     {
    ///                         "arn:aws:dataprotection::aws:data-identifier/EmailAddress",
    ///                     },
    ///                     ["Operation"] = new Dictionary&lt;string, object?&gt;
    ///                     {
    ///                         ["Audit"] = new Dictionary&lt;string, object?&gt;
    ///                         {
    ///                             ["FindingsDestination"] = new Dictionary&lt;string, object?&gt;
    ///                             {
    ///                                 ["S3"] = new Dictionary&lt;string, object?&gt;
    ///                                 {
    ///                                     ["Bucket"] = bucket,
    ///                                 },
    ///                             },
    ///                         },
    ///                     },
    ///                 },
    ///                 new Dictionary&lt;string, object?&gt;
    ///                 {
    ///                     ["Sid"] = "Redact",
    ///                     ["DataIdentifier"] = new[]
    ///                     {
    ///                         "arn:aws:dataprotection::aws:data-identifier/EmailAddress",
    ///                     },
    ///                     ["Operation"] = new Dictionary&lt;string, object?&gt;
    ///                     {
    ///                         ["Deidentify"] = new Dictionary&lt;string, object?&gt;
    ///                         {
    ///                             ["MaskConfig"] = new Dictionary&lt;string, object?&gt;
    ///                             {
    ///                             },
    ///                         },
    ///                     },
    ///                 },
    ///             },
    ///         })),
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// This resource can be imported using the `log_group_name`. For example
    /// 
    /// ```sh
    ///  $ pulumi import aws:cloudwatch/logDataProtectionPolicy:LogDataProtectionPolicy example my-log-group
    /// ```
    /// </summary>
    [AwsResourceType("aws:cloudwatch/logDataProtectionPolicy:LogDataProtectionPolicy")]
    public partial class LogDataProtectionPolicy : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The name of the log group under which the log stream is to be created.
        /// </summary>
        [Output("logGroupName")]
        public Output<string> LogGroupName { get; private set; } = null!;

        /// <summary>
        /// Specifies the data protection policy in JSON. Read more at [Data protection policy syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/mask-sensitive-log-data-start.html#mask-sensitive-log-data-policysyntax).
        /// </summary>
        [Output("policyDocument")]
        public Output<string> PolicyDocument { get; private set; } = null!;


        /// <summary>
        /// Create a LogDataProtectionPolicy resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public LogDataProtectionPolicy(string name, LogDataProtectionPolicyArgs args, CustomResourceOptions? options = null)
            : base("aws:cloudwatch/logDataProtectionPolicy:LogDataProtectionPolicy", name, args ?? new LogDataProtectionPolicyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private LogDataProtectionPolicy(string name, Input<string> id, LogDataProtectionPolicyState? state = null, CustomResourceOptions? options = null)
            : base("aws:cloudwatch/logDataProtectionPolicy:LogDataProtectionPolicy", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing LogDataProtectionPolicy resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static LogDataProtectionPolicy Get(string name, Input<string> id, LogDataProtectionPolicyState? state = null, CustomResourceOptions? options = null)
        {
            return new LogDataProtectionPolicy(name, id, state, options);
        }
    }

    public sealed class LogDataProtectionPolicyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the log group under which the log stream is to be created.
        /// </summary>
        [Input("logGroupName", required: true)]
        public Input<string> LogGroupName { get; set; } = null!;

        /// <summary>
        /// Specifies the data protection policy in JSON. Read more at [Data protection policy syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/mask-sensitive-log-data-start.html#mask-sensitive-log-data-policysyntax).
        /// </summary>
        [Input("policyDocument", required: true)]
        public Input<string> PolicyDocument { get; set; } = null!;

        public LogDataProtectionPolicyArgs()
        {
        }
        public static new LogDataProtectionPolicyArgs Empty => new LogDataProtectionPolicyArgs();
    }

    public sealed class LogDataProtectionPolicyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the log group under which the log stream is to be created.
        /// </summary>
        [Input("logGroupName")]
        public Input<string>? LogGroupName { get; set; }

        /// <summary>
        /// Specifies the data protection policy in JSON. Read more at [Data protection policy syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/mask-sensitive-log-data-start.html#mask-sensitive-log-data-policysyntax).
        /// </summary>
        [Input("policyDocument")]
        public Input<string>? PolicyDocument { get; set; }

        public LogDataProtectionPolicyState()
        {
        }
        public static new LogDataProtectionPolicyState Empty => new LogDataProtectionPolicyState();
    }
}