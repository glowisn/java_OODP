import java.util.List;
import java.util.ArrayList;

public class ElementEngine implements Element, Observable{
	Observer observer;

    @Override
    public void accept(Visitor v) {
        // TODO make print statement to complete the method
        ElementEngineStatus.createEngineStatus();
        v.visit(this);
        this.observer.update();
    }

    public String engine() {
		return "Gasoleine Engine";
	}

    @Override
    public void attach(Observer observer) {
        this.observer = observer;
    }

    @Override
    public void detach(Observer observer) {
        // TODO Auto-generated method stub
        
    }

    public String getStatus(){
        return ElementEngineStatus.getStatus();
    }
    
}
