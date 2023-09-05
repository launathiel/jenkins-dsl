pipelineJob('microservices/inventory') {
    parameters{
        stringParam('APP_VERSION', '', 'Enter the inventory service version ( based on release tag on github )')
    }
    definition {
        cps {
            script(readFileFromWorkspace('pipeline/inventory/Jenkinsfile'))
            sandbox()
        }
    }
}