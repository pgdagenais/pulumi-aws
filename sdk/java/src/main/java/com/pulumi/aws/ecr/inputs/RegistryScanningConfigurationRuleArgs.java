// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ecr.inputs;

import com.pulumi.aws.ecr.inputs.RegistryScanningConfigurationRuleRepositoryFilterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class RegistryScanningConfigurationRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegistryScanningConfigurationRuleArgs Empty = new RegistryScanningConfigurationRuleArgs();

    /**
     * One or more repository filter blocks, containing a `filter` (required string filtering repositories, see pattern regex [here](https://docs.aws.amazon.com/AmazonECR/latest/APIReference/API_ScanningRepositoryFilter.html)) and a `filter_type` (required string, currently only `WILDCARD` is supported).
     * 
     */
    @Import(name="repositoryFilters", required=true)
    private Output<List<RegistryScanningConfigurationRuleRepositoryFilterArgs>> repositoryFilters;

    /**
     * @return One or more repository filter blocks, containing a `filter` (required string filtering repositories, see pattern regex [here](https://docs.aws.amazon.com/AmazonECR/latest/APIReference/API_ScanningRepositoryFilter.html)) and a `filter_type` (required string, currently only `WILDCARD` is supported).
     * 
     */
    public Output<List<RegistryScanningConfigurationRuleRepositoryFilterArgs>> repositoryFilters() {
        return this.repositoryFilters;
    }

    /**
     * The frequency that scans are performed at for a private registry. Can be `SCAN_ON_PUSH`, `CONTINUOUS_SCAN`, or `MANUAL`.
     * 
     */
    @Import(name="scanFrequency", required=true)
    private Output<String> scanFrequency;

    /**
     * @return The frequency that scans are performed at for a private registry. Can be `SCAN_ON_PUSH`, `CONTINUOUS_SCAN`, or `MANUAL`.
     * 
     */
    public Output<String> scanFrequency() {
        return this.scanFrequency;
    }

    private RegistryScanningConfigurationRuleArgs() {}

    private RegistryScanningConfigurationRuleArgs(RegistryScanningConfigurationRuleArgs $) {
        this.repositoryFilters = $.repositoryFilters;
        this.scanFrequency = $.scanFrequency;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegistryScanningConfigurationRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegistryScanningConfigurationRuleArgs $;

        public Builder() {
            $ = new RegistryScanningConfigurationRuleArgs();
        }

        public Builder(RegistryScanningConfigurationRuleArgs defaults) {
            $ = new RegistryScanningConfigurationRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param repositoryFilters One or more repository filter blocks, containing a `filter` (required string filtering repositories, see pattern regex [here](https://docs.aws.amazon.com/AmazonECR/latest/APIReference/API_ScanningRepositoryFilter.html)) and a `filter_type` (required string, currently only `WILDCARD` is supported).
         * 
         * @return builder
         * 
         */
        public Builder repositoryFilters(Output<List<RegistryScanningConfigurationRuleRepositoryFilterArgs>> repositoryFilters) {
            $.repositoryFilters = repositoryFilters;
            return this;
        }

        /**
         * @param repositoryFilters One or more repository filter blocks, containing a `filter` (required string filtering repositories, see pattern regex [here](https://docs.aws.amazon.com/AmazonECR/latest/APIReference/API_ScanningRepositoryFilter.html)) and a `filter_type` (required string, currently only `WILDCARD` is supported).
         * 
         * @return builder
         * 
         */
        public Builder repositoryFilters(List<RegistryScanningConfigurationRuleRepositoryFilterArgs> repositoryFilters) {
            return repositoryFilters(Output.of(repositoryFilters));
        }

        /**
         * @param repositoryFilters One or more repository filter blocks, containing a `filter` (required string filtering repositories, see pattern regex [here](https://docs.aws.amazon.com/AmazonECR/latest/APIReference/API_ScanningRepositoryFilter.html)) and a `filter_type` (required string, currently only `WILDCARD` is supported).
         * 
         * @return builder
         * 
         */
        public Builder repositoryFilters(RegistryScanningConfigurationRuleRepositoryFilterArgs... repositoryFilters) {
            return repositoryFilters(List.of(repositoryFilters));
        }

        /**
         * @param scanFrequency The frequency that scans are performed at for a private registry. Can be `SCAN_ON_PUSH`, `CONTINUOUS_SCAN`, or `MANUAL`.
         * 
         * @return builder
         * 
         */
        public Builder scanFrequency(Output<String> scanFrequency) {
            $.scanFrequency = scanFrequency;
            return this;
        }

        /**
         * @param scanFrequency The frequency that scans are performed at for a private registry. Can be `SCAN_ON_PUSH`, `CONTINUOUS_SCAN`, or `MANUAL`.
         * 
         * @return builder
         * 
         */
        public Builder scanFrequency(String scanFrequency) {
            return scanFrequency(Output.of(scanFrequency));
        }

        public RegistryScanningConfigurationRuleArgs build() {
            $.repositoryFilters = Objects.requireNonNull($.repositoryFilters, "expected parameter 'repositoryFilters' to be non-null");
            $.scanFrequency = Objects.requireNonNull($.scanFrequency, "expected parameter 'scanFrequency' to be non-null");
            return $;
        }
    }

}