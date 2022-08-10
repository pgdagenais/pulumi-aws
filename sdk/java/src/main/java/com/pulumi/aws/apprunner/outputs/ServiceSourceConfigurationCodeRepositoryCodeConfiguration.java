// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apprunner.outputs;

import com.pulumi.aws.apprunner.outputs.ServiceSourceConfigurationCodeRepositoryCodeConfigurationCodeConfigurationValues;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceSourceConfigurationCodeRepositoryCodeConfiguration {
    /**
     * @return Basic configuration for building and running the App Runner service. Use this parameter to quickly launch an App Runner service without providing an apprunner.yaml file in the source code repository (or ignoring the file if it exists). See Code Configuration Values below for more details.
     * 
     */
    private final @Nullable ServiceSourceConfigurationCodeRepositoryCodeConfigurationCodeConfigurationValues codeConfigurationValues;
    /**
     * @return The source of the App Runner configuration. Valid values: `REPOSITORY`, `API`. Values are interpreted as follows:
     * 
     */
    private final String configurationSource;

    @CustomType.Constructor
    private ServiceSourceConfigurationCodeRepositoryCodeConfiguration(
        @CustomType.Parameter("codeConfigurationValues") @Nullable ServiceSourceConfigurationCodeRepositoryCodeConfigurationCodeConfigurationValues codeConfigurationValues,
        @CustomType.Parameter("configurationSource") String configurationSource) {
        this.codeConfigurationValues = codeConfigurationValues;
        this.configurationSource = configurationSource;
    }

    /**
     * @return Basic configuration for building and running the App Runner service. Use this parameter to quickly launch an App Runner service without providing an apprunner.yaml file in the source code repository (or ignoring the file if it exists). See Code Configuration Values below for more details.
     * 
     */
    public Optional<ServiceSourceConfigurationCodeRepositoryCodeConfigurationCodeConfigurationValues> codeConfigurationValues() {
        return Optional.ofNullable(this.codeConfigurationValues);
    }
    /**
     * @return The source of the App Runner configuration. Valid values: `REPOSITORY`, `API`. Values are interpreted as follows:
     * 
     */
    public String configurationSource() {
        return this.configurationSource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceSourceConfigurationCodeRepositoryCodeConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ServiceSourceConfigurationCodeRepositoryCodeConfigurationCodeConfigurationValues codeConfigurationValues;
        private String configurationSource;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceSourceConfigurationCodeRepositoryCodeConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.codeConfigurationValues = defaults.codeConfigurationValues;
    	      this.configurationSource = defaults.configurationSource;
        }

        public Builder codeConfigurationValues(@Nullable ServiceSourceConfigurationCodeRepositoryCodeConfigurationCodeConfigurationValues codeConfigurationValues) {
            this.codeConfigurationValues = codeConfigurationValues;
            return this;
        }
        public Builder configurationSource(String configurationSource) {
            this.configurationSource = Objects.requireNonNull(configurationSource);
            return this;
        }        public ServiceSourceConfigurationCodeRepositoryCodeConfiguration build() {
            return new ServiceSourceConfigurationCodeRepositoryCodeConfiguration(codeConfigurationValues, configurationSource);
        }
    }
}