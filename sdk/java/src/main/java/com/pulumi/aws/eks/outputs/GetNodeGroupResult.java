// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.eks.outputs;

import com.pulumi.aws.eks.outputs.GetNodeGroupLaunchTemplate;
import com.pulumi.aws.eks.outputs.GetNodeGroupRemoteAccess;
import com.pulumi.aws.eks.outputs.GetNodeGroupResource;
import com.pulumi.aws.eks.outputs.GetNodeGroupScalingConfig;
import com.pulumi.aws.eks.outputs.GetNodeGroupTaint;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetNodeGroupResult {
    /**
     * @return Type of Amazon Machine Image (AMI) associated with the EKS Node Group.
     * 
     */
    private String amiType;
    /**
     * @return ARN of the EKS Node Group.
     * 
     */
    private String arn;
    /**
     * @return Type of capacity associated with the EKS Node Group. Valid values: `ON_DEMAND`, `SPOT`.
     * 
     */
    private String capacityType;
    private String clusterName;
    /**
     * @return Disk size in GiB for worker nodes.
     * 
     */
    private Integer diskSize;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Set of instance types associated with the EKS Node Group.
     * 
     */
    private List<String> instanceTypes;
    /**
     * @return Key-value map of Kubernetes labels. Only labels that are applied with the EKS API are managed by this argument. Other Kubernetes labels applied to the EKS Node Group will not be managed.
     * 
     */
    private Map<String,String> labels;
    /**
     * @return Nested attribute containing information about the launch template used to create the EKS Node Group.
     * 
     */
    private List<GetNodeGroupLaunchTemplate> launchTemplates;
    private String nodeGroupName;
    /**
     * @return ARN of the IAM Role that provides permissions for the EKS Node Group.
     * 
     */
    private String nodeRoleArn;
    /**
     * @return AMI version of the EKS Node Group.
     * 
     */
    private String releaseVersion;
    /**
     * @return Configuration block with remote access settings.
     * 
     */
    private List<GetNodeGroupRemoteAccess> remoteAccesses;
    /**
     * @return List of objects containing information about underlying resources.
     * 
     */
    private List<GetNodeGroupResource> resources;
    /**
     * @return Configuration block with scaling settings.
     * 
     */
    private List<GetNodeGroupScalingConfig> scalingConfigs;
    /**
     * @return Status of the EKS Node Group.
     * 
     */
    private String status;
    /**
     * @return Identifiers of EC2 Subnets to associate with the EKS Node Group.
     * 
     */
    private List<String> subnetIds;
    /**
     * @return Key-value map of resource tags.
     * 
     */
    private Map<String,String> tags;
    /**
     * @return List of objects containing information about taints applied to the nodes in the EKS Node Group.
     * 
     */
    private List<GetNodeGroupTaint> taints;
    /**
     * @return Kubernetes version.
     * 
     */
    private String version;

    private GetNodeGroupResult() {}
    /**
     * @return Type of Amazon Machine Image (AMI) associated with the EKS Node Group.
     * 
     */
    public String amiType() {
        return this.amiType;
    }
    /**
     * @return ARN of the EKS Node Group.
     * 
     */
    public String arn() {
        return this.arn;
    }
    /**
     * @return Type of capacity associated with the EKS Node Group. Valid values: `ON_DEMAND`, `SPOT`.
     * 
     */
    public String capacityType() {
        return this.capacityType;
    }
    public String clusterName() {
        return this.clusterName;
    }
    /**
     * @return Disk size in GiB for worker nodes.
     * 
     */
    public Integer diskSize() {
        return this.diskSize;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Set of instance types associated with the EKS Node Group.
     * 
     */
    public List<String> instanceTypes() {
        return this.instanceTypes;
    }
    /**
     * @return Key-value map of Kubernetes labels. Only labels that are applied with the EKS API are managed by this argument. Other Kubernetes labels applied to the EKS Node Group will not be managed.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return Nested attribute containing information about the launch template used to create the EKS Node Group.
     * 
     */
    public List<GetNodeGroupLaunchTemplate> launchTemplates() {
        return this.launchTemplates;
    }
    public String nodeGroupName() {
        return this.nodeGroupName;
    }
    /**
     * @return ARN of the IAM Role that provides permissions for the EKS Node Group.
     * 
     */
    public String nodeRoleArn() {
        return this.nodeRoleArn;
    }
    /**
     * @return AMI version of the EKS Node Group.
     * 
     */
    public String releaseVersion() {
        return this.releaseVersion;
    }
    /**
     * @return Configuration block with remote access settings.
     * 
     */
    public List<GetNodeGroupRemoteAccess> remoteAccesses() {
        return this.remoteAccesses;
    }
    /**
     * @return List of objects containing information about underlying resources.
     * 
     */
    public List<GetNodeGroupResource> resources() {
        return this.resources;
    }
    /**
     * @return Configuration block with scaling settings.
     * 
     */
    public List<GetNodeGroupScalingConfig> scalingConfigs() {
        return this.scalingConfigs;
    }
    /**
     * @return Status of the EKS Node Group.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return Identifiers of EC2 Subnets to associate with the EKS Node Group.
     * 
     */
    public List<String> subnetIds() {
        return this.subnetIds;
    }
    /**
     * @return Key-value map of resource tags.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }
    /**
     * @return List of objects containing information about taints applied to the nodes in the EKS Node Group.
     * 
     */
    public List<GetNodeGroupTaint> taints() {
        return this.taints;
    }
    /**
     * @return Kubernetes version.
     * 
     */
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNodeGroupResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String amiType;
        private String arn;
        private String capacityType;
        private String clusterName;
        private Integer diskSize;
        private String id;
        private List<String> instanceTypes;
        private Map<String,String> labels;
        private List<GetNodeGroupLaunchTemplate> launchTemplates;
        private String nodeGroupName;
        private String nodeRoleArn;
        private String releaseVersion;
        private List<GetNodeGroupRemoteAccess> remoteAccesses;
        private List<GetNodeGroupResource> resources;
        private List<GetNodeGroupScalingConfig> scalingConfigs;
        private String status;
        private List<String> subnetIds;
        private Map<String,String> tags;
        private List<GetNodeGroupTaint> taints;
        private String version;
        public Builder() {}
        public Builder(GetNodeGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.amiType = defaults.amiType;
    	      this.arn = defaults.arn;
    	      this.capacityType = defaults.capacityType;
    	      this.clusterName = defaults.clusterName;
    	      this.diskSize = defaults.diskSize;
    	      this.id = defaults.id;
    	      this.instanceTypes = defaults.instanceTypes;
    	      this.labels = defaults.labels;
    	      this.launchTemplates = defaults.launchTemplates;
    	      this.nodeGroupName = defaults.nodeGroupName;
    	      this.nodeRoleArn = defaults.nodeRoleArn;
    	      this.releaseVersion = defaults.releaseVersion;
    	      this.remoteAccesses = defaults.remoteAccesses;
    	      this.resources = defaults.resources;
    	      this.scalingConfigs = defaults.scalingConfigs;
    	      this.status = defaults.status;
    	      this.subnetIds = defaults.subnetIds;
    	      this.tags = defaults.tags;
    	      this.taints = defaults.taints;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder amiType(String amiType) {
            if (amiType == null) {
              throw new MissingRequiredPropertyException("GetNodeGroupResult", "amiType");
            }
            this.amiType = amiType;
            return this;
        }
        @CustomType.Setter
        public Builder arn(String arn) {
            if (arn == null) {
              throw new MissingRequiredPropertyException("GetNodeGroupResult", "arn");
            }
            this.arn = arn;
            return this;
        }
        @CustomType.Setter
        public Builder capacityType(String capacityType) {
            if (capacityType == null) {
              throw new MissingRequiredPropertyException("GetNodeGroupResult", "capacityType");
            }
            this.capacityType = capacityType;
            return this;
        }
        @CustomType.Setter
        public Builder clusterName(String clusterName) {
            if (clusterName == null) {
              throw new MissingRequiredPropertyException("GetNodeGroupResult", "clusterName");
            }
            this.clusterName = clusterName;
            return this;
        }
        @CustomType.Setter
        public Builder diskSize(Integer diskSize) {
            if (diskSize == null) {
              throw new MissingRequiredPropertyException("GetNodeGroupResult", "diskSize");
            }
            this.diskSize = diskSize;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetNodeGroupResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder instanceTypes(List<String> instanceTypes) {
            if (instanceTypes == null) {
              throw new MissingRequiredPropertyException("GetNodeGroupResult", "instanceTypes");
            }
            this.instanceTypes = instanceTypes;
            return this;
        }
        public Builder instanceTypes(String... instanceTypes) {
            return instanceTypes(List.of(instanceTypes));
        }
        @CustomType.Setter
        public Builder labels(Map<String,String> labels) {
            if (labels == null) {
              throw new MissingRequiredPropertyException("GetNodeGroupResult", "labels");
            }
            this.labels = labels;
            return this;
        }
        @CustomType.Setter
        public Builder launchTemplates(List<GetNodeGroupLaunchTemplate> launchTemplates) {
            if (launchTemplates == null) {
              throw new MissingRequiredPropertyException("GetNodeGroupResult", "launchTemplates");
            }
            this.launchTemplates = launchTemplates;
            return this;
        }
        public Builder launchTemplates(GetNodeGroupLaunchTemplate... launchTemplates) {
            return launchTemplates(List.of(launchTemplates));
        }
        @CustomType.Setter
        public Builder nodeGroupName(String nodeGroupName) {
            if (nodeGroupName == null) {
              throw new MissingRequiredPropertyException("GetNodeGroupResult", "nodeGroupName");
            }
            this.nodeGroupName = nodeGroupName;
            return this;
        }
        @CustomType.Setter
        public Builder nodeRoleArn(String nodeRoleArn) {
            if (nodeRoleArn == null) {
              throw new MissingRequiredPropertyException("GetNodeGroupResult", "nodeRoleArn");
            }
            this.nodeRoleArn = nodeRoleArn;
            return this;
        }
        @CustomType.Setter
        public Builder releaseVersion(String releaseVersion) {
            if (releaseVersion == null) {
              throw new MissingRequiredPropertyException("GetNodeGroupResult", "releaseVersion");
            }
            this.releaseVersion = releaseVersion;
            return this;
        }
        @CustomType.Setter
        public Builder remoteAccesses(List<GetNodeGroupRemoteAccess> remoteAccesses) {
            if (remoteAccesses == null) {
              throw new MissingRequiredPropertyException("GetNodeGroupResult", "remoteAccesses");
            }
            this.remoteAccesses = remoteAccesses;
            return this;
        }
        public Builder remoteAccesses(GetNodeGroupRemoteAccess... remoteAccesses) {
            return remoteAccesses(List.of(remoteAccesses));
        }
        @CustomType.Setter
        public Builder resources(List<GetNodeGroupResource> resources) {
            if (resources == null) {
              throw new MissingRequiredPropertyException("GetNodeGroupResult", "resources");
            }
            this.resources = resources;
            return this;
        }
        public Builder resources(GetNodeGroupResource... resources) {
            return resources(List.of(resources));
        }
        @CustomType.Setter
        public Builder scalingConfigs(List<GetNodeGroupScalingConfig> scalingConfigs) {
            if (scalingConfigs == null) {
              throw new MissingRequiredPropertyException("GetNodeGroupResult", "scalingConfigs");
            }
            this.scalingConfigs = scalingConfigs;
            return this;
        }
        public Builder scalingConfigs(GetNodeGroupScalingConfig... scalingConfigs) {
            return scalingConfigs(List.of(scalingConfigs));
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetNodeGroupResult", "status");
            }
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder subnetIds(List<String> subnetIds) {
            if (subnetIds == null) {
              throw new MissingRequiredPropertyException("GetNodeGroupResult", "subnetIds");
            }
            this.subnetIds = subnetIds;
            return this;
        }
        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
        }
        @CustomType.Setter
        public Builder tags(Map<String,String> tags) {
            if (tags == null) {
              throw new MissingRequiredPropertyException("GetNodeGroupResult", "tags");
            }
            this.tags = tags;
            return this;
        }
        @CustomType.Setter
        public Builder taints(List<GetNodeGroupTaint> taints) {
            if (taints == null) {
              throw new MissingRequiredPropertyException("GetNodeGroupResult", "taints");
            }
            this.taints = taints;
            return this;
        }
        public Builder taints(GetNodeGroupTaint... taints) {
            return taints(List.of(taints));
        }
        @CustomType.Setter
        public Builder version(String version) {
            if (version == null) {
              throw new MissingRequiredPropertyException("GetNodeGroupResult", "version");
            }
            this.version = version;
            return this;
        }
        public GetNodeGroupResult build() {
            final var _resultValue = new GetNodeGroupResult();
            _resultValue.amiType = amiType;
            _resultValue.arn = arn;
            _resultValue.capacityType = capacityType;
            _resultValue.clusterName = clusterName;
            _resultValue.diskSize = diskSize;
            _resultValue.id = id;
            _resultValue.instanceTypes = instanceTypes;
            _resultValue.labels = labels;
            _resultValue.launchTemplates = launchTemplates;
            _resultValue.nodeGroupName = nodeGroupName;
            _resultValue.nodeRoleArn = nodeRoleArn;
            _resultValue.releaseVersion = releaseVersion;
            _resultValue.remoteAccesses = remoteAccesses;
            _resultValue.resources = resources;
            _resultValue.scalingConfigs = scalingConfigs;
            _resultValue.status = status;
            _resultValue.subnetIds = subnetIds;
            _resultValue.tags = tags;
            _resultValue.taints = taints;
            _resultValue.version = version;
            return _resultValue;
        }
    }
}
