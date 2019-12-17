for (plugin in [
    "trilead-api",
    "cloudbees-folder",
    "jdk-tool",
    "script-security",
    "command-launcher",
    "antisamy-markup-formatter",
    "structs",
    "workflow-step-api",
    "token-macro",
    "bouncycastle-api",
    "build-timeout",
    "credentials",
    "plain-credentials",
    "ssh-credentials",
    "credentials-binding",
    "scm-api",
    "workflow-api",
    "timestamper",
    "workflow-support",
    "durable-task",
    "workflow-durable-task-step",
    "junit",
    "matrix-project",
    "resource-disposer",
    "ws-cleanup",
    "ant",
    "ace-editor",
    "jquery-detached",
    "workflow-scm-step",
    "workflow-cps",
    "workflow-job",
    "apache-httpcomponents-client-4-api",
    "display-url-api",
    "mailer",
    "workflow-basic-steps",
    "gradle",
    "pipeline-milestone-step",
    "jackson2-api",
    "pipeline-input-step",
    "pipeline-stage-step",
    "pipeline-graph-analysis",
    "pipeline-rest-api",
    "handlebars",
    "momentjs",
    "pipeline-stage-view",
    "pipeline-build-step",
    "pipeline-model-api",
    "pipeline-model-extensions",
    "jsch",
    "git-client",
    "git-server",
    "workflow-cps-global-lib",
    "branch-api",
    "workflow-multibranch",
    "authentication-tokens",
    "docker-commons",
    "docker-workflow",
    "pipeline-stage-tags-metadata",
    "pipeline-model-declarative-agent",
    "pipeline-model-definition",
    "lockable-resources",
    "workflow-aggregator",
    "github-api",
    "git",
    "github",
    "github-branch-source",
    "pipeline-github-lib",
    "mapdb-api",
    "subversion",
    "ssh-slaves",
    "matrix-auth",
    "pam-auth",
    "ldap",
    "email-ext",
    "configuration-as-code",
    ]) {
	e = Hudson.instance.updateCenter.getPlugin(plugin).deploy().get().getError()
	if (e != null)
		println e.message
}
