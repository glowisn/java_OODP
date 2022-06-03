class VisitorSoftwareControl implements Visitor {
	public int type = 3;

    @Override
	public void visit(ElementMotor e) {
		System.out.println("=M SSoftware Control and Recovery for " + e.motor());
        systemMessage(e);
	}

	@Override
	public void visit(ElementEngine e) {
		System.out.println("=E Software Control and Recovery for " + e.engine());
        systemMessage(e);
	}

	@Override
	public void visit(ElementBrake e) {
		System.out.println("=B Software Control and Recovery for " + e.brake());
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
				System.out.println("Increase Motor Battery Pack Power Monitoring Loop for Electric Motor");
				break;
			//irregualr
			case 2:
				System.out.println("Generating a Motor Power Monitoring Module from the Abstract Factory");
				break;
			//vibrating
			case 3:
				System.out.println("Initiate Monitoring SW for Motor Vibration of Electric Motor");
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
				System.out.println("Increase the control software level of oil supply forGasoline Engine");
				break;
			//Irregular
			case 2:
				System.out.println("Software Resetting for Gasoline Engine");
				break;
			//Reduced
			case 3:
				System.out.println("Increase minimum power level for Gasoline Engine");
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
				System.out.println("Initiate the monitoring SW for Weak Electricity Problem of Regenerative Brake System");
				break;
			//No
			case 2:
				System.out.println("Initiate the monitoring SW for No Electricity Problem from Resen. Brake System");
				break;
			//Abnormal
			case 3:
				System.out.println("Initiate Speed monitoring SW for Resenerative. Brake System");
				break;
			default:
				System.out.println("!!Error : Unreachble Code!!");
				break;
		}
	}
}
