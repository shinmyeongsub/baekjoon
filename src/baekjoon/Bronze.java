package baekjoon;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class Bronze {
    public void q2525() {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int interval = sc.nextInt();

        try {
            SimpleDateFormat format = new SimpleDateFormat("HH:mm");
            String timeStr = hour + ":" + minute;
            Date date = format.parse(timeStr);

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.add(Calendar.MINUTE, interval);

            System.out.println(calendar.getTime().getHours() + " " + calendar.getTime().getMinutes());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void q2480() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        sc.close();

        List<Integer> numList = Arrays.asList(x,y,z);
        List<Integer> newNumList = numList.stream().distinct().collect(Collectors.toList());

        int result = 0;
        switch (newNumList.size()) {
            case 1:
                result = 10000 + newNumList.get(0) * 1000;
                break;
            case 2:
                System.out.println("numList = " + numList);
                System.out.println("newNumList = " + newNumList);
                break;
            case 3:
                break;
        }
        System.out.println(result);
    }

    public void q2884() {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        sc.close();

        if (H == 0) {
            if (M < 45) {
                H = 23;
                M += 15;
            } else {
                M -= 45;
            }
        } else {
            if (M < 45) {
                H -= 1;
                M += 15;
            } else {
                M -= 45;
            }
        }
        System.out.println(H + " " + M);
    }

    public void q14681() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();

        int result = 0;
        if (x > 0) {
            if (y > 0) {
                result = 1;
            } else {
                result = 4;
            }
        } else {
            if (y > 0) {
                result =  2;
            } else {
                result = 3;
            }
        }

        System.out.println(result);
    }

    public void q2753() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        if ((n % 400 == 0) || (n % 4 == 0 && n % 100 != 0)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

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
