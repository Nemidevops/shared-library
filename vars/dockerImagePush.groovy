def call(String project, String ImageTag, String DockerHubUser) {
    withCredentials([usernamePassword(credentialsId: 'Docker', usernameVariable: 'DOCKER_USERNAME', passwordVariable: 'DOCKER_PASSWORD')]) {
        sh """
        docker login -u '$DOCKER_USERNAME' -p '$DOCKER_PASSWORD'
        docker push ${DockerHubUser}/${project}:${ImageTag}
        """
    }
}
