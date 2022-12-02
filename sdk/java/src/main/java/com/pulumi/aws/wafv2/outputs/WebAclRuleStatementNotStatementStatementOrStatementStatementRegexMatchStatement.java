// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementNotStatementStatementOrStatementStatementRegexMatchStatementFieldToMatch;
import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementNotStatementStatementOrStatementStatementRegexMatchStatementTextTransformation;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WebAclRuleStatementNotStatementStatementOrStatementStatementRegexMatchStatement {
    /**
     * @return The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    private @Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementRegexMatchStatementFieldToMatch fieldToMatch;
    /**
     * @return String representing the regular expression. Minimum of `1` and maximum of `512` characters.
     * 
     */
    private String regexString;
    /**
     * @return Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection.
     * At least one required.
     * See Text Transformation below for details.
     * 
     */
    private List<WebAclRuleStatementNotStatementStatementOrStatementStatementRegexMatchStatementTextTransformation> textTransformations;

    private WebAclRuleStatementNotStatementStatementOrStatementStatementRegexMatchStatement() {}
    /**
     * @return The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    public Optional<WebAclRuleStatementNotStatementStatementOrStatementStatementRegexMatchStatementFieldToMatch> fieldToMatch() {
        return Optional.ofNullable(this.fieldToMatch);
    }
    /**
     * @return String representing the regular expression. Minimum of `1` and maximum of `512` characters.
     * 
     */
    public String regexString() {
        return this.regexString;
    }
    /**
     * @return Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection.
     * At least one required.
     * See Text Transformation below for details.
     * 
     */
    public List<WebAclRuleStatementNotStatementStatementOrStatementStatementRegexMatchStatementTextTransformation> textTransformations() {
        return this.textTransformations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementNotStatementStatementOrStatementStatementRegexMatchStatement defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementRegexMatchStatementFieldToMatch fieldToMatch;
        private String regexString;
        private List<WebAclRuleStatementNotStatementStatementOrStatementStatementRegexMatchStatementTextTransformation> textTransformations;
        public Builder() {}
        public Builder(WebAclRuleStatementNotStatementStatementOrStatementStatementRegexMatchStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.regexString = defaults.regexString;
    	      this.textTransformations = defaults.textTransformations;
        }

        @CustomType.Setter
        public Builder fieldToMatch(@Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementRegexMatchStatementFieldToMatch fieldToMatch) {
            this.fieldToMatch = fieldToMatch;
            return this;
        }
        @CustomType.Setter
        public Builder regexString(String regexString) {
            this.regexString = Objects.requireNonNull(regexString);
            return this;
        }
        @CustomType.Setter
        public Builder textTransformations(List<WebAclRuleStatementNotStatementStatementOrStatementStatementRegexMatchStatementTextTransformation> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }
        public Builder textTransformations(WebAclRuleStatementNotStatementStatementOrStatementStatementRegexMatchStatementTextTransformation... textTransformations) {
            return textTransformations(List.of(textTransformations));
        }
        public WebAclRuleStatementNotStatementStatementOrStatementStatementRegexMatchStatement build() {
            final var o = new WebAclRuleStatementNotStatementStatementOrStatementStatementRegexMatchStatement();
            o.fieldToMatch = fieldToMatch;
            o.regexString = regexString;
            o.textTransformations = textTransformations;
            return o;
        }
    }
}