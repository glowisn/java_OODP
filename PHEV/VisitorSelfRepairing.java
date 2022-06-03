class VisitorSelfRepairing implements Visitor {
	public int type = 2;

	@Override
	public void visit(ElementMotor e) {
		System.out.println("=M Self Repairing on " + e.motor());
		systemMessage(e);
	}

	@Override
	public void visit(ElementEngine e) {
		System.out.println("=E Self Repairing on " + e.engine());
		systemMessage(e);
	}

	@Override
	public void visit(ElementBrake e) {
		System.out.println("=B Self Repairing on " + e.brake());
		systemMessage(e);
	}

	@Override
	public int getType() {
		return this.type;
	}

	public void systemMessage(ElementMotor e){
		switch (e.getStatus()) {
			//OK
			case 0:
				//Do nothing
				break;
			//Reduced
			case 1:
				System.out.println("Exchanging Motor Battery Pack for Electric Motor");
				break;
			//irregualr
			case 2:
				System.out.println("Apply oil to motor brush contact of Electric Motor");
				break;
			//vibrating
			case 3:
				System.out.println("Turn Tightly Motor Mounting Bolt of Electric Motor");
				break;
			default:
				System.out.println("!!Error : Unreachble Code!!");
				break;
		}
		
	}
	public void systemMessage(ElementEngine e){
		switch (e.getStatus()) {
			//OK
			case 0:
				//Do nothing
				break;
			//Oil
			case 1:
				System.out.println("Exchange oil for Gasoline Engine");
				break;
			//Irregular
			case 2:
				System.out.println("Self clean the spark plug of Gasoline Engine");
				break;
			//Reduced
			case 3:
				System.out.println("Supply more power from extra battery pack for Gasoline Engine");
				break;
			default:
				System.out.println("!!Error : Unreachble Code!!");
				break;
		}
	}
	public void systemMessage(ElementBrake e){
		switch (e.getStatus()) {
			//OK
			case 0:
				//Do nothing
				break;
			//Weak
			case 1:
				System.out.println("Use an extra generator system for Regenerative Brake System");
				break;
			//No
			case 2:
				System.out.println("Apply Oil to Brake Generator Contact Point of Regenerative Brake System");
				break;
			//Abnormal
			case 3:
				System.out.println("Monitoring Brake and Generator Gear of Regenerative Brake System");
				break;
			default:
				System.out.println("!!Error : Unreachble Code!!");
				break;
		}
	}

}