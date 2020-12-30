pipeline {
    agent any
    
    stages {
        stage('compile') {
            steps {
                sh "./gradlew clean build"
            }
        }
        
         stage('test') {
            steps {
                echo 'pipe line success'
            }
        }
         stage('sonar') {
            steps {
                echo 'pipe line success'
            }
        }
         
    }
}
