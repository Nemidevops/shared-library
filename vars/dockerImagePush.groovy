def call(String project, String ImageTag, String DockerHubUser){
            withCredentials([Username with password(
            credentialsId: 'Docker',
            usernameVariable: 'DOCKER_USERNAME',
            passwordVariable: 'DOCKER_PASSWORD'
    )]) {
        sh """
        docker login -u '$Username' -p '$Password'
        docker image push ${DockerHubUser}/${project}:latest .
        """
   }
}
