// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

// nolint: lll
package ecs

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// > This content is derived from https://github.com/terraform-providers/terraform-provider-aws/blob/master/website/docs/r/ecs_capacity_provider.html.markdown.
type CapacityProvider struct {
	pulumi.CustomResourceState

	// The Amazon Resource Name (ARN) that identifies the capacity provider.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// Nested argument defining the provider for the ECS auto scaling group. Defined below.
	AutoScalingGroupProvider CapacityProviderAutoScalingGroupProviderOutput `pulumi:"autoScalingGroupProvider"`
	// The name of the capacity provider.
	Name pulumi.StringOutput `pulumi:"name"`
	// Key-value mapping of resource tags.
	Tags pulumi.MapOutput `pulumi:"tags"`
}

// NewCapacityProvider registers a new resource with the given unique name, arguments, and options.
func NewCapacityProvider(ctx *pulumi.Context,
	name string, args *CapacityProviderArgs, opts ...pulumi.ResourceOption) (*CapacityProvider, error) {
	if args == nil || args.AutoScalingGroupProvider == nil {
		return nil, errors.New("missing required argument 'AutoScalingGroupProvider'")
	}
	if args == nil {
		args = &CapacityProviderArgs{}
	}
	var resource CapacityProvider
	err := ctx.RegisterResource("aws:ecs/capacityProvider:CapacityProvider", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCapacityProvider gets an existing CapacityProvider resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCapacityProvider(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CapacityProviderState, opts ...pulumi.ResourceOption) (*CapacityProvider, error) {
	var resource CapacityProvider
	err := ctx.ReadResource("aws:ecs/capacityProvider:CapacityProvider", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CapacityProvider resources.
type capacityProviderState struct {
	// The Amazon Resource Name (ARN) that identifies the capacity provider.
	Arn *string `pulumi:"arn"`
	// Nested argument defining the provider for the ECS auto scaling group. Defined below.
	AutoScalingGroupProvider *CapacityProviderAutoScalingGroupProvider `pulumi:"autoScalingGroupProvider"`
	// The name of the capacity provider.
	Name *string `pulumi:"name"`
	// Key-value mapping of resource tags.
	Tags map[string]interface{} `pulumi:"tags"`
}

type CapacityProviderState struct {
	// The Amazon Resource Name (ARN) that identifies the capacity provider.
	Arn pulumi.StringPtrInput
	// Nested argument defining the provider for the ECS auto scaling group. Defined below.
	AutoScalingGroupProvider CapacityProviderAutoScalingGroupProviderPtrInput
	// The name of the capacity provider.
	Name pulumi.StringPtrInput
	// Key-value mapping of resource tags.
	Tags pulumi.MapInput
}

func (CapacityProviderState) ElementType() reflect.Type {
	return reflect.TypeOf((*capacityProviderState)(nil)).Elem()
}

type capacityProviderArgs struct {
	// Nested argument defining the provider for the ECS auto scaling group. Defined below.
	AutoScalingGroupProvider CapacityProviderAutoScalingGroupProvider `pulumi:"autoScalingGroupProvider"`
	// The name of the capacity provider.
	Name *string `pulumi:"name"`
	// Key-value mapping of resource tags.
	Tags map[string]interface{} `pulumi:"tags"`
}

// The set of arguments for constructing a CapacityProvider resource.
type CapacityProviderArgs struct {
	// Nested argument defining the provider for the ECS auto scaling group. Defined below.
	AutoScalingGroupProvider CapacityProviderAutoScalingGroupProviderInput
	// The name of the capacity provider.
	Name pulumi.StringPtrInput
	// Key-value mapping of resource tags.
	Tags pulumi.MapInput
}

func (CapacityProviderArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*capacityProviderArgs)(nil)).Elem()
}
