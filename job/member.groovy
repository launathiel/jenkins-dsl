pipelineJob('microservices/member') {
    parameters{
        stringParam('APP_VERSION', '', 'Enter the member service version ( based on release tag on github )')
    }
    definition {
        cps {
            script(readFileFromWorkspace('pipeline/member/Jenkinsfile'))
            sandbox()
        }
    }
}