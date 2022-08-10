// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetInstanceRootBlockDevice {
    /**
     * @return If the root block device will be deleted on termination.
     * 
     */
    private final Boolean deleteOnTermination;
    /**
     * @return The physical name of the device.
     * 
     */
    private final String deviceName;
    /**
     * @return If the EBS volume is encrypted.
     * 
     */
    private final Boolean encrypted;
    /**
     * @return `0` If the volume is not a provisioned IOPS image, otherwise the supported IOPS count.
     * 
     */
    private final Integer iops;
    private final String kmsKeyId;
    /**
     * @return A map of tags assigned to the Instance.
     * 
     */
    private final Map<String,String> tags;
    /**
     * @return The throughput of the volume, in MiB/s.
     * 
     */
    private final Integer throughput;
    private final String volumeId;
    /**
     * @return The size of the volume, in GiB.
     * 
     */
    private final Integer volumeSize;
    /**
     * @return The type of the volume.
     * 
     */
    private final String volumeType;

    @CustomType.Constructor
    private GetInstanceRootBlockDevice(
        @CustomType.Parameter("deleteOnTermination") Boolean deleteOnTermination,
        @CustomType.Parameter("deviceName") String deviceName,
        @CustomType.Parameter("encrypted") Boolean encrypted,
        @CustomType.Parameter("iops") Integer iops,
        @CustomType.Parameter("kmsKeyId") String kmsKeyId,
        @CustomType.Parameter("tags") Map<String,String> tags,
        @CustomType.Parameter("throughput") Integer throughput,
        @CustomType.Parameter("volumeId") String volumeId,
        @CustomType.Parameter("volumeSize") Integer volumeSize,
        @CustomType.Parameter("volumeType") String volumeType) {
        this.deleteOnTermination = deleteOnTermination;
        this.deviceName = deviceName;
        this.encrypted = encrypted;
        this.iops = iops;
        this.kmsKeyId = kmsKeyId;
        this.tags = tags;
        this.throughput = throughput;
        this.volumeId = volumeId;
        this.volumeSize = volumeSize;
        this.volumeType = volumeType;
    }

    /**
     * @return If the root block device will be deleted on termination.
     * 
     */
    public Boolean deleteOnTermination() {
        return this.deleteOnTermination;
    }
    /**
     * @return The physical name of the device.
     * 
     */
    public String deviceName() {
        return this.deviceName;
    }
    /**
     * @return If the EBS volume is encrypted.
     * 
     */
    public Boolean encrypted() {
        return this.encrypted;
    }
    /**
     * @return `0` If the volume is not a provisioned IOPS image, otherwise the supported IOPS count.
     * 
     */
    public Integer iops() {
        return this.iops;
    }
    public String kmsKeyId() {
        return this.kmsKeyId;
    }
    /**
     * @return A map of tags assigned to the Instance.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }
    /**
     * @return The throughput of the volume, in MiB/s.
     * 
     */
    public Integer throughput() {
        return this.throughput;
    }
    public String volumeId() {
        return this.volumeId;
    }
    /**
     * @return The size of the volume, in GiB.
     * 
     */
    public Integer volumeSize() {
        return this.volumeSize;
    }
    /**
     * @return The type of the volume.
     * 
     */
    public String volumeType() {
        return this.volumeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceRootBlockDevice defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean deleteOnTermination;
        private String deviceName;
        private Boolean encrypted;
        private Integer iops;
        private String kmsKeyId;
        private Map<String,String> tags;
        private Integer throughput;
        private String volumeId;
        private Integer volumeSize;
        private String volumeType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceRootBlockDevice defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteOnTermination = defaults.deleteOnTermination;
    	      this.deviceName = defaults.deviceName;
    	      this.encrypted = defaults.encrypted;
    	      this.iops = defaults.iops;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.tags = defaults.tags;
    	      this.throughput = defaults.throughput;
    	      this.volumeId = defaults.volumeId;
    	      this.volumeSize = defaults.volumeSize;
    	      this.volumeType = defaults.volumeType;
        }

        public Builder deleteOnTermination(Boolean deleteOnTermination) {
            this.deleteOnTermination = Objects.requireNonNull(deleteOnTermination);
            return this;
        }
        public Builder deviceName(String deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }
        public Builder encrypted(Boolean encrypted) {
            this.encrypted = Objects.requireNonNull(encrypted);
            return this;
        }
        public Builder iops(Integer iops) {
            this.iops = Objects.requireNonNull(iops);
            return this;
        }
        public Builder kmsKeyId(String kmsKeyId) {
            this.kmsKeyId = Objects.requireNonNull(kmsKeyId);
            return this;
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder throughput(Integer throughput) {
            this.throughput = Objects.requireNonNull(throughput);
            return this;
        }
        public Builder volumeId(String volumeId) {
            this.volumeId = Objects.requireNonNull(volumeId);
            return this;
        }
        public Builder volumeSize(Integer volumeSize) {
            this.volumeSize = Objects.requireNonNull(volumeSize);
            return this;
        }
        public Builder volumeType(String volumeType) {
            this.volumeType = Objects.requireNonNull(volumeType);
            return this;
        }        public GetInstanceRootBlockDevice build() {
            return new GetInstanceRootBlockDevice(deleteOnTermination, deviceName, encrypted, iops, kmsKeyId, tags, throughput, volumeId, volumeSize, volumeType);
        }
    }
}