public class Main {
    public static void main(String[] args) {
        ClassesFan fan1 = new ClassesFan();
        System.out.println("Quạt 1 khi ở trạng thái mặc định: ");
        System.out.println(fan1.toString());
        fan1.setOn(true);
        fan1.setSpeed(ClassesFan.FAST);
        fan1.setColor("Yellow");
        fan1.setRadius(10);
        System.out.println("Quạt 1 sau khi thay đổi trạng thái: ");
        System.out.println(fan1.toString());

        ClassesFan fan2 = new ClassesFan();
        System.out.println("Quạt 2 có trạng thái: ");
        fan2.setOn(false);
        fan2.setSpeed(ClassesFan.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("Blue");
        System.out.println(fan2.toString());
    }
}
