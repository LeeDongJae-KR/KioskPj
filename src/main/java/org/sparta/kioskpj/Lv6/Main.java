package org.sparta.kioskpj.Lv6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Menu 객체 생성
        // Menu 클래스 내 있는 List<MenuItem> 에 MenuItem 객체 생성하면서 삽입
        Menu burgers = new Menu("Burgers");
        burgers.getMenuList().add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgers.getMenuList().add(new MenuItem("SmokeBurger", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgers.getMenuList().add(new MenuItem("CheeseBurger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgers.getMenuList().add(new MenuItem("HamBurger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        Menu drinks = new Menu("Drinks");
        drinks.getMenuList().add(new MenuItem("Coke", 1.5, "350ml 코카콜라"));
        drinks.getMenuList().add(new MenuItem("Dr Pepper", 1.5, "350ml 닥터 페퍼"));
        drinks.getMenuList().add(new MenuItem("Beer", 4.5, "500cc 생맥주"));
        drinks.getMenuList().add(new MenuItem("Water", 1.0, "500ml 생수"));

        Menu desserts = new Menu("Desserts");
        desserts.getMenuList().add(new MenuItem("French Fries", 1.5, "감자 튀김"));
        desserts.getMenuList().add(new MenuItem("Cheese Stick", 2.0, "치즈 스틱"));
        desserts.getMenuList().add(new MenuItem("Nuggets", 3.5, "치킨 너겟"));

        Menu orders = new Menu("Orders");
        orders.getMenuList().add(new MenuItem("Orders", "장바구니를 확인 후 주문 합니다."));

        // 카테고리 리스트 생성 및 Menu 객체 삽입
        List<Menu> menuCategoryList = new ArrayList<>();
        menuCategoryList.add(burgers);
        menuCategoryList.add(drinks);
        menuCategoryList.add(desserts);
        menuCategoryList.add(orders);

        // Kiosk 객체 생성
        Kiosk kiosk = new Kiosk(menuCategoryList);
        // Kiosk 시작
        while (true) {
            try {
                kiosk.start();
                break;
            } catch (Exception e) {
                System.out.println("잘못된 값을 입력하여 초기화 되었습니다.");
            }
        }
    }
}

