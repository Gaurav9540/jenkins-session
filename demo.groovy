pipeline {
    agent any
    stages {
        stage('pull'){
            steps {
                git branch: 'main', url: 'https://github.com/Gaurav9540/spotify-clone.git'
                echo "pulling successfully!"
            }
        }

        stage('Build'){
            steps {
                echo "building successfully!"
            }
        }

        stage('Test'){
            steps {
                echo "testing successfully!"
            }
        }

        stage('Deploy'){
            steps {
                echo "deploy successfully!"
            }
        }
    }
}