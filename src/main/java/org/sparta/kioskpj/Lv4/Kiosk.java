package org.sparta.kioskpj.Lv4;

import java.util.List;
import java.util.Scanner;

public class Kiosk {

    int selectNum;
    List<Menu> menuCategryList;

    Kiosk(List<Menu> menuCategryList) {
        this.menuCategryList = menuCategryList;
    }

    // 반복문 로직
    public void start() {
        // Scanner 선언
        Scanner scanner = new Scanner(System.in);
        //입력 값에 따른 출력
        while (true) {
            // List와 Menu 클래스 활용하여 상위 카테고리 메뉴 출력
            System.out.println(" [ MAIN MENU ] ");
            for (int i = 0; i < menuCategryList.size(); i++) {
                System.out.println((i + 1) + ". " + menuCategryList.get(i).category);
            }
            System.out.println("0. 종료");

            // 숫자 입력 받기
            System.out.print("번호를 선택해 주세요 : ");
            selectNum = scanner.nextInt();

            // 입력 빋은 숫자에 해당하는 MenuItem 출력
            if (selectNum == 0) {
                System.out.println("주문이 종료 되었습니다.");
                break;
            } else {
                menuCategryList.get(selectNum - 1).printMenuItem();
            }

            // 숫자 입력 받기
            System.out.print("번호를 선택해 주세요 : ");
            selectNum = scanner.nextInt();

            // 입력 받은 숫자에 해당하는 메뉴 출력
            if (selectNum == 0) {
            } else {
                System.out.println("선택한 메뉴 : " + menuCategryList.get(selectNum - 1).returnMenuList().get(selectNum - 1));
            }
        }
        scanner.close();
    }
}
