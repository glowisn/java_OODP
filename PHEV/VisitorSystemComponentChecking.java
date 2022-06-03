class VisitorSystemComponentChecking implements Visitor {
	public int type = 1;

	@Override
	public void visit(ElementMotor e) {
		System.out.println("=M System/Component Checking on " + e.motor());
		systemMessage(e);
	}

	@Override
	public void visit(ElementEngine e) {
		System.out.println("=E System/Component Checking on " + e.engine());
		systemMessage(e);
	}

	@Override
	public void visit(ElementBrake e) {
		System.out.println("=B System/Component Checking on " + e.brake());
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
				System.out.println("Normal Motor Power");
				break;
			//Reduced
			case 1:
				System.out.println("Motor Power Reduced with Electric Motor");
				break;
			//irregualr
			case 2:
				System.out.println("Irregular Motor Power with Electric Motor");
				break;
			//vibrating
			case 3:
				System.out.println("Car Vibration with Electric Motor");
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
				System.out.println("Engine Oil To Be Checked on Gasoline Engine");
				break;
			//Irregular
			case 2:
				System.out.println("Irregular Engine Power with Gasoline Engine");
				break;
			//Reduced
			case 3:
				System.out.println("Engine Power Reduced with Gasoline Engine");
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
				System.out.println("Normal Regen. Brake Working with Regenerative Brake System");
				break;
			//Weak
			case 1:
				System.out.println("Weak Generative Electricity with Regenerative Brake System");
				break;
			//No
			case 2:
				System.out.println("No Electricity Generated with Regenerative Brake System");
				break;
			//Abnormal
			case 3:
				System.out.println("Abnormal Speed Decrease with Regenerative Brake System");
				break;
			default:
				System.out.println("!!Error : Unreachble Code!!");
				break;
		}
	}

}
