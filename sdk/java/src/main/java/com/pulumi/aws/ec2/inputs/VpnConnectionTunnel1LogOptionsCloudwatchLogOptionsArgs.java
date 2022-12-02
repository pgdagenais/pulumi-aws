// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VpnConnectionTunnel1LogOptionsCloudwatchLogOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final VpnConnectionTunnel1LogOptionsCloudwatchLogOptionsArgs Empty = new VpnConnectionTunnel1LogOptionsCloudwatchLogOptionsArgs();

    /**
     * Enable or disable VPN tunnel logging feature. The default is `false`.
     * 
     */
    @Import(name="logEnabled")
    private @Nullable Output<Boolean> logEnabled;

    /**
     * @return Enable or disable VPN tunnel logging feature. The default is `false`.
     * 
     */
    public Optional<Output<Boolean>> logEnabled() {
        return Optional.ofNullable(this.logEnabled);
    }

    /**
     * The Amazon Resource Name (ARN) of the CloudWatch log group to send logs to.
     * 
     */
    @Import(name="logGroupArn")
    private @Nullable Output<String> logGroupArn;

    /**
     * @return The Amazon Resource Name (ARN) of the CloudWatch log group to send logs to.
     * 
     */
    public Optional<Output<String>> logGroupArn() {
        return Optional.ofNullable(this.logGroupArn);
    }

    /**
     * Set log format. Default format is json. Possible values are: `json` and `text`. The default is `json`.
     * 
     */
    @Import(name="logOutputFormat")
    private @Nullable Output<String> logOutputFormat;

    /**
     * @return Set log format. Default format is json. Possible values are: `json` and `text`. The default is `json`.
     * 
     */
    public Optional<Output<String>> logOutputFormat() {
        return Optional.ofNullable(this.logOutputFormat);
    }

    private VpnConnectionTunnel1LogOptionsCloudwatchLogOptionsArgs() {}

    private VpnConnectionTunnel1LogOptionsCloudwatchLogOptionsArgs(VpnConnectionTunnel1LogOptionsCloudwatchLogOptionsArgs $) {
        this.logEnabled = $.logEnabled;
        this.logGroupArn = $.logGroupArn;
        this.logOutputFormat = $.logOutputFormat;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VpnConnectionTunnel1LogOptionsCloudwatchLogOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VpnConnectionTunnel1LogOptionsCloudwatchLogOptionsArgs $;

        public Builder() {
            $ = new VpnConnectionTunnel1LogOptionsCloudwatchLogOptionsArgs();
        }

        public Builder(VpnConnectionTunnel1LogOptionsCloudwatchLogOptionsArgs defaults) {
            $ = new VpnConnectionTunnel1LogOptionsCloudwatchLogOptionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param logEnabled Enable or disable VPN tunnel logging feature. The default is `false`.
         * 
         * @return builder
         * 
         */
        public Builder logEnabled(@Nullable Output<Boolean> logEnabled) {
            $.logEnabled = logEnabled;
            return this;
        }

        /**
         * @param logEnabled Enable or disable VPN tunnel logging feature. The default is `false`.
         * 
         * @return builder
         * 
         */
        public Builder logEnabled(Boolean logEnabled) {
            return logEnabled(Output.of(logEnabled));
        }

        /**
         * @param logGroupArn The Amazon Resource Name (ARN) of the CloudWatch log group to send logs to.
         * 
         * @return builder
         * 
         */
        public Builder logGroupArn(@Nullable Output<String> logGroupArn) {
            $.logGroupArn = logGroupArn;
            return this;
        }

        /**
         * @param logGroupArn The Amazon Resource Name (ARN) of the CloudWatch log group to send logs to.
         * 
         * @return builder
         * 
         */
        public Builder logGroupArn(String logGroupArn) {
            return logGroupArn(Output.of(logGroupArn));
        }

        /**
         * @param logOutputFormat Set log format. Default format is json. Possible values are: `json` and `text`. The default is `json`.
         * 
         * @return builder
         * 
         */
        public Builder logOutputFormat(@Nullable Output<String> logOutputFormat) {
            $.logOutputFormat = logOutputFormat;
            return this;
        }

        /**
         * @param logOutputFormat Set log format. Default format is json. Possible values are: `json` and `text`. The default is `json`.
         * 
         * @return builder
         * 
         */
        public Builder logOutputFormat(String logOutputFormat) {
            return logOutputFormat(Output.of(logOutputFormat));
        }

        public VpnConnectionTunnel1LogOptionsCloudwatchLogOptionsArgs build() {
            return $;
        }
    }

}