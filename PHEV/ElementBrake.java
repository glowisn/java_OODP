public class ElementBrake implements Element, Observable{
	Observer observer;

    @Override
    public void accept(Visitor v) {
        ElementBrakeStatus.createBrakeStatus();
        v.visit(this);
        this.observer.update(v);
    }

    @Override
    public void attach(Observer observer) {
        this.observer = observer; 
    }

    public String brake() {
		return "Brake System";
	}

    public int getStatus(){
        return ElementBrakeStatus.getStatusInt();
    }
    
}
