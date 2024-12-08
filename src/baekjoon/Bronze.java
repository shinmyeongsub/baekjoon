package baekjoon;

import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;
import java.util.stream.Collectors;

public class Bronze {

    public void q25083() {
        System.out.println("         ,r'\"7");
        System.out.println("r`-_   ,'  ,/");
        System.out.println(" \\. \". L_r'");
        System.out.println("   `~\\/");
        System.out.println("      |");
        System.out.println("      |");
    }

    public void q11718() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input;

        while ((input = br.readLine()) != null) {
            bw.write(input);
            bw.newLine();
        }

        br.close();
        bw.close();
    }

    public void q5622() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int delay = 0;
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)+"") {
                case "A":
                case "B":
                case "C":
                    delay += 3;
                    break;
                case "D":
                case "E":
                case "F":
                    delay += 4;
                    break;
                case "G":
                case "H":
                case "I":
                    delay += 5;
                    break;
                case "J":
                case "K":
                case "L":
                    delay += 6;
                    break;
                case "M":
                case "N":
                case "O":
                    delay += 7;
                    break;
                case "P":
                case "Q":
                case "R":
                case "S":
                    delay += 8;
                    break;
                case "T":
                case "U":
                case "V":
                    delay += 9;
                    break;
                case "W":
                case "X":
                case "Y":
                case "Z":
                    delay += 10;
                    break;
            }
        }
        System.out.println(delay);
    }

    public void q2908() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        String strA = String.valueOf(a);
        String strB = String.valueOf(b);

        strA = "" + strA.charAt(strA.length() - 1) + strA.charAt(strA.length() - 2) + strA.charAt(strA.length() - 3) ;
        strB = "" + strB.charAt(strB.length() - 1) + strB.charAt(strB.length() - 2) + strB.charAt(strB.length() - 3) ;

        if (Integer.parseInt(strA) > Integer.parseInt(strB)) {
            System.out.println(strA);
        } else {
            System.out.println(strB);
        }
    }

    public void q1152() {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine().trim();
        if (str.equals("")) {
            System.out.println(0);
        } else{
            List<String> list = Arrays.asList(str.split(" "));
            System.out.println(list.size());
        }
    }

    public void q2675() {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int R = sc.nextInt();
            String S = sc.next();
            String str = "";
            for (int j = 0; j < S.length(); j++) {
                for (int k = 0; k < R; k++) {
                    str += S.charAt(j);
                }
            }
            System.out.println(str);
        }
    }

//    public void q10809() {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//
//        for (int i = 0; i < str.length(); i++) {
//            int a = str.charAt(i) - 96;
//            System.out.println("a = " + a);
//        }
//    }

    public void q11720() {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        String numStr = sc.nextLine();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += Integer.parseInt(String.valueOf(numStr.charAt(i)));
        }
        System.out.println(sum);
    }

    public void q11654() {
        Scanner sc = new Scanner(System.in);
        String c = sc.nextLine();

        System.out.println(c.charAt(0) + 0);
    }

    public void q9086() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            String str = sc.next();
            System.out.println(str.charAt(0) + "" + str.charAt(str.length() - 1));
        }
    }

    public void q2743() {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextLine().length());
    }

    public void q27866() {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();
        int i = sc.nextInt();

        System.out.println(S.charAt(i - 1));
    }

    public void q1546() {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double[] scores = new double[N];
        for (int i = 0; i < N; i++) {
            scores[i] = sc.nextInt();
        }

        double maxScore = 0;
        for (double score : scores) {
            if (score > maxScore) {
                maxScore = score;
            }
        }

        for (int i = 0; i < N; i++) {
            scores[i] = scores[i] / maxScore * 100;
        }

        double totalScore = 0;
        for (double score : scores) {
            totalScore += score;
        }

        System.out.println(totalScore / N);
    }

    public void q3052() {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(sc.nextInt() % 42);
        }

        HashMap<String, Integer> map = new HashMap<>();
        for (Integer i : list) {
            map.put(String.valueOf(i), i);
        }

        System.out.println(map.size());
    }

    public void q5579() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();

        for (int i = 0; i < 30; i++) {
            arrayList2.add(i + 1);
        }

        for (int i = 0; i < 28; i++) {
            arrayList.add(sc.nextInt());
        }

        for (Object o : arrayList) {
            if (arrayList2.remove(o));
        }

        if (arrayList2.get(0) > arrayList2.get(1)) {
            System.out.println(arrayList2.get(1));
            System.out.println(arrayList2.get(0));
        } else {
            System.out.println(arrayList2.get(0));
            System.out.println(arrayList2.get(1));
        }
    }

    public void q2562() {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[9];
        int max = 0;
        int position = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] == max) position = i+1;
        }

        System.out.println(max);
        System.out.println(position);
    }

    public void q10818() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            arr[i] = x;
        }

        int min = arr[0];
        int max = arr[0];
        for (int i : arr) {
            if (i < min) min = i;
            if (i > max) max = i;
        }

        System.out.println(min);
        System.out.println(max);
    }

    public void q10871() {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt();

        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            A[i] = x;
        }

        for (int i : A) {
            if (i < X) System.out.println(i);
        }
    }

    public void q10807() {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }

        int v = sc.nextInt();
        int count = 0;

        for (int num : list) {
            count = num == v ? ++count : count;
        }

        System.out.println(count);
    }

    public void q10951() {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            System.out.println(A+B);
        }
        sc.close();
    }

    public void q10952() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            if (A == 0 && B == 0) {
                break;
            }

            System.out.println(A+B);
        }
    }

    public void q2439() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());

            for (int i = 0; i < N; i++) {

                for (int j = 0; j < N-i-1; j++) {
                    System.out.print(" ");
                }

                for (int j = 0; j < i+1; j++) {
                    System.out.print("*");
                }

                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void q2438() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < i+1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void q11022() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        try {
            int T = Integer.parseInt(br.readLine());
            for (int i = 1; i <= T; i++) {
                st = new StringTokenizer(br.readLine());

                int A = Integer.parseInt(st.nextToken());
                int B = Integer.parseInt(st.nextToken());

                bw.write("Case #" + i + ": " + A + " + " + B + " = " + (A + B));
                bw.newLine();
            }
            bw.flush();
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void q11021() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        try {
            int T = Integer.parseInt(br.readLine());
            for (int i = 1; i <= T; i++) {
                st = new StringTokenizer(br.readLine());
                bw.write("Case #" + i + ": " + (Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())));
                bw.newLine();
            }
            bw.flush();
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void q15552() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        try {
            int T = Integer.parseInt(br.readLine());
            for (int i = 0; i < T; i++) {
                st = new StringTokenizer(br.readLine());
                bw.write(String.valueOf(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())));
                bw.newLine();
            }
            bw.flush();
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 내가 한거 Runtime ?? 왜 일까?
//    public void q15552() {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        try {
//            int T = Integer.parseInt(br.readLine());
//            for (int i = 0; i < T; i++) {
//                int A = Integer.parseInt(br.readLine());
//                int B = Integer.parseInt(br.readLine());
//                bw.write(String.valueOf(A + B));
//                bw.newLine();
//            }
//            bw.flush();
//            bw.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    public void q25314() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N/4; i++) {
            System.out.print("long ");
        }
        System.out.println("int");
    }

    public void q25304() {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();

        int expectedTotal = 0;

        for (int i = 0; i < N; i++) {
            int price = sc.nextInt();
            int amount = sc.nextInt();

            expectedTotal += price * amount;
        }

        System.out.println(expectedTotal == X ? "Yes" : "No");
    }

    public void q8393() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;

        while (n != 0) {
            result += n;
            n--;
        }

        System.out.println(result);
    }

    public void q10950() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a + b);
        }
    }

    public void q2739() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i < 10; i++) {
            System.out.println(N + " * " + i + " = " + i * N);
        }
    }

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

        List<Integer> numList = new ArrayList<>(Arrays.asList(x,y,z));
        List<Integer> newNumList = new ArrayList<>(numList.stream().distinct().collect(Collectors.toList()));

        int result = 0;
        switch (newNumList.size()) {
            case 1:
                result = 10000 + newNumList.get(0) * 1000;
                break;
            case 2:
                for (int i : newNumList) {
                    numList.remove(Integer.valueOf(i));
                }
                result = 1000 + numList.get(0) * 100;
                break;
            case 3:
                List<Integer> sortedNumList = numList.stream().sorted().collect(Collectors.toList());
                result = sortedNumList.get(sortedNumList.size() - 1) * 100;
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
