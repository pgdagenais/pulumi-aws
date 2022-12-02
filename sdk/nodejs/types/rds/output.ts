// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../../types/input";
import * as outputs from "../../types/output";
import * as enums from "../../types/enums";
import * as utilities from "../../utilities";

import {RoutingRule} from "@/s3";

export interface ClusterParameterGroupParameter {
    /**
     * "immediate" (default), or "pending-reboot". Some
     * engines can't apply some parameters without a reboot, and you will need to
     * specify "pending-reboot" here.
     */
    applyMethod?: string;
    /**
     * The name of the DB parameter.
     */
    name: string;
    /**
     * The value of the DB parameter.
     */
    value: string;
}

export interface ClusterRestoreToPointInTime {
    /**
     * Date and time in UTC format to restore the database cluster to. Conflicts with `useLatestRestorableTime`.
     */
    restoreToTime?: string;
    /**
     * Type of restore to be performed.
     * Valid options are `full-copy` (default) and `copy-on-write`.
     */
    restoreType?: string;
    /**
     * The identifier of the source database cluster from which to restore.
     */
    sourceClusterIdentifier: string;
    /**
     * Set to true to restore the database cluster to the latest restorable backup time. Defaults to false. Conflicts with `restoreToTime`.
     */
    useLatestRestorableTime?: boolean;
}

export interface ClusterS3Import {
    /**
     * The bucket name where your backup is stored
     */
    bucketName: string;
    /**
     * Can be blank, but is the path to your backup
     */
    bucketPrefix?: string;
    /**
     * Role applied to load the data.
     */
    ingestionRole: string;
    /**
     * Source engine for the backup
     */
    sourceEngine: string;
    /**
     * Version of the source engine used to make the backup
     */
    sourceEngineVersion: string;
}

export interface ClusterScalingConfiguration {
    /**
     * Whether to enable automatic pause. A DB cluster can be paused only when it's idle (it has no connections). If a DB cluster is paused for more than seven days, the DB cluster might be backed up with a snapshot. In this case, the DB cluster is restored when there is a request to connect to it. Defaults to `true`.
     */
    autoPause?: boolean;
    /**
     * The maximum capacity for an Aurora DB cluster in `serverless` DB engine mode. The maximum capacity must be greater than or equal to the minimum capacity. Valid Aurora MySQL capacity values are `1`, `2`, `4`, `8`, `16`, `32`, `64`, `128`, `256`. Valid Aurora PostgreSQL capacity values are (`2`, `4`, `8`, `16`, `32`, `64`, `192`, and `384`). Defaults to `16`.
     */
    maxCapacity?: number;
    /**
     * The minimum capacity for an Aurora DB cluster in `serverless` DB engine mode. The minimum capacity must be lesser than or equal to the maximum capacity. Valid Aurora MySQL capacity values are `1`, `2`, `4`, `8`, `16`, `32`, `64`, `128`, `256`. Valid Aurora PostgreSQL capacity values are (`2`, `4`, `8`, `16`, `32`, `64`, `192`, and `384`). Defaults to `1`.
     */
    minCapacity?: number;
    /**
     * The time, in seconds, before an Aurora DB cluster in serverless mode is paused. Valid values are `300` through `86400`. Defaults to `300`.
     */
    secondsUntilAutoPause?: number;
    /**
     * The action to take when the timeout is reached. Valid values: `ForceApplyCapacityChange`, `RollbackCapacityChange`. Defaults to `RollbackCapacityChange`. See [documentation](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.how-it-works.html#aurora-serverless.how-it-works.timeout-action).
     */
    timeoutAction?: string;
}

export interface ClusterServerlessv2ScalingConfiguration {
    /**
     * The maximum capacity for an Aurora DB cluster in `serverless` DB engine mode. The maximum capacity must be greater than or equal to the minimum capacity. Valid Aurora MySQL capacity values are `1`, `2`, `4`, `8`, `16`, `32`, `64`, `128`, `256`. Valid Aurora PostgreSQL capacity values are (`2`, `4`, `8`, `16`, `32`, `64`, `192`, and `384`). Defaults to `16`.
     */
    maxCapacity: number;
    /**
     * The minimum capacity for an Aurora DB cluster in `serverless` DB engine mode. The minimum capacity must be lesser than or equal to the maximum capacity. Valid Aurora MySQL capacity values are `1`, `2`, `4`, `8`, `16`, `32`, `64`, `128`, `256`. Valid Aurora PostgreSQL capacity values are (`2`, `4`, `8`, `16`, `32`, `64`, `192`, and `384`). Defaults to `1`.
     */
    minCapacity: number;
}

export interface GetClustersFilter {
    /**
     * Name of the filter field. Valid values can be found in the [RDS DescribeDBClusters API Reference](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DescribeDBClusters.html).
     */
    name: string;
    /**
     * Set of values that are accepted for the given filter field. Results will be selected if any given value matches.
     */
    values: string[];
}

export interface GetEngineVersionFilter {
    name: string;
    values: string[];
}

export interface GetProxyAuth {
    authScheme: string;
    description: string;
    iamAuth: string;
    secretArn: string;
    username: string;
}

export interface GlobalClusterGlobalClusterMember {
    /**
     * Amazon Resource Name (ARN) of member DB Cluster
     */
    dbClusterArn: string;
    /**
     * Whether the member is the primary DB Cluster
     */
    isWriter: boolean;
}

export interface InstanceBlueGreenUpdate {
    /**
     * Enables low-downtime updates when `true`.
     * Default is `false`.
     */
    enabled?: boolean;
}

export interface InstanceRestoreToPointInTime {
    /**
     * The date and time to restore from. Value must be a time in Universal Coordinated Time (UTC) format and must be before the latest restorable time for the DB instance. Cannot be specified with `useLatestRestorableTime`.
     */
    restoreTime?: string;
    /**
     * The ARN of the automated backup from which to restore. Required if `sourceDbInstanceIdentifier` or `sourceDbiResourceId` is not specified.
     */
    sourceDbInstanceAutomatedBackupsArn?: string;
    /**
     * The identifier of the source DB instance from which to restore. Must match the identifier of an existing DB instance. Required if `sourceDbInstanceAutomatedBackupsArn` or `sourceDbiResourceId` is not specified.
     */
    sourceDbInstanceIdentifier?: string;
    /**
     * The resource ID of the source DB instance from which to restore. Required if `sourceDbInstanceIdentifier` or `sourceDbInstanceAutomatedBackupsArn` is not specified.
     */
    sourceDbiResourceId?: string;
    /**
     * A boolean value that indicates whether the DB instance is restored from the latest backup time. Defaults to `false`. Cannot be specified with `restoreTime`.
     */
    useLatestRestorableTime?: boolean;
}

export interface InstanceS3Import {
    /**
     * The bucket name where your backup is stored
     */
    bucketName: string;
    /**
     * Can be blank, but is the path to your backup
     */
    bucketPrefix?: string;
    /**
     * Role applied to load the data.
     */
    ingestionRole: string;
    /**
     * Source engine for the backup
     */
    sourceEngine: string;
    /**
     * Version of the source engine used to make the backup
     */
    sourceEngineVersion: string;
}

export interface OptionGroupOption {
    /**
     * A list of DB Security Groups for which the option is enabled.
     */
    dbSecurityGroupMemberships?: string[];
    /**
     * The Name of the Option (e.g., MEMCACHED).
     */
    optionName: string;
    /**
     * A list of option settings to apply.
     */
    optionSettings?: outputs.rds.OptionGroupOptionOptionSetting[];
    /**
     * The Port number when connecting to the Option (e.g., 11211).
     */
    port?: number;
    /**
     * The version of the option (e.g., 13.1.0.0).
     */
    version?: string;
    /**
     * A list of VPC Security Groups for which the option is enabled.
     */
    vpcSecurityGroupMemberships?: string[];
}

export interface OptionGroupOptionOptionSetting {
    /**
     * The Name of the setting.
     */
    name: string;
    /**
     * The Value of the setting.
     */
    value: string;
}

export interface ParameterGroupParameter {
    /**
     * "immediate" (default), or "pending-reboot". Some
     * engines can't apply some parameters without a reboot, and you will need to
     * specify "pending-reboot" here.
     */
    applyMethod?: string;
    /**
     * The name of the DB parameter.
     */
    name: string;
    /**
     * The value of the DB parameter.
     */
    value: string;
}

export interface ProxyAuth {
    /**
     * The type of authentication that the proxy uses for connections from the proxy to the underlying database. One of `SECRETS`.
     */
    authScheme?: string;
    /**
     * A user-specified description about the authentication used by a proxy to log in as a specific database user.
     */
    description?: string;
    /**
     * Whether to require or disallow AWS Identity and Access Management (IAM) authentication for connections to the proxy. One of `DISABLED`, `REQUIRED`.
     */
    iamAuth?: string;
    /**
     * The Amazon Resource Name (ARN) representing the secret that the proxy uses to authenticate to the RDS DB instance or Aurora DB cluster. These secrets are stored within Amazon Secrets Manager.
     */
    secretArn?: string;
    /**
     * The name of the database user to which the proxy connects.
     */
    username?: string;
}

export interface ProxyDefaultTargetGroupConnectionPoolConfig {
    /**
     * The number of seconds for a proxy to wait for a connection to become available in the connection pool. Only applies when the proxy has opened its maximum number of connections and all connections are busy with client sessions.
     */
    connectionBorrowTimeout?: number;
    /**
     * One or more SQL statements for the proxy to run when opening each new database connection. Typically used with `SET` statements to make sure that each connection has identical settings such as time zone and character set. This setting is empty by default. For multiple statements, use semicolons as the separator. You can also include multiple variables in a single `SET` statement, such as `SET x=1, y=2`.
     */
    initQuery?: string;
    /**
     * The maximum size of the connection pool for each target in a target group. For Aurora MySQL, it is expressed as a percentage of the maxConnections setting for the RDS DB instance or Aurora DB cluster used by the target group.
     */
    maxConnectionsPercent?: number;
    /**
     * Controls how actively the proxy closes idle database connections in the connection pool. A high value enables the proxy to leave a high percentage of idle connections open. A low value causes the proxy to close idle client connections and return the underlying database connections to the connection pool. For Aurora MySQL, it is expressed as a percentage of the maxConnections setting for the RDS DB instance or Aurora DB cluster used by the target group.
     */
    maxIdleConnectionsPercent?: number;
    /**
     * Each item in the list represents a class of SQL operations that normally cause all later statements in a session using a proxy to be pinned to the same underlying database connection. Including an item in the list exempts that class of SQL operations from the pinning behavior. Currently, the only allowed value is `EXCLUDE_VARIABLE_SETS`.
     */
    sessionPinningFilters?: string[];
}

export interface ReservedInstanceRecurringCharge {
    recurringChargeAmount: number;
    recurringChargeFrequency: string;
}

export interface SecurityGroupIngress {
    /**
     * The CIDR block to accept
     */
    cidr?: string;
    /**
     * The ID of the security group to authorize
     */
    securityGroupId: string;
    /**
     * The name of the security group to authorize
     */
    securityGroupName: string;
    /**
     * The owner Id of the security group provided
     * by `securityGroupName`.
     */
    securityGroupOwnerId: string;
}
