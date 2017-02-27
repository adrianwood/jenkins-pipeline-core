def call() { 
name = "testing"    
echo "${name}"
	node {
        stage "Checking out"
        echo "Hey, look, I'm echoing with a timestamp!"
	git url: 'https://github.com/jfrogdev/project-examples.git'

        stage "Building"
        echo "Wonder what time it is now?"
	}
}

