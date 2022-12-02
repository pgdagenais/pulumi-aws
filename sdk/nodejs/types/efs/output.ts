// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../../types/input";
import * as outputs from "../../types/output";
import * as enums from "../../types/enums";
import * as utilities from "../../utilities";

import {RoutingRule} from "@/s3";

export interface AccessPointPosixUser {
    /**
     * POSIX group ID used for all file system operations using this access point.
     */
    gid: number;
    /**
     * Secondary POSIX group IDs used for all file system operations using this access point.
     */
    secondaryGids?: number[];
    /**
     * POSIX user ID used for all file system operations using this access point.
     */
    uid: number;
}

export interface AccessPointRootDirectory {
    /**
     * POSIX IDs and permissions to apply to the access point's Root Directory. See Creation Info below.
     */
    creationInfo: outputs.efs.AccessPointRootDirectoryCreationInfo;
    /**
     * Path on the EFS file system to expose as the root directory to NFS clients using the access point to access the EFS file system. A path can have up to four subdirectories. If the specified path does not exist, you are required to provide `creationInfo`.
     */
    path: string;
}

export interface AccessPointRootDirectoryCreationInfo {
    /**
     * POSIX group ID to apply to the `rootDirectory`.
     */
    ownerGid: number;
    /**
     * POSIX user ID to apply to the `rootDirectory`.
     */
    ownerUid: number;
    /**
     * POSIX permissions to apply to the RootDirectory, in the format of an octal number representing the file's mode bits.
     */
    permissions: string;
}

export interface BackupPolicyBackupPolicy {
    /**
     * A status of the backup policy. Valid values: `ENABLED`, `DISABLED`.
     */
    status: string;
}

export interface FileSystemLifecyclePolicy {
    /**
     * Indicates how long it takes to transition files to the IA storage class. Valid values: `AFTER_1_DAY`, `AFTER_7_DAYS`, `AFTER_14_DAYS`, `AFTER_30_DAYS`, `AFTER_60_DAYS`, or `AFTER_90_DAYS`.
     */
    transitionToIa?: string;
    /**
     * Describes the policy used to transition a file from infequent access storage to primary storage. Valid values: `AFTER_1_ACCESS`.
     */
    transitionToPrimaryStorageClass?: string;
}

export interface FileSystemSizeInByte {
    /**
     * The latest known metered size (in bytes) of data stored in the file system.
     */
    value: number;
    /**
     * The latest known metered size (in bytes) of data stored in the Infrequent Access storage class.
     */
    valueInIa: number;
    /**
     * The latest known metered size (in bytes) of data stored in the Standard storage class.
     */
    valueInStandard: number;
}

export interface GetAccessPointPosixUser {
    /**
     * Group ID
     */
    gid: number;
    /**
     * Secondary group IDs
     */
    secondaryGids: number[];
    /**
     * User Id
     * * `rootDirectory`- Single element list containing information on the directory on the Amazon EFS file system that the access point provides access to.
     */
    uid: number;
}

export interface GetAccessPointRootDirectory {
    /**
     * Single element list containing information on the creation permissions of the directory
     */
    creationInfos: outputs.efs.GetAccessPointRootDirectoryCreationInfo[];
    /**
     * Path exposed as the root directory
     */
    path: string;
}

export interface GetAccessPointRootDirectoryCreationInfo {
    /**
     * POSIX owner group ID
     */
    ownerGid: number;
    /**
     * POSIX owner user ID
     */
    ownerUid: number;
    /**
     * POSIX permissions mode
     */
    permissions: string;
}

export interface GetFileSystemLifecyclePolicy {
    transitionToIa: string;
    transitionToPrimaryStorageClass: string;
}

export interface ReplicationConfigurationDestination {
    /**
     * The availability zone in which the replica should be created. If specified, the replica will be created with One Zone storage. If omitted, regional storage will be used.
     */
    availabilityZoneName?: string;
    fileSystemId: string;
    /**
     * The Key ID, ARN, alias, or alias ARN of the KMS key that should be used to encrypt the replica file system. If omitted, the default KMS key for EFS `/aws/elasticfilesystem` will be used.
     */
    kmsKeyId?: string;
    /**
     * The region in which the replica should be created.
     */
    region: string;
    status: string;
}
