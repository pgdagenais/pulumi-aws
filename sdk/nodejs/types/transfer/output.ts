// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../../types/input";
import * as outputs from "../../types/output";
import * as enums from "../../types/enums";
import * as utilities from "../../utilities";

import {RoutingRule} from "@/s3";

export interface AccessHomeDirectoryMapping {
    /**
     * Represents an entry and a target.
     */
    entry: string;
    /**
     * Represents the map target.
     */
    target: string;
}

export interface AccessPosixProfile {
    /**
     * The POSIX group ID used for all EFS operations by this user.
     */
    gid: number;
    /**
     * The secondary POSIX group IDs used for all EFS operations by this user.
     */
    secondaryGids?: number[];
    /**
     * The POSIX user ID used for all EFS operations by this user.
     */
    uid: number;
}

export interface ServerEndpointDetails {
    /**
     * A list of address allocation IDs that are required to attach an Elastic IP address to your SFTP server's endpoint. This property can only be used when `endpointType` is set to `VPC`.
     */
    addressAllocationIds?: string[];
    /**
     * A list of security groups IDs that are available to attach to your server's endpoint. If no security groups are specified, the VPC's default security groups are automatically assigned to your endpoint. This property can only be used when `endpointType` is set to `VPC`.
     */
    securityGroupIds: string[];
    /**
     * A list of subnet IDs that are required to host your SFTP server endpoint in your VPC. This property can only be used when `endpointType` is set to `VPC`.
     */
    subnetIds?: string[];
    /**
     * The ID of the VPC endpoint. This property can only be used when `endpointType` is set to `VPC_ENDPOINT`
     */
    vpcEndpointId: string;
    /**
     * The VPC ID of the virtual private cloud in which the SFTP server's endpoint will be hosted. This property can only be used when `endpointType` is set to `VPC`.
     */
    vpcId?: string;
}

export interface ServerWorkflowDetails {
    /**
     * A trigger that starts a workflow: the workflow begins to execute after a file is uploaded. See Workflow Detail below.
     */
    onUpload?: outputs.transfer.ServerWorkflowDetailsOnUpload;
}

export interface ServerWorkflowDetailsOnUpload {
    /**
     * Includes the necessary permissions for S3, EFS, and Lambda operations that Transfer can assume, so that all workflow steps can operate on the required resources.
     */
    executionRole: string;
    /**
     * A unique identifier for the workflow.
     */
    workflowId: string;
}

export interface UserHomeDirectoryMapping {
    /**
     * Represents an entry and a target.
     */
    entry: string;
    /**
     * Represents the map target.
     */
    target: string;
}

export interface UserPosixProfile {
    /**
     * The POSIX group ID used for all EFS operations by this user.
     */
    gid: number;
    /**
     * The secondary POSIX group IDs used for all EFS operations by this user.
     */
    secondaryGids?: number[];
    /**
     * The POSIX user ID used for all EFS operations by this user.
     */
    uid: number;
}

export interface WorkflowOnExceptionStep {
    /**
     * Details for a step that performs a file copy. See Copy Step Details below.
     */
    copyStepDetails?: outputs.transfer.WorkflowOnExceptionStepCopyStepDetails;
    /**
     * Details for a step that invokes a lambda function.
     */
    customStepDetails?: outputs.transfer.WorkflowOnExceptionStepCustomStepDetails;
    /**
     * Details for a step that deletes the file.
     */
    deleteStepDetails?: outputs.transfer.WorkflowOnExceptionStepDeleteStepDetails;
    /**
     * Details for a step that creates one or more tags.
     */
    tagStepDetails?: outputs.transfer.WorkflowOnExceptionStepTagStepDetails;
    /**
     * One of the following step types are supported. `COPY`, `CUSTOM`, `DELETE`, and `TAG`.
     */
    type: string;
}

export interface WorkflowOnExceptionStepCopyStepDetails {
    /**
     * Specifies the location for the file being copied. Use ${Transfer:username} in this field to parametrize the destination prefix by username.
     */
    destinationFileLocation?: outputs.transfer.WorkflowOnExceptionStepCopyStepDetailsDestinationFileLocation;
    /**
     * The name of the step, used as an identifier.
     */
    name?: string;
    /**
     * A flag that indicates whether or not to overwrite an existing file of the same name. The default is `FALSE`. Valid values are `TRUE` and `FALSE`.
     */
    overwriteExisting?: string;
    /**
     * Specifies which file to use as input to the workflow step: either the output from the previous step, or the originally uploaded file for the workflow. Enter ${previous.file} to use the previous file as the input. In this case, this workflow step uses the output file from the previous workflow step as input. This is the default value. Enter ${original.file} to use the originally-uploaded file location as input for this step.
     */
    sourceFileLocation?: string;
}

export interface WorkflowOnExceptionStepCopyStepDetailsDestinationFileLocation {
    /**
     * Specifies the details for the EFS file being copied.
     */
    efsFileLocation?: outputs.transfer.WorkflowOnExceptionStepCopyStepDetailsDestinationFileLocationEfsFileLocation;
    /**
     * Specifies the details for the S3 file being copied.
     */
    s3FileLocation?: outputs.transfer.WorkflowOnExceptionStepCopyStepDetailsDestinationFileLocationS3FileLocation;
}

export interface WorkflowOnExceptionStepCopyStepDetailsDestinationFileLocationEfsFileLocation {
    /**
     * The ID of the file system, assigned by Amazon EFS.
     */
    fileSystemId?: string;
    /**
     * The pathname for the folder being used by a workflow.
     */
    path?: string;
}

export interface WorkflowOnExceptionStepCopyStepDetailsDestinationFileLocationS3FileLocation {
    /**
     * Specifies the S3 bucket for the customer input file.
     */
    bucket?: string;
    /**
     * The name assigned to the tag that you create.
     */
    key?: string;
}

export interface WorkflowOnExceptionStepCustomStepDetails {
    /**
     * The name of the step, used as an identifier.
     */
    name?: string;
    /**
     * Specifies which file to use as input to the workflow step: either the output from the previous step, or the originally uploaded file for the workflow. Enter ${previous.file} to use the previous file as the input. In this case, this workflow step uses the output file from the previous workflow step as input. This is the default value. Enter ${original.file} to use the originally-uploaded file location as input for this step.
     */
    sourceFileLocation?: string;
    /**
     * The ARN for the lambda function that is being called.
     */
    target?: string;
    /**
     * Timeout, in seconds, for the step.
     */
    timeoutSeconds?: number;
}

export interface WorkflowOnExceptionStepDeleteStepDetails {
    /**
     * The name of the step, used as an identifier.
     */
    name?: string;
    /**
     * Specifies which file to use as input to the workflow step: either the output from the previous step, or the originally uploaded file for the workflow. Enter ${previous.file} to use the previous file as the input. In this case, this workflow step uses the output file from the previous workflow step as input. This is the default value. Enter ${original.file} to use the originally-uploaded file location as input for this step.
     */
    sourceFileLocation?: string;
}

export interface WorkflowOnExceptionStepTagStepDetails {
    /**
     * The name of the step, used as an identifier.
     */
    name?: string;
    /**
     * Specifies which file to use as input to the workflow step: either the output from the previous step, or the originally uploaded file for the workflow. Enter ${previous.file} to use the previous file as the input. In this case, this workflow step uses the output file from the previous workflow step as input. This is the default value. Enter ${original.file} to use the originally-uploaded file location as input for this step.
     */
    sourceFileLocation?: string;
    /**
     * Array that contains from 1 to 10 key/value pairs. See S3 Tags below.
     */
    tags?: outputs.transfer.WorkflowOnExceptionStepTagStepDetailsTag[];
}

export interface WorkflowOnExceptionStepTagStepDetailsTag {
    /**
     * The name assigned to the tag that you create.
     */
    key: string;
    /**
     * The value that corresponds to the key.
     */
    value: string;
}

export interface WorkflowStep {
    /**
     * Details for a step that performs a file copy. See Copy Step Details below.
     */
    copyStepDetails?: outputs.transfer.WorkflowStepCopyStepDetails;
    /**
     * Details for a step that invokes a lambda function.
     */
    customStepDetails?: outputs.transfer.WorkflowStepCustomStepDetails;
    /**
     * Details for a step that deletes the file.
     */
    deleteStepDetails?: outputs.transfer.WorkflowStepDeleteStepDetails;
    /**
     * Details for a step that creates one or more tags.
     */
    tagStepDetails?: outputs.transfer.WorkflowStepTagStepDetails;
    /**
     * One of the following step types are supported. `COPY`, `CUSTOM`, `DELETE`, and `TAG`.
     */
    type: string;
}

export interface WorkflowStepCopyStepDetails {
    /**
     * Specifies the location for the file being copied. Use ${Transfer:username} in this field to parametrize the destination prefix by username.
     */
    destinationFileLocation?: outputs.transfer.WorkflowStepCopyStepDetailsDestinationFileLocation;
    /**
     * The name of the step, used as an identifier.
     */
    name?: string;
    /**
     * A flag that indicates whether or not to overwrite an existing file of the same name. The default is `FALSE`. Valid values are `TRUE` and `FALSE`.
     */
    overwriteExisting?: string;
    /**
     * Specifies which file to use as input to the workflow step: either the output from the previous step, or the originally uploaded file for the workflow. Enter ${previous.file} to use the previous file as the input. In this case, this workflow step uses the output file from the previous workflow step as input. This is the default value. Enter ${original.file} to use the originally-uploaded file location as input for this step.
     */
    sourceFileLocation?: string;
}

export interface WorkflowStepCopyStepDetailsDestinationFileLocation {
    /**
     * Specifies the details for the EFS file being copied.
     */
    efsFileLocation?: outputs.transfer.WorkflowStepCopyStepDetailsDestinationFileLocationEfsFileLocation;
    /**
     * Specifies the details for the S3 file being copied.
     */
    s3FileLocation?: outputs.transfer.WorkflowStepCopyStepDetailsDestinationFileLocationS3FileLocation;
}

export interface WorkflowStepCopyStepDetailsDestinationFileLocationEfsFileLocation {
    /**
     * The ID of the file system, assigned by Amazon EFS.
     */
    fileSystemId?: string;
    /**
     * The pathname for the folder being used by a workflow.
     */
    path?: string;
}

export interface WorkflowStepCopyStepDetailsDestinationFileLocationS3FileLocation {
    /**
     * Specifies the S3 bucket for the customer input file.
     */
    bucket?: string;
    /**
     * The name assigned to the tag that you create.
     */
    key?: string;
}

export interface WorkflowStepCustomStepDetails {
    /**
     * The name of the step, used as an identifier.
     */
    name?: string;
    /**
     * Specifies which file to use as input to the workflow step: either the output from the previous step, or the originally uploaded file for the workflow. Enter ${previous.file} to use the previous file as the input. In this case, this workflow step uses the output file from the previous workflow step as input. This is the default value. Enter ${original.file} to use the originally-uploaded file location as input for this step.
     */
    sourceFileLocation?: string;
    /**
     * The ARN for the lambda function that is being called.
     */
    target?: string;
    /**
     * Timeout, in seconds, for the step.
     */
    timeoutSeconds?: number;
}

export interface WorkflowStepDeleteStepDetails {
    /**
     * The name of the step, used as an identifier.
     */
    name?: string;
    /**
     * Specifies which file to use as input to the workflow step: either the output from the previous step, or the originally uploaded file for the workflow. Enter ${previous.file} to use the previous file as the input. In this case, this workflow step uses the output file from the previous workflow step as input. This is the default value. Enter ${original.file} to use the originally-uploaded file location as input for this step.
     */
    sourceFileLocation?: string;
}

export interface WorkflowStepTagStepDetails {
    /**
     * The name of the step, used as an identifier.
     */
    name?: string;
    /**
     * Specifies which file to use as input to the workflow step: either the output from the previous step, or the originally uploaded file for the workflow. Enter ${previous.file} to use the previous file as the input. In this case, this workflow step uses the output file from the previous workflow step as input. This is the default value. Enter ${original.file} to use the originally-uploaded file location as input for this step.
     */
    sourceFileLocation?: string;
    /**
     * Array that contains from 1 to 10 key/value pairs. See S3 Tags below.
     */
    tags?: outputs.transfer.WorkflowStepTagStepDetailsTag[];
}

export interface WorkflowStepTagStepDetailsTag {
    /**
     * The name assigned to the tag that you create.
     */
    key: string;
    /**
     * The value that corresponds to the key.
     */
    value: string;
}
