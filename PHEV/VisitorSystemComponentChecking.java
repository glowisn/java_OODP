class VisitorSystemComponentChecking implements Visitor {

	@Override
	public void visit(ElementMotor e) {
		// TODO Auto-generated method stub
		System.out.println("=E System/Component Checking on " + e.motor());
		System.out.println(e.getStatus());
	}

	@Override
	public void visit(ElementEngine e) {
		// TODO Auto-generated method stub
		System.out.println("=M System/Component Checking on " + e.engine());
		System.out.println(e.getStatus());
	}

	@Override
	public void visit(ElementBrake e) {
		// TODO Auto-generated method stub
		
	}

}
