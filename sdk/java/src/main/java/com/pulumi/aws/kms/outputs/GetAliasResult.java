// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kms.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAliasResult {
    /**
     * @return The Amazon Resource Name(ARN) of the key alias.
     * 
     */
    private final String arn;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String name;
    /**
     * @return ARN pointed to by the alias.
     * 
     */
    private final String targetKeyArn;
    /**
     * @return Key identifier pointed to by the alias.
     * 
     */
    private final String targetKeyId;

    @CustomType.Constructor
    private GetAliasResult(
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("targetKeyArn") String targetKeyArn,
        @CustomType.Parameter("targetKeyId") String targetKeyId) {
        this.arn = arn;
        this.id = id;
        this.name = name;
        this.targetKeyArn = targetKeyArn;
        this.targetKeyId = targetKeyId;
    }

    /**
     * @return The Amazon Resource Name(ARN) of the key alias.
     * 
     */
    public String arn() {
        return this.arn;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return ARN pointed to by the alias.
     * 
     */
    public String targetKeyArn() {
        return this.targetKeyArn;
    }
    /**
     * @return Key identifier pointed to by the alias.
     * 
     */
    public String targetKeyId() {
        return this.targetKeyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAliasResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String id;
        private String name;
        private String targetKeyArn;
        private String targetKeyId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAliasResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.targetKeyArn = defaults.targetKeyArn;
    	      this.targetKeyId = defaults.targetKeyId;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder targetKeyArn(String targetKeyArn) {
            this.targetKeyArn = Objects.requireNonNull(targetKeyArn);
            return this;
        }
        public Builder targetKeyId(String targetKeyId) {
            this.targetKeyId = Objects.requireNonNull(targetKeyId);
            return this;
        }        public GetAliasResult build() {
            return new GetAliasResult(arn, id, name, targetKeyArn, targetKeyId);
        }
    }
}