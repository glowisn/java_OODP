import java.util.*;

class VisitorDemo {
	public static ElementEngine elementEngine = new ElementEngine();
	public static ElementMotor elementMotor = new ElementMotor();
	public static ElementBrake elementBrake = new ElementBrake();

	public static Element[] list = { elementEngine, elementMotor, elementBrake };

	Random random = new Random();

	public static void main(String[] args) {
		VisitorSelfRepairing selfRepairing = new VisitorSelfRepairing();
		VisitorSoftwareControl softwareControl = new VisitorSoftwareControl();
		VisitorSystemComponentChecking systemComponentChecking = new VisitorSystemComponentChecking();

		ElementEngineObserver engineObserver = new ElementEngineObserver();
		ElementMotorObserver motorObserver = new ElementMotorObserver();
		ElementBrakeObserver brakeObserver = new ElementBrakeObserver();

		elementEngine.attach(engineObserver);
		elementMotor.attach(motorObserver);
		elementBrake.attach(brakeObserver);

		System.out.println("\n============ PHEV SIMULATOR START ============\n");

		for (int i = 0; i < list.length; i++) {
			list[i].accept(systemComponentChecking);
			System.out.println("");
		}

		// Make HTML file
		HTMLBuilder htmlbuilder = new HTMLBuilder();
		Director director = new Director(htmlbuilder);
		director.construct(ElementEngineStatus.getStatusInt(),ElementMotorStatus.getStatusInt(),ElementBrakeStatus.getStatusInt());
		String filename = htmlbuilder.getResult();
		System.out.println(filename + "is made.\n");

		for (int i = 0; i < list.length; i++) {
			list[i].accept(selfRepairing);
			System.out.println("");
		}

		for (int i = 0; i < list.length; i++) {
			list[i].accept(softwareControl);
			System.out.println("");
		}

		modeSelection(ElementEngineStatus.getStatusInt(),ElementMotorStatus.getStatusInt(),ElementBrakeStatus.getStatusInt());

	}

	private static void modeSelection(int engine, int motor, int brake) {
		// TODO print status of elements
		System.out.println(" Engine Status: " + engine);
		// TODO print output
		if(engine == 0 && motor != 0 && brake != 0){
			System.out.println();
		}
	}
}
