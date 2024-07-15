import java.util.Scanner;

public class GradeSystem {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter  the marks : ");
        int marks = inp.nextInt();

        grade(marks);
    }

    static void grade(int marks){
        if (marks<0 || marks>100){
            System.out.println("invalid input");
        } else if (marks>=91 && marks<=100){
            System.out.println("grade : AA");
        } else if (marks>=81 && marks<=90) {
            System.out.println("grade : AB");
        } else if (marks>=71 && marks<=80) {
            System.out.println("grade : BB");
        } else if (marks>=61 && marks<=70) {
            System.out.println("grade : BC");
        } else if (marks>=51 && marks<=60) {
            System.out.println(" grade : CD");
        }else if (marks>=41 && marks<=50){
            System.out.println("grade : DD");
        } else if (marks<=40) {
            System.out.println("FAIL");
        }
    }
}
