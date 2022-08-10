// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.eks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AddonState extends com.pulumi.resources.ResourceArgs {

    public static final AddonState Empty = new AddonState();

    /**
     * Name of the EKS add-on. The name must match one of
     * the names returned by [describe-addon-versions](https://docs.aws.amazon.com/cli/latest/reference/eks/describe-addon-versions.html).
     * 
     */
    @Import(name="addonName")
    private @Nullable Output<String> addonName;

    /**
     * @return Name of the EKS add-on. The name must match one of
     * the names returned by [describe-addon-versions](https://docs.aws.amazon.com/cli/latest/reference/eks/describe-addon-versions.html).
     * 
     */
    public Optional<Output<String>> addonName() {
        return Optional.ofNullable(this.addonName);
    }

    /**
     * The version of the EKS add-on. The version must
     * match one of the versions returned by [describe-addon-versions](https://docs.aws.amazon.com/cli/latest/reference/eks/describe-addon-versions.html).
     * 
     */
    @Import(name="addonVersion")
    private @Nullable Output<String> addonVersion;

    /**
     * @return The version of the EKS add-on. The version must
     * match one of the versions returned by [describe-addon-versions](https://docs.aws.amazon.com/cli/latest/reference/eks/describe-addon-versions.html).
     * 
     */
    public Optional<Output<String>> addonVersion() {
        return Optional.ofNullable(this.addonVersion);
    }

    /**
     * Amazon Resource Name (ARN) of the EKS add-on.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the EKS add-on.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * Name of the EKS Cluster. Must be between 1-100 characters in length. Must begin with an alphanumeric character, and must only contain alphanumeric characters, dashes and underscores (`^[0-9A-Za-z][A-Za-z0-9\-_]+$`).
     * 
     */
    @Import(name="clusterName")
    private @Nullable Output<String> clusterName;

    /**
     * @return Name of the EKS Cluster. Must be between 1-100 characters in length. Must begin with an alphanumeric character, and must only contain alphanumeric characters, dashes and underscores (`^[0-9A-Za-z][A-Za-z0-9\-_]+$`).
     * 
     */
    public Optional<Output<String>> clusterName() {
        return Optional.ofNullable(this.clusterName);
    }

    /**
     * Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the EKS add-on was created.
     * 
     */
    @Import(name="createdAt")
    private @Nullable Output<String> createdAt;

    /**
     * @return Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the EKS add-on was created.
     * 
     */
    public Optional<Output<String>> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }

    /**
     * Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the EKS add-on was updated.
     * 
     */
    @Import(name="modifiedAt")
    private @Nullable Output<String> modifiedAt;

    /**
     * @return Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the EKS add-on was updated.
     * 
     */
    public Optional<Output<String>> modifiedAt() {
        return Optional.ofNullable(this.modifiedAt);
    }

    /**
     * Indicates if you want to preserve the created resources when deleting the EKS add-on.
     * 
     */
    @Import(name="preserve")
    private @Nullable Output<Boolean> preserve;

    /**
     * @return Indicates if you want to preserve the created resources when deleting the EKS add-on.
     * 
     */
    public Optional<Output<Boolean>> preserve() {
        return Optional.ofNullable(this.preserve);
    }

    /**
     * Define how to resolve parameter value conflicts
     * when migrating an existing add-on to an Amazon EKS add-on or when applying
     * version updates to the add-on. Valid values are `NONE` and `OVERWRITE`.
     * 
     */
    @Import(name="resolveConflicts")
    private @Nullable Output<String> resolveConflicts;

    /**
     * @return Define how to resolve parameter value conflicts
     * when migrating an existing add-on to an Amazon EKS add-on or when applying
     * version updates to the add-on. Valid values are `NONE` and `OVERWRITE`.
     * 
     */
    public Optional<Output<String>> resolveConflicts() {
        return Optional.ofNullable(this.resolveConflicts);
    }

    /**
     * The Amazon Resource Name (ARN) of an
     * existing IAM role to bind to the add-on&#39;s service account. The role must be
     * assigned the IAM permissions required by the add-on. If you don&#39;t specify
     * an existing IAM role, then the add-on uses the permissions assigned to the node
     * IAM role. For more information, see [Amazon EKS node IAM role](https://docs.aws.amazon.com/eks/latest/userguide/create-node-role.html)
     * in the Amazon EKS User Guide.
     * 
     */
    @Import(name="serviceAccountRoleArn")
    private @Nullable Output<String> serviceAccountRoleArn;

    /**
     * @return The Amazon Resource Name (ARN) of an
     * existing IAM role to bind to the add-on&#39;s service account. The role must be
     * assigned the IAM permissions required by the add-on. If you don&#39;t specify
     * an existing IAM role, then the add-on uses the permissions assigned to the node
     * IAM role. For more information, see [Amazon EKS node IAM role](https://docs.aws.amazon.com/eks/latest/userguide/create-node-role.html)
     * in the Amazon EKS User Guide.
     * 
     */
    public Optional<Output<String>> serviceAccountRoleArn() {
        return Optional.ofNullable(this.serviceAccountRoleArn);
    }

    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * (Optional) Key-value map of resource tags, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @return (Optional) Key-value map of resource tags, including those inherited from the provider .
     * 
     */
    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    private AddonState() {}

    private AddonState(AddonState $) {
        this.addonName = $.addonName;
        this.addonVersion = $.addonVersion;
        this.arn = $.arn;
        this.clusterName = $.clusterName;
        this.createdAt = $.createdAt;
        this.modifiedAt = $.modifiedAt;
        this.preserve = $.preserve;
        this.resolveConflicts = $.resolveConflicts;
        this.serviceAccountRoleArn = $.serviceAccountRoleArn;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AddonState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AddonState $;

        public Builder() {
            $ = new AddonState();
        }

        public Builder(AddonState defaults) {
            $ = new AddonState(Objects.requireNonNull(defaults));
        }

        /**
         * @param addonName Name of the EKS add-on. The name must match one of
         * the names returned by [describe-addon-versions](https://docs.aws.amazon.com/cli/latest/reference/eks/describe-addon-versions.html).
         * 
         * @return builder
         * 
         */
        public Builder addonName(@Nullable Output<String> addonName) {
            $.addonName = addonName;
            return this;
        }

        /**
         * @param addonName Name of the EKS add-on. The name must match one of
         * the names returned by [describe-addon-versions](https://docs.aws.amazon.com/cli/latest/reference/eks/describe-addon-versions.html).
         * 
         * @return builder
         * 
         */
        public Builder addonName(String addonName) {
            return addonName(Output.of(addonName));
        }

        /**
         * @param addonVersion The version of the EKS add-on. The version must
         * match one of the versions returned by [describe-addon-versions](https://docs.aws.amazon.com/cli/latest/reference/eks/describe-addon-versions.html).
         * 
         * @return builder
         * 
         */
        public Builder addonVersion(@Nullable Output<String> addonVersion) {
            $.addonVersion = addonVersion;
            return this;
        }

        /**
         * @param addonVersion The version of the EKS add-on. The version must
         * match one of the versions returned by [describe-addon-versions](https://docs.aws.amazon.com/cli/latest/reference/eks/describe-addon-versions.html).
         * 
         * @return builder
         * 
         */
        public Builder addonVersion(String addonVersion) {
            return addonVersion(Output.of(addonVersion));
        }

        /**
         * @param arn Amazon Resource Name (ARN) of the EKS add-on.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn Amazon Resource Name (ARN) of the EKS add-on.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param clusterName Name of the EKS Cluster. Must be between 1-100 characters in length. Must begin with an alphanumeric character, and must only contain alphanumeric characters, dashes and underscores (`^[0-9A-Za-z][A-Za-z0-9\-_]+$`).
         * 
         * @return builder
         * 
         */
        public Builder clusterName(@Nullable Output<String> clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        /**
         * @param clusterName Name of the EKS Cluster. Must be between 1-100 characters in length. Must begin with an alphanumeric character, and must only contain alphanumeric characters, dashes and underscores (`^[0-9A-Za-z][A-Za-z0-9\-_]+$`).
         * 
         * @return builder
         * 
         */
        public Builder clusterName(String clusterName) {
            return clusterName(Output.of(clusterName));
        }

        /**
         * @param createdAt Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the EKS add-on was created.
         * 
         * @return builder
         * 
         */
        public Builder createdAt(@Nullable Output<String> createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        /**
         * @param createdAt Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the EKS add-on was created.
         * 
         * @return builder
         * 
         */
        public Builder createdAt(String createdAt) {
            return createdAt(Output.of(createdAt));
        }

        /**
         * @param modifiedAt Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the EKS add-on was updated.
         * 
         * @return builder
         * 
         */
        public Builder modifiedAt(@Nullable Output<String> modifiedAt) {
            $.modifiedAt = modifiedAt;
            return this;
        }

        /**
         * @param modifiedAt Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the EKS add-on was updated.
         * 
         * @return builder
         * 
         */
        public Builder modifiedAt(String modifiedAt) {
            return modifiedAt(Output.of(modifiedAt));
        }

        /**
         * @param preserve Indicates if you want to preserve the created resources when deleting the EKS add-on.
         * 
         * @return builder
         * 
         */
        public Builder preserve(@Nullable Output<Boolean> preserve) {
            $.preserve = preserve;
            return this;
        }

        /**
         * @param preserve Indicates if you want to preserve the created resources when deleting the EKS add-on.
         * 
         * @return builder
         * 
         */
        public Builder preserve(Boolean preserve) {
            return preserve(Output.of(preserve));
        }

        /**
         * @param resolveConflicts Define how to resolve parameter value conflicts
         * when migrating an existing add-on to an Amazon EKS add-on or when applying
         * version updates to the add-on. Valid values are `NONE` and `OVERWRITE`.
         * 
         * @return builder
         * 
         */
        public Builder resolveConflicts(@Nullable Output<String> resolveConflicts) {
            $.resolveConflicts = resolveConflicts;
            return this;
        }

        /**
         * @param resolveConflicts Define how to resolve parameter value conflicts
         * when migrating an existing add-on to an Amazon EKS add-on or when applying
         * version updates to the add-on. Valid values are `NONE` and `OVERWRITE`.
         * 
         * @return builder
         * 
         */
        public Builder resolveConflicts(String resolveConflicts) {
            return resolveConflicts(Output.of(resolveConflicts));
        }

        /**
         * @param serviceAccountRoleArn The Amazon Resource Name (ARN) of an
         * existing IAM role to bind to the add-on&#39;s service account. The role must be
         * assigned the IAM permissions required by the add-on. If you don&#39;t specify
         * an existing IAM role, then the add-on uses the permissions assigned to the node
         * IAM role. For more information, see [Amazon EKS node IAM role](https://docs.aws.amazon.com/eks/latest/userguide/create-node-role.html)
         * in the Amazon EKS User Guide.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccountRoleArn(@Nullable Output<String> serviceAccountRoleArn) {
            $.serviceAccountRoleArn = serviceAccountRoleArn;
            return this;
        }

        /**
         * @param serviceAccountRoleArn The Amazon Resource Name (ARN) of an
         * existing IAM role to bind to the add-on&#39;s service account. The role must be
         * assigned the IAM permissions required by the add-on. If you don&#39;t specify
         * an existing IAM role, then the add-on uses the permissions assigned to the node
         * IAM role. For more information, see [Amazon EKS node IAM role](https://docs.aws.amazon.com/eks/latest/userguide/create-node-role.html)
         * in the Amazon EKS User Guide.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccountRoleArn(String serviceAccountRoleArn) {
            return serviceAccountRoleArn(Output.of(serviceAccountRoleArn));
        }

        /**
         * @param tags Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tagsAll (Optional) Key-value map of resource tags, including those inherited from the provider .
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        /**
         * @param tagsAll (Optional) Key-value map of resource tags, including those inherited from the provider .
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        public AddonState build() {
            return $;
        }
    }

}