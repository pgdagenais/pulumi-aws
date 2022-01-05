// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs, enums } from "../types";
import * as utilities from "../utilities";

/**
 * Provides a Sagemaker Device Fleet resource.
 *
 * ## Example Usage
 * ### Basic usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.sagemaker.DeviceFleet("example", {
 *     deviceFleetName: "example",
 *     roleArn: aws_iam_role.test.arn,
 *     outputConfig: {
 *         s3OutputLocation: `s3://${aws_s3_bucket.example.bucket}/prefix/`,
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Sagemaker Device Fleets can be imported using the `name`, e.g.,
 *
 * ```sh
 *  $ pulumi import aws:sagemaker/deviceFleet:DeviceFleet example my-fleet
 * ```
 */
export class DeviceFleet extends pulumi.CustomResource {
    /**
     * Get an existing DeviceFleet resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DeviceFleetState, opts?: pulumi.CustomResourceOptions): DeviceFleet {
        return new DeviceFleet(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:sagemaker/deviceFleet:DeviceFleet';

    /**
     * Returns true if the given object is an instance of DeviceFleet.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is DeviceFleet {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === DeviceFleet.__pulumiType;
    }

    /**
     * The Amazon Resource Name (ARN) assigned by AWS to this Device Fleet.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * A description of the fleet.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The name of the Device Fleet (must be unique).
     */
    public readonly deviceFleetName!: pulumi.Output<string>;
    /**
     * Whether to create an AWS IoT Role Alias during device fleet creation. The name of the role alias generated will match this pattern: "SageMakerEdge-{DeviceFleetName}".
     */
    public readonly enableIotRoleAlias!: pulumi.Output<boolean | undefined>;
    public /*out*/ readonly iotRoleAlias!: pulumi.Output<string>;
    /**
     * Specifies details about the repository. see Output Config details below.
     */
    public readonly outputConfig!: pulumi.Output<outputs.sagemaker.DeviceFleetOutputConfig>;
    /**
     * The Amazon Resource Name (ARN) that has access to AWS Internet of Things (IoT).
     */
    public readonly roleArn!: pulumi.Output<string>;
    /**
     * A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;

    /**
     * Create a DeviceFleet resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DeviceFleetArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DeviceFleetArgs | DeviceFleetState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DeviceFleetState | undefined;
            inputs["arn"] = state ? state.arn : undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["deviceFleetName"] = state ? state.deviceFleetName : undefined;
            inputs["enableIotRoleAlias"] = state ? state.enableIotRoleAlias : undefined;
            inputs["iotRoleAlias"] = state ? state.iotRoleAlias : undefined;
            inputs["outputConfig"] = state ? state.outputConfig : undefined;
            inputs["roleArn"] = state ? state.roleArn : undefined;
            inputs["tags"] = state ? state.tags : undefined;
            inputs["tagsAll"] = state ? state.tagsAll : undefined;
        } else {
            const args = argsOrState as DeviceFleetArgs | undefined;
            if ((!args || args.deviceFleetName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'deviceFleetName'");
            }
            if ((!args || args.outputConfig === undefined) && !opts.urn) {
                throw new Error("Missing required property 'outputConfig'");
            }
            if ((!args || args.roleArn === undefined) && !opts.urn) {
                throw new Error("Missing required property 'roleArn'");
            }
            inputs["description"] = args ? args.description : undefined;
            inputs["deviceFleetName"] = args ? args.deviceFleetName : undefined;
            inputs["enableIotRoleAlias"] = args ? args.enableIotRoleAlias : undefined;
            inputs["outputConfig"] = args ? args.outputConfig : undefined;
            inputs["roleArn"] = args ? args.roleArn : undefined;
            inputs["tags"] = args ? args.tags : undefined;
            inputs["arn"] = undefined /*out*/;
            inputs["iotRoleAlias"] = undefined /*out*/;
            inputs["tagsAll"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(DeviceFleet.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DeviceFleet resources.
 */
export interface DeviceFleetState {
    /**
     * The Amazon Resource Name (ARN) assigned by AWS to this Device Fleet.
     */
    arn?: pulumi.Input<string>;
    /**
     * A description of the fleet.
     */
    description?: pulumi.Input<string>;
    /**
     * The name of the Device Fleet (must be unique).
     */
    deviceFleetName?: pulumi.Input<string>;
    /**
     * Whether to create an AWS IoT Role Alias during device fleet creation. The name of the role alias generated will match this pattern: "SageMakerEdge-{DeviceFleetName}".
     */
    enableIotRoleAlias?: pulumi.Input<boolean>;
    iotRoleAlias?: pulumi.Input<string>;
    /**
     * Specifies details about the repository. see Output Config details below.
     */
    outputConfig?: pulumi.Input<inputs.sagemaker.DeviceFleetOutputConfig>;
    /**
     * The Amazon Resource Name (ARN) that has access to AWS Internet of Things (IoT).
     */
    roleArn?: pulumi.Input<string>;
    /**
     * A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a DeviceFleet resource.
 */
export interface DeviceFleetArgs {
    /**
     * A description of the fleet.
     */
    description?: pulumi.Input<string>;
    /**
     * The name of the Device Fleet (must be unique).
     */
    deviceFleetName: pulumi.Input<string>;
    /**
     * Whether to create an AWS IoT Role Alias during device fleet creation. The name of the role alias generated will match this pattern: "SageMakerEdge-{DeviceFleetName}".
     */
    enableIotRoleAlias?: pulumi.Input<boolean>;
    /**
     * Specifies details about the repository. see Output Config details below.
     */
    outputConfig: pulumi.Input<inputs.sagemaker.DeviceFleetOutputConfig>;
    /**
     * The Amazon Resource Name (ARN) that has access to AWS Internet of Things (IoT).
     */
    roleArn: pulumi.Input<string>;
    /**
     * A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}