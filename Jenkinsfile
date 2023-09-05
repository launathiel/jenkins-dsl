pipeline {
    agent {
        label 'master'
    }
    stages {
        stage('seed or update all pipelines') {
            steps {
                jobDsl targets: [
                    'job/folder.groovy',
                    'job/*/*.groovy'
                ].join('\n')
            }
        }
    }
    post { 
        always { 
            deleteDir()
            dir("${workspace}@tmp") {
                deleteDir()
            }
            dir("${workspace}@script") {
                deleteDir()
            }
        }
    }
}