// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.glacier;

import com.pulumi.aws.glacier.inputs.VaultNotificationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VaultArgs extends com.pulumi.resources.ResourceArgs {

    public static final VaultArgs Empty = new VaultArgs();

    /**
     * The policy document. This is a JSON formatted string.
     * The heredoc syntax or `file` function is helpful here. Use the [Glacier Developer Guide](https://docs.aws.amazon.com/amazonglacier/latest/dev/vault-access-policy.html) for more information on Glacier Vault Policy
     * 
     */
    @Import(name="accessPolicy")
    private @Nullable Output<String> accessPolicy;

    /**
     * @return The policy document. This is a JSON formatted string.
     * The heredoc syntax or `file` function is helpful here. Use the [Glacier Developer Guide](https://docs.aws.amazon.com/amazonglacier/latest/dev/vault-access-policy.html) for more information on Glacier Vault Policy
     * 
     */
    public Optional<Output<String>> accessPolicy() {
        return Optional.ofNullable(this.accessPolicy);
    }

    /**
     * The name of the Vault. Names can be between 1 and 255 characters long and the valid characters are a-z, A-Z, 0-9, &#39;_&#39; (underscore), &#39;-&#39; (hyphen), and &#39;.&#39; (period).
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Vault. Names can be between 1 and 255 characters long and the valid characters are a-z, A-Z, 0-9, &#39;_&#39; (underscore), &#39;-&#39; (hyphen), and &#39;.&#39; (period).
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The notifications for the Vault. Fields documented below.
     * 
     */
    @Import(name="notification")
    private @Nullable Output<VaultNotificationArgs> notification;

    /**
     * @return The notifications for the Vault. Fields documented below.
     * 
     */
    public Optional<Output<VaultNotificationArgs>> notification() {
        return Optional.ofNullable(this.notification);
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private VaultArgs() {}

    private VaultArgs(VaultArgs $) {
        this.accessPolicy = $.accessPolicy;
        this.name = $.name;
        this.notification = $.notification;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VaultArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VaultArgs $;

        public Builder() {
            $ = new VaultArgs();
        }

        public Builder(VaultArgs defaults) {
            $ = new VaultArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessPolicy The policy document. This is a JSON formatted string.
         * The heredoc syntax or `file` function is helpful here. Use the [Glacier Developer Guide](https://docs.aws.amazon.com/amazonglacier/latest/dev/vault-access-policy.html) for more information on Glacier Vault Policy
         * 
         * @return builder
         * 
         */
        public Builder accessPolicy(@Nullable Output<String> accessPolicy) {
            $.accessPolicy = accessPolicy;
            return this;
        }

        /**
         * @param accessPolicy The policy document. This is a JSON formatted string.
         * The heredoc syntax or `file` function is helpful here. Use the [Glacier Developer Guide](https://docs.aws.amazon.com/amazonglacier/latest/dev/vault-access-policy.html) for more information on Glacier Vault Policy
         * 
         * @return builder
         * 
         */
        public Builder accessPolicy(String accessPolicy) {
            return accessPolicy(Output.of(accessPolicy));
        }

        /**
         * @param name The name of the Vault. Names can be between 1 and 255 characters long and the valid characters are a-z, A-Z, 0-9, &#39;_&#39; (underscore), &#39;-&#39; (hyphen), and &#39;.&#39; (period).
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Vault. Names can be between 1 and 255 characters long and the valid characters are a-z, A-Z, 0-9, &#39;_&#39; (underscore), &#39;-&#39; (hyphen), and &#39;.&#39; (period).
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param notification The notifications for the Vault. Fields documented below.
         * 
         * @return builder
         * 
         */
        public Builder notification(@Nullable Output<VaultNotificationArgs> notification) {
            $.notification = notification;
            return this;
        }

        /**
         * @param notification The notifications for the Vault. Fields documented below.
         * 
         * @return builder
         * 
         */
        public Builder notification(VaultNotificationArgs notification) {
            return notification(Output.of(notification));
        }

        /**
         * @param tags A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public VaultArgs build() {
            return $;
        }
    }

}