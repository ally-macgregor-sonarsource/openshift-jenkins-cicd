pipeline
{
  agent any
  stages{
    stage('Checkout SCM'){
      git 'https://github.com/ally-macgregor-sonarsource/openshift-jenkins-cicd.git'
    }
    stage('SonarQube Analysis') {
      def mvn = tool 'Default Maven';
      withSonarQubeEnv() {
        sh "${mvn}/bin/mvn clean verify sonar:sonar -Dsonar.projectKey=ally-macgregor-sonarsource_openshift-jenkins-cicd_AYZzqjfaTohGSjsIfpkZ"
      }
    }
  }
} 
