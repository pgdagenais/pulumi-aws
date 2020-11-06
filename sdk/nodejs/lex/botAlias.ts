// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides an Amazon Lex Bot Alias resource. For more information see
 * [Amazon Lex: How It Works](https://docs.aws.amazon.com/lex/latest/dg/how-it-works.html)
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const orderFlowersProd = new aws.lex.BotAlias("order_flowers_prod", {
 *     botName: "OrderFlowers",
 *     botVersion: "1",
 *     description: "Production Version of the OrderFlowers Bot.",
 *     name: "OrderFlowersProd",
 * });
 * ```
 */
export class BotAlias extends pulumi.CustomResource {
    /**
     * Get an existing BotAlias resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: BotAliasState, opts?: pulumi.CustomResourceOptions): BotAlias {
        return new BotAlias(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:lex/botAlias:BotAlias';

    /**
     * Returns true if the given object is an instance of BotAlias.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is BotAlias {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === BotAlias.__pulumiType;
    }

    /**
     * The ARN of the bot alias.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * The name of the bot.
     */
    public readonly botName!: pulumi.Output<string>;
    /**
     * The name of the bot.
     */
    public readonly botVersion!: pulumi.Output<string>;
    /**
     * Checksum of the bot alias.
     */
    public /*out*/ readonly checksum!: pulumi.Output<string>;
    /**
     * The settings that determine how Amazon Lex uses conversation logs for the alias. Attributes are documented under conversation_logs.
     */
    public readonly conversationLogs!: pulumi.Output<outputs.lex.BotAliasConversationLogs | undefined>;
    /**
     * The date that the bot alias was created.
     */
    public /*out*/ readonly createdDate!: pulumi.Output<string>;
    /**
     * A description of the alias. Must be less than or equal to 200 characters in length.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The date that the bot alias was updated. When you create a resource, the creation date and the last updated date are the same.
     */
    public /*out*/ readonly lastUpdatedDate!: pulumi.Output<string>;
    /**
     * The name of the alias. The name is not case sensitive. Must be less than or equal to 100 characters in length.
     */
    public readonly name!: pulumi.Output<string>;

    /**
     * Create a BotAlias resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: BotAliasArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: BotAliasArgs | BotAliasState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as BotAliasState | undefined;
            inputs["arn"] = state ? state.arn : undefined;
            inputs["botName"] = state ? state.botName : undefined;
            inputs["botVersion"] = state ? state.botVersion : undefined;
            inputs["checksum"] = state ? state.checksum : undefined;
            inputs["conversationLogs"] = state ? state.conversationLogs : undefined;
            inputs["createdDate"] = state ? state.createdDate : undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["lastUpdatedDate"] = state ? state.lastUpdatedDate : undefined;
            inputs["name"] = state ? state.name : undefined;
        } else {
            const args = argsOrState as BotAliasArgs | undefined;
            if (!args || args.botName === undefined) {
                throw new Error("Missing required property 'botName'");
            }
            if (!args || args.botVersion === undefined) {
                throw new Error("Missing required property 'botVersion'");
            }
            inputs["botName"] = args ? args.botName : undefined;
            inputs["botVersion"] = args ? args.botVersion : undefined;
            inputs["conversationLogs"] = args ? args.conversationLogs : undefined;
            inputs["description"] = args ? args.description : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["arn"] = undefined /*out*/;
            inputs["checksum"] = undefined /*out*/;
            inputs["createdDate"] = undefined /*out*/;
            inputs["lastUpdatedDate"] = undefined /*out*/;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(BotAlias.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering BotAlias resources.
 */
export interface BotAliasState {
    /**
     * The ARN of the bot alias.
     */
    readonly arn?: pulumi.Input<string>;
    /**
     * The name of the bot.
     */
    readonly botName?: pulumi.Input<string>;
    /**
     * The name of the bot.
     */
    readonly botVersion?: pulumi.Input<string>;
    /**
     * Checksum of the bot alias.
     */
    readonly checksum?: pulumi.Input<string>;
    /**
     * The settings that determine how Amazon Lex uses conversation logs for the alias. Attributes are documented under conversation_logs.
     */
    readonly conversationLogs?: pulumi.Input<inputs.lex.BotAliasConversationLogs>;
    /**
     * The date that the bot alias was created.
     */
    readonly createdDate?: pulumi.Input<string>;
    /**
     * A description of the alias. Must be less than or equal to 200 characters in length.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * The date that the bot alias was updated. When you create a resource, the creation date and the last updated date are the same.
     */
    readonly lastUpdatedDate?: pulumi.Input<string>;
    /**
     * The name of the alias. The name is not case sensitive. Must be less than or equal to 100 characters in length.
     */
    readonly name?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a BotAlias resource.
 */
export interface BotAliasArgs {
    /**
     * The name of the bot.
     */
    readonly botName: pulumi.Input<string>;
    /**
     * The name of the bot.
     */
    readonly botVersion: pulumi.Input<string>;
    /**
     * The settings that determine how Amazon Lex uses conversation logs for the alias. Attributes are documented under conversation_logs.
     */
    readonly conversationLogs?: pulumi.Input<inputs.lex.BotAliasConversationLogs>;
    /**
     * A description of the alias. Must be less than or equal to 200 characters in length.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * The name of the alias. The name is not case sensitive. Must be less than or equal to 100 characters in length.
     */
    readonly name?: pulumi.Input<string>;
}