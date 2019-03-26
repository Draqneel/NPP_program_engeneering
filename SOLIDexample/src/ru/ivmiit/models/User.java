package ru.ivmiit.models;

import ru.ivmiit.interfaces.HashClass;
import ru.ivmiit.tools.hashers.MD5;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class User {
    private String name;
    private String surname;
    private String login;
    private String hashPasswod;

    public User(String name, String surname, String login, String hashPassword) {
        this.name = name;
        this.surname = surname;
        this.login = login;
        this.hashPasswod = hashPassword;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getHashPasswod() {
        return hashPasswod;
    }

    public void setHashPasswod(String passwod, HashClass object) {
        this.hashPasswod = object.getHash(passwod);
    }
}
