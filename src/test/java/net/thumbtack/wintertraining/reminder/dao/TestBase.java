package net.thumbtack.wintertraining.reminder.dao;

import net.thumbtack.wintertraining.reminder.daoimpl.CommonDaoImpl;
import net.thumbtack.wintertraining.reminder.daoimpl.ReminderListDaoImpl;
import net.thumbtack.wintertraining.reminder.model.ReminderList;
import net.thumbtack.wintertraining.reminder.utils.MyBatisUtils;
import org.junit.Assume;
import org.junit.Before;
import org.junit.BeforeClass;

public class TestBase {
    private CommonDao commonDao = new CommonDaoImpl();
    protected ReminderListDao reminderListDao = new ReminderListDaoImpl(MyBatisUtils.getSqlSessionFactory());


    private static boolean setUpIsDone = false;


    @BeforeClass()
    public static void setUp() {
        if (!setUpIsDone) {
            Assume.assumeTrue(MyBatisUtils.initSqlSessionFactory());
            setUpIsDone = true;
        }
    }

    @Before()
    public void clearDatabase() {
        commonDao.clear();
    }
}
