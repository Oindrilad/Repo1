package com.twopirad.learning;

import java.util.regex.*;

class Regex {
    public static boolean matchString(String arg) {
        String regex = "[a-zA-Z0-9]*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(arg);
        return matcher.matches();
    }

}
