pipeline {
    agent any

    tools {
        jdk 'java_25'
        maven 'Maven'
    }

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Clean') {
            steps {
                bat 'mvn clean'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn compile'
            }
        }

        stage('Execute TestNG Tests') {
            steps {
                bat 'mvn test -DsuiteXmlFile=testng.xml'
            }
        }

        stage('Archive Reports') {
            steps {
                archiveArtifacts artifacts: 'reports/**', allowEmptyArchive: true
                archiveArtifacts artifacts: 'screenshots/**', allowEmptyArchive: true
            }
        }
    }

    post {

        always {
            publishTestResults testResultsPattern: 'target/surefire-reports/*.xml'

            archiveArtifacts artifacts: 'test-output/**', allowEmptyArchive: true
        }

        success {
            echo 'Build Successful'
        }

        failure {
            echo 'Build Failed'
        }
    }
}