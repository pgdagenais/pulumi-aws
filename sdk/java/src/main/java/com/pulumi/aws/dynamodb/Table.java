// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.dynamodb;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.dynamodb.TableArgs;
import com.pulumi.aws.dynamodb.inputs.TableState;
import com.pulumi.aws.dynamodb.outputs.TableAttribute;
import com.pulumi.aws.dynamodb.outputs.TableGlobalSecondaryIndex;
import com.pulumi.aws.dynamodb.outputs.TableLocalSecondaryIndex;
import com.pulumi.aws.dynamodb.outputs.TablePointInTimeRecovery;
import com.pulumi.aws.dynamodb.outputs.TableReplica;
import com.pulumi.aws.dynamodb.outputs.TableServerSideEncryption;
import com.pulumi.aws.dynamodb.outputs.TableTtl;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a DynamoDB table resource
 * 
 * &gt; **Note:** It is recommended to use [`ignoreChanges`](https://www.pulumi.com/docs/intro/concepts/programming-model/#ignorechanges) for `read_capacity` and/or `write_capacity` if there&#39;s `autoscaling policy` attached to the table.
 * 
 * ## DynamoDB Table attributes
 * 
 * Only define attributes on the table object that are going to be used as:
 * 
 * * Table hash key or range key
 * * LSI or GSI hash key or range key
 * 
 * The DynamoDB API expects attribute structure (name and type) to be passed along when creating or updating GSI/LSIs or creating the initial table. In these cases it expects the Hash / Range keys to be provided. Because these get re-used in numerous places (i.e the table&#39;s range key could be a part of one or more GSIs), they are stored on the table object to prevent duplication and increase consistency. If you add attributes here that are not used in these scenarios it can cause an infinite loop in planning.
 * 
 * ## Example Usage
 * ### Basic Example
 * 
 * The following dynamodb table description models the table and GSI shown in the [AWS SDK example documentation](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/GSI.html)
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.dynamodb.Table;
 * import com.pulumi.aws.dynamodb.TableArgs;
 * import com.pulumi.aws.dynamodb.inputs.TableAttributeArgs;
 * import com.pulumi.aws.dynamodb.inputs.TableGlobalSecondaryIndexArgs;
 * import com.pulumi.aws.dynamodb.inputs.TableTtlArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var basic_dynamodb_table = new Table(&#34;basic-dynamodb-table&#34;, TableArgs.builder()        
 *             .attributes(            
 *                 TableAttributeArgs.builder()
 *                     .name(&#34;UserId&#34;)
 *                     .type(&#34;S&#34;)
 *                     .build(),
 *                 TableAttributeArgs.builder()
 *                     .name(&#34;GameTitle&#34;)
 *                     .type(&#34;S&#34;)
 *                     .build(),
 *                 TableAttributeArgs.builder()
 *                     .name(&#34;TopScore&#34;)
 *                     .type(&#34;N&#34;)
 *                     .build())
 *             .billingMode(&#34;PROVISIONED&#34;)
 *             .globalSecondaryIndexes(TableGlobalSecondaryIndexArgs.builder()
 *                 .hashKey(&#34;GameTitle&#34;)
 *                 .name(&#34;GameTitleIndex&#34;)
 *                 .nonKeyAttributes(&#34;UserId&#34;)
 *                 .projectionType(&#34;INCLUDE&#34;)
 *                 .rangeKey(&#34;TopScore&#34;)
 *                 .readCapacity(10)
 *                 .writeCapacity(10)
 *                 .build())
 *             .hashKey(&#34;UserId&#34;)
 *             .rangeKey(&#34;GameTitle&#34;)
 *             .readCapacity(20)
 *             .tags(Map.ofEntries(
 *                 Map.entry(&#34;Environment&#34;, &#34;production&#34;),
 *                 Map.entry(&#34;Name&#34;, &#34;dynamodb-table-1&#34;)
 *             ))
 *             .ttl(TableTtlArgs.builder()
 *                 .attributeName(&#34;TimeToExist&#34;)
 *                 .enabled(false)
 *                 .build())
 *             .writeCapacity(20)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Global Tables
 * 
 * This resource implements support for [DynamoDB Global Tables V2 (version 2019.11.21)](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/globaltables.V2.html) via `replica` configuration blocks. For working with [DynamoDB Global Tables V1 (version 2017.11.29)](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/globaltables.V1.html), see the `aws.dynamodb.GlobalTable` resource.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.dynamodb.Table;
 * import com.pulumi.aws.dynamodb.TableArgs;
 * import com.pulumi.aws.dynamodb.inputs.TableAttributeArgs;
 * import com.pulumi.aws.dynamodb.inputs.TableReplicaArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var example = new Table(&#34;example&#34;, TableArgs.builder()        
 *             .attributes(TableAttributeArgs.builder()
 *                 .name(&#34;TestTableHashKey&#34;)
 *                 .type(&#34;S&#34;)
 *                 .build())
 *             .billingMode(&#34;PAY_PER_REQUEST&#34;)
 *             .hashKey(&#34;TestTableHashKey&#34;)
 *             .replicas(            
 *                 TableReplicaArgs.builder()
 *                     .regionName(&#34;us-east-2&#34;)
 *                     .build(),
 *                 TableReplicaArgs.builder()
 *                     .regionName(&#34;us-west-2&#34;)
 *                     .build())
 *             .streamEnabled(true)
 *             .streamViewType(&#34;NEW_AND_OLD_IMAGES&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * DynamoDB tables can be imported using the `name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:dynamodb/table:Table basic-dynamodb-table GameScores
 * ```
 * 
 */
@ResourceType(type="aws:dynamodb/table:Table")
public class Table extends com.pulumi.resources.CustomResource {
    /**
     * ARN of the table
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return ARN of the table
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Set of nested attribute definitions. Only required for `hash_key` and `range_key` attributes. See below.
     * 
     */
    @Export(name="attributes", type=List.class, parameters={TableAttribute.class})
    private Output<List<TableAttribute>> attributes;

    /**
     * @return Set of nested attribute definitions. Only required for `hash_key` and `range_key` attributes. See below.
     * 
     */
    public Output<List<TableAttribute>> attributes() {
        return this.attributes;
    }
    /**
     * Controls how you are charged for read and write throughput and how you manage capacity. The valid values are `PROVISIONED` and `PAY_PER_REQUEST`. Defaults to `PROVISIONED`.
     * 
     */
    @Export(name="billingMode", type=String.class, parameters={})
    private Output</* @Nullable */ String> billingMode;

    /**
     * @return Controls how you are charged for read and write throughput and how you manage capacity. The valid values are `PROVISIONED` and `PAY_PER_REQUEST`. Defaults to `PROVISIONED`.
     * 
     */
    public Output<Optional<String>> billingMode() {
        return Codegen.optional(this.billingMode);
    }
    /**
     * Describe a GSI for the table; subject to the normal limits on the number of GSIs, projected attributes, etc. See below.
     * 
     */
    @Export(name="globalSecondaryIndexes", type=List.class, parameters={TableGlobalSecondaryIndex.class})
    private Output</* @Nullable */ List<TableGlobalSecondaryIndex>> globalSecondaryIndexes;

    /**
     * @return Describe a GSI for the table; subject to the normal limits on the number of GSIs, projected attributes, etc. See below.
     * 
     */
    public Output<Optional<List<TableGlobalSecondaryIndex>>> globalSecondaryIndexes() {
        return Codegen.optional(this.globalSecondaryIndexes);
    }
    /**
     * Name of the hash key in the index; must be defined as an attribute in the resource.
     * 
     */
    @Export(name="hashKey", type=String.class, parameters={})
    private Output<String> hashKey;

    /**
     * @return Name of the hash key in the index; must be defined as an attribute in the resource.
     * 
     */
    public Output<String> hashKey() {
        return this.hashKey;
    }
    /**
     * Describe an LSI on the table; these can only be allocated *at creation* so you cannot change this definition after you have created the resource. See below.
     * 
     */
    @Export(name="localSecondaryIndexes", type=List.class, parameters={TableLocalSecondaryIndex.class})
    private Output</* @Nullable */ List<TableLocalSecondaryIndex>> localSecondaryIndexes;

    /**
     * @return Describe an LSI on the table; these can only be allocated *at creation* so you cannot change this definition after you have created the resource. See below.
     * 
     */
    public Output<Optional<List<TableLocalSecondaryIndex>>> localSecondaryIndexes() {
        return Codegen.optional(this.localSecondaryIndexes);
    }
    /**
     * Name of the index
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the index
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Whether to enable Point In Time Recovery for the replica. Default is `false`.
     * 
     */
    @Export(name="pointInTimeRecovery", type=TablePointInTimeRecovery.class, parameters={})
    private Output<TablePointInTimeRecovery> pointInTimeRecovery;

    /**
     * @return Whether to enable Point In Time Recovery for the replica. Default is `false`.
     * 
     */
    public Output<TablePointInTimeRecovery> pointInTimeRecovery() {
        return this.pointInTimeRecovery;
    }
    /**
     * Name of the range key.
     * 
     */
    @Export(name="rangeKey", type=String.class, parameters={})
    private Output</* @Nullable */ String> rangeKey;

    /**
     * @return Name of the range key.
     * 
     */
    public Output<Optional<String>> rangeKey() {
        return Codegen.optional(this.rangeKey);
    }
    /**
     * Number of read units for this index. Must be set if billing_mode is set to PROVISIONED.
     * 
     */
    @Export(name="readCapacity", type=Integer.class, parameters={})
    private Output<Integer> readCapacity;

    /**
     * @return Number of read units for this index. Must be set if billing_mode is set to PROVISIONED.
     * 
     */
    public Output<Integer> readCapacity() {
        return this.readCapacity;
    }
    /**
     * Configuration block(s) with [DynamoDB Global Tables V2 (version 2019.11.21)](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/globaltables.V2.html) replication configurations. See below.
     * 
     */
    @Export(name="replicas", type=List.class, parameters={TableReplica.class})
    private Output</* @Nullable */ List<TableReplica>> replicas;

    /**
     * @return Configuration block(s) with [DynamoDB Global Tables V2 (version 2019.11.21)](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/globaltables.V2.html) replication configurations. See below.
     * 
     */
    public Output<Optional<List<TableReplica>>> replicas() {
        return Codegen.optional(this.replicas);
    }
    /**
     * Time of the point-in-time recovery point to restore.
     * 
     */
    @Export(name="restoreDateTime", type=String.class, parameters={})
    private Output</* @Nullable */ String> restoreDateTime;

    /**
     * @return Time of the point-in-time recovery point to restore.
     * 
     */
    public Output<Optional<String>> restoreDateTime() {
        return Codegen.optional(this.restoreDateTime);
    }
    /**
     * Name of the table to restore. Must match the name of an existing table.
     * 
     */
    @Export(name="restoreSourceName", type=String.class, parameters={})
    private Output</* @Nullable */ String> restoreSourceName;

    /**
     * @return Name of the table to restore. Must match the name of an existing table.
     * 
     */
    public Output<Optional<String>> restoreSourceName() {
        return Codegen.optional(this.restoreSourceName);
    }
    /**
     * If set, restores table to the most recent point-in-time recovery point.
     * 
     */
    @Export(name="restoreToLatestTime", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> restoreToLatestTime;

    /**
     * @return If set, restores table to the most recent point-in-time recovery point.
     * 
     */
    public Output<Optional<Boolean>> restoreToLatestTime() {
        return Codegen.optional(this.restoreToLatestTime);
    }
    /**
     * Encryption at rest options. AWS DynamoDB tables are automatically encrypted at rest with an AWS-owned Customer Master Key if this argument isn&#39;t specified. See below.
     * 
     */
    @Export(name="serverSideEncryption", type=TableServerSideEncryption.class, parameters={})
    private Output<TableServerSideEncryption> serverSideEncryption;

    /**
     * @return Encryption at rest options. AWS DynamoDB tables are automatically encrypted at rest with an AWS-owned Customer Master Key if this argument isn&#39;t specified. See below.
     * 
     */
    public Output<TableServerSideEncryption> serverSideEncryption() {
        return this.serverSideEncryption;
    }
    /**
     * ARN of the Table Stream. Only available when `stream_enabled = true`
     * 
     */
    @Export(name="streamArn", type=String.class, parameters={})
    private Output<String> streamArn;

    /**
     * @return ARN of the Table Stream. Only available when `stream_enabled = true`
     * 
     */
    public Output<String> streamArn() {
        return this.streamArn;
    }
    /**
     * Whether Streams are enabled.
     * 
     */
    @Export(name="streamEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> streamEnabled;

    /**
     * @return Whether Streams are enabled.
     * 
     */
    public Output<Optional<Boolean>> streamEnabled() {
        return Codegen.optional(this.streamEnabled);
    }
    /**
     * Timestamp, in ISO 8601 format, for this stream. Note that this timestamp is not a unique identifier for the stream on its own. However, the combination of AWS customer ID, table name and this field is guaranteed to be unique. It can be used for creating CloudWatch Alarms. Only available when `stream_enabled = true`
     * 
     */
    @Export(name="streamLabel", type=String.class, parameters={})
    private Output<String> streamLabel;

    /**
     * @return Timestamp, in ISO 8601 format, for this stream. Note that this timestamp is not a unique identifier for the stream on its own. However, the combination of AWS customer ID, table name and this field is guaranteed to be unique. It can be used for creating CloudWatch Alarms. Only available when `stream_enabled = true`
     * 
     */
    public Output<String> streamLabel() {
        return this.streamLabel;
    }
    /**
     * When an item in the table is modified, StreamViewType determines what information is written to the table&#39;s stream. Valid values are `KEYS_ONLY`, `NEW_IMAGE`, `OLD_IMAGE`, `NEW_AND_OLD_IMAGES`.
     * 
     */
    @Export(name="streamViewType", type=String.class, parameters={})
    private Output<String> streamViewType;

    /**
     * @return When an item in the table is modified, StreamViewType determines what information is written to the table&#39;s stream. Valid values are `KEYS_ONLY`, `NEW_IMAGE`, `OLD_IMAGE`, `NEW_AND_OLD_IMAGES`.
     * 
     */
    public Output<String> streamViewType() {
        return this.streamViewType;
    }
    /**
     * Storage class of the table. Valid values are `STANDARD` and `STANDARD_INFREQUENT_ACCESS`.
     * 
     */
    @Export(name="tableClass", type=String.class, parameters={})
    private Output</* @Nullable */ String> tableClass;

    /**
     * @return Storage class of the table. Valid values are `STANDARD` and `STANDARD_INFREQUENT_ACCESS`.
     * 
     */
    public Output<Optional<String>> tableClass() {
        return Codegen.optional(this.tableClass);
    }
    /**
     * A map of tags to populate on the created table. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to populate on the created table. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * Configuration block for TTL. See below.
     * 
     */
    @Export(name="ttl", type=TableTtl.class, parameters={})
    private Output<TableTtl> ttl;

    /**
     * @return Configuration block for TTL. See below.
     * 
     */
    public Output<TableTtl> ttl() {
        return this.ttl;
    }
    /**
     * Number of write units for this index. Must be set if billing_mode is set to PROVISIONED.
     * 
     */
    @Export(name="writeCapacity", type=Integer.class, parameters={})
    private Output<Integer> writeCapacity;

    /**
     * @return Number of write units for this index. Must be set if billing_mode is set to PROVISIONED.
     * 
     */
    public Output<Integer> writeCapacity() {
        return this.writeCapacity;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Table(String name) {
        this(name, TableArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Table(String name, @Nullable TableArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Table(String name, @Nullable TableArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:dynamodb/table:Table", name, args == null ? TableArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Table(String name, Output<String> id, @Nullable TableState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:dynamodb/table:Table", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Table get(String name, Output<String> id, @Nullable TableState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Table(name, id, state, options);
    }
}