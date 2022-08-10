// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.imagebuilder;

import com.pulumi.aws.imagebuilder.inputs.ImageRecipeBlockDeviceMappingArgs;
import com.pulumi.aws.imagebuilder.inputs.ImageRecipeComponentArgs;
import com.pulumi.aws.imagebuilder.inputs.ImageRecipeSystemsManagerAgentArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ImageRecipeArgs extends com.pulumi.resources.ResourceArgs {

    public static final ImageRecipeArgs Empty = new ImageRecipeArgs();

    /**
     * Configuration block(s) with block device mappings for the image recipe. Detailed below.
     * 
     */
    @Import(name="blockDeviceMappings")
    private @Nullable Output<List<ImageRecipeBlockDeviceMappingArgs>> blockDeviceMappings;

    /**
     * @return Configuration block(s) with block device mappings for the image recipe. Detailed below.
     * 
     */
    public Optional<Output<List<ImageRecipeBlockDeviceMappingArgs>>> blockDeviceMappings() {
        return Optional.ofNullable(this.blockDeviceMappings);
    }

    /**
     * Ordered configuration block(s) with components for the image recipe. Detailed below.
     * 
     */
    @Import(name="components", required=true)
    private Output<List<ImageRecipeComponentArgs>> components;

    /**
     * @return Ordered configuration block(s) with components for the image recipe. Detailed below.
     * 
     */
    public Output<List<ImageRecipeComponentArgs>> components() {
        return this.components;
    }

    /**
     * Description of the image recipe.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the image recipe.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The name of the component parameter.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the component parameter.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Platform of the image recipe.
     * 
     */
    @Import(name="parentImage", required=true)
    private Output<String> parentImage;

    /**
     * @return Platform of the image recipe.
     * 
     */
    public Output<String> parentImage() {
        return this.parentImage;
    }

    /**
     * Configuration block for the Systems Manager Agent installed by default by Image Builder. Detailed below.
     * 
     */
    @Import(name="systemsManagerAgent")
    private @Nullable Output<ImageRecipeSystemsManagerAgentArgs> systemsManagerAgent;

    /**
     * @return Configuration block for the Systems Manager Agent installed by default by Image Builder. Detailed below.
     * 
     */
    public Optional<Output<ImageRecipeSystemsManagerAgentArgs>> systemsManagerAgent() {
        return Optional.ofNullable(this.systemsManagerAgent);
    }

    /**
     * Key-value map of resource tags for the image recipe. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags for the image recipe. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Base64 encoded user data. Use this to provide commands or a command script to run when you launch your build instance.
     * 
     */
    @Import(name="userDataBase64")
    private @Nullable Output<String> userDataBase64;

    /**
     * @return Base64 encoded user data. Use this to provide commands or a command script to run when you launch your build instance.
     * 
     */
    public Optional<Output<String>> userDataBase64() {
        return Optional.ofNullable(this.userDataBase64);
    }

    /**
     * Version of the image recipe.
     * 
     */
    @Import(name="version", required=true)
    private Output<String> version;

    /**
     * @return Version of the image recipe.
     * 
     */
    public Output<String> version() {
        return this.version;
    }

    /**
     * The working directory to be used during build and test workflows.
     * 
     */
    @Import(name="workingDirectory")
    private @Nullable Output<String> workingDirectory;

    /**
     * @return The working directory to be used during build and test workflows.
     * 
     */
    public Optional<Output<String>> workingDirectory() {
        return Optional.ofNullable(this.workingDirectory);
    }

    private ImageRecipeArgs() {}

    private ImageRecipeArgs(ImageRecipeArgs $) {
        this.blockDeviceMappings = $.blockDeviceMappings;
        this.components = $.components;
        this.description = $.description;
        this.name = $.name;
        this.parentImage = $.parentImage;
        this.systemsManagerAgent = $.systemsManagerAgent;
        this.tags = $.tags;
        this.userDataBase64 = $.userDataBase64;
        this.version = $.version;
        this.workingDirectory = $.workingDirectory;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ImageRecipeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ImageRecipeArgs $;

        public Builder() {
            $ = new ImageRecipeArgs();
        }

        public Builder(ImageRecipeArgs defaults) {
            $ = new ImageRecipeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param blockDeviceMappings Configuration block(s) with block device mappings for the image recipe. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder blockDeviceMappings(@Nullable Output<List<ImageRecipeBlockDeviceMappingArgs>> blockDeviceMappings) {
            $.blockDeviceMappings = blockDeviceMappings;
            return this;
        }

        /**
         * @param blockDeviceMappings Configuration block(s) with block device mappings for the image recipe. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder blockDeviceMappings(List<ImageRecipeBlockDeviceMappingArgs> blockDeviceMappings) {
            return blockDeviceMappings(Output.of(blockDeviceMappings));
        }

        /**
         * @param blockDeviceMappings Configuration block(s) with block device mappings for the image recipe. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder blockDeviceMappings(ImageRecipeBlockDeviceMappingArgs... blockDeviceMappings) {
            return blockDeviceMappings(List.of(blockDeviceMappings));
        }

        /**
         * @param components Ordered configuration block(s) with components for the image recipe. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder components(Output<List<ImageRecipeComponentArgs>> components) {
            $.components = components;
            return this;
        }

        /**
         * @param components Ordered configuration block(s) with components for the image recipe. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder components(List<ImageRecipeComponentArgs> components) {
            return components(Output.of(components));
        }

        /**
         * @param components Ordered configuration block(s) with components for the image recipe. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder components(ImageRecipeComponentArgs... components) {
            return components(List.of(components));
        }

        /**
         * @param description Description of the image recipe.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the image recipe.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name The name of the component parameter.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the component parameter.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param parentImage Platform of the image recipe.
         * 
         * @return builder
         * 
         */
        public Builder parentImage(Output<String> parentImage) {
            $.parentImage = parentImage;
            return this;
        }

        /**
         * @param parentImage Platform of the image recipe.
         * 
         * @return builder
         * 
         */
        public Builder parentImage(String parentImage) {
            return parentImage(Output.of(parentImage));
        }

        /**
         * @param systemsManagerAgent Configuration block for the Systems Manager Agent installed by default by Image Builder. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder systemsManagerAgent(@Nullable Output<ImageRecipeSystemsManagerAgentArgs> systemsManagerAgent) {
            $.systemsManagerAgent = systemsManagerAgent;
            return this;
        }

        /**
         * @param systemsManagerAgent Configuration block for the Systems Manager Agent installed by default by Image Builder. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder systemsManagerAgent(ImageRecipeSystemsManagerAgentArgs systemsManagerAgent) {
            return systemsManagerAgent(Output.of(systemsManagerAgent));
        }

        /**
         * @param tags Key-value map of resource tags for the image recipe. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Key-value map of resource tags for the image recipe. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param userDataBase64 Base64 encoded user data. Use this to provide commands or a command script to run when you launch your build instance.
         * 
         * @return builder
         * 
         */
        public Builder userDataBase64(@Nullable Output<String> userDataBase64) {
            $.userDataBase64 = userDataBase64;
            return this;
        }

        /**
         * @param userDataBase64 Base64 encoded user data. Use this to provide commands or a command script to run when you launch your build instance.
         * 
         * @return builder
         * 
         */
        public Builder userDataBase64(String userDataBase64) {
            return userDataBase64(Output.of(userDataBase64));
        }

        /**
         * @param version Version of the image recipe.
         * 
         * @return builder
         * 
         */
        public Builder version(Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version Version of the image recipe.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        /**
         * @param workingDirectory The working directory to be used during build and test workflows.
         * 
         * @return builder
         * 
         */
        public Builder workingDirectory(@Nullable Output<String> workingDirectory) {
            $.workingDirectory = workingDirectory;
            return this;
        }

        /**
         * @param workingDirectory The working directory to be used during build and test workflows.
         * 
         * @return builder
         * 
         */
        public Builder workingDirectory(String workingDirectory) {
            return workingDirectory(Output.of(workingDirectory));
        }

        public ImageRecipeArgs build() {
            $.components = Objects.requireNonNull($.components, "expected parameter 'components' to be non-null");
            $.parentImage = Objects.requireNonNull($.parentImage, "expected parameter 'parentImage' to be non-null");
            $.version = Objects.requireNonNull($.version, "expected parameter 'version' to be non-null");
            return $;
        }
    }

}