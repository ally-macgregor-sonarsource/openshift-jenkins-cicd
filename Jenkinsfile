pipeline
{
  agent any
  stages{
    stage('SonarQube Analysis') {
      def mvn = tool 'Default Maven';
      withSonarQubeEnv() {
        sh "${mvn}/bin/mvn clean verify sonar:sonar -Dsonar.projectKey=ally-macgregor-sonarsource_openshift-jenkins-cicd_AYZzqjfaTohGSjsIfpkZ"
      }
    }
  }
} 
