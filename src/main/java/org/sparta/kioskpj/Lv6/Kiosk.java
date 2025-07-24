package org.sparta.kioskpj.Lv6;

import java.util.List;
import java.util.Scanner;

public class Kiosk {
    //캡슐화 적용
    private List<Menu> menuCategoryList;

    Kiosk(List<Menu> menuCategryList) {
        this.menuCategoryList = menuCategryList;
    }

    // 반복문 로직
    public void start() throws IndexOutOfBoundsException {
        // Scanner 선언
        Scanner scanner = new Scanner(System.in);
        ShopingCartimpl shopingCartimpl = new ShopingCartimpl();
        //입력 값에 따른 출력
        while (true) {
            // checkCart() 메서드를 통해 orders 출력 조절
            int printSize = shopingCartimpl.checkCart() ? menuCategoryList.size() : menuCategoryList.size() - 1;

            // List와 Menu 클래스 활용하여 상위 카테고리 메뉴 출력
            System.out.println(" [ MAIN MENU ] ");
            for (int i = 0; i < printSize; i++) {
                System.out.println((i + 1) + ". " + menuCategoryList.get(i).getCategory());
            }
            System.out.println("0. 종료");

            // 숫자 입력 받기
            System.out.print("번호를 선택해 주세요 : ");
            int selectCategoryNum = scanner.nextInt();

            // orders 메뉴 미출력시 다른 값 입려하면 예외처리
            if (printSize < selectCategoryNum) {
                System.out.println("올바른 번호를 입력하세요.");
                continue;
            } else {
                // 입력 받은 숫자에 해당하는 MenuItem 출력
                if (selectCategoryNum == 0) {
                    System.out.println("주문이 종료 되었습니다.");
                    break;
                } else {
                    System.out.println("[ " + menuCategoryList.get(selectCategoryNum - 1).getCategory() + " Menu ]");
                    menuCategoryList.get(selectCategoryNum - 1).printMenuItem();
                }
            }

            // 숫자 입력 받기
            System.out.print("번호를 선택해 주세요 : ");
            int selectMenuNum = scanner.nextInt();

            if (selectMenuNum > menuCategoryList.get(selectCategoryNum - 1).getMenuList().size()) {
                System.out.println("올바른 번호를 선택하세요.");
                continue;
            }

            if (selectCategoryNum < printSize) {
                // 입력 받은 숫자에 해당하는 메뉴 출력
                if (selectMenuNum != 0) {
                    System.out.println("선택한 메뉴 : " + menuCategoryList.get(selectCategoryNum - 1).getMenuList().get(selectMenuNum - 1));
                    System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");

                    int orderNum = 0;
                    while (true) {
                        System.out.println("1. 확인        2. 취소");
                        orderNum = scanner.nextInt();
                        if (orderNum == 1 || orderNum == 2) {
                            break;
                        }else System.out.println("올바른 숫자를 입력해 주세요.");
                    }

                    if (orderNum == 1) {
                        // 장바구니에 담기 및 금액 합산
                        shopingCartimpl.addMenu(menuCategoryList.get(selectCategoryNum - 1).getMenuList().get(selectMenuNum - 1));
                        // 장바두니에 담은 메뉴 이름만 출력
                        System.out.println(shopingCartimpl.checkMenu());
                        System.out.println(" 이 장바구니에 추가되었습니다.");
                    } else {
                        System.out.println("메뉴 담기를 취소 했습니다.");
                    }
                }
            } else if (selectMenuNum == 1) {
                System.out.println("아래와 같이 주문 하시겠습니까?");
                shopingCartimpl.printCart();

                System.out.println("[ Total ]");
                System.out.println("₩ " + shopingCartimpl.getTotalPrice());

                System.out.println("1. 주문      2. 메뉴판");
                int selectOrderNum = scanner.nextInt();
                if (selectOrderNum == 1) {
                    System.out.println("주문이 완료 되었습니다. 금액은 ₩ " + shopingCartimpl.getTotalPrice() + " 입니다.");
                    break;
                }
            }
        }
        scanner.close();
    }
}

