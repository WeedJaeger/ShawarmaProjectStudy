package com.oop_inheritance;

public class Theory {
    public static void main(String[] args) {
        LoginPage loginPage = new LoginPage("http://google.com");
        OrdersPage ordersPage = new OrdersPage("http://google.com");

        System.out.println(loginPage.readySelector());
        System.out.println(ordersPage.readySelector());

        loginPage.open();
        loginPage.waitLoaded();
        loginPage.enterCredentinals("test@test.com", "12345678");

        ordersPage.waitLoaded();
        Plane plane = new Plane();
        plane.startFly("Победа", 1000);
    }
    public void work(){

    }
}
