import java.util.Scanner;
public class NameAdress {
    public static void main(String[] args) {
        Scanner perData = new Scanner (System.in);
        String name, address;
        System.out.println("What is your name?");
        name = perData.nextLine();
        System.out.println("Where are you live, " + name + "?");
        address = perData.nextLine();
        System.out.println(name + " lives in " + address);
    }
}
