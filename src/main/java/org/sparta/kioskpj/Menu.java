package org.sparta.kioskpj;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    //List 선언
    List<MenuItem> menuList;
    //Category 필드 선언
    String category;

    public Menu(String category) {
        this.category = category;
        this.menuList = new ArrayList<>();
    }

    // List에 들어있는 MenuItem을 순차적으로 보여주는 함수
    public void printMenuItem(){
        // 반복문을 활용해 List 안에 있는 MenuItem을 하나씩 출력
        for (int i = 0; i < menuList.size(); i++) {
            System.out.println((i + 1) + ". " + menuList.get(i));
        }
        System.out.println("0. 종료");
    }

    // List를 리턴하는 함수
    public List<MenuItem> returnMenuList(){
        return menuList;
    }

}
