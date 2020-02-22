package DependencyInjection;

public class App {

    public static void main(String[] args) {

        Service s1 = new Service("Car DependencyInjection.Service");
        Service s2 = new Service("Moto DependencyInjection.Service");
        Service s3 = new Service("Bicycle DependencyInjection.Service");

        Customer c1 = new Customer(s1);
        Customer c2 = new Customer(s2);
        Customer c3 = new Customer(s3);

        c1.viewCustService();
        c2.viewCustService();
        c3.viewCustService();
    }

}
