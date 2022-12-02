// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../../types/input";
import * as outputs from "../../types/output";
import * as enums from "../../types/enums";
import * as utilities from "../../utilities";

import {RoutingRule} from "@/s3";

export interface DirectorySelfServicePermissions {
    /**
     * Whether WorkSpaces directory users can change the compute type (bundle) for their workspace. Default `false`.
     */
    changeComputeType?: boolean;
    /**
     * Whether WorkSpaces directory users can increase the volume size of the drives on their workspace. Default `false`.
     */
    increaseVolumeSize?: boolean;
    /**
     * Whether WorkSpaces directory users can rebuild the operating system of a workspace to its original state. Default `false`.
     */
    rebuildWorkspace?: boolean;
    /**
     * Whether WorkSpaces directory users can restart their workspace. Default `true`.
     */
    restartWorkspace?: boolean;
    /**
     * Whether WorkSpaces directory users can switch the running mode of their workspace. Default `false`.
     */
    switchRunningMode?: boolean;
}

export interface DirectoryWorkspaceAccessProperties {
    /**
     * Indicates whether users can use Android devices to access their WorkSpaces.
     */
    deviceTypeAndroid?: string;
    /**
     * Indicates whether users can use Chromebooks to access their WorkSpaces.
     */
    deviceTypeChromeos?: string;
    /**
     * Indicates whether users can use iOS devices to access their WorkSpaces.
     */
    deviceTypeIos?: string;
    /**
     * Indicates whether users can use Linux clients to access their WorkSpaces.
     */
    deviceTypeLinux?: string;
    /**
     * Indicates whether users can use macOS clients to access their WorkSpaces.
     */
    deviceTypeOsx?: string;
    /**
     * Indicates whether users can access their WorkSpaces through a web browser.
     */
    deviceTypeWeb?: string;
    /**
     * Indicates whether users can use Windows clients to access their WorkSpaces.
     */
    deviceTypeWindows?: string;
    /**
     * Indicates whether users can use zero client devices to access their WorkSpaces.
     */
    deviceTypeZeroclient?: string;
}

export interface DirectoryWorkspaceCreationProperties {
    /**
     * The identifier of your custom security group. Should relate to the same VPC, where workspaces reside in.
     */
    customSecurityGroupId?: string;
    /**
     * The default organizational unit (OU) for your WorkSpace directories. Should conform `"OU=<value>,DC=<value>,...,DC=<value>"` pattern.
     */
    defaultOu?: string;
    /**
     * Indicates whether internet access is enabled for your WorkSpaces.
     */
    enableInternetAccess?: boolean;
    /**
     * Indicates whether maintenance mode is enabled for your WorkSpaces. For more information, see [WorkSpace Maintenance](https://docs.aws.amazon.com/workspaces/latest/adminguide/workspace-maintenance.html)..
     */
    enableMaintenanceMode?: boolean;
    /**
     * Indicates whether users are local administrators of their WorkSpaces.
     */
    userEnabledAsLocalAdministrator?: boolean;
}

export interface GetBundleComputeType {
    /**
     * Name of the bundle. You cannot combine this parameter with `bundleId`.
     */
    name: string;
}

export interface GetBundleRootStorage {
    /**
     * Size of the user storage.
     */
    capacity: string;
}

export interface GetBundleUserStorage {
    /**
     * Size of the user storage.
     */
    capacity: string;
}

export interface GetDirectorySelfServicePermission {
    /**
     * Whether WorkSpaces directory users can change the compute type (bundle) for their workspace.
     */
    changeComputeType: boolean;
    /**
     * Whether WorkSpaces directory users can increase the volume size of the drives on their workspace.
     */
    increaseVolumeSize: boolean;
    /**
     * Whether WorkSpaces directory users can rebuild the operating system of a workspace to its original state.
     */
    rebuildWorkspace: boolean;
    /**
     * Whether WorkSpaces directory users can restart their workspace.
     */
    restartWorkspace: boolean;
    /**
     * Whether WorkSpaces directory users can switch the running mode of their workspace.
     */
    switchRunningMode: boolean;
}

export interface GetDirectoryWorkspaceAccessProperty {
    /**
     * (Optional) Indicates whether users can use Android devices to access their WorkSpaces.
     */
    deviceTypeAndroid: string;
    /**
     * (Optional) Indicates whether users can use Chromebooks to access their WorkSpaces.
     */
    deviceTypeChromeos: string;
    /**
     * (Optional) Indicates whether users can use iOS devices to access their WorkSpaces.
     */
    deviceTypeIos: string;
    /**
     * (Optional) Indicates whether users can use Linux clients to access their WorkSpaces.
     */
    deviceTypeLinux: string;
    /**
     * (Optional) Indicates whether users can use macOS clients to access their WorkSpaces.
     */
    deviceTypeOsx: string;
    /**
     * (Optional) Indicates whether users can access their WorkSpaces through a web browser.
     */
    deviceTypeWeb: string;
    /**
     * (Optional) Indicates whether users can use Windows clients to access their WorkSpaces.
     */
    deviceTypeWindows: string;
    /**
     * (Optional) Indicates whether users can use zero client devices to access their WorkSpaces.
     */
    deviceTypeZeroclient: string;
}

export interface GetDirectoryWorkspaceCreationProperty {
    /**
     * The identifier of your custom security group. Should relate to the same VPC, where workspaces reside in.
     */
    customSecurityGroupId: string;
    /**
     * The default organizational unit (OU) for your WorkSpace directories.
     */
    defaultOu: string;
    /**
     * Indicates whether internet access is enabled for your WorkSpaces.
     */
    enableInternetAccess: boolean;
    /**
     * Indicates whether maintenance mode is enabled for your WorkSpaces. For more information, see [WorkSpace Maintenance](https://docs.aws.amazon.com/workspaces/latest/adminguide/workspace-maintenance.html).
     */
    enableMaintenanceMode: boolean;
    /**
     * Indicates whether users are local administrators of their WorkSpaces.
     */
    userEnabledAsLocalAdministrator: boolean;
}

export interface GetWorkspaceWorkspaceProperty {
    /**
     * Compute type. For more information, see [Amazon WorkSpaces Bundles](http://aws.amazon.com/workspaces/details/#Amazon_WorkSpaces_Bundles). Valid values are `VALUE`, `STANDARD`, `PERFORMANCE`, `POWER`, `GRAPHICS`, `POWERPRO` and `GRAPHICSPRO`.
     */
    computeTypeName: string;
    /**
     * Size of the root volume.
     */
    rootVolumeSizeGib: number;
    /**
     * Running mode. For more information, see [Manage the WorkSpace Running Mode](https://docs.aws.amazon.com/workspaces/latest/adminguide/running-mode.html). Valid values are `AUTO_STOP` and `ALWAYS_ON`.
     */
    runningMode: string;
    /**
     * Time after a user logs off when WorkSpaces are automatically stopped. Configured in 60-minute intervals.
     */
    runningModeAutoStopTimeoutInMinutes: number;
    /**
     * Size of the user storage.
     */
    userVolumeSizeGib: number;
}

export interface IpGroupRule {
    /**
     * The description.
     */
    description?: string;
    /**
     * The IP address range, in CIDR notation, e.g., `10.0.0.0/16`
     */
    source: string;
}

export interface WorkspaceWorkspaceProperties {
    /**
     * The compute type. For more information, see [Amazon WorkSpaces Bundles](http://aws.amazon.com/workspaces/details/#Amazon_WorkSpaces_Bundles). Valid values are `VALUE`, `STANDARD`, `PERFORMANCE`, `POWER`, `GRAPHICS`, `POWERPRO`, `GRAPHICSPRO`, `GRAPHICS_G4DN`, and `GRAPHICSPRO_G4DN`.
     */
    computeTypeName?: string;
    /**
     * The size of the root volume.
     */
    rootVolumeSizeGib?: number;
    /**
     * The running mode. For more information, see [Manage the WorkSpace Running Mode](https://docs.aws.amazon.com/workspaces/latest/adminguide/running-mode.html). Valid values are `AUTO_STOP` and `ALWAYS_ON`.
     */
    runningMode?: string;
    /**
     * The time after a user logs off when WorkSpaces are automatically stopped. Configured in 60-minute intervals.
     */
    runningModeAutoStopTimeoutInMinutes: number;
    /**
     * The size of the user storage.
     */
    userVolumeSizeGib?: number;
}
