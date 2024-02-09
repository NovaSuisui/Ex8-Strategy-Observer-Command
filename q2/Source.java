import java.util.ArrayList;

public abstract class Source {
    private final ArrayList<Observer> list = new ArrayList<>();
    
    public void add (Observer observer) {
        list.add(observer);
    }
    public void remove(Observer observer) {
        list.remove(list.indexOf(observer));
    }
    public void notifyObservers() {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).update(this);
	    }
    }
}
