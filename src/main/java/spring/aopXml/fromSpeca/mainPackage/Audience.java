package spring.aopXml.fromSpeca.mainPackage;

/**
 * Class with advices
 * @author Ihor Savchenko
 * @version 1.0
 */
public class Audience {

    public void takeSeats(){
        System.out.println("The audience is taking their seats");
    }

    public void turnOffCellPhones(){
        System.out.println("The audience is turning off their cellphones");
    }

    public void getUp(){
        System.out.println("The audience is getting up");
    }

    public void applaud(){
        System.out.println("CLAP CLAP CLAP CLAP");
    }

    public void demandRefund(){
        System.out.println("Boo! We want our money back!");
    }

}
