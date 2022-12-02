# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['ResolverConfigArgs', 'ResolverConfig']

@pulumi.input_type
class ResolverConfigArgs:
    def __init__(__self__, *,
                 autodefined_reverse_flag: pulumi.Input[str],
                 resource_id: pulumi.Input[str]):
        """
        The set of arguments for constructing a ResolverConfig resource.
        :param pulumi.Input[str] autodefined_reverse_flag: Indicates whether or not the Resolver will create autodefined rules for reverse DNS lookups. Valid values: `ENABLE`, `DISABLE`.
        :param pulumi.Input[str] resource_id: The ID of the VPC that the configuration is for.
        """
        pulumi.set(__self__, "autodefined_reverse_flag", autodefined_reverse_flag)
        pulumi.set(__self__, "resource_id", resource_id)

    @property
    @pulumi.getter(name="autodefinedReverseFlag")
    def autodefined_reverse_flag(self) -> pulumi.Input[str]:
        """
        Indicates whether or not the Resolver will create autodefined rules for reverse DNS lookups. Valid values: `ENABLE`, `DISABLE`.
        """
        return pulumi.get(self, "autodefined_reverse_flag")

    @autodefined_reverse_flag.setter
    def autodefined_reverse_flag(self, value: pulumi.Input[str]):
        pulumi.set(self, "autodefined_reverse_flag", value)

    @property
    @pulumi.getter(name="resourceId")
    def resource_id(self) -> pulumi.Input[str]:
        """
        The ID of the VPC that the configuration is for.
        """
        return pulumi.get(self, "resource_id")

    @resource_id.setter
    def resource_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "resource_id", value)


@pulumi.input_type
class _ResolverConfigState:
    def __init__(__self__, *,
                 autodefined_reverse_flag: Optional[pulumi.Input[str]] = None,
                 owner_id: Optional[pulumi.Input[str]] = None,
                 resource_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ResolverConfig resources.
        :param pulumi.Input[str] autodefined_reverse_flag: Indicates whether or not the Resolver will create autodefined rules for reverse DNS lookups. Valid values: `ENABLE`, `DISABLE`.
        :param pulumi.Input[str] owner_id: The AWS account ID of the owner of the VPC that this resolver configuration applies to.
        :param pulumi.Input[str] resource_id: The ID of the VPC that the configuration is for.
        """
        if autodefined_reverse_flag is not None:
            pulumi.set(__self__, "autodefined_reverse_flag", autodefined_reverse_flag)
        if owner_id is not None:
            pulumi.set(__self__, "owner_id", owner_id)
        if resource_id is not None:
            pulumi.set(__self__, "resource_id", resource_id)

    @property
    @pulumi.getter(name="autodefinedReverseFlag")
    def autodefined_reverse_flag(self) -> Optional[pulumi.Input[str]]:
        """
        Indicates whether or not the Resolver will create autodefined rules for reverse DNS lookups. Valid values: `ENABLE`, `DISABLE`.
        """
        return pulumi.get(self, "autodefined_reverse_flag")

    @autodefined_reverse_flag.setter
    def autodefined_reverse_flag(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "autodefined_reverse_flag", value)

    @property
    @pulumi.getter(name="ownerId")
    def owner_id(self) -> Optional[pulumi.Input[str]]:
        """
        The AWS account ID of the owner of the VPC that this resolver configuration applies to.
        """
        return pulumi.get(self, "owner_id")

    @owner_id.setter
    def owner_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "owner_id", value)

    @property
    @pulumi.getter(name="resourceId")
    def resource_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the VPC that the configuration is for.
        """
        return pulumi.get(self, "resource_id")

    @resource_id.setter
    def resource_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_id", value)


class ResolverConfig(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 autodefined_reverse_flag: Optional[pulumi.Input[str]] = None,
                 resource_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Route 53 Resolver config resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example_vpc = aws.ec2.Vpc("exampleVpc",
            cidr_block="10.0.0.0/16",
            enable_dns_support=True,
            enable_dns_hostnames=True)
        example_resolver_config = aws.route53.ResolverConfig("exampleResolverConfig",
            resource_id=example_vpc.id,
            autodefined_reverse_flag="DISABLE")
        ```

        ## Import

        Route 53 Resolver configs can be imported using the Route 53 Resolver config ID, e.g.,

        ```sh
         $ pulumi import aws:route53/resolverConfig:ResolverConfig example rslvr-rc-715aa20c73a23da7
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] autodefined_reverse_flag: Indicates whether or not the Resolver will create autodefined rules for reverse DNS lookups. Valid values: `ENABLE`, `DISABLE`.
        :param pulumi.Input[str] resource_id: The ID of the VPC that the configuration is for.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ResolverConfigArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Route 53 Resolver config resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example_vpc = aws.ec2.Vpc("exampleVpc",
            cidr_block="10.0.0.0/16",
            enable_dns_support=True,
            enable_dns_hostnames=True)
        example_resolver_config = aws.route53.ResolverConfig("exampleResolverConfig",
            resource_id=example_vpc.id,
            autodefined_reverse_flag="DISABLE")
        ```

        ## Import

        Route 53 Resolver configs can be imported using the Route 53 Resolver config ID, e.g.,

        ```sh
         $ pulumi import aws:route53/resolverConfig:ResolverConfig example rslvr-rc-715aa20c73a23da7
        ```

        :param str resource_name: The name of the resource.
        :param ResolverConfigArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ResolverConfigArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 autodefined_reverse_flag: Optional[pulumi.Input[str]] = None,
                 resource_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ResolverConfigArgs.__new__(ResolverConfigArgs)

            if autodefined_reverse_flag is None and not opts.urn:
                raise TypeError("Missing required property 'autodefined_reverse_flag'")
            __props__.__dict__["autodefined_reverse_flag"] = autodefined_reverse_flag
            if resource_id is None and not opts.urn:
                raise TypeError("Missing required property 'resource_id'")
            __props__.__dict__["resource_id"] = resource_id
            __props__.__dict__["owner_id"] = None
        super(ResolverConfig, __self__).__init__(
            'aws:route53/resolverConfig:ResolverConfig',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            autodefined_reverse_flag: Optional[pulumi.Input[str]] = None,
            owner_id: Optional[pulumi.Input[str]] = None,
            resource_id: Optional[pulumi.Input[str]] = None) -> 'ResolverConfig':
        """
        Get an existing ResolverConfig resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] autodefined_reverse_flag: Indicates whether or not the Resolver will create autodefined rules for reverse DNS lookups. Valid values: `ENABLE`, `DISABLE`.
        :param pulumi.Input[str] owner_id: The AWS account ID of the owner of the VPC that this resolver configuration applies to.
        :param pulumi.Input[str] resource_id: The ID of the VPC that the configuration is for.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ResolverConfigState.__new__(_ResolverConfigState)

        __props__.__dict__["autodefined_reverse_flag"] = autodefined_reverse_flag
        __props__.__dict__["owner_id"] = owner_id
        __props__.__dict__["resource_id"] = resource_id
        return ResolverConfig(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="autodefinedReverseFlag")
    def autodefined_reverse_flag(self) -> pulumi.Output[str]:
        """
        Indicates whether or not the Resolver will create autodefined rules for reverse DNS lookups. Valid values: `ENABLE`, `DISABLE`.
        """
        return pulumi.get(self, "autodefined_reverse_flag")

    @property
    @pulumi.getter(name="ownerId")
    def owner_id(self) -> pulumi.Output[str]:
        """
        The AWS account ID of the owner of the VPC that this resolver configuration applies to.
        """
        return pulumi.get(self, "owner_id")

    @property
    @pulumi.getter(name="resourceId")
    def resource_id(self) -> pulumi.Output[str]:
        """
        The ID of the VPC that the configuration is for.
        """
        return pulumi.get(self, "resource_id")
