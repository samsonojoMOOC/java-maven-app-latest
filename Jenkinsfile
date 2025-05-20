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
                message "Select the environment to deploy"
                ok "Done"
                parameters {

                    choice(name: "ONE", choices: ["Dev", "Staging", "Prod"], description: "")
                    choice(name: "TWO", choices: ["Dev", "Staging", "Prod"], description: "")
            }
            }
            steps {

                script {
                    env.ENV = input message: "Select the environment to deploy", ok "Done", parameters: [choice(name: "ONE", choices: ["Dev", "Staging", "Prod"], description: "")]
                    gv.deployApp()
                    echo "deploying to ${ONE}"
                    echo "deploying to ${TWO}"
                }
            }

            }
        }               
    }
