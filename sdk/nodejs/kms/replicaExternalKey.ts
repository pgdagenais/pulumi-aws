// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages a KMS multi-Region replica key that uses external key material.
 * See the [AWS KMS Developer Guide](https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-import.html) for more information on importing key material into multi-Region keys.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const primary = new aws.Provider("primary", {region: "us-east-1"});
 * const primaryExternalKey = new aws.kms.ExternalKey("primaryExternalKey", {
 *     description: "Multi-Region primary key",
 *     deletionWindowInDays: 30,
 *     multiRegion: true,
 *     enabled: true,
 *     keyMaterialBase64: "...",
 * }, {
 *     provider: aws.primary,
 * });
 * const replica = new aws.kms.ReplicaExternalKey("replica", {
 *     description: "Multi-Region replica key",
 *     deletionWindowInDays: 7,
 *     primaryKeyArn: aws_kms_external.primary.arn,
 *     keyMaterialBase64: "...",
 * });
 * // Must be the same key material as the primary's.
 * ```
 *
 * ## Import
 *
 * KMS multi-Region replica keys can be imported using the `id`, e.g.,
 *
 * ```sh
 *  $ pulumi import aws:kms/replicaExternalKey:ReplicaExternalKey example 1234abcd-12ab-34cd-56ef-1234567890ab
 * ```
 */
export class ReplicaExternalKey extends pulumi.CustomResource {
    /**
     * Get an existing ReplicaExternalKey resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ReplicaExternalKeyState, opts?: pulumi.CustomResourceOptions): ReplicaExternalKey {
        return new ReplicaExternalKey(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:kms/replicaExternalKey:ReplicaExternalKey';

    /**
     * Returns true if the given object is an instance of ReplicaExternalKey.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ReplicaExternalKey {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ReplicaExternalKey.__pulumiType;
    }

    /**
     * The Amazon Resource Name (ARN) of the replica key. The key ARNs of related multi-Region keys differ only in the Region value.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * A flag to indicate whether to bypass the key policy lockout safety check.
     * Setting this value to true increases the risk that the KMS key becomes unmanageable. Do not set this value to true indiscriminately.
     * For more information, refer to the scenario in the [Default Key Policy](https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam) section in the _AWS Key Management Service Developer Guide_.
     * The default value is `false`.
     */
    public readonly bypassPolicyLockoutSafetyCheck!: pulumi.Output<boolean | undefined>;
    /**
     * The waiting period, specified in number of days. After the waiting period ends, AWS KMS deletes the KMS key.
     * If you specify a value, it must be between `7` and `30`, inclusive. If you do not specify a value, it defaults to `30`.
     */
    public readonly deletionWindowInDays!: pulumi.Output<number | undefined>;
    /**
     * A description of the KMS key.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Specifies whether the replica key is enabled. Disabled KMS keys cannot be used in cryptographic operations. Keys pending import can only be `false`. Imported keys default to `true` unless expired.
     */
    public readonly enabled!: pulumi.Output<boolean>;
    /**
     * Whether the key material expires. Empty when pending key material import, otherwise `KEY_MATERIAL_EXPIRES` or `KEY_MATERIAL_DOES_NOT_EXPIRE`.
     */
    public /*out*/ readonly expirationModel!: pulumi.Output<string>;
    /**
     * The key ID of the replica key. Related multi-Region keys have the same key ID.
     */
    public /*out*/ readonly keyId!: pulumi.Output<string>;
    /**
     * Base64 encoded 256-bit symmetric encryption key material to import. The KMS key is permanently associated with this key material. The same key material can be [reimported](https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html#reimport-key-material), but you cannot import different key material.
     */
    public readonly keyMaterialBase64!: pulumi.Output<string | undefined>;
    /**
     * The state of the replica key.
     */
    public /*out*/ readonly keyState!: pulumi.Output<string>;
    /**
     * The [cryptographic operations](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations) for which you can use the KMS key. This is a shared property of multi-Region keys.
     */
    public /*out*/ readonly keyUsage!: pulumi.Output<string>;
    public readonly policy!: pulumi.Output<string>;
    /**
     * The ARN of the multi-Region primary key to replicate. The primary key must be in a different AWS Region of the same AWS Partition. You can create only one replica of a given primary key in each AWS Region.
     */
    public readonly primaryKeyArn!: pulumi.Output<string>;
    /**
     * A map of tags to assign to the replica key. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;
    /**
     * Time at which the imported key material expires. When the key material expires, AWS KMS deletes the key material and the key becomes unusable. If not specified, key material does not expire. Valid values: [RFC3339 time string](https://tools.ietf.org/html/rfc3339#section-5.8) (`YYYY-MM-DDTHH:MM:SSZ`)
     */
    public readonly validTo!: pulumi.Output<string | undefined>;

    /**
     * Create a ReplicaExternalKey resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ReplicaExternalKeyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ReplicaExternalKeyArgs | ReplicaExternalKeyState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ReplicaExternalKeyState | undefined;
            inputs["arn"] = state ? state.arn : undefined;
            inputs["bypassPolicyLockoutSafetyCheck"] = state ? state.bypassPolicyLockoutSafetyCheck : undefined;
            inputs["deletionWindowInDays"] = state ? state.deletionWindowInDays : undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["enabled"] = state ? state.enabled : undefined;
            inputs["expirationModel"] = state ? state.expirationModel : undefined;
            inputs["keyId"] = state ? state.keyId : undefined;
            inputs["keyMaterialBase64"] = state ? state.keyMaterialBase64 : undefined;
            inputs["keyState"] = state ? state.keyState : undefined;
            inputs["keyUsage"] = state ? state.keyUsage : undefined;
            inputs["policy"] = state ? state.policy : undefined;
            inputs["primaryKeyArn"] = state ? state.primaryKeyArn : undefined;
            inputs["tags"] = state ? state.tags : undefined;
            inputs["tagsAll"] = state ? state.tagsAll : undefined;
            inputs["validTo"] = state ? state.validTo : undefined;
        } else {
            const args = argsOrState as ReplicaExternalKeyArgs | undefined;
            if ((!args || args.primaryKeyArn === undefined) && !opts.urn) {
                throw new Error("Missing required property 'primaryKeyArn'");
            }
            inputs["bypassPolicyLockoutSafetyCheck"] = args ? args.bypassPolicyLockoutSafetyCheck : undefined;
            inputs["deletionWindowInDays"] = args ? args.deletionWindowInDays : undefined;
            inputs["description"] = args ? args.description : undefined;
            inputs["enabled"] = args ? args.enabled : undefined;
            inputs["keyMaterialBase64"] = args ? args.keyMaterialBase64 : undefined;
            inputs["policy"] = args ? args.policy : undefined;
            inputs["primaryKeyArn"] = args ? args.primaryKeyArn : undefined;
            inputs["tags"] = args ? args.tags : undefined;
            inputs["validTo"] = args ? args.validTo : undefined;
            inputs["arn"] = undefined /*out*/;
            inputs["expirationModel"] = undefined /*out*/;
            inputs["keyId"] = undefined /*out*/;
            inputs["keyState"] = undefined /*out*/;
            inputs["keyUsage"] = undefined /*out*/;
            inputs["tagsAll"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(ReplicaExternalKey.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ReplicaExternalKey resources.
 */
export interface ReplicaExternalKeyState {
    /**
     * The Amazon Resource Name (ARN) of the replica key. The key ARNs of related multi-Region keys differ only in the Region value.
     */
    arn?: pulumi.Input<string>;
    /**
     * A flag to indicate whether to bypass the key policy lockout safety check.
     * Setting this value to true increases the risk that the KMS key becomes unmanageable. Do not set this value to true indiscriminately.
     * For more information, refer to the scenario in the [Default Key Policy](https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam) section in the _AWS Key Management Service Developer Guide_.
     * The default value is `false`.
     */
    bypassPolicyLockoutSafetyCheck?: pulumi.Input<boolean>;
    /**
     * The waiting period, specified in number of days. After the waiting period ends, AWS KMS deletes the KMS key.
     * If you specify a value, it must be between `7` and `30`, inclusive. If you do not specify a value, it defaults to `30`.
     */
    deletionWindowInDays?: pulumi.Input<number>;
    /**
     * A description of the KMS key.
     */
    description?: pulumi.Input<string>;
    /**
     * Specifies whether the replica key is enabled. Disabled KMS keys cannot be used in cryptographic operations. Keys pending import can only be `false`. Imported keys default to `true` unless expired.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Whether the key material expires. Empty when pending key material import, otherwise `KEY_MATERIAL_EXPIRES` or `KEY_MATERIAL_DOES_NOT_EXPIRE`.
     */
    expirationModel?: pulumi.Input<string>;
    /**
     * The key ID of the replica key. Related multi-Region keys have the same key ID.
     */
    keyId?: pulumi.Input<string>;
    /**
     * Base64 encoded 256-bit symmetric encryption key material to import. The KMS key is permanently associated with this key material. The same key material can be [reimported](https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html#reimport-key-material), but you cannot import different key material.
     */
    keyMaterialBase64?: pulumi.Input<string>;
    /**
     * The state of the replica key.
     */
    keyState?: pulumi.Input<string>;
    /**
     * The [cryptographic operations](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations) for which you can use the KMS key. This is a shared property of multi-Region keys.
     */
    keyUsage?: pulumi.Input<string>;
    policy?: pulumi.Input<string>;
    /**
     * The ARN of the multi-Region primary key to replicate. The primary key must be in a different AWS Region of the same AWS Partition. You can create only one replica of a given primary key in each AWS Region.
     */
    primaryKeyArn?: pulumi.Input<string>;
    /**
     * A map of tags to assign to the replica key. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Time at which the imported key material expires. When the key material expires, AWS KMS deletes the key material and the key becomes unusable. If not specified, key material does not expire. Valid values: [RFC3339 time string](https://tools.ietf.org/html/rfc3339#section-5.8) (`YYYY-MM-DDTHH:MM:SSZ`)
     */
    validTo?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ReplicaExternalKey resource.
 */
export interface ReplicaExternalKeyArgs {
    /**
     * A flag to indicate whether to bypass the key policy lockout safety check.
     * Setting this value to true increases the risk that the KMS key becomes unmanageable. Do not set this value to true indiscriminately.
     * For more information, refer to the scenario in the [Default Key Policy](https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam) section in the _AWS Key Management Service Developer Guide_.
     * The default value is `false`.
     */
    bypassPolicyLockoutSafetyCheck?: pulumi.Input<boolean>;
    /**
     * The waiting period, specified in number of days. After the waiting period ends, AWS KMS deletes the KMS key.
     * If you specify a value, it must be between `7` and `30`, inclusive. If you do not specify a value, it defaults to `30`.
     */
    deletionWindowInDays?: pulumi.Input<number>;
    /**
     * A description of the KMS key.
     */
    description?: pulumi.Input<string>;
    /**
     * Specifies whether the replica key is enabled. Disabled KMS keys cannot be used in cryptographic operations. Keys pending import can only be `false`. Imported keys default to `true` unless expired.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Base64 encoded 256-bit symmetric encryption key material to import. The KMS key is permanently associated with this key material. The same key material can be [reimported](https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html#reimport-key-material), but you cannot import different key material.
     */
    keyMaterialBase64?: pulumi.Input<string>;
    policy?: pulumi.Input<string>;
    /**
     * The ARN of the multi-Region primary key to replicate. The primary key must be in a different AWS Region of the same AWS Partition. You can create only one replica of a given primary key in each AWS Region.
     */
    primaryKeyArn: pulumi.Input<string>;
    /**
     * A map of tags to assign to the replica key. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Time at which the imported key material expires. When the key material expires, AWS KMS deletes the key material and the key becomes unusable. If not specified, key material does not expire. Valid values: [RFC3339 time string](https://tools.ietf.org/html/rfc3339#section-5.8) (`YYYY-MM-DDTHH:MM:SSZ`)
     */
    validTo?: pulumi.Input<string>;
}