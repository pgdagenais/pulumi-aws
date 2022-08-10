// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iot.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LoggingOptionsState extends com.pulumi.resources.ResourceArgs {

    public static final LoggingOptionsState Empty = new LoggingOptionsState();

    /**
     * The default logging level. Valid Values: `&#34;DEBUG&#34;`, `&#34;INFO&#34;`, `&#34;ERROR&#34;`, `&#34;WARN&#34;`, `&#34;DISABLED&#34;`.
     * 
     */
    @Import(name="defaultLogLevel")
    private @Nullable Output<String> defaultLogLevel;

    /**
     * @return The default logging level. Valid Values: `&#34;DEBUG&#34;`, `&#34;INFO&#34;`, `&#34;ERROR&#34;`, `&#34;WARN&#34;`, `&#34;DISABLED&#34;`.
     * 
     */
    public Optional<Output<String>> defaultLogLevel() {
        return Optional.ofNullable(this.defaultLogLevel);
    }

    /**
     * If `true` all logs are disabled. The default is `false`.
     * 
     */
    @Import(name="disableAllLogs")
    private @Nullable Output<Boolean> disableAllLogs;

    /**
     * @return If `true` all logs are disabled. The default is `false`.
     * 
     */
    public Optional<Output<Boolean>> disableAllLogs() {
        return Optional.ofNullable(this.disableAllLogs);
    }

    /**
     * The ARN of the role that allows IoT to write to Cloudwatch logs.
     * 
     */
    @Import(name="roleArn")
    private @Nullable Output<String> roleArn;

    /**
     * @return The ARN of the role that allows IoT to write to Cloudwatch logs.
     * 
     */
    public Optional<Output<String>> roleArn() {
        return Optional.ofNullable(this.roleArn);
    }

    private LoggingOptionsState() {}

    private LoggingOptionsState(LoggingOptionsState $) {
        this.defaultLogLevel = $.defaultLogLevel;
        this.disableAllLogs = $.disableAllLogs;
        this.roleArn = $.roleArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoggingOptionsState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoggingOptionsState $;

        public Builder() {
            $ = new LoggingOptionsState();
        }

        public Builder(LoggingOptionsState defaults) {
            $ = new LoggingOptionsState(Objects.requireNonNull(defaults));
        }

        /**
         * @param defaultLogLevel The default logging level. Valid Values: `&#34;DEBUG&#34;`, `&#34;INFO&#34;`, `&#34;ERROR&#34;`, `&#34;WARN&#34;`, `&#34;DISABLED&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder defaultLogLevel(@Nullable Output<String> defaultLogLevel) {
            $.defaultLogLevel = defaultLogLevel;
            return this;
        }

        /**
         * @param defaultLogLevel The default logging level. Valid Values: `&#34;DEBUG&#34;`, `&#34;INFO&#34;`, `&#34;ERROR&#34;`, `&#34;WARN&#34;`, `&#34;DISABLED&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder defaultLogLevel(String defaultLogLevel) {
            return defaultLogLevel(Output.of(defaultLogLevel));
        }

        /**
         * @param disableAllLogs If `true` all logs are disabled. The default is `false`.
         * 
         * @return builder
         * 
         */
        public Builder disableAllLogs(@Nullable Output<Boolean> disableAllLogs) {
            $.disableAllLogs = disableAllLogs;
            return this;
        }

        /**
         * @param disableAllLogs If `true` all logs are disabled. The default is `false`.
         * 
         * @return builder
         * 
         */
        public Builder disableAllLogs(Boolean disableAllLogs) {
            return disableAllLogs(Output.of(disableAllLogs));
        }

        /**
         * @param roleArn The ARN of the role that allows IoT to write to Cloudwatch logs.
         * 
         * @return builder
         * 
         */
        public Builder roleArn(@Nullable Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        /**
         * @param roleArn The ARN of the role that allows IoT to write to Cloudwatch logs.
         * 
         * @return builder
         * 
         */
        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        public LoggingOptionsState build() {
            return $;
        }
    }

}