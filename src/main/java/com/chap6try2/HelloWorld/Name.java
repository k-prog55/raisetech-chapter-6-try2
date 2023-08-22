package com.chap6try2.HelloWorld;

public class Name {
    private String GivenName;
    private String FirstName;

    public Name(String givenName, String firstName) {
        GivenName = givenName;
        FirstName = firstName;
    }

    public String getGivenName() {
        return GivenName;
    }

    public void setGivenName(String givenName) {
        GivenName = givenName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }
}
