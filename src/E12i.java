public class E12i extends E12p {
    int salary;
    E12i(String n,int y,int s)
    {
        super(n,y);
        salary=s;
    }
    public void disi()
    {
        super.disp();
        System.out.println("salary=="+salary);
    }

}
