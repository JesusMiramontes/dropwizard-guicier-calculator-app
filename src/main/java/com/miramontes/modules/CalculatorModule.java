package com.miramontes.modules;

import com.google.inject.Binder;
import com.hubspot.dropwizard.guicier.DropwizardAwareModule;
import com.miramontes.config.CalculatorConfiguration;
import com.miramontes.resources.CalculatorResource;

public class CalculatorModule extends DropwizardAwareModule<CalculatorConfiguration> {
    @Override
    public void configure(Binder binder) {
        binder.bind(CalculatorResource.class);
    }
}
