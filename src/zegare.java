import java.util.Scanner;

class Hello {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("jestem kotkiem Filemonem");
        String firstName = scan.nextLine();

        System.out.println("Witaj " + firstName);
    }
}