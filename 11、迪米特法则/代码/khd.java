package jr;

public class khd {
    public static void main(String[] args) {
        System.out.println("大扫除");
        XiaoZhang xiaoZhang = new XiaoZhang("校长");
        BanZhuRen banZhuRen =xiaoZhang.getBanZhuRen("班主任");
        XueSheng xueSheng = banZhuRen.getXuesheng("学生");
        xueSheng.work();
    }
}
