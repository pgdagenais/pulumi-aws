// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dynamodb

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Data source for retrieving a value from an AWS DynamoDB table.
//
// ## Example Usage
// ### Basic Usage
//
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/dynamodb"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err = dynamodb.LookupTableItem(ctx, &dynamodb.LookupTableItemArgs{
//				TableName: aws_dynamodb_table.Example.Name,
//				ExpressionAttributeNames: map[string]interface{}{
//					"#P": "Percentile",
//				},
//				ProjectionExpression: pulumi.StringRef("#P"),
//				Key:                  fmt.Sprintf("{\n	\"hashKey\": {\"S\": \"example\"}\n}\n"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupTableItem(ctx *pulumi.Context, args *LookupTableItemArgs, opts ...pulumi.InvokeOption) (*LookupTableItemResult, error) {
	var rv LookupTableItemResult
	err := ctx.Invoke("aws:dynamodb/getTableItem:getTableItem", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getTableItem.
type LookupTableItemArgs struct {
	ExpressionAttributeNames map[string]string `pulumi:"expressionAttributeNames"`
	// A map of attribute names to AttributeValue objects, representing the primary key of the item to retrieve.
	// For the primary key, you must provide all of the attributes. For example, with a simple primary key, you only need to provide a value for the partition key. For a composite primary key, you must provide values for both the partition key and the sort key.
	Key string `pulumi:"key"`
	// A string that identifies one or more attributes to retrieve from the table. These attributes can include scalars, sets, or elements of a JSON document. The attributes in the expression must be separated by commas.
	// If no attribute names are specified, then all attributes are returned. If any of the requested attributes are not found, they do not appear in the result.
	ProjectionExpression *string `pulumi:"projectionExpression"`
	// The name of the table containing the requested item.
	TableName string `pulumi:"tableName"`
}

// A collection of values returned by getTableItem.
type LookupTableItemResult struct {
	ExpressionAttributeNames map[string]string `pulumi:"expressionAttributeNames"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A map of attribute names to [AttributeValue](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_AttributeValue.html) objects, as specified by ProjectionExpression.
	Item                 string  `pulumi:"item"`
	Key                  string  `pulumi:"key"`
	ProjectionExpression *string `pulumi:"projectionExpression"`
	TableName            string  `pulumi:"tableName"`
}

func LookupTableItemOutput(ctx *pulumi.Context, args LookupTableItemOutputArgs, opts ...pulumi.InvokeOption) LookupTableItemResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupTableItemResult, error) {
			args := v.(LookupTableItemArgs)
			r, err := LookupTableItem(ctx, &args, opts...)
			var s LookupTableItemResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupTableItemResultOutput)
}

// A collection of arguments for invoking getTableItem.
type LookupTableItemOutputArgs struct {
	ExpressionAttributeNames pulumi.StringMapInput `pulumi:"expressionAttributeNames"`
	// A map of attribute names to AttributeValue objects, representing the primary key of the item to retrieve.
	// For the primary key, you must provide all of the attributes. For example, with a simple primary key, you only need to provide a value for the partition key. For a composite primary key, you must provide values for both the partition key and the sort key.
	Key pulumi.StringInput `pulumi:"key"`
	// A string that identifies one or more attributes to retrieve from the table. These attributes can include scalars, sets, or elements of a JSON document. The attributes in the expression must be separated by commas.
	// If no attribute names are specified, then all attributes are returned. If any of the requested attributes are not found, they do not appear in the result.
	ProjectionExpression pulumi.StringPtrInput `pulumi:"projectionExpression"`
	// The name of the table containing the requested item.
	TableName pulumi.StringInput `pulumi:"tableName"`
}

func (LookupTableItemOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupTableItemArgs)(nil)).Elem()
}

// A collection of values returned by getTableItem.
type LookupTableItemResultOutput struct{ *pulumi.OutputState }

func (LookupTableItemResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupTableItemResult)(nil)).Elem()
}

func (o LookupTableItemResultOutput) ToLookupTableItemResultOutput() LookupTableItemResultOutput {
	return o
}

func (o LookupTableItemResultOutput) ToLookupTableItemResultOutputWithContext(ctx context.Context) LookupTableItemResultOutput {
	return o
}

func (o LookupTableItemResultOutput) ExpressionAttributeNames() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupTableItemResult) map[string]string { return v.ExpressionAttributeNames }).(pulumi.StringMapOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupTableItemResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTableItemResult) string { return v.Id }).(pulumi.StringOutput)
}

// A map of attribute names to [AttributeValue](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_AttributeValue.html) objects, as specified by ProjectionExpression.
func (o LookupTableItemResultOutput) Item() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTableItemResult) string { return v.Item }).(pulumi.StringOutput)
}

func (o LookupTableItemResultOutput) Key() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTableItemResult) string { return v.Key }).(pulumi.StringOutput)
}

func (o LookupTableItemResultOutput) ProjectionExpression() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupTableItemResult) *string { return v.ProjectionExpression }).(pulumi.StringPtrOutput)
}

func (o LookupTableItemResultOutput) TableName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTableItemResult) string { return v.TableName }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupTableItemResultOutput{})
}