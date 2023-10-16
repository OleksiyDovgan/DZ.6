package oleksiy;

public class Main {
    public static void main(String[] args) {

        Phonebook phonebook = new Phonebook();

        phonebook.add(new Record("Lucie", "12373736"));
        phonebook.add(new Record("Luca", "3421123423"));
        phonebook.add(new Record("Rozen", "563443455"));
        phonebook.add(new Record("Valtor", "344122333"));

        Record lucie = phonebook.find("Lucie");

        System.out.println(lucie.getPhoneNumber());
    }
}