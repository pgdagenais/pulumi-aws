// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../../types/input";
import * as outputs from "../../types/output";
import * as enums from "../../types/enums";
import * as utilities from "../../utilities";

import {RoutingRule} from "@/s3";

export interface GetPolicyDocumentStatement {
    /**
     * List of actions that this statement either allows or denies. For example, `["ec2:RunInstances", "s3:*"]`.
     */
    actions?: string[];
    /**
     * Configuration block for a condition. Detailed below.
     */
    conditions?: inputs.iam.GetPolicyDocumentStatementCondition[];
    /**
     * Whether this statement allows or denies the given actions. Valid values are `Allow` and `Deny`. Defaults to `Allow`.
     */
    effect?: string;
    /**
     * List of actions that this statement does *not* apply to. Use to apply a policy statement to all actions *except* those listed.
     */
    notActions?: string[];
    /**
     * Like `principals` except these are principals that the statement does *not* apply to.
     */
    notPrincipals?: inputs.iam.GetPolicyDocumentStatementNotPrincipal[];
    /**
     * List of resource ARNs that this statement does *not* apply to. Use to apply a policy statement to all resources *except* those listed. Conflicts with `resources`.
     */
    notResources?: string[];
    /**
     * Configuration block for principals. Detailed below.
     */
    principals?: inputs.iam.GetPolicyDocumentStatementPrincipal[];
    /**
     * List of resource ARNs that this statement applies to. This is required by AWS if used for an IAM policy. Conflicts with `notResources`.
     */
    resources?: string[];
    /**
     * Sid (statement ID) is an identifier for a policy statement.
     */
    sid?: string;
}

export interface GetPolicyDocumentStatementArgs {
    /**
     * List of actions that this statement either allows or denies. For example, `["ec2:RunInstances", "s3:*"]`.
     */
    actions?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Configuration block for a condition. Detailed below.
     */
    conditions?: pulumi.Input<pulumi.Input<inputs.iam.GetPolicyDocumentStatementConditionArgs>[]>;
    /**
     * Whether this statement allows or denies the given actions. Valid values are `Allow` and `Deny`. Defaults to `Allow`.
     */
    effect?: pulumi.Input<string>;
    /**
     * List of actions that this statement does *not* apply to. Use to apply a policy statement to all actions *except* those listed.
     */
    notActions?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Like `principals` except these are principals that the statement does *not* apply to.
     */
    notPrincipals?: pulumi.Input<pulumi.Input<inputs.iam.GetPolicyDocumentStatementNotPrincipalArgs>[]>;
    /**
     * List of resource ARNs that this statement does *not* apply to. Use to apply a policy statement to all resources *except* those listed. Conflicts with `resources`.
     */
    notResources?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Configuration block for principals. Detailed below.
     */
    principals?: pulumi.Input<pulumi.Input<inputs.iam.GetPolicyDocumentStatementPrincipalArgs>[]>;
    /**
     * List of resource ARNs that this statement applies to. This is required by AWS if used for an IAM policy. Conflicts with `notResources`.
     */
    resources?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Sid (statement ID) is an identifier for a policy statement.
     */
    sid?: pulumi.Input<string>;
}

export interface GetPolicyDocumentStatementCondition {
    /**
     * Name of the [IAM condition operator](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_condition_operators.html) to evaluate.
     */
    test: string;
    /**
     * Values to evaluate the condition against. If multiple values are provided, the condition matches if at least one of them applies. That is, AWS evaluates multiple values as though using an "OR" boolean operation.
     */
    values: string[];
    /**
     * Name of a [Context Variable](http://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements.html#AvailableKeys) to apply the condition to. Context variables may either be standard AWS variables starting with `aws:` or service-specific variables prefixed with the service name.
     */
    variable: string;
}

export interface GetPolicyDocumentStatementConditionArgs {
    /**
     * Name of the [IAM condition operator](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_condition_operators.html) to evaluate.
     */
    test: pulumi.Input<string>;
    /**
     * Values to evaluate the condition against. If multiple values are provided, the condition matches if at least one of them applies. That is, AWS evaluates multiple values as though using an "OR" boolean operation.
     */
    values: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Name of a [Context Variable](http://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements.html#AvailableKeys) to apply the condition to. Context variables may either be standard AWS variables starting with `aws:` or service-specific variables prefixed with the service name.
     */
    variable: pulumi.Input<string>;
}

export interface GetPolicyDocumentStatementNotPrincipal {
    /**
     * List of identifiers for principals. When `type` is `AWS`, these are IAM principal ARNs, e.g., `arn:aws:iam::12345678901:role/yak-role`.  When `type` is `Service`, these are AWS Service roles, e.g., `lambda.amazonaws.com`. When `type` is `Federated`, these are web identity users or SAML provider ARNs, e.g., `accounts.google.com` or `arn:aws:iam::12345678901:saml-provider/yak-saml-provider`. When `type` is `CanonicalUser`, these are [canonical user IDs](https://docs.aws.amazon.com/general/latest/gr/acct-identifiers.html#FindingCanonicalId), e.g., `79a59df900b949e55d96a1e698fbacedfd6e09d98eacf8f8d5218e7cd47ef2be`.
     */
    identifiers: string[];
    /**
     * Type of principal. Valid values include `AWS`, `Service`, `Federated`, `CanonicalUser` and `*`.
     */
    type: string;
}

export interface GetPolicyDocumentStatementNotPrincipalArgs {
    /**
     * List of identifiers for principals. When `type` is `AWS`, these are IAM principal ARNs, e.g., `arn:aws:iam::12345678901:role/yak-role`.  When `type` is `Service`, these are AWS Service roles, e.g., `lambda.amazonaws.com`. When `type` is `Federated`, these are web identity users or SAML provider ARNs, e.g., `accounts.google.com` or `arn:aws:iam::12345678901:saml-provider/yak-saml-provider`. When `type` is `CanonicalUser`, these are [canonical user IDs](https://docs.aws.amazon.com/general/latest/gr/acct-identifiers.html#FindingCanonicalId), e.g., `79a59df900b949e55d96a1e698fbacedfd6e09d98eacf8f8d5218e7cd47ef2be`.
     */
    identifiers: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Type of principal. Valid values include `AWS`, `Service`, `Federated`, `CanonicalUser` and `*`.
     */
    type: pulumi.Input<string>;
}

export interface GetPolicyDocumentStatementPrincipal {
    /**
     * List of identifiers for principals. When `type` is `AWS`, these are IAM principal ARNs, e.g., `arn:aws:iam::12345678901:role/yak-role`.  When `type` is `Service`, these are AWS Service roles, e.g., `lambda.amazonaws.com`. When `type` is `Federated`, these are web identity users or SAML provider ARNs, e.g., `accounts.google.com` or `arn:aws:iam::12345678901:saml-provider/yak-saml-provider`. When `type` is `CanonicalUser`, these are [canonical user IDs](https://docs.aws.amazon.com/general/latest/gr/acct-identifiers.html#FindingCanonicalId), e.g., `79a59df900b949e55d96a1e698fbacedfd6e09d98eacf8f8d5218e7cd47ef2be`.
     */
    identifiers: string[];
    /**
     * Type of principal. Valid values include `AWS`, `Service`, `Federated`, `CanonicalUser` and `*`.
     */
    type: string;
}

export interface GetPolicyDocumentStatementPrincipalArgs {
    /**
     * List of identifiers for principals. When `type` is `AWS`, these are IAM principal ARNs, e.g., `arn:aws:iam::12345678901:role/yak-role`.  When `type` is `Service`, these are AWS Service roles, e.g., `lambda.amazonaws.com`. When `type` is `Federated`, these are web identity users or SAML provider ARNs, e.g., `accounts.google.com` or `arn:aws:iam::12345678901:saml-provider/yak-saml-provider`. When `type` is `CanonicalUser`, these are [canonical user IDs](https://docs.aws.amazon.com/general/latest/gr/acct-identifiers.html#FindingCanonicalId), e.g., `79a59df900b949e55d96a1e698fbacedfd6e09d98eacf8f8d5218e7cd47ef2be`.
     */
    identifiers: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Type of principal. Valid values include `AWS`, `Service`, `Federated`, `CanonicalUser` and `*`.
     */
    type: pulumi.Input<string>;
}

export interface RoleInlinePolicy {
    /**
     * Name of the role policy.
     */
    name?: pulumi.Input<string>;
    /**
     * Policy document as a JSON formatted string.
     */
    policy?: pulumi.Input<string>;
}