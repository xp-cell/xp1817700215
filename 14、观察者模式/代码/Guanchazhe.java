package guanchazhe;

import java.util.ArrayList;
import java.util.List;

public abstract class Guanchazhe {
    private List<Xuesheng> xueshengs	= new ArrayList<Xuesheng>();

    public void attach(Xuesheng xuesheng)
    {
        xueshengs.add(xuesheng);
    }

    public void detach(Xuesheng xuesheng)
    {
        xueshengs.remove(xuesheng);
    }

    public void announce()
    {
        for (Xuesheng obj : xueshengs)
        {
            obj.update();
        }
    }
}
