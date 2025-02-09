pipeline{
	
	agent any
	
	stages {
        // Checkout stage
        stage('Checkout') {
            steps {
                // Checkout code from your version control system (e.g., Git)
                git url: 'https://github.com/your/repository.git', branch: 'main'
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
        