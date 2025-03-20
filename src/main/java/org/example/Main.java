package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("가로의 길이를 입력하세요: ");
        int w = sc.nextInt(); // 가로 길이 대입
        System.out.printf("세로의 길이를 입력하세요: ");
        int h = sc.nextInt(); //세로 길이 대입
        for(int i = 0; i < h; i++){ //줄 수 반복
            for(int j = 0; j < w; j++) // 한줄에 찍히는 별 반복
                System.out.print("*");
            System.out.println(); // 줄바꿈
        }
    }
}