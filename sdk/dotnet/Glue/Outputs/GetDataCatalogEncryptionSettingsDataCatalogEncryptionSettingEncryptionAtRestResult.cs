// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Glue.Outputs
{

    [OutputType]
    public sealed class GetDataCatalogEncryptionSettingsDataCatalogEncryptionSettingEncryptionAtRestResult
    {
        /// <summary>
        /// The encryption-at-rest mode for encrypting Data Catalog data.
        /// </summary>
        public readonly string CatalogEncryptionMode;
        /// <summary>
        /// The ARN of the AWS KMS key to use for encryption at rest.
        /// </summary>
        public readonly string SseAwsKmsKeyId;

        [OutputConstructor]
        private GetDataCatalogEncryptionSettingsDataCatalogEncryptionSettingEncryptionAtRestResult(
            string catalogEncryptionMode,

            string sseAwsKmsKeyId)
        {
            CatalogEncryptionMode = catalogEncryptionMode;
            SseAwsKmsKeyId = sseAwsKmsKeyId;
        }
    }
}