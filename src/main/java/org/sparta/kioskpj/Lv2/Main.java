package org.sparta.kioskpj.Lv2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int selectNum;

        // Scanner 선언
        Scanner scanner = new Scanner(System.in);
        //List 선언 및 초기화
        List<MenuItem> menuList = new ArrayList<>();

        // 객체 생성을 통해 이름, 가격, 설명을 세팅
        MenuItem shackBurger = new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        MenuItem smokeBurger = new MenuItem("SmokeBurger", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        MenuItem cheeseBurger = new MenuItem("CheeseBurger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        MenuItem hamBurger = new MenuItem("HamBurger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거");

        //add 함수를 통해 List에 추가
        menuList.add(shackBurger);
        menuList.add(smokeBurger);
        menuList.add(cheeseBurger);
        menuList.add(hamBurger);

        // 반복문을 활용해 List 안에 있는 MenuItem을 하나씩 출력
        for (int i = 0; i < menuList.size(); i++) {
            System.out.println((i + 1) + ". " + menuList.get(i));
        }

        //입력 값에 따른 출력
        while (true) {
            System.out.print("메뉴 번호를 선택해 주세요 : ");
            selectNum = scanner.nextInt();
            switch (selectNum) {
                case 1:
                    System.out.println("ShackBurger 주문이 완료 되었습니다 감사합니다.");
                    break;
                case 2:
                    System.out.println("SmokeShack 주문이 완료 되었습니다 감사합니다.");
                    break;
                case 3:
                    System.out.println("Cheeseburger 주문이 완료 되었습니다 감사합니다.");
                    break;
                case 4:
                    System.out.println("Hamburger  주문이 완료 되었습니다 감사합니다.");
                    break;
            }
            //특정 번호 입력시 반복문 종료
            System.out.print("0을 입력하시면 종료 됩니다 추가 주문을 원하시면 0을 제외한 다른 키를 입력하세요 : ");
            if (scanner.nextInt() == 0) break;
        }
        System.out.println("선택한 메뉴 : " + menuList.get(selectNum - 1));
        scanner.close();
    }
}


