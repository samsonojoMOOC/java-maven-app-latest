pipeline {   
    agent any

    parameters {
        choice(name: 'VERSION', choices: ['1.1.0', '1.2.0', '1.3.0'], description: '')
        booleanParam(name: 'executeTests', defaultValue: true, description: '')
    }
    stages {

        stage("build") {
            steps {
                echo "building the jar file for: ${NEW_VERSION}"
            }
        }

        stage("test") {
            when {
                expression {
                    params.executeTests
                }
            }
            steps {
            echo "building the image"
            }
        }

        stage("deploy") {
            steps {

                echo "deploying the script"
                echo "displaying version: ${params.VERSION}"

            }
        }               
    }

} 
