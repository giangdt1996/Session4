import java.util.Scanner;

public class Demkitu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "Pham Van Giang";
        char a = scanner.next().charAt(0);
        int dem = 0;
        for (char i = 0; i < str.length(); i++) {
            if(a == str.charAt(i)) {
                dem++;
            }
        }
        System.out.println(dem);
    }
}
