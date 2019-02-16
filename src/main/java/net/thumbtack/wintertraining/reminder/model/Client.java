package net.thumbtack.wintertraining.reminder.model;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Client extends CommonUser {
    private String email;
    private Date dateRegistration;
    private List<Reminder> reminderList;
    private UserSetting userSetting;
    private List<Schedule> scheduleList;
    private List<Label> labelList;

    public Client(){}

    public Client(int id) {
        super(id);

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateRegistration() {
        return dateRegistration;
    }

    public void setDateRegistration(Date dateRegistration) {
        this.dateRegistration = dateRegistration;
    }

    public List<Reminder> getReminderList() {
        return reminderList;
    }

    public void setReminderList(List<Reminder> reminderList) {
        this.reminderList = reminderList;
    }

    public UserSetting getUserSetting() {
        return userSetting;
    }

    public void setUserSetting(UserSetting userSetting) {
        this.userSetting = userSetting;
    }

    public List<Schedule> getScheduleList() {
        return scheduleList;
    }

    public void setScheduleList(List<Schedule> scheduleList) {
        this.scheduleList = scheduleList;
    }

    public List<Label> getLabelList() {
        return labelList;
    }

    public void setLabelList(List<Label> labelList) {
        this.labelList = labelList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client)) return false;
        if (!super.equals(o)) return false;
        Client client = (Client) o;
        return Objects.equals(getEmail(), client.getEmail()) &&
                Objects.equals(getDateRegistration(), client.getDateRegistration()) &&
                Objects.equals(getReminderList(), client.getReminderList()) &&
                Objects.equals(getUserSetting(), client.getUserSetting()) &&
                Objects.equals(getScheduleList(), client.getScheduleList()) &&
                Objects.equals(getLabelList(), client.getLabelList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getEmail(), getDateRegistration(), getReminderList(), getUserSetting(), getScheduleList(), getLabelList());
    }

    @Override
    public String toString() {
        return "Client{" +
                "email='" + email + '\'' +
                ", dateRegistration=" + dateRegistration +
                ", reminderList=" + reminderList +
                ", userSetting=" + userSetting +
                ", scheduleList=" + scheduleList +
                ", labelList=" + labelList +
                '}';
    }
}
