// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../../types/input";
import * as outputs from "../../types/output";
import * as enums from "../../types/enums";
import * as utilities from "../../utilities";

import {RoutingRule} from "@/s3";

export interface ScalingPlanApplicationSource {
    /**
     * ARN of a AWS CloudFormation stack.
     */
    cloudformationStackArn?: string;
    /**
     * Set of tags.
     */
    tagFilters?: outputs.autoscalingplans.ScalingPlanApplicationSourceTagFilter[];
}

export interface ScalingPlanApplicationSourceTagFilter {
    /**
     * Tag key.
     */
    key: string;
    /**
     * Tag values.
     */
    values?: string[];
}

export interface ScalingPlanScalingInstruction {
    /**
     * Customized load metric to use for predictive scaling. You must specify either `customizedLoadMetricSpecification` or `predefinedLoadMetricSpecification` when configuring predictive scaling.
     * More details can be found in the [AWS Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/plans/APIReference/API_CustomizedLoadMetricSpecification.html).
     */
    customizedLoadMetricSpecification?: outputs.autoscalingplans.ScalingPlanScalingInstructionCustomizedLoadMetricSpecification;
    /**
     * Boolean controlling whether dynamic scaling by AWS Auto Scaling is disabled. Defaults to `false`.
     */
    disableDynamicScaling?: boolean;
    /**
     * Maximum capacity of the resource. The exception to this upper limit is if you specify a non-default setting for `predictiveScalingMaxCapacityBehavior`.
     */
    maxCapacity: number;
    /**
     * Minimum capacity of the resource.
     */
    minCapacity: number;
    /**
     * Predefined load metric to use for predictive scaling. You must specify either `predefinedLoadMetricSpecification` or `customizedLoadMetricSpecification` when configuring predictive scaling.
     * More details can be found in the [AWS Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/plans/APIReference/API_PredefinedLoadMetricSpecification.html).
     */
    predefinedLoadMetricSpecification?: outputs.autoscalingplans.ScalingPlanScalingInstructionPredefinedLoadMetricSpecification;
    /**
     * Defines the behavior that should be applied if the forecast capacity approaches or exceeds the maximum capacity specified for the resource.
     * Valid values: `SetForecastCapacityToMaxCapacity`, `SetMaxCapacityAboveForecastCapacity`, `SetMaxCapacityToForecastCapacity`.
     */
    predictiveScalingMaxCapacityBehavior?: string;
    /**
     * Size of the capacity buffer to use when the forecast capacity is close to or exceeds the maximum capacity.
     */
    predictiveScalingMaxCapacityBuffer?: number;
    /**
     * Predictive scaling mode. Valid values: `ForecastAndScale`, `ForecastOnly`.
     */
    predictiveScalingMode?: string;
    /**
     * ID of the resource. This string consists of the resource type and unique identifier.
     */
    resourceId: string;
    /**
     * Scalable dimension associated with the resource. Valid values: `autoscaling:autoScalingGroup:DesiredCapacity`, `dynamodb:index:ReadCapacityUnits`, `dynamodb:index:WriteCapacityUnits`, `dynamodb:table:ReadCapacityUnits`, `dynamodb:table:WriteCapacityUnits`, `ecs:service:DesiredCount`, `ec2:spot-fleet-request:TargetCapacity`, `rds:cluster:ReadReplicaCount`.
     */
    scalableDimension: string;
    /**
     * Controls whether a resource's externally created scaling policies are kept or replaced. Valid values: `KeepExternalPolicies`, `ReplaceExternalPolicies`. Defaults to `KeepExternalPolicies`.
     */
    scalingPolicyUpdateBehavior?: string;
    /**
     * Amount of time, in seconds, to buffer the run time of scheduled scaling actions when scaling out.
     */
    scheduledActionBufferTime?: number;
    /**
     * Namespace of the AWS service. Valid values: `autoscaling`, `dynamodb`, `ecs`, `ec2`, `rds`.
     */
    serviceNamespace: string;
    /**
     * Structure that defines new target tracking configurations. Each of these structures includes a specific scaling metric and a target value for the metric, along with various parameters to use with dynamic scaling.
     * More details can be found in the [AWS Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/plans/APIReference/API_TargetTrackingConfiguration.html).
     */
    targetTrackingConfigurations: outputs.autoscalingplans.ScalingPlanScalingInstructionTargetTrackingConfiguration[];
}

export interface ScalingPlanScalingInstructionCustomizedLoadMetricSpecification {
    /**
     * Dimensions of the metric.
     */
    dimensions?: {[key: string]: string};
    /**
     * Name of the metric.
     */
    metricName: string;
    /**
     * Namespace of the metric.
     */
    namespace: string;
    /**
     * Statistic of the metric. Currently, the value must always be `Sum`.
     */
    statistic: string;
    /**
     * Unit of the metric.
     */
    unit?: string;
}

export interface ScalingPlanScalingInstructionPredefinedLoadMetricSpecification {
    /**
     * Metric type. Valid values: `ALBTargetGroupRequestCount`, `ASGTotalCPUUtilization`, `ASGTotalNetworkIn`, `ASGTotalNetworkOut`.
     */
    predefinedLoadMetricType: string;
    /**
     * Identifies the resource associated with the metric type.
     */
    resourceLabel?: string;
}

export interface ScalingPlanScalingInstructionTargetTrackingConfiguration {
    /**
     * Customized metric. You can specify either `customizedScalingMetricSpecification` or `predefinedScalingMetricSpecification`.
     * More details can be found in the [AWS Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/plans/APIReference/API_CustomizedScalingMetricSpecification.html).
     */
    customizedScalingMetricSpecification?: outputs.autoscalingplans.ScalingPlanScalingInstructionTargetTrackingConfigurationCustomizedScalingMetricSpecification;
    /**
     * Boolean indicating whether scale in by the target tracking scaling policy is disabled. Defaults to `false`.
     */
    disableScaleIn?: boolean;
    /**
     * Estimated time, in seconds, until a newly launched instance can contribute to the CloudWatch metrics.
     * This value is used only if the resource is an Auto Scaling group.
     */
    estimatedInstanceWarmup?: number;
    /**
     * Predefined metric. You can specify either `predefinedScalingMetricSpecification` or `customizedScalingMetricSpecification`.
     * More details can be found in the [AWS Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/plans/APIReference/API_PredefinedScalingMetricSpecification.html).
     */
    predefinedScalingMetricSpecification?: outputs.autoscalingplans.ScalingPlanScalingInstructionTargetTrackingConfigurationPredefinedScalingMetricSpecification;
    /**
     * Amount of time, in seconds, after a scale in activity completes before another scale in activity can start.
     * This value is not used if the scalable resource is an Auto Scaling group.
     */
    scaleInCooldown?: number;
    /**
     * Amount of time, in seconds, after a scale-out activity completes before another scale-out activity can start.
     * This value is not used if the scalable resource is an Auto Scaling group.
     */
    scaleOutCooldown?: number;
    /**
     * Target value for the metric.
     */
    targetValue: number;
}

export interface ScalingPlanScalingInstructionTargetTrackingConfigurationCustomizedScalingMetricSpecification {
    /**
     * Dimensions of the metric.
     */
    dimensions?: {[key: string]: string};
    /**
     * Name of the metric.
     */
    metricName: string;
    /**
     * Namespace of the metric.
     */
    namespace: string;
    /**
     * Statistic of the metric. Valid values: `Average`, `Maximum`, `Minimum`, `SampleCount`, `Sum`.
     */
    statistic: string;
    /**
     * Unit of the metric.
     */
    unit?: string;
}

export interface ScalingPlanScalingInstructionTargetTrackingConfigurationPredefinedScalingMetricSpecification {
    /**
     * Metric type. Valid values: `ALBRequestCountPerTarget`, `ASGAverageCPUUtilization`, `ASGAverageNetworkIn`, `ASGAverageNetworkOut`, `DynamoDBReadCapacityUtilization`, `DynamoDBWriteCapacityUtilization`, `ECSServiceAverageCPUUtilization`, `ECSServiceAverageMemoryUtilization`, `EC2SpotFleetRequestAverageCPUUtilization`, `EC2SpotFleetRequestAverageNetworkIn`, `EC2SpotFleetRequestAverageNetworkOut`, `RDSReaderAverageCPUUtilization`, `RDSReaderAverageDatabaseConnections`.
     */
    predefinedScalingMetricType: string;
    /**
     * Identifies the resource associated with the metric type.
     */
    resourceLabel?: string;
}
