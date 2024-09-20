import java.util.Scanner; 
public class Main{

    public static void main (String[] args){
        //Using the scanner
        Scanner scanner = new Scanner(System.in); // creating a scanner object
        String myName = scanner.nextLine();
        int myAge = scanner.nextInt(); // doesn't wait for the next line, next input is taken after in the same line
        String myHaircolor = scanner.nextLine();
        scanner.close(); //should be closed when finished using it to save memory space and have quicker run time

        /*Alternative to making Strings of multiple parts
        use String.format(); 
        the placeholder is %x with x replaced with letters depending on the type of variable that should be input
        after the written out String incl. the placeholders you add the variables in the correct order seperated by commas*/
        System.out.println(String.format("Hello my name is %s, my name is %d, and my haircolor is %s.", myName, myAge, myHaircolor));

    }
}