package baekjoon;

import java.util.Scanner;

public class Bronze {

    public void q9598() {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        scanner.close();

        int grade = score/10;

        switch (grade) {
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            default:
                System.out.println("F");
        }
    }

    public void q1330() {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        scanner.close();

        System.out.println( A>B? ">" : A<B? "<" : "==" );
    }

    public void q10172() {
        System.out.println("|\\_/|");
        System.out.println("|q p|   /}");
        System.out.println("( 0 )\"\"\"\\");
        System.out.println("|\"^\"`    |");
        System.out.println("||_/=\\\\__|");
    }

    public void q10171() {
        System.out.println("\\    /\\");
        System.out.println(" )  ( ')");
        System.out.println("(  /  )");
        System.out.println(" \\(__)|");
    }

    public void q11382() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();

        String[] strArr = str.split(" ");

        long sum = 0;
        for (String s : strArr) {
            sum += Long.parseLong(s);
        }
        System.out.println(sum);
    }

    public void q2488() {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        scanner.close();

        System.out.println((B%10) * A);
        System.out.println((B%100/10) * A);
        System.out.println((B%1000/100) * A);
        System.out.println(A*B);
    }

    public void q10430() {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        scanner.close();

        System.out.println((A+B)%C);
        System.out.println(((A%C) + (B%C))%C);
        System.out.println((A*B)%C);
        System.out.println(((A%C) * (B%C))%C);
    }

    public void q18108() {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        scanner.close();

        System.out.println(year-543);
    }

    public void q10926() {
        Scanner scanner = new Scanner(System.in);
        scanner.close();

        String name = scanner.nextLine();
        System.out.println(name+"??!");
    }

    public void q10869() {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        scanner.close();
        System.out.println(A+B);
        System.out.println(A-B);
        System.out.println(A*B);
        System.out.println(A/B);
        System.out.println(A%B);
    }

    public void q1008() {
        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        scanner.close();
        System.out.println(A/B);
    }

    public void q10998() {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        scanner.close();
        System.out.println(A*B);
    }

    public void q1001() {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        scanner.close();
        System.out.println(A-B);
    }

    public void q1000() {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        scanner.close();
        System.out.println(A+B);
    }

    public void q2557() {
        System.out.println("Hello World!");
    }
}
