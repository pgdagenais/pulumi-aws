// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.WafV2.Inputs
{

    public sealed class RuleGroupRuleStatementOrStatementStatementOrStatementStatementRegexMatchStatementArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
        /// </summary>
        [Input("fieldToMatch")]
        public Input<Inputs.RuleGroupRuleStatementOrStatementStatementOrStatementStatementRegexMatchStatementFieldToMatchArgs>? FieldToMatch { get; set; }

        /// <summary>
        /// The string representing the regular expression. Minimum of `1` and maximum of `512` characters.
        /// </summary>
        [Input("regexString", required: true)]
        public Input<string> RegexString { get; set; } = null!;

        [Input("textTransformations", required: true)]
        private InputList<Inputs.RuleGroupRuleStatementOrStatementStatementOrStatementStatementRegexMatchStatementTextTransformationArgs>? _textTransformations;

        /// <summary>
        /// Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection.
        /// At least one required.
        /// See Text Transformation below for details.
        /// </summary>
        public InputList<Inputs.RuleGroupRuleStatementOrStatementStatementOrStatementStatementRegexMatchStatementTextTransformationArgs> TextTransformations
        {
            get => _textTransformations ?? (_textTransformations = new InputList<Inputs.RuleGroupRuleStatementOrStatementStatementOrStatementStatementRegexMatchStatementTextTransformationArgs>());
            set => _textTransformations = value;
        }

        public RuleGroupRuleStatementOrStatementStatementOrStatementStatementRegexMatchStatementArgs()
        {
        }
        public static new RuleGroupRuleStatementOrStatementStatementOrStatementStatementRegexMatchStatementArgs Empty => new RuleGroupRuleStatementOrStatementStatementOrStatementStatementRegexMatchStatementArgs();
    }
}