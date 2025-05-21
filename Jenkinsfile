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

        stage("build image") {
            steps {
                script {
                    buildImage 'samsonojo/demo-app:jmal-3.1'

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
