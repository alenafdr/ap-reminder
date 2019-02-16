package net.thumbtack.wintertraining.reminder.model;

import java.util.Objects;

public class ReminderList {
    private long id;
    private String name;

    public ReminderList(){}

    public ReminderList(String job){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ReminderList)) return false;
        ReminderList that = (ReminderList) o;
        return getId() == that.getId() &&
                Objects.equals(getName(), that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName());
    }

    @Override
    public String toString() {
        return "ReminderList{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
