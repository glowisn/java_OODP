import java.util.List;
import java.util.ArrayList;

public class ElementEngine implements Element, Observable{
	List<Observer> observerList = new ArrayList<Observer>();

    @Override
    public void accept(Visitor v) {
        // TODO make print statement to complete the method
        ElementEngineStatus.createEngineStatus();
        v.visit(this);
    }

    @Override
    public void attach(Observer observer) {
        // TODO Auto-generated method stub
        observerList.add(observer);
        
    }

    @Override
    public void detach(Observer observer) {
        // TODO Auto-generated method stub
        
    }

    public int getStatus(){
        return ElementEngineStatus.getStatus();
    }
    
}
