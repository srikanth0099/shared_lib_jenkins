def call(){
    tool name: 'maven from centos' type: 'maven'
    sh 'mvn test'
}