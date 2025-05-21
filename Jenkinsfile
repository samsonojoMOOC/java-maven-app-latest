#!/user/bin/env groovy

@Library('jenkins-shared-library-latest')
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
