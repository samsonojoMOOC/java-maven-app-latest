#!/user/bin/env groovy
library identifier: 'jenkins-shared-library-latest@main', retriever: modernSCM(
[$class: 'GitSCMSource',
remote: 'https://github.com/samsonojoMOOC/jenkins-shared-library-latest.git',
credentialsId: 'github-credentials'])
//@Library('jenkins-shared-library-latest') - when sharing it globally
def gv

pipeline {   
    agent any
    tools {
        maven 'maven-3.9'
    }

    stages {

            stage("init") {
                steps {
                    script {
                        gv = load "script.groovy"

                    }
                }
            }

            stage("build jar") {
                    steps {
                      script {
                     buildJar()

                     }
                 }
            }

        stage("build and push image") {
            steps {
                script {
                    buildImage 'samsonojo/demo-app:jmal-3.2'
                    dockerLogin()
                    dockerPush 'samsonojo/demo-app:jmal-3.2'

                }
            }
}

        stage("deploy") {

            steps {
                script {
                    gv.deployApp()
      

                }
            
            }
        }
    }               
}
