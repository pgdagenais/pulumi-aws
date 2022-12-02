// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../../types/input";
import * as outputs from "../../types/output";
import * as enums from "../../types/enums";
import * as utilities from "../../utilities";

import {RoutingRule} from "@/s3";

export interface ClusterCacheNode {
    address: string;
    /**
     * Availability Zone for the cache cluster. If you want to create cache nodes in multi-az, use `preferredAvailabilityZones` instead. Default: System chosen Availability Zone. Changing this value will re-create the resource.
     */
    availabilityZone: string;
    id: string;
    outpostArn: string;
    /**
     * The port number on which each of the cache nodes will accept connections. For Memcached the default is 11211, and for Redis the default port is 6379. Cannot be provided with `replicationGroupId`. Changing this value will re-create the resource.
     */
    port: number;
}

export interface ClusterLogDeliveryConfiguration {
    /**
     * Name of either the CloudWatch Logs LogGroup or Kinesis Data Firehose resource.
     */
    destination: string;
    /**
     * For CloudWatch Logs use `cloudwatch-logs` or for Kinesis Data Firehose use `kinesis-firehose`.
     */
    destinationType: string;
    /**
     * Valid values are `json` or `text`
     */
    logFormat: string;
    /**
     * Valid values are  `slow-log` or `engine-log`. Max 1 of each.
     */
    logType: string;
}

export interface GetClusterCacheNode {
    address: string;
    /**
     * Availability Zone for the cache cluster.
     */
    availabilityZone: string;
    id: string;
    outpostArn: string;
    /**
     * The port number on which each of the cache nodes will
     * accept connections.
     */
    port: number;
}

export interface GetClusterLogDeliveryConfiguration {
    destination: string;
    destinationType: string;
    logFormat: string;
    logType: string;
}

export interface GetReplicationGroupLogDeliveryConfiguration {
    destination: string;
    destinationType: string;
    logFormat: string;
    logType: string;
}

export interface GlobalReplicationGroupGlobalNodeGroup {
    /**
     * The ID of the global node group.
     */
    globalNodeGroupId: string;
    /**
     * The keyspace for this node group.
     */
    slots: string;
}

export interface ParameterGroupParameter {
    /**
     * The name of the ElastiCache parameter.
     */
    name: string;
    /**
     * The value of the ElastiCache parameter.
     */
    value: string;
}

export interface ReplicationGroupClusterMode {
    /**
     * Number of node groups (shards) for this Redis replication group. Changing this number will trigger an online resizing operation before other settings modifications. Required unless `globalReplicationGroupId` is set.
     *
     * @deprecated Use root-level num_node_groups instead
     */
    numNodeGroups: number;
    /**
     * Number of replica nodes in each node group. Valid values are 0 to 5. Changing this number will trigger an online resizing operation before other settings modifications.
     *
     * @deprecated Use root-level replicas_per_node_group instead
     */
    replicasPerNodeGroup: number;
}

export interface ReplicationGroupLogDeliveryConfiguration {
    /**
     * Name of either the CloudWatch Logs LogGroup or Kinesis Data Firehose resource.
     */
    destination: string;
    /**
     * For CloudWatch Logs use `cloudwatch-logs` or for Kinesis Data Firehose use `kinesis-firehose`.
     */
    destinationType: string;
    /**
     * Valid values are `json` or `text`
     */
    logFormat: string;
    /**
     * Valid values are  `slow-log` or `engine-log`. Max 1 of each.
     */
    logType: string;
}
