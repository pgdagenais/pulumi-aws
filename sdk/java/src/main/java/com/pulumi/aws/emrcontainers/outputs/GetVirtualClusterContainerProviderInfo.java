// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.emrcontainers.outputs;

import com.pulumi.aws.emrcontainers.outputs.GetVirtualClusterContainerProviderInfoEksInfo;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetVirtualClusterContainerProviderInfo {
    /**
     * @return Nested list containing EKS-specific information about the cluster where the EMR Containers cluster is running
     * 
     */
    private final List<GetVirtualClusterContainerProviderInfoEksInfo> eksInfos;

    @CustomType.Constructor
    private GetVirtualClusterContainerProviderInfo(@CustomType.Parameter("eksInfos") List<GetVirtualClusterContainerProviderInfoEksInfo> eksInfos) {
        this.eksInfos = eksInfos;
    }

    /**
     * @return Nested list containing EKS-specific information about the cluster where the EMR Containers cluster is running
     * 
     */
    public List<GetVirtualClusterContainerProviderInfoEksInfo> eksInfos() {
        return this.eksInfos;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualClusterContainerProviderInfo defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetVirtualClusterContainerProviderInfoEksInfo> eksInfos;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVirtualClusterContainerProviderInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eksInfos = defaults.eksInfos;
        }

        public Builder eksInfos(List<GetVirtualClusterContainerProviderInfoEksInfo> eksInfos) {
            this.eksInfos = Objects.requireNonNull(eksInfos);
            return this;
        }
        public Builder eksInfos(GetVirtualClusterContainerProviderInfoEksInfo... eksInfos) {
            return eksInfos(List.of(eksInfos));
        }        public GetVirtualClusterContainerProviderInfo build() {
            return new GetVirtualClusterContainerProviderInfo(eksInfos);
        }
    }
}