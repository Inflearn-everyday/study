package me.elyowon.programers;


import java.util.ArrayList;

/**
 * 2021.06.24
 */
public class L1_210624_가운데글자가져오기 {

    public String solution(String s) {
        String answer = "";
        int len = s.length()/2;
        if(s.length() %2 ==0){
            answer += s.charAt(len-1);
            answer += s.charAt(len);
        } else {
            answer += s.charAt(len);
        }
        return answer;
    }
}

