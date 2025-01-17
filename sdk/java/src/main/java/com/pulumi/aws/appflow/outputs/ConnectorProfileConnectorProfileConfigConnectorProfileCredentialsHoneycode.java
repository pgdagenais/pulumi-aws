// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appflow.outputs;

import com.pulumi.aws.appflow.outputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsHoneycodeOauthRequest;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsHoneycode {
    /**
     * @return The access token used to access the connector on your behalf.
     * 
     */
    private @Nullable String accessToken;
    /**
     * @return Used by select connectors for which the OAuth workflow is supported. See OAuth Request for more details.
     * 
     */
    private @Nullable ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsHoneycodeOauthRequest oauthRequest;
    /**
     * @return The refresh token used to refresh an expired access token.
     * 
     */
    private @Nullable String refreshToken;

    private ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsHoneycode() {}
    /**
     * @return The access token used to access the connector on your behalf.
     * 
     */
    public Optional<String> accessToken() {
        return Optional.ofNullable(this.accessToken);
    }
    /**
     * @return Used by select connectors for which the OAuth workflow is supported. See OAuth Request for more details.
     * 
     */
    public Optional<ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsHoneycodeOauthRequest> oauthRequest() {
        return Optional.ofNullable(this.oauthRequest);
    }
    /**
     * @return The refresh token used to refresh an expired access token.
     * 
     */
    public Optional<String> refreshToken() {
        return Optional.ofNullable(this.refreshToken);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsHoneycode defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String accessToken;
        private @Nullable ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsHoneycodeOauthRequest oauthRequest;
        private @Nullable String refreshToken;
        public Builder() {}
        public Builder(ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsHoneycode defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessToken = defaults.accessToken;
    	      this.oauthRequest = defaults.oauthRequest;
    	      this.refreshToken = defaults.refreshToken;
        }

        @CustomType.Setter
        public Builder accessToken(@Nullable String accessToken) {

            this.accessToken = accessToken;
            return this;
        }
        @CustomType.Setter
        public Builder oauthRequest(@Nullable ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsHoneycodeOauthRequest oauthRequest) {

            this.oauthRequest = oauthRequest;
            return this;
        }
        @CustomType.Setter
        public Builder refreshToken(@Nullable String refreshToken) {

            this.refreshToken = refreshToken;
            return this;
        }
        public ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsHoneycode build() {
            final var _resultValue = new ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsHoneycode();
            _resultValue.accessToken = accessToken;
            _resultValue.oauthRequest = oauthRequest;
            _resultValue.refreshToken = refreshToken;
            return _resultValue;
        }
    }
}
