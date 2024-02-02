def call(String project, String ImageTag, String hubUser){
            withCredentials([Username with password(
            credentialsId: "Docker",
            Username: "nemidevops",
            Password: "Kiki12@*"
    )]) 
        sh """
         docker login -u '$Username' -p '$Password'
        """
     sh """
      docker image push ${hubUser}/${project}:latest .
     """
}
