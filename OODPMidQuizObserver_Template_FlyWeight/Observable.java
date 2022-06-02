import java.util.Random;

public class  {
    Random rd = new Random();
    int we;

    public (){
        //we = rd.nextInt(3);
    }

    public int newWeather(){
        we = rd.nextInt(3);
        return we;
    }

    public String getState(){
        int w = newWeather();
        if(w == 0) return "Sunny";
        if(w == 1) return "Cloudy";
        if(w == 2) return "Rainy";
        return "";
    }

   
    
}