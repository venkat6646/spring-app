pipeline{
    agent any
    stages{

        stage('build')
        {
            steps{
                
            sh './mvnw clean package'
            }
        }
        stage('docker image')
        {
            steps{
                sh 'docker build -t spring-app:v1 .'

            }
        }
        stage('Deploy to docker swarm')
        {
            steps{
                sh ''' 
                docker service rm spring-app || true
                docker service create --name spring-app --replicas 2 -p 8081:8081 spring-app:v1

                '''
            }
        }

    }

}