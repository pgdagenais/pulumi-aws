// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VpnConnectionRoute {
    /**
     * @return The CIDR block associated with the local subnet of the customer data center.
     * 
     */
    private final @Nullable String destinationCidrBlock;
    /**
     * @return Indicates how the routes were provided.
     * 
     */
    private final @Nullable String source;
    /**
     * @return The current state of the static route.
     * 
     */
    private final @Nullable String state;

    @CustomType.Constructor
    private VpnConnectionRoute(
        @CustomType.Parameter("destinationCidrBlock") @Nullable String destinationCidrBlock,
        @CustomType.Parameter("source") @Nullable String source,
        @CustomType.Parameter("state") @Nullable String state) {
        this.destinationCidrBlock = destinationCidrBlock;
        this.source = source;
        this.state = state;
    }

    /**
     * @return The CIDR block associated with the local subnet of the customer data center.
     * 
     */
    public Optional<String> destinationCidrBlock() {
        return Optional.ofNullable(this.destinationCidrBlock);
    }
    /**
     * @return Indicates how the routes were provided.
     * 
     */
    public Optional<String> source() {
        return Optional.ofNullable(this.source);
    }
    /**
     * @return The current state of the static route.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpnConnectionRoute defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String destinationCidrBlock;
        private @Nullable String source;
        private @Nullable String state;

        public Builder() {
    	      // Empty
        }

        public Builder(VpnConnectionRoute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationCidrBlock = defaults.destinationCidrBlock;
    	      this.source = defaults.source;
    	      this.state = defaults.state;
        }

        public Builder destinationCidrBlock(@Nullable String destinationCidrBlock) {
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }
        public Builder source(@Nullable String source) {
            this.source = source;
            return this;
        }
        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }        public VpnConnectionRoute build() {
            return new VpnConnectionRoute(destinationCidrBlock, source, state);
        }
    }
}