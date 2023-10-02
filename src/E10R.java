public class E10R {
    public static void main(String[] args) {


        Ex10 x = new Ex10("What is the capital of France?");
        //x.add("Multiple choice");
        x.addChoice("paris");
        x.addChoice("berlin");
        x.addChoice("Tusar");
        x.addChoice("madrid");

        x.display();
    }
}