package com.demoWS.config;


import io.dropwizard.Configuration;

import javax.validation.Valid;

/**
 * Created by kundankumar on 28/04/17.
 */
public class DemoConfiguration extends Configuration {

    @Valid
    private  TitanGraphConfig titanGraphConfig;


    public TitanGraphConfig getTitanGraphConfig() {
        return titanGraphConfig;
    }

    public void setTitanGraphConfig(TitanGraphConfig titanGraphConfig) {
        this.titanGraphConfig = titanGraphConfig;
    }

    @Override
    public String toString() {
        return "DemoConfiguration{" +
                "titanGraphConfig=" + titanGraphConfig +
                '}';
    }
}