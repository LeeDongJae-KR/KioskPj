package org.sparta.kioskpj;

import java.util.List;
import java.util.Scanner;

public class Kiosk {

    int selectNum;

    Scanner scanner = new Scanner(System.in);
    // 메뉴 아이템을 관리하는 필드
    List<MenuItem> menuList;

    Kiosk(List<MenuItem> menuList) {
        this.menuList = menuList;
    }

    // 반복문 로직
    public void start(){
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
