package org.example;

import java.util.ArrayList;
import java.util.Objects;
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
        System.out.println("수정하고 싶은 단어를 알려주세요 : ");

        String fri = sc.next();
        ArrayList<Integer> find = this.listAll(fri);
        System.out.println("몇번째 데이터를 수정하고 싶으싶니까?");
        int a = sc.nextInt();
        int b = changeList(list.get(find.get(a-1)));
        return 0;
    }

    private int changeList(Word word) {
        if(word == null){
            System.out.println("단어가 없습니다.");
            return 0;
        }
        System.out.println("수정하고싶은 뜻은?");
        String meaning = sc.next();
        word.setMeaning(meaning);
        System.out.println("수정완료");
        return 1;

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
    public ArrayList<Integer> listAll(String fri){
        ArrayList<Integer> find = new ArrayList<>();
        int j = 0;
        System.out.println("\n------------------------------- ");
        System.out.println("num level       word      meaning");
        for(int i = 0 ; i < list.size(); i ++){
            String word =list.get(i).getWord();
            if(!word.contains(fri))continue;
            System.out.print(" "+(j+1)+"   ");
            System.out.println(list.get(i).toString());
            find.add(i);
            j++;
        }
        System.out.println("------------------------------- \n");
        return find;
    }

}
