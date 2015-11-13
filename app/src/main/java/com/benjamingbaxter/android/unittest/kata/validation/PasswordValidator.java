package com.benjamingbaxter.android.unittest.kata.validation;

import android.text.TextUtils;

import com.benjamingbaxter.android.unittest.kata.R;

public class PasswordValidator implements FieldValidator {

    @Override
    public int validate(String password) {
        if(TextUtils.isEmpty(password)) {
            return R.string.error_field_required;
        }

        return R.string.success;
    }

    @Override
    public boolean isValid(String password) {
        return validate(password) == R.string.success;
    }
}
