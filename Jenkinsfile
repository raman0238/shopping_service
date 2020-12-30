pipeline {
    agent any
    
    stages {
        stage('Gradle') {
            steps {
                echo 'pipe line success'
                 sh 'gradle project/build.gradle classes'
            }
        }
    }
}
