package com.demoWS.app;

import com.demoWS.config.DemoConfiguration;
import com.demoWS.resources.EntryResource;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.eclipse.jetty.servlets.CrossOriginFilter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kundankumar on 28/04/17.
 */
public class DemoApp extends Application<DemoConfiguration> {

    private static DemoConfiguration demoConfiguration;


    public static void main(String[] args) {
        System.out.println("inside main");

        try{
            new DemoApp().run(new String[]{args[0],args[1]});
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(Bootstrap<DemoConfiguration> bootstrap) {

        bootstrap.getObjectMapper().setSerializationInclusion(JsonInclude.Include.NON_NULL);
        bootstrap.getObjectMapper().setSerializationInclusion(JsonInclude.Include.NON_EMPTY);

        System.out.println("app init");
    }

    @Override
    public void run(DemoConfiguration configuration, Environment environment) throws Exception {

        System.out.println("inside run");

        Map<String, String> cors_params = new HashMap<>();

        cors_params.put(CrossOriginFilter.ALLOWED_ORIGINS_PARAM,"*");
        cors_params.put(CrossOriginFilter.ALLOWED_HEADERS_PARAM,"X-Request-With,Content-Type,Accept,Origin,X-Authorization-User");
        cors_params.put(CrossOriginFilter.ALLOWED_METHODS_PARAM,"OPTIONS,GET,PUT,POST,DELETE,HEAD");


        System.out.println("adding config ");
        environment.getApplicationContext().addFilter(CrossOriginFilter.class, "/*",null).setInitParameters(cors_params);

        DemoApp.demoConfiguration = configuration;

        regsterResource(environment);


        System.out.println("here ");

        // perform initialization operations

    }

    private void regsterResource(Environment environment){

        environment.jersey().register(new EntryResource());
    }


}
