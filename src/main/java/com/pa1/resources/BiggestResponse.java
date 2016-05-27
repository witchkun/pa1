package com.pa1.resources;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class BiggestResponse {
    
    @JsonProperty
    List<BiggestResult> result;

    public List<BiggestResult> getResult() {
        return result;
    }

    public void setResult(List<BiggestResult> result) {
        this.result = result;
    }
}
