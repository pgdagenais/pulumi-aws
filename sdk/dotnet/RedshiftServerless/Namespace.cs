// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.RedshiftServerless
{
    /// <summary>
    /// Creates a new Amazon Redshift Serverless Namespace.
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
    ///         var example = new Aws.RedshiftServerless.Namespace("example", new Aws.RedshiftServerless.NamespaceArgs
    ///         {
    ///             NamespaceName = "concurrency-scaling",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Redshift Servreless Namespaces can be imported using the `namespace_name`, e.g.,
    /// 
    /// ```sh
    ///  $ pulumi import aws:redshiftserverless/namespace:Namespace example example
    /// ```
    /// </summary>
    [AwsResourceType("aws:redshiftserverless/namespace:Namespace")]
    public partial class Namespace : Pulumi.CustomResource
    {
        /// <summary>
        /// The password of the administrator for the first database created in the namespace.
        /// </summary>
        [Output("adminUserPassword")]
        public Output<string?> AdminUserPassword { get; private set; } = null!;

        /// <summary>
        /// The username of the administrator for the first database created in the namespace.
        /// </summary>
        [Output("adminUsername")]
        public Output<string> AdminUsername { get; private set; } = null!;

        /// <summary>
        /// Amazon Resource Name (ARN) of the Redshift Serverless Namespace.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// The name of the first database created in the namespace.
        /// </summary>
        [Output("dbName")]
        public Output<string?> DbName { get; private set; } = null!;

        /// <summary>
        /// The Amazon Resource Name (ARN) of the IAM role to set as a default in the namespace.
        /// </summary>
        [Output("defaultIamRoleArn")]
        public Output<string?> DefaultIamRoleArn { get; private set; } = null!;

        /// <summary>
        /// A list of IAM roles to associate with the namespace.
        /// </summary>
        [Output("iamRoles")]
        public Output<ImmutableArray<string>> IamRoles { get; private set; } = null!;

        /// <summary>
        /// The ARN of the Amazon Web Services Key Management Service key used to encrypt your data.
        /// </summary>
        [Output("kmsKeyId")]
        public Output<string> KmsKeyId { get; private set; } = null!;

        /// <summary>
        /// The types of logs the namespace can export. Available export types are `userlog`, `connectionlog`, and `useractivitylog`.
        /// </summary>
        [Output("logExports")]
        public Output<ImmutableArray<string>> LogExports { get; private set; } = null!;

        /// <summary>
        /// The Redshift Namespace ID.
        /// </summary>
        [Output("namespaceId")]
        public Output<string> NamespaceId { get; private set; } = null!;

        /// <summary>
        /// The name of the namespace.
        /// </summary>
        [Output("namespaceName")]
        public Output<string> NamespaceName { get; private set; } = null!;

        /// <summary>
        /// A map of tags to assign to the resource. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;


        /// <summary>
        /// Create a Namespace resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Namespace(string name, NamespaceArgs args, CustomResourceOptions? options = null)
            : base("aws:redshiftserverless/namespace:Namespace", name, args ?? new NamespaceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Namespace(string name, Input<string> id, NamespaceState? state = null, CustomResourceOptions? options = null)
            : base("aws:redshiftserverless/namespace:Namespace", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Namespace resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Namespace Get(string name, Input<string> id, NamespaceState? state = null, CustomResourceOptions? options = null)
        {
            return new Namespace(name, id, state, options);
        }
    }

    public sealed class NamespaceArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The password of the administrator for the first database created in the namespace.
        /// </summary>
        [Input("adminUserPassword")]
        public Input<string>? AdminUserPassword { get; set; }

        /// <summary>
        /// The username of the administrator for the first database created in the namespace.
        /// </summary>
        [Input("adminUsername")]
        public Input<string>? AdminUsername { get; set; }

        /// <summary>
        /// The name of the first database created in the namespace.
        /// </summary>
        [Input("dbName")]
        public Input<string>? DbName { get; set; }

        /// <summary>
        /// The Amazon Resource Name (ARN) of the IAM role to set as a default in the namespace.
        /// </summary>
        [Input("defaultIamRoleArn")]
        public Input<string>? DefaultIamRoleArn { get; set; }

        [Input("iamRoles")]
        private InputList<string>? _iamRoles;

        /// <summary>
        /// A list of IAM roles to associate with the namespace.
        /// </summary>
        public InputList<string> IamRoles
        {
            get => _iamRoles ?? (_iamRoles = new InputList<string>());
            set => _iamRoles = value;
        }

        /// <summary>
        /// The ARN of the Amazon Web Services Key Management Service key used to encrypt your data.
        /// </summary>
        [Input("kmsKeyId")]
        public Input<string>? KmsKeyId { get; set; }

        [Input("logExports")]
        private InputList<string>? _logExports;

        /// <summary>
        /// The types of logs the namespace can export. Available export types are `userlog`, `connectionlog`, and `useractivitylog`.
        /// </summary>
        public InputList<string> LogExports
        {
            get => _logExports ?? (_logExports = new InputList<string>());
            set => _logExports = value;
        }

        /// <summary>
        /// The name of the namespace.
        /// </summary>
        [Input("namespaceName", required: true)]
        public Input<string> NamespaceName { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the resource. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("tagsAll")]
        private InputMap<string>? _tagsAll;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
        /// </summary>
        public InputMap<string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new InputMap<string>());
            set => _tagsAll = value;
        }

        public NamespaceArgs()
        {
        }
    }

    public sealed class NamespaceState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The password of the administrator for the first database created in the namespace.
        /// </summary>
        [Input("adminUserPassword")]
        public Input<string>? AdminUserPassword { get; set; }

        /// <summary>
        /// The username of the administrator for the first database created in the namespace.
        /// </summary>
        [Input("adminUsername")]
        public Input<string>? AdminUsername { get; set; }

        /// <summary>
        /// Amazon Resource Name (ARN) of the Redshift Serverless Namespace.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// The name of the first database created in the namespace.
        /// </summary>
        [Input("dbName")]
        public Input<string>? DbName { get; set; }

        /// <summary>
        /// The Amazon Resource Name (ARN) of the IAM role to set as a default in the namespace.
        /// </summary>
        [Input("defaultIamRoleArn")]
        public Input<string>? DefaultIamRoleArn { get; set; }

        [Input("iamRoles")]
        private InputList<string>? _iamRoles;

        /// <summary>
        /// A list of IAM roles to associate with the namespace.
        /// </summary>
        public InputList<string> IamRoles
        {
            get => _iamRoles ?? (_iamRoles = new InputList<string>());
            set => _iamRoles = value;
        }

        /// <summary>
        /// The ARN of the Amazon Web Services Key Management Service key used to encrypt your data.
        /// </summary>
        [Input("kmsKeyId")]
        public Input<string>? KmsKeyId { get; set; }

        [Input("logExports")]
        private InputList<string>? _logExports;

        /// <summary>
        /// The types of logs the namespace can export. Available export types are `userlog`, `connectionlog`, and `useractivitylog`.
        /// </summary>
        public InputList<string> LogExports
        {
            get => _logExports ?? (_logExports = new InputList<string>());
            set => _logExports = value;
        }

        /// <summary>
        /// The Redshift Namespace ID.
        /// </summary>
        [Input("namespaceId")]
        public Input<string>? NamespaceId { get; set; }

        /// <summary>
        /// The name of the namespace.
        /// </summary>
        [Input("namespaceName")]
        public Input<string>? NamespaceName { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the resource. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("tagsAll")]
        private InputMap<string>? _tagsAll;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
        /// </summary>
        public InputMap<string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new InputMap<string>());
            set => _tagsAll = value;
        }

        public NamespaceState()
        {
        }
    }
}