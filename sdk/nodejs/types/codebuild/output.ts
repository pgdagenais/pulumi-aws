// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../../types/input";
import * as outputs from "../../types/output";
import * as enums from "../../types/enums";
import * as utilities from "../../utilities";

import {RoutingRule} from "@/s3";

export interface ProjectArtifacts {
    /**
     * Artifact identifier. Must be the same specified inside the AWS CodeBuild build specification.
     */
    artifactIdentifier?: string;
    /**
     * Specifies the bucket owner's access for objects that another account uploads to their Amazon S3 bucket. By default, only the account that uploads the objects to the bucket has access to these objects. This property allows you to give the bucket owner access to these objects. Valid values are `NONE`, `READ_ONLY`, and `FULL`. your CodeBuild service role must have the `s3:PutBucketAcl` permission. This permission allows CodeBuild to modify the access control list for the bucket.
     */
    bucketOwnerAccess?: string;
    /**
     * Whether to disable encrypting output artifacts. If `type` is set to `NO_ARTIFACTS`, this value is ignored. Defaults to `false`.
     */
    encryptionDisabled?: boolean;
    /**
     * Location of the source code from git or s3.
     */
    location?: string;
    /**
     * Name of the project. If `type` is set to `S3`, this is the name of the output artifact object
     */
    name?: string;
    /**
     * Namespace to use in storing build artifacts. If `type` is set to `S3`, then valid values are `BUILD_ID` or `NONE`.
     */
    namespaceType?: string;
    /**
     * Whether a name specified in the build specification overrides the artifact name.
     */
    overrideArtifactName?: boolean;
    /**
     * Type of build output artifact to create. If `type` is set to `S3`, valid values are `NONE`, `ZIP`
     */
    packaging?: string;
    /**
     * If `type` is set to `S3`, this is the path to the output artifact.
     */
    path?: string;
    /**
     * Type of repository that contains the source code to be built. Valid values: `CODECOMMIT`, `CODEPIPELINE`, `GITHUB`, `GITHUB_ENTERPRISE`, `BITBUCKET`, `S3`, `NO_SOURCE`.
     */
    type: string;
}

export interface ProjectBuildBatchConfig {
    /**
     * Specifies if the build artifacts for the batch build should be combined into a single artifact location.
     */
    combineArtifacts?: boolean;
    /**
     * Specifies the restrictions for the batch build.
     */
    restrictions?: outputs.codebuild.ProjectBuildBatchConfigRestrictions;
    /**
     * Specifies the service role ARN for the batch build project.
     */
    serviceRole: string;
    /**
     * Specifies the maximum amount of time, in minutes, that the batch build must be completed in.
     */
    timeoutInMins?: number;
}

export interface ProjectBuildBatchConfigRestrictions {
    /**
     * An array of strings that specify the compute types that are allowed for the batch build. See [Build environment compute types](https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html) in the AWS CodeBuild User Guide for these values.
     */
    computeTypesAlloweds?: string[];
    /**
     * Specifies the maximum number of builds allowed.
     */
    maximumBuildsAllowed?: number;
}

export interface ProjectCache {
    /**
     * Location of the source code from git or s3.
     */
    location?: string;
    /**
     * Specifies settings that AWS CodeBuild uses to store and reuse build dependencies. Valid values:  `LOCAL_SOURCE_CACHE`, `LOCAL_DOCKER_LAYER_CACHE`, `LOCAL_CUSTOM_CACHE`.
     */
    modes?: string[];
    /**
     * Type of repository that contains the source code to be built. Valid values: `CODECOMMIT`, `CODEPIPELINE`, `GITHUB`, `GITHUB_ENTERPRISE`, `BITBUCKET`, `S3`, `NO_SOURCE`.
     */
    type?: string;
}

export interface ProjectEnvironment {
    /**
     * ARN of the S3 bucket, path prefix and object key that contains the PEM-encoded certificate.
     */
    certificate?: string;
    /**
     * Information about the compute resources the build project will use. Valid values: `BUILD_GENERAL1_SMALL`, `BUILD_GENERAL1_MEDIUM`, `BUILD_GENERAL1_LARGE`, `BUILD_GENERAL1_2XLARGE`. `BUILD_GENERAL1_SMALL` is only valid if `type` is set to `LINUX_CONTAINER`. When `type` is set to `LINUX_GPU_CONTAINER`, `computeType` must be `BUILD_GENERAL1_LARGE`.
     */
    computeType: string;
    /**
     * Configuration block. Detailed below.
     */
    environmentVariables?: outputs.codebuild.ProjectEnvironmentEnvironmentVariable[];
    /**
     * Docker image to use for this build project. Valid values include [Docker images provided by CodeBuild](https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-available.html) (e.g `aws/codebuild/standard:2.0`), [Docker Hub images](https://hub.docker.com/) (e.g., `nginx/nginx:latest`), and full Docker repository URIs such as those for ECR (e.g., `137112412989.dkr.ecr.us-west-2.amazonaws.com/amazonlinux:latest`).
     */
    image: string;
    /**
     * Type of credentials AWS CodeBuild uses to pull images in your build. Valid values: `CODEBUILD`, `SERVICE_ROLE`. When you use a cross-account or private registry image, you must use SERVICE_ROLE credentials. When you use an AWS CodeBuild curated image, you must use CodeBuild credentials. Defaults to `CODEBUILD`.
     */
    imagePullCredentialsType?: string;
    /**
     * Whether to enable running the Docker daemon inside a Docker container. Defaults to `false`.
     */
    privilegedMode?: boolean;
    /**
     * Configuration block. Detailed below.
     */
    registryCredential?: outputs.codebuild.ProjectEnvironmentRegistryCredential;
    /**
     * Type of repository that contains the source code to be built. Valid values: `CODECOMMIT`, `CODEPIPELINE`, `GITHUB`, `GITHUB_ENTERPRISE`, `BITBUCKET`, `S3`, `NO_SOURCE`.
     */
    type: string;
}

export interface ProjectEnvironmentEnvironmentVariable {
    /**
     * Name of the project. If `type` is set to `S3`, this is the name of the output artifact object
     */
    name: string;
    /**
     * Type of repository that contains the source code to be built. Valid values: `CODECOMMIT`, `CODEPIPELINE`, `GITHUB`, `GITHUB_ENTERPRISE`, `BITBUCKET`, `S3`, `NO_SOURCE`.
     */
    type?: string;
    /**
     * Environment variable's value.
     */
    value: string;
}

export interface ProjectEnvironmentRegistryCredential {
    /**
     * ARN or name of credentials created using AWS Secrets Manager.
     */
    credential: string;
    /**
     * Service that created the credentials to access a private Docker registry. Valid value: `SECRETS_MANAGER` (AWS Secrets Manager).
     */
    credentialProvider: string;
}

export interface ProjectFileSystemLocation {
    /**
     * The name used to access a file system created by Amazon EFS. CodeBuild creates an environment variable by appending the identifier in all capital letters to CODEBUILD\_. For example, if you specify my-efs for identifier, a new environment variable is create named CODEBUILD_MY-EFS.
     */
    identifier?: string;
    /**
     * A string that specifies the location of the file system created by Amazon EFS. Its format is `efs-dns-name:/directory-path`.
     */
    location?: string;
    /**
     * The mount options for a file system created by AWS EFS.
     */
    mountOptions?: string;
    /**
     * The location in the container where you mount the file system.
     */
    mountPoint?: string;
    /**
     * Authorization type to use. The only valid value is `OAUTH`. This data type is deprecated and is no longer accurate or used. Use the `aws.codebuild.SourceCredential` resource instead.
     */
    type?: string;
}

export interface ProjectLogsConfig {
    /**
     * Configuration block. Detailed below.
     */
    cloudwatchLogs?: outputs.codebuild.ProjectLogsConfigCloudwatchLogs;
    /**
     * Configuration block. Detailed below.
     */
    s3Logs?: outputs.codebuild.ProjectLogsConfigS3Logs;
}

export interface ProjectLogsConfigCloudwatchLogs {
    /**
     * Group name of the logs in CloudWatch Logs.
     */
    groupName?: string;
    /**
     * Current status of logs in S3 for a build project. Valid values: `ENABLED`, `DISABLED`. Defaults to `DISABLED`.
     */
    status?: string;
    /**
     * Stream name of the logs in CloudWatch Logs.
     */
    streamName?: string;
}

export interface ProjectLogsConfigS3Logs {
    /**
     * Specifies the bucket owner's access for objects that another account uploads to their Amazon S3 bucket. By default, only the account that uploads the objects to the bucket has access to these objects. This property allows you to give the bucket owner access to these objects. Valid values are `NONE`, `READ_ONLY`, and `FULL`. your CodeBuild service role must have the `s3:PutBucketAcl` permission. This permission allows CodeBuild to modify the access control list for the bucket.
     */
    bucketOwnerAccess?: string;
    /**
     * Whether to disable encrypting output artifacts. If `type` is set to `NO_ARTIFACTS`, this value is ignored. Defaults to `false`.
     */
    encryptionDisabled?: boolean;
    /**
     * Location of the source code from git or s3.
     */
    location?: string;
    /**
     * Current status of logs in S3 for a build project. Valid values: `ENABLED`, `DISABLED`. Defaults to `DISABLED`.
     */
    status?: string;
}

export interface ProjectSecondaryArtifact {
    /**
     * Artifact identifier. Must be the same specified inside the AWS CodeBuild build specification.
     */
    artifactIdentifier: string;
    /**
     * Specifies the bucket owner's access for objects that another account uploads to their Amazon S3 bucket. By default, only the account that uploads the objects to the bucket has access to these objects. This property allows you to give the bucket owner access to these objects. Valid values are `NONE`, `READ_ONLY`, and `FULL`. your CodeBuild service role must have the `s3:PutBucketAcl` permission. This permission allows CodeBuild to modify the access control list for the bucket.
     */
    bucketOwnerAccess?: string;
    /**
     * Whether to disable encrypting output artifacts. If `type` is set to `NO_ARTIFACTS`, this value is ignored. Defaults to `false`.
     */
    encryptionDisabled?: boolean;
    /**
     * Location of the source code from git or s3.
     */
    location?: string;
    /**
     * Name of the project. If `type` is set to `S3`, this is the name of the output artifact object
     */
    name?: string;
    /**
     * Namespace to use in storing build artifacts. If `type` is set to `S3`, then valid values are `BUILD_ID` or `NONE`.
     */
    namespaceType?: string;
    /**
     * Whether a name specified in the build specification overrides the artifact name.
     */
    overrideArtifactName?: boolean;
    /**
     * Type of build output artifact to create. If `type` is set to `S3`, valid values are `NONE`, `ZIP`
     */
    packaging?: string;
    /**
     * If `type` is set to `S3`, this is the path to the output artifact.
     */
    path?: string;
    /**
     * Type of repository that contains the source code to be built. Valid values: `CODECOMMIT`, `CODEPIPELINE`, `GITHUB`, `GITHUB_ENTERPRISE`, `BITBUCKET`, `S3`, `NO_SOURCE`.
     */
    type: string;
}

export interface ProjectSecondarySource {
    /**
     * Configuration block with the authorization settings for AWS CodeBuild to access the source code to be built. This information is for the AWS CodeBuild console's use only. Use the `aws.codebuild.SourceCredential` resource instead. Auth blocks are documented below.
     *
     * @deprecated Use the aws_codebuild_source_credential resource instead
     */
    auth?: outputs.codebuild.ProjectSecondarySourceAuth;
    /**
     * Contains information that defines how the build project reports the build status to the source provider. This option is only used when the source provider is `GITHUB`, `GITHUB_ENTERPRISE`, or `BITBUCKET`.
     */
    buildStatusConfig?: outputs.codebuild.ProjectSecondarySourceBuildStatusConfig;
    /**
     * Build specification to use for this build project's related builds. This must be set when `type` is `NO_SOURCE`.
     */
    buildspec?: string;
    /**
     * Truncate git history to this many commits. Use `0` for a `Full` checkout which you need to run commands like `git branch --show-current`. See [AWS CodePipeline User Guide: Tutorial: Use full clone with a GitHub pipeline source](https://docs.aws.amazon.com/codepipeline/latest/userguide/tutorials-github-gitclone.html) for details.
     */
    gitCloneDepth?: number;
    /**
     * Configuration block. Detailed below.
     */
    gitSubmodulesConfig?: outputs.codebuild.ProjectSecondarySourceGitSubmodulesConfig;
    /**
     * Ignore SSL warnings when connecting to source control.
     */
    insecureSsl?: boolean;
    /**
     * Location of the source code from git or s3.
     */
    location?: string;
    /**
     * Whether to report the status of a build's start and finish to your source provider. This option is only valid when the `type` is `BITBUCKET` or `GITHUB`.
     */
    reportBuildStatus?: boolean;
    /**
     * An identifier for a source in the build project.
     */
    sourceIdentifier: string;
    /**
     * Type of repository that contains the source code to be built. Valid values: `CODECOMMIT`, `CODEPIPELINE`, `GITHUB`, `GITHUB_ENTERPRISE`, `BITBUCKET`, `S3`, `NO_SOURCE`.
     */
    type: string;
}

export interface ProjectSecondarySourceAuth {
    /**
     * Resource value that applies to the specified authorization type. Use the `aws.codebuild.SourceCredential` resource instead.
     *
     * @deprecated Use the aws_codebuild_source_credential resource instead
     */
    resource?: string;
    /**
     * Type of repository that contains the source code to be built. Valid values: `CODECOMMIT`, `CODEPIPELINE`, `GITHUB`, `GITHUB_ENTERPRISE`, `BITBUCKET`, `S3`, `NO_SOURCE`.
     *
     * @deprecated Use the aws_codebuild_source_credential resource instead
     */
    type: string;
}

export interface ProjectSecondarySourceBuildStatusConfig {
    /**
     * Specifies the context of the build status CodeBuild sends to the source provider. The usage of this parameter depends on the source provider.
     */
    context?: string;
    /**
     * Specifies the target url of the build status CodeBuild sends to the source provider. The usage of this parameter depends on the source provider.
     */
    targetUrl?: string;
}

export interface ProjectSecondarySourceGitSubmodulesConfig {
    /**
     * Whether to fetch Git submodules for the AWS CodeBuild build project.
     */
    fetchSubmodules: boolean;
}

export interface ProjectSecondarySourceVersion {
    /**
     * An identifier for a source in the build project.
     */
    sourceIdentifier: string;
    /**
     * The source version for the corresponding source identifier. See [AWS docs](https://docs.aws.amazon.com/codebuild/latest/APIReference/API_ProjectSourceVersion.html#CodeBuild-Type-ProjectSourceVersion-sourceVersion) for more details.
     */
    sourceVersion: string;
}

export interface ProjectSource {
    /**
     * Configuration block with the authorization settings for AWS CodeBuild to access the source code to be built. This information is for the AWS CodeBuild console's use only. Use the `aws.codebuild.SourceCredential` resource instead. Auth blocks are documented below.
     *
     * @deprecated Use the aws_codebuild_source_credential resource instead
     */
    auth?: outputs.codebuild.ProjectSourceAuth;
    /**
     * Contains information that defines how the build project reports the build status to the source provider. This option is only used when the source provider is `GITHUB`, `GITHUB_ENTERPRISE`, or `BITBUCKET`.
     */
    buildStatusConfig?: outputs.codebuild.ProjectSourceBuildStatusConfig;
    /**
     * Build specification to use for this build project's related builds. This must be set when `type` is `NO_SOURCE`.
     */
    buildspec?: string;
    /**
     * Truncate git history to this many commits. Use `0` for a `Full` checkout which you need to run commands like `git branch --show-current`. See [AWS CodePipeline User Guide: Tutorial: Use full clone with a GitHub pipeline source](https://docs.aws.amazon.com/codepipeline/latest/userguide/tutorials-github-gitclone.html) for details.
     */
    gitCloneDepth?: number;
    /**
     * Configuration block. Detailed below.
     */
    gitSubmodulesConfig?: outputs.codebuild.ProjectSourceGitSubmodulesConfig;
    /**
     * Ignore SSL warnings when connecting to source control.
     */
    insecureSsl?: boolean;
    /**
     * Location of the source code from git or s3.
     */
    location?: string;
    /**
     * Whether to report the status of a build's start and finish to your source provider. This option is only valid when the `type` is `BITBUCKET` or `GITHUB`.
     */
    reportBuildStatus?: boolean;
    /**
     * Type of repository that contains the source code to be built. Valid values: `CODECOMMIT`, `CODEPIPELINE`, `GITHUB`, `GITHUB_ENTERPRISE`, `BITBUCKET`, `S3`, `NO_SOURCE`.
     */
    type: string;
}

export interface ProjectSourceAuth {
    /**
     * Resource value that applies to the specified authorization type. Use the `aws.codebuild.SourceCredential` resource instead.
     *
     * @deprecated Use the aws_codebuild_source_credential resource instead
     */
    resource?: string;
    /**
     * Type of repository that contains the source code to be built. Valid values: `CODECOMMIT`, `CODEPIPELINE`, `GITHUB`, `GITHUB_ENTERPRISE`, `BITBUCKET`, `S3`, `NO_SOURCE`.
     *
     * @deprecated Use the aws_codebuild_source_credential resource instead
     */
    type: string;
}

export interface ProjectSourceBuildStatusConfig {
    /**
     * Specifies the context of the build status CodeBuild sends to the source provider. The usage of this parameter depends on the source provider.
     */
    context?: string;
    /**
     * Specifies the target url of the build status CodeBuild sends to the source provider. The usage of this parameter depends on the source provider.
     */
    targetUrl?: string;
}

export interface ProjectSourceGitSubmodulesConfig {
    /**
     * Whether to fetch Git submodules for the AWS CodeBuild build project.
     */
    fetchSubmodules: boolean;
}

export interface ProjectVpcConfig {
    /**
     * Security group IDs to assign to running builds.
     */
    securityGroupIds: string[];
    /**
     * Subnet IDs within which to run builds.
     */
    subnets: string[];
    /**
     * ID of the VPC within which to run builds.
     */
    vpcId: string;
}

export interface ReportGroupExportConfig {
    /**
     * contains information about the S3 bucket where the run of a report is exported. see S3 Destination documented below.
     */
    s3Destination?: outputs.codebuild.ReportGroupExportConfigS3Destination;
    /**
     * The export configuration type. Valid values are `S3` and `NO_EXPORT`.
     */
    type: string;
}

export interface ReportGroupExportConfigS3Destination {
    /**
     * The name of the S3 bucket where the raw data of a report are exported.
     */
    bucket: string;
    /**
     * A boolean value that specifies if the results of a report are encrypted.
     * **Note: the API does not currently allow setting encryption as disabled**
     */
    encryptionDisabled?: boolean;
    /**
     * The encryption key for the report's encrypted raw data. The KMS key ARN.
     */
    encryptionKey: string;
    /**
     * The type of build output artifact to create. Valid values are: `NONE` (default) and `ZIP`.
     */
    packaging?: string;
    /**
     * The path to the exported report's raw data results.
     */
    path?: string;
}

export interface WebhookFilterGroup {
    /**
     * A webhook filter for the group. Filter blocks are documented below.
     */
    filters?: outputs.codebuild.WebhookFilterGroupFilter[];
}

export interface WebhookFilterGroupFilter {
    /**
     * If set to `true`, the specified filter does *not* trigger a build. Defaults to `false`.
     */
    excludeMatchedPattern?: boolean;
    /**
     * For a filter that uses `EVENT` type, a comma-separated string that specifies one event: `PUSH`, `PULL_REQUEST_CREATED`, `PULL_REQUEST_UPDATED`, `PULL_REQUEST_REOPENED`. `PULL_REQUEST_MERGED` works with GitHub & GitHub Enterprise only. For a filter that uses any of the other filter types, a regular expression.
     */
    pattern: string;
    /**
     * The webhook filter group's type. Valid values for this parameter are: `EVENT`, `BASE_REF`, `HEAD_REF`, `ACTOR_ACCOUNT_ID`, `FILE_PATH`, `COMMIT_MESSAGE`. At least one filter group must specify `EVENT` as its type.
     */
    type: string;
}
