package org.sparta.kioskpj.Lv1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 메뉴 출력
        System.out.println("[ SHAKESHACK MENU ]");
        System.out.println("1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        System.out.println("2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        System.out.println("3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        System.out.println("4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
        System.out.println("0. 종료      | 종료");

        //입력 값에 따른 출력
        while (true) {
            System.out.print("메뉴 번호를 선택해 주세요 : ");
            switch (scanner.nextInt()) {
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
            if(scanner.nextInt() == 0) break;
        }
    }
}


