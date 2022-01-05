// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs, enums } from "../types";
import * as utilities from "../utilities";

/**
 * Provides an AWS Route 53 Recovery Readiness Resource Set.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.route53recoveryreadiness.ResourceSet("example", {
 *     resourceSetName: my_cw_alarm_set,
 *     resourceSetType: "AWS::CloudWatch::Alarm",
 *     resources: [{
 *         resourceArn: aws_cloudwatch_metric_alarm.example.arn,
 *     }],
 * });
 * ```
 *
 * ## Import
 *
 * Route53 Recovery Readiness resource set name can be imported via the resource set name, e.g.,
 *
 * ```sh
 *  $ pulumi import aws:route53recoveryreadiness/resourceSet:ResourceSet my-cw-alarm-set
 * ```
 */
export class ResourceSet extends pulumi.CustomResource {
    /**
     * Get an existing ResourceSet resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ResourceSetState, opts?: pulumi.CustomResourceOptions): ResourceSet {
        return new ResourceSet(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:route53recoveryreadiness/resourceSet:ResourceSet';

    /**
     * Returns true if the given object is an instance of ResourceSet.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ResourceSet {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ResourceSet.__pulumiType;
    }

    /**
     * NLB resource ARN.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * Unique name describing the resource set.
     */
    public readonly resourceSetName!: pulumi.Output<string>;
    /**
     * Type of the resources in the resource set.
     */
    public readonly resourceSetType!: pulumi.Output<string>;
    /**
     * List of resources to add to this resource set. See below.
     */
    public readonly resources!: pulumi.Output<outputs.route53recoveryreadiness.ResourceSetResource[]>;
    /**
     * Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;

    /**
     * Create a ResourceSet resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ResourceSetArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ResourceSetArgs | ResourceSetState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ResourceSetState | undefined;
            inputs["arn"] = state ? state.arn : undefined;
            inputs["resourceSetName"] = state ? state.resourceSetName : undefined;
            inputs["resourceSetType"] = state ? state.resourceSetType : undefined;
            inputs["resources"] = state ? state.resources : undefined;
            inputs["tags"] = state ? state.tags : undefined;
            inputs["tagsAll"] = state ? state.tagsAll : undefined;
        } else {
            const args = argsOrState as ResourceSetArgs | undefined;
            if ((!args || args.resourceSetName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceSetName'");
            }
            if ((!args || args.resourceSetType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceSetType'");
            }
            if ((!args || args.resources === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resources'");
            }
            inputs["resourceSetName"] = args ? args.resourceSetName : undefined;
            inputs["resourceSetType"] = args ? args.resourceSetType : undefined;
            inputs["resources"] = args ? args.resources : undefined;
            inputs["tags"] = args ? args.tags : undefined;
            inputs["arn"] = undefined /*out*/;
            inputs["tagsAll"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(ResourceSet.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ResourceSet resources.
 */
export interface ResourceSetState {
    /**
     * NLB resource ARN.
     */
    arn?: pulumi.Input<string>;
    /**
     * Unique name describing the resource set.
     */
    resourceSetName?: pulumi.Input<string>;
    /**
     * Type of the resources in the resource set.
     */
    resourceSetType?: pulumi.Input<string>;
    /**
     * List of resources to add to this resource set. See below.
     */
    resources?: pulumi.Input<pulumi.Input<inputs.route53recoveryreadiness.ResourceSetResource>[]>;
    /**
     * Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a ResourceSet resource.
 */
export interface ResourceSetArgs {
    /**
     * Unique name describing the resource set.
     */
    resourceSetName: pulumi.Input<string>;
    /**
     * Type of the resources in the resource set.
     */
    resourceSetType: pulumi.Input<string>;
    /**
     * List of resources to add to this resource set. See below.
     */
    resources: pulumi.Input<pulumi.Input<inputs.route53recoveryreadiness.ResourceSetResource>[]>;
    /**
     * Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}