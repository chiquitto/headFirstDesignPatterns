package weatherStation;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public interface Subject {

    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObservers();
}
