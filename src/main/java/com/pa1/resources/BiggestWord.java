package com.pa1.resources;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BiggestWord {
    
    @JsonProperty
    String value;
    
    @JsonProperty
    int length;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
