// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ivs;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ivs.ChannelArgs;
import com.pulumi.aws.ivs.inputs.ChannelState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for managing an AWS IVS (Interactive Video) Channel.
 * 
 * ## Example Usage
 * ### Basic Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.ivs.Channel;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var example = new Channel(&#34;example&#34;);
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * IVS (Interactive Video) Channel can be imported using the ARN, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ivs/channel:Channel example arn:aws:ivs:us-west-2:326937407773:channel/0Y1lcs4U7jk5
 * ```
 * 
 */
@ResourceType(type="aws:ivs/channel:Channel")
public class Channel extends com.pulumi.resources.CustomResource {
    /**
     * ARN of the Channel.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return ARN of the Channel.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * If `true`, channel is private (enabled for playback authorization).
     * 
     */
    @Export(name="authorized", type=Boolean.class, parameters={})
    private Output<Boolean> authorized;

    /**
     * @return If `true`, channel is private (enabled for playback authorization).
     * 
     */
    public Output<Boolean> authorized() {
        return this.authorized;
    }
    /**
     * Channel ingest endpoint, part of the definition of an ingest server, used when setting up streaming software.
     * 
     */
    @Export(name="ingestEndpoint", type=String.class, parameters={})
    private Output<String> ingestEndpoint;

    /**
     * @return Channel ingest endpoint, part of the definition of an ingest server, used when setting up streaming software.
     * 
     */
    public Output<String> ingestEndpoint() {
        return this.ingestEndpoint;
    }
    /**
     * Channel latency mode. Valid values: `NORMAL`, `LOW`.
     * 
     */
    @Export(name="latencyMode", type=String.class, parameters={})
    private Output<String> latencyMode;

    /**
     * @return Channel latency mode. Valid values: `NORMAL`, `LOW`.
     * 
     */
    public Output<String> latencyMode() {
        return this.latencyMode;
    }
    /**
     * Channel name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Channel name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Channel playback URL.
     * 
     */
    @Export(name="playbackUrl", type=String.class, parameters={})
    private Output<String> playbackUrl;

    /**
     * @return Channel playback URL.
     * 
     */
    public Output<String> playbackUrl() {
        return this.playbackUrl;
    }
    /**
     * Recording configuration ARN.
     * 
     */
    @Export(name="recordingConfigurationArn", type=String.class, parameters={})
    private Output<String> recordingConfigurationArn;

    /**
     * @return Recording configuration ARN.
     * 
     */
    public Output<String> recordingConfigurationArn() {
        return this.recordingConfigurationArn;
    }
    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * Channel type, which determines the allowable resolution and bitrate. Valid values: `STANDARD`, `BASIC`.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Channel type, which determines the allowable resolution and bitrate. Valid values: `STANDARD`, `BASIC`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Channel(String name) {
        this(name, ChannelArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Channel(String name, @Nullable ChannelArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Channel(String name, @Nullable ChannelArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ivs/channel:Channel", name, args == null ? ChannelArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Channel(String name, Output<String> id, @Nullable ChannelState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ivs/channel:Channel", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Channel get(String name, Output<String> id, @Nullable ChannelState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Channel(name, id, state, options);
    }
}