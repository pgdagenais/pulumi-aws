// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.rds.inputs;

import com.pulumi.aws.rds.inputs.GetClustersFilter;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetClustersPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetClustersPlainArgs Empty = new GetClustersPlainArgs();

    /**
     * Configuration block(s) for filtering. Detailed below.
     * 
     */
    @Import(name="filters")
    private @Nullable List<GetClustersFilter> filters;

    /**
     * @return Configuration block(s) for filtering. Detailed below.
     * 
     */
    public Optional<List<GetClustersFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    private GetClustersPlainArgs() {}

    private GetClustersPlainArgs(GetClustersPlainArgs $) {
        this.filters = $.filters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetClustersPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetClustersPlainArgs $;

        public Builder() {
            $ = new GetClustersPlainArgs();
        }

        public Builder(GetClustersPlainArgs defaults) {
            $ = new GetClustersPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters Configuration block(s) for filtering. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable List<GetClustersFilter> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters Configuration block(s) for filtering. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder filters(GetClustersFilter... filters) {
            return filters(List.of(filters));
        }

        public GetClustersPlainArgs build() {
            return $;
        }
    }

}