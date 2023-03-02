pipeline
{
  agent any
  stages{
    stage('SonarQube Analysis') {
      steps {
        withSonarQubeEnv(installationName: 'SonarQube Localhost') {
          script{
            echo "Executing script for SQ analysis..."
            bat "C:/util/apache-maven-3.8.7/bin/mvn clean verify sonar:sonar -Dsonar.projectKey=ally-macgregor-sonarsource_openshift-jenkins-cicd_AYZzqjfaTohGSjsIfpkZ"
          }
        }
      }
    }
    stage('Quality Gate')
    {
      steps{
          timeout (time: 5, unit: 'MINUITES'){
          // Parameter indicates whether to set pipeline to UNSTABLE if Quality Gate fails
          // true = set pipeline to UNSTABLE, false = don't
          waitForQualityGate abortPipeline: false
          }
      }  
    }
  }
} 
