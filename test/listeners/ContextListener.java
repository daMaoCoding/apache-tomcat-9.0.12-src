package listeners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Added just for monitoring and debugging.
 */
@WebListener
public class ContextListener implements ServletContextListener, HttpSessionListener {


    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println(" *** ContextListener.contextInitialized");
    }


    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println(" *** ContextListener.contextDestroyed");
    }


    public void sessionCreated(HttpSessionEvent se) {
        System.out.println(" *** ContextListener.sessionCreated - NOT GOOD!");
    }


    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println(" *** ContextListener.sessionDestroyed - NOT GOOD!");
    }
}