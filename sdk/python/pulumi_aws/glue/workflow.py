# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from .. import utilities, tables

class Workflow(pulumi.CustomResource):
    default_run_properties: pulumi.Output[dict]
    """
    A map of default run properties for this workflow. These properties are passed to all jobs associated to the workflow.
    """
    description: pulumi.Output[str]
    """
    Description of the workflow.
    """
    name: pulumi.Output[str]
    """
    The name you assign to this workflow.
    """
    def __init__(__self__, resource_name, opts=None, default_run_properties=None, description=None, name=None, __props__=None, __name__=None, __opts__=None):
        """
        Provides a Glue Workflow resource.
        The workflow graph (DAG) can be build using the `glue.Trigger` resource. 
        See the example below for creating a graph with four nodes (two triggers and two jobs). 
        
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[dict] default_run_properties: A map of default run properties for this workflow. These properties are passed to all jobs associated to the workflow.
        :param pulumi.Input[str] description: Description of the workflow.
        :param pulumi.Input[str] name: The name you assign to this workflow.

        > This content is derived from https://github.com/terraform-providers/terraform-provider-aws/blob/master/website/docs/r/glue_workflow.html.markdown.
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            __props__['default_run_properties'] = default_run_properties
            __props__['description'] = description
            __props__['name'] = name
        super(Workflow, __self__).__init__(
            'aws:glue/workflow:Workflow',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name, id, opts=None, default_run_properties=None, description=None, name=None):
        """
        Get an existing Workflow resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.
        
        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[dict] default_run_properties: A map of default run properties for this workflow. These properties are passed to all jobs associated to the workflow.
        :param pulumi.Input[str] description: Description of the workflow.
        :param pulumi.Input[str] name: The name you assign to this workflow.

        > This content is derived from https://github.com/terraform-providers/terraform-provider-aws/blob/master/website/docs/r/glue_workflow.html.markdown.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()
        __props__["default_run_properties"] = default_run_properties
        __props__["description"] = description
        __props__["name"] = name
        return Workflow(resource_name, opts=opts, __props__=__props__)
    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop
