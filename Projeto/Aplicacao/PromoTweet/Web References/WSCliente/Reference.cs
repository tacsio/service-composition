﻿//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Runtime Version:4.0.30319.235
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// 
// This source code was auto-generated by Microsoft.VSDesigner, Version 4.0.30319.235.
// 
#pragma warning disable 1591

namespace PromoTweet.WSCliente {
    using System;
    using System.Web.Services;
    using System.Diagnostics;
    using System.Web.Services.Protocols;
    using System.ComponentModel;
    using System.Xml.Serialization;
    
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Web.Services", "4.0.30319.1")]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Web.Services.WebServiceBindingAttribute(Name="WSClienteSOAP11Binding", Namespace="http://main.localhost")]
    public partial class WSCliente : System.Web.Services.Protocols.SoapHttpClientProtocol {
        
        private System.Threading.SendOrPostCallback cadastarOperationCompleted;
        
        private System.Threading.SendOrPostCallback logarOperationCompleted;
        
        private bool useDefaultCredentialsSetExplicitly;
        
        /// <remarks/>
        public WSCliente() {
            this.Url = global::PromoTweet.Properties.Settings.Default.PromoTweet_WSCliente_WSCliente;
            if ((this.IsLocalFileSystemWebService(this.Url) == true)) {
                this.UseDefaultCredentials = true;
                this.useDefaultCredentialsSetExplicitly = false;
            }
            else {
                this.useDefaultCredentialsSetExplicitly = true;
            }
        }
        
        public new string Url {
            get {
                return base.Url;
            }
            set {
                if ((((this.IsLocalFileSystemWebService(base.Url) == true) 
                            && (this.useDefaultCredentialsSetExplicitly == false)) 
                            && (this.IsLocalFileSystemWebService(value) == false))) {
                    base.UseDefaultCredentials = false;
                }
                base.Url = value;
            }
        }
        
        public new bool UseDefaultCredentials {
            get {
                return base.UseDefaultCredentials;
            }
            set {
                base.UseDefaultCredentials = value;
                this.useDefaultCredentialsSetExplicitly = true;
            }
        }
        
        /// <remarks/>
        public event cadastarCompletedEventHandler cadastarCompleted;
        
        /// <remarks/>
        public event logarCompletedEventHandler logarCompleted;
        
        /// <remarks/>
        [System.Web.Services.Protocols.SoapDocumentMethodAttribute("http://main.localhost/cadastar", RequestNamespace="http://main.localhost", ResponseNamespace="http://main.localhost", Use=System.Web.Services.Description.SoapBindingUse.Literal, ParameterStyle=System.Web.Services.Protocols.SoapParameterStyle.Wrapped)]
        [return: System.Xml.Serialization.XmlElementAttribute("out")]
        public string cadastar(string nome, string login, string senha, string email, string cpf) {
            object[] results = this.Invoke("cadastar", new object[] {
                        nome,
                        login,
                        senha,
                        email,
                        cpf});
            return ((string)(results[0]));
        }
        
        /// <remarks/>
        public void cadastarAsync(string nome, string login, string senha, string email, string cpf) {
            this.cadastarAsync(nome, login, senha, email, cpf, null);
        }
        
        /// <remarks/>
        public void cadastarAsync(string nome, string login, string senha, string email, string cpf, object userState) {
            if ((this.cadastarOperationCompleted == null)) {
                this.cadastarOperationCompleted = new System.Threading.SendOrPostCallback(this.OncadastarOperationCompleted);
            }
            this.InvokeAsync("cadastar", new object[] {
                        nome,
                        login,
                        senha,
                        email,
                        cpf}, this.cadastarOperationCompleted, userState);
        }
        
        private void OncadastarOperationCompleted(object arg) {
            if ((this.cadastarCompleted != null)) {
                System.Web.Services.Protocols.InvokeCompletedEventArgs invokeArgs = ((System.Web.Services.Protocols.InvokeCompletedEventArgs)(arg));
                this.cadastarCompleted(this, new cadastarCompletedEventArgs(invokeArgs.Results, invokeArgs.Error, invokeArgs.Cancelled, invokeArgs.UserState));
            }
        }
        
        /// <remarks/>
        [System.Web.Services.Protocols.SoapDocumentMethodAttribute("http://main.localhost/process", Use=System.Web.Services.Description.SoapBindingUse.Literal, ParameterStyle=System.Web.Services.Protocols.SoapParameterStyle.Bare)]
        [return: System.Xml.Serialization.XmlElementAttribute("logarResponse", Namespace="http://main.localhost")]
        public logarResponse logar([System.Xml.Serialization.XmlElementAttribute("logar", Namespace="http://main.localhost")] logar logar1) {
            object[] results = this.Invoke("logar", new object[] {
                        logar1});
            return ((logarResponse)(results[0]));
        }
        
        /// <remarks/>
        public void logarAsync(logar logar1) {
            this.logarAsync(logar1, null);
        }
        
        /// <remarks/>
        public void logarAsync(logar logar1, object userState) {
            if ((this.logarOperationCompleted == null)) {
                this.logarOperationCompleted = new System.Threading.SendOrPostCallback(this.OnlogarOperationCompleted);
            }
            this.InvokeAsync("logar", new object[] {
                        logar1}, this.logarOperationCompleted, userState);
        }
        
        private void OnlogarOperationCompleted(object arg) {
            if ((this.logarCompleted != null)) {
                System.Web.Services.Protocols.InvokeCompletedEventArgs invokeArgs = ((System.Web.Services.Protocols.InvokeCompletedEventArgs)(arg));
                this.logarCompleted(this, new logarCompletedEventArgs(invokeArgs.Results, invokeArgs.Error, invokeArgs.Cancelled, invokeArgs.UserState));
            }
        }
        
        /// <remarks/>
        public new void CancelAsync(object userState) {
            base.CancelAsync(userState);
        }
        
        private bool IsLocalFileSystemWebService(string url) {
            if (((url == null) 
                        || (url == string.Empty))) {
                return false;
            }
            System.Uri wsUri = new System.Uri(url);
            if (((wsUri.Port >= 1024) 
                        && (string.Compare(wsUri.Host, "localHost", System.StringComparison.OrdinalIgnoreCase) == 0))) {
                return true;
            }
            return false;
        }
    }
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Xml", "4.0.30319.1")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.XmlTypeAttribute(AnonymousType=true, Namespace="http://main.localhost")]
    public partial class logar {
        
        private string loginField;
        
        private string senhaField;
        
        /// <remarks/>
        public string login {
            get {
                return this.loginField;
            }
            set {
                this.loginField = value;
            }
        }
        
        /// <remarks/>
        public string senha {
            get {
                return this.senhaField;
            }
            set {
                this.senhaField = value;
            }
        }
    }
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Xml", "4.0.30319.1")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.XmlTypeAttribute(AnonymousType=true, Namespace="http://main.localhost")]
    public partial class logarResponse {
        
        private string resultField;
        
        /// <remarks/>
        public string result {
            get {
                return this.resultField;
            }
            set {
                this.resultField = value;
            }
        }
    }
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Web.Services", "4.0.30319.1")]
    public delegate void cadastarCompletedEventHandler(object sender, cadastarCompletedEventArgs e);
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Web.Services", "4.0.30319.1")]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    public partial class cadastarCompletedEventArgs : System.ComponentModel.AsyncCompletedEventArgs {
        
        private object[] results;
        
        internal cadastarCompletedEventArgs(object[] results, System.Exception exception, bool cancelled, object userState) : 
                base(exception, cancelled, userState) {
            this.results = results;
        }
        
        /// <remarks/>
        public string Result {
            get {
                this.RaiseExceptionIfNecessary();
                return ((string)(this.results[0]));
            }
        }
    }
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Web.Services", "4.0.30319.1")]
    public delegate void logarCompletedEventHandler(object sender, logarCompletedEventArgs e);
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Web.Services", "4.0.30319.1")]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    public partial class logarCompletedEventArgs : System.ComponentModel.AsyncCompletedEventArgs {
        
        private object[] results;
        
        internal logarCompletedEventArgs(object[] results, System.Exception exception, bool cancelled, object userState) : 
                base(exception, cancelled, userState) {
            this.results = results;
        }
        
        /// <remarks/>
        public logarResponse Result {
            get {
                this.RaiseExceptionIfNecessary();
                return ((logarResponse)(this.results[0]));
            }
        }
    }
}

#pragma warning restore 1591