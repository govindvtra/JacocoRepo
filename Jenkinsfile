node{

  stage('SCM Checkout'){
    
      git 'https://github.com/Sunisara/JacocoRepo'
      
      }
  stage('Maven build'){
      
      def MvnHome = tool name: 'Maven', type: 'maven'
      echo %MvnHome%'
      bat "%MvnHome%/bin/mvn"
      }
}      
