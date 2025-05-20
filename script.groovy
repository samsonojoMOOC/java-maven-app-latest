def buildJar(){
    echo "building the application..."
    sh 'mvn package'
}

def buildImage(){
    
    echo "building the docker image..."
    withCredentials([usernamePassword(credentialsId: 'docker-hub-credential', usernameVariable: 'USER', passwordVariable: 'PASS')]) {
        sh 'docker build -t samsonojo/demo-app:jmal-2.0 .'
        sh 'echo $PASS | docker login -u $USER --password-stdin'
        sh 'socker push samsonojo/demo-app:jmal-2.0'                    }
}

def deployApp(){
    echo "deploying the application..."
}
return this
