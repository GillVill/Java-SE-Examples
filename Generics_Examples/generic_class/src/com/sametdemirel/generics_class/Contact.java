package com.sametdemirel.generics_class;

public class Contact {
    String salutation;
    String fNAME;
    String lName;
    String phoneNumber;

    Contact(String salutation, String fNAME, String lName, String phoneNumber){
        this.salutation = salutation;
        this.fNAME = fNAME;
        this.lName = lName;
        this.phoneNumber = phoneNumber;
    }

    public void setSalutation(String salutation){
        this.salutation = salutation;
    }

    public String getSalutation(){
        return salutation;
    }

    public void setfNAME(String fNAME) {
        this.fNAME = fNAME;
    }

    public String getfNAME() {
        return fNAME;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "salutation='" + salutation + '\'' +
                ", fNAME='" + fNAME + '\'' +
                ", lName='" + lName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
