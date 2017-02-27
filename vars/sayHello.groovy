def call(String name = 'human') {
    // Any valid steps can be called from this code, just like in other
    // Scripted Pipeline
    echo "Hello, ${name}."
    node {
    // This is the current syntax for invoking a build wrapper, naming the class.
        // Just some echoes to show the timestamps.
        stage "First echo"
        echo "Hey, look, I'm echoing with a timestamp!"

        // And a final echo to show the time when we wrap up.
        stage "Second echo"
        echo "Wonder what time it is now?"
}
}

