package com.benjamingbaxter.android.unittest.kata.validation;

import android.text.TextUtils;

import com.benjamingbaxter.android.unittest.kata.R;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

@RunWith(PowerMockRunner.class)
@PrepareForTest({TextUtils.class})
public class EmailValidatorTest {

    FieldValidator validator;

    @Before
    public void setup() {
        mockStatic(TextUtils.class);

        validator = new EmailValidator();
    }

    @Test
    public void validEmail() {
        int statusMessageResId = validator.validate("email@email.com");
        assertThat(statusMessageResId, is(equalTo(R.string.success)));
    }

    @Test
    public void invalidEmail() {
        int statusMessageResId = validator.validate("email");
        assertThat(statusMessageResId, is(equalTo(R.string.error_invalid_email)));
    }

    @Test
    public void nullEmail() {
        when(TextUtils.isEmpty(anyString())).thenReturn(true);

        int status = validator.validate(null);
        assertThat(status, is(equalTo(R.string.error_field_required)));
    }

    @Test
    public void emptyEmail() {
        when(TextUtils.isEmpty(anyString())).thenReturn(true);

        int status = validator.validate("");
        assertThat(status, is(equalTo(R.string.error_field_required)));
    }

    @Test
    public void isValidEmail() {
        assertThat(validator.isValid("email@email.com"), is(true));
    }
}
