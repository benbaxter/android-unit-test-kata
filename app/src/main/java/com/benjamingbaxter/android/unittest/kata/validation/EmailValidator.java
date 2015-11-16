package com.benjamingbaxter.android.unittest.kata.validation;

import android.text.TextUtils;

import com.benjamingbaxter.android.unittest.kata.R;

public class EmailValidator implements FieldValidator {

    @Override
    public int validate(String email) {
        if(TextUtils.isEmpty(email)) {
            return R.string.error_field_required;
        }

        if( ! email.contains("@") ) {
            return R.string.error_invalid_email;
        }

        return R.string.success;
    }

    @Override
    public boolean isValid(String password) {
        return validate(password) == R.string.success;
    }

}
