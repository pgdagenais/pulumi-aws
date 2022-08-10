// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Dlm.Outputs
{

    [OutputType]
    public sealed class LifecyclePolicyPolicyDetailsScheduleDeprecateRule
    {
        /// <summary>
        /// How many snapshots to keep. Must be an integer between `1` and `1000`.
        /// </summary>
        public readonly int? Count;
        /// <summary>
        /// The amount of time to retain each snapshot. The maximum is 100 years. This is equivalent to 1200 months, 5200 weeks, or 36500 days.
        /// </summary>
        public readonly int? Interval;
        /// <summary>
        /// The unit of time for time-based retention. Valid values: `DAYS`, `WEEKS`, `MONTHS`, or `YEARS`.
        /// </summary>
        public readonly string? IntervalUnit;

        [OutputConstructor]
        private LifecyclePolicyPolicyDetailsScheduleDeprecateRule(
            int? count,

            int? interval,

            string? intervalUnit)
        {
            Count = count;
            Interval = interval;
            IntervalUnit = intervalUnit;
        }
    }
}