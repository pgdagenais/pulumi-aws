// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkmanager.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetCoreNetworkPolicyDocumentSegment {
    /**
     * @return List of strings of segment names that explicitly allows only routes from the segments that are listed in the array. Use the `allow_filter` setting if a segment has a well-defined group of other segments that connectivity should be restricted to. It is applied after routes have been shared in `segment_actions`. If a segment is listed in `allow_filter`, attachments between the two segments will have routes if they are also shared in the segment-actions area. For example, you might have a segment named &#34;video-producer&#34; that should only ever share routes with a &#34;video-distributor&#34; segment, no matter how many other share statements are created.
     * 
     */
    private final @Nullable List<String> allowFilters;
    /**
     * @return An array of segments that disallows routes from the segments listed in the array. It is applied only after routes have been shared in `segment_actions`. If a segment is listed in the `deny_filter`, attachments between the two segments will never have routes shared across them. For example, you might have a &#34;financial&#34; payment segment that should never share routes with a &#34;development&#34; segment, regardless of how many other share statements are created. Adding the payments segment to the deny-filter parameter prevents any shared routes from being created with other segments.
     * 
     */
    private final @Nullable List<String> denyFilters;
    /**
     * @return A user-defined string describing the segment action.
     * 
     */
    private final @Nullable String description;
    /**
     * @return A list of strings of AWS Region names. Allows you to define a more restrictive set of Regions for a segment. The edge location must be a subset of the locations that are defined for `edge_locations` in the `core_network_configuration`.
     * 
     */
    private final @Nullable List<String> edgeLocations;
    /**
     * @return This Boolean setting determines whether attachments on the same segment can communicate with each other. If set to `true`, the only routes available will be either shared routes through the share actions, which are attachments in other segments, or static routes. The default value is `false`. For example, you might have a segment dedicated to &#34;development&#34; that should never allow VPCs to talk to each other, even if they’re on the same segment. In this example, you would keep the default parameter of `false`.
     * 
     */
    private final @Nullable Boolean isolateAttachments;
    /**
     * @return A unique name for a segment. The name is a string used in other parts of the policy document, as well as in the console for metrics and other reference points. Valid characters are a–z, and 0–9.
     * 
     */
    private final String name;
    /**
     * @return This Boolean setting determines whether attachment requests are automatically approved or require acceptance. The default is `true`, indicating that attachment requests require acceptance. For example, you might use this setting to allow a &#34;sandbox&#34; segment to allow any attachment request so that a core network or attachment administrator does not need to review and approve attachment requests. In this example, `require_attachment_acceptance` is set to `false`.
     * 
     */
    private final @Nullable Boolean requireAttachmentAcceptance;

    @CustomType.Constructor
    private GetCoreNetworkPolicyDocumentSegment(
        @CustomType.Parameter("allowFilters") @Nullable List<String> allowFilters,
        @CustomType.Parameter("denyFilters") @Nullable List<String> denyFilters,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("edgeLocations") @Nullable List<String> edgeLocations,
        @CustomType.Parameter("isolateAttachments") @Nullable Boolean isolateAttachments,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("requireAttachmentAcceptance") @Nullable Boolean requireAttachmentAcceptance) {
        this.allowFilters = allowFilters;
        this.denyFilters = denyFilters;
        this.description = description;
        this.edgeLocations = edgeLocations;
        this.isolateAttachments = isolateAttachments;
        this.name = name;
        this.requireAttachmentAcceptance = requireAttachmentAcceptance;
    }

    /**
     * @return List of strings of segment names that explicitly allows only routes from the segments that are listed in the array. Use the `allow_filter` setting if a segment has a well-defined group of other segments that connectivity should be restricted to. It is applied after routes have been shared in `segment_actions`. If a segment is listed in `allow_filter`, attachments between the two segments will have routes if they are also shared in the segment-actions area. For example, you might have a segment named &#34;video-producer&#34; that should only ever share routes with a &#34;video-distributor&#34; segment, no matter how many other share statements are created.
     * 
     */
    public List<String> allowFilters() {
        return this.allowFilters == null ? List.of() : this.allowFilters;
    }
    /**
     * @return An array of segments that disallows routes from the segments listed in the array. It is applied only after routes have been shared in `segment_actions`. If a segment is listed in the `deny_filter`, attachments between the two segments will never have routes shared across them. For example, you might have a &#34;financial&#34; payment segment that should never share routes with a &#34;development&#34; segment, regardless of how many other share statements are created. Adding the payments segment to the deny-filter parameter prevents any shared routes from being created with other segments.
     * 
     */
    public List<String> denyFilters() {
        return this.denyFilters == null ? List.of() : this.denyFilters;
    }
    /**
     * @return A user-defined string describing the segment action.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return A list of strings of AWS Region names. Allows you to define a more restrictive set of Regions for a segment. The edge location must be a subset of the locations that are defined for `edge_locations` in the `core_network_configuration`.
     * 
     */
    public List<String> edgeLocations() {
        return this.edgeLocations == null ? List.of() : this.edgeLocations;
    }
    /**
     * @return This Boolean setting determines whether attachments on the same segment can communicate with each other. If set to `true`, the only routes available will be either shared routes through the share actions, which are attachments in other segments, or static routes. The default value is `false`. For example, you might have a segment dedicated to &#34;development&#34; that should never allow VPCs to talk to each other, even if they’re on the same segment. In this example, you would keep the default parameter of `false`.
     * 
     */
    public Optional<Boolean> isolateAttachments() {
        return Optional.ofNullable(this.isolateAttachments);
    }
    /**
     * @return A unique name for a segment. The name is a string used in other parts of the policy document, as well as in the console for metrics and other reference points. Valid characters are a–z, and 0–9.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return This Boolean setting determines whether attachment requests are automatically approved or require acceptance. The default is `true`, indicating that attachment requests require acceptance. For example, you might use this setting to allow a &#34;sandbox&#34; segment to allow any attachment request so that a core network or attachment administrator does not need to review and approve attachment requests. In this example, `require_attachment_acceptance` is set to `false`.
     * 
     */
    public Optional<Boolean> requireAttachmentAcceptance() {
        return Optional.ofNullable(this.requireAttachmentAcceptance);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCoreNetworkPolicyDocumentSegment defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> allowFilters;
        private @Nullable List<String> denyFilters;
        private @Nullable String description;
        private @Nullable List<String> edgeLocations;
        private @Nullable Boolean isolateAttachments;
        private String name;
        private @Nullable Boolean requireAttachmentAcceptance;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCoreNetworkPolicyDocumentSegment defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowFilters = defaults.allowFilters;
    	      this.denyFilters = defaults.denyFilters;
    	      this.description = defaults.description;
    	      this.edgeLocations = defaults.edgeLocations;
    	      this.isolateAttachments = defaults.isolateAttachments;
    	      this.name = defaults.name;
    	      this.requireAttachmentAcceptance = defaults.requireAttachmentAcceptance;
        }

        public Builder allowFilters(@Nullable List<String> allowFilters) {
            this.allowFilters = allowFilters;
            return this;
        }
        public Builder allowFilters(String... allowFilters) {
            return allowFilters(List.of(allowFilters));
        }
        public Builder denyFilters(@Nullable List<String> denyFilters) {
            this.denyFilters = denyFilters;
            return this;
        }
        public Builder denyFilters(String... denyFilters) {
            return denyFilters(List.of(denyFilters));
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder edgeLocations(@Nullable List<String> edgeLocations) {
            this.edgeLocations = edgeLocations;
            return this;
        }
        public Builder edgeLocations(String... edgeLocations) {
            return edgeLocations(List.of(edgeLocations));
        }
        public Builder isolateAttachments(@Nullable Boolean isolateAttachments) {
            this.isolateAttachments = isolateAttachments;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder requireAttachmentAcceptance(@Nullable Boolean requireAttachmentAcceptance) {
            this.requireAttachmentAcceptance = requireAttachmentAcceptance;
            return this;
        }        public GetCoreNetworkPolicyDocumentSegment build() {
            return new GetCoreNetworkPolicyDocumentSegment(allowFilters, denyFilters, description, edgeLocations, isolateAttachments, name, requireAttachmentAcceptance);
        }
    }
}