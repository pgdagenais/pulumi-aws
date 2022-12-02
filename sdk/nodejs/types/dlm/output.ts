// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../../types/input";
import * as outputs from "../../types/output";
import * as enums from "../../types/enums";
import * as utilities from "../../utilities";

import {RoutingRule} from "@/s3";

export interface LifecyclePolicyPolicyDetails {
    /**
     * The actions to be performed when the event-based policy is triggered. You can specify only one action per policy. This parameter is required for event-based policies only. If you are creating a snapshot or AMI policy, omit this parameter. See the `action` configuration block.
     */
    action?: outputs.dlm.LifecyclePolicyPolicyDetailsAction;
    /**
     * The event that triggers the event-based policy. This parameter is required for event-based policies only. If you are creating a snapshot or AMI policy, omit this parameter. See the `eventSource` configuration block.
     */
    eventSource?: outputs.dlm.LifecyclePolicyPolicyDetailsEventSource;
    /**
     * Information about the event. See the `parameters` configuration block.
     */
    parameters?: outputs.dlm.LifecyclePolicyPolicyDetailsParameters;
    /**
     * The valid target resource types and actions a policy can manage. Specify `EBS_SNAPSHOT_MANAGEMENT` to create a lifecycle policy that manages the lifecycle of Amazon EBS snapshots. Specify `IMAGE_MANAGEMENT` to create a lifecycle policy that manages the lifecycle of EBS-backed AMIs. Specify `EVENT_BASED_POLICY` to create an event-based policy that performs specific actions when a defined event occurs in your AWS account. Default value is `EBS_SNAPSHOT_MANAGEMENT`.
     */
    policyType?: string;
    /**
     * The location of the resources to backup. If the source resources are located in an AWS Region, specify `CLOUD`. If the source resources are located on an Outpost in your account, specify `OUTPOST`. If you specify `OUTPOST`, Amazon Data Lifecycle Manager backs up all resources of the specified type with matching target tags across all of the Outposts in your account. Valid values are `CLOUD` and `OUTPOST`.
     */
    resourceLocations: string;
    /**
     * A list of resource types that should be targeted by the lifecycle policy. Valid values are `VOLUME` and `INSTANCE`.
     */
    resourceTypes?: string[];
    /**
     * See the `schedule` configuration block.
     */
    schedules?: outputs.dlm.LifecyclePolicyPolicyDetailsSchedule[];
    /**
     * A map of tag keys and their values. Any resources that match the `resourceTypes` and are tagged with _any_ of these tags will be targeted.
     */
    targetTags?: {[key: string]: string};
}

export interface LifecyclePolicyPolicyDetailsAction {
    /**
     * The rule for copying shared snapshots across Regions. See the `crossRegionCopy` configuration block.
     */
    crossRegionCopies: outputs.dlm.LifecyclePolicyPolicyDetailsActionCrossRegionCopy[];
    /**
     * A name for the schedule.
     */
    name: string;
}

export interface LifecyclePolicyPolicyDetailsActionCrossRegionCopy {
    /**
     * The encryption settings for the copied snapshot. See the `encryptionConfiguration` block. Max of 1 per action.
     */
    encryptionConfiguration: outputs.dlm.LifecyclePolicyPolicyDetailsActionCrossRegionCopyEncryptionConfiguration;
    /**
     * The retention rule that indicates how long snapshot copies are to be retained in the destination Region. See the `retainRule` block. Max of 1 per schedule.
     */
    retainRule?: outputs.dlm.LifecyclePolicyPolicyDetailsActionCrossRegionCopyRetainRule;
    /**
     * The target Region or the Amazon Resource Name (ARN) of the target Outpost for the snapshot copies.
     */
    target: string;
}

export interface LifecyclePolicyPolicyDetailsActionCrossRegionCopyEncryptionConfiguration {
    /**
     * The Amazon Resource Name (ARN) of the AWS KMS customer master key (CMK) to use for EBS encryption. If this argument is not specified, the default KMS key for the account is used.
     */
    cmkArn?: string;
    /**
     * To encrypt a copy of an unencrypted snapshot if encryption by default is not enabled, enable encryption using this parameter. Copies of encrypted snapshots are encrypted, even if this parameter is false or if encryption by default is not enabled.
     */
    encrypted?: boolean;
}

export interface LifecyclePolicyPolicyDetailsActionCrossRegionCopyRetainRule {
    /**
     * The amount of time to retain each snapshot. The maximum is 100 years. This is equivalent to 1200 months, 5200 weeks, or 36500 days.
     */
    interval: number;
    /**
     * The unit of time for time-based retention. Valid values: `DAYS`, `WEEKS`, `MONTHS`, or `YEARS`.
     */
    intervalUnit: string;
}

export interface LifecyclePolicyPolicyDetailsEventSource {
    /**
     * Information about the event. See the `parameters` configuration block.
     */
    parameters: outputs.dlm.LifecyclePolicyPolicyDetailsEventSourceParameters;
    /**
     * The source of the event. Currently only managed CloudWatch Events rules are supported. Valid values are `MANAGED_CWE`.
     */
    type: string;
}

export interface LifecyclePolicyPolicyDetailsEventSourceParameters {
    /**
     * The snapshot description that can trigger the policy. The description pattern is specified using a regular expression. The policy runs only if a snapshot with a description that matches the specified pattern is shared with your account.
     */
    descriptionRegex: string;
    /**
     * The type of event. Currently, only `shareSnapshot` events are supported.
     */
    eventType: string;
    /**
     * The IDs of the AWS accounts that can trigger policy by sharing snapshots with your account. The policy only runs if one of the specified AWS accounts shares a snapshot with your account.
     */
    snapshotOwners: string[];
}

export interface LifecyclePolicyPolicyDetailsParameters {
    /**
     * Indicates whether to exclude the root volume from snapshots created using CreateSnapshots. The default is `false`.
     */
    excludeBootVolume?: boolean;
    /**
     * Applies to AMI lifecycle policies only. Indicates whether targeted instances are rebooted when the lifecycle policy runs. `true` indicates that targeted instances are not rebooted when the policy runs. `false` indicates that target instances are rebooted when the policy runs. The default is `true` (instances are not rebooted).
     */
    noReboot?: boolean;
}

export interface LifecyclePolicyPolicyDetailsSchedule {
    /**
     * Whether to copy all user-defined tags from the source snapshot to the cross-region snapshot copy.
     */
    copyTags: boolean;
    /**
     * See the `createRule` block. Max of 1 per schedule.
     */
    createRule: outputs.dlm.LifecyclePolicyPolicyDetailsScheduleCreateRule;
    /**
     * See the `crossRegionCopyRule` block. Max of 3 per schedule.
     */
    crossRegionCopyRules?: outputs.dlm.LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRule[];
    /**
     * The AMI deprecation rule for cross-Region AMI copies created by the rule. See the `deprecateRule` block.
     */
    deprecateRule?: outputs.dlm.LifecyclePolicyPolicyDetailsScheduleDeprecateRule;
    /**
     * See the `fastRestoreRule` block. Max of 1 per schedule.
     */
    fastRestoreRule?: outputs.dlm.LifecyclePolicyPolicyDetailsScheduleFastRestoreRule;
    /**
     * A name for the schedule.
     */
    name: string;
    /**
     * The retention rule that indicates how long snapshot copies are to be retained in the destination Region. See the `retainRule` block. Max of 1 per schedule.
     */
    retainRule: outputs.dlm.LifecyclePolicyPolicyDetailsScheduleRetainRule;
    /**
     * See the `shareRule` block. Max of 1 per schedule.
     */
    shareRule?: outputs.dlm.LifecyclePolicyPolicyDetailsScheduleShareRule;
    /**
     * A map of tag keys and their values. DLM lifecycle policies will already tag the snapshot with the tags on the volume. This configuration adds extra tags on top of these.
     */
    tagsToAdd?: {[key: string]: string};
    /**
     * A map of tag keys and variable values, where the values are determined when the policy is executed. Only `$(instance-id)` or `$(timestamp)` are valid values. Can only be used when `resourceTypes` is `INSTANCE`.
     */
    variableTags?: {[key: string]: string};
}

export interface LifecyclePolicyPolicyDetailsScheduleCreateRule {
    /**
     * The schedule, as a Cron expression. The schedule interval must be between 1 hour and 1 year.
     */
    cronExpression?: string;
    /**
     * The amount of time to retain each snapshot. The maximum is 100 years. This is equivalent to 1200 months, 5200 weeks, or 36500 days.
     */
    interval?: number;
    /**
     * The unit of time for time-based retention. Valid values: `DAYS`, `WEEKS`, `MONTHS`, or `YEARS`.
     */
    intervalUnit: string;
    /**
     * Specifies the destination for snapshots created by the policy. To create snapshots in the same Region as the source resource, specify `CLOUD`. To create snapshots on the same Outpost as the source resource, specify `OUTPOST_LOCAL`. If you omit this parameter, `CLOUD` is used by default. If the policy targets resources in an AWS Region, then you must create snapshots in the same Region as the source resource. If the policy targets resources on an Outpost, then you can create snapshots on the same Outpost as the source resource, or in the Region of that Outpost. Valid values are `CLOUD` and `OUTPOST_LOCAL`.
     */
    location: string;
    /**
     * A list of times in 24 hour clock format that sets when the lifecycle policy should be evaluated. Max of 1.
     */
    times: string;
}

export interface LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRule {
    /**
     * The Amazon Resource Name (ARN) of the AWS KMS customer master key (CMK) to use for EBS encryption. If this argument is not specified, the default KMS key for the account is used.
     */
    cmkArn?: string;
    /**
     * Whether to copy all user-defined tags from the source snapshot to the cross-region snapshot copy.
     */
    copyTags?: boolean;
    /**
     * The AMI deprecation rule for cross-Region AMI copies created by the rule. See the `deprecateRule` block.
     */
    deprecateRule?: outputs.dlm.LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleDeprecateRule;
    /**
     * To encrypt a copy of an unencrypted snapshot if encryption by default is not enabled, enable encryption using this parameter. Copies of encrypted snapshots are encrypted, even if this parameter is false or if encryption by default is not enabled.
     */
    encrypted: boolean;
    /**
     * The retention rule that indicates how long snapshot copies are to be retained in the destination Region. See the `retainRule` block. Max of 1 per schedule.
     */
    retainRule?: outputs.dlm.LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleRetainRule;
    /**
     * The target Region or the Amazon Resource Name (ARN) of the target Outpost for the snapshot copies.
     */
    target: string;
}

export interface LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleDeprecateRule {
    /**
     * The amount of time to retain each snapshot. The maximum is 100 years. This is equivalent to 1200 months, 5200 weeks, or 36500 days.
     */
    interval: number;
    /**
     * The unit of time for time-based retention. Valid values: `DAYS`, `WEEKS`, `MONTHS`, or `YEARS`.
     */
    intervalUnit: string;
}

export interface LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleRetainRule {
    /**
     * The amount of time to retain each snapshot. The maximum is 100 years. This is equivalent to 1200 months, 5200 weeks, or 36500 days.
     */
    interval: number;
    /**
     * The unit of time for time-based retention. Valid values: `DAYS`, `WEEKS`, `MONTHS`, or `YEARS`.
     */
    intervalUnit: string;
}

export interface LifecyclePolicyPolicyDetailsScheduleDeprecateRule {
    /**
     * How many snapshots to keep. Must be an integer between `1` and `1000`.
     */
    count?: number;
    /**
     * The amount of time to retain each snapshot. The maximum is 100 years. This is equivalent to 1200 months, 5200 weeks, or 36500 days.
     */
    interval?: number;
    /**
     * The unit of time for time-based retention. Valid values: `DAYS`, `WEEKS`, `MONTHS`, or `YEARS`.
     */
    intervalUnit?: string;
}

export interface LifecyclePolicyPolicyDetailsScheduleFastRestoreRule {
    /**
     * The Availability Zones in which to enable fast snapshot restore.
     */
    availabilityZones: string[];
    /**
     * How many snapshots to keep. Must be an integer between `1` and `1000`.
     */
    count?: number;
    /**
     * The amount of time to retain each snapshot. The maximum is 100 years. This is equivalent to 1200 months, 5200 weeks, or 36500 days.
     */
    interval?: number;
    /**
     * The unit of time for time-based retention. Valid values: `DAYS`, `WEEKS`, `MONTHS`, or `YEARS`.
     */
    intervalUnit?: string;
}

export interface LifecyclePolicyPolicyDetailsScheduleRetainRule {
    /**
     * How many snapshots to keep. Must be an integer between `1` and `1000`.
     */
    count?: number;
    /**
     * The amount of time to retain each snapshot. The maximum is 100 years. This is equivalent to 1200 months, 5200 weeks, or 36500 days.
     */
    interval?: number;
    /**
     * The unit of time for time-based retention. Valid values: `DAYS`, `WEEKS`, `MONTHS`, or `YEARS`.
     */
    intervalUnit?: string;
}

export interface LifecyclePolicyPolicyDetailsScheduleShareRule {
    /**
     * The IDs of the AWS accounts with which to share the snapshots.
     */
    targetAccounts: string[];
    unshareInterval?: number;
    unshareIntervalUnit?: string;
}
