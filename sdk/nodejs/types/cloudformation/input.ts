// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../../types/input";
import * as outputs from "../../types/output";
import * as enums from "../../types/enums";
import * as utilities from "../../utilities";

import {RoutingRule} from "@/s3";

export interface CloudFormationTypeLoggingConfig {
    /**
     * Name of the CloudWatch Log Group where CloudFormation sends error logging information when invoking the type's handlers.
     */
    logGroupName: pulumi.Input<string>;
    /**
     * Amazon Resource Name (ARN) of the IAM Role CloudFormation assumes when sending error logging information to CloudWatch Logs.
     */
    logRoleArn: pulumi.Input<string>;
}

export interface StackSetAutoDeployment {
    /**
     * Whether or not auto-deployment is enabled.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Whether or not to retain stacks when the account is removed.
     */
    retainStacksOnAccountRemoval?: pulumi.Input<boolean>;
}

export interface StackSetInstanceDeploymentTargets {
    /**
     * The organization root ID or organizational unit (OU) IDs to which StackSets deploys.
     */
    organizationalUnitIds?: pulumi.Input<pulumi.Input<string>[]>;
}

export interface StackSetInstanceOperationPreferences {
    /**
     * The number of accounts, per Region, for which this operation can fail before AWS CloudFormation stops the operation in that Region.
     */
    failureToleranceCount?: pulumi.Input<number>;
    /**
     * The percentage of accounts, per Region, for which this stack operation can fail before AWS CloudFormation stops the operation in that Region.
     */
    failureTolerancePercentage?: pulumi.Input<number>;
    /**
     * The maximum number of accounts in which to perform this operation at one time.
     */
    maxConcurrentCount?: pulumi.Input<number>;
    /**
     * The maximum percentage of accounts in which to perform this operation at one time.
     */
    maxConcurrentPercentage?: pulumi.Input<number>;
    /**
     * The concurrency type of deploying StackSets operations in Regions, could be in parallel or one Region at a time. Valid values are `SEQUENTIAL` and `PARALLEL`.
     */
    regionConcurrencyType?: pulumi.Input<string>;
    /**
     * The order of the Regions in where you want to perform the stack operation.
     */
    regionOrders?: pulumi.Input<pulumi.Input<string>[]>;
}

export interface StackSetOperationPreferences {
    /**
     * The number of accounts, per Region, for which this operation can fail before AWS CloudFormation stops the operation in that Region.
     */
    failureToleranceCount?: pulumi.Input<number>;
    /**
     * The percentage of accounts, per Region, for which this stack operation can fail before AWS CloudFormation stops the operation in that Region.
     */
    failureTolerancePercentage?: pulumi.Input<number>;
    /**
     * The maximum number of accounts in which to perform this operation at one time.
     */
    maxConcurrentCount?: pulumi.Input<number>;
    /**
     * The maximum percentage of accounts in which to perform this operation at one time.
     */
    maxConcurrentPercentage?: pulumi.Input<number>;
    /**
     * The concurrency type of deploying StackSets operations in Regions, could be in parallel or one Region at a time.
     */
    regionConcurrencyType?: pulumi.Input<string>;
    /**
     * The order of the Regions in where you want to perform the stack operation.
     */
    regionOrders?: pulumi.Input<pulumi.Input<string>[]>;
}