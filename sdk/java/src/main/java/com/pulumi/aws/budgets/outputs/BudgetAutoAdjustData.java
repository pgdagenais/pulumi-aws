// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.budgets.outputs;

import com.pulumi.aws.budgets.outputs.BudgetAutoAdjustDataHistoricalOptions;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BudgetAutoAdjustData {
    private String autoAdjustType;
    private @Nullable BudgetAutoAdjustDataHistoricalOptions historicalOptions;
    private @Nullable String lastAutoAdjustTime;

    private BudgetAutoAdjustData() {}
    public String autoAdjustType() {
        return this.autoAdjustType;
    }
    public Optional<BudgetAutoAdjustDataHistoricalOptions> historicalOptions() {
        return Optional.ofNullable(this.historicalOptions);
    }
    public Optional<String> lastAutoAdjustTime() {
        return Optional.ofNullable(this.lastAutoAdjustTime);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BudgetAutoAdjustData defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String autoAdjustType;
        private @Nullable BudgetAutoAdjustDataHistoricalOptions historicalOptions;
        private @Nullable String lastAutoAdjustTime;
        public Builder() {}
        public Builder(BudgetAutoAdjustData defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoAdjustType = defaults.autoAdjustType;
    	      this.historicalOptions = defaults.historicalOptions;
    	      this.lastAutoAdjustTime = defaults.lastAutoAdjustTime;
        }

        @CustomType.Setter
        public Builder autoAdjustType(String autoAdjustType) {
            this.autoAdjustType = Objects.requireNonNull(autoAdjustType);
            return this;
        }
        @CustomType.Setter
        public Builder historicalOptions(@Nullable BudgetAutoAdjustDataHistoricalOptions historicalOptions) {
            this.historicalOptions = historicalOptions;
            return this;
        }
        @CustomType.Setter
        public Builder lastAutoAdjustTime(@Nullable String lastAutoAdjustTime) {
            this.lastAutoAdjustTime = lastAutoAdjustTime;
            return this;
        }
        public BudgetAutoAdjustData build() {
            final var o = new BudgetAutoAdjustData();
            o.autoAdjustType = autoAdjustType;
            o.historicalOptions = historicalOptions;
            o.lastAutoAdjustTime = lastAutoAdjustTime;
            return o;
        }
    }
}