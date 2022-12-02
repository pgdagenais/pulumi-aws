// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../../types/input";
import * as outputs from "../../types/output";
import * as enums from "../../types/enums";
import * as utilities from "../../utilities";

import {RoutingRule} from "@/s3";

export interface IdentityPoolCognitoIdentityProvider {
    /**
     * The client ID for the Amazon Cognito Identity User Pool.
     */
    clientId?: pulumi.Input<string>;
    /**
     * The provider name for an Amazon Cognito Identity User Pool.
     */
    providerName?: pulumi.Input<string>;
    /**
     * Whether server-side token validation is enabled for the identity provider’s token or not.
     */
    serverSideTokenCheck?: pulumi.Input<boolean>;
}

export interface IdentityPoolRoleAttachmentRoleMapping {
    /**
     * Specifies the action to be taken if either no rules match the claim value for the Rules type, or there is no cognito:preferred_role claim and there are multiple cognito:roles matches for the Token type. `Required` if you specify Token or Rules as the Type.
     */
    ambiguousRoleResolution?: pulumi.Input<string>;
    /**
     * A string identifying the identity provider, for example, "graph.facebook.com" or "cognito-idp.us-east-1.amazonaws.com/us-east-1_abcdefghi:app_client_id". Depends on `cognitoIdentityProviders` set on `aws.cognito.IdentityPool` resource or a `aws.cognito.IdentityProvider` resource.
     */
    identityProvider: pulumi.Input<string>;
    /**
     * The Rules Configuration to be used for mapping users to roles. You can specify up to 25 rules per identity provider. Rules are evaluated in order. The first one to match specifies the role.
     */
    mappingRules?: pulumi.Input<pulumi.Input<inputs.cognito.IdentityPoolRoleAttachmentRoleMappingMappingRule>[]>;
    /**
     * The role mapping type.
     */
    type: pulumi.Input<string>;
}

export interface IdentityPoolRoleAttachmentRoleMappingMappingRule {
    /**
     * The claim name that must be present in the token, for example, "isAdmin" or "paid".
     */
    claim: pulumi.Input<string>;
    /**
     * The match condition that specifies how closely the claim value in the IdP token must match Value.
     */
    matchType: pulumi.Input<string>;
    /**
     * The role ARN.
     */
    roleArn: pulumi.Input<string>;
    /**
     * A brief string that the claim must match, for example, "paid" or "yes".
     */
    value: pulumi.Input<string>;
}

export interface ResourceServerScope {
    /**
     * The scope description.
     */
    scopeDescription: pulumi.Input<string>;
    /**
     * The scope name.
     */
    scopeName: pulumi.Input<string>;
}

export interface RiskConfigurationAccountTakeoverRiskConfiguration {
    /**
     * The compromised credentials risk configuration actions. See details below.
     */
    actions: pulumi.Input<inputs.cognito.RiskConfigurationAccountTakeoverRiskConfigurationActions>;
    /**
     * The notify configuration used to construct email notifications. See details below.
     */
    notifyConfiguration: pulumi.Input<inputs.cognito.RiskConfigurationAccountTakeoverRiskConfigurationNotifyConfiguration>;
}

export interface RiskConfigurationAccountTakeoverRiskConfigurationActions {
    /**
     * Action to take for a high risk. See action block below.
     */
    highAction?: pulumi.Input<inputs.cognito.RiskConfigurationAccountTakeoverRiskConfigurationActionsHighAction>;
    /**
     * Action to take for a low risk. See action block below.
     */
    lowAction?: pulumi.Input<inputs.cognito.RiskConfigurationAccountTakeoverRiskConfigurationActionsLowAction>;
    /**
     * Action to take for a medium risk. See action block below.
     */
    mediumAction?: pulumi.Input<inputs.cognito.RiskConfigurationAccountTakeoverRiskConfigurationActionsMediumAction>;
}

export interface RiskConfigurationAccountTakeoverRiskConfigurationActionsHighAction {
    /**
     * The event action. Valid values are `BLOCK` or `NO_ACTION`.
     */
    eventAction: pulumi.Input<string>;
    /**
     * Whether to send a notification.
     */
    notify: pulumi.Input<boolean>;
}

export interface RiskConfigurationAccountTakeoverRiskConfigurationActionsLowAction {
    /**
     * The event action. Valid values are `BLOCK` or `NO_ACTION`.
     */
    eventAction: pulumi.Input<string>;
    /**
     * Whether to send a notification.
     */
    notify: pulumi.Input<boolean>;
}

export interface RiskConfigurationAccountTakeoverRiskConfigurationActionsMediumAction {
    /**
     * The event action. Valid values are `BLOCK` or `NO_ACTION`.
     */
    eventAction: pulumi.Input<string>;
    /**
     * Whether to send a notification.
     */
    notify: pulumi.Input<boolean>;
}

export interface RiskConfigurationAccountTakeoverRiskConfigurationNotifyConfiguration {
    /**
     * Email template used when a detected risk event is blocked. See notify email type below.
     */
    blockEmail?: pulumi.Input<inputs.cognito.RiskConfigurationAccountTakeoverRiskConfigurationNotifyConfigurationBlockEmail>;
    /**
     * The email address that is sending the email. The address must be either individually verified with Amazon Simple Email Service, or from a domain that has been verified with Amazon SES.
     */
    from?: pulumi.Input<string>;
    /**
     * The multi-factor authentication (MFA) email template used when MFA is challenged as part of a detected risk. See notify email type below.
     */
    mfaEmail?: pulumi.Input<inputs.cognito.RiskConfigurationAccountTakeoverRiskConfigurationNotifyConfigurationMfaEmail>;
    /**
     * The email template used when a detected risk event is allowed. See notify email type below.
     */
    noActionEmail?: pulumi.Input<inputs.cognito.RiskConfigurationAccountTakeoverRiskConfigurationNotifyConfigurationNoActionEmail>;
    /**
     * The destination to which the receiver of an email should reply to.
     */
    replyTo?: pulumi.Input<string>;
    /**
     * The Amazon Resource Name (ARN) of the identity that is associated with the sending authorization policy. This identity permits Amazon Cognito to send for the email address specified in the From parameter.
     */
    sourceArn: pulumi.Input<string>;
}

export interface RiskConfigurationAccountTakeoverRiskConfigurationNotifyConfigurationBlockEmail {
    /**
     * The email HTML body.
     */
    htmlBody: pulumi.Input<string>;
    /**
     * The email subject.
     */
    subject: pulumi.Input<string>;
    textBody: pulumi.Input<string>;
}

export interface RiskConfigurationAccountTakeoverRiskConfigurationNotifyConfigurationMfaEmail {
    /**
     * The email HTML body.
     */
    htmlBody: pulumi.Input<string>;
    /**
     * The email subject.
     */
    subject: pulumi.Input<string>;
    textBody: pulumi.Input<string>;
}

export interface RiskConfigurationAccountTakeoverRiskConfigurationNotifyConfigurationNoActionEmail {
    /**
     * The email HTML body.
     */
    htmlBody: pulumi.Input<string>;
    /**
     * The email subject.
     */
    subject: pulumi.Input<string>;
    textBody: pulumi.Input<string>;
}

export interface RiskConfigurationCompromisedCredentialsRiskConfiguration {
    /**
     * The compromised credentials risk configuration actions. See details below.
     */
    actions: pulumi.Input<inputs.cognito.RiskConfigurationCompromisedCredentialsRiskConfigurationActions>;
    /**
     * Perform the action for these events. The default is to perform all events if no event filter is specified. Valid values are `SIGN_IN`, `PASSWORD_CHANGE`, and `SIGN_UP`.
     */
    eventFilters?: pulumi.Input<pulumi.Input<string>[]>;
}

export interface RiskConfigurationCompromisedCredentialsRiskConfigurationActions {
    /**
     * The event action. Valid values are `BLOCK` or `NO_ACTION`.
     */
    eventAction: pulumi.Input<string>;
}

export interface RiskConfigurationRiskExceptionConfiguration {
    /**
     * Overrides the risk decision to always block the pre-authentication requests. The IP range is in CIDR notation, a compact representation of an IP address and its routing prefix.
     */
    blockedIpRangeLists?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Risk detection isn't performed on the IP addresses in this range list. The IP range is in CIDR notation.
     */
    skippedIpRangeLists?: pulumi.Input<pulumi.Input<string>[]>;
}

export interface UserPoolAccountRecoverySetting {
    /**
     * List of Account Recovery Options of the following structure:
     */
    recoveryMechanisms: pulumi.Input<pulumi.Input<inputs.cognito.UserPoolAccountRecoverySettingRecoveryMechanism>[]>;
}

export interface UserPoolAccountRecoverySettingRecoveryMechanism {
    /**
     * Name of the attribute.
     */
    name: pulumi.Input<string>;
    /**
     * Positive integer specifying priority of a method with 1 being the highest priority.
     */
    priority: pulumi.Input<number>;
}

export interface UserPoolAdminCreateUserConfig {
    /**
     * Set to True if only the administrator is allowed to create user profiles. Set to False if users can sign themselves up via an app.
     */
    allowAdminCreateUserOnly?: pulumi.Input<boolean>;
    /**
     * Invite message template structure. Detailed below.
     */
    inviteMessageTemplate?: pulumi.Input<inputs.cognito.UserPoolAdminCreateUserConfigInviteMessageTemplate>;
}

export interface UserPoolAdminCreateUserConfigInviteMessageTemplate {
    /**
     * Email message template. Must contain the `{####}` placeholder. Conflicts with `emailVerificationMessage` argument.
     */
    emailMessage?: pulumi.Input<string>;
    /**
     * Subject line for the email message template. Conflicts with `emailVerificationSubject` argument.
     */
    emailSubject?: pulumi.Input<string>;
    /**
     * SMS message template. Must contain the `{####}` placeholder. Conflicts with `smsVerificationMessage` argument.
     */
    smsMessage?: pulumi.Input<string>;
}

export interface UserPoolClientAnalyticsConfiguration {
    /**
     * Application ARN for an Amazon Pinpoint application. Conflicts with `externalId` and `roleArn`.
     */
    applicationArn?: pulumi.Input<string>;
    /**
     * Application ID for an Amazon Pinpoint application.
     */
    applicationId?: pulumi.Input<string>;
    /**
     * ID for the Analytics Configuration. Conflicts with `applicationArn`.
     */
    externalId?: pulumi.Input<string>;
    /**
     * ARN of an IAM role that authorizes Amazon Cognito to publish events to Amazon Pinpoint analytics. Conflicts with `applicationArn`.
     */
    roleArn?: pulumi.Input<string>;
    /**
     * If set to `true`, Amazon Cognito will include user data in the events it publishes to Amazon Pinpoint analytics.
     */
    userDataShared?: pulumi.Input<boolean>;
}

export interface UserPoolClientTokenValidityUnits {
    /**
     * Time unit in for the value in `accessTokenValidity`, defaults to `hours`.
     */
    accessToken?: pulumi.Input<string>;
    /**
     * Time unit in for the value in `idTokenValidity`, defaults to `hours`.
     */
    idToken?: pulumi.Input<string>;
    /**
     * Time unit in for the value in `refreshTokenValidity`, defaults to `days`.
     */
    refreshToken?: pulumi.Input<string>;
}

export interface UserPoolDeviceConfiguration {
    /**
     * Whether a challenge is required on a new device. Only applicable to a new device.
     */
    challengeRequiredOnNewDevice?: pulumi.Input<boolean>;
    /**
     * Whether a device is only remembered on user prompt. `false` equates to "Always" remember, `true` is "User Opt In," and not using a `deviceConfiguration` block is "No."
     */
    deviceOnlyRememberedOnUserPrompt?: pulumi.Input<boolean>;
}

export interface UserPoolEmailConfiguration {
    /**
     * Email configuration set name from SES.
     */
    configurationSet?: pulumi.Input<string>;
    /**
     * Email delivery method to use. `COGNITO_DEFAULT` for the default email functionality built into Cognito or `DEVELOPER` to use your Amazon SES configuration.
     */
    emailSendingAccount?: pulumi.Input<string>;
    /**
     * Sender’s email address or sender’s display name with their email address (e.g., `john@example.com`, `John Smith <john@example.com>` or `\"John Smith Ph.D.\" <john@example.com>`). Escaped double quotes are required around display names that contain certain characters as specified in [RFC 5322](https://tools.ietf.org/html/rfc5322).
     */
    fromEmailAddress?: pulumi.Input<string>;
    /**
     * REPLY-TO email address.
     */
    replyToEmailAddress?: pulumi.Input<string>;
    /**
     * ARN of the SES verified email identity to to use. Required if `emailSendingAccount` is set to `DEVELOPER`.
     */
    sourceArn?: pulumi.Input<string>;
}

export interface UserPoolLambdaConfig {
    /**
     * ARN of the lambda creating an authentication challenge.
     */
    createAuthChallenge?: pulumi.Input<string>;
    /**
     * A custom email sender AWS Lambda trigger. See customEmailSender Below.
     */
    customEmailSender?: pulumi.Input<inputs.cognito.UserPoolLambdaConfigCustomEmailSender>;
    /**
     * Custom Message AWS Lambda trigger.
     */
    customMessage?: pulumi.Input<string>;
    /**
     * A custom SMS sender AWS Lambda trigger. See customSmsSender Below.
     */
    customSmsSender?: pulumi.Input<inputs.cognito.UserPoolLambdaConfigCustomSmsSender>;
    /**
     * Defines the authentication challenge.
     */
    defineAuthChallenge?: pulumi.Input<string>;
    /**
     * The Amazon Resource Name of Key Management Service Customer master keys. Amazon Cognito uses the key to encrypt codes and temporary passwords sent to CustomEmailSender and CustomSMSSender.
     */
    kmsKeyId?: pulumi.Input<string>;
    /**
     * Post-authentication AWS Lambda trigger.
     */
    postAuthentication?: pulumi.Input<string>;
    /**
     * Post-confirmation AWS Lambda trigger.
     */
    postConfirmation?: pulumi.Input<string>;
    /**
     * Pre-authentication AWS Lambda trigger.
     */
    preAuthentication?: pulumi.Input<string>;
    /**
     * Pre-registration AWS Lambda trigger.
     */
    preSignUp?: pulumi.Input<string>;
    /**
     * Allow to customize identity token claims before token generation.
     */
    preTokenGeneration?: pulumi.Input<string>;
    /**
     * User migration Lambda config type.
     */
    userMigration?: pulumi.Input<string>;
    /**
     * Verifies the authentication challenge response.
     */
    verifyAuthChallengeResponse?: pulumi.Input<string>;
}

export interface UserPoolLambdaConfigCustomEmailSender {
    /**
     * The Lambda Amazon Resource Name of the Lambda function that Amazon Cognito triggers to send SMS notifications to users.
     */
    lambdaArn: pulumi.Input<string>;
    /**
     * The Lambda version represents the signature of the "request" attribute in the "event" information Amazon Cognito passes to your custom SMS Lambda function. The only supported value is `V1_0`.
     */
    lambdaVersion: pulumi.Input<string>;
}

export interface UserPoolLambdaConfigCustomSmsSender {
    /**
     * The Lambda Amazon Resource Name of the Lambda function that Amazon Cognito triggers to send SMS notifications to users.
     */
    lambdaArn: pulumi.Input<string>;
    /**
     * The Lambda version represents the signature of the "request" attribute in the "event" information Amazon Cognito passes to your custom SMS Lambda function. The only supported value is `V1_0`.
     */
    lambdaVersion: pulumi.Input<string>;
}

export interface UserPoolPasswordPolicy {
    /**
     * Minimum length of the password policy that you have set.
     */
    minimumLength?: pulumi.Input<number>;
    /**
     * Whether you have required users to use at least one lowercase letter in their password.
     */
    requireLowercase?: pulumi.Input<boolean>;
    /**
     * Whether you have required users to use at least one number in their password.
     */
    requireNumbers?: pulumi.Input<boolean>;
    /**
     * Whether you have required users to use at least one symbol in their password.
     */
    requireSymbols?: pulumi.Input<boolean>;
    /**
     * Whether you have required users to use at least one uppercase letter in their password.
     */
    requireUppercase?: pulumi.Input<boolean>;
    /**
     * In the password policy you have set, refers to the number of days a temporary password is valid. If the user does not sign-in during this time, their password will need to be reset by an administrator.
     */
    temporaryPasswordValidityDays?: pulumi.Input<number>;
}

export interface UserPoolSchema {
    /**
     * Attribute data type. Must be one of `Boolean`, `Number`, `String`, `DateTime`.
     */
    attributeDataType: pulumi.Input<string>;
    /**
     * Whether the attribute type is developer only.
     */
    developerOnlyAttribute?: pulumi.Input<boolean>;
    /**
     * Whether the attribute can be changed once it has been created.
     */
    mutable?: pulumi.Input<boolean>;
    /**
     * Name of the attribute.
     */
    name: pulumi.Input<string>;
    /**
     * Configuration block for the constraints for an attribute of the number type. Detailed below.
     */
    numberAttributeConstraints?: pulumi.Input<inputs.cognito.UserPoolSchemaNumberAttributeConstraints>;
    /**
     * Whether a user pool attribute is required. If the attribute is required and the user does not provide a value, registration or sign-in will fail.
     */
    required?: pulumi.Input<boolean>;
    /**
     * Constraints for an attribute of the string type. Detailed below.
     */
    stringAttributeConstraints?: pulumi.Input<inputs.cognito.UserPoolSchemaStringAttributeConstraints>;
}

export interface UserPoolSchemaNumberAttributeConstraints {
    /**
     * Maximum value of an attribute that is of the number data type.
     */
    maxValue?: pulumi.Input<string>;
    /**
     * Minimum value of an attribute that is of the number data type.
     */
    minValue?: pulumi.Input<string>;
}

export interface UserPoolSchemaStringAttributeConstraints {
    /**
     * Maximum length of an attribute value of the string type.
     */
    maxLength?: pulumi.Input<string>;
    /**
     * Minimum length of an attribute value of the string type.
     */
    minLength?: pulumi.Input<string>;
}

export interface UserPoolSmsConfiguration {
    /**
     * External ID used in IAM role trust relationships. For more information about using external IDs, see [How to Use an External ID When Granting Access to Your AWS Resources to a Third Party](http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html).
     */
    externalId: pulumi.Input<string>;
    /**
     * ARN of the Amazon SNS caller. This is usually the IAM role that you've given Cognito permission to assume.
     */
    snsCallerArn: pulumi.Input<string>;
    /**
     * The AWS Region to use with Amazon SNS integration. You can choose the same Region as your user pool, or a supported Legacy Amazon SNS alternate Region. Amazon Cognito resources in the Asia Pacific (Seoul) AWS Region must use your Amazon SNS configuration in the Asia Pacific (Tokyo) Region. For more information, see [SMS message settings for Amazon Cognito user pools](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-sms-settings.html).
     */
    snsRegion?: pulumi.Input<string>;
}

export interface UserPoolSoftwareTokenMfaConfiguration {
    /**
     * Boolean whether to enable software token Multi-Factor (MFA) tokens, such as Time-based One-Time Password (TOTP). To disable software token MFA When `smsConfiguration` is not present, the `mfaConfiguration` argument must be set to `OFF` and the `softwareTokenMfaConfiguration` configuration block must be fully removed.
     */
    enabled: pulumi.Input<boolean>;
}

export interface UserPoolUserAttributeUpdateSettings {
    /**
     * A list of attributes requiring verification before update. If set, the provided value(s) must also be set in `autoVerifiedAttributes`. Valid values: `email`, `phoneNumber`.
     */
    attributesRequireVerificationBeforeUpdates: pulumi.Input<pulumi.Input<string>[]>;
}

export interface UserPoolUserPoolAddOns {
    /**
     * Mode for advanced security, must be one of `OFF`, `AUDIT` or `ENFORCED`.
     */
    advancedSecurityMode: pulumi.Input<string>;
}

export interface UserPoolUsernameConfiguration {
    /**
     * Whether username case sensitivity will be applied for all users in the user pool through Cognito APIs.
     */
    caseSensitive: pulumi.Input<boolean>;
}

export interface UserPoolVerificationMessageTemplate {
    /**
     * Default email option. Must be either `CONFIRM_WITH_CODE` or `CONFIRM_WITH_LINK`. Defaults to `CONFIRM_WITH_CODE`.
     */
    defaultEmailOption?: pulumi.Input<string>;
    /**
     * Email message template. Must contain the `{####}` placeholder. Conflicts with `emailVerificationMessage` argument.
     */
    emailMessage?: pulumi.Input<string>;
    /**
     * Email message template for sending a confirmation link to the user, it must contain the `{##Click Here##}` placeholder.
     */
    emailMessageByLink?: pulumi.Input<string>;
    /**
     * Subject line for the email message template. Conflicts with `emailVerificationSubject` argument.
     */
    emailSubject?: pulumi.Input<string>;
    /**
     * Subject line for the email message template for sending a confirmation link to the user.
     */
    emailSubjectByLink?: pulumi.Input<string>;
    /**
     * SMS message template. Must contain the `{####}` placeholder. Conflicts with `smsVerificationMessage` argument.
     */
    smsMessage?: pulumi.Input<string>;
}