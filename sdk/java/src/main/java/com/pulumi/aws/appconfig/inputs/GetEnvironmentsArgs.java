// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appconfig.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetEnvironmentsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEnvironmentsArgs Empty = new GetEnvironmentsArgs();

    /**
     * ID of the AppConfig Application.
     * 
     */
    @Import(name="applicationId", required=true)
    private Output<String> applicationId;

    /**
     * @return ID of the AppConfig Application.
     * 
     */
    public Output<String> applicationId() {
        return this.applicationId;
    }

    private GetEnvironmentsArgs() {}

    private GetEnvironmentsArgs(GetEnvironmentsArgs $) {
        this.applicationId = $.applicationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEnvironmentsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEnvironmentsArgs $;

        public Builder() {
            $ = new GetEnvironmentsArgs();
        }

        public Builder(GetEnvironmentsArgs defaults) {
            $ = new GetEnvironmentsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param applicationId ID of the AppConfig Application.
         * 
         * @return builder
         * 
         */
        public Builder applicationId(Output<String> applicationId) {
            $.applicationId = applicationId;
            return this;
        }

        /**
         * @param applicationId ID of the AppConfig Application.
         * 
         * @return builder
         * 
         */
        public Builder applicationId(String applicationId) {
            return applicationId(Output.of(applicationId));
        }

        public GetEnvironmentsArgs build() {
            $.applicationId = Objects.requireNonNull($.applicationId, "expected parameter 'applicationId' to be non-null");
            return $;
        }
    }

}