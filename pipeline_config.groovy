application_environments{
  dev{
    long_name = "Development" 
  }
}

libraries{
  merge = true
  gradle
  sonarqube
  ansible{
    customMessage = "Hey from CDF Contributor Summit" 
  }
}

