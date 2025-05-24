
pipeline {   
    agent any

    stages {

        stage("test") {
            steps {
                script {
                    echo "We are testing the Samson now webhook..."
                    echo "Branch currently building $BRANCH_NAME"

                }
            }
        }

        stage("build") {
            when {
                expression {
                    BRANCH_NAME == 'main'
                }
            }
            steps {
                script {

                    echo "Buiding the application...."
    
                }
            }
        }

        stage("deploy") {
                        when {
                expression {
                    BRANCH_NAME == 'main'
                }
            }     
            steps {
                script {
                    echo "Deploying the application...."
      

                }
            
            }
        }
    }               
}
