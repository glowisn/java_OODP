class VisitorSelfRepairing implements Visitor {

	@Override
	public void visit(ElementMotor e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(ElementEngine e) {
		System.out.println(e.getStatus());
		
	}

	@Override
	public void visit(ElementBrake e) {
		// TODO Auto-generated method stub
		
	}

}