package org.sparta.kioskpj;

public interface ShoppingCart {
    void addMenu(MenuItem menuItem); // 사용자가 선택한 메뉴를 장바구니에 추가할 수 있는 기능
    String checkMenu(); // 장바구니에 추가된 항목 조회
    void printCart(); // 장바구니에 담긴 모든 메뉴와 총 금액 출력
    boolean checkCart(); // 장바구니가 비어있는지 확인
}
