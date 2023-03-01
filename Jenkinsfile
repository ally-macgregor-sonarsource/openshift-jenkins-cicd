node
{
  agent any
  stages{
    stage('SonarQube Analysis') {
      steps {
       echo "Experiment...."
        withSonarQubeEnv() {
          script{
            echo "Executing script for SQ analysis..."
            bat "C:/util/apache-maven-3.8.7/bin/mvn clean verify sonar:sonar -Dsonar.projectKey=ally-macgregor-sonarsource_openshift-jenkins-cicd_AYZzqjfaTohGSjsIfpkZ"
          }
        }
      }
    }
  }
} 
