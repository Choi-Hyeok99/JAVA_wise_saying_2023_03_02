package com.ll;

import java.util.HashMap;
import java.util.Map;


// Rq는 Request(요청)이라는 의미
public class Rq {

    private  String actionCode;
    private Map<String, String> params;
    public Rq(String command){

        String[] commandBits = command.split("\\?",2);  // ? 기준으로 나눈다   최대 2까지
        actionCode = commandBits[0];

        params = new HashMap<>();

        if( commandBits.length == 1) return;

        String[] paramsBits = commandBits[1].split("&");

        for (String paramStr : paramsBits){
            String[] paramStrBits = paramStr.split("=",2);
            String key = paramStrBits[0];

            if (paramsBits.length ==1 ) continue;

            String value = paramStrBits[1];

            params.put(key, value);
        }
    }

    public String getActionCode() {
        return actionCode;
    }

    public String getParam(String name){
        return params.get(name);

    }
}
