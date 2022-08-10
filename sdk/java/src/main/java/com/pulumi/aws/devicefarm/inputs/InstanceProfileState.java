// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.devicefarm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceProfileState extends com.pulumi.resources.ResourceArgs {

    public static final InstanceProfileState Empty = new InstanceProfileState();

    /**
     * The Amazon Resource Name of this instance profile.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return The Amazon Resource Name of this instance profile.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The description of the instance profile.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the instance profile.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * An array of strings that specifies the list of app packages that should not be cleaned up from the device after a test run.
     * 
     */
    @Import(name="excludeAppPackagesFromCleanups")
    private @Nullable Output<List<String>> excludeAppPackagesFromCleanups;

    /**
     * @return An array of strings that specifies the list of app packages that should not be cleaned up from the device after a test run.
     * 
     */
    public Optional<Output<List<String>>> excludeAppPackagesFromCleanups() {
        return Optional.ofNullable(this.excludeAppPackagesFromCleanups);
    }

    /**
     * The name for the instance profile.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name for the instance profile.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * When set to `true`, Device Farm removes app packages after a test run. The default value is `false` for private devices.
     * 
     */
    @Import(name="packageCleanup")
    private @Nullable Output<Boolean> packageCleanup;

    /**
     * @return When set to `true`, Device Farm removes app packages after a test run. The default value is `false` for private devices.
     * 
     */
    public Optional<Output<Boolean>> packageCleanup() {
        return Optional.ofNullable(this.packageCleanup);
    }

    /**
     * When set to `true`, Device Farm reboots the instance after a test run. The default value is `true`.
     * 
     */
    @Import(name="rebootAfterUse")
    private @Nullable Output<Boolean> rebootAfterUse;

    /**
     * @return When set to `true`, Device Farm reboots the instance after a test run. The default value is `true`.
     * 
     */
    public Optional<Output<Boolean>> rebootAfterUse() {
        return Optional.ofNullable(this.rebootAfterUse);
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    private InstanceProfileState() {}

    private InstanceProfileState(InstanceProfileState $) {
        this.arn = $.arn;
        this.description = $.description;
        this.excludeAppPackagesFromCleanups = $.excludeAppPackagesFromCleanups;
        this.name = $.name;
        this.packageCleanup = $.packageCleanup;
        this.rebootAfterUse = $.rebootAfterUse;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceProfileState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceProfileState $;

        public Builder() {
            $ = new InstanceProfileState();
        }

        public Builder(InstanceProfileState defaults) {
            $ = new InstanceProfileState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The Amazon Resource Name of this instance profile.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The Amazon Resource Name of this instance profile.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param description The description of the instance profile.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the instance profile.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param excludeAppPackagesFromCleanups An array of strings that specifies the list of app packages that should not be cleaned up from the device after a test run.
         * 
         * @return builder
         * 
         */
        public Builder excludeAppPackagesFromCleanups(@Nullable Output<List<String>> excludeAppPackagesFromCleanups) {
            $.excludeAppPackagesFromCleanups = excludeAppPackagesFromCleanups;
            return this;
        }

        /**
         * @param excludeAppPackagesFromCleanups An array of strings that specifies the list of app packages that should not be cleaned up from the device after a test run.
         * 
         * @return builder
         * 
         */
        public Builder excludeAppPackagesFromCleanups(List<String> excludeAppPackagesFromCleanups) {
            return excludeAppPackagesFromCleanups(Output.of(excludeAppPackagesFromCleanups));
        }

        /**
         * @param excludeAppPackagesFromCleanups An array of strings that specifies the list of app packages that should not be cleaned up from the device after a test run.
         * 
         * @return builder
         * 
         */
        public Builder excludeAppPackagesFromCleanups(String... excludeAppPackagesFromCleanups) {
            return excludeAppPackagesFromCleanups(List.of(excludeAppPackagesFromCleanups));
        }

        /**
         * @param name The name for the instance profile.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name for the instance profile.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param packageCleanup When set to `true`, Device Farm removes app packages after a test run. The default value is `false` for private devices.
         * 
         * @return builder
         * 
         */
        public Builder packageCleanup(@Nullable Output<Boolean> packageCleanup) {
            $.packageCleanup = packageCleanup;
            return this;
        }

        /**
         * @param packageCleanup When set to `true`, Device Farm removes app packages after a test run. The default value is `false` for private devices.
         * 
         * @return builder
         * 
         */
        public Builder packageCleanup(Boolean packageCleanup) {
            return packageCleanup(Output.of(packageCleanup));
        }

        /**
         * @param rebootAfterUse When set to `true`, Device Farm reboots the instance after a test run. The default value is `true`.
         * 
         * @return builder
         * 
         */
        public Builder rebootAfterUse(@Nullable Output<Boolean> rebootAfterUse) {
            $.rebootAfterUse = rebootAfterUse;
            return this;
        }

        /**
         * @param rebootAfterUse When set to `true`, Device Farm reboots the instance after a test run. The default value is `true`.
         * 
         * @return builder
         * 
         */
        public Builder rebootAfterUse(Boolean rebootAfterUse) {
            return rebootAfterUse(Output.of(rebootAfterUse));
        }

        /**
         * @param tags A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        public InstanceProfileState build() {
            return $;
        }
    }

}