// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../../types/input";
import * as outputs from "../../types/output";
import * as enums from "../../types/enums";
import * as utilities from "../../utilities";

import {RoutingRule} from "@/s3";

export interface VoiceConnectorGroupConnector {
    /**
     * The priority associated with the Amazon Chime Voice Connector, with 1 being the highest priority. Higher priority Amazon Chime Voice Connectors are attempted first.
     */
    priority: number;
    /**
     * The Amazon Chime Voice Connector ID.
     */
    voiceConnectorId: string;
}

export interface VoiceConnectorOrganizationRoute {
    /**
     * The FQDN or IP address to contact for origination traffic.
     */
    host: string;
    /**
     * The designated origination route port. Defaults to `5060`.
     */
    port?: number;
    /**
     * The priority associated with the host, with 1 being the highest priority. Higher priority hosts are attempted first.
     */
    priority: number;
    /**
     * The protocol to use for the origination route. Encryption-enabled Amazon Chime Voice Connectors use TCP protocol by default.
     */
    protocol: string;
    /**
     * The weight associated with the host. If hosts are equal in priority, calls are redistributed among them based on their relative weight.
     */
    weight: number;
}

export interface VoiceConnectorTerminationCredentialsCredential {
    /**
     * RFC2617 compliant password associated with the SIP credentials.
     */
    password: string;
    /**
     * RFC2617 compliant username associated with the SIP credentials.
     */
    username: string;
}
