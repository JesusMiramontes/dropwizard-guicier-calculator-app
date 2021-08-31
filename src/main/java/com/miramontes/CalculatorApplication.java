package com.miramontes;

import com.hubspot.dropwizard.guicier.GuiceBundle;
import com.miramontes.config.CalculatorConfiguration;
import com.miramontes.modules.CalculatorModule;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class CalculatorApplication extends Application<CalculatorConfiguration> {
    @Override
    public void run(CalculatorConfiguration configuration, Environment environment) throws Exception {

    }

    public static void main(String[] args) throws Exception {
        new CalculatorApplication().run(args);
    }

    @Override
    public void initialize(Bootstrap<CalculatorConfiguration> bootstrap){
        GuiceBundle<CalculatorConfiguration> guiceBundle = GuiceBundle.defaultBuilder(CalculatorConfiguration.class)
                .modules(new CalculatorModule())
                .build();

        bootstrap.addBundle(guiceBundle);
    }

}
