public class AuthApp {
    public static void main(String[] args){

        String inputId = args[0];
        String id = "Elijah";

        System.out.println("buongiorno");

        if(inputId.equals(id)){
            System.out.println("Master!");
        } else {
            System.out.println("chi sei?");
        }
    }
}
