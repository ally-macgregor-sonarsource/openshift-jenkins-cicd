pipeline
{
  agent any
  stages{
    stage('SonarQube Analysis') {
      steps {
       echo "Experiment...."
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
