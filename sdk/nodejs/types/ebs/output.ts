// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../../types/input";
import * as outputs from "../../types/output";
import * as enums from "../../types/enums";
import * as utilities from "../../utilities";

import {RoutingRule} from "@/s3";

export interface GetEbsVolumesFilter {
    /**
     * Name of the field to filter by, as defined by
     * [the underlying AWS API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeVolumes.html).
     * For example, if matching against the `size` filter, use:
     */
    name: string;
    /**
     * Set of values that are accepted for the given field.
     * EBS Volume IDs will be selected if any one of the given values match.
     */
    values: string[];
}

export interface GetSnapshotFilter {
    name: string;
    values: string[];
}

export interface GetSnapshotIdsFilter {
    name: string;
    values: string[];
}

export interface GetVolumeFilter {
    name: string;
    values: string[];
}

export interface SnapshotImportClientData {
    /**
     * A user-defined comment about the disk upload.
     */
    comment?: string;
    /**
     * The time that the disk upload ends.
     */
    uploadEnd: string;
    /**
     * The size of the uploaded disk image, in GiB.
     */
    uploadSize: number;
    /**
     * The time that the disk upload starts.
     */
    uploadStart: string;
}

export interface SnapshotImportDiskContainer {
    /**
     * The description of the disk image being imported.
     */
    description?: string;
    /**
     * The format of the disk image being imported. One of `VHD` or `VMDK`.
     */
    format: string;
    /**
     * The URL to the Amazon S3-based disk image being imported. It can either be a https URL (https://..) or an Amazon S3 URL (s3://..). One of `url` or `userBucket` must be set.
     */
    url?: string;
    /**
     * The Amazon S3 bucket for the disk image. One of `url` or `userBucket` must be set. Detailed below.
     */
    userBucket?: outputs.ebs.SnapshotImportDiskContainerUserBucket;
}

export interface SnapshotImportDiskContainerUserBucket {
    /**
     * The name of the Amazon S3 bucket where the disk image is located.
     */
    s3Bucket: string;
    /**
     * The file name of the disk image.
     */
    s3Key: string;
}
