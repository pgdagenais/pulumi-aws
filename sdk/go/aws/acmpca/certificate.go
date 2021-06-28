// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package acmpca

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a resource to issue a certificate using AWS Certificate Manager Private Certificate Authority (ACM PCA).
//
// ## Example Usage
//
// ## Import
//
// `aws_acmpca_certificate` can not be imported at this time.
type Certificate struct {
	pulumi.CustomResourceState

	// Amazon Resource Name (ARN) of the certificate.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// The PEM-encoded certificate value.
	Certificate pulumi.StringOutput `pulumi:"certificate"`
	// Amazon Resource Name (ARN) of the certificate authority.
	CertificateAuthorityArn pulumi.StringOutput `pulumi:"certificateAuthorityArn"`
	// The PEM-encoded certificate chain that includes any intermediate certificates and chains up to root CA.
	CertificateChain pulumi.StringOutput `pulumi:"certificateChain"`
	// Certificate Signing Request in PEM format.
	CertificateSigningRequest pulumi.StringOutput `pulumi:"certificateSigningRequest"`
	// Algorithm to use to sign certificate requests. Valid values: `SHA256WITHRSA`, `SHA256WITHECDSA`, `SHA384WITHRSA`, `SHA384WITHECDSA`, `SHA512WITHRSA`, `SHA512WITHECDSA`
	SigningAlgorithm pulumi.StringOutput `pulumi:"signingAlgorithm"`
	// The template to use when issuing a certificate. See [ACM PCA Documentation](https://docs.aws.amazon.com/acm-pca/latest/userguide/UsingTemplates.html) for more information.
	TemplateArn pulumi.StringPtrOutput `pulumi:"templateArn"`
	// Configures end of the validity period for the certificate. See validity block below.
	Validity CertificateValidityOutput `pulumi:"validity"`
}

// NewCertificate registers a new resource with the given unique name, arguments, and options.
func NewCertificate(ctx *pulumi.Context,
	name string, args *CertificateArgs, opts ...pulumi.ResourceOption) (*Certificate, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.CertificateAuthorityArn == nil {
		return nil, errors.New("invalid value for required argument 'CertificateAuthorityArn'")
	}
	if args.CertificateSigningRequest == nil {
		return nil, errors.New("invalid value for required argument 'CertificateSigningRequest'")
	}
	if args.SigningAlgorithm == nil {
		return nil, errors.New("invalid value for required argument 'SigningAlgorithm'")
	}
	if args.Validity == nil {
		return nil, errors.New("invalid value for required argument 'Validity'")
	}
	var resource Certificate
	err := ctx.RegisterResource("aws:acmpca/certificate:Certificate", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCertificate gets an existing Certificate resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCertificate(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CertificateState, opts ...pulumi.ResourceOption) (*Certificate, error) {
	var resource Certificate
	err := ctx.ReadResource("aws:acmpca/certificate:Certificate", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Certificate resources.
type certificateState struct {
	// Amazon Resource Name (ARN) of the certificate.
	Arn *string `pulumi:"arn"`
	// The PEM-encoded certificate value.
	Certificate *string `pulumi:"certificate"`
	// Amazon Resource Name (ARN) of the certificate authority.
	CertificateAuthorityArn *string `pulumi:"certificateAuthorityArn"`
	// The PEM-encoded certificate chain that includes any intermediate certificates and chains up to root CA.
	CertificateChain *string `pulumi:"certificateChain"`
	// Certificate Signing Request in PEM format.
	CertificateSigningRequest *string `pulumi:"certificateSigningRequest"`
	// Algorithm to use to sign certificate requests. Valid values: `SHA256WITHRSA`, `SHA256WITHECDSA`, `SHA384WITHRSA`, `SHA384WITHECDSA`, `SHA512WITHRSA`, `SHA512WITHECDSA`
	SigningAlgorithm *string `pulumi:"signingAlgorithm"`
	// The template to use when issuing a certificate. See [ACM PCA Documentation](https://docs.aws.amazon.com/acm-pca/latest/userguide/UsingTemplates.html) for more information.
	TemplateArn *string `pulumi:"templateArn"`
	// Configures end of the validity period for the certificate. See validity block below.
	Validity *CertificateValidity `pulumi:"validity"`
}

type CertificateState struct {
	// Amazon Resource Name (ARN) of the certificate.
	Arn pulumi.StringPtrInput
	// The PEM-encoded certificate value.
	Certificate pulumi.StringPtrInput
	// Amazon Resource Name (ARN) of the certificate authority.
	CertificateAuthorityArn pulumi.StringPtrInput
	// The PEM-encoded certificate chain that includes any intermediate certificates and chains up to root CA.
	CertificateChain pulumi.StringPtrInput
	// Certificate Signing Request in PEM format.
	CertificateSigningRequest pulumi.StringPtrInput
	// Algorithm to use to sign certificate requests. Valid values: `SHA256WITHRSA`, `SHA256WITHECDSA`, `SHA384WITHRSA`, `SHA384WITHECDSA`, `SHA512WITHRSA`, `SHA512WITHECDSA`
	SigningAlgorithm pulumi.StringPtrInput
	// The template to use when issuing a certificate. See [ACM PCA Documentation](https://docs.aws.amazon.com/acm-pca/latest/userguide/UsingTemplates.html) for more information.
	TemplateArn pulumi.StringPtrInput
	// Configures end of the validity period for the certificate. See validity block below.
	Validity CertificateValidityPtrInput
}

func (CertificateState) ElementType() reflect.Type {
	return reflect.TypeOf((*certificateState)(nil)).Elem()
}

type certificateArgs struct {
	// Amazon Resource Name (ARN) of the certificate authority.
	CertificateAuthorityArn string `pulumi:"certificateAuthorityArn"`
	// Certificate Signing Request in PEM format.
	CertificateSigningRequest string `pulumi:"certificateSigningRequest"`
	// Algorithm to use to sign certificate requests. Valid values: `SHA256WITHRSA`, `SHA256WITHECDSA`, `SHA384WITHRSA`, `SHA384WITHECDSA`, `SHA512WITHRSA`, `SHA512WITHECDSA`
	SigningAlgorithm string `pulumi:"signingAlgorithm"`
	// The template to use when issuing a certificate. See [ACM PCA Documentation](https://docs.aws.amazon.com/acm-pca/latest/userguide/UsingTemplates.html) for more information.
	TemplateArn *string `pulumi:"templateArn"`
	// Configures end of the validity period for the certificate. See validity block below.
	Validity CertificateValidity `pulumi:"validity"`
}

// The set of arguments for constructing a Certificate resource.
type CertificateArgs struct {
	// Amazon Resource Name (ARN) of the certificate authority.
	CertificateAuthorityArn pulumi.StringInput
	// Certificate Signing Request in PEM format.
	CertificateSigningRequest pulumi.StringInput
	// Algorithm to use to sign certificate requests. Valid values: `SHA256WITHRSA`, `SHA256WITHECDSA`, `SHA384WITHRSA`, `SHA384WITHECDSA`, `SHA512WITHRSA`, `SHA512WITHECDSA`
	SigningAlgorithm pulumi.StringInput
	// The template to use when issuing a certificate. See [ACM PCA Documentation](https://docs.aws.amazon.com/acm-pca/latest/userguide/UsingTemplates.html) for more information.
	TemplateArn pulumi.StringPtrInput
	// Configures end of the validity period for the certificate. See validity block below.
	Validity CertificateValidityInput
}

func (CertificateArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*certificateArgs)(nil)).Elem()
}

type CertificateInput interface {
	pulumi.Input

	ToCertificateOutput() CertificateOutput
	ToCertificateOutputWithContext(ctx context.Context) CertificateOutput
}

func (*Certificate) ElementType() reflect.Type {
	return reflect.TypeOf((*Certificate)(nil))
}

func (i *Certificate) ToCertificateOutput() CertificateOutput {
	return i.ToCertificateOutputWithContext(context.Background())
}

func (i *Certificate) ToCertificateOutputWithContext(ctx context.Context) CertificateOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CertificateOutput)
}

func (i *Certificate) ToCertificatePtrOutput() CertificatePtrOutput {
	return i.ToCertificatePtrOutputWithContext(context.Background())
}

func (i *Certificate) ToCertificatePtrOutputWithContext(ctx context.Context) CertificatePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CertificatePtrOutput)
}

type CertificatePtrInput interface {
	pulumi.Input

	ToCertificatePtrOutput() CertificatePtrOutput
	ToCertificatePtrOutputWithContext(ctx context.Context) CertificatePtrOutput
}

type certificatePtrType CertificateArgs

func (*certificatePtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**Certificate)(nil))
}

func (i *certificatePtrType) ToCertificatePtrOutput() CertificatePtrOutput {
	return i.ToCertificatePtrOutputWithContext(context.Background())
}

func (i *certificatePtrType) ToCertificatePtrOutputWithContext(ctx context.Context) CertificatePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CertificatePtrOutput)
}

// CertificateArrayInput is an input type that accepts CertificateArray and CertificateArrayOutput values.
// You can construct a concrete instance of `CertificateArrayInput` via:
//
//          CertificateArray{ CertificateArgs{...} }
type CertificateArrayInput interface {
	pulumi.Input

	ToCertificateArrayOutput() CertificateArrayOutput
	ToCertificateArrayOutputWithContext(context.Context) CertificateArrayOutput
}

type CertificateArray []CertificateInput

func (CertificateArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*Certificate)(nil))
}

func (i CertificateArray) ToCertificateArrayOutput() CertificateArrayOutput {
	return i.ToCertificateArrayOutputWithContext(context.Background())
}

func (i CertificateArray) ToCertificateArrayOutputWithContext(ctx context.Context) CertificateArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CertificateArrayOutput)
}

// CertificateMapInput is an input type that accepts CertificateMap and CertificateMapOutput values.
// You can construct a concrete instance of `CertificateMapInput` via:
//
//          CertificateMap{ "key": CertificateArgs{...} }
type CertificateMapInput interface {
	pulumi.Input

	ToCertificateMapOutput() CertificateMapOutput
	ToCertificateMapOutputWithContext(context.Context) CertificateMapOutput
}

type CertificateMap map[string]CertificateInput

func (CertificateMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*Certificate)(nil))
}

func (i CertificateMap) ToCertificateMapOutput() CertificateMapOutput {
	return i.ToCertificateMapOutputWithContext(context.Background())
}

func (i CertificateMap) ToCertificateMapOutputWithContext(ctx context.Context) CertificateMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CertificateMapOutput)
}

type CertificateOutput struct {
	*pulumi.OutputState
}

func (CertificateOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*Certificate)(nil))
}

func (o CertificateOutput) ToCertificateOutput() CertificateOutput {
	return o
}

func (o CertificateOutput) ToCertificateOutputWithContext(ctx context.Context) CertificateOutput {
	return o
}

func (o CertificateOutput) ToCertificatePtrOutput() CertificatePtrOutput {
	return o.ToCertificatePtrOutputWithContext(context.Background())
}

func (o CertificateOutput) ToCertificatePtrOutputWithContext(ctx context.Context) CertificatePtrOutput {
	return o.ApplyT(func(v Certificate) *Certificate {
		return &v
	}).(CertificatePtrOutput)
}

type CertificatePtrOutput struct {
	*pulumi.OutputState
}

func (CertificatePtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Certificate)(nil))
}

func (o CertificatePtrOutput) ToCertificatePtrOutput() CertificatePtrOutput {
	return o
}

func (o CertificatePtrOutput) ToCertificatePtrOutputWithContext(ctx context.Context) CertificatePtrOutput {
	return o
}

type CertificateArrayOutput struct{ *pulumi.OutputState }

func (CertificateArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]Certificate)(nil))
}

func (o CertificateArrayOutput) ToCertificateArrayOutput() CertificateArrayOutput {
	return o
}

func (o CertificateArrayOutput) ToCertificateArrayOutputWithContext(ctx context.Context) CertificateArrayOutput {
	return o
}

func (o CertificateArrayOutput) Index(i pulumi.IntInput) CertificateOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) Certificate {
		return vs[0].([]Certificate)[vs[1].(int)]
	}).(CertificateOutput)
}

type CertificateMapOutput struct{ *pulumi.OutputState }

func (CertificateMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]Certificate)(nil))
}

func (o CertificateMapOutput) ToCertificateMapOutput() CertificateMapOutput {
	return o
}

func (o CertificateMapOutput) ToCertificateMapOutputWithContext(ctx context.Context) CertificateMapOutput {
	return o
}

func (o CertificateMapOutput) MapIndex(k pulumi.StringInput) CertificateOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) Certificate {
		return vs[0].(map[string]Certificate)[vs[1].(string)]
	}).(CertificateOutput)
}

func init() {
	pulumi.RegisterOutputType(CertificateOutput{})
	pulumi.RegisterOutputType(CertificatePtrOutput{})
	pulumi.RegisterOutputType(CertificateArrayOutput{})
	pulumi.RegisterOutputType(CertificateMapOutput{})
}