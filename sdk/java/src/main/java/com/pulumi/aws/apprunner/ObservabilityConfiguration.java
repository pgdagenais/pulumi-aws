// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apprunner;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.apprunner.ObservabilityConfigurationArgs;
import com.pulumi.aws.apprunner.inputs.ObservabilityConfigurationState;
import com.pulumi.aws.apprunner.outputs.ObservabilityConfigurationTraceConfiguration;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an App Runner Observability Configuration.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.apprunner.ObservabilityConfiguration;
 * import com.pulumi.aws.apprunner.ObservabilityConfigurationArgs;
 * import com.pulumi.aws.apprunner.inputs.ObservabilityConfigurationTraceConfigurationArgs;
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
 *         var example = new ObservabilityConfiguration(&#34;example&#34;, ObservabilityConfigurationArgs.builder()        
 *             .observabilityConfigurationName(&#34;example&#34;)
 *             .tags(Map.of(&#34;Name&#34;, &#34;example-apprunner-observability-configuration&#34;))
 *             .traceConfiguration(ObservabilityConfigurationTraceConfigurationArgs.builder()
 *                 .vendor(&#34;AWSXRAY&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * App Runner Observability Configuration can be imported by using the `arn`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:apprunner/observabilityConfiguration:ObservabilityConfiguration example &#34;arn:aws:apprunner:us-east-1:1234567890:observabilityconfiguration/example/1/d75bc7ea55b71e724fe5c23452fe22a1
 * ```
 * 
 */
@ResourceType(type="aws:apprunner/observabilityConfiguration:ObservabilityConfiguration")
public class ObservabilityConfiguration extends com.pulumi.resources.CustomResource {
    /**
     * ARN of this observability configuration.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return ARN of this observability configuration.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Whether the observability configuration has the highest `observability_configuration_revision` among all configurations that share the same `observability_configuration_name`.
     * 
     */
    @Export(name="latest", type=Boolean.class, parameters={})
    private Output<Boolean> latest;

    /**
     * @return Whether the observability configuration has the highest `observability_configuration_revision` among all configurations that share the same `observability_configuration_name`.
     * 
     */
    public Output<Boolean> latest() {
        return this.latest;
    }
    /**
     * Name of the observability configuration.
     * 
     */
    @Export(name="observabilityConfigurationName", type=String.class, parameters={})
    private Output<String> observabilityConfigurationName;

    /**
     * @return Name of the observability configuration.
     * 
     */
    public Output<String> observabilityConfigurationName() {
        return this.observabilityConfigurationName;
    }
    /**
     * The revision of this observability configuration.
     * 
     */
    @Export(name="observabilityConfigurationRevision", type=Integer.class, parameters={})
    private Output<Integer> observabilityConfigurationRevision;

    /**
     * @return The revision of this observability configuration.
     * 
     */
    public Output<Integer> observabilityConfigurationRevision() {
        return this.observabilityConfigurationRevision;
    }
    /**
     * The current state of the observability configuration. An INACTIVE configuration revision has been deleted and can&#39;t be used. It is permanently removed some time after deletion.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The current state of the observability configuration. An INACTIVE configuration revision has been deleted and can&#39;t be used. It is permanently removed some time after deletion.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * The configuration of the tracing feature within this observability configuration. If you don&#39;t specify it, App Runner doesn&#39;t enable tracing. See Trace Configuration below for more details.
     * 
     */
    @Export(name="traceConfiguration", type=ObservabilityConfigurationTraceConfiguration.class, parameters={})
    private Output</* @Nullable */ ObservabilityConfigurationTraceConfiguration> traceConfiguration;

    /**
     * @return The configuration of the tracing feature within this observability configuration. If you don&#39;t specify it, App Runner doesn&#39;t enable tracing. See Trace Configuration below for more details.
     * 
     */
    public Output<Optional<ObservabilityConfigurationTraceConfiguration>> traceConfiguration() {
        return Codegen.optional(this.traceConfiguration);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ObservabilityConfiguration(String name) {
        this(name, ObservabilityConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ObservabilityConfiguration(String name, ObservabilityConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ObservabilityConfiguration(String name, ObservabilityConfigurationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:apprunner/observabilityConfiguration:ObservabilityConfiguration", name, args == null ? ObservabilityConfigurationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ObservabilityConfiguration(String name, Output<String> id, @Nullable ObservabilityConfigurationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:apprunner/observabilityConfiguration:ObservabilityConfiguration", name, state, makeResourceOptions(options, id));
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
    public static ObservabilityConfiguration get(String name, Output<String> id, @Nullable ObservabilityConfigurationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ObservabilityConfiguration(name, id, state, options);
    }
}