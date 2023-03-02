package com.ll;

import com.ll.wiseSaying.controller.entity.WiseSaying;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    private final Scanner scanner;

    public App(Scanner scanner) {
        this.scanner = scanner;
    }


        public void run () {

            System.out.println("== 명언 앱 ==");

            long lastWiseSayingId = 0;
            List<WiseSaying> wiseSayings = new ArrayList<>();

            while (true){

            System.out.print("명령) ");
            // trim() : 혹시 있을지 모를 좌우공백 제거된 버전으로 주세요
            String command = scanner.nextLine().trim();

            if(command.equals("종료")) {
                break;
                } else if(command.equals("등록")){

                long id = lastWiseSayingId +1;
                System.out.print("명언) ");
                String content = scanner.nextLine().trim();
                System.out.print("작가) ");
                String authorName = scanner.nextLine().trim();


                WiseSaying wiseSaying = new WiseSaying(id, content, authorName);
                wiseSayings.add(wiseSaying);


                System.out.printf(" %d번 명언이 등록되었습니다.\n", id);
                lastWiseSayingId = id; // 증가
            }   else if (command.equals("목록")) {
                System.out.println("번호 / 작가 / 명언 ");
                System.out.print("-".repeat(30));

                for (int i = wiseSayings.size() -1; i>=0;  i--){
                    WiseSaying wiseSaying = wiseSayings.get(i);

                    System.out.printf("%d / %s / %s \n",wiseSaying.getId(),wiseSaying.getAuthorName(),wiseSaying.getContent());
                }

            }
        }
    }
}

