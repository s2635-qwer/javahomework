import java.util.Scanner;

public class MinExclude_1217 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("점수 개수 : ");
        int n = sc.nextInt();
        double[] score = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + "번째 점수 : ");
            score[i] = sc.nextDouble();
        }
        System.out.print("입력 점수 : ");
        for (int i = 0; i < n; i++) {
            System.out.print(score[i] + " ");
        }
        System.out.println();
        double min = score[0];
        for (int i = 1; i < n; i++) {
            if (score[i] < min) {
                min = score[i];
            }
        }
        double sum = 0;
        boolean removed = false;
        for (int i = 0; i < n; i++) {
            if (score[i] == min && !removed) {
                removed = true;   // 최솟값 하나만 제외
                continue;
            }
            sum += score[i];
        }
        double avg = sum / (n - 1);
        System.out.println("제거된 최솟값 : " + min);
        System.out.println("최솟값 제외 합계 : " + sum);
        System.out.printf("최솟값 제외 평균 : %.2f\n", avg);
        sc.close();
    }
}