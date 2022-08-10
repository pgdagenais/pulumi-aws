// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kendra.outputs;

import com.pulumi.aws.kendra.outputs.GetExperienceConfigurationContentSourceConfiguration;
import com.pulumi.aws.kendra.outputs.GetExperienceConfigurationUserIdentityConfiguration;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetExperienceConfiguration {
    /**
     * @return The identifiers of your data sources and FAQs. This is the content you want to use for your Amazon Kendra Experience. Documented below.
     * 
     */
    private final List<GetExperienceConfigurationContentSourceConfiguration> contentSourceConfigurations;
    /**
     * @return The AWS SSO field name that contains the identifiers of your users, such as their emails. Documented below.
     * 
     */
    private final List<GetExperienceConfigurationUserIdentityConfiguration> userIdentityConfigurations;

    @CustomType.Constructor
    private GetExperienceConfiguration(
        @CustomType.Parameter("contentSourceConfigurations") List<GetExperienceConfigurationContentSourceConfiguration> contentSourceConfigurations,
        @CustomType.Parameter("userIdentityConfigurations") List<GetExperienceConfigurationUserIdentityConfiguration> userIdentityConfigurations) {
        this.contentSourceConfigurations = contentSourceConfigurations;
        this.userIdentityConfigurations = userIdentityConfigurations;
    }

    /**
     * @return The identifiers of your data sources and FAQs. This is the content you want to use for your Amazon Kendra Experience. Documented below.
     * 
     */
    public List<GetExperienceConfigurationContentSourceConfiguration> contentSourceConfigurations() {
        return this.contentSourceConfigurations;
    }
    /**
     * @return The AWS SSO field name that contains the identifiers of your users, such as their emails. Documented below.
     * 
     */
    public List<GetExperienceConfigurationUserIdentityConfiguration> userIdentityConfigurations() {
        return this.userIdentityConfigurations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetExperienceConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetExperienceConfigurationContentSourceConfiguration> contentSourceConfigurations;
        private List<GetExperienceConfigurationUserIdentityConfiguration> userIdentityConfigurations;

        public Builder() {
    	      // Empty
        }

        public Builder(GetExperienceConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentSourceConfigurations = defaults.contentSourceConfigurations;
    	      this.userIdentityConfigurations = defaults.userIdentityConfigurations;
        }

        public Builder contentSourceConfigurations(List<GetExperienceConfigurationContentSourceConfiguration> contentSourceConfigurations) {
            this.contentSourceConfigurations = Objects.requireNonNull(contentSourceConfigurations);
            return this;
        }
        public Builder contentSourceConfigurations(GetExperienceConfigurationContentSourceConfiguration... contentSourceConfigurations) {
            return contentSourceConfigurations(List.of(contentSourceConfigurations));
        }
        public Builder userIdentityConfigurations(List<GetExperienceConfigurationUserIdentityConfiguration> userIdentityConfigurations) {
            this.userIdentityConfigurations = Objects.requireNonNull(userIdentityConfigurations);
            return this;
        }
        public Builder userIdentityConfigurations(GetExperienceConfigurationUserIdentityConfiguration... userIdentityConfigurations) {
            return userIdentityConfigurations(List.of(userIdentityConfigurations));
        }        public GetExperienceConfiguration build() {
            return new GetExperienceConfiguration(contentSourceConfigurations, userIdentityConfigurations);
        }
    }
}