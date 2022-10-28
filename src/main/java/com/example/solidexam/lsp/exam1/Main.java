package com.example.solidexam.lsp.exam1;

/**
 * 리스코프치환 원칙 위배
 */
public class Main {
    public static void main(String[] args) {

        // 직사각형
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setHeight(5);

        System.out.println(rectangle.getArea());

        // 정사각형
        rectangle = new Square();
        rectangle.setWidth(10);
        rectangle.setHeight(5);

        System.out.println(rectangle.getArea());

    }
}
