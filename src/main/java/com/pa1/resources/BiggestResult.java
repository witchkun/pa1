package com.pa1.resources;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BiggestResult {
    @JsonProperty
    String string;
    
    @JsonProperty
    BiggestWord biggestWord;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public BiggestWord getBiggestWord() {
        return biggestWord;
    }

    public void setBiggestWord(BiggestWord biggestWord) {
        this.biggestWord = biggestWord;
    }
}
