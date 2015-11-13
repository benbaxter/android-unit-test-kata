package com.benjamingbaxter.android.unittest.kata.validation;

import com.benjamingbaxter.android.unittest.kata.R;

public class PasswordValidator implements FieldValidator {

    @Override
    public int validate(String password) {
        return R.string.success;
    }
}
