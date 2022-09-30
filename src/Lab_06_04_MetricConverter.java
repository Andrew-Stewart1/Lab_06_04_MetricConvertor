import java.util.Scanner;
public class Lab_06_04_MetricConverter {
    public Lab_06_04_MetricConverter(){
    }
    public static void main (String[]args){
        double meters;
        double miles;
        double feet;
        double inches;
        String trash;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the measurement in meters");

        if(in.hasNextDouble()){
            meters = in.nextDouble();
            in.nextLine();

            miles = meters / 1609.34;
            feet = meters * 3.2808;
            inches = meters * 39.370;

            System.out.printf("The measurement in mile is " + miles);
            System.out.printf("The measurement in feet is " + feet);
            System.out.printf("The measurement in inches is " + inches);

        }else{
            trash = in.nextLine();
            System.out.println("You entered an invalid value: " + trash);
        }


    }
}
