package spring.aopXml.fromSpeca.mainPackage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Entry point
 * @author Ihor Savchenko
 * @version 1.0
 */
public class PerformanceRunner {

    public static void main(String[] args) throws Exception {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("aop-developer-config.xml");
        System.out.println("-------------------");
        System.out.println("Spring context was created");
        System.out.println("-------------------");

        Performer performer1 = context.getBean("performer1", Performer.class);
        Performer performer2 = context.getBean("performer2", Performer.class);
        Performer performer3 = context.getBean("performer3", Performer.class);

        performer1.perform();
        System.out.println("-------------------");
        performer3.perform();
        System.out.println("-------------------");
        try{
            performer2.perform();
        }
        catch(Exception e){
            /*NOP*/
        }
        System.out.println("-------------------");

    }
}
