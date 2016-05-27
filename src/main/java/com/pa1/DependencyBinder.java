package com.pa1;

import com.pa1.beans.BiggestWordProcessor;
import com.pa1.beans.StringProcessor;
import org.glassfish.hk2.utilities.binding.AbstractBinder;

public class DependencyBinder extends AbstractBinder{

    @Override
    protected void configure() {
        bind(BiggestWordProcessor.class).to(StringProcessor.class);
    }
    
}
