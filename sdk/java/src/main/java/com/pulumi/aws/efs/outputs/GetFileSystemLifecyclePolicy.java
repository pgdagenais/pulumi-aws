// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.efs.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetFileSystemLifecyclePolicy {
    private String transitionToIa;
    private String transitionToPrimaryStorageClass;

    private GetFileSystemLifecyclePolicy() {}
    public String transitionToIa() {
        return this.transitionToIa;
    }
    public String transitionToPrimaryStorageClass() {
        return this.transitionToPrimaryStorageClass;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFileSystemLifecyclePolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String transitionToIa;
        private String transitionToPrimaryStorageClass;
        public Builder() {}
        public Builder(GetFileSystemLifecyclePolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.transitionToIa = defaults.transitionToIa;
    	      this.transitionToPrimaryStorageClass = defaults.transitionToPrimaryStorageClass;
        }

        @CustomType.Setter
        public Builder transitionToIa(String transitionToIa) {
            if (transitionToIa == null) {
              throw new MissingRequiredPropertyException("GetFileSystemLifecyclePolicy", "transitionToIa");
            }
            this.transitionToIa = transitionToIa;
            return this;
        }
        @CustomType.Setter
        public Builder transitionToPrimaryStorageClass(String transitionToPrimaryStorageClass) {
            if (transitionToPrimaryStorageClass == null) {
              throw new MissingRequiredPropertyException("GetFileSystemLifecyclePolicy", "transitionToPrimaryStorageClass");
            }
            this.transitionToPrimaryStorageClass = transitionToPrimaryStorageClass;
            return this;
        }
        public GetFileSystemLifecyclePolicy build() {
            final var _resultValue = new GetFileSystemLifecyclePolicy();
            _resultValue.transitionToIa = transitionToIa;
            _resultValue.transitionToPrimaryStorageClass = transitionToPrimaryStorageClass;
            return _resultValue;
        }
    }
}
