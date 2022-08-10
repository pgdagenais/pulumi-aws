// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesisanalyticsv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputParallelismArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputParallelismArgs Empty = new ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputParallelismArgs();

    /**
     * The number of in-application streams to create.
     * 
     */
    @Import(name="count")
    private @Nullable Output<Integer> count;

    /**
     * @return The number of in-application streams to create.
     * 
     */
    public Optional<Output<Integer>> count() {
        return Optional.ofNullable(this.count);
    }

    private ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputParallelismArgs() {}

    private ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputParallelismArgs(ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputParallelismArgs $) {
        this.count = $.count;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputParallelismArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputParallelismArgs $;

        public Builder() {
            $ = new ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputParallelismArgs();
        }

        public Builder(ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputParallelismArgs defaults) {
            $ = new ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputParallelismArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param count The number of in-application streams to create.
         * 
         * @return builder
         * 
         */
        public Builder count(@Nullable Output<Integer> count) {
            $.count = count;
            return this;
        }

        /**
         * @param count The number of in-application streams to create.
         * 
         * @return builder
         * 
         */
        public Builder count(Integer count) {
            return count(Output.of(count));
        }

        public ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputParallelismArgs build() {
            return $;
        }
    }

}