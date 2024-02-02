def call(String project, String ImageTag, String DockerHubUser) {
    withCredentials([usernamePassword(credentialsId: 'Docker', usernameVariable: 'USER', passwordVariable: 'PASS')]) {
        sh """
        docker login -u '$USER' -p '$PASS'
        docker push ${DockerHubUser}/${ImageName}:${ImageTag}
        """
    }
}
