package jianzaozhe;

import java.awt.*;

public class ShouZi extends PersonBuilder {

    public ShouZi(Graphics g) {
        super(g);
    }

    public void buildArmLeft()
    {
        g.drawLine(60, 80, 40, 130);// 左手
    }

    public void buildArmRight()
    {
        g.drawLine(70, 80, 90, 130);// 右手
    }

    public void buildBody()
    {
        g.fillRect(60, 80, 10, 50);// 身体
    }

    public void buildHead()
    {
        g.fillOval(50, 50, 30, 30);// 头
    }

    public void buildLegLeft()
    {
        g.drawLine(60, 130, 45, 180);// 左腿
    }

    public void buildLegRight()
    {
        g.drawLine(70, 130, 85, 180);// 右腿
    }
}
