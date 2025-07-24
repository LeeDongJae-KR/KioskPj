package org.sparta.kioskpj.Lv6;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Getter
public class ShopingCartimpl implements ShoppingCart {

    // 장바구니 관리하는 리스트 필드
    List<MenuItem> cartMenuList = new ArrayList<>();
    // 리스트 순차 검색
    Iterator<MenuItem> cartMenuCheck;
    int totalPrice;

    // 장바구니에 메뉴 추가하는 메서드
    @Override
    public void addMenu(MenuItem menuItem) {
        this.cartMenuList.add(menuItem);
        this.totalPrice += menuItem.getPrice();

    }

    // 장바구니에 정상적으로 추가 되었는지 확인하는 메서드
    @Override
    public String checkMenu() {
        String name = "";
        cartMenuCheck = cartMenuList.iterator();
        while (cartMenuCheck.hasNext()) {
            MenuItem menuItem = cartMenuCheck.next();
            name = menuItem.getName();
        }
        return name;
    }

    // 장바구니에 추가된 모든 메서드 출력
    @Override
    public void printCart() {
        cartMenuCheck = cartMenuList.iterator();
        while (cartMenuCheck.hasNext()) {
            MenuItem menuItem = cartMenuCheck.next();
            System.out.println(menuItem);
        }
    }

    // 장바구니가 비어있는지 확인
    @Override
    public boolean checkCart() {
        cartMenuCheck = cartMenuList.iterator();
        return cartMenuCheck.hasNext();
    }
}
