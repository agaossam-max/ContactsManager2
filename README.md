Projet Java de gestion de contacts.

 Il y a 3 parties :

* Contact.java : représente un seul contact (nom + numéro)
* ContactsManager.java : gère tous les contacts
* Main.java : permet de tester le programme
  
Explication

Contact.java
Ici on crée un contact.
Un contact a :

* un nom
* un numéro de téléphone
Le mot private veut dire que tu ne peux pas modifier directement ces informations. Tu dois passer par des méthodes.

Quand tu écris new Contact(), ça crée un nouveau contact vide.

Pour lire les infos, tu utilises :
* getName()
* getPhoneNumber()
  
Pour modifier les infos, tu utilises :
* setName()
* setPhoneNumber()
Le mot this sert juste à dire qu’on parle de la variable du contact.

ContactsManager.java

Ici on gère tous les contacts.
On a un tableau qui peut contenir 100 contacts. On a aussi une variable count qui compte combien de contacts ont été ajoutés.
Au début, count = 0.

Quand tu ajoutes un contact :
* il est placé dans le tableau
* count augmente de 1
  
Quand tu cherches un contact :
* le programme regarde les contacts un par un
* il compare les noms
La méthode equalsIgnoreCase permet de comparer sans tenir compte des majuscules.
Si le contact est trouvé → il est retourné Sinon → ça retourne null (ça veut dire rien trouvé)

Main.java
C’est ici qu’on utilise le programme.
On crée un gestionnaire de contacts.
Ensuite on crée des contacts, on leur donne un nom et un numéro, puis on les ajoute.
Après ça, on cherche un contact (par exemple "Awa").
Si le contact existe :

* on affiche son nom et son numéro
Sinon on affiche le message Contact non trouvé.

 pour exécuter:
1. Cloner le projet depuis GitHub
2. Ouvrir le projet dans IntelliJ IDEA
3. Configurer le JDK 24
4. Lancer Main.java

