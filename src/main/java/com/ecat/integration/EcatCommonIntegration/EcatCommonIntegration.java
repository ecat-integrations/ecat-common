package com.ecat.integration.EcatCommonIntegration;

import com.ecat.core.Integration.IntegrationBase;

/**
 * EcatCommonIntegration is a basic dependencies integration class for other integrations.
 * 
 * @author coffee
 */

public class EcatCommonIntegration extends IntegrationBase {

    @Override
    public void onInit() {
    }

    @Override
    public void onStart() {
        log.info("EcatCommonIntegration started");
        this.loadOption.setChildClassLoader(this.loadOption.getClassLoader());
    }

    @Override
    public void onPause() {

    }

    @Override
    public void onRelease() {

    }

}
