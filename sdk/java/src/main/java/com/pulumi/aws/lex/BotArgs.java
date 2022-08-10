// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lex;

import com.pulumi.aws.lex.inputs.BotAbortStatementArgs;
import com.pulumi.aws.lex.inputs.BotClarificationPromptArgs;
import com.pulumi.aws.lex.inputs.BotIntentArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BotArgs extends com.pulumi.resources.ResourceArgs {

    public static final BotArgs Empty = new BotArgs();

    /**
     * The message that Amazon Lex uses to abort a conversation. Attributes are documented under statement.
     * 
     */
    @Import(name="abortStatement", required=true)
    private Output<BotAbortStatementArgs> abortStatement;

    /**
     * @return The message that Amazon Lex uses to abort a conversation. Attributes are documented under statement.
     * 
     */
    public Output<BotAbortStatementArgs> abortStatement() {
        return this.abortStatement;
    }

    /**
     * By specifying true, you confirm that your use of Amazon Lex is related to a website, program, or other application that is directed or targeted, in whole or in part, to children under age 13 and subject to COPPA. For more information see the [Amazon Lex FAQ](https://aws.amazon.com/lex/faqs#data-security) and the [Amazon Lex PutBot API Docs](https://docs.aws.amazon.com/lex/latest/dg/API_PutBot.html#lex-PutBot-request-childDirected).
     * 
     */
    @Import(name="childDirected", required=true)
    private Output<Boolean> childDirected;

    /**
     * @return By specifying true, you confirm that your use of Amazon Lex is related to a website, program, or other application that is directed or targeted, in whole or in part, to children under age 13 and subject to COPPA. For more information see the [Amazon Lex FAQ](https://aws.amazon.com/lex/faqs#data-security) and the [Amazon Lex PutBot API Docs](https://docs.aws.amazon.com/lex/latest/dg/API_PutBot.html#lex-PutBot-request-childDirected).
     * 
     */
    public Output<Boolean> childDirected() {
        return this.childDirected;
    }

    /**
     * The message that Amazon Lex uses when it doesn&#39;t understand the user&#39;s request. Attributes are documented under prompt.
     * 
     */
    @Import(name="clarificationPrompt")
    private @Nullable Output<BotClarificationPromptArgs> clarificationPrompt;

    /**
     * @return The message that Amazon Lex uses when it doesn&#39;t understand the user&#39;s request. Attributes are documented under prompt.
     * 
     */
    public Optional<Output<BotClarificationPromptArgs>> clarificationPrompt() {
        return Optional.ofNullable(this.clarificationPrompt);
    }

    /**
     * Determines if a new bot version is created when the initial resource is created and on each update. Defaults to `false`.
     * 
     */
    @Import(name="createVersion")
    private @Nullable Output<Boolean> createVersion;

    /**
     * @return Determines if a new bot version is created when the initial resource is created and on each update. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> createVersion() {
        return Optional.ofNullable(this.createVersion);
    }

    /**
     * A description of the bot. Must be less than or equal to 200 characters in length.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description of the bot. Must be less than or equal to 200 characters in length.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * When set to true user utterances are sent to Amazon Comprehend for sentiment analysis. If you don&#39;t specify detectSentiment, the default is `false`.
     * 
     */
    @Import(name="detectSentiment")
    private @Nullable Output<Boolean> detectSentiment;

    /**
     * @return When set to true user utterances are sent to Amazon Comprehend for sentiment analysis. If you don&#39;t specify detectSentiment, the default is `false`.
     * 
     */
    public Optional<Output<Boolean>> detectSentiment() {
        return Optional.ofNullable(this.detectSentiment);
    }

    /**
     * Set to `true` to enable access to natural language understanding improvements. When you set the `enable_model_improvements` parameter to true you can use the `nlu_intent_confidence_threshold` parameter to configure confidence scores. For more information, see [Confidence Scores](https://docs.aws.amazon.com/lex/latest/dg/confidence-scores.html). You can only set the `enable_model_improvements` parameter in certain Regions. If you set the parameter to true, your bot has access to accuracy improvements. For more information see the [Amazon Lex Bot PutBot API Docs](https://docs.aws.amazon.com/lex/latest/dg/API_PutBot.html#lex-PutBot-request-enableModelImprovements).
     * 
     */
    @Import(name="enableModelImprovements")
    private @Nullable Output<Boolean> enableModelImprovements;

    /**
     * @return Set to `true` to enable access to natural language understanding improvements. When you set the `enable_model_improvements` parameter to true you can use the `nlu_intent_confidence_threshold` parameter to configure confidence scores. For more information, see [Confidence Scores](https://docs.aws.amazon.com/lex/latest/dg/confidence-scores.html). You can only set the `enable_model_improvements` parameter in certain Regions. If you set the parameter to true, your bot has access to accuracy improvements. For more information see the [Amazon Lex Bot PutBot API Docs](https://docs.aws.amazon.com/lex/latest/dg/API_PutBot.html#lex-PutBot-request-enableModelImprovements).
     * 
     */
    public Optional<Output<Boolean>> enableModelImprovements() {
        return Optional.ofNullable(this.enableModelImprovements);
    }

    /**
     * The maximum time in seconds that Amazon Lex retains the data gathered in a conversation. Default is `300`. Must be a number between 60 and 86400 (inclusive).
     * 
     */
    @Import(name="idleSessionTtlInSeconds")
    private @Nullable Output<Integer> idleSessionTtlInSeconds;

    /**
     * @return The maximum time in seconds that Amazon Lex retains the data gathered in a conversation. Default is `300`. Must be a number between 60 and 86400 (inclusive).
     * 
     */
    public Optional<Output<Integer>> idleSessionTtlInSeconds() {
        return Optional.ofNullable(this.idleSessionTtlInSeconds);
    }

    /**
     * A set of Intent objects. Each intent represents a command that a user can express. Attributes are documented under intent. Can have up to 250 Intent objects.
     * 
     */
    @Import(name="intents", required=true)
    private Output<List<BotIntentArgs>> intents;

    /**
     * @return A set of Intent objects. Each intent represents a command that a user can express. Attributes are documented under intent. Can have up to 250 Intent objects.
     * 
     */
    public Output<List<BotIntentArgs>> intents() {
        return this.intents;
    }

    /**
     * Specifies the target locale for the bot. Any intent used in the bot must be compatible with the locale of the bot. For available locales, see [Amazon Lex Bot PutBot API Docs](https://docs.aws.amazon.com/lex/latest/dg/API_PutBot.html#lex-PutBot-request-locale). Default is `en-US`.
     * 
     */
    @Import(name="locale")
    private @Nullable Output<String> locale;

    /**
     * @return Specifies the target locale for the bot. Any intent used in the bot must be compatible with the locale of the bot. For available locales, see [Amazon Lex Bot PutBot API Docs](https://docs.aws.amazon.com/lex/latest/dg/API_PutBot.html#lex-PutBot-request-locale). Default is `en-US`.
     * 
     */
    public Optional<Output<String>> locale() {
        return Optional.ofNullable(this.locale);
    }

    /**
     * The name of the bot that you want to create, case sensitive. Must be between 2 and 50 characters in length.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the bot that you want to create, case sensitive. Must be between 2 and 50 characters in length.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Determines the threshold where Amazon Lex will insert the AMAZON.FallbackIntent, AMAZON.KendraSearchIntent, or both when returning alternative intents in a PostContent or PostText response. AMAZON.FallbackIntent and AMAZON.KendraSearchIntent are only inserted if they are configured for the bot. For more information see [Amazon Lex Bot PutBot API Docs](https://docs.aws.amazon.com/lex/latest/dg/API_PutBot.html#lex-PutBot-request-nluIntentConfidenceThreshold) This value requires `enable_model_improvements` to be set to `true` and the default is `0`. Must be a float between 0 and 1.
     * 
     */
    @Import(name="nluIntentConfidenceThreshold")
    private @Nullable Output<Double> nluIntentConfidenceThreshold;

    /**
     * @return Determines the threshold where Amazon Lex will insert the AMAZON.FallbackIntent, AMAZON.KendraSearchIntent, or both when returning alternative intents in a PostContent or PostText response. AMAZON.FallbackIntent and AMAZON.KendraSearchIntent are only inserted if they are configured for the bot. For more information see [Amazon Lex Bot PutBot API Docs](https://docs.aws.amazon.com/lex/latest/dg/API_PutBot.html#lex-PutBot-request-nluIntentConfidenceThreshold) This value requires `enable_model_improvements` to be set to `true` and the default is `0`. Must be a float between 0 and 1.
     * 
     */
    public Optional<Output<Double>> nluIntentConfidenceThreshold() {
        return Optional.ofNullable(this.nluIntentConfidenceThreshold);
    }

    /**
     * If you set the `process_behavior` element to `BUILD`, Amazon Lex builds the bot so that it can be run. If you set the element to `SAVE` Amazon Lex saves the bot, but doesn&#39;t build it. Default is `SAVE`.
     * 
     */
    @Import(name="processBehavior")
    private @Nullable Output<String> processBehavior;

    /**
     * @return If you set the `process_behavior` element to `BUILD`, Amazon Lex builds the bot so that it can be run. If you set the element to `SAVE` Amazon Lex saves the bot, but doesn&#39;t build it. Default is `SAVE`.
     * 
     */
    public Optional<Output<String>> processBehavior() {
        return Optional.ofNullable(this.processBehavior);
    }

    /**
     * The Amazon Polly voice ID that you want Amazon Lex to use for voice interactions with the user. The locale configured for the voice must match the locale of the bot. For more information, see [Available Voices](http://docs.aws.amazon.com/polly/latest/dg/voicelist.html) in the Amazon Polly Developer Guide.
     * 
     */
    @Import(name="voiceId")
    private @Nullable Output<String> voiceId;

    /**
     * @return The Amazon Polly voice ID that you want Amazon Lex to use for voice interactions with the user. The locale configured for the voice must match the locale of the bot. For more information, see [Available Voices](http://docs.aws.amazon.com/polly/latest/dg/voicelist.html) in the Amazon Polly Developer Guide.
     * 
     */
    public Optional<Output<String>> voiceId() {
        return Optional.ofNullable(this.voiceId);
    }

    private BotArgs() {}

    private BotArgs(BotArgs $) {
        this.abortStatement = $.abortStatement;
        this.childDirected = $.childDirected;
        this.clarificationPrompt = $.clarificationPrompt;
        this.createVersion = $.createVersion;
        this.description = $.description;
        this.detectSentiment = $.detectSentiment;
        this.enableModelImprovements = $.enableModelImprovements;
        this.idleSessionTtlInSeconds = $.idleSessionTtlInSeconds;
        this.intents = $.intents;
        this.locale = $.locale;
        this.name = $.name;
        this.nluIntentConfidenceThreshold = $.nluIntentConfidenceThreshold;
        this.processBehavior = $.processBehavior;
        this.voiceId = $.voiceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BotArgs $;

        public Builder() {
            $ = new BotArgs();
        }

        public Builder(BotArgs defaults) {
            $ = new BotArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param abortStatement The message that Amazon Lex uses to abort a conversation. Attributes are documented under statement.
         * 
         * @return builder
         * 
         */
        public Builder abortStatement(Output<BotAbortStatementArgs> abortStatement) {
            $.abortStatement = abortStatement;
            return this;
        }

        /**
         * @param abortStatement The message that Amazon Lex uses to abort a conversation. Attributes are documented under statement.
         * 
         * @return builder
         * 
         */
        public Builder abortStatement(BotAbortStatementArgs abortStatement) {
            return abortStatement(Output.of(abortStatement));
        }

        /**
         * @param childDirected By specifying true, you confirm that your use of Amazon Lex is related to a website, program, or other application that is directed or targeted, in whole or in part, to children under age 13 and subject to COPPA. For more information see the [Amazon Lex FAQ](https://aws.amazon.com/lex/faqs#data-security) and the [Amazon Lex PutBot API Docs](https://docs.aws.amazon.com/lex/latest/dg/API_PutBot.html#lex-PutBot-request-childDirected).
         * 
         * @return builder
         * 
         */
        public Builder childDirected(Output<Boolean> childDirected) {
            $.childDirected = childDirected;
            return this;
        }

        /**
         * @param childDirected By specifying true, you confirm that your use of Amazon Lex is related to a website, program, or other application that is directed or targeted, in whole or in part, to children under age 13 and subject to COPPA. For more information see the [Amazon Lex FAQ](https://aws.amazon.com/lex/faqs#data-security) and the [Amazon Lex PutBot API Docs](https://docs.aws.amazon.com/lex/latest/dg/API_PutBot.html#lex-PutBot-request-childDirected).
         * 
         * @return builder
         * 
         */
        public Builder childDirected(Boolean childDirected) {
            return childDirected(Output.of(childDirected));
        }

        /**
         * @param clarificationPrompt The message that Amazon Lex uses when it doesn&#39;t understand the user&#39;s request. Attributes are documented under prompt.
         * 
         * @return builder
         * 
         */
        public Builder clarificationPrompt(@Nullable Output<BotClarificationPromptArgs> clarificationPrompt) {
            $.clarificationPrompt = clarificationPrompt;
            return this;
        }

        /**
         * @param clarificationPrompt The message that Amazon Lex uses when it doesn&#39;t understand the user&#39;s request. Attributes are documented under prompt.
         * 
         * @return builder
         * 
         */
        public Builder clarificationPrompt(BotClarificationPromptArgs clarificationPrompt) {
            return clarificationPrompt(Output.of(clarificationPrompt));
        }

        /**
         * @param createVersion Determines if a new bot version is created when the initial resource is created and on each update. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder createVersion(@Nullable Output<Boolean> createVersion) {
            $.createVersion = createVersion;
            return this;
        }

        /**
         * @param createVersion Determines if a new bot version is created when the initial resource is created and on each update. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder createVersion(Boolean createVersion) {
            return createVersion(Output.of(createVersion));
        }

        /**
         * @param description A description of the bot. Must be less than or equal to 200 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description of the bot. Must be less than or equal to 200 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param detectSentiment When set to true user utterances are sent to Amazon Comprehend for sentiment analysis. If you don&#39;t specify detectSentiment, the default is `false`.
         * 
         * @return builder
         * 
         */
        public Builder detectSentiment(@Nullable Output<Boolean> detectSentiment) {
            $.detectSentiment = detectSentiment;
            return this;
        }

        /**
         * @param detectSentiment When set to true user utterances are sent to Amazon Comprehend for sentiment analysis. If you don&#39;t specify detectSentiment, the default is `false`.
         * 
         * @return builder
         * 
         */
        public Builder detectSentiment(Boolean detectSentiment) {
            return detectSentiment(Output.of(detectSentiment));
        }

        /**
         * @param enableModelImprovements Set to `true` to enable access to natural language understanding improvements. When you set the `enable_model_improvements` parameter to true you can use the `nlu_intent_confidence_threshold` parameter to configure confidence scores. For more information, see [Confidence Scores](https://docs.aws.amazon.com/lex/latest/dg/confidence-scores.html). You can only set the `enable_model_improvements` parameter in certain Regions. If you set the parameter to true, your bot has access to accuracy improvements. For more information see the [Amazon Lex Bot PutBot API Docs](https://docs.aws.amazon.com/lex/latest/dg/API_PutBot.html#lex-PutBot-request-enableModelImprovements).
         * 
         * @return builder
         * 
         */
        public Builder enableModelImprovements(@Nullable Output<Boolean> enableModelImprovements) {
            $.enableModelImprovements = enableModelImprovements;
            return this;
        }

        /**
         * @param enableModelImprovements Set to `true` to enable access to natural language understanding improvements. When you set the `enable_model_improvements` parameter to true you can use the `nlu_intent_confidence_threshold` parameter to configure confidence scores. For more information, see [Confidence Scores](https://docs.aws.amazon.com/lex/latest/dg/confidence-scores.html). You can only set the `enable_model_improvements` parameter in certain Regions. If you set the parameter to true, your bot has access to accuracy improvements. For more information see the [Amazon Lex Bot PutBot API Docs](https://docs.aws.amazon.com/lex/latest/dg/API_PutBot.html#lex-PutBot-request-enableModelImprovements).
         * 
         * @return builder
         * 
         */
        public Builder enableModelImprovements(Boolean enableModelImprovements) {
            return enableModelImprovements(Output.of(enableModelImprovements));
        }

        /**
         * @param idleSessionTtlInSeconds The maximum time in seconds that Amazon Lex retains the data gathered in a conversation. Default is `300`. Must be a number between 60 and 86400 (inclusive).
         * 
         * @return builder
         * 
         */
        public Builder idleSessionTtlInSeconds(@Nullable Output<Integer> idleSessionTtlInSeconds) {
            $.idleSessionTtlInSeconds = idleSessionTtlInSeconds;
            return this;
        }

        /**
         * @param idleSessionTtlInSeconds The maximum time in seconds that Amazon Lex retains the data gathered in a conversation. Default is `300`. Must be a number between 60 and 86400 (inclusive).
         * 
         * @return builder
         * 
         */
        public Builder idleSessionTtlInSeconds(Integer idleSessionTtlInSeconds) {
            return idleSessionTtlInSeconds(Output.of(idleSessionTtlInSeconds));
        }

        /**
         * @param intents A set of Intent objects. Each intent represents a command that a user can express. Attributes are documented under intent. Can have up to 250 Intent objects.
         * 
         * @return builder
         * 
         */
        public Builder intents(Output<List<BotIntentArgs>> intents) {
            $.intents = intents;
            return this;
        }

        /**
         * @param intents A set of Intent objects. Each intent represents a command that a user can express. Attributes are documented under intent. Can have up to 250 Intent objects.
         * 
         * @return builder
         * 
         */
        public Builder intents(List<BotIntentArgs> intents) {
            return intents(Output.of(intents));
        }

        /**
         * @param intents A set of Intent objects. Each intent represents a command that a user can express. Attributes are documented under intent. Can have up to 250 Intent objects.
         * 
         * @return builder
         * 
         */
        public Builder intents(BotIntentArgs... intents) {
            return intents(List.of(intents));
        }

        /**
         * @param locale Specifies the target locale for the bot. Any intent used in the bot must be compatible with the locale of the bot. For available locales, see [Amazon Lex Bot PutBot API Docs](https://docs.aws.amazon.com/lex/latest/dg/API_PutBot.html#lex-PutBot-request-locale). Default is `en-US`.
         * 
         * @return builder
         * 
         */
        public Builder locale(@Nullable Output<String> locale) {
            $.locale = locale;
            return this;
        }

        /**
         * @param locale Specifies the target locale for the bot. Any intent used in the bot must be compatible with the locale of the bot. For available locales, see [Amazon Lex Bot PutBot API Docs](https://docs.aws.amazon.com/lex/latest/dg/API_PutBot.html#lex-PutBot-request-locale). Default is `en-US`.
         * 
         * @return builder
         * 
         */
        public Builder locale(String locale) {
            return locale(Output.of(locale));
        }

        /**
         * @param name The name of the bot that you want to create, case sensitive. Must be between 2 and 50 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the bot that you want to create, case sensitive. Must be between 2 and 50 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param nluIntentConfidenceThreshold Determines the threshold where Amazon Lex will insert the AMAZON.FallbackIntent, AMAZON.KendraSearchIntent, or both when returning alternative intents in a PostContent or PostText response. AMAZON.FallbackIntent and AMAZON.KendraSearchIntent are only inserted if they are configured for the bot. For more information see [Amazon Lex Bot PutBot API Docs](https://docs.aws.amazon.com/lex/latest/dg/API_PutBot.html#lex-PutBot-request-nluIntentConfidenceThreshold) This value requires `enable_model_improvements` to be set to `true` and the default is `0`. Must be a float between 0 and 1.
         * 
         * @return builder
         * 
         */
        public Builder nluIntentConfidenceThreshold(@Nullable Output<Double> nluIntentConfidenceThreshold) {
            $.nluIntentConfidenceThreshold = nluIntentConfidenceThreshold;
            return this;
        }

        /**
         * @param nluIntentConfidenceThreshold Determines the threshold where Amazon Lex will insert the AMAZON.FallbackIntent, AMAZON.KendraSearchIntent, or both when returning alternative intents in a PostContent or PostText response. AMAZON.FallbackIntent and AMAZON.KendraSearchIntent are only inserted if they are configured for the bot. For more information see [Amazon Lex Bot PutBot API Docs](https://docs.aws.amazon.com/lex/latest/dg/API_PutBot.html#lex-PutBot-request-nluIntentConfidenceThreshold) This value requires `enable_model_improvements` to be set to `true` and the default is `0`. Must be a float between 0 and 1.
         * 
         * @return builder
         * 
         */
        public Builder nluIntentConfidenceThreshold(Double nluIntentConfidenceThreshold) {
            return nluIntentConfidenceThreshold(Output.of(nluIntentConfidenceThreshold));
        }

        /**
         * @param processBehavior If you set the `process_behavior` element to `BUILD`, Amazon Lex builds the bot so that it can be run. If you set the element to `SAVE` Amazon Lex saves the bot, but doesn&#39;t build it. Default is `SAVE`.
         * 
         * @return builder
         * 
         */
        public Builder processBehavior(@Nullable Output<String> processBehavior) {
            $.processBehavior = processBehavior;
            return this;
        }

        /**
         * @param processBehavior If you set the `process_behavior` element to `BUILD`, Amazon Lex builds the bot so that it can be run. If you set the element to `SAVE` Amazon Lex saves the bot, but doesn&#39;t build it. Default is `SAVE`.
         * 
         * @return builder
         * 
         */
        public Builder processBehavior(String processBehavior) {
            return processBehavior(Output.of(processBehavior));
        }

        /**
         * @param voiceId The Amazon Polly voice ID that you want Amazon Lex to use for voice interactions with the user. The locale configured for the voice must match the locale of the bot. For more information, see [Available Voices](http://docs.aws.amazon.com/polly/latest/dg/voicelist.html) in the Amazon Polly Developer Guide.
         * 
         * @return builder
         * 
         */
        public Builder voiceId(@Nullable Output<String> voiceId) {
            $.voiceId = voiceId;
            return this;
        }

        /**
         * @param voiceId The Amazon Polly voice ID that you want Amazon Lex to use for voice interactions with the user. The locale configured for the voice must match the locale of the bot. For more information, see [Available Voices](http://docs.aws.amazon.com/polly/latest/dg/voicelist.html) in the Amazon Polly Developer Guide.
         * 
         * @return builder
         * 
         */
        public Builder voiceId(String voiceId) {
            return voiceId(Output.of(voiceId));
        }

        public BotArgs build() {
            $.abortStatement = Objects.requireNonNull($.abortStatement, "expected parameter 'abortStatement' to be non-null");
            $.childDirected = Objects.requireNonNull($.childDirected, "expected parameter 'childDirected' to be non-null");
            $.intents = Objects.requireNonNull($.intents, "expected parameter 'intents' to be non-null");
            return $;
        }
    }

}