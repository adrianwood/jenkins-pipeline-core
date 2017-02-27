def call(String name = 'human') {
    node {
        stage "Checking out"
        echo "Hey, look, I'm echoing with a timestamp!"

        stage "Building"
        echo "Wonder what time it is now?"
	}
}

