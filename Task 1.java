import java.util.Scanner;
public class Task1
{
	public static void main(String[] args) {
	    int yr, year;
	    Scanner task = new Scanner(System.in);
		System.out.println("Enter a year: ");
		yr = task.nextInt();
		year = yr % 12;
		switch (year){
		     case 0:
            System.out.println("The animal of the year is monkey");
            break;
		    case 1:
                System.out.println("The animal of the year is rooster");
             break;
            case 2:
            System.out.println("The animal of the year is dog");
            break;
            case 3:
            System.out.println("The animal of the year is pig");
            break;
            case 4:
            System.out.println("The animal of the year is rat");
            break;
            case 5:
            System.out.println("The animal of the year is ox");
            break;
            case 6:
            System.out.println("The animal of the year is tiger");
            break;
            case 7:
            System.out.println("The animal of the year is rabbit");
            break;
            case 8:
            System.out.println("The animal of the year is dragon");
            break;
            case 9:
            System.out.println("The animal of the year is snake");
             break;
             case 10:
             System.out.println("The animal of the year is horse");
             break;
             case 11:
             System.out.println("The animal of the year is sheep");
             break;
            default:
            
		}
	}
}