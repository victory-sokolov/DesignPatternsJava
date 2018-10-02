package DependencyInjection;

public class Customer {

    //dependency
    Service service;

    public Customer(Service service) {
        this.service = service;
    }

    public String viewCustService() {
        System.out.println(service.getName());
        return service.getName();
    }

}
