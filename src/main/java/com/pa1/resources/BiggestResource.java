package com.pa1.resources;

import com.pa1.beans.BiggestResultComparator;
import com.pa1.beans.BiggestWordProcessor;
import com.pa1.beans.StringProcessor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Path("/biggest")
@Produces(MediaType.APPLICATION_JSON)
public class BiggestResource {
    
    static final Logger logger = LoggerFactory.getLogger(BiggestResource.class);
    
    @Inject
    StringProcessor processor;
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public BiggestResponse getBiggest(BiggestRequest request) {
        
        List<String> list = request.getStrings();
        
        List<BiggestResult> results = new ArrayList<BiggestResult>();
        for(String s: list) {
            String w = processor.process(s);
            
            BiggestWord bw = new BiggestWord();
            bw.setValue(w);
            bw.setLength(w.length());
            
            BiggestResult br = new BiggestResult();
            br.setString(s);
            br.setBiggestWord(bw);
            
            results.add(br);
        }
        
        Collections.sort(results, new BiggestResultComparator(true));  //stable sort
        
        BiggestResponse response = new BiggestResponse();
        response.setResult(results);
 
        return response;
    }    
    
    
    @GET
    public String getHello() {
        return "hello!";
    }
}
