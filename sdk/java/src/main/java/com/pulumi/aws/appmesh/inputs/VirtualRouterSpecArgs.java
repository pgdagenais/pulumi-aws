// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.aws.appmesh.inputs.VirtualRouterSpecListenerArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualRouterSpecArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualRouterSpecArgs Empty = new VirtualRouterSpecArgs();

    /**
     * Listeners that the virtual router is expected to receive inbound traffic from.
     * Currently only one listener is supported per virtual router.
     * 
     */
    @Import(name="listeners")
    private @Nullable Output<List<VirtualRouterSpecListenerArgs>> listeners;

    /**
     * @return Listeners that the virtual router is expected to receive inbound traffic from.
     * Currently only one listener is supported per virtual router.
     * 
     */
    public Optional<Output<List<VirtualRouterSpecListenerArgs>>> listeners() {
        return Optional.ofNullable(this.listeners);
    }

    private VirtualRouterSpecArgs() {}

    private VirtualRouterSpecArgs(VirtualRouterSpecArgs $) {
        this.listeners = $.listeners;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualRouterSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualRouterSpecArgs $;

        public Builder() {
            $ = new VirtualRouterSpecArgs();
        }

        public Builder(VirtualRouterSpecArgs defaults) {
            $ = new VirtualRouterSpecArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param listeners Listeners that the virtual router is expected to receive inbound traffic from.
         * Currently only one listener is supported per virtual router.
         * 
         * @return builder
         * 
         */
        public Builder listeners(@Nullable Output<List<VirtualRouterSpecListenerArgs>> listeners) {
            $.listeners = listeners;
            return this;
        }

        /**
         * @param listeners Listeners that the virtual router is expected to receive inbound traffic from.
         * Currently only one listener is supported per virtual router.
         * 
         * @return builder
         * 
         */
        public Builder listeners(List<VirtualRouterSpecListenerArgs> listeners) {
            return listeners(Output.of(listeners));
        }

        /**
         * @param listeners Listeners that the virtual router is expected to receive inbound traffic from.
         * Currently only one listener is supported per virtual router.
         * 
         * @return builder
         * 
         */
        public Builder listeners(VirtualRouterSpecListenerArgs... listeners) {
            return listeners(List.of(listeners));
        }

        public VirtualRouterSpecArgs build() {
            return $;
        }
    }

}
