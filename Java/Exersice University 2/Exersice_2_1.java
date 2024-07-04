import java.util.Scanner;

public class Exersice_2_1{
    public static void main(String args[]){

        int count = 0;
        String AM,lesson = " ";
        float gradeF,sumF = 0,MOF;;

        Scanner scan = new Scanner(System.in);
        System.out.println("Give me your AM: ");
        AM = scan.next();
        
        while(!AM.equals("000000")){
            while(true){
                System.out.println("Give me the title of your lesson with your grade in it as as a couple: ");
                count++;
                lesson = scan.next();
                if(lesson.equals("end")){
                    break;
                }
                gradeF = scan.nextFloat();
                if(count == 1){
                    sumF = gradeF;
                }
                else{
                    sumF += gradeF;
                }
            }
            MOF = sumF/count;
            String formattedNumber = String.format("%.1f",MOF);
            System.out.println("Average of Student "+AM+":"+formattedNumber);
            System.out.println("Give me the AM of the next student:");
            AM = scan.next();
            count = 0;
            sumF = 0;
        }
        System.out.println("Reading of ratings completed successfully!");
        scan.close();
    } 
}  
    