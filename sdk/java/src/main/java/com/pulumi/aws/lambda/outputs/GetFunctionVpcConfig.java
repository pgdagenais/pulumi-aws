// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lambda.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetFunctionVpcConfig {
    private Boolean ipv6AllowedForDualStack;
    private List<String> securityGroupIds;
    private List<String> subnetIds;
    private String vpcId;

    private GetFunctionVpcConfig() {}
    public Boolean ipv6AllowedForDualStack() {
        return this.ipv6AllowedForDualStack;
    }
    public List<String> securityGroupIds() {
        return this.securityGroupIds;
    }
    public List<String> subnetIds() {
        return this.subnetIds;
    }
    public String vpcId() {
        return this.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFunctionVpcConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean ipv6AllowedForDualStack;
        private List<String> securityGroupIds;
        private List<String> subnetIds;
        private String vpcId;
        public Builder() {}
        public Builder(GetFunctionVpcConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipv6AllowedForDualStack = defaults.ipv6AllowedForDualStack;
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.subnetIds = defaults.subnetIds;
    	      this.vpcId = defaults.vpcId;
        }

        @CustomType.Setter
        public Builder ipv6AllowedForDualStack(Boolean ipv6AllowedForDualStack) {
            if (ipv6AllowedForDualStack == null) {
              throw new MissingRequiredPropertyException("GetFunctionVpcConfig", "ipv6AllowedForDualStack");
            }
            this.ipv6AllowedForDualStack = ipv6AllowedForDualStack;
            return this;
        }
        @CustomType.Setter
        public Builder securityGroupIds(List<String> securityGroupIds) {
            if (securityGroupIds == null) {
              throw new MissingRequiredPropertyException("GetFunctionVpcConfig", "securityGroupIds");
            }
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public Builder securityGroupIds(String... securityGroupIds) {
            return securityGroupIds(List.of(securityGroupIds));
        }
        @CustomType.Setter
        public Builder subnetIds(List<String> subnetIds) {
            if (subnetIds == null) {
              throw new MissingRequiredPropertyException("GetFunctionVpcConfig", "subnetIds");
            }
            this.subnetIds = subnetIds;
            return this;
        }
        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
        }
        @CustomType.Setter
        public Builder vpcId(String vpcId) {
            if (vpcId == null) {
              throw new MissingRequiredPropertyException("GetFunctionVpcConfig", "vpcId");
            }
            this.vpcId = vpcId;
            return this;
        }
        public GetFunctionVpcConfig build() {
            final var _resultValue = new GetFunctionVpcConfig();
            _resultValue.ipv6AllowedForDualStack = ipv6AllowedForDualStack;
            _resultValue.securityGroupIds = securityGroupIds;
            _resultValue.subnetIds = subnetIds;
            _resultValue.vpcId = vpcId;
            return _resultValue;
        }
    }
}
