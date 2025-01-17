// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cognito.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UserPoolSmsConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserPoolSmsConfigurationArgs Empty = new UserPoolSmsConfigurationArgs();

    /**
     * External ID used in IAM role trust relationships. For more information about using external IDs, see [How to Use an External ID When Granting Access to Your AWS Resources to a Third Party](http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html).
     * 
     */
    @Import(name="externalId", required=true)
    private Output<String> externalId;

    /**
     * @return External ID used in IAM role trust relationships. For more information about using external IDs, see [How to Use an External ID When Granting Access to Your AWS Resources to a Third Party](http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html).
     * 
     */
    public Output<String> externalId() {
        return this.externalId;
    }

    /**
     * ARN of the Amazon SNS caller. This is usually the IAM role that you&#39;ve given Cognito permission to assume.
     * 
     */
    @Import(name="snsCallerArn", required=true)
    private Output<String> snsCallerArn;

    /**
     * @return ARN of the Amazon SNS caller. This is usually the IAM role that you&#39;ve given Cognito permission to assume.
     * 
     */
    public Output<String> snsCallerArn() {
        return this.snsCallerArn;
    }

    /**
     * The AWS Region to use with Amazon SNS integration. You can choose the same Region as your user pool, or a supported Legacy Amazon SNS alternate Region. Amazon Cognito resources in the Asia Pacific (Seoul) AWS Region must use your Amazon SNS configuration in the Asia Pacific (Tokyo) Region. For more information, see [SMS message settings for Amazon Cognito user pools](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-sms-settings.html).
     * 
     */
    @Import(name="snsRegion")
    private @Nullable Output<String> snsRegion;

    /**
     * @return The AWS Region to use with Amazon SNS integration. You can choose the same Region as your user pool, or a supported Legacy Amazon SNS alternate Region. Amazon Cognito resources in the Asia Pacific (Seoul) AWS Region must use your Amazon SNS configuration in the Asia Pacific (Tokyo) Region. For more information, see [SMS message settings for Amazon Cognito user pools](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-sms-settings.html).
     * 
     */
    public Optional<Output<String>> snsRegion() {
        return Optional.ofNullable(this.snsRegion);
    }

    private UserPoolSmsConfigurationArgs() {}

    private UserPoolSmsConfigurationArgs(UserPoolSmsConfigurationArgs $) {
        this.externalId = $.externalId;
        this.snsCallerArn = $.snsCallerArn;
        this.snsRegion = $.snsRegion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserPoolSmsConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserPoolSmsConfigurationArgs $;

        public Builder() {
            $ = new UserPoolSmsConfigurationArgs();
        }

        public Builder(UserPoolSmsConfigurationArgs defaults) {
            $ = new UserPoolSmsConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param externalId External ID used in IAM role trust relationships. For more information about using external IDs, see [How to Use an External ID When Granting Access to Your AWS Resources to a Third Party](http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html).
         * 
         * @return builder
         * 
         */
        public Builder externalId(Output<String> externalId) {
            $.externalId = externalId;
            return this;
        }

        /**
         * @param externalId External ID used in IAM role trust relationships. For more information about using external IDs, see [How to Use an External ID When Granting Access to Your AWS Resources to a Third Party](http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html).
         * 
         * @return builder
         * 
         */
        public Builder externalId(String externalId) {
            return externalId(Output.of(externalId));
        }

        /**
         * @param snsCallerArn ARN of the Amazon SNS caller. This is usually the IAM role that you&#39;ve given Cognito permission to assume.
         * 
         * @return builder
         * 
         */
        public Builder snsCallerArn(Output<String> snsCallerArn) {
            $.snsCallerArn = snsCallerArn;
            return this;
        }

        /**
         * @param snsCallerArn ARN of the Amazon SNS caller. This is usually the IAM role that you&#39;ve given Cognito permission to assume.
         * 
         * @return builder
         * 
         */
        public Builder snsCallerArn(String snsCallerArn) {
            return snsCallerArn(Output.of(snsCallerArn));
        }

        /**
         * @param snsRegion The AWS Region to use with Amazon SNS integration. You can choose the same Region as your user pool, or a supported Legacy Amazon SNS alternate Region. Amazon Cognito resources in the Asia Pacific (Seoul) AWS Region must use your Amazon SNS configuration in the Asia Pacific (Tokyo) Region. For more information, see [SMS message settings for Amazon Cognito user pools](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-sms-settings.html).
         * 
         * @return builder
         * 
         */
        public Builder snsRegion(@Nullable Output<String> snsRegion) {
            $.snsRegion = snsRegion;
            return this;
        }

        /**
         * @param snsRegion The AWS Region to use with Amazon SNS integration. You can choose the same Region as your user pool, or a supported Legacy Amazon SNS alternate Region. Amazon Cognito resources in the Asia Pacific (Seoul) AWS Region must use your Amazon SNS configuration in the Asia Pacific (Tokyo) Region. For more information, see [SMS message settings for Amazon Cognito user pools](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-sms-settings.html).
         * 
         * @return builder
         * 
         */
        public Builder snsRegion(String snsRegion) {
            return snsRegion(Output.of(snsRegion));
        }

        public UserPoolSmsConfigurationArgs build() {
            if ($.externalId == null) {
                throw new MissingRequiredPropertyException("UserPoolSmsConfigurationArgs", "externalId");
            }
            if ($.snsCallerArn == null) {
                throw new MissingRequiredPropertyException("UserPoolSmsConfigurationArgs", "snsCallerArn");
            }
            return $;
        }
    }

}
