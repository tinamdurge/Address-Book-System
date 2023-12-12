import java.util.ArrayList;
import java.util.stream.Stream;

public class Uc7 {

    // To check adding new contact is already exist in addressBook
    public static boolean check(Contacts contacts, ArrayList<Contacts> contatctsArrayList) {

        boolean Exists = Stream.of(contacts).anyMatch(e -> contatctsArrayList.contains(e));
        return Exists;
    }
}
