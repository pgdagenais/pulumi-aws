// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.medialive.inputs;

import com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsMsSmoothGroupSettingsDestinationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ChannelEncoderSettingsOutputGroupOutputGroupSettingsMsSmoothGroupSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ChannelEncoderSettingsOutputGroupOutputGroupSettingsMsSmoothGroupSettingsArgs Empty = new ChannelEncoderSettingsOutputGroupOutputGroupSettingsMsSmoothGroupSettingsArgs();

    @Import(name="acquisitionPointId")
    private @Nullable Output<String> acquisitionPointId;

    public Optional<Output<String>> acquisitionPointId() {
        return Optional.ofNullable(this.acquisitionPointId);
    }

    @Import(name="audioOnlyTimecodecControl")
    private @Nullable Output<String> audioOnlyTimecodecControl;

    public Optional<Output<String>> audioOnlyTimecodecControl() {
        return Optional.ofNullable(this.audioOnlyTimecodecControl);
    }

    /**
     * Setting to allow self signed or verified RTMP certificates.
     * 
     */
    @Import(name="certificateMode")
    private @Nullable Output<String> certificateMode;

    /**
     * @return Setting to allow self signed or verified RTMP certificates.
     * 
     */
    public Optional<Output<String>> certificateMode() {
        return Optional.ofNullable(this.certificateMode);
    }

    /**
     * Number of seconds to wait before retrying connection to the flash media server if the connection is lost.
     * 
     */
    @Import(name="connectionRetryInterval")
    private @Nullable Output<Integer> connectionRetryInterval;

    /**
     * @return Number of seconds to wait before retrying connection to the flash media server if the connection is lost.
     * 
     */
    public Optional<Output<Integer>> connectionRetryInterval() {
        return Optional.ofNullable(this.connectionRetryInterval);
    }

    /**
     * Destination address and port number for RTP or UDP packets. See Destination for more details.
     * 
     */
    @Import(name="destination", required=true)
    private Output<ChannelEncoderSettingsOutputGroupOutputGroupSettingsMsSmoothGroupSettingsDestinationArgs> destination;

    /**
     * @return Destination address and port number for RTP or UDP packets. See Destination for more details.
     * 
     */
    public Output<ChannelEncoderSettingsOutputGroupOutputGroupSettingsMsSmoothGroupSettingsDestinationArgs> destination() {
        return this.destination;
    }

    @Import(name="eventId")
    private @Nullable Output<Integer> eventId;

    public Optional<Output<Integer>> eventId() {
        return Optional.ofNullable(this.eventId);
    }

    @Import(name="eventIdMode")
    private @Nullable Output<String> eventIdMode;

    public Optional<Output<String>> eventIdMode() {
        return Optional.ofNullable(this.eventIdMode);
    }

    @Import(name="eventStopBehavior")
    private @Nullable Output<String> eventStopBehavior;

    public Optional<Output<String>> eventStopBehavior() {
        return Optional.ofNullable(this.eventStopBehavior);
    }

    @Import(name="filecacheDuration")
    private @Nullable Output<Integer> filecacheDuration;

    public Optional<Output<Integer>> filecacheDuration() {
        return Optional.ofNullable(this.filecacheDuration);
    }

    @Import(name="fragmentLength")
    private @Nullable Output<Integer> fragmentLength;

    public Optional<Output<Integer>> fragmentLength() {
        return Optional.ofNullable(this.fragmentLength);
    }

    /**
     * Specifies behavior of last resort when input video os lost.
     * 
     */
    @Import(name="inputLossAction")
    private @Nullable Output<String> inputLossAction;

    /**
     * @return Specifies behavior of last resort when input video os lost.
     * 
     */
    public Optional<Output<String>> inputLossAction() {
        return Optional.ofNullable(this.inputLossAction);
    }

    /**
     * Number of retry attempts.
     * 
     */
    @Import(name="numRetries")
    private @Nullable Output<Integer> numRetries;

    /**
     * @return Number of retry attempts.
     * 
     */
    public Optional<Output<Integer>> numRetries() {
        return Optional.ofNullable(this.numRetries);
    }

    /**
     * Number of seconds to wait until a restart is initiated.
     * 
     */
    @Import(name="restartDelay")
    private @Nullable Output<Integer> restartDelay;

    /**
     * @return Number of seconds to wait until a restart is initiated.
     * 
     */
    public Optional<Output<Integer>> restartDelay() {
        return Optional.ofNullable(this.restartDelay);
    }

    @Import(name="segmentationMode")
    private @Nullable Output<String> segmentationMode;

    public Optional<Output<String>> segmentationMode() {
        return Optional.ofNullable(this.segmentationMode);
    }

    @Import(name="sendDelayMs")
    private @Nullable Output<Integer> sendDelayMs;

    public Optional<Output<Integer>> sendDelayMs() {
        return Optional.ofNullable(this.sendDelayMs);
    }

    @Import(name="sparseTrackType")
    private @Nullable Output<String> sparseTrackType;

    public Optional<Output<String>> sparseTrackType() {
        return Optional.ofNullable(this.sparseTrackType);
    }

    @Import(name="streamManifestBehavior")
    private @Nullable Output<String> streamManifestBehavior;

    public Optional<Output<String>> streamManifestBehavior() {
        return Optional.ofNullable(this.streamManifestBehavior);
    }

    @Import(name="timestampOffset")
    private @Nullable Output<String> timestampOffset;

    public Optional<Output<String>> timestampOffset() {
        return Optional.ofNullable(this.timestampOffset);
    }

    @Import(name="timestampOffsetMode")
    private @Nullable Output<String> timestampOffsetMode;

    public Optional<Output<String>> timestampOffsetMode() {
        return Optional.ofNullable(this.timestampOffsetMode);
    }

    private ChannelEncoderSettingsOutputGroupOutputGroupSettingsMsSmoothGroupSettingsArgs() {}

    private ChannelEncoderSettingsOutputGroupOutputGroupSettingsMsSmoothGroupSettingsArgs(ChannelEncoderSettingsOutputGroupOutputGroupSettingsMsSmoothGroupSettingsArgs $) {
        this.acquisitionPointId = $.acquisitionPointId;
        this.audioOnlyTimecodecControl = $.audioOnlyTimecodecControl;
        this.certificateMode = $.certificateMode;
        this.connectionRetryInterval = $.connectionRetryInterval;
        this.destination = $.destination;
        this.eventId = $.eventId;
        this.eventIdMode = $.eventIdMode;
        this.eventStopBehavior = $.eventStopBehavior;
        this.filecacheDuration = $.filecacheDuration;
        this.fragmentLength = $.fragmentLength;
        this.inputLossAction = $.inputLossAction;
        this.numRetries = $.numRetries;
        this.restartDelay = $.restartDelay;
        this.segmentationMode = $.segmentationMode;
        this.sendDelayMs = $.sendDelayMs;
        this.sparseTrackType = $.sparseTrackType;
        this.streamManifestBehavior = $.streamManifestBehavior;
        this.timestampOffset = $.timestampOffset;
        this.timestampOffsetMode = $.timestampOffsetMode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ChannelEncoderSettingsOutputGroupOutputGroupSettingsMsSmoothGroupSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ChannelEncoderSettingsOutputGroupOutputGroupSettingsMsSmoothGroupSettingsArgs $;

        public Builder() {
            $ = new ChannelEncoderSettingsOutputGroupOutputGroupSettingsMsSmoothGroupSettingsArgs();
        }

        public Builder(ChannelEncoderSettingsOutputGroupOutputGroupSettingsMsSmoothGroupSettingsArgs defaults) {
            $ = new ChannelEncoderSettingsOutputGroupOutputGroupSettingsMsSmoothGroupSettingsArgs(Objects.requireNonNull(defaults));
        }

        public Builder acquisitionPointId(@Nullable Output<String> acquisitionPointId) {
            $.acquisitionPointId = acquisitionPointId;
            return this;
        }

        public Builder acquisitionPointId(String acquisitionPointId) {
            return acquisitionPointId(Output.of(acquisitionPointId));
        }

        public Builder audioOnlyTimecodecControl(@Nullable Output<String> audioOnlyTimecodecControl) {
            $.audioOnlyTimecodecControl = audioOnlyTimecodecControl;
            return this;
        }

        public Builder audioOnlyTimecodecControl(String audioOnlyTimecodecControl) {
            return audioOnlyTimecodecControl(Output.of(audioOnlyTimecodecControl));
        }

        /**
         * @param certificateMode Setting to allow self signed or verified RTMP certificates.
         * 
         * @return builder
         * 
         */
        public Builder certificateMode(@Nullable Output<String> certificateMode) {
            $.certificateMode = certificateMode;
            return this;
        }

        /**
         * @param certificateMode Setting to allow self signed or verified RTMP certificates.
         * 
         * @return builder
         * 
         */
        public Builder certificateMode(String certificateMode) {
            return certificateMode(Output.of(certificateMode));
        }

        /**
         * @param connectionRetryInterval Number of seconds to wait before retrying connection to the flash media server if the connection is lost.
         * 
         * @return builder
         * 
         */
        public Builder connectionRetryInterval(@Nullable Output<Integer> connectionRetryInterval) {
            $.connectionRetryInterval = connectionRetryInterval;
            return this;
        }

        /**
         * @param connectionRetryInterval Number of seconds to wait before retrying connection to the flash media server if the connection is lost.
         * 
         * @return builder
         * 
         */
        public Builder connectionRetryInterval(Integer connectionRetryInterval) {
            return connectionRetryInterval(Output.of(connectionRetryInterval));
        }

        /**
         * @param destination Destination address and port number for RTP or UDP packets. See Destination for more details.
         * 
         * @return builder
         * 
         */
        public Builder destination(Output<ChannelEncoderSettingsOutputGroupOutputGroupSettingsMsSmoothGroupSettingsDestinationArgs> destination) {
            $.destination = destination;
            return this;
        }

        /**
         * @param destination Destination address and port number for RTP or UDP packets. See Destination for more details.
         * 
         * @return builder
         * 
         */
        public Builder destination(ChannelEncoderSettingsOutputGroupOutputGroupSettingsMsSmoothGroupSettingsDestinationArgs destination) {
            return destination(Output.of(destination));
        }

        public Builder eventId(@Nullable Output<Integer> eventId) {
            $.eventId = eventId;
            return this;
        }

        public Builder eventId(Integer eventId) {
            return eventId(Output.of(eventId));
        }

        public Builder eventIdMode(@Nullable Output<String> eventIdMode) {
            $.eventIdMode = eventIdMode;
            return this;
        }

        public Builder eventIdMode(String eventIdMode) {
            return eventIdMode(Output.of(eventIdMode));
        }

        public Builder eventStopBehavior(@Nullable Output<String> eventStopBehavior) {
            $.eventStopBehavior = eventStopBehavior;
            return this;
        }

        public Builder eventStopBehavior(String eventStopBehavior) {
            return eventStopBehavior(Output.of(eventStopBehavior));
        }

        public Builder filecacheDuration(@Nullable Output<Integer> filecacheDuration) {
            $.filecacheDuration = filecacheDuration;
            return this;
        }

        public Builder filecacheDuration(Integer filecacheDuration) {
            return filecacheDuration(Output.of(filecacheDuration));
        }

        public Builder fragmentLength(@Nullable Output<Integer> fragmentLength) {
            $.fragmentLength = fragmentLength;
            return this;
        }

        public Builder fragmentLength(Integer fragmentLength) {
            return fragmentLength(Output.of(fragmentLength));
        }

        /**
         * @param inputLossAction Specifies behavior of last resort when input video os lost.
         * 
         * @return builder
         * 
         */
        public Builder inputLossAction(@Nullable Output<String> inputLossAction) {
            $.inputLossAction = inputLossAction;
            return this;
        }

        /**
         * @param inputLossAction Specifies behavior of last resort when input video os lost.
         * 
         * @return builder
         * 
         */
        public Builder inputLossAction(String inputLossAction) {
            return inputLossAction(Output.of(inputLossAction));
        }

        /**
         * @param numRetries Number of retry attempts.
         * 
         * @return builder
         * 
         */
        public Builder numRetries(@Nullable Output<Integer> numRetries) {
            $.numRetries = numRetries;
            return this;
        }

        /**
         * @param numRetries Number of retry attempts.
         * 
         * @return builder
         * 
         */
        public Builder numRetries(Integer numRetries) {
            return numRetries(Output.of(numRetries));
        }

        /**
         * @param restartDelay Number of seconds to wait until a restart is initiated.
         * 
         * @return builder
         * 
         */
        public Builder restartDelay(@Nullable Output<Integer> restartDelay) {
            $.restartDelay = restartDelay;
            return this;
        }

        /**
         * @param restartDelay Number of seconds to wait until a restart is initiated.
         * 
         * @return builder
         * 
         */
        public Builder restartDelay(Integer restartDelay) {
            return restartDelay(Output.of(restartDelay));
        }

        public Builder segmentationMode(@Nullable Output<String> segmentationMode) {
            $.segmentationMode = segmentationMode;
            return this;
        }

        public Builder segmentationMode(String segmentationMode) {
            return segmentationMode(Output.of(segmentationMode));
        }

        public Builder sendDelayMs(@Nullable Output<Integer> sendDelayMs) {
            $.sendDelayMs = sendDelayMs;
            return this;
        }

        public Builder sendDelayMs(Integer sendDelayMs) {
            return sendDelayMs(Output.of(sendDelayMs));
        }

        public Builder sparseTrackType(@Nullable Output<String> sparseTrackType) {
            $.sparseTrackType = sparseTrackType;
            return this;
        }

        public Builder sparseTrackType(String sparseTrackType) {
            return sparseTrackType(Output.of(sparseTrackType));
        }

        public Builder streamManifestBehavior(@Nullable Output<String> streamManifestBehavior) {
            $.streamManifestBehavior = streamManifestBehavior;
            return this;
        }

        public Builder streamManifestBehavior(String streamManifestBehavior) {
            return streamManifestBehavior(Output.of(streamManifestBehavior));
        }

        public Builder timestampOffset(@Nullable Output<String> timestampOffset) {
            $.timestampOffset = timestampOffset;
            return this;
        }

        public Builder timestampOffset(String timestampOffset) {
            return timestampOffset(Output.of(timestampOffset));
        }

        public Builder timestampOffsetMode(@Nullable Output<String> timestampOffsetMode) {
            $.timestampOffsetMode = timestampOffsetMode;
            return this;
        }

        public Builder timestampOffsetMode(String timestampOffsetMode) {
            return timestampOffsetMode(Output.of(timestampOffsetMode));
        }

        public ChannelEncoderSettingsOutputGroupOutputGroupSettingsMsSmoothGroupSettingsArgs build() {
            $.destination = Objects.requireNonNull($.destination, "expected parameter 'destination' to be non-null");
            return $;
        }
    }

}