import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        //int[] odds = {1, 3, 5, 7, 9};//
        String[] weeks = new String[] {"m", "t", "w", "t", "f", "s", "SUN"};
        for (int i=0; i<weeks.length; i++) {
            System.out.println(weeks[i]);
        }

        ArrayList<String> pocket = new ArrayList<String>();
        pocket.add("paper");
        pocket.add("handphone");
        pocket.add("money");
        if (pocket.contains("money")) {
            System.out.println("Taxi");
        } else {
            System.out.println("walk bitch");
        }

        int Money = 2000;
        boolean hasCard = true;

        if (Money>=3000 || hasCard) {
            System.out.println("GET THE TAXI");
        } else {
            System.out.println("walking");
        }
    }
}
