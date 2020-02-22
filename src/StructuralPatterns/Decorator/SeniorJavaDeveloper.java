
public class SeniorJavaDeveloper extends DeveloperDecorator {

    public SeniorJavaDeveloper(IDeveloper developer) {
        super(developer);
    }

    public String makeCodeReview() {
        return "Make code review.\n";
    }

    @Override
    public String working() {
        return super.working() + makeCodeReview();
    }
}