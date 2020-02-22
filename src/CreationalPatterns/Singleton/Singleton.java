package CreationalPatterns.Singleton;

public class Singleton {

    /* The Singleton object*/
    private static Singleton instance = null;

    /* private constructor to avoid
     external instantiation of this class */
    private Singleton() {}

    /* method to get singleton object*/
    public static synchronized Singleton getInstance() {
        if (instance == null) {
                instance = new Singleton();
        }
        return instance;
    }

    public void printObj() {
        System.out.println("Unique ID of the object: "
            + System.identityHashCode(this));
    }
}
