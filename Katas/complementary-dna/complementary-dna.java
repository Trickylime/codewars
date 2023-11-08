public class DnaStrand {
    public static String makeComplement(String dna) {

        String[] s = dna.split("");
        for(int i = 0; i < dna.length(); i++){
            if (s[i].contains("A")){
                s[i] = s[i].replace("A", "T");
                continue;
            }
            if (s[i].contains("T")){
                s[i] = s[i].replace("T", "A");
                continue;
            }
            if (s[i].contains("C")){
                s[i] = s[i].replace("C", "G");
                continue;
            }
            if (s[i].contains("G"))
                s[i] = s[i].replace("G", "C");
        }

        return String.join("", s);
    }
}