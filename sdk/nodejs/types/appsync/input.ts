// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../../types/input";
import * as outputs from "../../types/output";
import * as enums from "../../types/enums";
import * as utilities from "../../utilities";

import {RoutingRule} from "@/s3";

export interface DataSourceDynamodbConfig {
    deltaSyncConfig?: pulumi.Input<inputs.appsync.DataSourceDynamodbConfigDeltaSyncConfig>;
    /**
     * AWS Region for RDS HTTP endpoint. Defaults to current region.
     */
    region?: pulumi.Input<string>;
    /**
     * Name of the DynamoDB table.
     */
    tableName: pulumi.Input<string>;
    /**
     * Set to `true` to use Amazon Cognito credentials with this data source.
     */
    useCallerCredentials?: pulumi.Input<boolean>;
    versioned?: pulumi.Input<boolean>;
}

export interface DataSourceDynamodbConfigDeltaSyncConfig {
    baseTableTtl?: pulumi.Input<number>;
    deltaSyncTableName: pulumi.Input<string>;
    deltaSyncTableTtl?: pulumi.Input<number>;
}

export interface DataSourceElasticsearchConfig {
    /**
     * HTTP URL.
     */
    endpoint: pulumi.Input<string>;
    /**
     * AWS Region for RDS HTTP endpoint. Defaults to current region.
     */
    region?: pulumi.Input<string>;
}

export interface DataSourceHttpConfig {
    /**
     * Authorization configuration in case the HTTP endpoint requires authorization. See Authorization Config.
     */
    authorizationConfig?: pulumi.Input<inputs.appsync.DataSourceHttpConfigAuthorizationConfig>;
    /**
     * HTTP URL.
     */
    endpoint: pulumi.Input<string>;
}

export interface DataSourceHttpConfigAuthorizationConfig {
    /**
     * Authorization type that the HTTP endpoint requires. Default values is `AWS_IAM`.
     */
    authorizationType?: pulumi.Input<string>;
    /**
     * Identity and Access Management (IAM) settings. See AWS IAM Config.
     */
    awsIamConfig?: pulumi.Input<inputs.appsync.DataSourceHttpConfigAuthorizationConfigAwsIamConfig>;
}

export interface DataSourceHttpConfigAuthorizationConfigAwsIamConfig {
    /**
     * Signing Amazon Web Services Region for IAM authorization.
     */
    signingRegion?: pulumi.Input<string>;
    /**
     * Signing service name for IAM authorization.
     */
    signingServiceName?: pulumi.Input<string>;
}

export interface DataSourceLambdaConfig {
    /**
     * ARN for the Lambda function.
     */
    functionArn: pulumi.Input<string>;
}

export interface DataSourceRelationalDatabaseConfig {
    /**
     * Amazon RDS HTTP endpoint configuration. See HTTP Endpoint Config.
     */
    httpEndpointConfig?: pulumi.Input<inputs.appsync.DataSourceRelationalDatabaseConfigHttpEndpointConfig>;
    /**
     * Source type for the relational database. Valid values: `RDS_HTTP_ENDPOINT`.
     */
    sourceType?: pulumi.Input<string>;
}

export interface DataSourceRelationalDatabaseConfigHttpEndpointConfig {
    /**
     * AWS secret store ARN for database credentials.
     */
    awsSecretStoreArn: pulumi.Input<string>;
    /**
     * Logical database name.
     */
    databaseName?: pulumi.Input<string>;
    /**
     * Amazon RDS cluster identifier.
     */
    dbClusterIdentifier: pulumi.Input<string>;
    /**
     * AWS Region for RDS HTTP endpoint. Defaults to current region.
     */
    region?: pulumi.Input<string>;
    /**
     * Logical schema name.
     */
    schema?: pulumi.Input<string>;
}

export interface FunctionSyncConfig {
    /**
     * Conflict Detection strategy to use. Valid values are `NONE` and `VERSION`.
     */
    conflictDetection?: pulumi.Input<string>;
    /**
     * Conflict Resolution strategy to perform in the event of a conflict. Valid values are `NONE`, `OPTIMISTIC_CONCURRENCY`, `AUTOMERGE`, and `LAMBDA`.
     */
    conflictHandler?: pulumi.Input<string>;
    /**
     * Lambda Conflict Handler Config when configuring `LAMBDA` as the Conflict Handler. See Lambda Conflict Handler Config.
     */
    lambdaConflictHandlerConfig?: pulumi.Input<inputs.appsync.FunctionSyncConfigLambdaConflictHandlerConfig>;
}

export interface FunctionSyncConfigLambdaConflictHandlerConfig {
    /**
     * ARN for the Lambda function to use as the Conflict Handler.
     */
    lambdaConflictHandlerArn?: pulumi.Input<string>;
}

export interface GraphQLApiAdditionalAuthenticationProvider {
    /**
     * Authentication type. Valid values: `API_KEY`, `AWS_IAM`, `AMAZON_COGNITO_USER_POOLS`, `OPENID_CONNECT`, `AWS_LAMBDA`
     */
    authenticationType: pulumi.Input<string>;
    /**
     * Nested argument containing Lambda authorizer configuration. Defined below.
     */
    lambdaAuthorizerConfig?: pulumi.Input<inputs.appsync.GraphQLApiAdditionalAuthenticationProviderLambdaAuthorizerConfig>;
    /**
     * Nested argument containing OpenID Connect configuration. Defined below.
     */
    openidConnectConfig?: pulumi.Input<inputs.appsync.GraphQLApiAdditionalAuthenticationProviderOpenidConnectConfig>;
    /**
     * Amazon Cognito User Pool configuration. Defined below.
     */
    userPoolConfig?: pulumi.Input<inputs.appsync.GraphQLApiAdditionalAuthenticationProviderUserPoolConfig>;
}

export interface GraphQLApiAdditionalAuthenticationProviderLambdaAuthorizerConfig {
    /**
     * Number of seconds a response should be cached for. The default is 5 minutes (300 seconds). The Lambda function can override this by returning a `ttlOverride` key in its response. A value of 0 disables caching of responses. Minimum value of 0. Maximum value of 3600.
     */
    authorizerResultTtlInSeconds?: pulumi.Input<number>;
    /**
     * ARN of the Lambda function to be called for authorization. Note: This Lambda function must have a resource-based policy assigned to it, to allow `lambda:InvokeFunction` from service principal `appsync.amazonaws.com`.
     */
    authorizerUri: pulumi.Input<string>;
    /**
     * Regular expression for validation of tokens before the Lambda function is called.
     */
    identityValidationExpression?: pulumi.Input<string>;
}

export interface GraphQLApiAdditionalAuthenticationProviderOpenidConnectConfig {
    /**
     * Number of milliseconds a token is valid after being authenticated.
     */
    authTtl?: pulumi.Input<number>;
    /**
     * Client identifier of the Relying party at the OpenID identity provider. This identifier is typically obtained when the Relying party is registered with the OpenID identity provider. You can specify a regular expression so the AWS AppSync can validate against multiple client identifiers at a time.
     */
    clientId?: pulumi.Input<string>;
    /**
     * Number of milliseconds a token is valid after being issued to a user.
     */
    iatTtl?: pulumi.Input<number>;
    /**
     * Issuer for the OpenID Connect configuration. The issuer returned by discovery MUST exactly match the value of iss in the ID Token.
     */
    issuer: pulumi.Input<string>;
}

export interface GraphQLApiAdditionalAuthenticationProviderUserPoolConfig {
    /**
     * Regular expression for validating the incoming Amazon Cognito User Pool app client ID.
     */
    appIdClientRegex?: pulumi.Input<string>;
    /**
     * AWS region in which the user pool was created.
     */
    awsRegion?: pulumi.Input<string>;
    /**
     * User pool ID.
     */
    userPoolId: pulumi.Input<string>;
}

export interface GraphQLApiLambdaAuthorizerConfig {
    /**
     * Number of seconds a response should be cached for. The default is 5 minutes (300 seconds). The Lambda function can override this by returning a `ttlOverride` key in its response. A value of 0 disables caching of responses. Minimum value of 0. Maximum value of 3600.
     */
    authorizerResultTtlInSeconds?: pulumi.Input<number>;
    /**
     * ARN of the Lambda function to be called for authorization. Note: This Lambda function must have a resource-based policy assigned to it, to allow `lambda:InvokeFunction` from service principal `appsync.amazonaws.com`.
     */
    authorizerUri: pulumi.Input<string>;
    /**
     * Regular expression for validation of tokens before the Lambda function is called.
     */
    identityValidationExpression?: pulumi.Input<string>;
}

export interface GraphQLApiLogConfig {
    /**
     * Amazon Resource Name of the service role that AWS AppSync will assume to publish to Amazon CloudWatch logs in your account.
     */
    cloudwatchLogsRoleArn: pulumi.Input<string>;
    /**
     * Set to TRUE to exclude sections that contain information such as headers, context, and evaluated mapping templates, regardless of logging  level. Valid values: `true`, `false`. Default value: `false`
     */
    excludeVerboseContent?: pulumi.Input<boolean>;
    /**
     * Field logging level. Valid values: `ALL`, `ERROR`, `NONE`.
     */
    fieldLogLevel: pulumi.Input<string>;
}

export interface GraphQLApiOpenidConnectConfig {
    /**
     * Number of milliseconds a token is valid after being authenticated.
     */
    authTtl?: pulumi.Input<number>;
    /**
     * Client identifier of the Relying party at the OpenID identity provider. This identifier is typically obtained when the Relying party is registered with the OpenID identity provider. You can specify a regular expression so the AWS AppSync can validate against multiple client identifiers at a time.
     */
    clientId?: pulumi.Input<string>;
    /**
     * Number of milliseconds a token is valid after being issued to a user.
     */
    iatTtl?: pulumi.Input<number>;
    /**
     * Issuer for the OpenID Connect configuration. The issuer returned by discovery MUST exactly match the value of iss in the ID Token.
     */
    issuer: pulumi.Input<string>;
}

export interface GraphQLApiUserPoolConfig {
    /**
     * Regular expression for validating the incoming Amazon Cognito User Pool app client ID.
     */
    appIdClientRegex?: pulumi.Input<string>;
    /**
     * AWS region in which the user pool was created.
     */
    awsRegion?: pulumi.Input<string>;
    /**
     * Action that you want your GraphQL API to take when a request that uses Amazon Cognito User Pool authentication doesn't match the Amazon Cognito User Pool configuration. Valid: `ALLOW` and `DENY`
     */
    defaultAction: pulumi.Input<string>;
    /**
     * User pool ID.
     */
    userPoolId: pulumi.Input<string>;
}

export interface ResolverCachingConfig {
    /**
     * List of caching key.
     */
    cachingKeys?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * TTL in seconds.
     */
    ttl?: pulumi.Input<number>;
}

export interface ResolverPipelineConfig {
    /**
     * List of Function ID.
     */
    functions?: pulumi.Input<pulumi.Input<string>[]>;
}

export interface ResolverSyncConfig {
    /**
     * Conflict Detection strategy to use. Valid values are `NONE` and `VERSION`.
     */
    conflictDetection?: pulumi.Input<string>;
    /**
     * Conflict Resolution strategy to perform in the event of a conflict. Valid values are `NONE`, `OPTIMISTIC_CONCURRENCY`, `AUTOMERGE`, and `LAMBDA`.
     */
    conflictHandler?: pulumi.Input<string>;
    /**
     * Lambda Conflict Handler Config when configuring `LAMBDA` as the Conflict Handler. See Lambda Conflict Handler Config.
     */
    lambdaConflictHandlerConfig?: pulumi.Input<inputs.appsync.ResolverSyncConfigLambdaConflictHandlerConfig>;
}

export interface ResolverSyncConfigLambdaConflictHandlerConfig {
    /**
     * ARN for the Lambda function to use as the Conflict Handler.
     */
    lambdaConflictHandlerArn?: pulumi.Input<string>;
}