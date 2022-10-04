pipeline {
    agent 'any'
    parameters {
        string(name: "branch", defaultValue: "main", description: "which branch to use")
        string(name: "url", defaultValue: "main", description: "which url to use")
        choice(name: "test", choices:["all", "dir", "file"],  description: "Run test stage for test targets [all, dir, file]")
        choice(name: "test_params", choices:["all", "param1", "param2"],  description: "Run test stage for test targets [all, param1, param2]")
        booleanParam(name: "save_logs", description: "save logs", defaultValue: false)
        choice(name: "test_target", choices:["all", 1, "site1", "site2", "locals"],  description: "Run test stage for test targets [all, site1, site2, locals]")
        }
    stages {
        stage('Test Repo Setup') {
            steps {
               println("URL does not exist")
//                 if (params.url == "url") {
//                   println("URL exists")
//                   } else {
//                   println("URL does not exist")
//                   }
//                 }
            }

        stage('Test Run') {
            steps {
                println("python -m pytest ${params.test} ${params.test_params} --url ${params.url}")
            }
        }
        stage('Report') {
            steps {
                println("URL does not exist")
                }
            }
        stage('Log Collection') {
            steps {
                println("URL does not exist")
            }
        }
    }
}
