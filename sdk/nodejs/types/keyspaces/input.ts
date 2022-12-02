// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../../types/input";
import * as outputs from "../../types/output";
import * as enums from "../../types/enums";
import * as utilities from "../../utilities";

import {RoutingRule} from "@/s3";

export interface TableCapacitySpecification {
    /**
     * The throughput capacity specified for read operations defined in read capacity units (RCUs).
     */
    readCapacityUnits?: pulumi.Input<number>;
    /**
     * The read/write throughput capacity mode for a table. Valid values: `PAY_PER_REQUEST`, `PROVISIONED`. The default value is `PAY_PER_REQUEST`.
     */
    throughputMode?: pulumi.Input<string>;
    /**
     * The throughput capacity specified for write operations defined in write capacity units (WCUs).
     */
    writeCapacityUnits?: pulumi.Input<number>;
}

export interface TableComment {
    /**
     * A description of the table.
     */
    message?: pulumi.Input<string>;
}

export interface TableEncryptionSpecification {
    /**
     * The Amazon Resource Name (ARN) of the customer managed KMS key.
     */
    kmsKeyIdentifier?: pulumi.Input<string>;
    /**
     * The encryption option specified for the table. Valid values: `AWS_OWNED_KMS_KEY`, `CUSTOMER_MANAGED_KMS_KEY`. The default value is `AWS_OWNED_KMS_KEY`.
     */
    type?: pulumi.Input<string>;
}

export interface TablePointInTimeRecovery {
    /**
     * Valid values: `ENABLED`, `DISABLED`. The default value is `DISABLED`.
     */
    status?: pulumi.Input<string>;
}

export interface TableSchemaDefinition {
    /**
     * The columns that are part of the clustering key of the table.
     */
    clusteringKeys?: pulumi.Input<pulumi.Input<inputs.keyspaces.TableSchemaDefinitionClusteringKey>[]>;
    /**
     * The regular columns of the table.
     */
    columns: pulumi.Input<pulumi.Input<inputs.keyspaces.TableSchemaDefinitionColumn>[]>;
    /**
     * The columns that are part of the partition key of the table .
     */
    partitionKeys: pulumi.Input<pulumi.Input<inputs.keyspaces.TableSchemaDefinitionPartitionKey>[]>;
    /**
     * The columns that have been defined as `STATIC`. Static columns store values that are shared by all rows in the same partition.
     */
    staticColumns?: pulumi.Input<pulumi.Input<inputs.keyspaces.TableSchemaDefinitionStaticColumn>[]>;
}

export interface TableSchemaDefinitionClusteringKey {
    /**
     * The name of the clustering key column.
     */
    name: pulumi.Input<string>;
    /**
     * The order modifier. Valid values: `ASC`, `DESC`.
     */
    orderBy: pulumi.Input<string>;
}

export interface TableSchemaDefinitionColumn {
    /**
     * The name of the column.
     */
    name: pulumi.Input<string>;
    /**
     * The data type of the column. See the [Developer Guide](https://docs.aws.amazon.com/keyspaces/latest/devguide/cql.elements.html#cql.data-types) for a list of available data types.
     */
    type: pulumi.Input<string>;
}

export interface TableSchemaDefinitionPartitionKey {
    /**
     * The name of the partition key column.
     */
    name: pulumi.Input<string>;
}

export interface TableSchemaDefinitionStaticColumn {
    /**
     * The name of the static column.
     */
    name: pulumi.Input<string>;
}

export interface TableTtl {
    /**
     * Valid values: `ENABLED`.
     */
    status: pulumi.Input<string>;
}