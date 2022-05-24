public class Battery implements Cloneable{
    public String s;

    public Battery(){
    }

    public void sets(String s){
        this.s = s;
    }

    public String gets(String s){
        return this.s;
    }

    public void prints(){
        System.out.println("Type " + s + " Battery Cloned...");
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        Battery clonedBattery = (Battery)super.clone();
        return clonedBattery;
    }
  
 }