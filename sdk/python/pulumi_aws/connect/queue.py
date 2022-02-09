# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['QueueArgs', 'Queue']

@pulumi.input_type
class QueueArgs:
    def __init__(__self__, *,
                 hours_of_operation_id: pulumi.Input[str],
                 instance_id: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None,
                 max_contacts: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 outbound_caller_config: Optional[pulumi.Input['QueueOutboundCallerConfigArgs']] = None,
                 quick_connect_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a Queue resource.
        :param pulumi.Input[str] hours_of_operation_id: Specifies the identifier of the Hours of Operation.
        :param pulumi.Input[str] instance_id: Specifies the identifier of the hosting Amazon Connect Instance.
        :param pulumi.Input[str] description: Specifies the description of the Queue.
        :param pulumi.Input[int] max_contacts: Specifies the maximum number of contacts that can be in the queue before it is considered full. Minimum value of 0.
        :param pulumi.Input[str] name: Specifies the name of the Queue.
        :param pulumi.Input['QueueOutboundCallerConfigArgs'] outbound_caller_config: A block that defines the outbound caller ID name, number, and outbound whisper flow. The Outbound Caller Config block is documented below.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] quick_connect_ids: Specifies a list of quick connects ids that determine the quick connects available to agents who are working the queue.
        :param pulumi.Input[str] status: Specifies the description of the Queue. Valid values are `ENABLED`, `DISABLED`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Tags to apply to the Queue. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
        """
        pulumi.set(__self__, "hours_of_operation_id", hours_of_operation_id)
        pulumi.set(__self__, "instance_id", instance_id)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if max_contacts is not None:
            pulumi.set(__self__, "max_contacts", max_contacts)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if outbound_caller_config is not None:
            pulumi.set(__self__, "outbound_caller_config", outbound_caller_config)
        if quick_connect_ids is not None:
            pulumi.set(__self__, "quick_connect_ids", quick_connect_ids)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)

    @property
    @pulumi.getter(name="hoursOfOperationId")
    def hours_of_operation_id(self) -> pulumi.Input[str]:
        """
        Specifies the identifier of the Hours of Operation.
        """
        return pulumi.get(self, "hours_of_operation_id")

    @hours_of_operation_id.setter
    def hours_of_operation_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "hours_of_operation_id", value)

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Input[str]:
        """
        Specifies the identifier of the hosting Amazon Connect Instance.
        """
        return pulumi.get(self, "instance_id")

    @instance_id.setter
    def instance_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "instance_id", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the description of the Queue.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="maxContacts")
    def max_contacts(self) -> Optional[pulumi.Input[int]]:
        """
        Specifies the maximum number of contacts that can be in the queue before it is considered full. Minimum value of 0.
        """
        return pulumi.get(self, "max_contacts")

    @max_contacts.setter
    def max_contacts(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "max_contacts", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the name of the Queue.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="outboundCallerConfig")
    def outbound_caller_config(self) -> Optional[pulumi.Input['QueueOutboundCallerConfigArgs']]:
        """
        A block that defines the outbound caller ID name, number, and outbound whisper flow. The Outbound Caller Config block is documented below.
        """
        return pulumi.get(self, "outbound_caller_config")

    @outbound_caller_config.setter
    def outbound_caller_config(self, value: Optional[pulumi.Input['QueueOutboundCallerConfigArgs']]):
        pulumi.set(self, "outbound_caller_config", value)

    @property
    @pulumi.getter(name="quickConnectIds")
    def quick_connect_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Specifies a list of quick connects ids that determine the quick connects available to agents who are working the queue.
        """
        return pulumi.get(self, "quick_connect_ids")

    @quick_connect_ids.setter
    def quick_connect_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "quick_connect_ids", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the description of the Queue. Valid values are `ENABLED`, `DISABLED`.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Tags to apply to the Queue. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
        """
        return pulumi.get(self, "tags_all")

    @tags_all.setter
    def tags_all(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags_all", value)


@pulumi.input_type
class _QueueState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 hours_of_operation_id: Optional[pulumi.Input[str]] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 max_contacts: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 outbound_caller_config: Optional[pulumi.Input['QueueOutboundCallerConfigArgs']] = None,
                 queue_id: Optional[pulumi.Input[str]] = None,
                 quick_connect_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering Queue resources.
        :param pulumi.Input[str] arn: The Amazon Resource Name (ARN) of the Queue.
        :param pulumi.Input[str] description: Specifies the description of the Queue.
        :param pulumi.Input[str] hours_of_operation_id: Specifies the identifier of the Hours of Operation.
        :param pulumi.Input[str] instance_id: Specifies the identifier of the hosting Amazon Connect Instance.
        :param pulumi.Input[int] max_contacts: Specifies the maximum number of contacts that can be in the queue before it is considered full. Minimum value of 0.
        :param pulumi.Input[str] name: Specifies the name of the Queue.
        :param pulumi.Input['QueueOutboundCallerConfigArgs'] outbound_caller_config: A block that defines the outbound caller ID name, number, and outbound whisper flow. The Outbound Caller Config block is documented below.
        :param pulumi.Input[str] queue_id: The identifier for the Queue.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] quick_connect_ids: Specifies a list of quick connects ids that determine the quick connects available to agents who are working the queue.
        :param pulumi.Input[str] status: Specifies the description of the Queue. Valid values are `ENABLED`, `DISABLED`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Tags to apply to the Queue. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if hours_of_operation_id is not None:
            pulumi.set(__self__, "hours_of_operation_id", hours_of_operation_id)
        if instance_id is not None:
            pulumi.set(__self__, "instance_id", instance_id)
        if max_contacts is not None:
            pulumi.set(__self__, "max_contacts", max_contacts)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if outbound_caller_config is not None:
            pulumi.set(__self__, "outbound_caller_config", outbound_caller_config)
        if queue_id is not None:
            pulumi.set(__self__, "queue_id", queue_id)
        if quick_connect_ids is not None:
            pulumi.set(__self__, "quick_connect_ids", quick_connect_ids)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        The Amazon Resource Name (ARN) of the Queue.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the description of the Queue.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="hoursOfOperationId")
    def hours_of_operation_id(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the identifier of the Hours of Operation.
        """
        return pulumi.get(self, "hours_of_operation_id")

    @hours_of_operation_id.setter
    def hours_of_operation_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "hours_of_operation_id", value)

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the identifier of the hosting Amazon Connect Instance.
        """
        return pulumi.get(self, "instance_id")

    @instance_id.setter
    def instance_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "instance_id", value)

    @property
    @pulumi.getter(name="maxContacts")
    def max_contacts(self) -> Optional[pulumi.Input[int]]:
        """
        Specifies the maximum number of contacts that can be in the queue before it is considered full. Minimum value of 0.
        """
        return pulumi.get(self, "max_contacts")

    @max_contacts.setter
    def max_contacts(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "max_contacts", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the name of the Queue.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="outboundCallerConfig")
    def outbound_caller_config(self) -> Optional[pulumi.Input['QueueOutboundCallerConfigArgs']]:
        """
        A block that defines the outbound caller ID name, number, and outbound whisper flow. The Outbound Caller Config block is documented below.
        """
        return pulumi.get(self, "outbound_caller_config")

    @outbound_caller_config.setter
    def outbound_caller_config(self, value: Optional[pulumi.Input['QueueOutboundCallerConfigArgs']]):
        pulumi.set(self, "outbound_caller_config", value)

    @property
    @pulumi.getter(name="queueId")
    def queue_id(self) -> Optional[pulumi.Input[str]]:
        """
        The identifier for the Queue.
        """
        return pulumi.get(self, "queue_id")

    @queue_id.setter
    def queue_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "queue_id", value)

    @property
    @pulumi.getter(name="quickConnectIds")
    def quick_connect_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Specifies a list of quick connects ids that determine the quick connects available to agents who are working the queue.
        """
        return pulumi.get(self, "quick_connect_ids")

    @quick_connect_ids.setter
    def quick_connect_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "quick_connect_ids", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the description of the Queue. Valid values are `ENABLED`, `DISABLED`.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Tags to apply to the Queue. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
        """
        return pulumi.get(self, "tags_all")

    @tags_all.setter
    def tags_all(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags_all", value)


class Queue(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 hours_of_operation_id: Optional[pulumi.Input[str]] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 max_contacts: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 outbound_caller_config: Optional[pulumi.Input[pulumi.InputType['QueueOutboundCallerConfigArgs']]] = None,
                 quick_connect_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Provides an Amazon Connect Queue resource. For more information see
        [Amazon Connect: Getting Started](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-get-started.html)

        > **NOTE:** Due to The behaviour of Amazon Connect you cannot delete queues.

        ## Example Usage
        ### Basic

        ```python
        import pulumi
        import pulumi_aws as aws

        test = aws.connect.Queue("test",
            description="Example Description",
            hours_of_operation_id="12345678-1234-1234-1234-123456789012",
            instance_id="aaaaaaaa-bbbb-cccc-dddd-111111111111",
            tags={
                "Name": "Example Queue",
            })
        ```
        ### With Quick Connect IDs

        ```python
        import pulumi
        import pulumi_aws as aws

        test = aws.connect.Queue("test",
            description="Example Description",
            hours_of_operation_id="12345678-1234-1234-1234-123456789012",
            instance_id="aaaaaaaa-bbbb-cccc-dddd-111111111111",
            quick_connect_ids=["12345678-abcd-1234-abcd-123456789012"],
            tags={
                "Name": "Example Queue with Quick Connect IDs",
            })
        ```
        ### With Outbound Caller Config

        ```python
        import pulumi
        import pulumi_aws as aws

        test = aws.connect.Queue("test",
            description="Example Description",
            hours_of_operation_id="12345678-1234-1234-1234-123456789012",
            instance_id="aaaaaaaa-bbbb-cccc-dddd-111111111111",
            outbound_caller_config=aws.connect.QueueOutboundCallerConfigArgs(
                outbound_caller_id_name="example",
                outbound_caller_id_number_id="12345678-abcd-1234-abcd-123456789012",
                outbound_flow_id="87654321-defg-1234-defg-987654321234",
            ),
            tags={
                "Name": "Example Queue with Outbound Caller Config",
            })
        ```

        ## Import

        Amazon Connect Queues can be imported using the `instance_id` and `queue_id` separated by a colon (`:`), e.g.,

        ```sh
         $ pulumi import aws:connect/queue:Queue example f1288a1f-6193-445a-b47e-af739b2:c1d4e5f6-1b3c-1b3c-1b3c-c1d4e5f6c1d4e5
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: Specifies the description of the Queue.
        :param pulumi.Input[str] hours_of_operation_id: Specifies the identifier of the Hours of Operation.
        :param pulumi.Input[str] instance_id: Specifies the identifier of the hosting Amazon Connect Instance.
        :param pulumi.Input[int] max_contacts: Specifies the maximum number of contacts that can be in the queue before it is considered full. Minimum value of 0.
        :param pulumi.Input[str] name: Specifies the name of the Queue.
        :param pulumi.Input[pulumi.InputType['QueueOutboundCallerConfigArgs']] outbound_caller_config: A block that defines the outbound caller ID name, number, and outbound whisper flow. The Outbound Caller Config block is documented below.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] quick_connect_ids: Specifies a list of quick connects ids that determine the quick connects available to agents who are working the queue.
        :param pulumi.Input[str] status: Specifies the description of the Queue. Valid values are `ENABLED`, `DISABLED`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Tags to apply to the Queue. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: QueueArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides an Amazon Connect Queue resource. For more information see
        [Amazon Connect: Getting Started](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-get-started.html)

        > **NOTE:** Due to The behaviour of Amazon Connect you cannot delete queues.

        ## Example Usage
        ### Basic

        ```python
        import pulumi
        import pulumi_aws as aws

        test = aws.connect.Queue("test",
            description="Example Description",
            hours_of_operation_id="12345678-1234-1234-1234-123456789012",
            instance_id="aaaaaaaa-bbbb-cccc-dddd-111111111111",
            tags={
                "Name": "Example Queue",
            })
        ```
        ### With Quick Connect IDs

        ```python
        import pulumi
        import pulumi_aws as aws

        test = aws.connect.Queue("test",
            description="Example Description",
            hours_of_operation_id="12345678-1234-1234-1234-123456789012",
            instance_id="aaaaaaaa-bbbb-cccc-dddd-111111111111",
            quick_connect_ids=["12345678-abcd-1234-abcd-123456789012"],
            tags={
                "Name": "Example Queue with Quick Connect IDs",
            })
        ```
        ### With Outbound Caller Config

        ```python
        import pulumi
        import pulumi_aws as aws

        test = aws.connect.Queue("test",
            description="Example Description",
            hours_of_operation_id="12345678-1234-1234-1234-123456789012",
            instance_id="aaaaaaaa-bbbb-cccc-dddd-111111111111",
            outbound_caller_config=aws.connect.QueueOutboundCallerConfigArgs(
                outbound_caller_id_name="example",
                outbound_caller_id_number_id="12345678-abcd-1234-abcd-123456789012",
                outbound_flow_id="87654321-defg-1234-defg-987654321234",
            ),
            tags={
                "Name": "Example Queue with Outbound Caller Config",
            })
        ```

        ## Import

        Amazon Connect Queues can be imported using the `instance_id` and `queue_id` separated by a colon (`:`), e.g.,

        ```sh
         $ pulumi import aws:connect/queue:Queue example f1288a1f-6193-445a-b47e-af739b2:c1d4e5f6-1b3c-1b3c-1b3c-c1d4e5f6c1d4e5
        ```

        :param str resource_name: The name of the resource.
        :param QueueArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(QueueArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 hours_of_operation_id: Optional[pulumi.Input[str]] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 max_contacts: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 outbound_caller_config: Optional[pulumi.Input[pulumi.InputType['QueueOutboundCallerConfigArgs']]] = None,
                 quick_connect_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = QueueArgs.__new__(QueueArgs)

            __props__.__dict__["description"] = description
            if hours_of_operation_id is None and not opts.urn:
                raise TypeError("Missing required property 'hours_of_operation_id'")
            __props__.__dict__["hours_of_operation_id"] = hours_of_operation_id
            if instance_id is None and not opts.urn:
                raise TypeError("Missing required property 'instance_id'")
            __props__.__dict__["instance_id"] = instance_id
            __props__.__dict__["max_contacts"] = max_contacts
            __props__.__dict__["name"] = name
            __props__.__dict__["outbound_caller_config"] = outbound_caller_config
            __props__.__dict__["quick_connect_ids"] = quick_connect_ids
            __props__.__dict__["status"] = status
            __props__.__dict__["tags"] = tags
            __props__.__dict__["tags_all"] = tags_all
            __props__.__dict__["arn"] = None
            __props__.__dict__["queue_id"] = None
        super(Queue, __self__).__init__(
            'aws:connect/queue:Queue',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            hours_of_operation_id: Optional[pulumi.Input[str]] = None,
            instance_id: Optional[pulumi.Input[str]] = None,
            max_contacts: Optional[pulumi.Input[int]] = None,
            name: Optional[pulumi.Input[str]] = None,
            outbound_caller_config: Optional[pulumi.Input[pulumi.InputType['QueueOutboundCallerConfigArgs']]] = None,
            queue_id: Optional[pulumi.Input[str]] = None,
            quick_connect_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            status: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None) -> 'Queue':
        """
        Get an existing Queue resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: The Amazon Resource Name (ARN) of the Queue.
        :param pulumi.Input[str] description: Specifies the description of the Queue.
        :param pulumi.Input[str] hours_of_operation_id: Specifies the identifier of the Hours of Operation.
        :param pulumi.Input[str] instance_id: Specifies the identifier of the hosting Amazon Connect Instance.
        :param pulumi.Input[int] max_contacts: Specifies the maximum number of contacts that can be in the queue before it is considered full. Minimum value of 0.
        :param pulumi.Input[str] name: Specifies the name of the Queue.
        :param pulumi.Input[pulumi.InputType['QueueOutboundCallerConfigArgs']] outbound_caller_config: A block that defines the outbound caller ID name, number, and outbound whisper flow. The Outbound Caller Config block is documented below.
        :param pulumi.Input[str] queue_id: The identifier for the Queue.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] quick_connect_ids: Specifies a list of quick connects ids that determine the quick connects available to agents who are working the queue.
        :param pulumi.Input[str] status: Specifies the description of the Queue. Valid values are `ENABLED`, `DISABLED`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Tags to apply to the Queue. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _QueueState.__new__(_QueueState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["description"] = description
        __props__.__dict__["hours_of_operation_id"] = hours_of_operation_id
        __props__.__dict__["instance_id"] = instance_id
        __props__.__dict__["max_contacts"] = max_contacts
        __props__.__dict__["name"] = name
        __props__.__dict__["outbound_caller_config"] = outbound_caller_config
        __props__.__dict__["queue_id"] = queue_id
        __props__.__dict__["quick_connect_ids"] = quick_connect_ids
        __props__.__dict__["status"] = status
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        return Queue(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        The Amazon Resource Name (ARN) of the Queue.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        Specifies the description of the Queue.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="hoursOfOperationId")
    def hours_of_operation_id(self) -> pulumi.Output[str]:
        """
        Specifies the identifier of the Hours of Operation.
        """
        return pulumi.get(self, "hours_of_operation_id")

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Output[str]:
        """
        Specifies the identifier of the hosting Amazon Connect Instance.
        """
        return pulumi.get(self, "instance_id")

    @property
    @pulumi.getter(name="maxContacts")
    def max_contacts(self) -> pulumi.Output[Optional[int]]:
        """
        Specifies the maximum number of contacts that can be in the queue before it is considered full. Minimum value of 0.
        """
        return pulumi.get(self, "max_contacts")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Specifies the name of the Queue.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="outboundCallerConfig")
    def outbound_caller_config(self) -> pulumi.Output[Optional['outputs.QueueOutboundCallerConfig']]:
        """
        A block that defines the outbound caller ID name, number, and outbound whisper flow. The Outbound Caller Config block is documented below.
        """
        return pulumi.get(self, "outbound_caller_config")

    @property
    @pulumi.getter(name="queueId")
    def queue_id(self) -> pulumi.Output[str]:
        """
        The identifier for the Queue.
        """
        return pulumi.get(self, "queue_id")

    @property
    @pulumi.getter(name="quickConnectIds")
    def quick_connect_ids(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        Specifies a list of quick connects ids that determine the quick connects available to agents who are working the queue.
        """
        return pulumi.get(self, "quick_connect_ids")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        Specifies the description of the Queue. Valid values are `ENABLED`, `DISABLED`.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        Tags to apply to the Queue. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> pulumi.Output[Mapping[str, str]]:
        """
        A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
        """
        return pulumi.get(self, "tags_all")
