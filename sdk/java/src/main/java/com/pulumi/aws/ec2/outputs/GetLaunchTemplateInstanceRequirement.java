// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.aws.ec2.outputs.GetLaunchTemplateInstanceRequirementAcceleratorCount;
import com.pulumi.aws.ec2.outputs.GetLaunchTemplateInstanceRequirementAcceleratorTotalMemoryMib;
import com.pulumi.aws.ec2.outputs.GetLaunchTemplateInstanceRequirementBaselineEbsBandwidthMbp;
import com.pulumi.aws.ec2.outputs.GetLaunchTemplateInstanceRequirementMemoryGibPerVcpus;
import com.pulumi.aws.ec2.outputs.GetLaunchTemplateInstanceRequirementMemoryMib;
import com.pulumi.aws.ec2.outputs.GetLaunchTemplateInstanceRequirementNetworkBandwidthGbp;
import com.pulumi.aws.ec2.outputs.GetLaunchTemplateInstanceRequirementNetworkInterfaceCount;
import com.pulumi.aws.ec2.outputs.GetLaunchTemplateInstanceRequirementTotalLocalStorageGb;
import com.pulumi.aws.ec2.outputs.GetLaunchTemplateInstanceRequirementVcpuCount;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetLaunchTemplateInstanceRequirement {
    private List<GetLaunchTemplateInstanceRequirementAcceleratorCount> acceleratorCounts;
    private List<String> acceleratorManufacturers;
    private List<String> acceleratorNames;
    private List<GetLaunchTemplateInstanceRequirementAcceleratorTotalMemoryMib> acceleratorTotalMemoryMibs;
    private List<String> acceleratorTypes;
    private List<String> allowedInstanceTypes;
    private String bareMetal;
    private List<GetLaunchTemplateInstanceRequirementBaselineEbsBandwidthMbp> baselineEbsBandwidthMbps;
    private String burstablePerformance;
    private List<String> cpuManufacturers;
    private List<String> excludedInstanceTypes;
    private List<String> instanceGenerations;
    private String localStorage;
    private List<String> localStorageTypes;
    private List<GetLaunchTemplateInstanceRequirementMemoryGibPerVcpus> memoryGibPerVcpus;
    private List<GetLaunchTemplateInstanceRequirementMemoryMib> memoryMibs;
    private List<GetLaunchTemplateInstanceRequirementNetworkBandwidthGbp> networkBandwidthGbps;
    private List<GetLaunchTemplateInstanceRequirementNetworkInterfaceCount> networkInterfaceCounts;
    private Integer onDemandMaxPricePercentageOverLowestPrice;
    private Boolean requireHibernateSupport;
    private Integer spotMaxPricePercentageOverLowestPrice;
    private List<GetLaunchTemplateInstanceRequirementTotalLocalStorageGb> totalLocalStorageGbs;
    private List<GetLaunchTemplateInstanceRequirementVcpuCount> vcpuCounts;

    private GetLaunchTemplateInstanceRequirement() {}
    public List<GetLaunchTemplateInstanceRequirementAcceleratorCount> acceleratorCounts() {
        return this.acceleratorCounts;
    }
    public List<String> acceleratorManufacturers() {
        return this.acceleratorManufacturers;
    }
    public List<String> acceleratorNames() {
        return this.acceleratorNames;
    }
    public List<GetLaunchTemplateInstanceRequirementAcceleratorTotalMemoryMib> acceleratorTotalMemoryMibs() {
        return this.acceleratorTotalMemoryMibs;
    }
    public List<String> acceleratorTypes() {
        return this.acceleratorTypes;
    }
    public List<String> allowedInstanceTypes() {
        return this.allowedInstanceTypes;
    }
    public String bareMetal() {
        return this.bareMetal;
    }
    public List<GetLaunchTemplateInstanceRequirementBaselineEbsBandwidthMbp> baselineEbsBandwidthMbps() {
        return this.baselineEbsBandwidthMbps;
    }
    public String burstablePerformance() {
        return this.burstablePerformance;
    }
    public List<String> cpuManufacturers() {
        return this.cpuManufacturers;
    }
    public List<String> excludedInstanceTypes() {
        return this.excludedInstanceTypes;
    }
    public List<String> instanceGenerations() {
        return this.instanceGenerations;
    }
    public String localStorage() {
        return this.localStorage;
    }
    public List<String> localStorageTypes() {
        return this.localStorageTypes;
    }
    public List<GetLaunchTemplateInstanceRequirementMemoryGibPerVcpus> memoryGibPerVcpus() {
        return this.memoryGibPerVcpus;
    }
    public List<GetLaunchTemplateInstanceRequirementMemoryMib> memoryMibs() {
        return this.memoryMibs;
    }
    public List<GetLaunchTemplateInstanceRequirementNetworkBandwidthGbp> networkBandwidthGbps() {
        return this.networkBandwidthGbps;
    }
    public List<GetLaunchTemplateInstanceRequirementNetworkInterfaceCount> networkInterfaceCounts() {
        return this.networkInterfaceCounts;
    }
    public Integer onDemandMaxPricePercentageOverLowestPrice() {
        return this.onDemandMaxPricePercentageOverLowestPrice;
    }
    public Boolean requireHibernateSupport() {
        return this.requireHibernateSupport;
    }
    public Integer spotMaxPricePercentageOverLowestPrice() {
        return this.spotMaxPricePercentageOverLowestPrice;
    }
    public List<GetLaunchTemplateInstanceRequirementTotalLocalStorageGb> totalLocalStorageGbs() {
        return this.totalLocalStorageGbs;
    }
    public List<GetLaunchTemplateInstanceRequirementVcpuCount> vcpuCounts() {
        return this.vcpuCounts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLaunchTemplateInstanceRequirement defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetLaunchTemplateInstanceRequirementAcceleratorCount> acceleratorCounts;
        private List<String> acceleratorManufacturers;
        private List<String> acceleratorNames;
        private List<GetLaunchTemplateInstanceRequirementAcceleratorTotalMemoryMib> acceleratorTotalMemoryMibs;
        private List<String> acceleratorTypes;
        private List<String> allowedInstanceTypes;
        private String bareMetal;
        private List<GetLaunchTemplateInstanceRequirementBaselineEbsBandwidthMbp> baselineEbsBandwidthMbps;
        private String burstablePerformance;
        private List<String> cpuManufacturers;
        private List<String> excludedInstanceTypes;
        private List<String> instanceGenerations;
        private String localStorage;
        private List<String> localStorageTypes;
        private List<GetLaunchTemplateInstanceRequirementMemoryGibPerVcpus> memoryGibPerVcpus;
        private List<GetLaunchTemplateInstanceRequirementMemoryMib> memoryMibs;
        private List<GetLaunchTemplateInstanceRequirementNetworkBandwidthGbp> networkBandwidthGbps;
        private List<GetLaunchTemplateInstanceRequirementNetworkInterfaceCount> networkInterfaceCounts;
        private Integer onDemandMaxPricePercentageOverLowestPrice;
        private Boolean requireHibernateSupport;
        private Integer spotMaxPricePercentageOverLowestPrice;
        private List<GetLaunchTemplateInstanceRequirementTotalLocalStorageGb> totalLocalStorageGbs;
        private List<GetLaunchTemplateInstanceRequirementVcpuCount> vcpuCounts;
        public Builder() {}
        public Builder(GetLaunchTemplateInstanceRequirement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratorCounts = defaults.acceleratorCounts;
    	      this.acceleratorManufacturers = defaults.acceleratorManufacturers;
    	      this.acceleratorNames = defaults.acceleratorNames;
    	      this.acceleratorTotalMemoryMibs = defaults.acceleratorTotalMemoryMibs;
    	      this.acceleratorTypes = defaults.acceleratorTypes;
    	      this.allowedInstanceTypes = defaults.allowedInstanceTypes;
    	      this.bareMetal = defaults.bareMetal;
    	      this.baselineEbsBandwidthMbps = defaults.baselineEbsBandwidthMbps;
    	      this.burstablePerformance = defaults.burstablePerformance;
    	      this.cpuManufacturers = defaults.cpuManufacturers;
    	      this.excludedInstanceTypes = defaults.excludedInstanceTypes;
    	      this.instanceGenerations = defaults.instanceGenerations;
    	      this.localStorage = defaults.localStorage;
    	      this.localStorageTypes = defaults.localStorageTypes;
    	      this.memoryGibPerVcpus = defaults.memoryGibPerVcpus;
    	      this.memoryMibs = defaults.memoryMibs;
    	      this.networkBandwidthGbps = defaults.networkBandwidthGbps;
    	      this.networkInterfaceCounts = defaults.networkInterfaceCounts;
    	      this.onDemandMaxPricePercentageOverLowestPrice = defaults.onDemandMaxPricePercentageOverLowestPrice;
    	      this.requireHibernateSupport = defaults.requireHibernateSupport;
    	      this.spotMaxPricePercentageOverLowestPrice = defaults.spotMaxPricePercentageOverLowestPrice;
    	      this.totalLocalStorageGbs = defaults.totalLocalStorageGbs;
    	      this.vcpuCounts = defaults.vcpuCounts;
        }

        @CustomType.Setter
        public Builder acceleratorCounts(List<GetLaunchTemplateInstanceRequirementAcceleratorCount> acceleratorCounts) {
            if (acceleratorCounts == null) {
              throw new MissingRequiredPropertyException("GetLaunchTemplateInstanceRequirement", "acceleratorCounts");
            }
            this.acceleratorCounts = acceleratorCounts;
            return this;
        }
        public Builder acceleratorCounts(GetLaunchTemplateInstanceRequirementAcceleratorCount... acceleratorCounts) {
            return acceleratorCounts(List.of(acceleratorCounts));
        }
        @CustomType.Setter
        public Builder acceleratorManufacturers(List<String> acceleratorManufacturers) {
            if (acceleratorManufacturers == null) {
              throw new MissingRequiredPropertyException("GetLaunchTemplateInstanceRequirement", "acceleratorManufacturers");
            }
            this.acceleratorManufacturers = acceleratorManufacturers;
            return this;
        }
        public Builder acceleratorManufacturers(String... acceleratorManufacturers) {
            return acceleratorManufacturers(List.of(acceleratorManufacturers));
        }
        @CustomType.Setter
        public Builder acceleratorNames(List<String> acceleratorNames) {
            if (acceleratorNames == null) {
              throw new MissingRequiredPropertyException("GetLaunchTemplateInstanceRequirement", "acceleratorNames");
            }
            this.acceleratorNames = acceleratorNames;
            return this;
        }
        public Builder acceleratorNames(String... acceleratorNames) {
            return acceleratorNames(List.of(acceleratorNames));
        }
        @CustomType.Setter
        public Builder acceleratorTotalMemoryMibs(List<GetLaunchTemplateInstanceRequirementAcceleratorTotalMemoryMib> acceleratorTotalMemoryMibs) {
            if (acceleratorTotalMemoryMibs == null) {
              throw new MissingRequiredPropertyException("GetLaunchTemplateInstanceRequirement", "acceleratorTotalMemoryMibs");
            }
            this.acceleratorTotalMemoryMibs = acceleratorTotalMemoryMibs;
            return this;
        }
        public Builder acceleratorTotalMemoryMibs(GetLaunchTemplateInstanceRequirementAcceleratorTotalMemoryMib... acceleratorTotalMemoryMibs) {
            return acceleratorTotalMemoryMibs(List.of(acceleratorTotalMemoryMibs));
        }
        @CustomType.Setter
        public Builder acceleratorTypes(List<String> acceleratorTypes) {
            if (acceleratorTypes == null) {
              throw new MissingRequiredPropertyException("GetLaunchTemplateInstanceRequirement", "acceleratorTypes");
            }
            this.acceleratorTypes = acceleratorTypes;
            return this;
        }
        public Builder acceleratorTypes(String... acceleratorTypes) {
            return acceleratorTypes(List.of(acceleratorTypes));
        }
        @CustomType.Setter
        public Builder allowedInstanceTypes(List<String> allowedInstanceTypes) {
            if (allowedInstanceTypes == null) {
              throw new MissingRequiredPropertyException("GetLaunchTemplateInstanceRequirement", "allowedInstanceTypes");
            }
            this.allowedInstanceTypes = allowedInstanceTypes;
            return this;
        }
        public Builder allowedInstanceTypes(String... allowedInstanceTypes) {
            return allowedInstanceTypes(List.of(allowedInstanceTypes));
        }
        @CustomType.Setter
        public Builder bareMetal(String bareMetal) {
            if (bareMetal == null) {
              throw new MissingRequiredPropertyException("GetLaunchTemplateInstanceRequirement", "bareMetal");
            }
            this.bareMetal = bareMetal;
            return this;
        }
        @CustomType.Setter
        public Builder baselineEbsBandwidthMbps(List<GetLaunchTemplateInstanceRequirementBaselineEbsBandwidthMbp> baselineEbsBandwidthMbps) {
            if (baselineEbsBandwidthMbps == null) {
              throw new MissingRequiredPropertyException("GetLaunchTemplateInstanceRequirement", "baselineEbsBandwidthMbps");
            }
            this.baselineEbsBandwidthMbps = baselineEbsBandwidthMbps;
            return this;
        }
        public Builder baselineEbsBandwidthMbps(GetLaunchTemplateInstanceRequirementBaselineEbsBandwidthMbp... baselineEbsBandwidthMbps) {
            return baselineEbsBandwidthMbps(List.of(baselineEbsBandwidthMbps));
        }
        @CustomType.Setter
        public Builder burstablePerformance(String burstablePerformance) {
            if (burstablePerformance == null) {
              throw new MissingRequiredPropertyException("GetLaunchTemplateInstanceRequirement", "burstablePerformance");
            }
            this.burstablePerformance = burstablePerformance;
            return this;
        }
        @CustomType.Setter
        public Builder cpuManufacturers(List<String> cpuManufacturers) {
            if (cpuManufacturers == null) {
              throw new MissingRequiredPropertyException("GetLaunchTemplateInstanceRequirement", "cpuManufacturers");
            }
            this.cpuManufacturers = cpuManufacturers;
            return this;
        }
        public Builder cpuManufacturers(String... cpuManufacturers) {
            return cpuManufacturers(List.of(cpuManufacturers));
        }
        @CustomType.Setter
        public Builder excludedInstanceTypes(List<String> excludedInstanceTypes) {
            if (excludedInstanceTypes == null) {
              throw new MissingRequiredPropertyException("GetLaunchTemplateInstanceRequirement", "excludedInstanceTypes");
            }
            this.excludedInstanceTypes = excludedInstanceTypes;
            return this;
        }
        public Builder excludedInstanceTypes(String... excludedInstanceTypes) {
            return excludedInstanceTypes(List.of(excludedInstanceTypes));
        }
        @CustomType.Setter
        public Builder instanceGenerations(List<String> instanceGenerations) {
            if (instanceGenerations == null) {
              throw new MissingRequiredPropertyException("GetLaunchTemplateInstanceRequirement", "instanceGenerations");
            }
            this.instanceGenerations = instanceGenerations;
            return this;
        }
        public Builder instanceGenerations(String... instanceGenerations) {
            return instanceGenerations(List.of(instanceGenerations));
        }
        @CustomType.Setter
        public Builder localStorage(String localStorage) {
            if (localStorage == null) {
              throw new MissingRequiredPropertyException("GetLaunchTemplateInstanceRequirement", "localStorage");
            }
            this.localStorage = localStorage;
            return this;
        }
        @CustomType.Setter
        public Builder localStorageTypes(List<String> localStorageTypes) {
            if (localStorageTypes == null) {
              throw new MissingRequiredPropertyException("GetLaunchTemplateInstanceRequirement", "localStorageTypes");
            }
            this.localStorageTypes = localStorageTypes;
            return this;
        }
        public Builder localStorageTypes(String... localStorageTypes) {
            return localStorageTypes(List.of(localStorageTypes));
        }
        @CustomType.Setter
        public Builder memoryGibPerVcpus(List<GetLaunchTemplateInstanceRequirementMemoryGibPerVcpus> memoryGibPerVcpus) {
            if (memoryGibPerVcpus == null) {
              throw new MissingRequiredPropertyException("GetLaunchTemplateInstanceRequirement", "memoryGibPerVcpus");
            }
            this.memoryGibPerVcpus = memoryGibPerVcpus;
            return this;
        }
        public Builder memoryGibPerVcpus(GetLaunchTemplateInstanceRequirementMemoryGibPerVcpus... memoryGibPerVcpus) {
            return memoryGibPerVcpus(List.of(memoryGibPerVcpus));
        }
        @CustomType.Setter
        public Builder memoryMibs(List<GetLaunchTemplateInstanceRequirementMemoryMib> memoryMibs) {
            if (memoryMibs == null) {
              throw new MissingRequiredPropertyException("GetLaunchTemplateInstanceRequirement", "memoryMibs");
            }
            this.memoryMibs = memoryMibs;
            return this;
        }
        public Builder memoryMibs(GetLaunchTemplateInstanceRequirementMemoryMib... memoryMibs) {
            return memoryMibs(List.of(memoryMibs));
        }
        @CustomType.Setter
        public Builder networkBandwidthGbps(List<GetLaunchTemplateInstanceRequirementNetworkBandwidthGbp> networkBandwidthGbps) {
            if (networkBandwidthGbps == null) {
              throw new MissingRequiredPropertyException("GetLaunchTemplateInstanceRequirement", "networkBandwidthGbps");
            }
            this.networkBandwidthGbps = networkBandwidthGbps;
            return this;
        }
        public Builder networkBandwidthGbps(GetLaunchTemplateInstanceRequirementNetworkBandwidthGbp... networkBandwidthGbps) {
            return networkBandwidthGbps(List.of(networkBandwidthGbps));
        }
        @CustomType.Setter
        public Builder networkInterfaceCounts(List<GetLaunchTemplateInstanceRequirementNetworkInterfaceCount> networkInterfaceCounts) {
            if (networkInterfaceCounts == null) {
              throw new MissingRequiredPropertyException("GetLaunchTemplateInstanceRequirement", "networkInterfaceCounts");
            }
            this.networkInterfaceCounts = networkInterfaceCounts;
            return this;
        }
        public Builder networkInterfaceCounts(GetLaunchTemplateInstanceRequirementNetworkInterfaceCount... networkInterfaceCounts) {
            return networkInterfaceCounts(List.of(networkInterfaceCounts));
        }
        @CustomType.Setter
        public Builder onDemandMaxPricePercentageOverLowestPrice(Integer onDemandMaxPricePercentageOverLowestPrice) {
            if (onDemandMaxPricePercentageOverLowestPrice == null) {
              throw new MissingRequiredPropertyException("GetLaunchTemplateInstanceRequirement", "onDemandMaxPricePercentageOverLowestPrice");
            }
            this.onDemandMaxPricePercentageOverLowestPrice = onDemandMaxPricePercentageOverLowestPrice;
            return this;
        }
        @CustomType.Setter
        public Builder requireHibernateSupport(Boolean requireHibernateSupport) {
            if (requireHibernateSupport == null) {
              throw new MissingRequiredPropertyException("GetLaunchTemplateInstanceRequirement", "requireHibernateSupport");
            }
            this.requireHibernateSupport = requireHibernateSupport;
            return this;
        }
        @CustomType.Setter
        public Builder spotMaxPricePercentageOverLowestPrice(Integer spotMaxPricePercentageOverLowestPrice) {
            if (spotMaxPricePercentageOverLowestPrice == null) {
              throw new MissingRequiredPropertyException("GetLaunchTemplateInstanceRequirement", "spotMaxPricePercentageOverLowestPrice");
            }
            this.spotMaxPricePercentageOverLowestPrice = spotMaxPricePercentageOverLowestPrice;
            return this;
        }
        @CustomType.Setter
        public Builder totalLocalStorageGbs(List<GetLaunchTemplateInstanceRequirementTotalLocalStorageGb> totalLocalStorageGbs) {
            if (totalLocalStorageGbs == null) {
              throw new MissingRequiredPropertyException("GetLaunchTemplateInstanceRequirement", "totalLocalStorageGbs");
            }
            this.totalLocalStorageGbs = totalLocalStorageGbs;
            return this;
        }
        public Builder totalLocalStorageGbs(GetLaunchTemplateInstanceRequirementTotalLocalStorageGb... totalLocalStorageGbs) {
            return totalLocalStorageGbs(List.of(totalLocalStorageGbs));
        }
        @CustomType.Setter
        public Builder vcpuCounts(List<GetLaunchTemplateInstanceRequirementVcpuCount> vcpuCounts) {
            if (vcpuCounts == null) {
              throw new MissingRequiredPropertyException("GetLaunchTemplateInstanceRequirement", "vcpuCounts");
            }
            this.vcpuCounts = vcpuCounts;
            return this;
        }
        public Builder vcpuCounts(GetLaunchTemplateInstanceRequirementVcpuCount... vcpuCounts) {
            return vcpuCounts(List.of(vcpuCounts));
        }
        public GetLaunchTemplateInstanceRequirement build() {
            final var _resultValue = new GetLaunchTemplateInstanceRequirement();
            _resultValue.acceleratorCounts = acceleratorCounts;
            _resultValue.acceleratorManufacturers = acceleratorManufacturers;
            _resultValue.acceleratorNames = acceleratorNames;
            _resultValue.acceleratorTotalMemoryMibs = acceleratorTotalMemoryMibs;
            _resultValue.acceleratorTypes = acceleratorTypes;
            _resultValue.allowedInstanceTypes = allowedInstanceTypes;
            _resultValue.bareMetal = bareMetal;
            _resultValue.baselineEbsBandwidthMbps = baselineEbsBandwidthMbps;
            _resultValue.burstablePerformance = burstablePerformance;
            _resultValue.cpuManufacturers = cpuManufacturers;
            _resultValue.excludedInstanceTypes = excludedInstanceTypes;
            _resultValue.instanceGenerations = instanceGenerations;
            _resultValue.localStorage = localStorage;
            _resultValue.localStorageTypes = localStorageTypes;
            _resultValue.memoryGibPerVcpus = memoryGibPerVcpus;
            _resultValue.memoryMibs = memoryMibs;
            _resultValue.networkBandwidthGbps = networkBandwidthGbps;
            _resultValue.networkInterfaceCounts = networkInterfaceCounts;
            _resultValue.onDemandMaxPricePercentageOverLowestPrice = onDemandMaxPricePercentageOverLowestPrice;
            _resultValue.requireHibernateSupport = requireHibernateSupport;
            _resultValue.spotMaxPricePercentageOverLowestPrice = spotMaxPricePercentageOverLowestPrice;
            _resultValue.totalLocalStorageGbs = totalLocalStorageGbs;
            _resultValue.vcpuCounts = vcpuCounts;
            return _resultValue;
        }
    }
}
