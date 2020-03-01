node{

  stage('SCM Checkout'){
    
      git 'https://github.com/Sunisara/JacocoRepo'
      
      }
  stage('Maven build'){
       def MvnHome = tool name: 'Maven', type: 'maven'
       
       bat "C:\Program Files (x86)\CloudBeesJenkinsDistribution\tools\hudson.tasks.Maven_MavenInstallation\Maven\bin\mvn clean install" 
       }
}      
