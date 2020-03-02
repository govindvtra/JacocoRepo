node{

  stage('SCM Checkout'){
    
      git 'https://github.com/Sunisara/JacocoRepo'
      
      }
  stage('Maven build'){
      // def MvnHome = tool name: 'Maven', type: 'maven'
       
       bat "C:/apache-maven-3.6.3/bin/mvn clean install" 
       }
  stage('email notif'){
    emailext attachLog: true, attachmentsPattern: '**/index.html',
                body: "${currentBuild.currentResult}: Job ${env.JOB_NAME} build ${env.BUILD_NUMBER}\n More info at: ${env.BUILD_URL}",
                recipientProviders: [developers(), requestor()],
                subject: "Jenkins Build ${currentBuild.currentResult}: Job ${env.JOB_NAME}",
                to: 'sunisaravarkey@gmail.com'
        }      
}
