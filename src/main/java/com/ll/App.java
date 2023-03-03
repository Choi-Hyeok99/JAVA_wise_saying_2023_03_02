package com.ll;

import com.ll.system.controller.SystemController;
import com.ll.wiseSaying.controller.WiseSayingController;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import java.util.Scanner;

public class App {


        public void run () {

            System.out.println("== 명언 앱 ==");

            SystemController systemController = new SystemController();
            WiseSayingController wiseSayingController = new WiseSayingController();
            while (true){

            System.out.print("명령) ");
            // trim() : 혹시 있을지 모를 좌우공백 제거된 버전으로 주세요
            String command = Container.getScanner().nextLine().trim();

            if(command.equals("종료")) {
                systemController.exit();
                break;
            } else if(command.equals("등록"))
                {wiseSayingController.write();}
              else if (command.equals("목록")) {
                wiseSayingController.list();
            } else if (command.startsWith("삭제")){
                  // 정리 시작
                Rq rq = new Rq(command);
                  System.out.printf("actionCode: %s\n", rq.getActionCode());
                  System.out.printf("params.id : %s\n", rq.getParam("id"));

                  // 정리 끝
                  wiseSayingController.remove();
            }
        }
    }
}

