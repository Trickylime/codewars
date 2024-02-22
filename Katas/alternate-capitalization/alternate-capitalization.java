class Solution{
    public static String[] capitalize(String s){

        StringBuilder[] sb = {new StringBuilder(), new StringBuilder()};

        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                sb[0].append(s.toUpperCase().charAt(i));
                sb[1].append(s.toLowerCase().charAt(i));
            } else {
                sb[0].append(s.toLowerCase().charAt(i));
                sb[1].append(s.toUpperCase().charAt(i));
            }
        }

        return new String[]{String.valueOf(sb[0]), String.valueOf(sb[1])};
    }
}