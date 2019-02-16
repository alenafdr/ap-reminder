package net.thumbtack.wintertraining.reminder.model;

import java.util.Objects;

public class CommonUser {
    private int id;
    private String firstName;
    private String lastName;
    private String patronymic;
    private String login;
    private String password;

    public CommonUser(){}

    public CommonUser(int id){
        this.id= id;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CommonUser)) return false;
        CommonUser commonUser = (CommonUser) o;
        return getId() == commonUser.getId() &&
                Objects.equals(getFirstName(), commonUser.getFirstName()) &&
                Objects.equals(getLastName(), commonUser.getLastName()) &&
                Objects.equals(getPatronymic(), commonUser.getPatronymic()) &&
                Objects.equals(getLogin(), commonUser.getLogin()) &&
                Objects.equals(getPassword(), commonUser.getPassword());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFirstName(), getLastName(), getPatronymic(), getLogin(), getPassword());
    }

    @Override
    public String toString() {
        return "CommonUser{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
