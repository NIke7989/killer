pipeline{
	
	agent any
	
	stages {
        // Checkout stage
        stage('Checkout') {
            steps {
                // Checkout code from your version control system (e.g., Git)
                git url: 'https://github.com/NIke7989/killer.git', branch: 'main'
            }
        }
        
        // Build stage
        stage('Build') {
            steps {
                // For example, build a Maven project
                sh 'mvn clean package'
            }
        }
        }
        }
        
