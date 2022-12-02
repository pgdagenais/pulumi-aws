// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kendra.outputs;

import com.pulumi.aws.kendra.outputs.DataSourceConfigurationS3Configuration;
import com.pulumi.aws.kendra.outputs.DataSourceConfigurationWebCrawlerConfiguration;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DataSourceConfiguration {
    /**
     * @return A block that provides the configuration information to connect to an Amazon S3 bucket as your data source. Detailed below.
     * 
     */
    private @Nullable DataSourceConfigurationS3Configuration s3Configuration;
    /**
     * @return A block that provides the configuration information required for Amazon Kendra Web Crawler. Detailed below.
     * 
     */
    private @Nullable DataSourceConfigurationWebCrawlerConfiguration webCrawlerConfiguration;

    private DataSourceConfiguration() {}
    /**
     * @return A block that provides the configuration information to connect to an Amazon S3 bucket as your data source. Detailed below.
     * 
     */
    public Optional<DataSourceConfigurationS3Configuration> s3Configuration() {
        return Optional.ofNullable(this.s3Configuration);
    }
    /**
     * @return A block that provides the configuration information required for Amazon Kendra Web Crawler. Detailed below.
     * 
     */
    public Optional<DataSourceConfigurationWebCrawlerConfiguration> webCrawlerConfiguration() {
        return Optional.ofNullable(this.webCrawlerConfiguration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable DataSourceConfigurationS3Configuration s3Configuration;
        private @Nullable DataSourceConfigurationWebCrawlerConfiguration webCrawlerConfiguration;
        public Builder() {}
        public Builder(DataSourceConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3Configuration = defaults.s3Configuration;
    	      this.webCrawlerConfiguration = defaults.webCrawlerConfiguration;
        }

        @CustomType.Setter
        public Builder s3Configuration(@Nullable DataSourceConfigurationS3Configuration s3Configuration) {
            this.s3Configuration = s3Configuration;
            return this;
        }
        @CustomType.Setter
        public Builder webCrawlerConfiguration(@Nullable DataSourceConfigurationWebCrawlerConfiguration webCrawlerConfiguration) {
            this.webCrawlerConfiguration = webCrawlerConfiguration;
            return this;
        }
        public DataSourceConfiguration build() {
            final var o = new DataSourceConfiguration();
            o.s3Configuration = s3Configuration;
            o.webCrawlerConfiguration = webCrawlerConfiguration;
            return o;
        }
    }
}