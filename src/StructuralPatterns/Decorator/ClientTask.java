
public class ClientTask {

    public static void main(String[] args) {

        JavaDeveloper javaDev = new JavaDeveloper();

        SeniorJavaDeveloper seniorJavaDev = new SeniorJavaDeveloper(javaDev);
        JavaTeamLead javaTeamLead = new JavaTeamLead(seniorJavaDev);
        System.out.println(javaTeamLead.working());




    }
}