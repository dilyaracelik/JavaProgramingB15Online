package Practice_01_13_14Classes;

public class ScrumTeamEmployeesObject {
    public static void main(String[] args) {



        ScrumTeamEmployees empleyee01= new ScrumTeamEmployees();
empleyee01.name = "Hasan";
empleyee01.employee_ID = 12234;
empleyee01.jobTitle = "PO";

        ScrumTeamEmployees empleyee02= new ScrumTeamEmployees();
empleyee02.jobTitle ="Tester";
empleyee02.name = "Sevim";
empleyee02.employee_ID =273286;
empleyee02.standUp();
        ScrumTeamEmployees empleyee03= new ScrumTeamEmployees();
empleyee03.jobTitle = "developer";
empleyee03.name = "Berk";
empleyee03.employee_ID = 5355324;

empleyee03.standUp();
empleyee01.getEmpleeInfo();


    }
}
