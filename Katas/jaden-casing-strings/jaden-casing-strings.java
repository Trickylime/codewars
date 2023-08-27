public class JadenCase {

    public String toJadenCase(String phrase) {
      
        if(phrase == null || phrase.isEmpty()){
            return null;
        }

        String[] splitString = phrase.split(" ");
        String result = "";

        for (int i = 0; i < splitString.length; i++){
            splitString[i] = splitString[i].substring(0, 1).toUpperCase()
                    + splitString[i].substring(1);

            if(i == 0 ){
                result += splitString[i];
            } else {
                result += " " + splitString[i];
            }
        }

        return result;
    }

}