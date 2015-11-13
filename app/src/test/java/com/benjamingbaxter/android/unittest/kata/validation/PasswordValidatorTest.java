package com.benjamingbaxter.android.unittest.kata.validation;

import com.benjamingbaxter.android.unittest.kata.R;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class PasswordValidatorTest {

    FieldValidator validator;

    @Before
    public void setup() {
        validator = new PasswordValidator();
    }

    @Test
    public void validPassword() {
        int statusMessageResId = validator.validate("password1");
        assertThat(statusMessageResId, is(equalTo(R.string.success)));
    }

    @Test
    public void isValidPassword() {
        assertThat(validator.isValid("password"), is(true));
    }
}
