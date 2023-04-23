package Observer;

public interface Subject {

    // Proporciona métodos para agregar y eliminar suscriptores / observadores y notificarles un cambio.
    public void addSubscriber(Observer observer);
    public void removeSubscriber(Observer observer);
    public void notifySubscribers();
}
