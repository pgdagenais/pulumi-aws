// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lakeformation.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ResourceLfTagsTableWithColumns {
    /**
     * @return Identifier for the Data Catalog. By default, it is the account ID of the caller.
     * 
     */
    private final @Nullable String catalogId;
    /**
     * @return Set of column names for the table.
     * 
     */
    private final @Nullable List<String> columnNames;
    /**
     * @return Name of the database for the table with columns resource. Unique to the Data Catalog.
     * 
     */
    private final String databaseName;
    private final @Nullable List<String> excludedColumnNames;
    /**
     * @return Name of the table resource.
     * 
     */
    private final String name;
    private final @Nullable Boolean wildcard;

    @CustomType.Constructor
    private ResourceLfTagsTableWithColumns(
        @CustomType.Parameter("catalogId") @Nullable String catalogId,
        @CustomType.Parameter("columnNames") @Nullable List<String> columnNames,
        @CustomType.Parameter("databaseName") String databaseName,
        @CustomType.Parameter("excludedColumnNames") @Nullable List<String> excludedColumnNames,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("wildcard") @Nullable Boolean wildcard) {
        this.catalogId = catalogId;
        this.columnNames = columnNames;
        this.databaseName = databaseName;
        this.excludedColumnNames = excludedColumnNames;
        this.name = name;
        this.wildcard = wildcard;
    }

    /**
     * @return Identifier for the Data Catalog. By default, it is the account ID of the caller.
     * 
     */
    public Optional<String> catalogId() {
        return Optional.ofNullable(this.catalogId);
    }
    /**
     * @return Set of column names for the table.
     * 
     */
    public List<String> columnNames() {
        return this.columnNames == null ? List.of() : this.columnNames;
    }
    /**
     * @return Name of the database for the table with columns resource. Unique to the Data Catalog.
     * 
     */
    public String databaseName() {
        return this.databaseName;
    }
    public List<String> excludedColumnNames() {
        return this.excludedColumnNames == null ? List.of() : this.excludedColumnNames;
    }
    /**
     * @return Name of the table resource.
     * 
     */
    public String name() {
        return this.name;
    }
    public Optional<Boolean> wildcard() {
        return Optional.ofNullable(this.wildcard);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceLfTagsTableWithColumns defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String catalogId;
        private @Nullable List<String> columnNames;
        private String databaseName;
        private @Nullable List<String> excludedColumnNames;
        private String name;
        private @Nullable Boolean wildcard;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceLfTagsTableWithColumns defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalogId = defaults.catalogId;
    	      this.columnNames = defaults.columnNames;
    	      this.databaseName = defaults.databaseName;
    	      this.excludedColumnNames = defaults.excludedColumnNames;
    	      this.name = defaults.name;
    	      this.wildcard = defaults.wildcard;
        }

        public Builder catalogId(@Nullable String catalogId) {
            this.catalogId = catalogId;
            return this;
        }
        public Builder columnNames(@Nullable List<String> columnNames) {
            this.columnNames = columnNames;
            return this;
        }
        public Builder columnNames(String... columnNames) {
            return columnNames(List.of(columnNames));
        }
        public Builder databaseName(String databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }
        public Builder excludedColumnNames(@Nullable List<String> excludedColumnNames) {
            this.excludedColumnNames = excludedColumnNames;
            return this;
        }
        public Builder excludedColumnNames(String... excludedColumnNames) {
            return excludedColumnNames(List.of(excludedColumnNames));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder wildcard(@Nullable Boolean wildcard) {
            this.wildcard = wildcard;
            return this;
        }        public ResourceLfTagsTableWithColumns build() {
            return new ResourceLfTagsTableWithColumns(catalogId, columnNames, databaseName, excludedColumnNames, name, wildcard);
        }
    }
}