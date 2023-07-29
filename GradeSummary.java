import java.util.Scanner;
public class GradeSummary {
    public static void main(String[] args) {
        int grade, gradeCounter = 0, sum = 0;
        double average;
        int aCount = 0, bCount = 0, cCount = 0, dCount = 0, fCount = 0;
        Scanner scanner = new Scanner(System.in);
        grade = scanner.nextInt();
        while(grade != -1) {
           sum += grade;
           ++gradeCounter;
           switch(grade / 10) {
              case 10:
              case 9:
              case 8: ++aCount;	break;
	          case 7: ++bCount; break;
              case 6: ++cCount; break;
              case 5: ++dCount; break;
	         default: ++fCount;
	    }
	  grade = scanner.nextInt();
      }
	average = (double)sum / gradeCounter;
	System.out.printf("average grade = %f\n", average);
	System.out.println("grade report");
	System.out.printf("A = %d\n", aCount);
	System.out.printf("B = %d\n", bCount);
	System.out.printf("C = %d\n", cCount);
	System.out.printf("D = %d\n", dCount);
	System.out.printf("F = %d\n", fCount);
   }
 }
