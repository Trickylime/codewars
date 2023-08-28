public class AbbreviateTwoWords {

  public static String abbrevName(String name) {
    String[] splitName = name.split(" ");
    return ((splitName[0].charAt(0) + "." + splitName[1].charAt(0)).toUpperCase());
  }
}