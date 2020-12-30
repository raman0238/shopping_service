pipeline {
     agent any
    stages {
        stage('compile') {
            steps {
               gradlew('clean', 'classes')
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
