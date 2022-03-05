package com.common.validator;

/**
 * @Authoer Dharmesh
 * @Date 24-02-2022
 * <p>
 * Information
 **/
public class PasswordValidator {

    private String password;

    public PasswordValidator(String password) {
        this.password = password;
    }

    public boolean isPasswordEmpty() {
        return (password == null || password.isEmpty());
    }

    public boolean isPasswordInValid() {
        return !(password.length() < 6);
    }
}
