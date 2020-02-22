
class DeveloperDecorator implements IDeveloper {

    private IDeveloper developer;

    public DeveloperDecorator(IDeveloper developer) {
        this.developer = developer;
    }

    @Override
    public String working() {
        return developer.working();
    }
}