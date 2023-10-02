import java.util.ArrayList;

public class Ex10 extends E10 {
    public ArrayList<String > choices;


    Ex10(String text) {
        super(text);
       choices = new ArrayList<>();
    }

    public void addChoice(String choice) {
        choices.add(choice);
    }


    public void display() {
        super.dis();
        for (int i = 0; i < choices.size(); i++) {
            int choiceNumber = i + 1;
            System.out.println(choiceNumber + ": " + choices.get(i));
        }
    }
}
