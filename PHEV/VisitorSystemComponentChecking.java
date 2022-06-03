class VisitorSystemComponentChecking implements Visitor {

	@Override
	public void visit(ElementMotor e) {
		System.out.println("=E System/Component Checking on " + e.motor());
		System.out.println(e.getStatus());
	}

	@Override
	public void visit(ElementEngine e) {
		System.out.println("=M System/Component Checking on " + e.engine());
		System.out.println(e.getStatus());
	}

	@Override
	public void visit(ElementBrake e) {
		System.out.println("=M System/Component Checking on " + e.brake());
		System.out.println(e.getStatus());
	}

	

}
