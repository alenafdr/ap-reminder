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
    private Units units;
    private List<Note> noteList;
    private Status status;
    private List<File> fileList;
    private List<Label> labelList;
    private Schedule list;
    private int owner;
    private int executor;

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

    public Units getUnits() {
        return units;
    }

    public void setUnits(Units units) {
        this.units = units;
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

    public Schedule getList() {
        return list;
    }

    public void setList(Schedule list) {
        this.list = list;
    }

    public int getOwner() {
        return owner;
    }

    public void setOwner(int owner) {
        this.owner = owner;
    }

    public int getExecutor() {
        return executor;
    }

    public void setExecutor(int executor) {
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
                getOwner() == reminder.getOwner() &&
                getExecutor() == reminder.getExecutor() &&
                Objects.equals(getName(), reminder.getName()) &&
                Objects.equals(getDateCreate(), reminder.getDateCreate()) &&
                Objects.equals(getDateFinish(), reminder.getDateFinish()) &&
                Objects.equals(getDateStart(), reminder.getDateStart()) &&
                getUnits() == reminder.getUnits() &&
                Objects.equals(getNoteList(), reminder.getNoteList()) &&
                getStatus() == reminder.getStatus() &&
                Objects.equals(getFileList(), reminder.getFileList()) &&
                Objects.equals(getLabelList(), reminder.getLabelList()) &&
                getList() == reminder.getList();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getDateCreate(), getDateFinish(), getDateStart(), getPriority(), getRepeat(), getUnits(), getNoteList(), getStatus(), getFileList(), getLabelList(), getList(), getOwner(), getExecutor());
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
                ", units=" + units +
                ", noteList=" + noteList +
                ", status=" + status +
                ", fileList=" + fileList +
                ", labelList=" + labelList +
                ", list=" + list +
                ", owner=" + owner +
                ", executor=" + executor +
                '}';
    }
}
