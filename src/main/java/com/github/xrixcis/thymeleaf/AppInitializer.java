package com.github.xrixcis.thymeleaf;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.request.RequestContextListener;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

/**
 * Created by xrixcis on 28.12.16.
 */
public class AppInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext container) {

        // same as web.xml - create a listener that registers as root context in the web app
        // and register Spring MVC DispatcherServlet

        XmlWebApplicationContext rootCtx = new XmlWebApplicationContext();
        rootCtx.setConfigLocation("/WEB-INF/thymeleaf-context.xml");
        container.addListener(new ContextLoaderListener(rootCtx));
        container.addListener(new RequestContextListener());

        ServletRegistration.Dynamic dispatcher =
                container.addServlet("thymeleaf", new DispatcherServlet());
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/");

    }
}
