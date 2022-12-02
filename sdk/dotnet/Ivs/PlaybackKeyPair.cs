// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ivs
{
    /// <summary>
    /// Resource for managing an AWS IVS (Interactive Video) Playback Key Pair.
    /// 
    /// ## Example Usage
    /// ### Basic Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.IO;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.Ivs.PlaybackKeyPair("example", new()
    ///     {
    ///         PublicKey = File.ReadAllText("./public-key.pem"),
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// IVS (Interactive Video) Playback Key Pair can be imported using the ARN, e.g.,
    /// 
    /// ```sh
    ///  $ pulumi import aws:ivs/playbackKeyPair:PlaybackKeyPair example arn:aws:ivs:us-west-2:326937407773:playback-key/KDJRJNQhiQzA
    /// ```
    /// </summary>
    [AwsResourceType("aws:ivs/playbackKeyPair:PlaybackKeyPair")]
    public partial class PlaybackKeyPair : global::Pulumi.CustomResource
    {
        /// <summary>
        /// ARN of the Playback Key Pair.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// Key-pair identifier.
        /// </summary>
        [Output("fingerprint")]
        public Output<string> Fingerprint { get; private set; } = null!;

        /// <summary>
        /// Playback Key Pair name.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Public portion of a customer-generated key pair. Must be an ECDSA public key in PEM format.
        /// </summary>
        [Output("publicKey")]
        public Output<string> PublicKey { get; private set; } = null!;

        /// <summary>
        /// A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;


        /// <summary>
        /// Create a PlaybackKeyPair resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public PlaybackKeyPair(string name, PlaybackKeyPairArgs args, CustomResourceOptions? options = null)
            : base("aws:ivs/playbackKeyPair:PlaybackKeyPair", name, args ?? new PlaybackKeyPairArgs(), MakeResourceOptions(options, ""))
        {
        }

        private PlaybackKeyPair(string name, Input<string> id, PlaybackKeyPairState? state = null, CustomResourceOptions? options = null)
            : base("aws:ivs/playbackKeyPair:PlaybackKeyPair", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing PlaybackKeyPair resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static PlaybackKeyPair Get(string name, Input<string> id, PlaybackKeyPairState? state = null, CustomResourceOptions? options = null)
        {
            return new PlaybackKeyPair(name, id, state, options);
        }
    }

    public sealed class PlaybackKeyPairArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Playback Key Pair name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Public portion of a customer-generated key pair. Must be an ECDSA public key in PEM format.
        /// </summary>
        [Input("publicKey", required: true)]
        public Input<string> PublicKey { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public PlaybackKeyPairArgs()
        {
        }
        public static new PlaybackKeyPairArgs Empty => new PlaybackKeyPairArgs();
    }

    public sealed class PlaybackKeyPairState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// ARN of the Playback Key Pair.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// Key-pair identifier.
        /// </summary>
        [Input("fingerprint")]
        public Input<string>? Fingerprint { get; set; }

        /// <summary>
        /// Playback Key Pair name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Public portion of a customer-generated key pair. Must be an ECDSA public key in PEM format.
        /// </summary>
        [Input("publicKey")]
        public Input<string>? PublicKey { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("tagsAll")]
        private InputMap<string>? _tagsAll;

        /// <summary>
        /// Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        public InputMap<string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new InputMap<string>());
            set => _tagsAll = value;
        }

        public PlaybackKeyPairState()
        {
        }
        public static new PlaybackKeyPairState Empty => new PlaybackKeyPairState();
    }
}