// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ivschat.inputs;

import com.pulumi.aws.ivschat.inputs.RoomMessageReviewHandlerArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RoomState extends com.pulumi.resources.ResourceArgs {

    public static final RoomState Empty = new RoomState();

    /**
     * ARN of the Room.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return ARN of the Room.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * List of Logging Configuration
     * ARNs to attach to the room.
     * 
     */
    @Import(name="loggingConfigurationIdentifiers")
    private @Nullable Output<List<String>> loggingConfigurationIdentifiers;

    /**
     * @return List of Logging Configuration
     * ARNs to attach to the room.
     * 
     */
    public Optional<Output<List<String>>> loggingConfigurationIdentifiers() {
        return Optional.ofNullable(this.loggingConfigurationIdentifiers);
    }

    /**
     * Maximum number of characters in a single
     * message. Messages are expected to be UTF-8 encoded and this limit applies
     * specifically to rune/code-point count, not number of bytes.
     * 
     */
    @Import(name="maximumMessageLength")
    private @Nullable Output<Integer> maximumMessageLength;

    /**
     * @return Maximum number of characters in a single
     * message. Messages are expected to be UTF-8 encoded and this limit applies
     * specifically to rune/code-point count, not number of bytes.
     * 
     */
    public Optional<Output<Integer>> maximumMessageLength() {
        return Optional.ofNullable(this.maximumMessageLength);
    }

    /**
     * Maximum number of messages per
     * second that can be sent to the room (by all clients).
     * 
     */
    @Import(name="maximumMessageRatePerSecond")
    private @Nullable Output<Integer> maximumMessageRatePerSecond;

    /**
     * @return Maximum number of messages per
     * second that can be sent to the room (by all clients).
     * 
     */
    public Optional<Output<Integer>> maximumMessageRatePerSecond() {
        return Optional.ofNullable(this.maximumMessageRatePerSecond);
    }

    /**
     * Configuration information for optional
     * review of messages.
     * 
     */
    @Import(name="messageReviewHandler")
    private @Nullable Output<RoomMessageReviewHandlerArgs> messageReviewHandler;

    /**
     * @return Configuration information for optional
     * review of messages.
     * 
     */
    public Optional<Output<RoomMessageReviewHandlerArgs>> messageReviewHandler() {
        return Optional.ofNullable(this.messageReviewHandler);
    }

    /**
     * Room name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Room name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @return Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    private RoomState() {}

    private RoomState(RoomState $) {
        this.arn = $.arn;
        this.loggingConfigurationIdentifiers = $.loggingConfigurationIdentifiers;
        this.maximumMessageLength = $.maximumMessageLength;
        this.maximumMessageRatePerSecond = $.maximumMessageRatePerSecond;
        this.messageReviewHandler = $.messageReviewHandler;
        this.name = $.name;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RoomState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RoomState $;

        public Builder() {
            $ = new RoomState();
        }

        public Builder(RoomState defaults) {
            $ = new RoomState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn ARN of the Room.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn ARN of the Room.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param loggingConfigurationIdentifiers List of Logging Configuration
         * ARNs to attach to the room.
         * 
         * @return builder
         * 
         */
        public Builder loggingConfigurationIdentifiers(@Nullable Output<List<String>> loggingConfigurationIdentifiers) {
            $.loggingConfigurationIdentifiers = loggingConfigurationIdentifiers;
            return this;
        }

        /**
         * @param loggingConfigurationIdentifiers List of Logging Configuration
         * ARNs to attach to the room.
         * 
         * @return builder
         * 
         */
        public Builder loggingConfigurationIdentifiers(List<String> loggingConfigurationIdentifiers) {
            return loggingConfigurationIdentifiers(Output.of(loggingConfigurationIdentifiers));
        }

        /**
         * @param loggingConfigurationIdentifiers List of Logging Configuration
         * ARNs to attach to the room.
         * 
         * @return builder
         * 
         */
        public Builder loggingConfigurationIdentifiers(String... loggingConfigurationIdentifiers) {
            return loggingConfigurationIdentifiers(List.of(loggingConfigurationIdentifiers));
        }

        /**
         * @param maximumMessageLength Maximum number of characters in a single
         * message. Messages are expected to be UTF-8 encoded and this limit applies
         * specifically to rune/code-point count, not number of bytes.
         * 
         * @return builder
         * 
         */
        public Builder maximumMessageLength(@Nullable Output<Integer> maximumMessageLength) {
            $.maximumMessageLength = maximumMessageLength;
            return this;
        }

        /**
         * @param maximumMessageLength Maximum number of characters in a single
         * message. Messages are expected to be UTF-8 encoded and this limit applies
         * specifically to rune/code-point count, not number of bytes.
         * 
         * @return builder
         * 
         */
        public Builder maximumMessageLength(Integer maximumMessageLength) {
            return maximumMessageLength(Output.of(maximumMessageLength));
        }

        /**
         * @param maximumMessageRatePerSecond Maximum number of messages per
         * second that can be sent to the room (by all clients).
         * 
         * @return builder
         * 
         */
        public Builder maximumMessageRatePerSecond(@Nullable Output<Integer> maximumMessageRatePerSecond) {
            $.maximumMessageRatePerSecond = maximumMessageRatePerSecond;
            return this;
        }

        /**
         * @param maximumMessageRatePerSecond Maximum number of messages per
         * second that can be sent to the room (by all clients).
         * 
         * @return builder
         * 
         */
        public Builder maximumMessageRatePerSecond(Integer maximumMessageRatePerSecond) {
            return maximumMessageRatePerSecond(Output.of(maximumMessageRatePerSecond));
        }

        /**
         * @param messageReviewHandler Configuration information for optional
         * review of messages.
         * 
         * @return builder
         * 
         */
        public Builder messageReviewHandler(@Nullable Output<RoomMessageReviewHandlerArgs> messageReviewHandler) {
            $.messageReviewHandler = messageReviewHandler;
            return this;
        }

        /**
         * @param messageReviewHandler Configuration information for optional
         * review of messages.
         * 
         * @return builder
         * 
         */
        public Builder messageReviewHandler(RoomMessageReviewHandlerArgs messageReviewHandler) {
            return messageReviewHandler(Output.of(messageReviewHandler));
        }

        /**
         * @param name Room name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Room name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param tags A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tagsAll Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        /**
         * @param tagsAll Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        public RoomState build() {
            return $;
        }
    }

}