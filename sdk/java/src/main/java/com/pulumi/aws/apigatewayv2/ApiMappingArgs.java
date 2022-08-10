// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigatewayv2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApiMappingArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApiMappingArgs Empty = new ApiMappingArgs();

    /**
     * The API identifier.
     * 
     */
    @Import(name="apiId", required=true)
    private Output<String> apiId;

    /**
     * @return The API identifier.
     * 
     */
    public Output<String> apiId() {
        return this.apiId;
    }

    /**
     * The [API mapping key](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-mapping-template-reference.html).
     * 
     */
    @Import(name="apiMappingKey")
    private @Nullable Output<String> apiMappingKey;

    /**
     * @return The [API mapping key](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-mapping-template-reference.html).
     * 
     */
    public Optional<Output<String>> apiMappingKey() {
        return Optional.ofNullable(this.apiMappingKey);
    }

    /**
     * The domain name. Use the `aws.apigatewayv2.DomainName` resource to configure a domain name.
     * 
     */
    @Import(name="domainName", required=true)
    private Output<String> domainName;

    /**
     * @return The domain name. Use the `aws.apigatewayv2.DomainName` resource to configure a domain name.
     * 
     */
    public Output<String> domainName() {
        return this.domainName;
    }

    /**
     * The API stage. Use the `aws.apigatewayv2.Stage` resource to configure an API stage.
     * 
     */
    @Import(name="stage", required=true)
    private Output<String> stage;

    /**
     * @return The API stage. Use the `aws.apigatewayv2.Stage` resource to configure an API stage.
     * 
     */
    public Output<String> stage() {
        return this.stage;
    }

    private ApiMappingArgs() {}

    private ApiMappingArgs(ApiMappingArgs $) {
        this.apiId = $.apiId;
        this.apiMappingKey = $.apiMappingKey;
        this.domainName = $.domainName;
        this.stage = $.stage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApiMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiMappingArgs $;

        public Builder() {
            $ = new ApiMappingArgs();
        }

        public Builder(ApiMappingArgs defaults) {
            $ = new ApiMappingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiId The API identifier.
         * 
         * @return builder
         * 
         */
        public Builder apiId(Output<String> apiId) {
            $.apiId = apiId;
            return this;
        }

        /**
         * @param apiId The API identifier.
         * 
         * @return builder
         * 
         */
        public Builder apiId(String apiId) {
            return apiId(Output.of(apiId));
        }

        /**
         * @param apiMappingKey The [API mapping key](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-mapping-template-reference.html).
         * 
         * @return builder
         * 
         */
        public Builder apiMappingKey(@Nullable Output<String> apiMappingKey) {
            $.apiMappingKey = apiMappingKey;
            return this;
        }

        /**
         * @param apiMappingKey The [API mapping key](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-mapping-template-reference.html).
         * 
         * @return builder
         * 
         */
        public Builder apiMappingKey(String apiMappingKey) {
            return apiMappingKey(Output.of(apiMappingKey));
        }

        /**
         * @param domainName The domain name. Use the `aws.apigatewayv2.DomainName` resource to configure a domain name.
         * 
         * @return builder
         * 
         */
        public Builder domainName(Output<String> domainName) {
            $.domainName = domainName;
            return this;
        }

        /**
         * @param domainName The domain name. Use the `aws.apigatewayv2.DomainName` resource to configure a domain name.
         * 
         * @return builder
         * 
         */
        public Builder domainName(String domainName) {
            return domainName(Output.of(domainName));
        }

        /**
         * @param stage The API stage. Use the `aws.apigatewayv2.Stage` resource to configure an API stage.
         * 
         * @return builder
         * 
         */
        public Builder stage(Output<String> stage) {
            $.stage = stage;
            return this;
        }

        /**
         * @param stage The API stage. Use the `aws.apigatewayv2.Stage` resource to configure an API stage.
         * 
         * @return builder
         * 
         */
        public Builder stage(String stage) {
            return stage(Output.of(stage));
        }

        public ApiMappingArgs build() {
            $.apiId = Objects.requireNonNull($.apiId, "expected parameter 'apiId' to be non-null");
            $.domainName = Objects.requireNonNull($.domainName, "expected parameter 'domainName' to be non-null");
            $.stage = Objects.requireNonNull($.stage, "expected parameter 'stage' to be non-null");
            return $;
        }
    }

}