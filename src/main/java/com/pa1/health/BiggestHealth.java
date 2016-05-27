package com.pa1.health;

import com.codahale.metrics.health.HealthCheck;

public class BiggestHealth extends HealthCheck {

    @Override
    protected Result check() throws Exception {
        //TODO impl health test
        
        return Result.healthy();
    }
    
}
