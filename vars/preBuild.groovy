def call(String name = 'human') { 
    echo "${name}"
    environment {
        DISABLE_AUTH = 'true'
        DB_ENGINE    = 'sqlite'
    }
	node {
        stage "Checking out"
        echo "Hey, look, I'm echoing ${DB_ENGINE} with a timestamp!"
	git url: 'https://github.com/jfrogdev/project-examples.git'

        stage "Building"
        echo "Wonder what time it is now?"
	}
}

