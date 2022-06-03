import java.util.List;
import java.util.ArrayList;

public class ElementEngine implements Element, Observable{
	Observer observer;

    @Override
    public void accept(Visitor v) {
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

    public String getStatus(){
        return ElementEngineStatus.getStatus();
    }
    
}
