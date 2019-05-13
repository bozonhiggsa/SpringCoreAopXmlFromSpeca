package spring.aopXml.fromSpeca.mainPackage;

/**
 * @author Ihor Savchenko
 * @version 1.0
 */
public class Performer2 implements Performer {

    public void perform() throws BadPerformanceException {
        System.out.println("2 - My performance was very bad. That's tragedy");
        throw new BadPerformanceException("Exception in Performer2, method perform()");
    }
}
