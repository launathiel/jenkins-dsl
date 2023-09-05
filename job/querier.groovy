pipelineJob('microservices/querier') {
    parameters{
        stringParam('APP_VERSION', '', 'Enter the querier service version ( based on release tag on github )')
    }
    definition {
        cps {
            script(readFileFromWorkspace('pipeline/querier/Jenkinsfile'))
            sandbox()
        }
    }
}