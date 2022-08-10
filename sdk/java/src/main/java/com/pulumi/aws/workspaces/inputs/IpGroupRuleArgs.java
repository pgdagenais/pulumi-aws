// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.workspaces.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IpGroupRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final IpGroupRuleArgs Empty = new IpGroupRuleArgs();

    /**
     * The description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The IP address range, in CIDR notation, e.g., `10.0.0.0/16`
     * 
     */
    @Import(name="source", required=true)
    private Output<String> source;

    /**
     * @return The IP address range, in CIDR notation, e.g., `10.0.0.0/16`
     * 
     */
    public Output<String> source() {
        return this.source;
    }

    private IpGroupRuleArgs() {}

    private IpGroupRuleArgs(IpGroupRuleArgs $) {
        this.description = $.description;
        this.source = $.source;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IpGroupRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IpGroupRuleArgs $;

        public Builder() {
            $ = new IpGroupRuleArgs();
        }

        public Builder(IpGroupRuleArgs defaults) {
            $ = new IpGroupRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param source The IP address range, in CIDR notation, e.g., `10.0.0.0/16`
         * 
         * @return builder
         * 
         */
        public Builder source(Output<String> source) {
            $.source = source;
            return this;
        }

        /**
         * @param source The IP address range, in CIDR notation, e.g., `10.0.0.0/16`
         * 
         * @return builder
         * 
         */
        public Builder source(String source) {
            return source(Output.of(source));
        }

        public IpGroupRuleArgs build() {
            $.source = Objects.requireNonNull($.source, "expected parameter 'source' to be non-null");
            return $;
        }
    }

}