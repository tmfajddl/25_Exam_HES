package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("양수의 정수를 입력하시오: ");
        int n = sc.nextInt(); // 정수 크기 대입
        if(n <= 0) // 양의 정수가 아닐경우 출력문 출력
            System.out.println("양수가 아닙니다.");
        for(int i = 0; i < n; i++){//줄 수 반복
            for(int j = 0; j < i; j++) // 공백 출력
                System.out.print(" ");
            for(int j = n-i; j >= 1; j--) // n-i 만큼의 수 출력
                System.out.printf("%d ",j);
            System.out.println(); // 줄바꿈 표시
        }
    }
}