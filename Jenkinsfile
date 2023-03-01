pipeline
{
  agent any
  stages{
    stage('Checkout SCM'){
      git 'https://github.com/ally-macgregor-sonarsource/openshift-jenkins-cicd.git'
    }
    stage('SonarQube Analysis') {
      steps {
        withSonarQubeEnv() {
          script{
            echo "Executing script for SQ analysis..."
            def mvn = tool 'Maven';
            bat "${mvn}/bin/mvn clean verify sonar:sonar -Dsonar.projectKey=ally-macgregor-sonarsource_openshift-jenkins-cicd_AYZzqjfaTohGSjsIfpkZ"
          }
        }
      }
    }
  }
} 
