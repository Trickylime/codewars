public class GreetMe{
  public static String greet(String name){
    return "Hello %s%s!".formatted(name.toUpperCase().charAt(0), name.toLowerCase().substring(1));
  }
}