import java.util.*;
public class LogSubject {

	List<Observer> observerList = new ArrayList<Observer>();
	private String state;

	public String getState() {
		return state;
	}

	public void attach(Observer observer) {
		observerList.add(observer);
	}

	public void detach(Observer observer) {
		observerList.remove(observer);
	}

	public void setState(String state) {
		this.state = state;
		stateChanged();
	}

	private void stateChanged() {
		for (Observer item: observerList) {
			item.update(getState());
		}
	}

}