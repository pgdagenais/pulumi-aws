// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Provides details about a specific Amazon Lex Slot Type.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const flowerTypes = pulumi.output(aws.lex.getSlotType({
 *     name: "FlowerTypes",
 *     version: "1",
 * }, { async: true }));
 * ```
 */
export function getSlotType(args: GetSlotTypeArgs, opts?: pulumi.InvokeOptions): Promise<GetSlotTypeResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("aws:lex/getSlotType:getSlotType", {
        "name": args.name,
        "version": args.version,
    }, opts);
}

/**
 * A collection of arguments for invoking getSlotType.
 */
export interface GetSlotTypeArgs {
    /**
     * The name of the slot type. The name is case sensitive.
     */
    readonly name: string;
    /**
     * The version of the slot type.
     */
    readonly version?: string;
}

/**
 * A collection of values returned by getSlotType.
 */
export interface GetSlotTypeResult {
    /**
     * Checksum identifying the version of the slot type that was created. The checksum is
     * not included as an argument because the resource will add it automatically when updating the slot type.
     */
    readonly checksum: string;
    /**
     * The date when the slot type version was created.
     */
    readonly createdDate: string;
    /**
     * A description of the slot type.
     */
    readonly description: string;
    /**
     * A set of EnumerationValue objects that defines the values that
     * the slot type can take. Each value can have a set of synonyms, which are additional values that help
     * train the machine learning model about the values that it resolves for a slot.
     */
    readonly enumerationValues: outputs.lex.GetSlotTypeEnumerationValue[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The date when the $LATEST version of this slot type was updated.
     */
    readonly lastUpdatedDate: string;
    /**
     * The name of the slot type. The name is not case sensitive.
     */
    readonly name: string;
    /**
     * Determines the slot resolution strategy that Amazon Lex
     * uses to return slot type values. `ORIGINAL_VALUE` returns the value entered by the user if the user
     * value is similar to the slot value. `TOP_RESOLUTION` returns the first value in the resolution list
     * if there is a resolution list for the slot, otherwise null is returned.
     */
    readonly valueSelectionStrategy: string;
    /**
     * The version of the slot type.
     */
    readonly version?: string;
}