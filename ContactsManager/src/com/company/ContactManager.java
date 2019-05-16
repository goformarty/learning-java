package com.company;

public class ContactManager {
    Contact [] myFriends;
    int friendsCount;

    public ContactManager() {
        this.friendsCount  = 0;
        this.myFriends =  new Contact[500];
    }

    void addContact(Contact contact) {
        myFriends[friendsCount] = contact;
        friendsCount++;
    }
}
