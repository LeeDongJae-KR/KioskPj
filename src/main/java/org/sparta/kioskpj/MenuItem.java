package org.sparta.kioskpj;

public class MenuItem {
    //캡슐화 적용
    private String name;
    private Double price;
    private String description;

    public MenuItem(String name, Double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    // MenuItem의 필드 값을 정상적으로 보여주기 위해 toString 오버라이딩
    @Override
    public String toString() {
        return name + "   | " + "W " + price + "   | " + description;
    }
}
