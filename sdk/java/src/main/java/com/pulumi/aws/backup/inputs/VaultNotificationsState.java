// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.backup.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VaultNotificationsState extends com.pulumi.resources.ResourceArgs {

    public static final VaultNotificationsState Empty = new VaultNotificationsState();

    /**
     * The ARN of the vault.
     * 
     */
    @Import(name="backupVaultArn")
    private @Nullable Output<String> backupVaultArn;

    /**
     * @return The ARN of the vault.
     * 
     */
    public Optional<Output<String>> backupVaultArn() {
        return Optional.ofNullable(this.backupVaultArn);
    }

    /**
     * An array of events that indicate the status of jobs to back up resources to the backup vault.
     * 
     */
    @Import(name="backupVaultEvents")
    private @Nullable Output<List<String>> backupVaultEvents;

    /**
     * @return An array of events that indicate the status of jobs to back up resources to the backup vault.
     * 
     */
    public Optional<Output<List<String>>> backupVaultEvents() {
        return Optional.ofNullable(this.backupVaultEvents);
    }

    /**
     * Name of the backup vault to add notifications for.
     * 
     */
    @Import(name="backupVaultName")
    private @Nullable Output<String> backupVaultName;

    /**
     * @return Name of the backup vault to add notifications for.
     * 
     */
    public Optional<Output<String>> backupVaultName() {
        return Optional.ofNullable(this.backupVaultName);
    }

    /**
     * The Amazon Resource Name (ARN) that specifies the topic for a backup vault’s events
     * 
     */
    @Import(name="snsTopicArn")
    private @Nullable Output<String> snsTopicArn;

    /**
     * @return The Amazon Resource Name (ARN) that specifies the topic for a backup vault’s events
     * 
     */
    public Optional<Output<String>> snsTopicArn() {
        return Optional.ofNullable(this.snsTopicArn);
    }

    private VaultNotificationsState() {}

    private VaultNotificationsState(VaultNotificationsState $) {
        this.backupVaultArn = $.backupVaultArn;
        this.backupVaultEvents = $.backupVaultEvents;
        this.backupVaultName = $.backupVaultName;
        this.snsTopicArn = $.snsTopicArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VaultNotificationsState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VaultNotificationsState $;

        public Builder() {
            $ = new VaultNotificationsState();
        }

        public Builder(VaultNotificationsState defaults) {
            $ = new VaultNotificationsState(Objects.requireNonNull(defaults));
        }

        /**
         * @param backupVaultArn The ARN of the vault.
         * 
         * @return builder
         * 
         */
        public Builder backupVaultArn(@Nullable Output<String> backupVaultArn) {
            $.backupVaultArn = backupVaultArn;
            return this;
        }

        /**
         * @param backupVaultArn The ARN of the vault.
         * 
         * @return builder
         * 
         */
        public Builder backupVaultArn(String backupVaultArn) {
            return backupVaultArn(Output.of(backupVaultArn));
        }

        /**
         * @param backupVaultEvents An array of events that indicate the status of jobs to back up resources to the backup vault.
         * 
         * @return builder
         * 
         */
        public Builder backupVaultEvents(@Nullable Output<List<String>> backupVaultEvents) {
            $.backupVaultEvents = backupVaultEvents;
            return this;
        }

        /**
         * @param backupVaultEvents An array of events that indicate the status of jobs to back up resources to the backup vault.
         * 
         * @return builder
         * 
         */
        public Builder backupVaultEvents(List<String> backupVaultEvents) {
            return backupVaultEvents(Output.of(backupVaultEvents));
        }

        /**
         * @param backupVaultEvents An array of events that indicate the status of jobs to back up resources to the backup vault.
         * 
         * @return builder
         * 
         */
        public Builder backupVaultEvents(String... backupVaultEvents) {
            return backupVaultEvents(List.of(backupVaultEvents));
        }

        /**
         * @param backupVaultName Name of the backup vault to add notifications for.
         * 
         * @return builder
         * 
         */
        public Builder backupVaultName(@Nullable Output<String> backupVaultName) {
            $.backupVaultName = backupVaultName;
            return this;
        }

        /**
         * @param backupVaultName Name of the backup vault to add notifications for.
         * 
         * @return builder
         * 
         */
        public Builder backupVaultName(String backupVaultName) {
            return backupVaultName(Output.of(backupVaultName));
        }

        /**
         * @param snsTopicArn The Amazon Resource Name (ARN) that specifies the topic for a backup vault’s events
         * 
         * @return builder
         * 
         */
        public Builder snsTopicArn(@Nullable Output<String> snsTopicArn) {
            $.snsTopicArn = snsTopicArn;
            return this;
        }

        /**
         * @param snsTopicArn The Amazon Resource Name (ARN) that specifies the topic for a backup vault’s events
         * 
         * @return builder
         * 
         */
        public Builder snsTopicArn(String snsTopicArn) {
            return snsTopicArn(Output.of(snsTopicArn));
        }

        public VaultNotificationsState build() {
            return $;
        }
    }

}