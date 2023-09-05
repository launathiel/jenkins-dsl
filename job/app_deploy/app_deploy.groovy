pipelineJob('app_deploy/test') {
    definition {
        cps {
            script(readFileFromWorkspace('pipeline/app_deploy/Jenkinsfile'))
            sandbox()
        }
    }
}