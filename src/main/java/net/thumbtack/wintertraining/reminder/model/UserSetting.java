package net.thumbtack.wintertraining.reminder.model;

import java.util.Objects;

public class UserSetting {
    private long id;
    private int timezone;
    private int reminder_timelife;
    private TimeUnits units;

    public UserSetting(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public TimeUnits getUnits() {
        return units;
    }

    public void setUnits(TimeUnits units) {
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
                Objects.equals(getUnits(), that.getUnits());
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
