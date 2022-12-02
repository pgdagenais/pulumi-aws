# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['RedrivePolicyArgs', 'RedrivePolicy']

@pulumi.input_type
class RedrivePolicyArgs:
    def __init__(__self__, *,
                 queue_url: pulumi.Input[str],
                 redrive_policy: pulumi.Input[str]):
        """
        The set of arguments for constructing a RedrivePolicy resource.
        :param pulumi.Input[str] queue_url: The URL of the SQS Queue to which to attach the policy
        :param pulumi.Input[str] redrive_policy: The JSON redrive policy for the SQS queue. Accepts two key/val pairs: `deadLetterTargetArn` and `maxReceiveCount`. Learn more in the [Amazon SQS dead-letter queues documentation](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-dead-letter-queues.html).
        """
        pulumi.set(__self__, "queue_url", queue_url)
        pulumi.set(__self__, "redrive_policy", redrive_policy)

    @property
    @pulumi.getter(name="queueUrl")
    def queue_url(self) -> pulumi.Input[str]:
        """
        The URL of the SQS Queue to which to attach the policy
        """
        return pulumi.get(self, "queue_url")

    @queue_url.setter
    def queue_url(self, value: pulumi.Input[str]):
        pulumi.set(self, "queue_url", value)

    @property
    @pulumi.getter(name="redrivePolicy")
    def redrive_policy(self) -> pulumi.Input[str]:
        """
        The JSON redrive policy for the SQS queue. Accepts two key/val pairs: `deadLetterTargetArn` and `maxReceiveCount`. Learn more in the [Amazon SQS dead-letter queues documentation](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-dead-letter-queues.html).
        """
        return pulumi.get(self, "redrive_policy")

    @redrive_policy.setter
    def redrive_policy(self, value: pulumi.Input[str]):
        pulumi.set(self, "redrive_policy", value)


@pulumi.input_type
class _RedrivePolicyState:
    def __init__(__self__, *,
                 queue_url: Optional[pulumi.Input[str]] = None,
                 redrive_policy: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering RedrivePolicy resources.
        :param pulumi.Input[str] queue_url: The URL of the SQS Queue to which to attach the policy
        :param pulumi.Input[str] redrive_policy: The JSON redrive policy for the SQS queue. Accepts two key/val pairs: `deadLetterTargetArn` and `maxReceiveCount`. Learn more in the [Amazon SQS dead-letter queues documentation](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-dead-letter-queues.html).
        """
        if queue_url is not None:
            pulumi.set(__self__, "queue_url", queue_url)
        if redrive_policy is not None:
            pulumi.set(__self__, "redrive_policy", redrive_policy)

    @property
    @pulumi.getter(name="queueUrl")
    def queue_url(self) -> Optional[pulumi.Input[str]]:
        """
        The URL of the SQS Queue to which to attach the policy
        """
        return pulumi.get(self, "queue_url")

    @queue_url.setter
    def queue_url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "queue_url", value)

    @property
    @pulumi.getter(name="redrivePolicy")
    def redrive_policy(self) -> Optional[pulumi.Input[str]]:
        """
        The JSON redrive policy for the SQS queue. Accepts two key/val pairs: `deadLetterTargetArn` and `maxReceiveCount`. Learn more in the [Amazon SQS dead-letter queues documentation](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-dead-letter-queues.html).
        """
        return pulumi.get(self, "redrive_policy")

    @redrive_policy.setter
    def redrive_policy(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "redrive_policy", value)


class RedrivePolicy(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 queue_url: Optional[pulumi.Input[str]] = None,
                 redrive_policy: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Allows you to set a redrive policy of an SQS Queue
        while referencing ARN of the dead letter queue inside the redrive policy.

        This is useful when you want to set a dedicated
        dead letter queue for a standard or FIFO queue, but need
        the dead letter queue to exist before setting the redrive policy.

        ## Example Usage

        ```python
        import pulumi
        import json
        import pulumi_aws as aws

        queue = aws.sqs.Queue("queue")
        ddl = aws.sqs.Queue("ddl", redrive_allow_policy=queue.arn.apply(lambda arn: json.dumps({
            "redrivePermission": "byQueue",
            "sourceQueueArns": [arn],
        })))
        redrive_policy = aws.sqs.RedrivePolicy("redrivePolicy",
            queue_url=queue.id,
            redrive_policy=ddl.arn.apply(lambda arn: json.dumps({
                "deadLetterTargetArn": arn,
                "maxReceiveCount": 4,
            })))
        ```

        ## Import

        SQS Queue Redrive Policies can be imported using the queue URL, e.g.,

        ```sh
         $ pulumi import aws:sqs/redrivePolicy:RedrivePolicy test https://queue.amazonaws.com/0123456789012/myqueue
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] queue_url: The URL of the SQS Queue to which to attach the policy
        :param pulumi.Input[str] redrive_policy: The JSON redrive policy for the SQS queue. Accepts two key/val pairs: `deadLetterTargetArn` and `maxReceiveCount`. Learn more in the [Amazon SQS dead-letter queues documentation](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-dead-letter-queues.html).
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: RedrivePolicyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Allows you to set a redrive policy of an SQS Queue
        while referencing ARN of the dead letter queue inside the redrive policy.

        This is useful when you want to set a dedicated
        dead letter queue for a standard or FIFO queue, but need
        the dead letter queue to exist before setting the redrive policy.

        ## Example Usage

        ```python
        import pulumi
        import json
        import pulumi_aws as aws

        queue = aws.sqs.Queue("queue")
        ddl = aws.sqs.Queue("ddl", redrive_allow_policy=queue.arn.apply(lambda arn: json.dumps({
            "redrivePermission": "byQueue",
            "sourceQueueArns": [arn],
        })))
        redrive_policy = aws.sqs.RedrivePolicy("redrivePolicy",
            queue_url=queue.id,
            redrive_policy=ddl.arn.apply(lambda arn: json.dumps({
                "deadLetterTargetArn": arn,
                "maxReceiveCount": 4,
            })))
        ```

        ## Import

        SQS Queue Redrive Policies can be imported using the queue URL, e.g.,

        ```sh
         $ pulumi import aws:sqs/redrivePolicy:RedrivePolicy test https://queue.amazonaws.com/0123456789012/myqueue
        ```

        :param str resource_name: The name of the resource.
        :param RedrivePolicyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(RedrivePolicyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 queue_url: Optional[pulumi.Input[str]] = None,
                 redrive_policy: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = RedrivePolicyArgs.__new__(RedrivePolicyArgs)

            if queue_url is None and not opts.urn:
                raise TypeError("Missing required property 'queue_url'")
            __props__.__dict__["queue_url"] = queue_url
            if redrive_policy is None and not opts.urn:
                raise TypeError("Missing required property 'redrive_policy'")
            __props__.__dict__["redrive_policy"] = redrive_policy
        super(RedrivePolicy, __self__).__init__(
            'aws:sqs/redrivePolicy:RedrivePolicy',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            queue_url: Optional[pulumi.Input[str]] = None,
            redrive_policy: Optional[pulumi.Input[str]] = None) -> 'RedrivePolicy':
        """
        Get an existing RedrivePolicy resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] queue_url: The URL of the SQS Queue to which to attach the policy
        :param pulumi.Input[str] redrive_policy: The JSON redrive policy for the SQS queue. Accepts two key/val pairs: `deadLetterTargetArn` and `maxReceiveCount`. Learn more in the [Amazon SQS dead-letter queues documentation](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-dead-letter-queues.html).
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _RedrivePolicyState.__new__(_RedrivePolicyState)

        __props__.__dict__["queue_url"] = queue_url
        __props__.__dict__["redrive_policy"] = redrive_policy
        return RedrivePolicy(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="queueUrl")
    def queue_url(self) -> pulumi.Output[str]:
        """
        The URL of the SQS Queue to which to attach the policy
        """
        return pulumi.get(self, "queue_url")

    @property
    @pulumi.getter(name="redrivePolicy")
    def redrive_policy(self) -> pulumi.Output[str]:
        """
        The JSON redrive policy for the SQS queue. Accepts two key/val pairs: `deadLetterTargetArn` and `maxReceiveCount`. Learn more in the [Amazon SQS dead-letter queues documentation](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-dead-letter-queues.html).
        """
        return pulumi.get(self, "redrive_policy")
