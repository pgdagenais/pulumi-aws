// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Information about a single RDS Reserved Instance Offering.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const test = aws.rds.getReservedInstanceOffering({
 *     dbInstanceClass: "db.t2.micro",
 *     duration: 31536000,
 *     multiAz: false,
 *     offeringType: "All Upfront",
 *     productDescription: "mysql",
 * });
 * ```
 */
export function getReservedInstanceOffering(args: GetReservedInstanceOfferingArgs, opts?: pulumi.InvokeOptions): Promise<GetReservedInstanceOfferingResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:rds/getReservedInstanceOffering:getReservedInstanceOffering", {
        "dbInstanceClass": args.dbInstanceClass,
        "duration": args.duration,
        "multiAz": args.multiAz,
        "offeringType": args.offeringType,
        "productDescription": args.productDescription,
    }, opts);
}

/**
 * A collection of arguments for invoking getReservedInstanceOffering.
 */
export interface GetReservedInstanceOfferingArgs {
    /**
     * DB instance class for the reserved DB instance.
     */
    dbInstanceClass: string;
    /**
     * Duration of the reservation in seconds.
     */
    duration: number;
    /**
     * Whether the reservation applies to Multi-AZ deployments.
     */
    multiAz: boolean;
    /**
     * Offering type of this reserved DB instance.
     */
    offeringType: string;
    /**
     * Description of the reserved DB instance.
     */
    productDescription: string;
}

/**
 * A collection of values returned by getReservedInstanceOffering.
 */
export interface GetReservedInstanceOfferingResult {
    /**
     * Currency code for the reserved DB instance.
     */
    readonly currencyCode: string;
    readonly dbInstanceClass: string;
    readonly duration: number;
    /**
     * Fixed price charged for this reserved DB instance.
     */
    readonly fixedPrice: number;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly multiAz: boolean;
    /**
     * Unique identifier for the reservation.
     */
    readonly offeringId: string;
    readonly offeringType: string;
    readonly productDescription: string;
}

export function getReservedInstanceOfferingOutput(args: GetReservedInstanceOfferingOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetReservedInstanceOfferingResult> {
    return pulumi.output(args).apply(a => getReservedInstanceOffering(a, opts))
}

/**
 * A collection of arguments for invoking getReservedInstanceOffering.
 */
export interface GetReservedInstanceOfferingOutputArgs {
    /**
     * DB instance class for the reserved DB instance.
     */
    dbInstanceClass: pulumi.Input<string>;
    /**
     * Duration of the reservation in seconds.
     */
    duration: pulumi.Input<number>;
    /**
     * Whether the reservation applies to Multi-AZ deployments.
     */
    multiAz: pulumi.Input<boolean>;
    /**
     * Offering type of this reserved DB instance.
     */
    offeringType: pulumi.Input<string>;
    /**
     * Description of the reserved DB instance.
     */
    productDescription: pulumi.Input<string>;
}