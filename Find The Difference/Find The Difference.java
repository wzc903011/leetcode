public static char findTheDifference(String s, String t) {
        StringBuilder strBuilder = new StringBuilder(s);
        strBuilder.append(t);
        char a = 0;
        System.out.println(strBuilder);
        for(int i = strBuilder.length() - 1; i >= 0; i--) {
            a ^= strBuilder.charAt(i);
        }
        return a;
    }