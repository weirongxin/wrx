package com.qiancheng.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class MyListener
 *
 */
@WebListener
public class MyListener implements ServletContextListener, ServletContextAttributeListener, HttpSessionListener, HttpSessionAttributeListener, ServletRequestListener, ServletRequestAttributeListener {
	//创建session的计数
	int count=0;
	
    public MyListener() {
    	System.out.println("MyListener 默认无参构造");
    }
    public void sessionCreated(HttpSessionEvent arg0)  { 
    	//将计数加一后 存入当前session使前端页面能取到、显示
        count++;
        arg0.getSession().setAttribute("count", count);
    	
        System.out.println("session创建");
    }
    public void attributeRemoved(ServletContextAttributeEvent arg0)  { 
         System.out.println("servletContext属性移除");
    }
    public void attributeAdded(ServletRequestAttributeEvent arg0)  { 
         System.out.println("request对象的属性添加");
    }
    public void attributeReplaced(HttpSessionBindingEvent arg0)  { 
         System.out.println("session对象的属性替换");
    }
    public void contextInitialized(ServletContextEvent arg0)  { 
         System.out.println("servletContext对象的创建");
    }
    public void attributeAdded(ServletContextAttributeEvent arg0)  { 
         System.out.println("servletContext对象中属性的添加");
    }
    public void requestDestroyed(ServletRequestEvent arg0)  { 
         System.out.println("request对象的销毁");
    }
    public void attributeRemoved(ServletRequestAttributeEvent arg0)  { 
         System.out.println("request对象属性的移除");
    }
    public void requestInitialized(ServletRequestEvent arg0)  { 
        System.out.println("request 对象的实例化");
    }
    public void sessionDestroyed(HttpSessionEvent arg0)  { 
        System.out.println("session 对象的销毁");
    }
    public void contextDestroyed(ServletContextEvent arg0)  { 
        System.out.println("servletContext对象的销毁");
    }
    public void attributeReplaced(ServletRequestAttributeEvent arg0)  { 
         System.out.println("request中属性的替换");
    }
    public void attributeAdded(HttpSessionBindingEvent arg0)  { 
        System.out.println("session中属性的添加");
    }
    public void attributeRemoved(HttpSessionBindingEvent arg0)  { 
        System.out.println("session中属性的移除");
    }
    public void attributeReplaced(ServletContextAttributeEvent arg0)  { 
        System.out.println("servletContext中属性的替换");
    }
}
