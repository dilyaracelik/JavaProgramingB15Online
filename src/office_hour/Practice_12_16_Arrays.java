package office_hour;

public class Practice_12_16_Arrays {
    public static void main(String[] args) {

        String[] names = {"Jonn", "Kevin", "Scott"};
        System.out.println("First name " + names[0]);


        //if you don't care where to start, or no index needed use for each loop..
        for (String name : names) {
            System.out.println(name);
        }
        //if we need age of 3rd student students [2][2]
        //if we need age of 1st student students [0][2]
        //if we need age of 2nd student students [1][2]
//let's say we need to store some table where we have row and columns. like EXEL.!! IMPT
                      // |student id | name | age | Country |
        String[][] students = {{"1", "John", "35", "USA"},
                               {"2", "Kevin", "40", "Brazil"},
                               {"3", "Scott", "20", "Canada"}    };
//to format your code
        //click option+command+L
        System.out.println("How many arrays inside students 2D Array? " + students.length); //how many arrays we have

        System.out.println("How many values in second row (inner array)?" + students[1].length); // kac row
        // oldugunu soyler
        //nested loop for  exel items

        for (String [] arr : students){
            for (String value : arr){
                System.out.print( value + " ");

            }

            System.out.println();
        }


// Find oldest student and print his name.
// |student id | name | age | Country |
//     1       | John | 35   | USA     BOYLE gozukur 1st ROW
//first print only age values


        //Integer.parseInt - convert string into int
        String oldestPersonName = students[0][1]; //let's infer that 1st person is oldest
        int ageOfOldestPerson = Integer.parseInt(students[0][2]);//let's infer that 1st person is oldest
        for (String[] row : students) {
            //go through every row and get
            //value only from 3rd column | number -1 = index
            System.out.println(row[2]);//3rd row represents age
            //I need to convert into integer to be able to compare
            int age = Integer.parseInt(row[2]);//convert string --> into int
            System.out.println("Age: " + age);
            //if age is higher than previous max
            if (age > ageOfOldestPerson) {
                //then we have new max age and new oldest name
                ageOfOldestPerson = Integer.parseInt(row[2]);
                oldestPersonName = row[1];
            }
        }
        System.out.println("Oldest person is: " + oldestPersonName);


    }
}
