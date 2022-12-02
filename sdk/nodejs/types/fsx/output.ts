// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../../types/input";
import * as outputs from "../../types/output";
import * as enums from "../../types/enums";
import * as utilities from "../../utilities";

import {RoutingRule} from "@/s3";

export interface DataRepositoryAssociationS3 {
    /**
     * Specifies the type of updated objects that will be automatically exported from your file system to the linked S3 bucket. See the `events` configuration block.
     */
    autoExportPolicy: outputs.fsx.DataRepositoryAssociationS3AutoExportPolicy;
    /**
     * Specifies the type of updated objects that will be automatically imported from the linked S3 bucket to your file system. See the `events` configuration block.
     */
    autoImportPolicy: outputs.fsx.DataRepositoryAssociationS3AutoImportPolicy;
}

export interface DataRepositoryAssociationS3AutoExportPolicy {
    /**
     * A list of file event types to automatically export to your linked S3 bucket or import from the linked S3 bucket. Valid values are `NEW`, `CHANGED`, `DELETED`. Max of 3.
     */
    events: string[];
}

export interface DataRepositoryAssociationS3AutoImportPolicy {
    /**
     * A list of file event types to automatically export to your linked S3 bucket or import from the linked S3 bucket. Valid values are `NEW`, `CHANGED`, `DELETED`. Max of 3.
     */
    events: string[];
}

export interface FileCacheDataRepositoryAssociation {
    associationId: string;
    /**
     * The path to the S3 or NFS data repository that links to the cache.
     */
    dataRepositoryPath: string;
    /**
     * A list of NFS Exports that will be linked with this data repository association. The Export paths are in the format /exportpath1. To use this parameter, you must configure DataRepositoryPath as the domain name of the NFS file system. The NFS file system domain name in effect is the root of the subdirectories. Note that DataRepositorySubdirectories is not supported for S3 data repositories. Max of 500.
     */
    dataRepositorySubdirectories?: string[];
    /**
     * The system-generated, unique ID of the cache.
     */
    fileCacheId: string;
    /**
     * A path on the cache that points to a high-level directory (such as /ns1/) or subdirectory (such as /ns1/subdir/) that will be mapped 1-1 with DataRepositoryPath. The leading forward slash in the name is required. Two data repository associations cannot have overlapping cache paths. For example, if a data repository is associated with cache path /ns1/, then you cannot link another data repository with cache path /ns1/ns2. This path specifies where in your cache files will be exported from. This cache directory can be linked to only one data repository, and no data repository other can be linked to the directory. Note: The cache path can only be set to root (/) on an NFS DRA when DataRepositorySubdirectories is specified. If you specify root (/) as the cache path, you can create only one DRA on the cache. The cache path cannot be set to root (/) for an S3 DRA.
     */
    fileCachePath: string;
    fileSystemId: string;
    fileSystemPath: string;
    importedFileChunkSize: number;
    /**
     * - (Optional) See the `nfs` configuration block.
     */
    nfs?: outputs.fsx.FileCacheDataRepositoryAssociationNf[];
    resourceArn: string;
    /**
     * A map of tags to assign to the file cache. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags: {[key: string]: string};
}

export interface FileCacheDataRepositoryAssociationNf {
    /**
     * - A list of up to 2 IP addresses of DNS servers used to resolve the NFS file system domain name. The provided IP addresses can either be the IP addresses of a DNS forwarder or resolver that the customer manages and runs inside the customer VPC, or the IP addresses of the on-premises DNS servers.
     */
    dnsIps?: string[];
    /**
     * - The version of the NFS (Network File System) protocol of the NFS data repository. The only supported value is NFS3, which indicates that the data repository must support the NFSv3 protocol. The only supported value is `NFS3`.
     */
    version: string;
}

export interface FileCacheLustreConfiguration {
    /**
     * Specifies the cache deployment type. The only supported value is `CACHE_1`.
     */
    deploymentType: string;
    logConfigurations: outputs.fsx.FileCacheLustreConfigurationLogConfiguration[];
    /**
     * The configuration for a Lustre MDT (Metadata Target) storage volume. See the `metadataConfiguration` block.
     */
    metadataConfigurations: outputs.fsx.FileCacheLustreConfigurationMetadataConfiguration[];
    mountName: string;
    /**
     * Provisions the amount of read and write throughput for each 1 tebibyte (TiB) of cache storage capacity, in MB/s/TiB. The only supported value is `1000`.
     */
    perUnitStorageThroughput: number;
    /**
     * A recurring weekly time, in the format `D:HH:MM`. `D` is the day of the week, for which `1` represents Monday and `7` represents Sunday. `HH` is the zero-padded hour of the day (0-23), and `MM` is the zero-padded minute of the hour. For example, 1:05:00 specifies maintenance at 5 AM Monday. See the [ISO week date](https://en.wikipedia.org/wiki/ISO_week_date) for more information.
     */
    weeklyMaintenanceStartTime?: string;
}

export interface FileCacheLustreConfigurationLogConfiguration {
    destination: string;
    level: string;
}

export interface FileCacheLustreConfigurationMetadataConfiguration {
    /**
     * The storage capacity of the Lustre MDT (Metadata Target) storage volume in gibibytes (GiB). The only supported value is `2400` GiB.
     */
    storageCapacity: number;
}

export interface GetOpenZfsSnapshotFilter {
    /**
     * Name of the snapshot.
     */
    name: string;
    values: string[];
}

export interface LustreFileSystemLogConfiguration {
    /**
     * The Amazon Resource Name (ARN) that specifies the destination of the logs. The name of the Amazon CloudWatch Logs log group must begin with the `/aws/fsx` prefix. If you do not provide a destination, Amazon FSx will create and use a log stream in the CloudWatch Logs `/aws/fsx/lustre` log group.
     */
    destination: string;
    /**
     * Sets which data repository events are logged by Amazon FSx. Valid values are `WARN_ONLY`, `FAILURE_ONLY`, `ERROR_ONLY`, `WARN_ERROR` and `DISABLED`. Default value is `DISABLED`.
     */
    level?: string;
}

export interface OntapFileSystemDiskIopsConfiguration {
    /**
     * - The total number of SSD IOPS provisioned for the file system.
     */
    iops: number;
    /**
     * - Specifies whether the number of IOPS for the file system is using the system. Valid values are `AUTOMATIC` and `USER_PROVISIONED`. Default value is `AUTOMATIC`.
     */
    mode?: string;
}

export interface OntapFileSystemEndpoint {
    /**
     * An endpoint for managing your file system by setting up NetApp SnapMirror with other ONTAP systems. See Endpoint.
     */
    interclusters: outputs.fsx.OntapFileSystemEndpointIntercluster[];
    /**
     * An endpoint for managing your file system using the NetApp ONTAP CLI and NetApp ONTAP API. See Endpoint.
     */
    managements: outputs.fsx.OntapFileSystemEndpointManagement[];
}

export interface OntapFileSystemEndpointIntercluster {
    /**
     * The Domain Name Service (DNS) name for the file system. You can mount your file system using its DNS name.
     */
    dnsName: string;
    /**
     * IP addresses of the file system endpoint.
     */
    ipAddresses: string[];
}

export interface OntapFileSystemEndpointManagement {
    /**
     * The Domain Name Service (DNS) name for the file system. You can mount your file system using its DNS name.
     */
    dnsName: string;
    /**
     * IP addresses of the file system endpoint.
     */
    ipAddresses: string[];
}

export interface OntapStorageVirtualMachineActiveDirectoryConfiguration {
    /**
     * The NetBIOS name of the Active Directory computer object that will be created for your SVM. This is often the same as the SVM name but can be different. AWS limits to 15 characters because of standard NetBIOS naming limits.
     */
    netbiosName?: string;
    selfManagedActiveDirectoryConfiguration?: outputs.fsx.OntapStorageVirtualMachineActiveDirectoryConfigurationSelfManagedActiveDirectoryConfiguration;
}

export interface OntapStorageVirtualMachineActiveDirectoryConfigurationSelfManagedActiveDirectoryConfiguration {
    /**
     * A list of up to three IP addresses of DNS servers or domain controllers in the self-managed AD directory.
     */
    dnsIps: string[];
    /**
     * The fully qualified domain name of the self-managed AD directory. For example, `corp.example.com`.
     */
    domainName: string;
    /**
     * The name of the domain group whose members are granted administrative privileges for the SVM. The group that you specify must already exist in your domain. Defaults to `Domain Admins`.
     */
    fileSystemAdministratorsGroup?: string;
    /**
     * The fully qualified distinguished name of the organizational unit within your self-managed AD directory that the Windows File Server instance will join. For example, `OU=FSx,DC=yourdomain,DC=corp,DC=com`. Only accepts OU as the direct parent of the SVM. If none is provided, the SVM is created in the default location of your self-managed AD directory. To learn more, see [RFC 2253](https://tools.ietf.org/html/rfc2253).
     */
    organizationalUnitDistinguishedName?: string;
    /**
     * The password for the service account on your self-managed AD domain that Amazon FSx will use to join to your AD domain.
     */
    password: string;
    /**
     * The user name for the service account on your self-managed AD domain that Amazon FSx will use to join to your AD domain.
     */
    username: string;
}

export interface OntapStorageVirtualMachineEndpoint {
    /**
     * An endpoint for accessing data on your storage virtual machine via iSCSI protocol. See Endpoint.
     */
    iscses: outputs.fsx.OntapStorageVirtualMachineEndpointIscse[];
    /**
     * An endpoint for managing your file system using the NetApp ONTAP CLI and NetApp ONTAP API. See Endpoint.
     */
    managements: outputs.fsx.OntapStorageVirtualMachineEndpointManagement[];
    /**
     * An endpoint for accessing data on your storage virtual machine via NFS protocol. See Endpoint.
     */
    nfs: outputs.fsx.OntapStorageVirtualMachineEndpointNf[];
    /**
     * An endpoint for accessing data on your storage virtual machine via SMB protocol. This is only set if an activeDirectoryConfiguration has been set. See Endpoint.
     */
    smbs: outputs.fsx.OntapStorageVirtualMachineEndpointSmb[];
}

export interface OntapStorageVirtualMachineEndpointIscse {
    /**
     * The Domain Name Service (DNS) name for the storage virtual machine. You can mount your storage virtual machine using its DNS name.
     */
    dnsName: string;
    /**
     * IP addresses of the storage virtual machine endpoint.
     */
    ipAddresses: string[];
}

export interface OntapStorageVirtualMachineEndpointManagement {
    /**
     * The Domain Name Service (DNS) name for the storage virtual machine. You can mount your storage virtual machine using its DNS name.
     */
    dnsName: string;
    /**
     * IP addresses of the storage virtual machine endpoint.
     */
    ipAddresses: string[];
}

export interface OntapStorageVirtualMachineEndpointNf {
    /**
     * The Domain Name Service (DNS) name for the storage virtual machine. You can mount your storage virtual machine using its DNS name.
     */
    dnsName: string;
    /**
     * IP addresses of the storage virtual machine endpoint.
     */
    ipAddresses: string[];
}

export interface OntapStorageVirtualMachineEndpointSmb {
    /**
     * The Domain Name Service (DNS) name for the storage virtual machine. You can mount your storage virtual machine using its DNS name.
     */
    dnsName: string;
    /**
     * IP addresses of the storage virtual machine endpoint.
     */
    ipAddresses: string[];
}

export interface OntapVolumeTieringPolicy {
    coolingPeriod?: number;
    /**
     * Specifies the tiering policy for the ONTAP volume for moving data to the capacity pool storage. Valid values are `SNAPSHOT_ONLY`, `AUTO`, `ALL`, `NONE`. Default value is `SNAPSHOT_ONLY`.
     */
    name: string;
}

export interface OpenZfsFileSystemDiskIopsConfiguration {
    /**
     * - The total number of SSD IOPS provisioned for the file system.
     */
    iops: number;
    /**
     * - Specifies whether the number of IOPS for the file system is using the system. Valid values are `AUTOMATIC` and `USER_PROVISIONED`. Default value is `AUTOMATIC`.
     */
    mode?: string;
}

export interface OpenZfsFileSystemRootVolumeConfiguration {
    /**
     * - A boolean flag indicating whether tags for the file system should be copied to snapshots. The default value is false.
     */
    copyTagsToSnapshots?: boolean;
    /**
     * - Method used to compress the data on the volume. Valid values are `LZ4`, `NONE` or `ZSTD`. Child volumes that don't specify compression option will inherit from parent volume. This option on file system applies to the root volume.
     */
    dataCompressionType?: string;
    /**
     * - NFS export configuration for the root volume. Exactly 1 item. See NFS Exports Below.
     */
    nfsExports?: outputs.fsx.OpenZfsFileSystemRootVolumeConfigurationNfsExports;
    /**
     * - specifies whether the volume is read-only. Default is false.
     */
    readOnly: boolean;
    /**
     * - Specifies the record size of an OpenZFS root volume, in kibibytes (KiB). Valid values are `4`, `8`, `16`, `32`, `64`, `128`, `256`, `512`, or `1024` KiB. The default is `128` KiB.
     */
    recordSizeKib?: number;
    /**
     * - Specify how much storage users or groups can use on the volume. Maximum of 100 items. See User and Group Quotas Below.
     */
    userAndGroupQuotas: outputs.fsx.OpenZfsFileSystemRootVolumeConfigurationUserAndGroupQuota[];
}

export interface OpenZfsFileSystemRootVolumeConfigurationNfsExports {
    /**
     * - A list of configuration objects that contain the client and options for mounting the OpenZFS file system. Maximum of 25 items. See Client Configurations Below.
     */
    clientConfigurations: outputs.fsx.OpenZfsFileSystemRootVolumeConfigurationNfsExportsClientConfiguration[];
}

export interface OpenZfsFileSystemRootVolumeConfigurationNfsExportsClientConfiguration {
    /**
     * - A value that specifies who can mount the file system. You can provide a wildcard character (*), an IP address (0.0.0.0), or a CIDR address (192.0.2.0/24. By default, Amazon FSx uses the wildcard character when specifying the client.
     */
    clients: string;
    /**
     * -  The options to use when mounting the file system. Maximum of 20 items. See the [Linix NFS exports man page](https://linux.die.net/man/5/exports) for more information. `crossmount` and `sync` are used by default.
     */
    options: string[];
}

export interface OpenZfsFileSystemRootVolumeConfigurationUserAndGroupQuota {
    /**
     * - The ID of the user or group. Valid values between `0` and `2147483647`
     */
    id: number;
    /**
     * - The amount of storage that the user or group can use in gibibytes (GiB). Valid values between `0` and `2147483647`
     */
    storageCapacityQuotaGib: number;
    /**
     * - A value that specifies whether the quota applies to a user or group. Valid values are `USER` or `GROUP`.
     */
    type: string;
}

export interface OpenZfsVolumeNfsExports {
    /**
     * - A list of configuration objects that contain the client and options for mounting the OpenZFS file system. Maximum of 25 items. See Client Configurations Below.
     */
    clientConfigurations: outputs.fsx.OpenZfsVolumeNfsExportsClientConfiguration[];
}

export interface OpenZfsVolumeNfsExportsClientConfiguration {
    /**
     * - A value that specifies who can mount the file system. You can provide a wildcard character (*), an IP address (0.0.0.0), or a CIDR address (192.0.2.0/24. By default, Amazon FSx uses the wildcard character when specifying the client.
     */
    clients: string;
    /**
     * -  The options to use when mounting the file system. Maximum of 20 items. See the [Linix NFS exports man page](https://linux.die.net/man/5/exports) for more information. `crossmount` and `sync` are used by default.
     */
    options: string[];
}

export interface OpenZfsVolumeOriginSnapshot {
    copyStrategy: string;
    snapshotArn: string;
}

export interface OpenZfsVolumeUserAndGroupQuota {
    /**
     * - The ID of the user or group. Valid values between `0` and `2147483647`
     */
    id: number;
    /**
     * - The amount of storage that the user or group can use in gibibytes (GiB). Valid values between `0` and `2147483647`
     */
    storageCapacityQuotaGib: number;
    type: string;
}

export interface WindowsFileSystemAuditLogConfiguration {
    /**
     * The Amazon Resource Name (ARN) for the destination of the audit logs. The destination can be any Amazon CloudWatch Logs log group ARN or Amazon Kinesis Data Firehose delivery stream ARN. Can be specified when `fileAccessAuditLogLevel` and `fileShareAccessAuditLogLevel` are not set to `DISABLED`. The name of the Amazon CloudWatch Logs log group must begin with the `/aws/fsx` prefix. The name of the Amazon Kinesis Data Firehouse delivery stream must begin with the `aws-fsx` prefix. If you do not provide a destination in `auditLogDestionation`, Amazon FSx will create and use a log stream in the CloudWatch Logs /aws/fsx/windows log group.
     */
    auditLogDestination: string;
    /**
     * Sets which attempt type is logged by Amazon FSx for file and folder accesses. Valid values are `SUCCESS_ONLY`, `FAILURE_ONLY`, `SUCCESS_AND_FAILURE`, and `DISABLED`. Default value is `DISABLED`.
     */
    fileAccessAuditLogLevel?: string;
    /**
     * Sets which attempt type is logged by Amazon FSx for file share accesses. Valid values are `SUCCESS_ONLY`, `FAILURE_ONLY`, `SUCCESS_AND_FAILURE`, and `DISABLED`. Default value is `DISABLED`.
     */
    fileShareAccessAuditLogLevel?: string;
}

export interface WindowsFileSystemSelfManagedActiveDirectory {
    /**
     * A list of up to two IP addresses of DNS servers or domain controllers in the self-managed AD directory. The IP addresses need to be either in the same VPC CIDR range as the file system or in the private IP version 4 (IPv4) address ranges as specified in [RFC 1918](https://tools.ietf.org/html/rfc1918).
     */
    dnsIps: string[];
    /**
     * The fully qualified domain name of the self-managed AD directory. For example, `corp.example.com`.
     */
    domainName: string;
    /**
     * The name of the domain group whose members are granted administrative privileges for the file system. Administrative privileges include taking ownership of files and folders, and setting audit controls (audit ACLs) on files and folders. The group that you specify must already exist in your domain. Defaults to `Domain Admins`.
     */
    fileSystemAdministratorsGroup?: string;
    /**
     * The fully qualified distinguished name of the organizational unit within your self-managed AD directory that the Windows File Server instance will join. For example, `OU=FSx,DC=yourdomain,DC=corp,DC=com`. Only accepts OU as the direct parent of the file system. If none is provided, the FSx file system is created in the default location of your self-managed AD directory. To learn more, see [RFC 2253](https://tools.ietf.org/html/rfc2253).
     */
    organizationalUnitDistinguishedName?: string;
    /**
     * The password for the service account on your self-managed AD domain that Amazon FSx will use to join to your AD domain.
     */
    password: string;
    /**
     * The user name for the service account on your self-managed AD domain that Amazon FSx will use to join to your AD domain.
     */
    username: string;
}
