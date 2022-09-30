pipeline {
    agent any
    tools {
        maven 'Maven_Home' 
    }
    environment{
        JAVA_HOME="C:/Program Files/Java/jdk-11.0.15"
        
    }
    
    stages {
        stage('install') {
            steps {
                bat "mvn --version"
            }
        }
        stage('git') {
            steps {
                git 'https://github.com/rbnaiduGit/spring-mvc-example.git'
            }
        }
        stage('test sh') {
            steps {
               
                   bat "mvn clean test"
              
            }
        }
        
        stage('Build') {
            steps {
               
                   bat "mvn package" 

            }
        }
        stage('deploy') {
           // input {
                  // mesage "Prod deployement started"
                   // ok "should we start"
               // }
            steps {
                               
              deploy adapters: [tomcat8(credentialsId: 'tomcat1', path: '', url: 'http://localhost:8080')], contextPath: '/app', war: '**/*.war'
               
            }
        }
    }
}
