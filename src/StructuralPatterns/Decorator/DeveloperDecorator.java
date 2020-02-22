
class DeveloperDecorator implements IDeveloper {

    private IDeveloper decorated;

    public DeveloperDecorator(IDeveloper decorated) {
        this.decorated = decorated;
    }

    @Override
    public String working() {
        return decorated.working();
    }
}