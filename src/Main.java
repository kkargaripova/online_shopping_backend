public class Main {
    public static void main(String[] args) {
        Product product1 = new Product();

        Product product11 = new Product("abcd", "Title", 155);
        System.out.println(product11.getID() + " " + product11.gettitle() + " " + product11.getprice());
    }
}
//2 объекта из класса и выводим на экран