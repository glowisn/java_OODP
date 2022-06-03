import java.util.*;

class Main {
	public static Element[] list = {new ElementEngine(), new ElementMotor(), new ElementBrake()};

	Random random = new Random();

	public static void main(String[] args) {
		VisitorSelfRepairing selfRepairing = new VisitorSelfRepairing();
		VisitorSoftwareControl softwareControl = new VisitorSoftwareControl();
		VisitorSystemComponentChecking systemComponentChecking = new VisitorSystemComponentChecking();

		list[0].accept(selfRepairing);
		
	}
}
