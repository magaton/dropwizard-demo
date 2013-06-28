package com.magaton.dropwizard.demo;

import com.magaton.dropwizard.demo.resource.HelloWorldResource;
import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.assets.AssetsBundle;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;

/**
 * User: agaton
 * Date: 17/06/2013
 */
public class SampleService extends Service<SampleConfiguration> {

    public static void main(String[] args) throws Exception {
         new SampleService().run(args);
    }

    @Override
    public void initialize(Bootstrap<SampleConfiguration> sampleConfigurationBootstrap) {
        sampleConfigurationBootstrap.addBundle(new AssetsBundle("/favicon.ico"));
    }

    @Override
    public void run(SampleConfiguration sampleConfiguration, Environment environment) throws Exception {
        environment.addResource(new HelloWorldResource());
    }
}
