// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.aws.ec2.outputs.GetNetworkInsightsAnalysisForwardPathComponentSecurityGroupRulePortRange;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetNetworkInsightsAnalysisForwardPathComponentSecurityGroupRule {
    private String cidr;
    private String direction;
    private List<GetNetworkInsightsAnalysisForwardPathComponentSecurityGroupRulePortRange> portRanges;
    private String prefixListId;
    private String protocol;
    private String securityGroupId;

    private GetNetworkInsightsAnalysisForwardPathComponentSecurityGroupRule() {}
    public String cidr() {
        return this.cidr;
    }
    public String direction() {
        return this.direction;
    }
    public List<GetNetworkInsightsAnalysisForwardPathComponentSecurityGroupRulePortRange> portRanges() {
        return this.portRanges;
    }
    public String prefixListId() {
        return this.prefixListId;
    }
    public String protocol() {
        return this.protocol;
    }
    public String securityGroupId() {
        return this.securityGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkInsightsAnalysisForwardPathComponentSecurityGroupRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String cidr;
        private String direction;
        private List<GetNetworkInsightsAnalysisForwardPathComponentSecurityGroupRulePortRange> portRanges;
        private String prefixListId;
        private String protocol;
        private String securityGroupId;
        public Builder() {}
        public Builder(GetNetworkInsightsAnalysisForwardPathComponentSecurityGroupRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidr = defaults.cidr;
    	      this.direction = defaults.direction;
    	      this.portRanges = defaults.portRanges;
    	      this.prefixListId = defaults.prefixListId;
    	      this.protocol = defaults.protocol;
    	      this.securityGroupId = defaults.securityGroupId;
        }

        @CustomType.Setter
        public Builder cidr(String cidr) {
            if (cidr == null) {
              throw new MissingRequiredPropertyException("GetNetworkInsightsAnalysisForwardPathComponentSecurityGroupRule", "cidr");
            }
            this.cidr = cidr;
            return this;
        }
        @CustomType.Setter
        public Builder direction(String direction) {
            if (direction == null) {
              throw new MissingRequiredPropertyException("GetNetworkInsightsAnalysisForwardPathComponentSecurityGroupRule", "direction");
            }
            this.direction = direction;
            return this;
        }
        @CustomType.Setter
        public Builder portRanges(List<GetNetworkInsightsAnalysisForwardPathComponentSecurityGroupRulePortRange> portRanges) {
            if (portRanges == null) {
              throw new MissingRequiredPropertyException("GetNetworkInsightsAnalysisForwardPathComponentSecurityGroupRule", "portRanges");
            }
            this.portRanges = portRanges;
            return this;
        }
        public Builder portRanges(GetNetworkInsightsAnalysisForwardPathComponentSecurityGroupRulePortRange... portRanges) {
            return portRanges(List.of(portRanges));
        }
        @CustomType.Setter
        public Builder prefixListId(String prefixListId) {
            if (prefixListId == null) {
              throw new MissingRequiredPropertyException("GetNetworkInsightsAnalysisForwardPathComponentSecurityGroupRule", "prefixListId");
            }
            this.prefixListId = prefixListId;
            return this;
        }
        @CustomType.Setter
        public Builder protocol(String protocol) {
            if (protocol == null) {
              throw new MissingRequiredPropertyException("GetNetworkInsightsAnalysisForwardPathComponentSecurityGroupRule", "protocol");
            }
            this.protocol = protocol;
            return this;
        }
        @CustomType.Setter
        public Builder securityGroupId(String securityGroupId) {
            if (securityGroupId == null) {
              throw new MissingRequiredPropertyException("GetNetworkInsightsAnalysisForwardPathComponentSecurityGroupRule", "securityGroupId");
            }
            this.securityGroupId = securityGroupId;
            return this;
        }
        public GetNetworkInsightsAnalysisForwardPathComponentSecurityGroupRule build() {
            final var _resultValue = new GetNetworkInsightsAnalysisForwardPathComponentSecurityGroupRule();
            _resultValue.cidr = cidr;
            _resultValue.direction = direction;
            _resultValue.portRanges = portRanges;
            _resultValue.prefixListId = prefixListId;
            _resultValue.protocol = protocol;
            _resultValue.securityGroupId = securityGroupId;
            return _resultValue;
        }
    }
}
