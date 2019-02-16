package net.thumbtack.wintertraining.reminder.model;

import java.util.Objects;

public class TimeUnits {
    private long id;
    private String name;

    public TimeUnits(){}

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
        if (!(o instanceof TimeUnits)) return false;
        TimeUnits timeUnits = (TimeUnits) o;
        return getId() == timeUnits.getId() &&
                Objects.equals(getName(), timeUnits.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName());
    }

    @Override
    public String toString() {
        return "TimeUnits{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
