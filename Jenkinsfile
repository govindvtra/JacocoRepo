node{

  stage('SCM Checkout'){
    
      git 'https://github.com/Sunisara/JacocoRepo'
      
      }
  stage('Maven build'){
      
      def MvnHome = tool name: 'Maven', type: 'maven'
      bat "%MvnHome%\bin\mvn clean install"
      }
}      
