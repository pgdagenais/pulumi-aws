// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appsync;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApiKeyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApiKeyArgs Empty = new ApiKeyArgs();

    /**
     * The ID of the associated AppSync API
     * 
     */
    @Import(name="apiId", required=true)
    private Output<String> apiId;

    /**
     * @return The ID of the associated AppSync API
     * 
     */
    public Output<String> apiId() {
        return this.apiId;
    }

    /**
     * The API key description. Defaults to &#34;Managed by Pulumi&#34;.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The API key description. Defaults to &#34;Managed by Pulumi&#34;.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * RFC3339 string representation of the expiry date. Rounded down to nearest hour. By default, it is 7 days from the date of creation.
     * 
     */
    @Import(name="expires")
    private @Nullable Output<String> expires;

    /**
     * @return RFC3339 string representation of the expiry date. Rounded down to nearest hour. By default, it is 7 days from the date of creation.
     * 
     */
    public Optional<Output<String>> expires() {
        return Optional.ofNullable(this.expires);
    }

    private ApiKeyArgs() {}

    private ApiKeyArgs(ApiKeyArgs $) {
        this.apiId = $.apiId;
        this.description = $.description;
        this.expires = $.expires;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApiKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiKeyArgs $;

        public Builder() {
            $ = new ApiKeyArgs();
        }

        public Builder(ApiKeyArgs defaults) {
            $ = new ApiKeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiId The ID of the associated AppSync API
         * 
         * @return builder
         * 
         */
        public Builder apiId(Output<String> apiId) {
            $.apiId = apiId;
            return this;
        }

        /**
         * @param apiId The ID of the associated AppSync API
         * 
         * @return builder
         * 
         */
        public Builder apiId(String apiId) {
            return apiId(Output.of(apiId));
        }

        /**
         * @param description The API key description. Defaults to &#34;Managed by Pulumi&#34;.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The API key description. Defaults to &#34;Managed by Pulumi&#34;.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param expires RFC3339 string representation of the expiry date. Rounded down to nearest hour. By default, it is 7 days from the date of creation.
         * 
         * @return builder
         * 
         */
        public Builder expires(@Nullable Output<String> expires) {
            $.expires = expires;
            return this;
        }

        /**
         * @param expires RFC3339 string representation of the expiry date. Rounded down to nearest hour. By default, it is 7 days from the date of creation.
         * 
         * @return builder
         * 
         */
        public Builder expires(String expires) {
            return expires(Output.of(expires));
        }

        public ApiKeyArgs build() {
            $.apiId = Objects.requireNonNull($.apiId, "expected parameter 'apiId' to be non-null");
            $.description = Codegen.stringProp("description").output().arg($.description).def("Managed by Pulumi").getNullable();
            return $;
        }
    }

}