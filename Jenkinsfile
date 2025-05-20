def gv

pipeline {   
    agent any

    stages {
        
        stage("init") {
            steps {
                script {
                    gv = load "script.groovy"

                }
                
            }
        }

        stage("build") {
            steps {
                script {
                    gv.buildApp()
                }
            }
        }

        stage("test") {
     
            steps {
                script {
                    gv.testApp()
                }
            
            }
        }

        stage("deploy") {
            input {
                message: "Select the environment to deploy"
                ok: "Done"
                parameters {
                    choice(name: "ENV", choices: ["Dev", "Staging", "Prod"], description: ""])
            }
            steps {

                script {
                    gv.deployApp()
                    echo "deploying to ${ENV}"
                }
            }

            }
        }               
    }

} 
