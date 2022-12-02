// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.directoryservice;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RadiusSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final RadiusSettingsArgs Empty = new RadiusSettingsArgs();

    /**
     * The protocol specified for your RADIUS endpoints. Valid values: `PAP`, `CHAP`, `MS-CHAPv1`, `MS-CHAPv2`.
     * 
     */
    @Import(name="authenticationProtocol", required=true)
    private Output<String> authenticationProtocol;

    /**
     * @return The protocol specified for your RADIUS endpoints. Valid values: `PAP`, `CHAP`, `MS-CHAPv1`, `MS-CHAPv2`.
     * 
     */
    public Output<String> authenticationProtocol() {
        return this.authenticationProtocol;
    }

    /**
     * The identifier of the directory for which you want to manager RADIUS settings.
     * 
     */
    @Import(name="directoryId", required=true)
    private Output<String> directoryId;

    /**
     * @return The identifier of the directory for which you want to manager RADIUS settings.
     * 
     */
    public Output<String> directoryId() {
        return this.directoryId;
    }

    /**
     * Display label.
     * 
     */
    @Import(name="displayLabel", required=true)
    private Output<String> displayLabel;

    /**
     * @return Display label.
     * 
     */
    public Output<String> displayLabel() {
        return this.displayLabel;
    }

    /**
     * The port that your RADIUS server is using for communications. Your self-managed network must allow inbound traffic over this port from the AWS Directory Service servers.
     * 
     */
    @Import(name="radiusPort", required=true)
    private Output<Integer> radiusPort;

    /**
     * @return The port that your RADIUS server is using for communications. Your self-managed network must allow inbound traffic over this port from the AWS Directory Service servers.
     * 
     */
    public Output<Integer> radiusPort() {
        return this.radiusPort;
    }

    /**
     * The maximum number of times that communication with the RADIUS server is attempted. Minimum value of `0`. Maximum value of `10`.
     * 
     */
    @Import(name="radiusRetries", required=true)
    private Output<Integer> radiusRetries;

    /**
     * @return The maximum number of times that communication with the RADIUS server is attempted. Minimum value of `0`. Maximum value of `10`.
     * 
     */
    public Output<Integer> radiusRetries() {
        return this.radiusRetries;
    }

    /**
     * An array of strings that contains the fully qualified domain name (FQDN) or IP addresses of the RADIUS server endpoints, or the FQDN or IP addresses of your RADIUS server load balancer.
     * 
     */
    @Import(name="radiusServers", required=true)
    private Output<List<String>> radiusServers;

    /**
     * @return An array of strings that contains the fully qualified domain name (FQDN) or IP addresses of the RADIUS server endpoints, or the FQDN or IP addresses of your RADIUS server load balancer.
     * 
     */
    public Output<List<String>> radiusServers() {
        return this.radiusServers;
    }

    /**
     * The amount of time, in seconds, to wait for the RADIUS server to respond. Minimum value of `1`. Maximum value of `50`.
     * 
     */
    @Import(name="radiusTimeout", required=true)
    private Output<Integer> radiusTimeout;

    /**
     * @return The amount of time, in seconds, to wait for the RADIUS server to respond. Minimum value of `1`. Maximum value of `50`.
     * 
     */
    public Output<Integer> radiusTimeout() {
        return this.radiusTimeout;
    }

    /**
     * Required for enabling RADIUS on the directory.
     * 
     */
    @Import(name="sharedSecret", required=true)
    private Output<String> sharedSecret;

    /**
     * @return Required for enabling RADIUS on the directory.
     * 
     */
    public Output<String> sharedSecret() {
        return this.sharedSecret;
    }

    /**
     * Not currently used.
     * 
     */
    @Import(name="useSameUsername")
    private @Nullable Output<Boolean> useSameUsername;

    /**
     * @return Not currently used.
     * 
     */
    public Optional<Output<Boolean>> useSameUsername() {
        return Optional.ofNullable(this.useSameUsername);
    }

    private RadiusSettingsArgs() {}

    private RadiusSettingsArgs(RadiusSettingsArgs $) {
        this.authenticationProtocol = $.authenticationProtocol;
        this.directoryId = $.directoryId;
        this.displayLabel = $.displayLabel;
        this.radiusPort = $.radiusPort;
        this.radiusRetries = $.radiusRetries;
        this.radiusServers = $.radiusServers;
        this.radiusTimeout = $.radiusTimeout;
        this.sharedSecret = $.sharedSecret;
        this.useSameUsername = $.useSameUsername;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RadiusSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RadiusSettingsArgs $;

        public Builder() {
            $ = new RadiusSettingsArgs();
        }

        public Builder(RadiusSettingsArgs defaults) {
            $ = new RadiusSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authenticationProtocol The protocol specified for your RADIUS endpoints. Valid values: `PAP`, `CHAP`, `MS-CHAPv1`, `MS-CHAPv2`.
         * 
         * @return builder
         * 
         */
        public Builder authenticationProtocol(Output<String> authenticationProtocol) {
            $.authenticationProtocol = authenticationProtocol;
            return this;
        }

        /**
         * @param authenticationProtocol The protocol specified for your RADIUS endpoints. Valid values: `PAP`, `CHAP`, `MS-CHAPv1`, `MS-CHAPv2`.
         * 
         * @return builder
         * 
         */
        public Builder authenticationProtocol(String authenticationProtocol) {
            return authenticationProtocol(Output.of(authenticationProtocol));
        }

        /**
         * @param directoryId The identifier of the directory for which you want to manager RADIUS settings.
         * 
         * @return builder
         * 
         */
        public Builder directoryId(Output<String> directoryId) {
            $.directoryId = directoryId;
            return this;
        }

        /**
         * @param directoryId The identifier of the directory for which you want to manager RADIUS settings.
         * 
         * @return builder
         * 
         */
        public Builder directoryId(String directoryId) {
            return directoryId(Output.of(directoryId));
        }

        /**
         * @param displayLabel Display label.
         * 
         * @return builder
         * 
         */
        public Builder displayLabel(Output<String> displayLabel) {
            $.displayLabel = displayLabel;
            return this;
        }

        /**
         * @param displayLabel Display label.
         * 
         * @return builder
         * 
         */
        public Builder displayLabel(String displayLabel) {
            return displayLabel(Output.of(displayLabel));
        }

        /**
         * @param radiusPort The port that your RADIUS server is using for communications. Your self-managed network must allow inbound traffic over this port from the AWS Directory Service servers.
         * 
         * @return builder
         * 
         */
        public Builder radiusPort(Output<Integer> radiusPort) {
            $.radiusPort = radiusPort;
            return this;
        }

        /**
         * @param radiusPort The port that your RADIUS server is using for communications. Your self-managed network must allow inbound traffic over this port from the AWS Directory Service servers.
         * 
         * @return builder
         * 
         */
        public Builder radiusPort(Integer radiusPort) {
            return radiusPort(Output.of(radiusPort));
        }

        /**
         * @param radiusRetries The maximum number of times that communication with the RADIUS server is attempted. Minimum value of `0`. Maximum value of `10`.
         * 
         * @return builder
         * 
         */
        public Builder radiusRetries(Output<Integer> radiusRetries) {
            $.radiusRetries = radiusRetries;
            return this;
        }

        /**
         * @param radiusRetries The maximum number of times that communication with the RADIUS server is attempted. Minimum value of `0`. Maximum value of `10`.
         * 
         * @return builder
         * 
         */
        public Builder radiusRetries(Integer radiusRetries) {
            return radiusRetries(Output.of(radiusRetries));
        }

        /**
         * @param radiusServers An array of strings that contains the fully qualified domain name (FQDN) or IP addresses of the RADIUS server endpoints, or the FQDN or IP addresses of your RADIUS server load balancer.
         * 
         * @return builder
         * 
         */
        public Builder radiusServers(Output<List<String>> radiusServers) {
            $.radiusServers = radiusServers;
            return this;
        }

        /**
         * @param radiusServers An array of strings that contains the fully qualified domain name (FQDN) or IP addresses of the RADIUS server endpoints, or the FQDN or IP addresses of your RADIUS server load balancer.
         * 
         * @return builder
         * 
         */
        public Builder radiusServers(List<String> radiusServers) {
            return radiusServers(Output.of(radiusServers));
        }

        /**
         * @param radiusServers An array of strings that contains the fully qualified domain name (FQDN) or IP addresses of the RADIUS server endpoints, or the FQDN or IP addresses of your RADIUS server load balancer.
         * 
         * @return builder
         * 
         */
        public Builder radiusServers(String... radiusServers) {
            return radiusServers(List.of(radiusServers));
        }

        /**
         * @param radiusTimeout The amount of time, in seconds, to wait for the RADIUS server to respond. Minimum value of `1`. Maximum value of `50`.
         * 
         * @return builder
         * 
         */
        public Builder radiusTimeout(Output<Integer> radiusTimeout) {
            $.radiusTimeout = radiusTimeout;
            return this;
        }

        /**
         * @param radiusTimeout The amount of time, in seconds, to wait for the RADIUS server to respond. Minimum value of `1`. Maximum value of `50`.
         * 
         * @return builder
         * 
         */
        public Builder radiusTimeout(Integer radiusTimeout) {
            return radiusTimeout(Output.of(radiusTimeout));
        }

        /**
         * @param sharedSecret Required for enabling RADIUS on the directory.
         * 
         * @return builder
         * 
         */
        public Builder sharedSecret(Output<String> sharedSecret) {
            $.sharedSecret = sharedSecret;
            return this;
        }

        /**
         * @param sharedSecret Required for enabling RADIUS on the directory.
         * 
         * @return builder
         * 
         */
        public Builder sharedSecret(String sharedSecret) {
            return sharedSecret(Output.of(sharedSecret));
        }

        /**
         * @param useSameUsername Not currently used.
         * 
         * @return builder
         * 
         */
        public Builder useSameUsername(@Nullable Output<Boolean> useSameUsername) {
            $.useSameUsername = useSameUsername;
            return this;
        }

        /**
         * @param useSameUsername Not currently used.
         * 
         * @return builder
         * 
         */
        public Builder useSameUsername(Boolean useSameUsername) {
            return useSameUsername(Output.of(useSameUsername));
        }

        public RadiusSettingsArgs build() {
            $.authenticationProtocol = Objects.requireNonNull($.authenticationProtocol, "expected parameter 'authenticationProtocol' to be non-null");
            $.directoryId = Objects.requireNonNull($.directoryId, "expected parameter 'directoryId' to be non-null");
            $.displayLabel = Objects.requireNonNull($.displayLabel, "expected parameter 'displayLabel' to be non-null");
            $.radiusPort = Objects.requireNonNull($.radiusPort, "expected parameter 'radiusPort' to be non-null");
            $.radiusRetries = Objects.requireNonNull($.radiusRetries, "expected parameter 'radiusRetries' to be non-null");
            $.radiusServers = Objects.requireNonNull($.radiusServers, "expected parameter 'radiusServers' to be non-null");
            $.radiusTimeout = Objects.requireNonNull($.radiusTimeout, "expected parameter 'radiusTimeout' to be non-null");
            $.sharedSecret = Objects.requireNonNull($.sharedSecret, "expected parameter 'sharedSecret' to be non-null");
            return $;
        }
    }

}