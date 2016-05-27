package com.pa1.resources;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class BiggestRequest {
    @JsonProperty
    private List<String> strings;

    public List<String> getStrings() {
        return strings;
    }

    public void setStrings(List<String> strings) {
        this.strings = strings;
    }
}
