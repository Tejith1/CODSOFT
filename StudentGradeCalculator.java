import java.util.*;
class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks of 6 subjects(Maths,Physics,Chemistry,Biology,Social and English):");
        int a[]=new int[6];
        System.out.println("Enter Maths marks: ");
        a[0]=sc.nextInt();
        System.out.println("Enter Physics marks: ");
        a[1]=sc.nextInt();
        System.out.println("Enter Chemistry marks: ");
        a[2]=sc.nextInt();
        System.out.println("Enter Biology marks: ");
        a[3]=sc.nextInt();
        System.out.println("Enter Social marks: ");
        a[4]=sc.nextInt();
        System.out.println("Enter English marks: ");
        a[5]=sc.nextInt();
        int sum=0;
        for(int i=0;i<6;i++){
            sum+=a[i];
        }
        double avgper = (double)sum/6;
        String grade;
        if (avgper >= 90) {
            grade = "A";
        } else if (avgper >= 80) {
            grade = "B";
        } else if (avgper >= 70) {
            grade = "C";
        } else if (avgper >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("Total Marks: "+sum);
        System.out.println("Average Percentage: "+avgper);
        System.out.println("Grade: "+grade);
    }
}
