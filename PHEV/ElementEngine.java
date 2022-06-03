public class ElementEngine implements Element, Observable{
	Observer observer;

    @Override
    public void accept(Visitor v) {
        ElementEngineStatus.createEngineStatus();
        v.visit(this);
        this.observer.update(v);
    }

    public String engine() {
		return "Gasoleine Engine";
	}

    @Override
    public void attach(Observer observer) {
        this.observer = observer;
    }

    public int getStatus(){
        return ElementEngineStatus.getStatusInt();
    }
    
}
