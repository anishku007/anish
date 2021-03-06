package com.anish.codility;

import java.util.*;

public class MasLengthString {

    public static int solution(String[] s) {
        Set<Integer> hashSet = new HashSet<>();
        List<String> s2 = new ArrayList<>();
        for (int i = 0; i < s.length; i++) {
            if (s[i].length() != checkUniqueString(s[i])) {                            /*checking string has unique chars*/
                continue;                                                            /*string has duplicated char so take next string*/
            }

            s2.add(s[i]);                                                            /*added string in list*/


        }
        for (int i = 0; i < s2.size(); i++) {                                                /*loop for unique string list*/
            String input = s2.get(i);
            for (int j = i + 1; j < s2.size(); j++) {
                String concat = input + s2.get(j);                                    /* concat 2 unique string*/
                if (concat.length() != checkUniqueString(concat)) {                    /* checking all char are unique*/
                    continue;
                }
                hashSet.add(concat.length());                                        /* added unique concatenated string to Set*/
            }
        }


        if (null != hashSet && !hashSet.isEmpty()) {
            return Collections.max(hashSet);                                        /* return max of hashSet values*/
        }
        return 0;
    }

    public static int checkUniqueString(String s) {

        Set<Character> hashSet = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            hashSet.add(s.charAt(i));                                            /*Storing char in hashSet*/
        }

        return hashSet.size();                                                    /*return size of string without duplication*/

    }

    public static void main(String[] arg) {
        String[] arr = {"abc","ade","ak"};
        int l = solution(arr);
        System.out.println("" + l);

    }
}
