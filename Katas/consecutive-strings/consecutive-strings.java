class LongestConsec {
    
    public static String longestConsec(String[] strarr, int k) {

        if (k <= 0 || k > strarr.length) {
            return "";
        }

        StringBuilder test = new StringBuilder();
        String result = "";
        int currentLongestLength = 0;

        for (int i = 0; i < (k == 1 ? strarr.length : strarr.length - (k - 1)); i++) {

            int j = 0;
            while (j < k) {
                test.append(strarr[i + j++]);
            }


            if (test.length() > currentLongestLength) {
                currentLongestLength = test.length();
                result = test.toString();
            }

            test = new StringBuilder();
        }

        System.out.println(result);
        return result;
    }
}