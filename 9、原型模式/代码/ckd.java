package jr;

public class ckd {
    public static void main(String[] args) {
        Resume a = new  Resume("小明");
        a.setPersonalInfo("18","男");
        a.setWorkExperience("3年","腾讯");
        Resume b = a.clone("小红");
        b.setWorkExperience("2年半","阿里");
        Resume c = a.clone("小李");
        c.setPersonalInfo("25","女");
        a.display();
        b.display();
        c.display();
    }
}
