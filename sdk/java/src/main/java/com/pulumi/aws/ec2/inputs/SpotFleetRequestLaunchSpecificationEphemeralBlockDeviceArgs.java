// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class SpotFleetRequestLaunchSpecificationEphemeralBlockDeviceArgs extends com.pulumi.resources.ResourceArgs {

    public static final SpotFleetRequestLaunchSpecificationEphemeralBlockDeviceArgs Empty = new SpotFleetRequestLaunchSpecificationEphemeralBlockDeviceArgs();

    @Import(name="deviceName", required=true)
    private Output<String> deviceName;

    public Output<String> deviceName() {
        return this.deviceName;
    }

    @Import(name="virtualName", required=true)
    private Output<String> virtualName;

    public Output<String> virtualName() {
        return this.virtualName;
    }

    private SpotFleetRequestLaunchSpecificationEphemeralBlockDeviceArgs() {}

    private SpotFleetRequestLaunchSpecificationEphemeralBlockDeviceArgs(SpotFleetRequestLaunchSpecificationEphemeralBlockDeviceArgs $) {
        this.deviceName = $.deviceName;
        this.virtualName = $.virtualName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SpotFleetRequestLaunchSpecificationEphemeralBlockDeviceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SpotFleetRequestLaunchSpecificationEphemeralBlockDeviceArgs $;

        public Builder() {
            $ = new SpotFleetRequestLaunchSpecificationEphemeralBlockDeviceArgs();
        }

        public Builder(SpotFleetRequestLaunchSpecificationEphemeralBlockDeviceArgs defaults) {
            $ = new SpotFleetRequestLaunchSpecificationEphemeralBlockDeviceArgs(Objects.requireNonNull(defaults));
        }

        public Builder deviceName(Output<String> deviceName) {
            $.deviceName = deviceName;
            return this;
        }

        public Builder deviceName(String deviceName) {
            return deviceName(Output.of(deviceName));
        }

        public Builder virtualName(Output<String> virtualName) {
            $.virtualName = virtualName;
            return this;
        }

        public Builder virtualName(String virtualName) {
            return virtualName(Output.of(virtualName));
        }

        public SpotFleetRequestLaunchSpecificationEphemeralBlockDeviceArgs build() {
            $.deviceName = Objects.requireNonNull($.deviceName, "expected parameter 'deviceName' to be non-null");
            $.virtualName = Objects.requireNonNull($.virtualName, "expected parameter 'virtualName' to be non-null");
            return $;
        }
    }

}