def call(String project, String ImageTag, String hubUser){
        sh """
         docker login -u '$DockerHubUser' -p '$pass'
        """
     sh """
      docker image push ${DockerHubUser}/${project}:${ImageTag}
     """
}
