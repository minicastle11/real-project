package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class WordCRUD implements ICRUD {
    ArrayList<Word> list;
    Scanner sc;
    WordCRUD(Scanner sc){
         list = new ArrayList<>();
        this.sc =sc;
    }

    @Override
    public Object add() {
        System.out.println("=>난이도(1,2,3) & 새 단어 입력 : ");
        int level = sc.nextInt();
        String word = sc.nextLine();
        System.out.println("뜻 입력 : ");
        String meaning = sc.nextLine();
        return new Word(0, level, word, meaning);
    }
    public void addWord(){
        Word one = (Word)add();
        list.add(one);
        System.out.println("새로운 단어가 데이터에 추가되었습니다.");
    }

    @Override
    public int update(Object o) {
        return 0;
    }

    @Override
    public int delete(Object o) {
        return 0;
    }

    @Override
    public void select(int id) {

    }
    public void listAll(){
        System.out.println("\n------------------------------- ");
        System.out.println("num level       word      meaning");
        for(int i = 0 ; i < list.size(); i ++){
            System.out.print(" "+(i+1)+"   ");
            System.out.println(list.get(i).toString());
        }
        System.out.println("------------------------------- \n");
    }

}
