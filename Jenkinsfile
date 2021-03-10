pipeline { //declarative pipeline syntax

    agent any // next available agent

    stages {

        stage("build"){

            steps {

                echo 'BUILDING APP...'
                // if running a JS app, would run shell scripts like
                // sh 'npm install'
                // sh 'npm build'
            }
        }

        stage("test"){

            steps {
                echo 'TESTING APP...'
            }
        }

        stage("deploy"){

            steps {
                echo 'DEPLOYING APP...'
            }
        }
    }
}