/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermreviewcodeforpartc;

/**
 *
 * @author miste
 */
public class PasswordValidator {
    private static final int min_length = 8;
    private static final String special_chars = "!@#$%^&*()_+";
    
    public static boolean validate(String password) {
        if (password.length() < min_length) return false;
        for (char c : password.toCharArray()) {
            if (special_chars.indexOf(c) != -1) return true;
        }
        return false;
    }
}
