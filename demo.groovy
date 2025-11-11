pipeline {
    agent any
    stages {
        stage('pull'){
            steps {
                git branch: 'main', url: 'https://github.com/Gaurav9540/mvn-project.git'
                echo "pulling successfully!"
            }
        }

        stage('Build'){
            steps {
                sh 'mvn clean package'
                echo "building successfully!"
            }
        }

        stage('Test'){
            steps {
                echo "testing successfully!"
            }
        }

        stage('Deploy on Docker'){
            steps {
                echo "deploy successfully!"
            }
        }
    }
}