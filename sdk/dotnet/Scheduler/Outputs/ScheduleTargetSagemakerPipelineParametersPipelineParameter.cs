// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Scheduler.Outputs
{

    [OutputType]
    public sealed class ScheduleTargetSagemakerPipelineParametersPipelineParameter
    {
        /// <summary>
        /// Name of parameter to start execution of a SageMaker Model Building Pipeline.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Value of parameter to start execution of a SageMaker Model Building Pipeline.
        /// </summary>
        public readonly string Value;

        [OutputConstructor]
        private ScheduleTargetSagemakerPipelineParametersPipelineParameter(
            string name,

            string value)
        {
            Name = name;
            Value = value;
        }
    }
}