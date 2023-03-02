package com.ll;

import java.util.Scanner;

public class App {

    private final Scanner scanner;

    public App(Scanner scanner) {
        this.scanner = scanner;
    }


        public void run () {

            System.out.println("== 명언 앱 ==");
        while (true){
            System.out.print("명령) ");
            // trim() : 혹시 있을지 모를 좌우공백 제거된 버전으로 주세요
            String command = scanner.nextLine().trim();

            if(command.equals("종료")) {
                break;
                } else if(command.equals("등록")){
                System.out.print("명언) ");
                String content = scanner.nextLine().trim();
                System.out.print("작가) ");
                String authorName = scanner.nextLine().trim();
            }
            }
        }
    }

