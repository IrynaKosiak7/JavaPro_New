package de.telran.lesson0228.ClassWork;

public enum Coffee {
    CAPPUCCINO (2.2, "спрессо со вспененным молоком, 150–180 мл."),
    LATTE(1.8, "В 240 мл стакан добавляют шот эспрессо, который заливают молоком с молочной пенкой. Толщина пенки 12мм. "),
    AMERICANO(1.3, "эспрессо обычный или двойной, в который после приготовления добавили (30–470 мл) горячей воды."),
    ESPRESSO(1.1, "большее количество кофеина."),
    MACCHIATO(2.9, "шот эспрессо с небольшой дозой вспененного молока. Пенка буквально на мизинец покрывает поверхность кофе.");
    private double price;
    private String message;
    Coffee(double price, String message) {
        this.price = price;
        this.message = message;
    }
    @Override
    public String toString() {
        return "Coffee{" + this.name() +
                " price=" + price +" euro" +
                ", message='" + message + '\'' +
                '}';
    }
    public double getPrice() {
        return price;
    }
    public String getMessage() {
        return message;
    }
}
