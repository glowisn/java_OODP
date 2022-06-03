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
		director.construct(ElementEngineStatus.getStatusInt(), ElementMotorStatus.getStatusInt(),
				ElementBrakeStatus.getStatusInt());
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

		modeSelection(ElementEngineStatus.getStatusInt(), ElementMotorStatus.getStatusInt(),
				ElementBrakeStatus.getStatusInt());

	}

	private static void modeSelection(int engine, int motor, int brake) {
		String engineString, motorString, brakeString;

		// engine Status decider
		if (engine == 0)
			engineString = "OK";
		else if (engine == 1)
			engineString = "Oil";
		else if (engine == 2)
			engineString = "Irregular Power";
		else if (engine == 3)
			engineString = "Reduced Power";
		else
			engineString = "Error: Unreachble Code!";

		// motor Status decider
		if (motor == 0)
			motorString = "OK";
		else if (motor == 1)
			motorString = "Reduced Motor Power";
		else if (motor == 2)
			motorString = "Irregular Motor Power";
		else if (motor == 3)
			motorString = "Vibrating Motor";
		else
			motorString = "Error: Unreachble Code!";

		// brake Status decider
		if (brake == 0)
			brakeString = "OK";
		else if (brake == 1)
			brakeString = "Weak Electric";
		else if (brake == 2)
			brakeString = "No Electric";
		else if (brake == 3)
			brakeString = "Abnormal Speed Decrease";
		else
			brakeString = "Error: Unreachble Code!";

		System.out.println(" Engine Status: " + engineString);
		System.out.println(" Motor Status: " + motorString);
		System.out.println(" Regernative Brake Status: " + brakeString);

		if (engine == 0 && motor != 0 && brake != 0) {
			System.out.println("Run with Engine Mode");
		}else if(engine != 0 && motor == 0 && brake ==0){
			System.out.println("Run with Electric Mode");
		}else if(engine == 0 && motor == 0 && brake ==0){
			System.out.println("Run with Electric Mode");
		}else if(engine == 0 && motor == 0){
			System.out.println("Run with Hybrid Mode");
		}else if(engine == 3 && motor == 3 && brake == 3){
			System.out.println("Stop");
		}else if(engine == 0){
			System.out.println("Engine Running with Slow-Down");
		}else if(motor == 0){
			System.out.println("Motor Running with Slow-Down");
		}else{
			System.out.println("Engine Running with Slow-Down");
		}
	}
}
