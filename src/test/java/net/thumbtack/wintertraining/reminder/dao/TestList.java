package net.thumbtack.wintertraining.reminder.dao;

import net.thumbtack.wintertraining.reminder.model.ReminderList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TestList extends TestBase{
    @Test
    public void testInsertList() {
        ReminderList list = new ReminderList("job");
        ReminderList listDB = reminderListDao.insert(list);
        assertNotEquals(0,listDB.getId());
    }
}
