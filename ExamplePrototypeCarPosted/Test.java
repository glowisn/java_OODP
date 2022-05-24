import java.util.*;
public class Test {
  public static void main(String[] args) {
    Car car = new Car("Captiva");
    try{
      Car car1 = (Car)car.clone();
      car1.setDate(new Date(2015,0,1));
      Car car2 = (Car)car.clone();
      car2.setDate(new Date(2014,2,1));

      System.out.println(car1.getDate());
      System.out.println(car2.getDate());

      System.out.println(car1.hashCode());
      System.out.println(car2.hashCode());
    }catch(CloneNotSupportedException e) {
      e.printStackTrace();
    }
  }
}