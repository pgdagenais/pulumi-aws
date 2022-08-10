// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.organizations.inputs;

import com.pulumi.aws.organizations.inputs.OrganizationAccountArgs;
import com.pulumi.aws.organizations.inputs.OrganizationNonMasterAccountArgs;
import com.pulumi.aws.organizations.inputs.OrganizationRootArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OrganizationState extends com.pulumi.resources.ResourceArgs {

    public static final OrganizationState Empty = new OrganizationState();

    /**
     * List of organization accounts including the master account. For a list excluding the master account, see the `non_master_accounts` attribute. All elements have these attributes:
     * 
     */
    @Import(name="accounts")
    private @Nullable Output<List<OrganizationAccountArgs>> accounts;

    /**
     * @return List of organization accounts including the master account. For a list excluding the master account, see the `non_master_accounts` attribute. All elements have these attributes:
     * 
     */
    public Optional<Output<List<OrganizationAccountArgs>>> accounts() {
        return Optional.ofNullable(this.accounts);
    }

    /**
     * ARN of the root
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return ARN of the root
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * List of AWS service principal names for which you want to enable integration with your organization. This is typically in the form of a URL, such as service-abbreviation.amazonaws.com. Organization must have `feature_set` set to `ALL`. For additional information, see the [AWS Organizations User Guide](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services.html).
     * 
     */
    @Import(name="awsServiceAccessPrincipals")
    private @Nullable Output<List<String>> awsServiceAccessPrincipals;

    /**
     * @return List of AWS service principal names for which you want to enable integration with your organization. This is typically in the form of a URL, such as service-abbreviation.amazonaws.com. Organization must have `feature_set` set to `ALL`. For additional information, see the [AWS Organizations User Guide](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services.html).
     * 
     */
    public Optional<Output<List<String>>> awsServiceAccessPrincipals() {
        return Optional.ofNullable(this.awsServiceAccessPrincipals);
    }

    /**
     * List of Organizations policy types to enable in the Organization Root. Organization must have `feature_set` set to `ALL`. For additional information about valid policy types (e.g., `AISERVICES_OPT_OUT_POLICY`, `BACKUP_POLICY`, `SERVICE_CONTROL_POLICY`, and `TAG_POLICY`), see the [AWS Organizations API Reference](https://docs.aws.amazon.com/organizations/latest/APIReference/API_EnablePolicyType.html).
     * 
     */
    @Import(name="enabledPolicyTypes")
    private @Nullable Output<List<String>> enabledPolicyTypes;

    /**
     * @return List of Organizations policy types to enable in the Organization Root. Organization must have `feature_set` set to `ALL`. For additional information about valid policy types (e.g., `AISERVICES_OPT_OUT_POLICY`, `BACKUP_POLICY`, `SERVICE_CONTROL_POLICY`, and `TAG_POLICY`), see the [AWS Organizations API Reference](https://docs.aws.amazon.com/organizations/latest/APIReference/API_EnablePolicyType.html).
     * 
     */
    public Optional<Output<List<String>>> enabledPolicyTypes() {
        return Optional.ofNullable(this.enabledPolicyTypes);
    }

    /**
     * Specify &#34;ALL&#34; (default) or &#34;CONSOLIDATED_BILLING&#34;.
     * 
     */
    @Import(name="featureSet")
    private @Nullable Output<String> featureSet;

    /**
     * @return Specify &#34;ALL&#34; (default) or &#34;CONSOLIDATED_BILLING&#34;.
     * 
     */
    public Optional<Output<String>> featureSet() {
        return Optional.ofNullable(this.featureSet);
    }

    /**
     * ARN of the master account
     * 
     */
    @Import(name="masterAccountArn")
    private @Nullable Output<String> masterAccountArn;

    /**
     * @return ARN of the master account
     * 
     */
    public Optional<Output<String>> masterAccountArn() {
        return Optional.ofNullable(this.masterAccountArn);
    }

    /**
     * Email address of the master account
     * 
     */
    @Import(name="masterAccountEmail")
    private @Nullable Output<String> masterAccountEmail;

    /**
     * @return Email address of the master account
     * 
     */
    public Optional<Output<String>> masterAccountEmail() {
        return Optional.ofNullable(this.masterAccountEmail);
    }

    /**
     * Identifier of the master account
     * 
     */
    @Import(name="masterAccountId")
    private @Nullable Output<String> masterAccountId;

    /**
     * @return Identifier of the master account
     * 
     */
    public Optional<Output<String>> masterAccountId() {
        return Optional.ofNullable(this.masterAccountId);
    }

    /**
     * List of organization accounts excluding the master account. For a list including the master account, see the `accounts` attribute. All elements have these attributes:
     * 
     */
    @Import(name="nonMasterAccounts")
    private @Nullable Output<List<OrganizationNonMasterAccountArgs>> nonMasterAccounts;

    /**
     * @return List of organization accounts excluding the master account. For a list including the master account, see the `accounts` attribute. All elements have these attributes:
     * 
     */
    public Optional<Output<List<OrganizationNonMasterAccountArgs>>> nonMasterAccounts() {
        return Optional.ofNullable(this.nonMasterAccounts);
    }

    /**
     * List of organization roots. All elements have these attributes:
     * 
     */
    @Import(name="roots")
    private @Nullable Output<List<OrganizationRootArgs>> roots;

    /**
     * @return List of organization roots. All elements have these attributes:
     * 
     */
    public Optional<Output<List<OrganizationRootArgs>>> roots() {
        return Optional.ofNullable(this.roots);
    }

    private OrganizationState() {}

    private OrganizationState(OrganizationState $) {
        this.accounts = $.accounts;
        this.arn = $.arn;
        this.awsServiceAccessPrincipals = $.awsServiceAccessPrincipals;
        this.enabledPolicyTypes = $.enabledPolicyTypes;
        this.featureSet = $.featureSet;
        this.masterAccountArn = $.masterAccountArn;
        this.masterAccountEmail = $.masterAccountEmail;
        this.masterAccountId = $.masterAccountId;
        this.nonMasterAccounts = $.nonMasterAccounts;
        this.roots = $.roots;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OrganizationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OrganizationState $;

        public Builder() {
            $ = new OrganizationState();
        }

        public Builder(OrganizationState defaults) {
            $ = new OrganizationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accounts List of organization accounts including the master account. For a list excluding the master account, see the `non_master_accounts` attribute. All elements have these attributes:
         * 
         * @return builder
         * 
         */
        public Builder accounts(@Nullable Output<List<OrganizationAccountArgs>> accounts) {
            $.accounts = accounts;
            return this;
        }

        /**
         * @param accounts List of organization accounts including the master account. For a list excluding the master account, see the `non_master_accounts` attribute. All elements have these attributes:
         * 
         * @return builder
         * 
         */
        public Builder accounts(List<OrganizationAccountArgs> accounts) {
            return accounts(Output.of(accounts));
        }

        /**
         * @param accounts List of organization accounts including the master account. For a list excluding the master account, see the `non_master_accounts` attribute. All elements have these attributes:
         * 
         * @return builder
         * 
         */
        public Builder accounts(OrganizationAccountArgs... accounts) {
            return accounts(List.of(accounts));
        }

        /**
         * @param arn ARN of the root
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn ARN of the root
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param awsServiceAccessPrincipals List of AWS service principal names for which you want to enable integration with your organization. This is typically in the form of a URL, such as service-abbreviation.amazonaws.com. Organization must have `feature_set` set to `ALL`. For additional information, see the [AWS Organizations User Guide](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services.html).
         * 
         * @return builder
         * 
         */
        public Builder awsServiceAccessPrincipals(@Nullable Output<List<String>> awsServiceAccessPrincipals) {
            $.awsServiceAccessPrincipals = awsServiceAccessPrincipals;
            return this;
        }

        /**
         * @param awsServiceAccessPrincipals List of AWS service principal names for which you want to enable integration with your organization. This is typically in the form of a URL, such as service-abbreviation.amazonaws.com. Organization must have `feature_set` set to `ALL`. For additional information, see the [AWS Organizations User Guide](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services.html).
         * 
         * @return builder
         * 
         */
        public Builder awsServiceAccessPrincipals(List<String> awsServiceAccessPrincipals) {
            return awsServiceAccessPrincipals(Output.of(awsServiceAccessPrincipals));
        }

        /**
         * @param awsServiceAccessPrincipals List of AWS service principal names for which you want to enable integration with your organization. This is typically in the form of a URL, such as service-abbreviation.amazonaws.com. Organization must have `feature_set` set to `ALL`. For additional information, see the [AWS Organizations User Guide](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services.html).
         * 
         * @return builder
         * 
         */
        public Builder awsServiceAccessPrincipals(String... awsServiceAccessPrincipals) {
            return awsServiceAccessPrincipals(List.of(awsServiceAccessPrincipals));
        }

        /**
         * @param enabledPolicyTypes List of Organizations policy types to enable in the Organization Root. Organization must have `feature_set` set to `ALL`. For additional information about valid policy types (e.g., `AISERVICES_OPT_OUT_POLICY`, `BACKUP_POLICY`, `SERVICE_CONTROL_POLICY`, and `TAG_POLICY`), see the [AWS Organizations API Reference](https://docs.aws.amazon.com/organizations/latest/APIReference/API_EnablePolicyType.html).
         * 
         * @return builder
         * 
         */
        public Builder enabledPolicyTypes(@Nullable Output<List<String>> enabledPolicyTypes) {
            $.enabledPolicyTypes = enabledPolicyTypes;
            return this;
        }

        /**
         * @param enabledPolicyTypes List of Organizations policy types to enable in the Organization Root. Organization must have `feature_set` set to `ALL`. For additional information about valid policy types (e.g., `AISERVICES_OPT_OUT_POLICY`, `BACKUP_POLICY`, `SERVICE_CONTROL_POLICY`, and `TAG_POLICY`), see the [AWS Organizations API Reference](https://docs.aws.amazon.com/organizations/latest/APIReference/API_EnablePolicyType.html).
         * 
         * @return builder
         * 
         */
        public Builder enabledPolicyTypes(List<String> enabledPolicyTypes) {
            return enabledPolicyTypes(Output.of(enabledPolicyTypes));
        }

        /**
         * @param enabledPolicyTypes List of Organizations policy types to enable in the Organization Root. Organization must have `feature_set` set to `ALL`. For additional information about valid policy types (e.g., `AISERVICES_OPT_OUT_POLICY`, `BACKUP_POLICY`, `SERVICE_CONTROL_POLICY`, and `TAG_POLICY`), see the [AWS Organizations API Reference](https://docs.aws.amazon.com/organizations/latest/APIReference/API_EnablePolicyType.html).
         * 
         * @return builder
         * 
         */
        public Builder enabledPolicyTypes(String... enabledPolicyTypes) {
            return enabledPolicyTypes(List.of(enabledPolicyTypes));
        }

        /**
         * @param featureSet Specify &#34;ALL&#34; (default) or &#34;CONSOLIDATED_BILLING&#34;.
         * 
         * @return builder
         * 
         */
        public Builder featureSet(@Nullable Output<String> featureSet) {
            $.featureSet = featureSet;
            return this;
        }

        /**
         * @param featureSet Specify &#34;ALL&#34; (default) or &#34;CONSOLIDATED_BILLING&#34;.
         * 
         * @return builder
         * 
         */
        public Builder featureSet(String featureSet) {
            return featureSet(Output.of(featureSet));
        }

        /**
         * @param masterAccountArn ARN of the master account
         * 
         * @return builder
         * 
         */
        public Builder masterAccountArn(@Nullable Output<String> masterAccountArn) {
            $.masterAccountArn = masterAccountArn;
            return this;
        }

        /**
         * @param masterAccountArn ARN of the master account
         * 
         * @return builder
         * 
         */
        public Builder masterAccountArn(String masterAccountArn) {
            return masterAccountArn(Output.of(masterAccountArn));
        }

        /**
         * @param masterAccountEmail Email address of the master account
         * 
         * @return builder
         * 
         */
        public Builder masterAccountEmail(@Nullable Output<String> masterAccountEmail) {
            $.masterAccountEmail = masterAccountEmail;
            return this;
        }

        /**
         * @param masterAccountEmail Email address of the master account
         * 
         * @return builder
         * 
         */
        public Builder masterAccountEmail(String masterAccountEmail) {
            return masterAccountEmail(Output.of(masterAccountEmail));
        }

        /**
         * @param masterAccountId Identifier of the master account
         * 
         * @return builder
         * 
         */
        public Builder masterAccountId(@Nullable Output<String> masterAccountId) {
            $.masterAccountId = masterAccountId;
            return this;
        }

        /**
         * @param masterAccountId Identifier of the master account
         * 
         * @return builder
         * 
         */
        public Builder masterAccountId(String masterAccountId) {
            return masterAccountId(Output.of(masterAccountId));
        }

        /**
         * @param nonMasterAccounts List of organization accounts excluding the master account. For a list including the master account, see the `accounts` attribute. All elements have these attributes:
         * 
         * @return builder
         * 
         */
        public Builder nonMasterAccounts(@Nullable Output<List<OrganizationNonMasterAccountArgs>> nonMasterAccounts) {
            $.nonMasterAccounts = nonMasterAccounts;
            return this;
        }

        /**
         * @param nonMasterAccounts List of organization accounts excluding the master account. For a list including the master account, see the `accounts` attribute. All elements have these attributes:
         * 
         * @return builder
         * 
         */
        public Builder nonMasterAccounts(List<OrganizationNonMasterAccountArgs> nonMasterAccounts) {
            return nonMasterAccounts(Output.of(nonMasterAccounts));
        }

        /**
         * @param nonMasterAccounts List of organization accounts excluding the master account. For a list including the master account, see the `accounts` attribute. All elements have these attributes:
         * 
         * @return builder
         * 
         */
        public Builder nonMasterAccounts(OrganizationNonMasterAccountArgs... nonMasterAccounts) {
            return nonMasterAccounts(List.of(nonMasterAccounts));
        }

        /**
         * @param roots List of organization roots. All elements have these attributes:
         * 
         * @return builder
         * 
         */
        public Builder roots(@Nullable Output<List<OrganizationRootArgs>> roots) {
            $.roots = roots;
            return this;
        }

        /**
         * @param roots List of organization roots. All elements have these attributes:
         * 
         * @return builder
         * 
         */
        public Builder roots(List<OrganizationRootArgs> roots) {
            return roots(Output.of(roots));
        }

        /**
         * @param roots List of organization roots. All elements have these attributes:
         * 
         * @return builder
         * 
         */
        public Builder roots(OrganizationRootArgs... roots) {
            return roots(List.of(roots));
        }

        public OrganizationState build() {
            return $;
        }
    }

}