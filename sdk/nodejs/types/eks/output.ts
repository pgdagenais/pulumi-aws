// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../../types/input";
import * as outputs from "../../types/output";
import * as enums from "../../types/enums";
import * as utilities from "../../utilities";

import {RoutingRule} from "@/s3";

export interface ClusterCertificateAuthority {
    /**
     * Base64 encoded certificate data required to communicate with your cluster. Add this to the `certificate-authority-data` section of the `kubeconfig` file for your cluster.
     */
    data: string;
}

export interface ClusterEncryptionConfig {
    /**
     * Configuration block with provider for encryption. Detailed below.
     */
    provider: outputs.eks.ClusterEncryptionConfigProvider;
    /**
     * List of strings with resources to be encrypted. Valid values: `secrets`.
     */
    resources: string[];
}

export interface ClusterEncryptionConfigProvider {
    /**
     * ARN of the Key Management Service (KMS) customer master key (CMK). The CMK must be symmetric, created in the same region as the cluster, and if the CMK was created in a different account, the user must have access to the CMK. For more information, see [Allowing Users in Other Accounts to Use a CMK in the AWS Key Management Service Developer Guide](https://docs.aws.amazon.com/kms/latest/developerguide/key-policy-modifying-external-accounts.html).
     */
    keyArn: string;
}

export interface ClusterIdentity {
    /**
     * Nested block containing [OpenID Connect](https://openid.net/connect/) identity provider information for the cluster. Detailed below.
     */
    oidcs: outputs.eks.ClusterIdentityOidc[];
}

export interface ClusterIdentityOidc {
    /**
     * Issuer URL for the OpenID Connect identity provider.
     */
    issuer: string;
}

export interface ClusterKubernetesNetworkConfig {
    /**
     * The IP family used to assign Kubernetes pod and service addresses. Valid values are `ipv4` (default) and `ipv6`. You can only specify an IP family when you create a cluster, changing this value will force a new cluster to be created.
     */
    ipFamily: string;
    /**
     * The CIDR block to assign Kubernetes pod and service IP addresses from. If you don't specify a block, Kubernetes assigns addresses from either the 10.100.0.0/16 or 172.20.0.0/16 CIDR blocks. We recommend that you specify a block that does not overlap with resources in other networks that are peered or connected to your VPC. You can only specify a custom CIDR block when you create a cluster, changing this value will force a new cluster to be created. The block must meet the following requirements:
     */
    serviceIpv4Cidr: string;
    serviceIpv6Cidr: string;
}

export interface ClusterOutpostConfig {
    /**
     * The Amazon EC2 instance type that you want to use for your local Amazon EKS cluster on Outposts. The instance type that you specify is used for all Kubernetes control plane instances. The instance type can't be changed after cluster creation. Choose an instance type based on the number of nodes that your cluster will have. If your cluster will have:
     */
    controlPlaneInstanceType: string;
    /**
     * The ARN of the Outpost that you want to use for your local Amazon EKS cluster on Outposts. This argument is a list of arns, but only a single Outpost ARN is supported currently.
     */
    outpostArns: string[];
}

export interface ClusterVpcConfig {
    /**
     * Cluster security group that was created by Amazon EKS for the cluster. Managed node groups use this security group for control-plane-to-data-plane communication.
     */
    clusterSecurityGroupId: string;
    /**
     * Whether the Amazon EKS private API server endpoint is enabled. Default is `false`.
     */
    endpointPrivateAccess?: boolean;
    /**
     * Whether the Amazon EKS public API server endpoint is enabled. Default is `true`.
     */
    endpointPublicAccess?: boolean;
    /**
     * List of CIDR blocks. Indicates which CIDR blocks can access the Amazon EKS public API server endpoint when enabled. EKS defaults this to a list with `0.0.0.0/0`. The provider will only perform drift detection of its value when present in a configuration.
     */
    publicAccessCidrs: string[];
    /**
     * List of security group IDs for the cross-account elastic network interfaces that Amazon EKS creates to use to allow communication between your worker nodes and the Kubernetes control plane.
     */
    securityGroupIds?: string[];
    /**
     * List of subnet IDs. Must be in at least two different availability zones. Amazon EKS creates cross-account elastic network interfaces in these subnets to allow communication between your worker nodes and the Kubernetes control plane.
     */
    subnetIds: string[];
    /**
     * ID of the VPC associated with your cluster.
     */
    vpcId: string;
}

export interface FargateProfileSelector {
    /**
     * Key-value map of Kubernetes labels for selection.
     */
    labels?: {[key: string]: string};
    /**
     * Kubernetes namespace for selection.
     */
    namespace: string;
}

export interface GetClusterCertificateAuthority {
    /**
     * The base64 encoded certificate data required to communicate with your cluster. Add this to the `certificate-authority-data` section of the `kubeconfig` file for your cluster.
     */
    data: string;
}

export interface GetClusterIdentity {
    /**
     * Nested attribute containing [OpenID Connect](https://openid.net/connect/) identity provider information for the cluster.
     */
    oidcs: outputs.eks.GetClusterIdentityOidc[];
}

export interface GetClusterIdentityOidc {
    /**
     * Issuer URL for the OpenID Connect identity provider.
     */
    issuer: string;
}

export interface GetClusterKubernetesNetworkConfig {
    /**
     * `ipv4` or `ipv6`.
     */
    ipFamily: string;
    /**
     * The CIDR block to assign Kubernetes pod and service IP addresses from if `ipv4` was specified when the cluster was created.
     */
    serviceIpv4Cidr: string;
    /**
     * The CIDR block to assign Kubernetes pod and service IP addresses from if `ipv6` was specified when the cluster was created. Kubernetes assigns service addresses from the unique local address range (fc00::/7) because you can't specify a custom IPv6 CIDR block when you create the cluster.
     */
    serviceIpv6Cidr: string;
}

export interface GetClusterOutpostConfig {
    /**
     * The Amazon EC2 instance type for all Kubernetes control plane instances.
     */
    controlPlaneInstanceType: string;
    /**
     * List of ARNs of the Outposts hosting the EKS cluster. Only a single ARN is supported currently.
     */
    outpostArns: string[];
}

export interface GetClusterVpcConfig {
    /**
     * The cluster security group that was created by Amazon EKS for the cluster.
     */
    clusterSecurityGroupId: string;
    /**
     * Indicates whether or not the Amazon EKS private API server endpoint is enabled.
     */
    endpointPrivateAccess: boolean;
    /**
     * Indicates whether or not the Amazon EKS public API server endpoint is enabled.
     */
    endpointPublicAccess: boolean;
    /**
     * List of CIDR blocks. Indicates which CIDR blocks can access the Amazon EKS public API server endpoint.
     */
    publicAccessCidrs: string[];
    /**
     * List of security group IDs
     */
    securityGroupIds: string[];
    /**
     * List of subnet IDs
     */
    subnetIds: string[];
    /**
     * The VPC associated with your cluster.
     */
    vpcId: string;
}

export interface GetNodeGroupRemoteAccess {
    /**
     * EC2 Key Pair name that provides access for SSH communication with the worker nodes in the EKS Node Group.
     */
    ec2SshKey: string;
    /**
     * Set of EC2 Security Group IDs to allow SSH access (port 22) from on the worker nodes.
     */
    sourceSecurityGroupIds: string[];
}

export interface GetNodeGroupResource {
    /**
     * List of objects containing information about AutoScaling Groups.
     */
    autoscalingGroups: outputs.eks.GetNodeGroupResourceAutoscalingGroup[];
    /**
     * Identifier of the remote access EC2 Security Group.
     */
    remoteAccessSecurityGroupId: string;
}

export interface GetNodeGroupResourceAutoscalingGroup {
    /**
     * Name of the AutoScaling Group.
     */
    name: string;
}

export interface GetNodeGroupScalingConfig {
    /**
     * Desired number of worker nodes.
     */
    desiredSize: number;
    /**
     * Maximum number of worker nodes.
     */
    maxSize: number;
    /**
     * Minimum number of worker nodes.
     */
    minSize: number;
}

export interface GetNodeGroupTaint {
    /**
     * The effect of the taint.
     */
    effect: string;
    /**
     * The key of the taint.
     */
    key: string;
    /**
     * The value of the taint.
     */
    value: string;
}

export interface IdentityProviderConfigOidc {
    /**
     * Client ID for the OpenID Connect identity provider.
     */
    clientId: string;
    /**
     * The JWT claim that the provider will use to return groups.
     */
    groupsClaim?: string;
    /**
     * A prefix that is prepended to group claims e.g., `oidc:`.
     */
    groupsPrefix?: string;
    /**
     * The name of the identity provider config.
     */
    identityProviderConfigName: string;
    /**
     * Issuer URL for the OpenID Connect identity provider.
     */
    issuerUrl: string;
    /**
     * The key value pairs that describe required claims in the identity token.
     */
    requiredClaims?: {[key: string]: string};
    /**
     * The JWT claim that the provider will use as the username.
     */
    usernameClaim?: string;
    /**
     * A prefix that is prepended to username claims.
     */
    usernamePrefix?: string;
}

export interface NodeGroupLaunchTemplate {
    /**
     * Identifier of the EC2 Launch Template. Conflicts with `name`.
     */
    id: string;
    /**
     * Name of the EC2 Launch Template. Conflicts with `id`.
     */
    name: string;
    /**
     * EC2 Launch Template version number. While the API accepts values like `$Default` and `$Latest`, the API will convert the value to the associated version number (e.g., `1`) on read and the provider will show a difference on next plan. Using the `defaultVersion` or `latestVersion` attribute of the `aws.ec2.LaunchTemplate` resource or data source is recommended for this argument.
     */
    version: string;
}

export interface NodeGroupRemoteAccess {
    /**
     * EC2 Key Pair name that provides access for SSH communication with the worker nodes in the EKS Node Group. If you specify this configuration, but do not specify `sourceSecurityGroupIds` when you create an EKS Node Group, port 22 on the worker nodes is opened to the Internet (0.0.0.0/0).
     */
    ec2SshKey?: string;
    /**
     * Set of EC2 Security Group IDs to allow SSH access (port 22) from on the worker nodes. If you specify `ec2SshKey`, but do not specify this configuration when you create an EKS Node Group, port 22 on the worker nodes is opened to the Internet (0.0.0.0/0).
     */
    sourceSecurityGroupIds?: string[];
}

export interface NodeGroupResource {
    /**
     * List of objects containing information about AutoScaling Groups.
     */
    autoscalingGroups: outputs.eks.NodeGroupResourceAutoscalingGroup[];
    /**
     * Identifier of the remote access EC2 Security Group.
     */
    remoteAccessSecurityGroupId: string;
}

export interface NodeGroupResourceAutoscalingGroup {
    /**
     * Name of the EC2 Launch Template. Conflicts with `id`.
     */
    name: string;
}

export interface NodeGroupScalingConfig {
    /**
     * Desired number of worker nodes.
     */
    desiredSize: number;
    /**
     * Maximum number of worker nodes.
     */
    maxSize: number;
    /**
     * Minimum number of worker nodes.
     */
    minSize: number;
}

export interface NodeGroupTaint {
    /**
     * The effect of the taint. Valid values: `NO_SCHEDULE`, `NO_EXECUTE`, `PREFER_NO_SCHEDULE`.
     */
    effect: string;
    /**
     * The key of the taint. Maximum length of 63.
     */
    key: string;
    /**
     * The value of the taint. Maximum length of 63.
     */
    value?: string;
}

export interface NodeGroupUpdateConfig {
    /**
     * Desired max number of unavailable worker nodes during node group update.
     */
    maxUnavailable?: number;
    /**
     * Desired max percentage of unavailable worker nodes during node group update.
     */
    maxUnavailablePercentage?: number;
}
