public class ContactsManager {
    private Contact[] contacts;
    private int count;
    public ContactsManager() {
        contacts = new Contact[100];
        count = 0;
    }
    public void addContact(Contact contact) {
        contacts[count] = contact;
        count++;
        System.out.println("Contact ajouté : " + contact.getName());
    }
    public Contact searchContact(String name) {
        for (int i = 0; i < count; i++) {
            if (contacts[i].getName().equalsIgnoreCase(name)) {
                return contacts[i];
            }
        }
        return null;
    }
}