// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerTlsValidationTrustFileArgs;
import com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerTlsValidationTrustSdsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualGatewaySpecListenerTlsValidationTrustArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualGatewaySpecListenerTlsValidationTrustArgs Empty = new VirtualGatewaySpecListenerTlsValidationTrustArgs();

    /**
     * The TLS validation context trust for a local file certificate.
     * 
     */
    @Import(name="file")
    private @Nullable Output<VirtualGatewaySpecListenerTlsValidationTrustFileArgs> file;

    /**
     * @return The TLS validation context trust for a local file certificate.
     * 
     */
    public Optional<Output<VirtualGatewaySpecListenerTlsValidationTrustFileArgs>> file() {
        return Optional.ofNullable(this.file);
    }

    /**
     * The TLS validation context trust for a [Secret Discovery Service](https://www.envoyproxy.io/docs/envoy/latest/configuration/security/secret#secret-discovery-service-sds) certificate.
     * 
     */
    @Import(name="sds")
    private @Nullable Output<VirtualGatewaySpecListenerTlsValidationTrustSdsArgs> sds;

    /**
     * @return The TLS validation context trust for a [Secret Discovery Service](https://www.envoyproxy.io/docs/envoy/latest/configuration/security/secret#secret-discovery-service-sds) certificate.
     * 
     */
    public Optional<Output<VirtualGatewaySpecListenerTlsValidationTrustSdsArgs>> sds() {
        return Optional.ofNullable(this.sds);
    }

    private VirtualGatewaySpecListenerTlsValidationTrustArgs() {}

    private VirtualGatewaySpecListenerTlsValidationTrustArgs(VirtualGatewaySpecListenerTlsValidationTrustArgs $) {
        this.file = $.file;
        this.sds = $.sds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualGatewaySpecListenerTlsValidationTrustArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualGatewaySpecListenerTlsValidationTrustArgs $;

        public Builder() {
            $ = new VirtualGatewaySpecListenerTlsValidationTrustArgs();
        }

        public Builder(VirtualGatewaySpecListenerTlsValidationTrustArgs defaults) {
            $ = new VirtualGatewaySpecListenerTlsValidationTrustArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param file The TLS validation context trust for a local file certificate.
         * 
         * @return builder
         * 
         */
        public Builder file(@Nullable Output<VirtualGatewaySpecListenerTlsValidationTrustFileArgs> file) {
            $.file = file;
            return this;
        }

        /**
         * @param file The TLS validation context trust for a local file certificate.
         * 
         * @return builder
         * 
         */
        public Builder file(VirtualGatewaySpecListenerTlsValidationTrustFileArgs file) {
            return file(Output.of(file));
        }

        /**
         * @param sds The TLS validation context trust for a [Secret Discovery Service](https://www.envoyproxy.io/docs/envoy/latest/configuration/security/secret#secret-discovery-service-sds) certificate.
         * 
         * @return builder
         * 
         */
        public Builder sds(@Nullable Output<VirtualGatewaySpecListenerTlsValidationTrustSdsArgs> sds) {
            $.sds = sds;
            return this;
        }

        /**
         * @param sds The TLS validation context trust for a [Secret Discovery Service](https://www.envoyproxy.io/docs/envoy/latest/configuration/security/secret#secret-discovery-service-sds) certificate.
         * 
         * @return builder
         * 
         */
        public Builder sds(VirtualGatewaySpecListenerTlsValidationTrustSdsArgs sds) {
            return sds(Output.of(sds));
        }

        public VirtualGatewaySpecListenerTlsValidationTrustArgs build() {
            return $;
        }
    }

}