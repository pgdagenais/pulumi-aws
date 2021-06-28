// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package servicecatalog

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type ProductProvisioningArtifactParameters struct {
	// Description of the provisioning artifact (i.e., version), including how it differs from the previous provisioning artifact.
	Description *string `pulumi:"description"`
	// Whether AWS Service Catalog stops validating the specified provisioning artifact template even if it is invalid.
	DisableTemplateValidation *bool `pulumi:"disableTemplateValidation"`
	// Name of the provisioning artifact (for example, `v1`, `v2beta`). No spaces are allowed.
	Name *string `pulumi:"name"`
	// Template source as the physical ID of the resource that contains the template. Currently only supports CloudFormation stack ARN. Specify the physical ID as `arn:[partition]:cloudformation:[region]:[account ID]:stack/[stack name]/[resource ID]`.
	TemplatePhysicalId *string `pulumi:"templatePhysicalId"`
	// Template source as URL of the CloudFormation template in Amazon S3.
	TemplateUrl *string `pulumi:"templateUrl"`
	// Type of provisioning artifact. Valid values: `CLOUD_FORMATION_TEMPLATE`, `MARKETPLACE_AMI`, `MARKETPLACE_CAR` (Marketplace Clusters and AWS Resources).
	Type *string `pulumi:"type"`
}

// ProductProvisioningArtifactParametersInput is an input type that accepts ProductProvisioningArtifactParametersArgs and ProductProvisioningArtifactParametersOutput values.
// You can construct a concrete instance of `ProductProvisioningArtifactParametersInput` via:
//
//          ProductProvisioningArtifactParametersArgs{...}
type ProductProvisioningArtifactParametersInput interface {
	pulumi.Input

	ToProductProvisioningArtifactParametersOutput() ProductProvisioningArtifactParametersOutput
	ToProductProvisioningArtifactParametersOutputWithContext(context.Context) ProductProvisioningArtifactParametersOutput
}

type ProductProvisioningArtifactParametersArgs struct {
	// Description of the provisioning artifact (i.e., version), including how it differs from the previous provisioning artifact.
	Description pulumi.StringPtrInput `pulumi:"description"`
	// Whether AWS Service Catalog stops validating the specified provisioning artifact template even if it is invalid.
	DisableTemplateValidation pulumi.BoolPtrInput `pulumi:"disableTemplateValidation"`
	// Name of the provisioning artifact (for example, `v1`, `v2beta`). No spaces are allowed.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// Template source as the physical ID of the resource that contains the template. Currently only supports CloudFormation stack ARN. Specify the physical ID as `arn:[partition]:cloudformation:[region]:[account ID]:stack/[stack name]/[resource ID]`.
	TemplatePhysicalId pulumi.StringPtrInput `pulumi:"templatePhysicalId"`
	// Template source as URL of the CloudFormation template in Amazon S3.
	TemplateUrl pulumi.StringPtrInput `pulumi:"templateUrl"`
	// Type of provisioning artifact. Valid values: `CLOUD_FORMATION_TEMPLATE`, `MARKETPLACE_AMI`, `MARKETPLACE_CAR` (Marketplace Clusters and AWS Resources).
	Type pulumi.StringPtrInput `pulumi:"type"`
}

func (ProductProvisioningArtifactParametersArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*ProductProvisioningArtifactParameters)(nil)).Elem()
}

func (i ProductProvisioningArtifactParametersArgs) ToProductProvisioningArtifactParametersOutput() ProductProvisioningArtifactParametersOutput {
	return i.ToProductProvisioningArtifactParametersOutputWithContext(context.Background())
}

func (i ProductProvisioningArtifactParametersArgs) ToProductProvisioningArtifactParametersOutputWithContext(ctx context.Context) ProductProvisioningArtifactParametersOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProductProvisioningArtifactParametersOutput)
}

func (i ProductProvisioningArtifactParametersArgs) ToProductProvisioningArtifactParametersPtrOutput() ProductProvisioningArtifactParametersPtrOutput {
	return i.ToProductProvisioningArtifactParametersPtrOutputWithContext(context.Background())
}

func (i ProductProvisioningArtifactParametersArgs) ToProductProvisioningArtifactParametersPtrOutputWithContext(ctx context.Context) ProductProvisioningArtifactParametersPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProductProvisioningArtifactParametersOutput).ToProductProvisioningArtifactParametersPtrOutputWithContext(ctx)
}

// ProductProvisioningArtifactParametersPtrInput is an input type that accepts ProductProvisioningArtifactParametersArgs, ProductProvisioningArtifactParametersPtr and ProductProvisioningArtifactParametersPtrOutput values.
// You can construct a concrete instance of `ProductProvisioningArtifactParametersPtrInput` via:
//
//          ProductProvisioningArtifactParametersArgs{...}
//
//  or:
//
//          nil
type ProductProvisioningArtifactParametersPtrInput interface {
	pulumi.Input

	ToProductProvisioningArtifactParametersPtrOutput() ProductProvisioningArtifactParametersPtrOutput
	ToProductProvisioningArtifactParametersPtrOutputWithContext(context.Context) ProductProvisioningArtifactParametersPtrOutput
}

type productProvisioningArtifactParametersPtrType ProductProvisioningArtifactParametersArgs

func ProductProvisioningArtifactParametersPtr(v *ProductProvisioningArtifactParametersArgs) ProductProvisioningArtifactParametersPtrInput {
	return (*productProvisioningArtifactParametersPtrType)(v)
}

func (*productProvisioningArtifactParametersPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**ProductProvisioningArtifactParameters)(nil)).Elem()
}

func (i *productProvisioningArtifactParametersPtrType) ToProductProvisioningArtifactParametersPtrOutput() ProductProvisioningArtifactParametersPtrOutput {
	return i.ToProductProvisioningArtifactParametersPtrOutputWithContext(context.Background())
}

func (i *productProvisioningArtifactParametersPtrType) ToProductProvisioningArtifactParametersPtrOutputWithContext(ctx context.Context) ProductProvisioningArtifactParametersPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProductProvisioningArtifactParametersPtrOutput)
}

type ProductProvisioningArtifactParametersOutput struct{ *pulumi.OutputState }

func (ProductProvisioningArtifactParametersOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ProductProvisioningArtifactParameters)(nil)).Elem()
}

func (o ProductProvisioningArtifactParametersOutput) ToProductProvisioningArtifactParametersOutput() ProductProvisioningArtifactParametersOutput {
	return o
}

func (o ProductProvisioningArtifactParametersOutput) ToProductProvisioningArtifactParametersOutputWithContext(ctx context.Context) ProductProvisioningArtifactParametersOutput {
	return o
}

func (o ProductProvisioningArtifactParametersOutput) ToProductProvisioningArtifactParametersPtrOutput() ProductProvisioningArtifactParametersPtrOutput {
	return o.ToProductProvisioningArtifactParametersPtrOutputWithContext(context.Background())
}

func (o ProductProvisioningArtifactParametersOutput) ToProductProvisioningArtifactParametersPtrOutputWithContext(ctx context.Context) ProductProvisioningArtifactParametersPtrOutput {
	return o.ApplyT(func(v ProductProvisioningArtifactParameters) *ProductProvisioningArtifactParameters {
		return &v
	}).(ProductProvisioningArtifactParametersPtrOutput)
}

// Description of the provisioning artifact (i.e., version), including how it differs from the previous provisioning artifact.
func (o ProductProvisioningArtifactParametersOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ProductProvisioningArtifactParameters) *string { return v.Description }).(pulumi.StringPtrOutput)
}

// Whether AWS Service Catalog stops validating the specified provisioning artifact template even if it is invalid.
func (o ProductProvisioningArtifactParametersOutput) DisableTemplateValidation() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v ProductProvisioningArtifactParameters) *bool { return v.DisableTemplateValidation }).(pulumi.BoolPtrOutput)
}

// Name of the provisioning artifact (for example, `v1`, `v2beta`). No spaces are allowed.
func (o ProductProvisioningArtifactParametersOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ProductProvisioningArtifactParameters) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// Template source as the physical ID of the resource that contains the template. Currently only supports CloudFormation stack ARN. Specify the physical ID as `arn:[partition]:cloudformation:[region]:[account ID]:stack/[stack name]/[resource ID]`.
func (o ProductProvisioningArtifactParametersOutput) TemplatePhysicalId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ProductProvisioningArtifactParameters) *string { return v.TemplatePhysicalId }).(pulumi.StringPtrOutput)
}

// Template source as URL of the CloudFormation template in Amazon S3.
func (o ProductProvisioningArtifactParametersOutput) TemplateUrl() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ProductProvisioningArtifactParameters) *string { return v.TemplateUrl }).(pulumi.StringPtrOutput)
}

// Type of provisioning artifact. Valid values: `CLOUD_FORMATION_TEMPLATE`, `MARKETPLACE_AMI`, `MARKETPLACE_CAR` (Marketplace Clusters and AWS Resources).
func (o ProductProvisioningArtifactParametersOutput) Type() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ProductProvisioningArtifactParameters) *string { return v.Type }).(pulumi.StringPtrOutput)
}

type ProductProvisioningArtifactParametersPtrOutput struct{ *pulumi.OutputState }

func (ProductProvisioningArtifactParametersPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ProductProvisioningArtifactParameters)(nil)).Elem()
}

func (o ProductProvisioningArtifactParametersPtrOutput) ToProductProvisioningArtifactParametersPtrOutput() ProductProvisioningArtifactParametersPtrOutput {
	return o
}

func (o ProductProvisioningArtifactParametersPtrOutput) ToProductProvisioningArtifactParametersPtrOutputWithContext(ctx context.Context) ProductProvisioningArtifactParametersPtrOutput {
	return o
}

func (o ProductProvisioningArtifactParametersPtrOutput) Elem() ProductProvisioningArtifactParametersOutput {
	return o.ApplyT(func(v *ProductProvisioningArtifactParameters) ProductProvisioningArtifactParameters { return *v }).(ProductProvisioningArtifactParametersOutput)
}

// Description of the provisioning artifact (i.e., version), including how it differs from the previous provisioning artifact.
func (o ProductProvisioningArtifactParametersPtrOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ProductProvisioningArtifactParameters) *string {
		if v == nil {
			return nil
		}
		return v.Description
	}).(pulumi.StringPtrOutput)
}

// Whether AWS Service Catalog stops validating the specified provisioning artifact template even if it is invalid.
func (o ProductProvisioningArtifactParametersPtrOutput) DisableTemplateValidation() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ProductProvisioningArtifactParameters) *bool {
		if v == nil {
			return nil
		}
		return v.DisableTemplateValidation
	}).(pulumi.BoolPtrOutput)
}

// Name of the provisioning artifact (for example, `v1`, `v2beta`). No spaces are allowed.
func (o ProductProvisioningArtifactParametersPtrOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ProductProvisioningArtifactParameters) *string {
		if v == nil {
			return nil
		}
		return v.Name
	}).(pulumi.StringPtrOutput)
}

// Template source as the physical ID of the resource that contains the template. Currently only supports CloudFormation stack ARN. Specify the physical ID as `arn:[partition]:cloudformation:[region]:[account ID]:stack/[stack name]/[resource ID]`.
func (o ProductProvisioningArtifactParametersPtrOutput) TemplatePhysicalId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ProductProvisioningArtifactParameters) *string {
		if v == nil {
			return nil
		}
		return v.TemplatePhysicalId
	}).(pulumi.StringPtrOutput)
}

// Template source as URL of the CloudFormation template in Amazon S3.
func (o ProductProvisioningArtifactParametersPtrOutput) TemplateUrl() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ProductProvisioningArtifactParameters) *string {
		if v == nil {
			return nil
		}
		return v.TemplateUrl
	}).(pulumi.StringPtrOutput)
}

// Type of provisioning artifact. Valid values: `CLOUD_FORMATION_TEMPLATE`, `MARKETPLACE_AMI`, `MARKETPLACE_CAR` (Marketplace Clusters and AWS Resources).
func (o ProductProvisioningArtifactParametersPtrOutput) Type() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ProductProvisioningArtifactParameters) *string {
		if v == nil {
			return nil
		}
		return v.Type
	}).(pulumi.StringPtrOutput)
}

type ServiceActionDefinition struct {
	// ARN of the role that performs the self-service actions on your behalf. For example, `arn:aws:iam::12345678910:role/ActionRole`. To reuse the provisioned product launch role, set to `LAUNCH_ROLE`.
	AssumeRole *string `pulumi:"assumeRole"`
	// Name of the SSM document. For example, `AWS-RestartEC2Instance`. If you are using a shared SSM document, you must provide the ARN instead of the name.
	Name string `pulumi:"name"`
	// List of parameters in JSON format. For example: `[{\"Name\":\"InstanceId\",\"Type\":\"TARGET\"}]` or `[{\"Name\":\"InstanceId\",\"Type\":\"TEXT_VALUE\"}]`.
	Parameters *string `pulumi:"parameters"`
	// Service action definition type. Valid value is `SSM_AUTOMATION`. Default is `SSM_AUTOMATION`.
	Type *string `pulumi:"type"`
	// SSM document version. For example, `1`.
	Version string `pulumi:"version"`
}

// ServiceActionDefinitionInput is an input type that accepts ServiceActionDefinitionArgs and ServiceActionDefinitionOutput values.
// You can construct a concrete instance of `ServiceActionDefinitionInput` via:
//
//          ServiceActionDefinitionArgs{...}
type ServiceActionDefinitionInput interface {
	pulumi.Input

	ToServiceActionDefinitionOutput() ServiceActionDefinitionOutput
	ToServiceActionDefinitionOutputWithContext(context.Context) ServiceActionDefinitionOutput
}

type ServiceActionDefinitionArgs struct {
	// ARN of the role that performs the self-service actions on your behalf. For example, `arn:aws:iam::12345678910:role/ActionRole`. To reuse the provisioned product launch role, set to `LAUNCH_ROLE`.
	AssumeRole pulumi.StringPtrInput `pulumi:"assumeRole"`
	// Name of the SSM document. For example, `AWS-RestartEC2Instance`. If you are using a shared SSM document, you must provide the ARN instead of the name.
	Name pulumi.StringInput `pulumi:"name"`
	// List of parameters in JSON format. For example: `[{\"Name\":\"InstanceId\",\"Type\":\"TARGET\"}]` or `[{\"Name\":\"InstanceId\",\"Type\":\"TEXT_VALUE\"}]`.
	Parameters pulumi.StringPtrInput `pulumi:"parameters"`
	// Service action definition type. Valid value is `SSM_AUTOMATION`. Default is `SSM_AUTOMATION`.
	Type pulumi.StringPtrInput `pulumi:"type"`
	// SSM document version. For example, `1`.
	Version pulumi.StringInput `pulumi:"version"`
}

func (ServiceActionDefinitionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*ServiceActionDefinition)(nil)).Elem()
}

func (i ServiceActionDefinitionArgs) ToServiceActionDefinitionOutput() ServiceActionDefinitionOutput {
	return i.ToServiceActionDefinitionOutputWithContext(context.Background())
}

func (i ServiceActionDefinitionArgs) ToServiceActionDefinitionOutputWithContext(ctx context.Context) ServiceActionDefinitionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceActionDefinitionOutput)
}

func (i ServiceActionDefinitionArgs) ToServiceActionDefinitionPtrOutput() ServiceActionDefinitionPtrOutput {
	return i.ToServiceActionDefinitionPtrOutputWithContext(context.Background())
}

func (i ServiceActionDefinitionArgs) ToServiceActionDefinitionPtrOutputWithContext(ctx context.Context) ServiceActionDefinitionPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceActionDefinitionOutput).ToServiceActionDefinitionPtrOutputWithContext(ctx)
}

// ServiceActionDefinitionPtrInput is an input type that accepts ServiceActionDefinitionArgs, ServiceActionDefinitionPtr and ServiceActionDefinitionPtrOutput values.
// You can construct a concrete instance of `ServiceActionDefinitionPtrInput` via:
//
//          ServiceActionDefinitionArgs{...}
//
//  or:
//
//          nil
type ServiceActionDefinitionPtrInput interface {
	pulumi.Input

	ToServiceActionDefinitionPtrOutput() ServiceActionDefinitionPtrOutput
	ToServiceActionDefinitionPtrOutputWithContext(context.Context) ServiceActionDefinitionPtrOutput
}

type serviceActionDefinitionPtrType ServiceActionDefinitionArgs

func ServiceActionDefinitionPtr(v *ServiceActionDefinitionArgs) ServiceActionDefinitionPtrInput {
	return (*serviceActionDefinitionPtrType)(v)
}

func (*serviceActionDefinitionPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**ServiceActionDefinition)(nil)).Elem()
}

func (i *serviceActionDefinitionPtrType) ToServiceActionDefinitionPtrOutput() ServiceActionDefinitionPtrOutput {
	return i.ToServiceActionDefinitionPtrOutputWithContext(context.Background())
}

func (i *serviceActionDefinitionPtrType) ToServiceActionDefinitionPtrOutputWithContext(ctx context.Context) ServiceActionDefinitionPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceActionDefinitionPtrOutput)
}

type ServiceActionDefinitionOutput struct{ *pulumi.OutputState }

func (ServiceActionDefinitionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ServiceActionDefinition)(nil)).Elem()
}

func (o ServiceActionDefinitionOutput) ToServiceActionDefinitionOutput() ServiceActionDefinitionOutput {
	return o
}

func (o ServiceActionDefinitionOutput) ToServiceActionDefinitionOutputWithContext(ctx context.Context) ServiceActionDefinitionOutput {
	return o
}

func (o ServiceActionDefinitionOutput) ToServiceActionDefinitionPtrOutput() ServiceActionDefinitionPtrOutput {
	return o.ToServiceActionDefinitionPtrOutputWithContext(context.Background())
}

func (o ServiceActionDefinitionOutput) ToServiceActionDefinitionPtrOutputWithContext(ctx context.Context) ServiceActionDefinitionPtrOutput {
	return o.ApplyT(func(v ServiceActionDefinition) *ServiceActionDefinition {
		return &v
	}).(ServiceActionDefinitionPtrOutput)
}

// ARN of the role that performs the self-service actions on your behalf. For example, `arn:aws:iam::12345678910:role/ActionRole`. To reuse the provisioned product launch role, set to `LAUNCH_ROLE`.
func (o ServiceActionDefinitionOutput) AssumeRole() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ServiceActionDefinition) *string { return v.AssumeRole }).(pulumi.StringPtrOutput)
}

// Name of the SSM document. For example, `AWS-RestartEC2Instance`. If you are using a shared SSM document, you must provide the ARN instead of the name.
func (o ServiceActionDefinitionOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v ServiceActionDefinition) string { return v.Name }).(pulumi.StringOutput)
}

// List of parameters in JSON format. For example: `[{\"Name\":\"InstanceId\",\"Type\":\"TARGET\"}]` or `[{\"Name\":\"InstanceId\",\"Type\":\"TEXT_VALUE\"}]`.
func (o ServiceActionDefinitionOutput) Parameters() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ServiceActionDefinition) *string { return v.Parameters }).(pulumi.StringPtrOutput)
}

// Service action definition type. Valid value is `SSM_AUTOMATION`. Default is `SSM_AUTOMATION`.
func (o ServiceActionDefinitionOutput) Type() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ServiceActionDefinition) *string { return v.Type }).(pulumi.StringPtrOutput)
}

// SSM document version. For example, `1`.
func (o ServiceActionDefinitionOutput) Version() pulumi.StringOutput {
	return o.ApplyT(func(v ServiceActionDefinition) string { return v.Version }).(pulumi.StringOutput)
}

type ServiceActionDefinitionPtrOutput struct{ *pulumi.OutputState }

func (ServiceActionDefinitionPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ServiceActionDefinition)(nil)).Elem()
}

func (o ServiceActionDefinitionPtrOutput) ToServiceActionDefinitionPtrOutput() ServiceActionDefinitionPtrOutput {
	return o
}

func (o ServiceActionDefinitionPtrOutput) ToServiceActionDefinitionPtrOutputWithContext(ctx context.Context) ServiceActionDefinitionPtrOutput {
	return o
}

func (o ServiceActionDefinitionPtrOutput) Elem() ServiceActionDefinitionOutput {
	return o.ApplyT(func(v *ServiceActionDefinition) ServiceActionDefinition { return *v }).(ServiceActionDefinitionOutput)
}

// ARN of the role that performs the self-service actions on your behalf. For example, `arn:aws:iam::12345678910:role/ActionRole`. To reuse the provisioned product launch role, set to `LAUNCH_ROLE`.
func (o ServiceActionDefinitionPtrOutput) AssumeRole() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServiceActionDefinition) *string {
		if v == nil {
			return nil
		}
		return v.AssumeRole
	}).(pulumi.StringPtrOutput)
}

// Name of the SSM document. For example, `AWS-RestartEC2Instance`. If you are using a shared SSM document, you must provide the ARN instead of the name.
func (o ServiceActionDefinitionPtrOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServiceActionDefinition) *string {
		if v == nil {
			return nil
		}
		return &v.Name
	}).(pulumi.StringPtrOutput)
}

// List of parameters in JSON format. For example: `[{\"Name\":\"InstanceId\",\"Type\":\"TARGET\"}]` or `[{\"Name\":\"InstanceId\",\"Type\":\"TEXT_VALUE\"}]`.
func (o ServiceActionDefinitionPtrOutput) Parameters() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServiceActionDefinition) *string {
		if v == nil {
			return nil
		}
		return v.Parameters
	}).(pulumi.StringPtrOutput)
}

// Service action definition type. Valid value is `SSM_AUTOMATION`. Default is `SSM_AUTOMATION`.
func (o ServiceActionDefinitionPtrOutput) Type() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServiceActionDefinition) *string {
		if v == nil {
			return nil
		}
		return v.Type
	}).(pulumi.StringPtrOutput)
}

// SSM document version. For example, `1`.
func (o ServiceActionDefinitionPtrOutput) Version() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServiceActionDefinition) *string {
		if v == nil {
			return nil
		}
		return &v.Version
	}).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(ProductProvisioningArtifactParametersOutput{})
	pulumi.RegisterOutputType(ProductProvisioningArtifactParametersPtrOutput{})
	pulumi.RegisterOutputType(ServiceActionDefinitionOutput{})
	pulumi.RegisterOutputType(ServiceActionDefinitionPtrOutput{})
}