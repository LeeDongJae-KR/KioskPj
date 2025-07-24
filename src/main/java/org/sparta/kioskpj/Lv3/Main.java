package org.sparta.kioskpj.Lv3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //List 선언 및 초기화
        List<MenuItem> menuList = new ArrayList<>();
        // 객체 생성을 통해 이름, 가격, 설명을 세팅 & add 함수를 통해 List에 추가
        menuList.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuList.add(new MenuItem("SmokeBurger", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuList.add(new MenuItem("CheeseBurger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuList.add(new MenuItem("HamBurger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        //Kiosk 객체 생성후 값을 넘겨준다
        Kiosk kiosk = new Kiosk(menuList);

        kiosk.start();
    }
}
