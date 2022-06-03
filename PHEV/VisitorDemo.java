import java.util.*;

class VisitorDemo {
	public static ElementEngine elementEngine = new ElementEngine();
	public static ElementMotor elementMotor = new ElementMotor();
	public static ElementBrake elementBrake =  new ElementBrake();

	public static Element[] list = {elementEngine,elementMotor,elementBrake};

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


		elementEngine.accept(systemComponentChecking);

		// for (int i=0; i < list.length; i++) {
		// 	list[i].accept(systemComponentChecking);
		// }
		// for (int i=0; i < list.length; i++) {
		// 	list[i].accept(selfRepairing);
		// }
		// for (int i=0; i < list.length; i++) {
		// 	list[i].accept(softwareControl);
		// }


		
	}
}
