package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10]; // 10개인 배열 생성
        for(int i = 0; i < arr.length; i++) //배열에 각각의 값 입력
            arr[i] = i;
        for(int i = 0; i < arr.length; i++){ // 값 치환
            if(i < 2)
                continue;
            arr[i] = arr[i-2] + arr[i-1];
        }
        for(int i = 0; i < arr.length; i++) //출력
            System.out.print(arr[i] + " ");
    }
}