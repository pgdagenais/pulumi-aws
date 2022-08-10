// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs, enums } from "../types";
import * as utilities from "../utilities";

/**
 * Retrieve information about an EMR Containers (EMR on EKS) Virtual Cluster.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.emrcontainers.getVirtualCluster({
 *     virtualClusterId: "example id",
 * });
 * export const name = example.then(example => example.name);
 * export const arn = example.then(example => example.arn);
 * ```
 */
export function getVirtualCluster(args: GetVirtualClusterArgs, opts?: pulumi.InvokeOptions): Promise<GetVirtualClusterResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("aws:emrcontainers/getVirtualCluster:getVirtualCluster", {
        "tags": args.tags,
        "virtualClusterId": args.virtualClusterId,
    }, opts);
}

/**
 * A collection of arguments for invoking getVirtualCluster.
 */
export interface GetVirtualClusterArgs {
    /**
     * Key-value mapping of resource tags.
     */
    tags?: {[key: string]: string};
    /**
     * The ID of the cluster.
     */
    virtualClusterId: string;
}

/**
 * A collection of values returned by getVirtualCluster.
 */
export interface GetVirtualClusterResult {
    /**
     * The Amazon Resource Name (ARN) of the cluster.
     */
    readonly arn: string;
    /**
     * Nested attribute containing information about the underlying container provider (EKS cluster) for your EMR Containers cluster.
     */
    readonly containerProviders: outputs.emrcontainers.GetVirtualClusterContainerProvider[];
    /**
     * The Unix epoch time stamp in seconds for when the cluster was created.
     */
    readonly createdAt: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The name of the cluster.
     */
    readonly name: string;
    /**
     * The status of the EKS cluster. One of `RUNNING`, `TERMINATING`, `TERMINATED`, `ARRESTED`.
     */
    readonly state: string;
    /**
     * Key-value mapping of resource tags.
     */
    readonly tags: {[key: string]: string};
    readonly virtualClusterId: string;
}

export function getVirtualClusterOutput(args: GetVirtualClusterOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetVirtualClusterResult> {
    return pulumi.output(args).apply(a => getVirtualCluster(a, opts))
}

/**
 * A collection of arguments for invoking getVirtualCluster.
 */
export interface GetVirtualClusterOutputArgs {
    /**
     * Key-value mapping of resource tags.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The ID of the cluster.
     */
    virtualClusterId: pulumi.Input<string>;
}