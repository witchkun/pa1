package com.pa1;

import com.pa1.health.BiggestHealth;
import com.pa1.resources.BiggestResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class Pa1Application extends Application<Pa1Configuration> {

    @Override
    public void run(Pa1Configuration c, Environment e) throws Exception {
        e.jersey().register(new BiggestResource());
        e.healthChecks().register("biggest", new BiggestHealth());
    }
    
    public static void main(String[] args) throws Exception {
        Application<?> app = new Pa1Application();
        app.run(args);        
    }
}
