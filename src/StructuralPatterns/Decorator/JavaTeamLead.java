

public class JavaTeamLead extends DeveloperDecorator {

    public JavaTeamLead(IDeveloper developer) {
        super(developer);
    }

    public String sendWeekReport() {
        return "Send week report to customer.\n";
    }

    @Override
    public String working() {
        return super.working() + sendWeekReport();
    }
}