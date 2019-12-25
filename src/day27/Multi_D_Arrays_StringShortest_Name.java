package day27;

public class Multi_D_Arrays_StringShortest_Name {
    public static void main(String[] args) {

        String[] developersTeam = {"Vladislav", "Hasan" ,"Tolkun","Abide" };
        String[] testersTeam = {"Zhibekchach" , "Mohammed Sohrabi", "Nursultan"};
        String[] businessAnalysitsTeam = {"Lisa","Ershad", "Naila"};
        String[][] scrumTeam = { developersTeam , testersTeam, businessAnalysitsTeam };
        int minLeght = scrumTeam[0][0].length();
        String shortestString = scrumTeam[0][0];
for (int i = 0 ; i< scrumTeam.length ; i++){
    for (int j = 0; j < scrumTeam[i].length ; j++) {
        if (minLeght > scrumTeam[i][j].length()){
            minLeght = scrumTeam[i][j].length();
            shortestString= scrumTeam[i][j];
        }
    }
}
        System.out.println(minLeght);
        System.out.println("shortestString = " + shortestString);








    }
}
