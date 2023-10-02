public class E12s extends E12p {
    String major;
    E12s(String x,int y,String M)
    {
        super(x,y);
        major=M;

    }
    public void diss()
    {
        super.disp();
        System.out.println("Major=="+major);
    }
}
