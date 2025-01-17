// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ses;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class DomainDkimArgs extends com.pulumi.resources.ResourceArgs {

    public static final DomainDkimArgs Empty = new DomainDkimArgs();

    /**
     * Verified domain name to generate DKIM tokens for.
     * 
     */
    @Import(name="domain", required=true)
    private Output<String> domain;

    /**
     * @return Verified domain name to generate DKIM tokens for.
     * 
     */
    public Output<String> domain() {
        return this.domain;
    }

    private DomainDkimArgs() {}

    private DomainDkimArgs(DomainDkimArgs $) {
        this.domain = $.domain;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DomainDkimArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DomainDkimArgs $;

        public Builder() {
            $ = new DomainDkimArgs();
        }

        public Builder(DomainDkimArgs defaults) {
            $ = new DomainDkimArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param domain Verified domain name to generate DKIM tokens for.
         * 
         * @return builder
         * 
         */
        public Builder domain(Output<String> domain) {
            $.domain = domain;
            return this;
        }

        /**
         * @param domain Verified domain name to generate DKIM tokens for.
         * 
         * @return builder
         * 
         */
        public Builder domain(String domain) {
            return domain(Output.of(domain));
        }

        public DomainDkimArgs build() {
            if ($.domain == null) {
                throw new MissingRequiredPropertyException("DomainDkimArgs", "domain");
            }
            return $;
        }
    }

}
