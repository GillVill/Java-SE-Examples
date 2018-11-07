package com.sametdemirel.hesapmakinesi;

public class GecersizIfadeException extends Exception {

    public GecersizIfadeException(String sebep, String ifade) {
        super(sebep + ": " + ifade);
    }

    public GecersizIfadeException(String sebep, String ifade, Throwable cause) {
        super(sebep + ": " + ifade, cause);
    }
}
