// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../../types/input";
import * as outputs from "../../types/output";
import * as enums from "../../types/enums";
import * as utilities from "../../utilities";

import {RoutingRule} from "@/s3";

export interface TableMagneticStoreWriteProperties {
    /**
     * A flag to enable magnetic store writes.
     */
    enableMagneticStoreWrites?: pulumi.Input<boolean>;
    /**
     * The location to write error reports for records rejected asynchronously during magnetic store writes. See Magnetic Store Rejected Data Location below for more details.
     */
    magneticStoreRejectedDataLocation?: pulumi.Input<inputs.timestreamwrite.TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocation>;
}

export interface TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocation {
    /**
     * Configuration of an S3 location to write error reports for records rejected, asynchronously, during magnetic store writes. See S3 Configuration below for more details.
     */
    s3Configuration?: pulumi.Input<inputs.timestreamwrite.TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationS3Configuration>;
}

export interface TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationS3Configuration {
    /**
     * Bucket name of the customer S3 bucket.
     */
    bucketName?: pulumi.Input<string>;
    /**
     * Encryption option for the customer s3 location. Options are S3 server side encryption with an S3-managed key or KMS managed key. Valid values are `SSE_KMS` and `SSE_S3`.
     */
    encryptionOption?: pulumi.Input<string>;
    /**
     * KMS key arn for the customer s3 location when encrypting with a KMS managed key.
     */
    kmsKeyId?: pulumi.Input<string>;
    /**
     * Object key prefix for the customer S3 location.
     */
    objectKeyPrefix?: pulumi.Input<string>;
}

export interface TableRetentionProperties {
    /**
     * The duration for which data must be stored in the magnetic store. Minimum value of 1. Maximum value of 73000.
     */
    magneticStoreRetentionPeriodInDays: pulumi.Input<number>;
    /**
     * The duration for which data must be stored in the memory store. Minimum value of 1. Maximum value of 8766.
     */
    memoryStoreRetentionPeriodInHours: pulumi.Input<number>;
}