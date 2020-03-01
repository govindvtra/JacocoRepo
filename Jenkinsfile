node{

  stage('SCM Checkout'){
    
      git 'https://github.com/Sunisara/JacocoRepo'
      
      }
  stage('Maven build'){
      // def MvnHome = tool name: 'Maven', type: 'maven'
       
       bat "C:/apache-maven-3.6.3/bin/mvn clean install" 
       }
}      
