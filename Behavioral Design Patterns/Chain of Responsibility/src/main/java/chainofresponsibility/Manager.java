package chainofresponsibility;

public abstract class Manager {

    private Manager preManager;

    public Manager getPreManager() {
        return preManager;
    }

    public void setPreManager(Manager preManager) {
        this.preManager = preManager;
    }

    public abstract void handleRequest(Request req);
}
