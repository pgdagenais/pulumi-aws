// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.accessanalyzer.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ArchiveRuleFilter {
    /**
     * @return Contains comparator.
     * 
     */
    private final @Nullable List<String> contains;
    /**
     * @return The filter criteria.
     * 
     */
    private final String criteria;
    /**
     * @return Equals comparator.
     * 
     */
    private final @Nullable List<String> eqs;
    /**
     * @return Boolean comparator.
     * 
     */
    private final @Nullable String exists;
    /**
     * @return Not Equals comparator.
     * 
     */
    private final @Nullable List<String> neqs;

    @CustomType.Constructor
    private ArchiveRuleFilter(
        @CustomType.Parameter("contains") @Nullable List<String> contains,
        @CustomType.Parameter("criteria") String criteria,
        @CustomType.Parameter("eqs") @Nullable List<String> eqs,
        @CustomType.Parameter("exists") @Nullable String exists,
        @CustomType.Parameter("neqs") @Nullable List<String> neqs) {
        this.contains = contains;
        this.criteria = criteria;
        this.eqs = eqs;
        this.exists = exists;
        this.neqs = neqs;
    }

    /**
     * @return Contains comparator.
     * 
     */
    public List<String> contains() {
        return this.contains == null ? List.of() : this.contains;
    }
    /**
     * @return The filter criteria.
     * 
     */
    public String criteria() {
        return this.criteria;
    }
    /**
     * @return Equals comparator.
     * 
     */
    public List<String> eqs() {
        return this.eqs == null ? List.of() : this.eqs;
    }
    /**
     * @return Boolean comparator.
     * 
     */
    public Optional<String> exists() {
        return Optional.ofNullable(this.exists);
    }
    /**
     * @return Not Equals comparator.
     * 
     */
    public List<String> neqs() {
        return this.neqs == null ? List.of() : this.neqs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ArchiveRuleFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> contains;
        private String criteria;
        private @Nullable List<String> eqs;
        private @Nullable String exists;
        private @Nullable List<String> neqs;

        public Builder() {
    	      // Empty
        }

        public Builder(ArchiveRuleFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contains = defaults.contains;
    	      this.criteria = defaults.criteria;
    	      this.eqs = defaults.eqs;
    	      this.exists = defaults.exists;
    	      this.neqs = defaults.neqs;
        }

        public Builder contains(@Nullable List<String> contains) {
            this.contains = contains;
            return this;
        }
        public Builder contains(String... contains) {
            return contains(List.of(contains));
        }
        public Builder criteria(String criteria) {
            this.criteria = Objects.requireNonNull(criteria);
            return this;
        }
        public Builder eqs(@Nullable List<String> eqs) {
            this.eqs = eqs;
            return this;
        }
        public Builder eqs(String... eqs) {
            return eqs(List.of(eqs));
        }
        public Builder exists(@Nullable String exists) {
            this.exists = exists;
            return this;
        }
        public Builder neqs(@Nullable List<String> neqs) {
            this.neqs = neqs;
            return this;
        }
        public Builder neqs(String... neqs) {
            return neqs(List.of(neqs));
        }        public ArchiveRuleFilter build() {
            return new ArchiveRuleFilter(contains, criteria, eqs, exists, neqs);
        }
    }
}