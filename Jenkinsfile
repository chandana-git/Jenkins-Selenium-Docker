node {
  stage('SCM') {
    git 'https://github.com/chandana-git/Jenkins-Selenium-Docker.git'
  }
  stage('maven'){
  bat label: '', script: 'mvn clean package'
}
  
stage('SonarQube analysis') {
    withSonarQubeEnv() 
      bat label: '', script: 'mvn org.sonarsource.scanner.maven:sonar-maven-plugin:3.6.0.1398:sonar'

   }
}

 stage('Publish TestNg Results'){
    step([$class: 'Publisher'])
     
 }
stage('archiving the artifact artifacts')
{
archiveArtifacts 'target/*.war'
}
/*
stage('Build Docker Image'){
    //sh 'sudo chmod 666 /var/run/docker.sock'
//bat label: '', script: "docker build . -t chandanarm/jenkins-app"
   sh 'docker build . -t chandanarm/jenkins-app'
}
stage('Push Docker Image'){
    withCredentials([string(credentialsId: 'docker-pwd', variable: 'dockerHubPwd')]) {
    //bat label: '', script: "docker login -u chandanarm  -p ${dockerHubPwd}"
    // bat label: '', script: "docker push chandanarm/jenkins-app:latest"
    sh "docker login -u chandanarm  -p ${dockerHubPwd}"
}
sh 'docker push chandanarm/jenkins-app:latest'
}
*/
}
