// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lex.outputs;

import com.pulumi.aws.lex.outputs.IntentSlotValueElicitationPromptMessage;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IntentSlotValueElicitationPrompt {
    /**
     * @return The number of times to prompt the user for information. Must be a number between 1 and 5 (inclusive).
     * 
     */
    private final Integer maxAttempts;
    /**
     * @return A set of messages, each of which provides a message string and its type.
     * You can specify the message string in plain text or in Speech Synthesis Markup Language (SSML).
     * Attributes are documented under message. Must contain between 1 and 15 messages.
     * 
     */
    private final List<IntentSlotValueElicitationPromptMessage> messages;
    /**
     * @return The response card. Amazon Lex will substitute session attributes and
     * slot values into the response card. For more information, see
     * [Example: Using a Response Card](https://docs.aws.amazon.com/lex/latest/dg/ex-resp-card.html). Must be less than or equal to 50000 characters in length.
     * 
     */
    private final @Nullable String responseCard;

    @CustomType.Constructor
    private IntentSlotValueElicitationPrompt(
        @CustomType.Parameter("maxAttempts") Integer maxAttempts,
        @CustomType.Parameter("messages") List<IntentSlotValueElicitationPromptMessage> messages,
        @CustomType.Parameter("responseCard") @Nullable String responseCard) {
        this.maxAttempts = maxAttempts;
        this.messages = messages;
        this.responseCard = responseCard;
    }

    /**
     * @return The number of times to prompt the user for information. Must be a number between 1 and 5 (inclusive).
     * 
     */
    public Integer maxAttempts() {
        return this.maxAttempts;
    }
    /**
     * @return A set of messages, each of which provides a message string and its type.
     * You can specify the message string in plain text or in Speech Synthesis Markup Language (SSML).
     * Attributes are documented under message. Must contain between 1 and 15 messages.
     * 
     */
    public List<IntentSlotValueElicitationPromptMessage> messages() {
        return this.messages;
    }
    /**
     * @return The response card. Amazon Lex will substitute session attributes and
     * slot values into the response card. For more information, see
     * [Example: Using a Response Card](https://docs.aws.amazon.com/lex/latest/dg/ex-resp-card.html). Must be less than or equal to 50000 characters in length.
     * 
     */
    public Optional<String> responseCard() {
        return Optional.ofNullable(this.responseCard);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntentSlotValueElicitationPrompt defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer maxAttempts;
        private List<IntentSlotValueElicitationPromptMessage> messages;
        private @Nullable String responseCard;

        public Builder() {
    	      // Empty
        }

        public Builder(IntentSlotValueElicitationPrompt defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxAttempts = defaults.maxAttempts;
    	      this.messages = defaults.messages;
    	      this.responseCard = defaults.responseCard;
        }

        public Builder maxAttempts(Integer maxAttempts) {
            this.maxAttempts = Objects.requireNonNull(maxAttempts);
            return this;
        }
        public Builder messages(List<IntentSlotValueElicitationPromptMessage> messages) {
            this.messages = Objects.requireNonNull(messages);
            return this;
        }
        public Builder messages(IntentSlotValueElicitationPromptMessage... messages) {
            return messages(List.of(messages));
        }
        public Builder responseCard(@Nullable String responseCard) {
            this.responseCard = responseCard;
            return this;
        }        public IntentSlotValueElicitationPrompt build() {
            return new IntentSlotValueElicitationPrompt(maxAttempts, messages, responseCard);
        }
    }
}