// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementRegexMatchStatementFieldToMatchAllQueryArguments {
    private WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementRegexMatchStatementFieldToMatchAllQueryArguments() {}

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementRegexMatchStatementFieldToMatchAllQueryArguments defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        public Builder() {}
        public Builder(WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementRegexMatchStatementFieldToMatchAllQueryArguments defaults) {
    	      Objects.requireNonNull(defaults);
        }

        public WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementRegexMatchStatementFieldToMatchAllQueryArguments build() {
            final var o = new WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementRegexMatchStatementFieldToMatchAllQueryArguments();
            return o;
        }
    }
}