// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sesv2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class GetConfigurationSetSendingOption {
    /**
     * @return Specifies whether email sending is enabled.
     * 
     */
    private Boolean sendingEnabled;

    private GetConfigurationSetSendingOption() {}
    /**
     * @return Specifies whether email sending is enabled.
     * 
     */
    public Boolean sendingEnabled() {
        return this.sendingEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConfigurationSetSendingOption defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean sendingEnabled;
        public Builder() {}
        public Builder(GetConfigurationSetSendingOption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sendingEnabled = defaults.sendingEnabled;
        }

        @CustomType.Setter
        public Builder sendingEnabled(Boolean sendingEnabled) {
            if (sendingEnabled == null) {
              throw new MissingRequiredPropertyException("GetConfigurationSetSendingOption", "sendingEnabled");
            }
            this.sendingEnabled = sendingEnabled;
            return this;
        }
        public GetConfigurationSetSendingOption build() {
            final var _resultValue = new GetConfigurationSetSendingOption();
            _resultValue.sendingEnabled = sendingEnabled;
            return _resultValue;
        }
    }
}
