// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../../types/input";
import * as outputs from "../../types/output";
import * as enums from "../../types/enums";
import * as utilities from "../../utilities";

import {RoutingRule} from "@/s3";

export interface DataSourceCredentials {
    /**
     * - The Amazon Resource Name (ARN) of a data source that has the credential pair that you want to use.
     * When the value is not null, the `credentialPair` from the data source in the ARN is used.
     */
    copySourceArn?: string;
    /**
     * - Credential pair. See Credential Pair below for more details.
     */
    credentialPair?: outputs.quicksight.DataSourceCredentialsCredentialPair;
}

export interface DataSourceCredentialsCredentialPair {
    /**
     * Password, maximum length of 1024 characters.
     */
    password: string;
    /**
     * User name, maximum length of 64 characters.
     */
    username: string;
}

export interface DataSourceParameters {
    /**
     * Parameters for connecting to Amazon Elasticsearch.
     */
    amazonElasticsearch?: outputs.quicksight.DataSourceParametersAmazonElasticsearch;
    /**
     * Parameters for connecting to Athena.
     */
    athena?: outputs.quicksight.DataSourceParametersAthena;
    /**
     * Parameters for connecting to Aurora MySQL.
     */
    aurora?: outputs.quicksight.DataSourceParametersAurora;
    /**
     * Parameters for connecting to Aurora Postgresql.
     */
    auroraPostgresql?: outputs.quicksight.DataSourceParametersAuroraPostgresql;
    /**
     * Parameters for connecting to AWS IOT Analytics.
     */
    awsIotAnalytics?: outputs.quicksight.DataSourceParametersAwsIotAnalytics;
    /**
     * Parameters for connecting to Jira.
     */
    jira?: outputs.quicksight.DataSourceParametersJira;
    /**
     * Parameters for connecting to MariaDB.
     */
    mariaDb?: outputs.quicksight.DataSourceParametersMariaDb;
    /**
     * Parameters for connecting to MySQL.
     */
    mysql?: outputs.quicksight.DataSourceParametersMysql;
    /**
     * Parameters for connecting to Oracle.
     */
    oracle?: outputs.quicksight.DataSourceParametersOracle;
    /**
     * Parameters for connecting to Postgresql.
     */
    postgresql?: outputs.quicksight.DataSourceParametersPostgresql;
    /**
     * Parameters for connecting to Presto.
     */
    presto?: outputs.quicksight.DataSourceParametersPresto;
    /**
     * Parameters for connecting to RDS.
     */
    rds?: outputs.quicksight.DataSourceParametersRds;
    /**
     * Parameters for connecting to Redshift.
     */
    redshift?: outputs.quicksight.DataSourceParametersRedshift;
    /**
     * Parameters for connecting to S3.
     */
    s3?: outputs.quicksight.DataSourceParametersS3;
    /**
     * Parameters for connecting to ServiceNow.
     */
    serviceNow?: outputs.quicksight.DataSourceParametersServiceNow;
    /**
     * Parameters for connecting to Snowflake.
     */
    snowflake?: outputs.quicksight.DataSourceParametersSnowflake;
    /**
     * Parameters for connecting to Spark.
     */
    spark?: outputs.quicksight.DataSourceParametersSpark;
    /**
     * Parameters for connecting to SQL Server.
     */
    sqlServer?: outputs.quicksight.DataSourceParametersSqlServer;
    /**
     * Parameters for connecting to Teradata.
     */
    teradata?: outputs.quicksight.DataSourceParametersTeradata;
    /**
     * Parameters for connecting to Twitter.
     */
    twitter?: outputs.quicksight.DataSourceParametersTwitter;
}

export interface DataSourceParametersAmazonElasticsearch {
    /**
     * The OpenSearch domain.
     */
    domain: string;
}

export interface DataSourceParametersAthena {
    /**
     * The work-group to which to connect.
     */
    workGroup?: string;
}

export interface DataSourceParametersAurora {
    /**
     * The database to which to connect.
     */
    database: string;
    /**
     * The host to which to connect.
     */
    host: string;
    /**
     * The port to which to connect.
     */
    port: number;
}

export interface DataSourceParametersAuroraPostgresql {
    /**
     * The database to which to connect.
     */
    database: string;
    /**
     * The host to which to connect.
     */
    host: string;
    /**
     * The port to which to connect.
     */
    port: number;
}

export interface DataSourceParametersAwsIotAnalytics {
    /**
     * The name of the data set to which to connect.
     */
    dataSetName: string;
}

export interface DataSourceParametersJira {
    /**
     * The base URL of the Jira instance's site to which to connect.
     */
    siteBaseUrl: string;
}

export interface DataSourceParametersMariaDb {
    /**
     * The database to which to connect.
     */
    database: string;
    /**
     * The host to which to connect.
     */
    host: string;
    /**
     * The port to which to connect.
     */
    port: number;
}

export interface DataSourceParametersMysql {
    /**
     * The database to which to connect.
     */
    database: string;
    /**
     * The host to which to connect.
     */
    host: string;
    /**
     * The port to which to connect.
     */
    port: number;
}

export interface DataSourceParametersOracle {
    /**
     * The database to which to connect.
     */
    database: string;
    /**
     * The host to which to connect.
     */
    host: string;
    /**
     * The port to which to connect.
     */
    port: number;
}

export interface DataSourceParametersPostgresql {
    /**
     * The database to which to connect.
     */
    database: string;
    /**
     * The host to which to connect.
     */
    host: string;
    /**
     * The port to which to connect.
     */
    port: number;
}

export interface DataSourceParametersPresto {
    /**
     * The catalog to which to connect.
     */
    catalog: string;
    /**
     * The host to which to connect.
     */
    host: string;
    /**
     * The port to which to connect.
     */
    port: number;
}

export interface DataSourceParametersRds {
    /**
     * The database to which to connect.
     */
    database: string;
    /**
     * The instance ID to which to connect.
     */
    instanceId: string;
}

export interface DataSourceParametersRedshift {
    /**
     * The ID of the cluster to which to connect.
     */
    clusterId?: string;
    /**
     * The database to which to connect.
     */
    database: string;
    /**
     * The host to which to connect.
     */
    host?: string;
    /**
     * The port to which to connect.
     */
    port?: number;
}

export interface DataSourceParametersS3 {
    /**
     * An object containing the S3 location of the S3 manifest file.
     */
    manifestFileLocation: outputs.quicksight.DataSourceParametersS3ManifestFileLocation;
}

export interface DataSourceParametersS3ManifestFileLocation {
    /**
     * The name of the bucket that contains the manifest file.
     */
    bucket: string;
    /**
     * The key of the manifest file within the bucket.
     */
    key: string;
}

export interface DataSourceParametersServiceNow {
    /**
     * The base URL of the Jira instance's site to which to connect.
     */
    siteBaseUrl: string;
}

export interface DataSourceParametersSnowflake {
    /**
     * The database to which to connect.
     */
    database: string;
    /**
     * The host to which to connect.
     */
    host: string;
    /**
     * The warehouse to which to connect.
     */
    warehouse: string;
}

export interface DataSourceParametersSpark {
    /**
     * The host to which to connect.
     */
    host: string;
    /**
     * The warehouse to which to connect.
     */
    port: number;
}

export interface DataSourceParametersSqlServer {
    /**
     * The database to which to connect.
     */
    database: string;
    /**
     * The host to which to connect.
     */
    host: string;
    /**
     * The warehouse to which to connect.
     */
    port: number;
}

export interface DataSourceParametersTeradata {
    /**
     * The database to which to connect.
     */
    database: string;
    /**
     * The host to which to connect.
     */
    host: string;
    /**
     * The warehouse to which to connect.
     */
    port: number;
}

export interface DataSourceParametersTwitter {
    /**
     * The maximum number of rows to query.
     */
    maxRows: number;
    /**
     * The Twitter query to retrieve the data.
     */
    query: string;
}

export interface DataSourcePermission {
    /**
     * Set of IAM actions to grant or revoke permissions on. Max of 16 items.
     */
    actions: string[];
    /**
     * The Amazon Resource Name (ARN) of the principal.
     */
    principal: string;
}

export interface DataSourceSslProperties {
    /**
     * A Boolean option to control whether SSL should be disabled.
     */
    disableSsl: boolean;
}

export interface DataSourceVpcConnectionProperties {
    /**
     * The Amazon Resource Name (ARN) for the VPC connection.
     */
    vpcConnectionArn: string;
}
