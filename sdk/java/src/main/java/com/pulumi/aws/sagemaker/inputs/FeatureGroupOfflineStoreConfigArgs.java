// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker.inputs;

import com.pulumi.aws.sagemaker.inputs.FeatureGroupOfflineStoreConfigDataCatalogConfigArgs;
import com.pulumi.aws.sagemaker.inputs.FeatureGroupOfflineStoreConfigS3StorageConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FeatureGroupOfflineStoreConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final FeatureGroupOfflineStoreConfigArgs Empty = new FeatureGroupOfflineStoreConfigArgs();

    /**
     * The meta data of the Glue table that is autogenerated when an OfflineStore is created. See Data Catalog Config Below.
     * 
     */
    @Import(name="dataCatalogConfig")
    private @Nullable Output<FeatureGroupOfflineStoreConfigDataCatalogConfigArgs> dataCatalogConfig;

    /**
     * @return The meta data of the Glue table that is autogenerated when an OfflineStore is created. See Data Catalog Config Below.
     * 
     */
    public Optional<Output<FeatureGroupOfflineStoreConfigDataCatalogConfigArgs>> dataCatalogConfig() {
        return Optional.ofNullable(this.dataCatalogConfig);
    }

    /**
     * Set to `true` to turn Online Store On.
     * 
     */
    @Import(name="disableGlueTableCreation")
    private @Nullable Output<Boolean> disableGlueTableCreation;

    /**
     * @return Set to `true` to turn Online Store On.
     * 
     */
    public Optional<Output<Boolean>> disableGlueTableCreation() {
        return Optional.ofNullable(this.disableGlueTableCreation);
    }

    /**
     * The Amazon Simple Storage (Amazon S3) location of OfflineStore. See S3 Storage Config Below.
     * 
     */
    @Import(name="s3StorageConfig", required=true)
    private Output<FeatureGroupOfflineStoreConfigS3StorageConfigArgs> s3StorageConfig;

    /**
     * @return The Amazon Simple Storage (Amazon S3) location of OfflineStore. See S3 Storage Config Below.
     * 
     */
    public Output<FeatureGroupOfflineStoreConfigS3StorageConfigArgs> s3StorageConfig() {
        return this.s3StorageConfig;
    }

    private FeatureGroupOfflineStoreConfigArgs() {}

    private FeatureGroupOfflineStoreConfigArgs(FeatureGroupOfflineStoreConfigArgs $) {
        this.dataCatalogConfig = $.dataCatalogConfig;
        this.disableGlueTableCreation = $.disableGlueTableCreation;
        this.s3StorageConfig = $.s3StorageConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FeatureGroupOfflineStoreConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FeatureGroupOfflineStoreConfigArgs $;

        public Builder() {
            $ = new FeatureGroupOfflineStoreConfigArgs();
        }

        public Builder(FeatureGroupOfflineStoreConfigArgs defaults) {
            $ = new FeatureGroupOfflineStoreConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dataCatalogConfig The meta data of the Glue table that is autogenerated when an OfflineStore is created. See Data Catalog Config Below.
         * 
         * @return builder
         * 
         */
        public Builder dataCatalogConfig(@Nullable Output<FeatureGroupOfflineStoreConfigDataCatalogConfigArgs> dataCatalogConfig) {
            $.dataCatalogConfig = dataCatalogConfig;
            return this;
        }

        /**
         * @param dataCatalogConfig The meta data of the Glue table that is autogenerated when an OfflineStore is created. See Data Catalog Config Below.
         * 
         * @return builder
         * 
         */
        public Builder dataCatalogConfig(FeatureGroupOfflineStoreConfigDataCatalogConfigArgs dataCatalogConfig) {
            return dataCatalogConfig(Output.of(dataCatalogConfig));
        }

        /**
         * @param disableGlueTableCreation Set to `true` to turn Online Store On.
         * 
         * @return builder
         * 
         */
        public Builder disableGlueTableCreation(@Nullable Output<Boolean> disableGlueTableCreation) {
            $.disableGlueTableCreation = disableGlueTableCreation;
            return this;
        }

        /**
         * @param disableGlueTableCreation Set to `true` to turn Online Store On.
         * 
         * @return builder
         * 
         */
        public Builder disableGlueTableCreation(Boolean disableGlueTableCreation) {
            return disableGlueTableCreation(Output.of(disableGlueTableCreation));
        }

        /**
         * @param s3StorageConfig The Amazon Simple Storage (Amazon S3) location of OfflineStore. See S3 Storage Config Below.
         * 
         * @return builder
         * 
         */
        public Builder s3StorageConfig(Output<FeatureGroupOfflineStoreConfigS3StorageConfigArgs> s3StorageConfig) {
            $.s3StorageConfig = s3StorageConfig;
            return this;
        }

        /**
         * @param s3StorageConfig The Amazon Simple Storage (Amazon S3) location of OfflineStore. See S3 Storage Config Below.
         * 
         * @return builder
         * 
         */
        public Builder s3StorageConfig(FeatureGroupOfflineStoreConfigS3StorageConfigArgs s3StorageConfig) {
            return s3StorageConfig(Output.of(s3StorageConfig));
        }

        public FeatureGroupOfflineStoreConfigArgs build() {
            $.s3StorageConfig = Objects.requireNonNull($.s3StorageConfig, "expected parameter 's3StorageConfig' to be non-null");
            return $;
        }
    }

}