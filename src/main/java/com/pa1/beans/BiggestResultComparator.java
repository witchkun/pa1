package com.pa1.beans;

import com.pa1.resources.BiggestResult;
import com.pa1.resources.BiggestWord;
import java.util.Comparator;

public class BiggestResultComparator implements Comparator<BiggestResult> {
    
    private final boolean descending;

    public BiggestResultComparator(boolean desc) {
        this.descending = desc;
    }

    public int compare(BiggestResult o1, BiggestResult o2) {
        BiggestWord w1 = o1.getBiggestWord();
        BiggestWord w2 = o2.getBiggestWord();
        
        int res;
        if(w1.getLength() > w2.getLength()) {
            res = 1;
        }
        else if(w1.getLength() < w2.getLength()) {
            res = -1;
        }
        else {
            res = w1.getValue().compareTo(w2.getValue());
        }
        
        return res * (descending? -1: 1);
    }
    
}
