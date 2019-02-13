package net.thumbtack.wintertraining.reminder.model;

import java.util.Objects;

public class UserSetting {
    private int id;
    private int timezone;
    private int reminder_timelife;
    private Units units;

    public UserSetting(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTimezone() {
        return timezone;
    }

    public void setTimezone(int timezone) {
        this.timezone = timezone;
    }

    public int getReminder_timelife() {
        return reminder_timelife;
    }

    public void setReminder_timelife(int reminder_timelife) {
        this.reminder_timelife = reminder_timelife;
    }

    public Units getUnits() {
        return units;
    }

    public void setUnits(Units units) {
        this.units = units;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserSetting)) return false;
        UserSetting that = (UserSetting) o;
        return getId() == that.getId() &&
                getTimezone() == that.getTimezone() &&
                getReminder_timelife() == that.getReminder_timelife() &&
                getUnits() == that.getUnits();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTimezone(), getReminder_timelife(), getUnits());
    }

    @Override
    public String toString() {
        return "UserSetting{" +
                "id=" + id +
                ", timezone=" + timezone +
                ", reminder_timelife=" + reminder_timelife +
                ", units=" + units +
                '}';
    }
}
