// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigateway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDomainNameArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDomainNameArgs Empty = new GetDomainNameArgs();

    /**
     * Fully-qualified domain name to look up. If no domain name is found, an error will be returned.
     * 
     */
    @Import(name="domainName", required=true)
    private Output<String> domainName;

    /**
     * @return Fully-qualified domain name to look up. If no domain name is found, an error will be returned.
     * 
     */
    public Output<String> domainName() {
        return this.domainName;
    }

    /**
     * Key-value map of tags for the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Key-value map of tags for the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetDomainNameArgs() {}

    private GetDomainNameArgs(GetDomainNameArgs $) {
        this.domainName = $.domainName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDomainNameArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDomainNameArgs $;

        public Builder() {
            $ = new GetDomainNameArgs();
        }

        public Builder(GetDomainNameArgs defaults) {
            $ = new GetDomainNameArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param domainName Fully-qualified domain name to look up. If no domain name is found, an error will be returned.
         * 
         * @return builder
         * 
         */
        public Builder domainName(Output<String> domainName) {
            $.domainName = domainName;
            return this;
        }

        /**
         * @param domainName Fully-qualified domain name to look up. If no domain name is found, an error will be returned.
         * 
         * @return builder
         * 
         */
        public Builder domainName(String domainName) {
            return domainName(Output.of(domainName));
        }

        /**
         * @param tags Key-value map of tags for the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Key-value map of tags for the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public GetDomainNameArgs build() {
            $.domainName = Objects.requireNonNull($.domainName, "expected parameter 'domainName' to be non-null");
            return $;
        }
    }

}