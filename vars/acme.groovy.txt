class acme implements Serializable {
    private String name
    def setName(value) {
        name = value
    }
    def getName() {
        name
    }
    def caution(message) {
        echo "Hello How are you, ${name}! CAUTION!!: ${message}"
    }
}