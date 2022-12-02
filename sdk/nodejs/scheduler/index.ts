// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { ScheduleArgs, ScheduleState } from "./schedule";
export type Schedule = import("./schedule").Schedule;
export const Schedule: typeof import("./schedule").Schedule = null as any;
utilities.lazyLoad(exports, ["Schedule"], () => require("./schedule"));

export { ScheduleGroupArgs, ScheduleGroupState } from "./scheduleGroup";
export type ScheduleGroup = import("./scheduleGroup").ScheduleGroup;
export const ScheduleGroup: typeof import("./scheduleGroup").ScheduleGroup = null as any;
utilities.lazyLoad(exports, ["ScheduleGroup"], () => require("./scheduleGroup"));


const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "aws:scheduler/schedule:Schedule":
                return new Schedule(name, <any>undefined, { urn })
            case "aws:scheduler/scheduleGroup:ScheduleGroup":
                return new ScheduleGroup(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("aws", "scheduler/schedule", _module)
pulumi.runtime.registerResourceModule("aws", "scheduler/scheduleGroup", _module)