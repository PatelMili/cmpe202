package lab_9;

public interface Subject {

	public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers();



	
}
