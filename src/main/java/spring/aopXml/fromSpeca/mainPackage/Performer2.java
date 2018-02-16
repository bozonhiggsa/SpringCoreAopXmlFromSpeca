package spring.aopXml.fromSpeca.mainPackage;

/**
 * @author Ihor Savchenko
 * @version 1.0
 */
public class Performer2 implements Performer {


    public void perform() throws Exception {
        System.out.println("2 - My perfomance was very bad. That's tragedy");
        throw new Exception();
    }
}
