// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs, enums } from "../types";
import * as utilities from "../utilities";

/**
 * Manages an Image Builder Container Recipe.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.imagebuilder.ContainerRecipe("example", {
 *     version: "1.0.0",
 *     containerType: "DOCKER",
 *     parentImage: "arn:aws:imagebuilder:eu-central-1:aws:image/amazon-linux-x86-latest/x.x.x",
 *     targetRepository: {
 *         repositoryName: aws_ecr_repository.example.name,
 *         service: "ECR",
 *     },
 *     components: [{
 *         componentArn: aws_imagebuilder_component.example.arn,
 *         parameters: [
 *             {
 *                 name: "Parameter1",
 *                 value: "Value1",
 *             },
 *             {
 *                 name: "Parameter2",
 *                 value: "Value2",
 *             },
 *         ],
 *     }],
 *     dockerfileTemplateData: `FROM {{{ imagebuilder:parentImage }}}
 * {{{ imagebuilder:environments }}}
 * {{{ imagebuilder:components }}}
 * `,
 * });
 * ```
 *
 * ## Import
 *
 * `aws_imagebuilder_container_recipe` resources can be imported by using the Amazon Resource Name (ARN), e.g.,
 *
 * ```sh
 *  $ pulumi import aws:imagebuilder/containerRecipe:ContainerRecipe example arn:aws:imagebuilder:us-east-1:123456789012:container-recipe/example/1.0.0
 * ```
 */
export class ContainerRecipe extends pulumi.CustomResource {
    /**
     * Get an existing ContainerRecipe resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ContainerRecipeState, opts?: pulumi.CustomResourceOptions): ContainerRecipe {
        return new ContainerRecipe(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:imagebuilder/containerRecipe:ContainerRecipe';

    /**
     * Returns true if the given object is an instance of ContainerRecipe.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ContainerRecipe {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ContainerRecipe.__pulumiType;
    }

    /**
     * (Required) Amazon Resource Name (ARN) of the container recipe.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * Ordered configuration block(s) with components for the container recipe. Detailed below.
     */
    public readonly components!: pulumi.Output<outputs.imagebuilder.ContainerRecipeComponent[]>;
    /**
     * The type of the container to create. Valid values: `DOCKER`.
     */
    public readonly containerType!: pulumi.Output<string>;
    /**
     * Date the container recipe was created.
     */
    public /*out*/ readonly dateCreated!: pulumi.Output<string>;
    /**
     * The description of the container recipe.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The Dockerfile template used to build the image as an inline data blob.
     */
    public readonly dockerfileTemplateData!: pulumi.Output<string>;
    /**
     * The Amazon S3 URI for the Dockerfile that will be used to build the container image.
     */
    public readonly dockerfileTemplateUri!: pulumi.Output<string | undefined>;
    /**
     * Whether to encrypt the volume. Defaults to unset, which is the value inherited from the parent image.
     */
    public /*out*/ readonly encrypted!: pulumi.Output<boolean>;
    /**
     * Configuration block used to configure an instance for building and testing container images. Detailed below.
     */
    public readonly instanceConfiguration!: pulumi.Output<outputs.imagebuilder.ContainerRecipeInstanceConfiguration | undefined>;
    /**
     * Amazon Resource Name (ARN) of the Key Management Service (KMS) Key for encryption.
     */
    public readonly kmsKeyId!: pulumi.Output<string | undefined>;
    /**
     * The name of the component parameter.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Owner of the container recipe.
     */
    public /*out*/ readonly owner!: pulumi.Output<string>;
    /**
     * The base image for the container recipe.
     */
    public readonly parentImage!: pulumi.Output<string>;
    /**
     * Platform of the container recipe.
     */
    public /*out*/ readonly platform!: pulumi.Output<string>;
    /**
     * Key-value map of resource tags for the container recipe. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider [`defaultTags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;
    /**
     * The destination repository for the container image. Detailed below.
     */
    public readonly targetRepository!: pulumi.Output<outputs.imagebuilder.ContainerRecipeTargetRepository>;
    /**
     * Version of the container recipe.
     */
    public readonly version!: pulumi.Output<string>;
    /**
     * The working directory to be used during build and test workflows.
     */
    public readonly workingDirectory!: pulumi.Output<string | undefined>;

    /**
     * Create a ContainerRecipe resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ContainerRecipeArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ContainerRecipeArgs | ContainerRecipeState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ContainerRecipeState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["components"] = state ? state.components : undefined;
            resourceInputs["containerType"] = state ? state.containerType : undefined;
            resourceInputs["dateCreated"] = state ? state.dateCreated : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["dockerfileTemplateData"] = state ? state.dockerfileTemplateData : undefined;
            resourceInputs["dockerfileTemplateUri"] = state ? state.dockerfileTemplateUri : undefined;
            resourceInputs["encrypted"] = state ? state.encrypted : undefined;
            resourceInputs["instanceConfiguration"] = state ? state.instanceConfiguration : undefined;
            resourceInputs["kmsKeyId"] = state ? state.kmsKeyId : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["owner"] = state ? state.owner : undefined;
            resourceInputs["parentImage"] = state ? state.parentImage : undefined;
            resourceInputs["platform"] = state ? state.platform : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
            resourceInputs["targetRepository"] = state ? state.targetRepository : undefined;
            resourceInputs["version"] = state ? state.version : undefined;
            resourceInputs["workingDirectory"] = state ? state.workingDirectory : undefined;
        } else {
            const args = argsOrState as ContainerRecipeArgs | undefined;
            if ((!args || args.components === undefined) && !opts.urn) {
                throw new Error("Missing required property 'components'");
            }
            if ((!args || args.containerType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'containerType'");
            }
            if ((!args || args.parentImage === undefined) && !opts.urn) {
                throw new Error("Missing required property 'parentImage'");
            }
            if ((!args || args.targetRepository === undefined) && !opts.urn) {
                throw new Error("Missing required property 'targetRepository'");
            }
            if ((!args || args.version === undefined) && !opts.urn) {
                throw new Error("Missing required property 'version'");
            }
            resourceInputs["components"] = args ? args.components : undefined;
            resourceInputs["containerType"] = args ? args.containerType : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["dockerfileTemplateData"] = args ? args.dockerfileTemplateData : undefined;
            resourceInputs["dockerfileTemplateUri"] = args ? args.dockerfileTemplateUri : undefined;
            resourceInputs["instanceConfiguration"] = args ? args.instanceConfiguration : undefined;
            resourceInputs["kmsKeyId"] = args ? args.kmsKeyId : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["parentImage"] = args ? args.parentImage : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["targetRepository"] = args ? args.targetRepository : undefined;
            resourceInputs["version"] = args ? args.version : undefined;
            resourceInputs["workingDirectory"] = args ? args.workingDirectory : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["dateCreated"] = undefined /*out*/;
            resourceInputs["encrypted"] = undefined /*out*/;
            resourceInputs["owner"] = undefined /*out*/;
            resourceInputs["platform"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ContainerRecipe.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ContainerRecipe resources.
 */
export interface ContainerRecipeState {
    /**
     * (Required) Amazon Resource Name (ARN) of the container recipe.
     */
    arn?: pulumi.Input<string>;
    /**
     * Ordered configuration block(s) with components for the container recipe. Detailed below.
     */
    components?: pulumi.Input<pulumi.Input<inputs.imagebuilder.ContainerRecipeComponent>[]>;
    /**
     * The type of the container to create. Valid values: `DOCKER`.
     */
    containerType?: pulumi.Input<string>;
    /**
     * Date the container recipe was created.
     */
    dateCreated?: pulumi.Input<string>;
    /**
     * The description of the container recipe.
     */
    description?: pulumi.Input<string>;
    /**
     * The Dockerfile template used to build the image as an inline data blob.
     */
    dockerfileTemplateData?: pulumi.Input<string>;
    /**
     * The Amazon S3 URI for the Dockerfile that will be used to build the container image.
     */
    dockerfileTemplateUri?: pulumi.Input<string>;
    /**
     * Whether to encrypt the volume. Defaults to unset, which is the value inherited from the parent image.
     */
    encrypted?: pulumi.Input<boolean>;
    /**
     * Configuration block used to configure an instance for building and testing container images. Detailed below.
     */
    instanceConfiguration?: pulumi.Input<inputs.imagebuilder.ContainerRecipeInstanceConfiguration>;
    /**
     * Amazon Resource Name (ARN) of the Key Management Service (KMS) Key for encryption.
     */
    kmsKeyId?: pulumi.Input<string>;
    /**
     * The name of the component parameter.
     */
    name?: pulumi.Input<string>;
    /**
     * Owner of the container recipe.
     */
    owner?: pulumi.Input<string>;
    /**
     * The base image for the container recipe.
     */
    parentImage?: pulumi.Input<string>;
    /**
     * Platform of the container recipe.
     */
    platform?: pulumi.Input<string>;
    /**
     * Key-value map of resource tags for the container recipe. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider [`defaultTags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The destination repository for the container image. Detailed below.
     */
    targetRepository?: pulumi.Input<inputs.imagebuilder.ContainerRecipeTargetRepository>;
    /**
     * Version of the container recipe.
     */
    version?: pulumi.Input<string>;
    /**
     * The working directory to be used during build and test workflows.
     */
    workingDirectory?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ContainerRecipe resource.
 */
export interface ContainerRecipeArgs {
    /**
     * Ordered configuration block(s) with components for the container recipe. Detailed below.
     */
    components: pulumi.Input<pulumi.Input<inputs.imagebuilder.ContainerRecipeComponent>[]>;
    /**
     * The type of the container to create. Valid values: `DOCKER`.
     */
    containerType: pulumi.Input<string>;
    /**
     * The description of the container recipe.
     */
    description?: pulumi.Input<string>;
    /**
     * The Dockerfile template used to build the image as an inline data blob.
     */
    dockerfileTemplateData?: pulumi.Input<string>;
    /**
     * The Amazon S3 URI for the Dockerfile that will be used to build the container image.
     */
    dockerfileTemplateUri?: pulumi.Input<string>;
    /**
     * Configuration block used to configure an instance for building and testing container images. Detailed below.
     */
    instanceConfiguration?: pulumi.Input<inputs.imagebuilder.ContainerRecipeInstanceConfiguration>;
    /**
     * Amazon Resource Name (ARN) of the Key Management Service (KMS) Key for encryption.
     */
    kmsKeyId?: pulumi.Input<string>;
    /**
     * The name of the component parameter.
     */
    name?: pulumi.Input<string>;
    /**
     * The base image for the container recipe.
     */
    parentImage: pulumi.Input<string>;
    /**
     * Key-value map of resource tags for the container recipe. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The destination repository for the container image. Detailed below.
     */
    targetRepository: pulumi.Input<inputs.imagebuilder.ContainerRecipeTargetRepository>;
    /**
     * Version of the container recipe.
     */
    version: pulumi.Input<string>;
    /**
     * The working directory to be used during build and test workflows.
     */
    workingDirectory?: pulumi.Input<string>;
}