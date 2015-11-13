package com.benjamingbaxter.android.unittest.kata;

public class PasswordValidator implements FieldValidator {

    @Override
    public int validate(String password) {
        return R.string.success;
    }
}
