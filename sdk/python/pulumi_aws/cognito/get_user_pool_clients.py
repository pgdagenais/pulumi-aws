# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'GetUserPoolClientsResult',
    'AwaitableGetUserPoolClientsResult',
    'get_user_pool_clients',
    'get_user_pool_clients_output',
]

@pulumi.output_type
class GetUserPoolClientsResult:
    """
    A collection of values returned by getUserPoolClients.
    """
    def __init__(__self__, client_ids=None, client_names=None, id=None, user_pool_id=None):
        if client_ids and not isinstance(client_ids, list):
            raise TypeError("Expected argument 'client_ids' to be a list")
        pulumi.set(__self__, "client_ids", client_ids)
        if client_names and not isinstance(client_names, list):
            raise TypeError("Expected argument 'client_names' to be a list")
        pulumi.set(__self__, "client_names", client_names)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if user_pool_id and not isinstance(user_pool_id, str):
            raise TypeError("Expected argument 'user_pool_id' to be a str")
        pulumi.set(__self__, "user_pool_id", user_pool_id)

    @property
    @pulumi.getter(name="clientIds")
    def client_ids(self) -> Sequence[str]:
        """
        List of Cognito user pool client IDs.
        """
        return pulumi.get(self, "client_ids")

    @property
    @pulumi.getter(name="clientNames")
    def client_names(self) -> Sequence[str]:
        """
        List of Cognito user pool client names.
        """
        return pulumi.get(self, "client_names")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="userPoolId")
    def user_pool_id(self) -> str:
        return pulumi.get(self, "user_pool_id")


class AwaitableGetUserPoolClientsResult(GetUserPoolClientsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetUserPoolClientsResult(
            client_ids=self.client_ids,
            client_names=self.client_names,
            id=self.id,
            user_pool_id=self.user_pool_id)


def get_user_pool_clients(user_pool_id: Optional[str] = None,
                          opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetUserPoolClientsResult:
    """
    Use this data source to get a list of Cognito user pools clients for a Cognito IdP user pool.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    main = aws.cognito.get_user_pool_clients(user_pool_id=aws_cognito_user_pool["main"]["id"])
    ```


    :param str user_pool_id: The Cognito user pool ID.
    """
    __args__ = dict()
    __args__['userPoolId'] = user_pool_id
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('aws:cognito/getUserPoolClients:getUserPoolClients', __args__, opts=opts, typ=GetUserPoolClientsResult).value

    return AwaitableGetUserPoolClientsResult(
        client_ids=__ret__.client_ids,
        client_names=__ret__.client_names,
        id=__ret__.id,
        user_pool_id=__ret__.user_pool_id)


@_utilities.lift_output_func(get_user_pool_clients)
def get_user_pool_clients_output(user_pool_id: Optional[pulumi.Input[str]] = None,
                                 opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetUserPoolClientsResult]:
    """
    Use this data source to get a list of Cognito user pools clients for a Cognito IdP user pool.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    main = aws.cognito.get_user_pool_clients(user_pool_id=aws_cognito_user_pool["main"]["id"])
    ```


    :param str user_pool_id: The Cognito user pool ID.
    """
    ...