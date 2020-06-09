package jr;
public class XiaoZhang {
    public String name;
    public XiaoZhang(String name) {
        System.out.println(name+"把任务分给老师");
        this.name = name;
    }
    public BanZhuRen getBanZhuRen(String name) {
        System.out.println(name+"把任务分给学生");
        return new BanZhuRen(name);
    }

}
