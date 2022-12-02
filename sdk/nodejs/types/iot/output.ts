// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../../types/input";
import * as outputs from "../../types/output";
import * as enums from "../../types/enums";
import * as utilities from "../../utilities";

import {RoutingRule} from "@/s3";

export interface IndexingConfigurationThingGroupIndexingConfiguration {
    /**
     * A list of thing group fields to index. This list cannot contain any managed fields. See below.
     */
    customFields?: outputs.iot.IndexingConfigurationThingGroupIndexingConfigurationCustomField[];
    /**
     * Contains fields that are indexed and whose types are already known by the Fleet Indexing service. See below.
     */
    managedFields: outputs.iot.IndexingConfigurationThingGroupIndexingConfigurationManagedField[];
    /**
     * Thing group indexing mode. Valid values: `OFF`, `ON`.
     */
    thingGroupIndexingMode: string;
}

export interface IndexingConfigurationThingGroupIndexingConfigurationCustomField {
    /**
     * The name of the field.
     */
    name?: string;
    /**
     * The data type of the field. Valid values: `Number`, `String`, `Boolean`.
     */
    type?: string;
}

export interface IndexingConfigurationThingGroupIndexingConfigurationManagedField {
    /**
     * The name of the field.
     */
    name?: string;
    /**
     * The data type of the field. Valid values: `Number`, `String`, `Boolean`.
     */
    type?: string;
}

export interface IndexingConfigurationThingIndexingConfiguration {
    /**
     * Contains custom field names and their data type. See below.
     */
    customFields?: outputs.iot.IndexingConfigurationThingIndexingConfigurationCustomField[];
    /**
     * Device Defender indexing mode. Valid values: `VIOLATIONS`, `OFF`. Default: `OFF`.
     */
    deviceDefenderIndexingMode?: string;
    /**
     * Contains fields that are indexed and whose types are already known by the Fleet Indexing service. See below.
     */
    managedFields: outputs.iot.IndexingConfigurationThingIndexingConfigurationManagedField[];
    /**
     * [Named shadow](https://docs.aws.amazon.com/iot/latest/developerguide/iot-device-shadows.html) indexing mode. Valid values: `ON`, `OFF`. Default: `OFF`.
     */
    namedShadowIndexingMode?: string;
    /**
     * Thing connectivity indexing mode. Valid values: `STATUS`, `OFF`. Default: `OFF`.
     */
    thingConnectivityIndexingMode?: string;
    /**
     * Thing indexing mode. Valid values: `REGISTRY`, `REGISTRY_AND_SHADOW`, `OFF`.
     */
    thingIndexingMode: string;
}

export interface IndexingConfigurationThingIndexingConfigurationCustomField {
    /**
     * The name of the field.
     */
    name?: string;
    /**
     * The data type of the field. Valid values: `Number`, `String`, `Boolean`.
     */
    type?: string;
}

export interface IndexingConfigurationThingIndexingConfigurationManagedField {
    /**
     * The name of the field.
     */
    name?: string;
    /**
     * The data type of the field. Valid values: `Number`, `String`, `Boolean`.
     */
    type?: string;
}

export interface ProvisioningTemplatePreProvisioningHook {
    /**
     * The version of the payload that was sent to the target function. The only valid (and the default) payload version is `"2020-04-01"`.
     */
    payloadVersion?: string;
    targetArn: string;
}

export interface ThingGroupMetadata {
    creationDate: string;
    /**
     * The name of the parent Thing Group.
     */
    parentGroupName: string;
    rootToParentGroups: outputs.iot.ThingGroupMetadataRootToParentGroup[];
}

export interface ThingGroupMetadataRootToParentGroup {
    groupArn: string;
    groupName: string;
}

export interface ThingGroupProperties {
    /**
     * The Thing Group attributes. Defined below.
     */
    attributePayload?: outputs.iot.ThingGroupPropertiesAttributePayload;
    /**
     * A description of the Thing Group.
     */
    description?: string;
}

export interface ThingGroupPropertiesAttributePayload {
    /**
     * Key-value map.
     */
    attributes?: {[key: string]: string};
}

export interface ThingTypeProperties {
    /**
     * The description of the thing type.
     */
    description?: string;
    /**
     * A list of searchable thing attribute names.
     */
    searchableAttributes: string[];
}

export interface TopicRuleCloudwatchAlarm {
    /**
     * The CloudWatch alarm name.
     */
    alarmName: string;
    /**
     * The IAM role ARN that allows access to the CloudWatch alarm.
     */
    roleArn: string;
    /**
     * The reason for the alarm change.
     */
    stateReason: string;
    /**
     * The value of the alarm state. Acceptable values are: OK, ALARM, INSUFFICIENT_DATA.
     */
    stateValue: string;
}

export interface TopicRuleCloudwatchLog {
    /**
     * The CloudWatch log group name.
     */
    logGroupName: string;
    /**
     * The IAM role ARN that allows access to the CloudWatch alarm.
     */
    roleArn: string;
}

export interface TopicRuleCloudwatchMetric {
    /**
     * The CloudWatch metric name.
     */
    metricName: string;
    /**
     * The CloudWatch metric namespace name.
     */
    metricNamespace: string;
    /**
     * An optional Unix timestamp (http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#about_timestamp).
     */
    metricTimestamp?: string;
    /**
     * The metric unit (supported units can be found here: http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#Unit)
     */
    metricUnit: string;
    /**
     * The CloudWatch metric value.
     */
    metricValue: string;
    /**
     * The IAM role ARN that allows access to the CloudWatch metric.
     */
    roleArn: string;
}

export interface TopicRuleDestinationVpcConfiguration {
    /**
     * The ARN of a role that has permission to create and attach to elastic network interfaces (ENIs).
     */
    roleArn: string;
    /**
     * The security groups of the VPC destination.
     */
    securityGroups?: string[];
    /**
     * The subnet IDs of the VPC destination.
     */
    subnetIds: string[];
    /**
     * The ID of the VPC.
     */
    vpcId: string;
}

export interface TopicRuleDynamodb {
    /**
     * The hash key name.
     */
    hashKeyField: string;
    /**
     * The hash key type. Valid values are "STRING" or "NUMBER".
     */
    hashKeyType?: string;
    /**
     * The hash key value.
     */
    hashKeyValue: string;
    /**
     * The operation. Valid values are "INSERT", "UPDATE", or "DELETE".
     */
    operation?: string;
    /**
     * The action payload.
     */
    payloadField?: string;
    /**
     * The range key name.
     */
    rangeKeyField?: string;
    /**
     * The range key type. Valid values are "STRING" or "NUMBER".
     */
    rangeKeyType?: string;
    /**
     * The range key value.
     */
    rangeKeyValue?: string;
    /**
     * The ARN of the IAM role that grants access to the DynamoDB table.
     */
    roleArn: string;
    /**
     * The name of the DynamoDB table.
     */
    tableName: string;
}

export interface TopicRuleDynamodbv2 {
    /**
     * Configuration block with DynamoDB Table to which the message will be written. Nested arguments below.
     */
    putItem?: outputs.iot.TopicRuleDynamodbv2PutItem;
    /**
     * The IAM role ARN that allows access to the CloudWatch alarm.
     */
    roleArn: string;
}

export interface TopicRuleDynamodbv2PutItem {
    /**
     * The name of the DynamoDB table.
     */
    tableName: string;
}

export interface TopicRuleElasticsearch {
    /**
     * The endpoint of your Elasticsearch domain.
     */
    endpoint: string;
    /**
     * The unique identifier for the document you are storing.
     */
    id: string;
    /**
     * The Elasticsearch index where you want to store your data.
     */
    index: string;
    /**
     * The IAM role ARN that has access to Elasticsearch.
     */
    roleArn: string;
    /**
     * The type of document you are storing.
     */
    type: string;
}

export interface TopicRuleErrorAction {
    cloudwatchAlarm?: outputs.iot.TopicRuleErrorActionCloudwatchAlarm;
    cloudwatchLogs?: outputs.iot.TopicRuleErrorActionCloudwatchLogs;
    cloudwatchMetric?: outputs.iot.TopicRuleErrorActionCloudwatchMetric;
    dynamodb?: outputs.iot.TopicRuleErrorActionDynamodb;
    dynamodbv2?: outputs.iot.TopicRuleErrorActionDynamodbv2;
    elasticsearch?: outputs.iot.TopicRuleErrorActionElasticsearch;
    firehose?: outputs.iot.TopicRuleErrorActionFirehose;
    http?: outputs.iot.TopicRuleErrorActionHttp;
    iotAnalytics?: outputs.iot.TopicRuleErrorActionIotAnalytics;
    iotEvents?: outputs.iot.TopicRuleErrorActionIotEvents;
    kafka?: outputs.iot.TopicRuleErrorActionKafka;
    kinesis?: outputs.iot.TopicRuleErrorActionKinesis;
    lambda?: outputs.iot.TopicRuleErrorActionLambda;
    republish?: outputs.iot.TopicRuleErrorActionRepublish;
    s3?: outputs.iot.TopicRuleErrorActionS3;
    sns?: outputs.iot.TopicRuleErrorActionSns;
    sqs?: outputs.iot.TopicRuleErrorActionSqs;
    stepFunctions?: outputs.iot.TopicRuleErrorActionStepFunctions;
    timestream?: outputs.iot.TopicRuleErrorActionTimestream;
}

export interface TopicRuleErrorActionCloudwatchAlarm {
    /**
     * The CloudWatch alarm name.
     */
    alarmName: string;
    /**
     * The IAM role ARN that allows access to the CloudWatch alarm.
     */
    roleArn: string;
    /**
     * The reason for the alarm change.
     */
    stateReason: string;
    /**
     * The value of the alarm state. Acceptable values are: OK, ALARM, INSUFFICIENT_DATA.
     */
    stateValue: string;
}

export interface TopicRuleErrorActionCloudwatchLogs {
    /**
     * The CloudWatch log group name.
     */
    logGroupName: string;
    /**
     * The IAM role ARN that allows access to the CloudWatch alarm.
     */
    roleArn: string;
}

export interface TopicRuleErrorActionCloudwatchMetric {
    /**
     * The CloudWatch metric name.
     */
    metricName: string;
    /**
     * The CloudWatch metric namespace name.
     */
    metricNamespace: string;
    /**
     * An optional Unix timestamp (http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#about_timestamp).
     */
    metricTimestamp?: string;
    /**
     * The metric unit (supported units can be found here: http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#Unit)
     */
    metricUnit: string;
    /**
     * The CloudWatch metric value.
     */
    metricValue: string;
    /**
     * The IAM role ARN that allows access to the CloudWatch metric.
     */
    roleArn: string;
}

export interface TopicRuleErrorActionDynamodb {
    /**
     * The hash key name.
     */
    hashKeyField: string;
    /**
     * The hash key type. Valid values are "STRING" or "NUMBER".
     */
    hashKeyType?: string;
    /**
     * The hash key value.
     */
    hashKeyValue: string;
    /**
     * The operation. Valid values are "INSERT", "UPDATE", or "DELETE".
     */
    operation?: string;
    /**
     * The action payload.
     */
    payloadField?: string;
    /**
     * The range key name.
     */
    rangeKeyField?: string;
    /**
     * The range key type. Valid values are "STRING" or "NUMBER".
     */
    rangeKeyType?: string;
    /**
     * The range key value.
     */
    rangeKeyValue?: string;
    /**
     * The ARN of the IAM role that grants access to the DynamoDB table.
     */
    roleArn: string;
    /**
     * The name of the DynamoDB table.
     */
    tableName: string;
}

export interface TopicRuleErrorActionDynamodbv2 {
    /**
     * Configuration block with DynamoDB Table to which the message will be written. Nested arguments below.
     */
    putItem?: outputs.iot.TopicRuleErrorActionDynamodbv2PutItem;
    /**
     * The IAM role ARN that allows access to the CloudWatch alarm.
     */
    roleArn: string;
}

export interface TopicRuleErrorActionDynamodbv2PutItem {
    /**
     * The name of the DynamoDB table.
     */
    tableName: string;
}

export interface TopicRuleErrorActionElasticsearch {
    /**
     * The endpoint of your Elasticsearch domain.
     */
    endpoint: string;
    /**
     * The unique identifier for the document you are storing.
     */
    id: string;
    /**
     * The Elasticsearch index where you want to store your data.
     */
    index: string;
    /**
     * The IAM role ARN that has access to Elasticsearch.
     */
    roleArn: string;
    /**
     * The type of document you are storing.
     */
    type: string;
}

export interface TopicRuleErrorActionFirehose {
    /**
     * The delivery stream name.
     */
    deliveryStreamName: string;
    /**
     * The IAM role ARN that grants access to the Amazon Kinesis Firehose stream.
     */
    roleArn: string;
    /**
     * A character separator that is used to separate records written to the Firehose stream. Valid values are: '\n' (newline), '\t' (tab), '\r\n' (Windows newline), ',' (comma).
     */
    separator?: string;
}

export interface TopicRuleErrorActionHttp {
    /**
     * The HTTPS URL used to verify ownership of `url`.
     */
    confirmationUrl?: string;
    /**
     * Custom HTTP header IoT Core should send. It is possible to define more than one custom header.
     */
    httpHeaders?: outputs.iot.TopicRuleErrorActionHttpHttpHeader[];
    /**
     * The HTTPS URL.
     */
    url: string;
}

export interface TopicRuleErrorActionHttpHttpHeader {
    /**
     * The name of the HTTP header.
     */
    key: string;
    /**
     * The value of the HTTP header.
     */
    value: string;
}

export interface TopicRuleErrorActionIotAnalytics {
    /**
     * Name of AWS IOT Analytics channel.
     */
    channelName: string;
    /**
     * The ARN of the IAM role that grants access.
     */
    roleArn: string;
}

export interface TopicRuleErrorActionIotEvents {
    /**
     * The name of the AWS IoT Events input.
     */
    inputName: string;
    /**
     * Use this to ensure that only one input (message) with a given messageId is processed by an AWS IoT Events detector.
     */
    messageId?: string;
    /**
     * The ARN of the IAM role that grants access.
     */
    roleArn: string;
}

export interface TopicRuleErrorActionKafka {
    /**
     * Properties of the Apache Kafka producer client. For more info, see the [AWS documentation](https://docs.aws.amazon.com/iot/latest/developerguide/apache-kafka-rule-action.html).
     */
    clientProperties: {[key: string]: string};
    /**
     * The ARN of Kafka action's VPC `aws.iot.TopicRuleDestination` .
     */
    destinationArn: string;
    /**
     * The Kafka message key.
     */
    key?: string;
    /**
     * The Kafka message partition.
     */
    partition?: string;
    /**
     * The Kafka topic for messages to be sent to the Kafka broker.
     */
    topic: string;
}

export interface TopicRuleErrorActionKinesis {
    /**
     * The partition key.
     */
    partitionKey?: string;
    /**
     * The ARN of the IAM role that grants access to the Amazon Kinesis stream.
     */
    roleArn: string;
    /**
     * The name of the Amazon Kinesis stream.
     */
    streamName: string;
}

export interface TopicRuleErrorActionLambda {
    /**
     * The ARN of the Lambda function.
     */
    functionArn: string;
}

export interface TopicRuleErrorActionRepublish {
    /**
     * The Quality of Service (QoS) level to use when republishing messages. Valid values are 0 or 1. The default value is 0.
     */
    qos?: number;
    /**
     * The ARN of the IAM role that grants access.
     */
    roleArn: string;
    /**
     * The name of the MQTT topic the message should be republished to.
     */
    topic: string;
}

export interface TopicRuleErrorActionS3 {
    /**
     * The Amazon S3 bucket name.
     */
    bucketName: string;
    /**
     * The Amazon S3 canned ACL that controls access to the object identified by the object key. [Valid values](https://docs.aws.amazon.com/AmazonS3/latest/userguide/acl-overview.html#canned-acl).
     */
    cannedAcl?: string;
    /**
     * The name of the HTTP header.
     */
    key: string;
    /**
     * The IAM role ARN that allows access to the CloudWatch alarm.
     */
    roleArn: string;
}

export interface TopicRuleErrorActionSns {
    /**
     * The message format of the message to publish. Accepted values are "JSON" and "RAW".
     */
    messageFormat?: string;
    /**
     * The ARN of the IAM role that grants access.
     */
    roleArn: string;
    /**
     * The ARN of the SNS topic.
     */
    targetArn: string;
}

export interface TopicRuleErrorActionSqs {
    /**
     * The URL of the Amazon SQS queue.
     */
    queueUrl: string;
    /**
     * The ARN of the IAM role that grants access.
     */
    roleArn: string;
    /**
     * Specifies whether to use Base64 encoding.
     */
    useBase64: boolean;
}

export interface TopicRuleErrorActionStepFunctions {
    /**
     * The prefix used to generate, along with a UUID, the unique state machine execution name.
     */
    executionNamePrefix?: string;
    /**
     * The ARN of the IAM role that grants access to start execution of the state machine.
     */
    roleArn: string;
    /**
     * The name of the Step Functions state machine whose execution will be started.
     */
    stateMachineName: string;
}

export interface TopicRuleErrorActionTimestream {
    /**
     * The name of an Amazon Timestream database.
     */
    databaseName: string;
    /**
     * Configuration blocks with metadata attributes of the time series that are written in each measure record. Nested arguments below.
     */
    dimensions: outputs.iot.TopicRuleErrorActionTimestreamDimension[];
    /**
     * The ARN of the role that grants permission to write to the Amazon Timestream database table.
     */
    roleArn: string;
    /**
     * The name of the database table into which to write the measure records.
     */
    tableName: string;
    /**
     * Configuration block specifying an application-defined value to replace the default value assigned to the Timestream record's timestamp in the time column. Nested arguments below.
     */
    timestamp?: outputs.iot.TopicRuleErrorActionTimestreamTimestamp;
}

export interface TopicRuleErrorActionTimestreamDimension {
    /**
     * The name of the rule.
     */
    name: string;
    /**
     * The value of the HTTP header.
     */
    value: string;
}

export interface TopicRuleErrorActionTimestreamTimestamp {
    /**
     * The precision of the timestamp value that results from the expression described in value. Valid values: `SECONDS`, `MILLISECONDS`, `MICROSECONDS`, `NANOSECONDS`.
     */
    unit: string;
    /**
     * The value of the HTTP header.
     */
    value: string;
}

export interface TopicRuleFirehose {
    /**
     * The delivery stream name.
     */
    deliveryStreamName: string;
    /**
     * The IAM role ARN that grants access to the Amazon Kinesis Firehose stream.
     */
    roleArn: string;
    /**
     * A character separator that is used to separate records written to the Firehose stream. Valid values are: '\n' (newline), '\t' (tab), '\r\n' (Windows newline), ',' (comma).
     */
    separator?: string;
}

export interface TopicRuleHttp {
    /**
     * The HTTPS URL used to verify ownership of `url`.
     */
    confirmationUrl?: string;
    /**
     * Custom HTTP header IoT Core should send. It is possible to define more than one custom header.
     */
    httpHeaders?: outputs.iot.TopicRuleHttpHttpHeader[];
    /**
     * The HTTPS URL.
     */
    url: string;
}

export interface TopicRuleHttpHttpHeader {
    /**
     * The name of the HTTP header.
     */
    key: string;
    /**
     * The value of the HTTP header.
     */
    value: string;
}

export interface TopicRuleIotAnalytic {
    /**
     * Name of AWS IOT Analytics channel.
     */
    channelName: string;
    /**
     * The ARN of the IAM role that grants access.
     */
    roleArn: string;
}

export interface TopicRuleIotEvent {
    /**
     * The name of the AWS IoT Events input.
     */
    inputName: string;
    /**
     * Use this to ensure that only one input (message) with a given messageId is processed by an AWS IoT Events detector.
     */
    messageId?: string;
    /**
     * The ARN of the IAM role that grants access.
     */
    roleArn: string;
}

export interface TopicRuleKafka {
    /**
     * Properties of the Apache Kafka producer client. For more info, see the [AWS documentation](https://docs.aws.amazon.com/iot/latest/developerguide/apache-kafka-rule-action.html).
     */
    clientProperties: {[key: string]: string};
    /**
     * The ARN of Kafka action's VPC `aws.iot.TopicRuleDestination` .
     */
    destinationArn: string;
    /**
     * The Kafka message key.
     */
    key?: string;
    /**
     * The Kafka message partition.
     */
    partition?: string;
    /**
     * The Kafka topic for messages to be sent to the Kafka broker.
     */
    topic: string;
}

export interface TopicRuleKinesis {
    /**
     * The partition key.
     */
    partitionKey?: string;
    /**
     * The ARN of the IAM role that grants access to the Amazon Kinesis stream.
     */
    roleArn: string;
    /**
     * The name of the Amazon Kinesis stream.
     */
    streamName: string;
}

export interface TopicRuleLambda {
    /**
     * The ARN of the Lambda function.
     */
    functionArn: string;
}

export interface TopicRuleRepublish {
    /**
     * The Quality of Service (QoS) level to use when republishing messages. Valid values are 0 or 1. The default value is 0.
     */
    qos?: number;
    /**
     * The ARN of the IAM role that grants access.
     */
    roleArn: string;
    /**
     * The name of the MQTT topic the message should be republished to.
     */
    topic: string;
}

export interface TopicRuleS3 {
    /**
     * The Amazon S3 bucket name.
     */
    bucketName: string;
    /**
     * The Amazon S3 canned ACL that controls access to the object identified by the object key. [Valid values](https://docs.aws.amazon.com/AmazonS3/latest/userguide/acl-overview.html#canned-acl).
     */
    cannedAcl?: string;
    /**
     * The name of the HTTP header.
     */
    key: string;
    /**
     * The IAM role ARN that allows access to the CloudWatch alarm.
     */
    roleArn: string;
}

export interface TopicRuleSns {
    /**
     * The message format of the message to publish. Accepted values are "JSON" and "RAW".
     */
    messageFormat?: string;
    /**
     * The ARN of the IAM role that grants access.
     */
    roleArn: string;
    /**
     * The ARN of the SNS topic.
     */
    targetArn: string;
}

export interface TopicRuleSqs {
    /**
     * The URL of the Amazon SQS queue.
     */
    queueUrl: string;
    /**
     * The ARN of the IAM role that grants access.
     */
    roleArn: string;
    /**
     * Specifies whether to use Base64 encoding.
     */
    useBase64: boolean;
}

export interface TopicRuleStepFunction {
    /**
     * The prefix used to generate, along with a UUID, the unique state machine execution name.
     */
    executionNamePrefix?: string;
    /**
     * The ARN of the IAM role that grants access to start execution of the state machine.
     */
    roleArn: string;
    /**
     * The name of the Step Functions state machine whose execution will be started.
     */
    stateMachineName: string;
}

export interface TopicRuleTimestream {
    /**
     * The name of an Amazon Timestream database.
     */
    databaseName: string;
    /**
     * Configuration blocks with metadata attributes of the time series that are written in each measure record. Nested arguments below.
     */
    dimensions: outputs.iot.TopicRuleTimestreamDimension[];
    /**
     * The ARN of the role that grants permission to write to the Amazon Timestream database table.
     */
    roleArn: string;
    /**
     * The name of the database table into which to write the measure records.
     */
    tableName: string;
    /**
     * Configuration block specifying an application-defined value to replace the default value assigned to the Timestream record's timestamp in the time column. Nested arguments below.
     */
    timestamp?: outputs.iot.TopicRuleTimestreamTimestamp;
}

export interface TopicRuleTimestreamDimension {
    /**
     * The name of the rule.
     */
    name: string;
    /**
     * The value of the HTTP header.
     */
    value: string;
}

export interface TopicRuleTimestreamTimestamp {
    /**
     * The precision of the timestamp value that results from the expression described in value. Valid values: `SECONDS`, `MILLISECONDS`, `MICROSECONDS`, `NANOSECONDS`.
     */
    unit: string;
    /**
     * The value of the HTTP header.
     */
    value: string;
}
