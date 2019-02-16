package net.thumbtack.wintertraining.reminder.model;

import java.security.PrivateKey;
import java.util.Objects;

public class Admin extends CommonUser {
    private String level;

    public Admin(){}

    public Admin(String level) {
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Admin)) return false;
        if (!super.equals(o)) return false;
        Admin admin = (Admin) o;
        return Objects.equals(getLevel(), admin.getLevel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getLevel());
    }

    @Override
    public String toString() {
        return "Admin{" +
                "level='" + level + '\'' +
                '}';
    }
}
