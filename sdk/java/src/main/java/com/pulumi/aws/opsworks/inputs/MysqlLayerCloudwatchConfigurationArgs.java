// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.opsworks.inputs;

import com.pulumi.aws.opsworks.inputs.MysqlLayerCloudwatchConfigurationLogStreamArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MysqlLayerCloudwatchConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final MysqlLayerCloudwatchConfigurationArgs Empty = new MysqlLayerCloudwatchConfigurationArgs();

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    @Import(name="logStreams")
    private @Nullable Output<List<MysqlLayerCloudwatchConfigurationLogStreamArgs>> logStreams;

    public Optional<Output<List<MysqlLayerCloudwatchConfigurationLogStreamArgs>>> logStreams() {
        return Optional.ofNullable(this.logStreams);
    }

    private MysqlLayerCloudwatchConfigurationArgs() {}

    private MysqlLayerCloudwatchConfigurationArgs(MysqlLayerCloudwatchConfigurationArgs $) {
        this.enabled = $.enabled;
        this.logStreams = $.logStreams;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MysqlLayerCloudwatchConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MysqlLayerCloudwatchConfigurationArgs $;

        public Builder() {
            $ = new MysqlLayerCloudwatchConfigurationArgs();
        }

        public Builder(MysqlLayerCloudwatchConfigurationArgs defaults) {
            $ = new MysqlLayerCloudwatchConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder logStreams(@Nullable Output<List<MysqlLayerCloudwatchConfigurationLogStreamArgs>> logStreams) {
            $.logStreams = logStreams;
            return this;
        }

        public Builder logStreams(List<MysqlLayerCloudwatchConfigurationLogStreamArgs> logStreams) {
            return logStreams(Output.of(logStreams));
        }

        public Builder logStreams(MysqlLayerCloudwatchConfigurationLogStreamArgs... logStreams) {
            return logStreams(List.of(logStreams));
        }

        public MysqlLayerCloudwatchConfigurationArgs build() {
            return $;
        }
    }

}