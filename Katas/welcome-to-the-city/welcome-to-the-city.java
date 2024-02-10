public class Hello{
    public String sayHello(String [] name, String city, String state){

        StringBuilder fullName = new StringBuilder();
        for (String s : name) {
            fullName.append(s).append(" ");
        }

        return "Hello, %s! Welcome to %s, %s!".formatted(fullName.toString().trim(), city, state).trim();
    }
}