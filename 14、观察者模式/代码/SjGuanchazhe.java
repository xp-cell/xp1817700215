package guanchazhe;

public class SjGuanchazhe extends Xuesheng{
    private String			name;
    private String			sjguanchazheState;
    private xueshengState xuesheng;
    public SjGuanchazhe(String name, xueshengState xuesheng)
    {
        this.name = name;
        this.xuesheng = xuesheng;
    }
    @Override
    public void update() {
        sjguanchazheState= xuesheng.getxueshengState();
        System.out.println( name + "的新状态是" + sjguanchazheState);
    }

    public xueshengState getXuesheng()
    {
        return xuesheng;
    }

    public void setXuesheng(xueshengState xuesheng)
    {
        this.xuesheng = xuesheng;
    }

}
