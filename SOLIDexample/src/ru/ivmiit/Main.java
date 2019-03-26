package ru.ivmiit;

import ru.ivmiit.models.User;
import ru.ivmiit.tools.hashers.MD5;
import ru.ivmiit.tools.hashers.SHA256;

public class Main {

    public static void main(String[] args) {
	// write your code here
        User user = new User("Anton", "Tikhoniv", "VMK", "123456");
        MD5 md5 = new MD5();
        user.setHashPasswod("qwerty", md5);
        System.out.println(user.getHashPasswod());
    }
}
