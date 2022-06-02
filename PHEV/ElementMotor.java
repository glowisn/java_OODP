class ElementMotor implements Element, Observable {
	public void accept(Visitor v) {
		v.visit(this);
	}

	public String motor() {
		return "Motor";
	}

	@Override
	public void attach(Observer observer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void detach(Observer observer) {
		// TODO Auto-generated method stub
		
	}
}
