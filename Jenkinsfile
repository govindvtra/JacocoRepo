node{

  stage('SCM Checkout'){
    
      git 'https://github.com/Sunisara/JacocoRepo'
      
      }
  stage('Maven build'){
      
      def MvnHome = tool name: 'Maven', type: 'maven'
      println (MvnHome)
      //bat "%MvnHome%/bin/mvn"
      }
}      
