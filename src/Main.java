public class Main {
    public static void main(String[] args) {
Box <String,Integer>box= new Box<>("test",12 , "Blye");
        System.out.println((Box) Box.genericMethod(box));
    }
}