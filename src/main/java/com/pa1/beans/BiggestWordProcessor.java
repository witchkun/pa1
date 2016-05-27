package com.pa1.beans;

public class BiggestWordProcessor implements StringProcessor {

    @Override
    public String process(String s) {
        String[] words = s.split("[^\\w\\d]+");
        String res = words[0];
        for(int i = 0; i < words.length; ++i) {
            String w = words[i];
            if(w.length() > res.length()) {
                res = w;
            }
        }
        
        return res;
    }
}
