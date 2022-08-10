// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lakeformation.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetResourceArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetResourceArgs Empty = new GetResourceArgs();

    /**
     * Amazon Resource Name (ARN) of the resource, an S3 path.
     * 
     */
    @Import(name="arn", required=true)
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the resource, an S3 path.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }

    private GetResourceArgs() {}

    private GetResourceArgs(GetResourceArgs $) {
        this.arn = $.arn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetResourceArgs $;

        public Builder() {
            $ = new GetResourceArgs();
        }

        public Builder(GetResourceArgs defaults) {
            $ = new GetResourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn Amazon Resource Name (ARN) of the resource, an S3 path.
         * 
         * @return builder
         * 
         */
        public Builder arn(Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn Amazon Resource Name (ARN) of the resource, an S3 path.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public GetResourceArgs build() {
            $.arn = Objects.requireNonNull($.arn, "expected parameter 'arn' to be non-null");
            return $;
        }
    }

}