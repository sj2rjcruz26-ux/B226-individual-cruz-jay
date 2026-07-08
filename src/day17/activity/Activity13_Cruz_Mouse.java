package day17.activity;

class Mouse {

    // Attributes (Fields)
    String brand;
    String color;
    String connectionType;
    int dpi;

    // Methods (Behaviors)
    void click() {
        System.out.println(brand + " mouse is clicking.");
    }

    void scroll() {
        System.out.println(brand + " mouse is scrolling.");
    }

    void drag() {
        System.out.println(brand + " mouse is dragging an item.");
    }

    void displayInfo() {
        System.out.println("Brand           : " + brand);
        System.out.println("Color           : " + color);
        System.out.println("Connection Type : " + connectionType);
        System.out.println("DPI             : " + dpi);
        System.out.println();
    }
}

