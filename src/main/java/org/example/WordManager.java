package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class WordManager {
    Scanner sc = new Scanner(System.in);
    WordCRUD wordCRUD;
    public int selectMenu(){
        System.out.println("---영어 마스터 길라잡이---\n\n"
                          +"-----------------------\n"+
                           "1. 작성한 단어 모아보기\n"+
                           "2. 난이도 별로 모아보기\n"+
                           "3. 단어 검색하기\n"+
                           "4. 단어 추가하기\n"+
                           "5. 단어 수정하기\n"+
                           "6. 단어 삭제하기\n"+
                            "7. 파일 저장하기\n"+
                            "0. 나가기\n"+
                            "-----------------------\n"+
                            "=>원하는 메뉴를 골라주세요");
        return sc.nextInt();
    }

    WordManager(){
        wordCRUD = new WordCRUD(sc);
    }
    public void start(){
        while(true) {
            int menu = selectMenu();
            if(menu == 0)break;
            if(menu == 4){
                wordCRUD.addWord();
            }
            else if(menu == 1){
                wordCRUD.listAll();
            }
            else if(menu == 5)
            {
                wordCRUD.update(new Object());
            }
            else if(menu ==6){

            }
        }
    }
}
