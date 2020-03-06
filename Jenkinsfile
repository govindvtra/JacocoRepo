node{

  stage('SCM Checkout'){
    
      git 'https://github.com/Sunisara/JacocoRepo'
      
      }
  stage('Maven build'){
      // def MvnHome = tool name: 'Maven', type: 'maven'
       
       bat "C:/apache-maven-3.6.3/bin/mvn clean install" 
       }
  stage('email notif'){
    
               //emailext attachmentsPattern: '**/index.html', body: 'Find attachments', subject: 'test', to: 'sunisaravarkey@gmail.com'
         emailext body: '${JELLY_SCRIPT,template="html"}', subject: 'Test Results', to: 'govindvtra@gmail.com'
        }      
}
