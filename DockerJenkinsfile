pipeline
{
  agent{
    //Implement the scanner via build agent in docker
    docker{
      image 'sonarsource/sonar-scanner-cli:latest'
      reuseNode true
    }
  }
  options{
    skipStagesAfterUnstable()
  }
  stages{
    stage('SonarQube Analysis') {
      steps {
        withSonarQubeEnv(installationName: 'SonarQube Localhost') {
          script{
            echo "Executing script for SQ analysis..."
            bat "sonar-scanner -Dsonar.projectKey=ally-macgregor-sonarsource_openshift-jenkins-cicd_AYZzqjfaTohGSjsIfpkZ"
          }
        }
      }
    }
    stage('Quality Gate')
    {
      steps{
        timeout (time: 5, unit: 'MINUTES'){
          // Parameter indicates whether to set pipeline to UNSTABLE if Quality Gate fails
          // true = set pipeline to UNSTABLE, false = don't
          //If no timeout is defined, then the pipeline will pause forever as it waits.
          waitForQualityGate abortPipeline: false
        }
      }  
    }
  }
} 
