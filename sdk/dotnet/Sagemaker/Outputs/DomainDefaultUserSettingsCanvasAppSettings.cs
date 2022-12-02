// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Sagemaker.Outputs
{

    [OutputType]
    public sealed class DomainDefaultUserSettingsCanvasAppSettings
    {
        /// <summary>
        /// Time series forecast settings for the Canvas app. see Time Series Forecasting Settings below.
        /// </summary>
        public readonly Outputs.DomainDefaultUserSettingsCanvasAppSettingsTimeSeriesForecastingSettings? TimeSeriesForecastingSettings;

        [OutputConstructor]
        private DomainDefaultUserSettingsCanvasAppSettings(Outputs.DomainDefaultUserSettingsCanvasAppSettingsTimeSeriesForecastingSettings? timeSeriesForecastingSettings)
        {
            TimeSeriesForecastingSettings = timeSeriesForecastingSettings;
        }
    }
}