
pipeline {   
    agent any

    stages {

        stage("test") {
            steps {
                script {
                    echo "We are testing..."
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
      
                }
            
            }
        }
    }               
}
