import java.util.ArrayList;

public class E11e extends E11 {
    public ArrayList<String >choice;

    E11e(String x,String y)
    {
        super(x,y);
        choice=new ArrayList<>();
    }
    public void add(String x)
    {
        choice.add(x);
    }
    public void display()
    {
        super.dis();
        for(int i=0;i<choice.size();i++)
        {
            System.out.println(i+1+" : "+choice.get(i));
        }
    }


}
