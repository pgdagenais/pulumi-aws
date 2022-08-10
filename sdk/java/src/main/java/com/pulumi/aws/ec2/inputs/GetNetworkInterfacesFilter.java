// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetNetworkInterfacesFilter extends com.pulumi.resources.InvokeArgs {

    public static final GetNetworkInterfacesFilter Empty = new GetNetworkInterfacesFilter();

    /**
     * The name of the field to filter by, as defined by
     * [the underlying AWS API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeNetworkInterfaces.html).
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the field to filter by, as defined by
     * [the underlying AWS API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeNetworkInterfaces.html).
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * Set of values that are accepted for the given field.
     * 
     */
    @Import(name="values", required=true)
    private List<String> values;

    /**
     * @return Set of values that are accepted for the given field.
     * 
     */
    public List<String> values() {
        return this.values;
    }

    private GetNetworkInterfacesFilter() {}

    private GetNetworkInterfacesFilter(GetNetworkInterfacesFilter $) {
        this.name = $.name;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNetworkInterfacesFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNetworkInterfacesFilter $;

        public Builder() {
            $ = new GetNetworkInterfacesFilter();
        }

        public Builder(GetNetworkInterfacesFilter defaults) {
            $ = new GetNetworkInterfacesFilter(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the field to filter by, as defined by
         * [the underlying AWS API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeNetworkInterfaces.html).
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param values Set of values that are accepted for the given field.
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values Set of values that are accepted for the given field.
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        public GetNetworkInterfacesFilter build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.values = Objects.requireNonNull($.values, "expected parameter 'values' to be non-null");
            return $;
        }
    }

}