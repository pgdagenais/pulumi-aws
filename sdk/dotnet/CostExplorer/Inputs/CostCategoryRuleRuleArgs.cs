// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.CostExplorer.Inputs
{

    public sealed class CostCategoryRuleRuleArgs : Pulumi.ResourceArgs
    {
        [Input("ands")]
        private InputList<Inputs.CostCategoryRuleRuleAndArgs>? _ands;

        /// <summary>
        /// Return results that match both `Dimension` objects.
        /// </summary>
        public InputList<Inputs.CostCategoryRuleRuleAndArgs> Ands
        {
            get => _ands ?? (_ands = new InputList<Inputs.CostCategoryRuleRuleAndArgs>());
            set => _ands = value;
        }

        /// <summary>
        /// Configuration block for the filter that's based on `CostCategory` values. See below.
        /// </summary>
        [Input("costCategory")]
        public Input<Inputs.CostCategoryRuleRuleCostCategoryArgs>? CostCategory { get; set; }

        /// <summary>
        /// Configuration block for the specific `Dimension` to use for `Expression`. See below.
        /// </summary>
        [Input("dimension")]
        public Input<Inputs.CostCategoryRuleRuleDimensionArgs>? Dimension { get; set; }

        /// <summary>
        /// Return results that match both `Dimension` object.
        /// </summary>
        [Input("not")]
        public Input<Inputs.CostCategoryRuleRuleNotArgs>? Not { get; set; }

        [Input("ors")]
        private InputList<Inputs.CostCategoryRuleRuleOrArgs>? _ors;

        /// <summary>
        /// Return results that match both `Dimension` object.
        /// </summary>
        public InputList<Inputs.CostCategoryRuleRuleOrArgs> Ors
        {
            get => _ors ?? (_ors = new InputList<Inputs.CostCategoryRuleRuleOrArgs>());
            set => _ors = value;
        }

        /// <summary>
        /// Key-value mapping of resource tags. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Input("tags")]
        public Input<Inputs.CostCategoryRuleRuleTagsArgs>? Tags { get; set; }

        public CostCategoryRuleRuleArgs()
        {
        }
    }
}