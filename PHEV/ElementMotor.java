class ElementMotor implements Element, Observable {
	Observer observer;

	public void accept(Visitor v) {
		ElementMotorStatus.createMotorStatus();
        v.visit(this);
        this.observer.update(v);
	}

	public String motor() {
		return "Electric Motor";
	}

	@Override
	public void attach(Observer observer) {
		this.observer = observer;
	}

	
	public int getStatus(){
        return ElementMotorStatus.getStatusInt();
    }
}
