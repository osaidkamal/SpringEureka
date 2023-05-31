pipeline {
    agent {
    docker {
    image 'amazoncorretto:17-al2-jdk'
    }
    }
    options {
    skipDefaultCheckout()
    }
    stages {
        stage {
            steps{
            script {
            checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[credentialsId: '2e71e8dd-67bb-4f9e-ad63-1693a71e4f3e', url: 'https://github.com/osaidkamal/SpringEureka']]])
            }
            }
        }
                stage('Build') {
                    steps {
                        sh 'mvn -B -DskipTests clean package'
                    }
                }
                stage('Test') {
                    steps {
                        sh 'mvn test'
                    }
                }
    }
}