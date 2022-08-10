// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Connect.Inputs
{

    public sealed class UserHierarchyStructureHierarchyStructureGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// A block that defines the details of level five. The level block is documented below.
        /// </summary>
        [Input("levelFive")]
        public Input<Inputs.UserHierarchyStructureHierarchyStructureLevelFiveGetArgs>? LevelFive { get; set; }

        /// <summary>
        /// A block that defines the details of level four. The level block is documented below.
        /// </summary>
        [Input("levelFour")]
        public Input<Inputs.UserHierarchyStructureHierarchyStructureLevelFourGetArgs>? LevelFour { get; set; }

        /// <summary>
        /// A block that defines the details of level one. The level block is documented below.
        /// </summary>
        [Input("levelOne")]
        public Input<Inputs.UserHierarchyStructureHierarchyStructureLevelOneGetArgs>? LevelOne { get; set; }

        /// <summary>
        /// A block that defines the details of level three. The level block is documented below.
        /// </summary>
        [Input("levelThree")]
        public Input<Inputs.UserHierarchyStructureHierarchyStructureLevelThreeGetArgs>? LevelThree { get; set; }

        /// <summary>
        /// A block that defines the details of level two. The level block is documented below.
        /// </summary>
        [Input("levelTwo")]
        public Input<Inputs.UserHierarchyStructureHierarchyStructureLevelTwoGetArgs>? LevelTwo { get; set; }

        public UserHierarchyStructureHierarchyStructureGetArgs()
        {
        }
    }
}