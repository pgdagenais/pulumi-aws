// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Sagemaker.Inputs
{

    public sealed class UserProfileUserSettingsJupyterLabAppSettingsGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("codeRepositories")]
        private InputList<Inputs.UserProfileUserSettingsJupyterLabAppSettingsCodeRepositoryGetArgs>? _codeRepositories;

        /// <summary>
        /// A list of Git repositories that SageMaker automatically displays to users for cloning in the JupyterServer application. see Code Repository below.
        /// </summary>
        public InputList<Inputs.UserProfileUserSettingsJupyterLabAppSettingsCodeRepositoryGetArgs> CodeRepositories
        {
            get => _codeRepositories ?? (_codeRepositories = new InputList<Inputs.UserProfileUserSettingsJupyterLabAppSettingsCodeRepositoryGetArgs>());
            set => _codeRepositories = value;
        }

        [Input("customImages")]
        private InputList<Inputs.UserProfileUserSettingsJupyterLabAppSettingsCustomImageGetArgs>? _customImages;

        /// <summary>
        /// A list of custom SageMaker images that are configured to run as a KernelGateway app. see Custom Image below.
        /// </summary>
        public InputList<Inputs.UserProfileUserSettingsJupyterLabAppSettingsCustomImageGetArgs> CustomImages
        {
            get => _customImages ?? (_customImages = new InputList<Inputs.UserProfileUserSettingsJupyterLabAppSettingsCustomImageGetArgs>());
            set => _customImages = value;
        }

        /// <summary>
        /// The default instance type and the Amazon Resource Name (ARN) of the SageMaker image created on the instance. see Default Resource Spec below.
        /// </summary>
        [Input("defaultResourceSpec")]
        public Input<Inputs.UserProfileUserSettingsJupyterLabAppSettingsDefaultResourceSpecGetArgs>? DefaultResourceSpec { get; set; }

        [Input("lifecycleConfigArns")]
        private InputList<string>? _lifecycleConfigArns;

        /// <summary>
        /// The Amazon Resource Name (ARN) of the Lifecycle Configurations.
        /// </summary>
        public InputList<string> LifecycleConfigArns
        {
            get => _lifecycleConfigArns ?? (_lifecycleConfigArns = new InputList<string>());
            set => _lifecycleConfigArns = value;
        }

        public UserProfileUserSettingsJupyterLabAppSettingsGetArgs()
        {
        }
        public static new UserProfileUserSettingsJupyterLabAppSettingsGetArgs Empty => new UserProfileUserSettingsJupyterLabAppSettingsGetArgs();
    }
}
