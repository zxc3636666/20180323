import java.util.Scanner;

public class a1 {
    public static void main(String[] args) {
        Main ls = new Main();
        ls.content();
        a2 data[] = new a2[5];
        data[0] = new a2("anita", "女生", "資訊工程學系", 70, 80, 65);
        data[1] = new a2("jack", "男生", "應用外文系", 88, 100, 60);
        data[2] = new a2("mark", "男生", "護理系", 70, 75, 80);
        data[3] = new a2("alice", "女生", "化學系", 85, 66, 70);
        data[4] = new a2("frank", "男生", "餐飲系", 60, 70, 65);
        for (int i = 0; i < 5; i++) {
            data[i].getName();
        }
        boolean flag = true;
        while (flag) {
            Scanner sca = new Scanner(System.in);
            int n = sca.nextInt();
            switch (n) {
                case 1:
                    data[0].showinof();
                    data[1].showinof();
                    data[2].showinof();
                    data[3].showinof();
                    data[4].showinof();
                    break;
                case 2:
                    String m = sca.next();
                    switch (m) {
                        case "anita":
                            data[0].body();
                            data[0].average();
                            break;
                        case "jack":
                            data[1].body();
                            data[1].average();
                            break;
                        case "mark":
                            data[2].body();
                            data[2].average();
                            break;
                        case "alice":
                            data[3].body();
                            data[3].average();
                            break;
                        case "frank":
                            data[4].body();
                            data[4].average();
                            break;
                    }
                case 3:
                    System.out.println("1.國文");
                    System.out.println("2.數學");
                    System.out.println("3.英文");
                    int a = sca.nextInt();
                    int sum = 0;
                    switch (a) {
                        case 1:
                            for (int i = 0; i < 5; i++) {
                                sum += data[i].getChinese();
                            }
                            sum /= 5;
                            System.out.println(sum);
                            sum = 0;
                            break;
                        case 2:
                            for (int i = 0; i < 5; i++) {
                                sum += data[i].getMath();
                            }
                            sum /= 5;
                            System.out.println(sum);
                            sum = 0;
                            break;
                        case 3:
                            for (int i = 0; i < 5; i++) {
                                sum += data[i].getEnglish();
                            }
                            sum /= 5;
                            System.out.println(sum);
                            sum = 0;
                            break;
                    }
                case 4:
                    flag = false;
                    break;
            }
        }
    }
}