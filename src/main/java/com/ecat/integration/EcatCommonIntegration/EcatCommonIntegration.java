package com.ecat.integration.EcatCommonIntegration;

import com.ecat.core.Integration.IntegrationBase;

/**
 * EcatCommonIntegration 是一个基础依赖集成类，为其他集成提供公共库。
 *
 * <p>此集成的功能：
 * <ul>
 *   <li>提供子类加载器（childClassLoader）供子集成使用</li>
 *   <li>包含第三方依赖包（commons-lang3, commons-io, fastjson2等）</li>
 *   <li>不包含任何业务逻辑，仅作为依赖库存在</li>
 * </ul>
 *
 * @author coffee
 */
public class EcatCommonIntegration extends IntegrationBase {

    @Override
    public void onInit() {
        log.info("EcatCommonIntegration initialized - providing common dependencies");
    }

    @Override
    public void onStart() {
        log.info("EcatCommonIntegration started");
        // 设置子类加载器，供依赖此集成的其他集成使用
        this.loadOption.setChildClassLoader(this.loadOption.getClassLoader());
    }

    @Override
    public void onPause() {
        log.info("EcatCommonIntegration paused");
    }

    @Override
    public void onRelease() {
        log.info("EcatCommonIntegration released");
    }
}
