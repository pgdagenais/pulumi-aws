// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.datasync.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LocationFsxWindowsState extends com.pulumi.resources.ResourceArgs {

    public static final LocationFsxWindowsState Empty = new LocationFsxWindowsState();

    /**
     * Amazon Resource Name (ARN) of the DataSync Location.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the DataSync Location.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The time that the FSx for Windows location was created.
     * 
     */
    @Import(name="creationTime")
    private @Nullable Output<String> creationTime;

    /**
     * @return The time that the FSx for Windows location was created.
     * 
     */
    public Optional<Output<String>> creationTime() {
        return Optional.ofNullable(this.creationTime);
    }

    /**
     * The name of the Windows domain that the FSx for Windows server belongs to.
     * 
     */
    @Import(name="domain")
    private @Nullable Output<String> domain;

    /**
     * @return The name of the Windows domain that the FSx for Windows server belongs to.
     * 
     */
    public Optional<Output<String>> domain() {
        return Optional.ofNullable(this.domain);
    }

    /**
     * The Amazon Resource Name (ARN) for the FSx for Windows file system.
     * 
     */
    @Import(name="fsxFilesystemArn")
    private @Nullable Output<String> fsxFilesystemArn;

    /**
     * @return The Amazon Resource Name (ARN) for the FSx for Windows file system.
     * 
     */
    public Optional<Output<String>> fsxFilesystemArn() {
        return Optional.ofNullable(this.fsxFilesystemArn);
    }

    /**
     * The password of the user who has the permissions to access files and folders in the FSx for Windows file system.
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return The password of the user who has the permissions to access files and folders in the FSx for Windows file system.
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * The Amazon Resource Names (ARNs) of the security groups that are to use to configure the FSx for Windows file system.
     * 
     */
    @Import(name="securityGroupArns")
    private @Nullable Output<List<String>> securityGroupArns;

    /**
     * @return The Amazon Resource Names (ARNs) of the security groups that are to use to configure the FSx for Windows file system.
     * 
     */
    public Optional<Output<List<String>>> securityGroupArns() {
        return Optional.ofNullable(this.securityGroupArns);
    }

    /**
     * Subdirectory to perform actions as source or destination.
     * 
     */
    @Import(name="subdirectory")
    private @Nullable Output<String> subdirectory;

    /**
     * @return Subdirectory to perform actions as source or destination.
     * 
     */
    public Optional<Output<String>> subdirectory() {
        return Optional.ofNullable(this.subdirectory);
    }

    /**
     * Key-value pairs of resource tags to assign to the DataSync Location. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Key-value pairs of resource tags to assign to the DataSync Location. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    /**
     * The URL of the FSx for Windows location that was described.
     * 
     */
    @Import(name="uri")
    private @Nullable Output<String> uri;

    /**
     * @return The URL of the FSx for Windows location that was described.
     * 
     */
    public Optional<Output<String>> uri() {
        return Optional.ofNullable(this.uri);
    }

    /**
     * The user who has the permissions to access files and folders in the FSx for Windows file system.
     * 
     */
    @Import(name="user")
    private @Nullable Output<String> user;

    /**
     * @return The user who has the permissions to access files and folders in the FSx for Windows file system.
     * 
     */
    public Optional<Output<String>> user() {
        return Optional.ofNullable(this.user);
    }

    private LocationFsxWindowsState() {}

    private LocationFsxWindowsState(LocationFsxWindowsState $) {
        this.arn = $.arn;
        this.creationTime = $.creationTime;
        this.domain = $.domain;
        this.fsxFilesystemArn = $.fsxFilesystemArn;
        this.password = $.password;
        this.securityGroupArns = $.securityGroupArns;
        this.subdirectory = $.subdirectory;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.uri = $.uri;
        this.user = $.user;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LocationFsxWindowsState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LocationFsxWindowsState $;

        public Builder() {
            $ = new LocationFsxWindowsState();
        }

        public Builder(LocationFsxWindowsState defaults) {
            $ = new LocationFsxWindowsState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn Amazon Resource Name (ARN) of the DataSync Location.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn Amazon Resource Name (ARN) of the DataSync Location.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param creationTime The time that the FSx for Windows location was created.
         * 
         * @return builder
         * 
         */
        public Builder creationTime(@Nullable Output<String> creationTime) {
            $.creationTime = creationTime;
            return this;
        }

        /**
         * @param creationTime The time that the FSx for Windows location was created.
         * 
         * @return builder
         * 
         */
        public Builder creationTime(String creationTime) {
            return creationTime(Output.of(creationTime));
        }

        /**
         * @param domain The name of the Windows domain that the FSx for Windows server belongs to.
         * 
         * @return builder
         * 
         */
        public Builder domain(@Nullable Output<String> domain) {
            $.domain = domain;
            return this;
        }

        /**
         * @param domain The name of the Windows domain that the FSx for Windows server belongs to.
         * 
         * @return builder
         * 
         */
        public Builder domain(String domain) {
            return domain(Output.of(domain));
        }

        /**
         * @param fsxFilesystemArn The Amazon Resource Name (ARN) for the FSx for Windows file system.
         * 
         * @return builder
         * 
         */
        public Builder fsxFilesystemArn(@Nullable Output<String> fsxFilesystemArn) {
            $.fsxFilesystemArn = fsxFilesystemArn;
            return this;
        }

        /**
         * @param fsxFilesystemArn The Amazon Resource Name (ARN) for the FSx for Windows file system.
         * 
         * @return builder
         * 
         */
        public Builder fsxFilesystemArn(String fsxFilesystemArn) {
            return fsxFilesystemArn(Output.of(fsxFilesystemArn));
        }

        /**
         * @param password The password of the user who has the permissions to access files and folders in the FSx for Windows file system.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password The password of the user who has the permissions to access files and folders in the FSx for Windows file system.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param securityGroupArns The Amazon Resource Names (ARNs) of the security groups that are to use to configure the FSx for Windows file system.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupArns(@Nullable Output<List<String>> securityGroupArns) {
            $.securityGroupArns = securityGroupArns;
            return this;
        }

        /**
         * @param securityGroupArns The Amazon Resource Names (ARNs) of the security groups that are to use to configure the FSx for Windows file system.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupArns(List<String> securityGroupArns) {
            return securityGroupArns(Output.of(securityGroupArns));
        }

        /**
         * @param securityGroupArns The Amazon Resource Names (ARNs) of the security groups that are to use to configure the FSx for Windows file system.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupArns(String... securityGroupArns) {
            return securityGroupArns(List.of(securityGroupArns));
        }

        /**
         * @param subdirectory Subdirectory to perform actions as source or destination.
         * 
         * @return builder
         * 
         */
        public Builder subdirectory(@Nullable Output<String> subdirectory) {
            $.subdirectory = subdirectory;
            return this;
        }

        /**
         * @param subdirectory Subdirectory to perform actions as source or destination.
         * 
         * @return builder
         * 
         */
        public Builder subdirectory(String subdirectory) {
            return subdirectory(Output.of(subdirectory));
        }

        /**
         * @param tags Key-value pairs of resource tags to assign to the DataSync Location. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Key-value pairs of resource tags to assign to the DataSync Location. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider .
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider .
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        /**
         * @param uri The URL of the FSx for Windows location that was described.
         * 
         * @return builder
         * 
         */
        public Builder uri(@Nullable Output<String> uri) {
            $.uri = uri;
            return this;
        }

        /**
         * @param uri The URL of the FSx for Windows location that was described.
         * 
         * @return builder
         * 
         */
        public Builder uri(String uri) {
            return uri(Output.of(uri));
        }

        /**
         * @param user The user who has the permissions to access files and folders in the FSx for Windows file system.
         * 
         * @return builder
         * 
         */
        public Builder user(@Nullable Output<String> user) {
            $.user = user;
            return this;
        }

        /**
         * @param user The user who has the permissions to access files and folders in the FSx for Windows file system.
         * 
         * @return builder
         * 
         */
        public Builder user(String user) {
            return user(Output.of(user));
        }

        public LocationFsxWindowsState build() {
            return $;
        }
    }

}