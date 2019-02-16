package net.thumbtack.wintertraining.reminder.model;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Reminder {
    private int id;
    private String name;
    private Date dateCreate;
    private Date dateFinish;
    private Date dateStart;
    private int priority;
    private int repeat;
    private Units timeUnits;
    private List<Note> noteList;
    private Status status;
    private List<File> fileList;
    private List<Label> labelList;
    private Schedule listName;
    private Client owner;
    private Client executor;

    public Reminder(){}

    public int getId() {
        return id;
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

    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

    public Date getDateFinish() {
        return dateFinish;
    }

    public void setDateFinish(Date dateFinish) {
        this.dateFinish = dateFinish;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getRepeat() {
        return repeat;
    }

    public void setRepeat(int repeat) {
        this.repeat = repeat;
    }

    public Units getTimeUnits() {
        return timeUnits;
    }

    public void setTimeUnits(Units timeUnits) {
        this.timeUnits = timeUnits;
    }

    public List<Note> getNoteList() {
        return noteList;
    }

    public void setNoteList(List<Note> noteList) {
        this.noteList = noteList;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<File> getFileList() {
        return fileList;
    }

    public void setFileList(List<File> fileList) {
        this.fileList = fileList;
    }

    public List<Label> getLabelList() {
        return labelList;
    }

    public void setLabelList(List<Label> labelList) {
        this.labelList = labelList;
    }

    public Schedule getListName() {
        return listName;
    }

    public void setListName(Schedule listName) {
        this.listName = listName;
    }

    public Client getOwner() {
        return owner;
    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }

    public Client getExecutor() {
        return executor;
    }

    public void setExecutor(Client executor) {
        this.executor = executor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Reminder)) return false;
        Reminder reminder = (Reminder) o;
        return getId() == reminder.getId() &&
                getPriority() == reminder.getPriority() &&
                getRepeat() == reminder.getRepeat() &&
                Objects.equals(getName(), reminder.getName()) &&
                Objects.equals(getDateCreate(), reminder.getDateCreate()) &&
                Objects.equals(getDateFinish(), reminder.getDateFinish()) &&
                Objects.equals(getDateStart(), reminder.getDateStart()) &&
                getTimeUnits() == reminder.getTimeUnits() &&
                Objects.equals(getNoteList(), reminder.getNoteList()) &&
                getStatus() == reminder.getStatus() &&
                Objects.equals(getFileList(), reminder.getFileList()) &&
                Objects.equals(getLabelList(), reminder.getLabelList()) &&
                getListName() == reminder.getListName() &&
                Objects.equals(getOwner(), reminder.getOwner()) &&
                Objects.equals(getExecutor(), reminder.getExecutor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getDateCreate(), getDateFinish(), getDateStart(), getPriority(), getRepeat(), getTimeUnits(), getNoteList(), getStatus(), getFileList(), getLabelList(), getListName(), getOwner(), getExecutor());
    }


    @Override
    public String toString() {
        return "Reminder{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateCreate=" + dateCreate +
                ", dateFinish=" + dateFinish +
                ", dateStart=" + dateStart +
                ", priority=" + priority +
                ", repeat=" + repeat +
                ", timeUnits=" + timeUnits +
                ", noteList=" + noteList +
                ", status=" + status +
                ", fileList=" + fileList +
                ", labelList=" + labelList +
                ", listName=" + listName +
                ", owner=" + owner +
                ", executor=" + executor +
                '}';
    }
}
