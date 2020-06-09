package guanchazhe;

public class khd {
    public static void main(String[] args) {
        xueshengState a = new xueshengState();
        a.attach(new SjGuanchazhe("老师",a));
        System.out.println("警报警报");
        a.setXueshengState("出现在后门");
        a.announce();
        a.setXueshengState("出现在大门口");
        a.announce();
        System.out.println("危险解除");
    }
}
