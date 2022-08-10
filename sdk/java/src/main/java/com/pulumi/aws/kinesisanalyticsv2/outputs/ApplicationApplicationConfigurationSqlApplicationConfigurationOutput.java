// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesisanalyticsv2.outputs;

import com.pulumi.aws.kinesisanalyticsv2.outputs.ApplicationApplicationConfigurationSqlApplicationConfigurationOutputDestinationSchema;
import com.pulumi.aws.kinesisanalyticsv2.outputs.ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisFirehoseOutput;
import com.pulumi.aws.kinesisanalyticsv2.outputs.ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisStreamsOutput;
import com.pulumi.aws.kinesisanalyticsv2.outputs.ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutput;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationApplicationConfigurationSqlApplicationConfigurationOutput {
    /**
     * @return Describes the data format when records are written to the destination.
     * 
     */
    private final ApplicationApplicationConfigurationSqlApplicationConfigurationOutputDestinationSchema destinationSchema;
    /**
     * @return Identifies a Kinesis Data Firehose delivery stream as the destination.
     * 
     */
    private final @Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisFirehoseOutput kinesisFirehoseOutput;
    /**
     * @return Identifies a Kinesis data stream as the destination.
     * 
     */
    private final @Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisStreamsOutput kinesisStreamsOutput;
    /**
     * @return Identifies a Lambda function as the destination.
     * 
     */
    private final @Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutput lambdaOutput;
    /**
     * @return The name of the in-application stream.
     * 
     */
    private final String name;
    private final @Nullable String outputId;

    @CustomType.Constructor
    private ApplicationApplicationConfigurationSqlApplicationConfigurationOutput(
        @CustomType.Parameter("destinationSchema") ApplicationApplicationConfigurationSqlApplicationConfigurationOutputDestinationSchema destinationSchema,
        @CustomType.Parameter("kinesisFirehoseOutput") @Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisFirehoseOutput kinesisFirehoseOutput,
        @CustomType.Parameter("kinesisStreamsOutput") @Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisStreamsOutput kinesisStreamsOutput,
        @CustomType.Parameter("lambdaOutput") @Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutput lambdaOutput,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("outputId") @Nullable String outputId) {
        this.destinationSchema = destinationSchema;
        this.kinesisFirehoseOutput = kinesisFirehoseOutput;
        this.kinesisStreamsOutput = kinesisStreamsOutput;
        this.lambdaOutput = lambdaOutput;
        this.name = name;
        this.outputId = outputId;
    }

    /**
     * @return Describes the data format when records are written to the destination.
     * 
     */
    public ApplicationApplicationConfigurationSqlApplicationConfigurationOutputDestinationSchema destinationSchema() {
        return this.destinationSchema;
    }
    /**
     * @return Identifies a Kinesis Data Firehose delivery stream as the destination.
     * 
     */
    public Optional<ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisFirehoseOutput> kinesisFirehoseOutput() {
        return Optional.ofNullable(this.kinesisFirehoseOutput);
    }
    /**
     * @return Identifies a Kinesis data stream as the destination.
     * 
     */
    public Optional<ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisStreamsOutput> kinesisStreamsOutput() {
        return Optional.ofNullable(this.kinesisStreamsOutput);
    }
    /**
     * @return Identifies a Lambda function as the destination.
     * 
     */
    public Optional<ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutput> lambdaOutput() {
        return Optional.ofNullable(this.lambdaOutput);
    }
    /**
     * @return The name of the in-application stream.
     * 
     */
    public String name() {
        return this.name;
    }
    public Optional<String> outputId() {
        return Optional.ofNullable(this.outputId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationSqlApplicationConfigurationOutput defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationApplicationConfigurationSqlApplicationConfigurationOutputDestinationSchema destinationSchema;
        private @Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisFirehoseOutput kinesisFirehoseOutput;
        private @Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisStreamsOutput kinesisStreamsOutput;
        private @Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutput lambdaOutput;
        private String name;
        private @Nullable String outputId;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApplicationConfigurationSqlApplicationConfigurationOutput defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationSchema = defaults.destinationSchema;
    	      this.kinesisFirehoseOutput = defaults.kinesisFirehoseOutput;
    	      this.kinesisStreamsOutput = defaults.kinesisStreamsOutput;
    	      this.lambdaOutput = defaults.lambdaOutput;
    	      this.name = defaults.name;
    	      this.outputId = defaults.outputId;
        }

        public Builder destinationSchema(ApplicationApplicationConfigurationSqlApplicationConfigurationOutputDestinationSchema destinationSchema) {
            this.destinationSchema = Objects.requireNonNull(destinationSchema);
            return this;
        }
        public Builder kinesisFirehoseOutput(@Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisFirehoseOutput kinesisFirehoseOutput) {
            this.kinesisFirehoseOutput = kinesisFirehoseOutput;
            return this;
        }
        public Builder kinesisStreamsOutput(@Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisStreamsOutput kinesisStreamsOutput) {
            this.kinesisStreamsOutput = kinesisStreamsOutput;
            return this;
        }
        public Builder lambdaOutput(@Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutput lambdaOutput) {
            this.lambdaOutput = lambdaOutput;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder outputId(@Nullable String outputId) {
            this.outputId = outputId;
            return this;
        }        public ApplicationApplicationConfigurationSqlApplicationConfigurationOutput build() {
            return new ApplicationApplicationConfigurationSqlApplicationConfigurationOutput(destinationSchema, kinesisFirehoseOutput, kinesisStreamsOutput, lambdaOutput, name, outputId);
        }
    }
}