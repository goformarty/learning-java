package com.company;

public class Main {

    public static void main(String[] args) {
       Contact friend1 = new Contact("Marty", "marty@marty.com", "0123456789");
       ContactManager myContactsManager = new ContactManager();
       myContactsManager.addContact(friend1);
       System.out.println(myContactsManager[0]);
    }
}
