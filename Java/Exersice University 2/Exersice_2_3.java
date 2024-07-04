import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exersice_2_3{
    public static void main(String args[]) 
    throws IOException{

        int[] array = new int[11];
        String file,line;
        int x=0,i;

        Scanner scan = new Scanner(System.in);

        System.out.println("Give me the file that you want to print statisticly");
        file = scan.next();

        BufferedReader reader = new BufferedReader(new FileReader(file));
        while((line = reader.readLine()) != null){
            System.out.println("The contents of file myfile.txt are:\n");
            System.out.println(line);
            for(i=0;i<line.length();i++){
                x = line.charAt(i);
                if(x == 'A'){
                   array[0] += 1;
                }else if(x == 'a'){
                   array[1] += 1;
                }else if(x == 'G'){
                   array[2] += 1;
                }else if(x == 'g'){
                   array[3] += 1;
                }else if(x == 'V'){
                   array[4] += 1;
                }else if(x == 'v'){
                   array[5] += 1;
                }else if(x == '1'){
                   array[6] += 1;
                }else if(x == '3'){
                   array[7] += 1;
                }else if(x == '5'){
                   array[8] += 1;
                }else if(x == '7'){
                   array[9] += 1;
                }else if(x == '9'){
                   array[10] += 1;
                }
            }   
        }
        System.out.println("Statistics\n");
        System.out.println("============\n");
        System.out.println("Upper A "+array[0]);
        System.out.println("Lower a "+array[1]);
        System.out.println("Upper G "+array[2]);
        System.out.println("Lower g "+array[3]);
        System.out.println("Upper V "+array[4]);
        System.out.println("Lower v "+array[5]);
        System.out.println("1 "+array[6]);
        System.out.println("3 "+array[7]);
        System.out.println("5 "+array[8]);
        System.out.println("7 "+array[9]);
        System.out.println("9 "+array[10]);
        scan.close();
        reader.close();
    }
}