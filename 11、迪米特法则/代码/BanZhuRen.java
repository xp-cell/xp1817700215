package jr;

public class BanZhuRen {
    private String name;
    public BanZhuRen(String name) {
        this.name = name;
    }
    public XueSheng getXuesheng(String name) {
        return new XueSheng(name);
    }
}
