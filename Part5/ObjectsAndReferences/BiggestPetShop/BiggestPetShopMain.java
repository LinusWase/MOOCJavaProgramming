import java.util.Scanner;

public class BiggestPetShopMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Pet lucy = new Pet("Lucy", "golden retriever");
        PetPerson leo = new PetPerson("Leo", lucy);

        System.out.println(leo);
    }
}
