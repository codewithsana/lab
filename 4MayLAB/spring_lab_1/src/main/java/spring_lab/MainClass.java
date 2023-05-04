package spring_lab;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;

public class MainClass {
    public static void main(String[] args) {
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);
        Employee m = context.getBean(Manager.class);
        m.doWork();
        Employee a = context.getBean(Accountance.class);
         a.doWork();
    }







}
