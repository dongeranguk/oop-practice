package org.example;

public class User {
    private String name;
    private String password;

    public String getPassword() {
        return password;
    }

    public void initPassword(PasswordGenerator passwordGenerator) {
        String password = passwordGenerator.generatePassword();

        /**
         * 패스워드는 최소 8자 이상 12자이하여야 한다.
         */

        int length = password.length();
        if(length >= 8 && length <= 12) {
            this.password = password;
        }
    }
}
