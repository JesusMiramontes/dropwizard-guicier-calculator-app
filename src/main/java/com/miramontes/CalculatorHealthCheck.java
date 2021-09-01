package com.miramontes;

import com.codahale.metrics.health.HealthCheck;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class CalculatorHealthCheck extends HealthCheck {

    private static final Logger LOG = LoggerFactory.getLogger(CalculatorHealthCheck.class);

    @Inject
    public CalculatorHealthCheck() {
    }

    @Override
    protected Result check() throws Exception {
        LOG.info("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!HealthCheck triggered!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        return Result.healthy();
    }
}
