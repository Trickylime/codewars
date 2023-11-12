class Kata {
    static String greet(String name, String owner) {
        return name.contains(owner) ? "Hello boss" : "Hello guest";
    }
}