public class Main {
    public static void main(String[] args) {

        ContactsManager myContactsManager = new ContactsManager();
        Contact c1 = new Contact();
        c1.setName("Koffi");
        c1.setPhoneNumber("+225 07 01 02 03 04");
        myContactsManager.addContact(c1);
        Contact c2 = new Contact();
        c2.setName("Awa");
        c2.setPhoneNumber("+225 05 55 66 77 88");
        myContactsManager.addContact(c2);

        Contact c3 = new Contact();
        c3.setName("Mamadou");
        c3.setPhoneNumber("+225 01 22 33 44 55");
        myContactsManager.addContact(c3);

        Contact c4 = new Contact();
        c4.setName("Ossam");
        c4.setPhoneNumber("+225 07 88 99 00 11");
        myContactsManager.addContact(c4);

        Contact c5 = new Contact();
        c5.setName("david");
        c5.setPhoneNumber("+225 05 44 33 22 11");
        myContactsManager.addContact(c5);
        System.out.println("\n--- Recherche ---");
        Contact found = myContactsManager.searchContact("Awa");
        if (found != null) {
            System.out.println("Numéro de " + found.getName() + " : " + found.getPhoneNumber());
        } else {
            System.out.println("Contact non trouvé.");
        }
    }
}