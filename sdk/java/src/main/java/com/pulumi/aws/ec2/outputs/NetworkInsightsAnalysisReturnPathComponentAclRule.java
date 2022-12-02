// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.aws.ec2.outputs.NetworkInsightsAnalysisReturnPathComponentAclRulePortRange;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NetworkInsightsAnalysisReturnPathComponentAclRule {
    private @Nullable String cidr;
    private @Nullable Boolean egress;
    private @Nullable List<NetworkInsightsAnalysisReturnPathComponentAclRulePortRange> portRanges;
    private @Nullable String protocol;
    private @Nullable String ruleAction;
    private @Nullable Integer ruleNumber;

    private NetworkInsightsAnalysisReturnPathComponentAclRule() {}
    public Optional<String> cidr() {
        return Optional.ofNullable(this.cidr);
    }
    public Optional<Boolean> egress() {
        return Optional.ofNullable(this.egress);
    }
    public List<NetworkInsightsAnalysisReturnPathComponentAclRulePortRange> portRanges() {
        return this.portRanges == null ? List.of() : this.portRanges;
    }
    public Optional<String> protocol() {
        return Optional.ofNullable(this.protocol);
    }
    public Optional<String> ruleAction() {
        return Optional.ofNullable(this.ruleAction);
    }
    public Optional<Integer> ruleNumber() {
        return Optional.ofNullable(this.ruleNumber);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInsightsAnalysisReturnPathComponentAclRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String cidr;
        private @Nullable Boolean egress;
        private @Nullable List<NetworkInsightsAnalysisReturnPathComponentAclRulePortRange> portRanges;
        private @Nullable String protocol;
        private @Nullable String ruleAction;
        private @Nullable Integer ruleNumber;
        public Builder() {}
        public Builder(NetworkInsightsAnalysisReturnPathComponentAclRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidr = defaults.cidr;
    	      this.egress = defaults.egress;
    	      this.portRanges = defaults.portRanges;
    	      this.protocol = defaults.protocol;
    	      this.ruleAction = defaults.ruleAction;
    	      this.ruleNumber = defaults.ruleNumber;
        }

        @CustomType.Setter
        public Builder cidr(@Nullable String cidr) {
            this.cidr = cidr;
            return this;
        }
        @CustomType.Setter
        public Builder egress(@Nullable Boolean egress) {
            this.egress = egress;
            return this;
        }
        @CustomType.Setter
        public Builder portRanges(@Nullable List<NetworkInsightsAnalysisReturnPathComponentAclRulePortRange> portRanges) {
            this.portRanges = portRanges;
            return this;
        }
        public Builder portRanges(NetworkInsightsAnalysisReturnPathComponentAclRulePortRange... portRanges) {
            return portRanges(List.of(portRanges));
        }
        @CustomType.Setter
        public Builder protocol(@Nullable String protocol) {
            this.protocol = protocol;
            return this;
        }
        @CustomType.Setter
        public Builder ruleAction(@Nullable String ruleAction) {
            this.ruleAction = ruleAction;
            return this;
        }
        @CustomType.Setter
        public Builder ruleNumber(@Nullable Integer ruleNumber) {
            this.ruleNumber = ruleNumber;
            return this;
        }
        public NetworkInsightsAnalysisReturnPathComponentAclRule build() {
            final var o = new NetworkInsightsAnalysisReturnPathComponentAclRule();
            o.cidr = cidr;
            o.egress = egress;
            o.portRanges = portRanges;
            o.protocol = protocol;
            o.ruleAction = ruleAction;
            o.ruleNumber = ruleNumber;
            return o;
        }
    }
}