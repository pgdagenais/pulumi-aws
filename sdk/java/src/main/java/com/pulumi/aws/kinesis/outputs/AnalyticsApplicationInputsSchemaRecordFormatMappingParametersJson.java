// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesis.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AnalyticsApplicationInputsSchemaRecordFormatMappingParametersJson {
    /**
     * @return Path to the top-level parent that contains the records.
     * 
     */
    private final String recordRowPath;

    @CustomType.Constructor
    private AnalyticsApplicationInputsSchemaRecordFormatMappingParametersJson(@CustomType.Parameter("recordRowPath") String recordRowPath) {
        this.recordRowPath = recordRowPath;
    }

    /**
     * @return Path to the top-level parent that contains the records.
     * 
     */
    public String recordRowPath() {
        return this.recordRowPath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalyticsApplicationInputsSchemaRecordFormatMappingParametersJson defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String recordRowPath;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalyticsApplicationInputsSchemaRecordFormatMappingParametersJson defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.recordRowPath = defaults.recordRowPath;
        }

        public Builder recordRowPath(String recordRowPath) {
            this.recordRowPath = Objects.requireNonNull(recordRowPath);
            return this;
        }        public AnalyticsApplicationInputsSchemaRecordFormatMappingParametersJson build() {
            return new AnalyticsApplicationInputsSchemaRecordFormatMappingParametersJson(recordRowPath);
        }
    }
}