package day17.activity;

public class Activity13_Cruz_Main {

    public static void main(String[] args) {

        // Object 1
        Mouse mouse1 = new Mouse();
        mouse1.brand = "Logitech";
        mouse1.color = "Black";
        mouse1.connectionType = "Wireless";
        mouse1.dpi = 1600;

        // Object 2
        Mouse mouse2 = new Mouse();
        mouse2.brand = "Razer";
        mouse2.color = "White";
        mouse2.connectionType = "Wired";
        mouse2.dpi = 2000;

        // Object 3
        Mouse mouse3 = new Mouse();
        mouse3.brand = "A4Tech";
        mouse3.color = "Gray";
        mouse3.connectionType = "Wireless";
        mouse3.dpi = 1200;

        // Mouse 1
        System.out.println("===== Mouse 1 =====");
        mouse1.displayInfo();
        mouse1.click();
        mouse1.scroll();
        mouse1.drag();

        System.out.println();

        // Mouse 2
        System.out.println("===== Mouse 2 =====");
        mouse2.displayInfo();
        mouse2.click();
        mouse2.scroll();
        mouse2.drag();

        System.out.println();

        // Mouse 3
        System.out.println("===== Mouse 3 =====");
        mouse3.displayInfo();
        mouse3.click();
        mouse3.scroll();
        mouse3.drag();
    }
}
