package net.thumbtack.wintertraining.reminder.daoimpl;

import net.thumbtack.wintertraining.reminder.dao.ReminderListDao;
import net.thumbtack.wintertraining.reminder.model.ReminderList;
import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class ReminderListDaoImpl implements ReminderListDao {

    private static final Logger LOGGER = LoggerFactory.getLogger(ReminderListDaoImpl.class);

    private SqlSessionFactory sqlSessionFactory;

    //@Autowired
    public ReminderListDaoImpl(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }


    @Override
    public ReminderList insert(ReminderList list) {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            session.insert("ListMapper.insertList", list);
            return list;
        } catch (RuntimeException ex) {
            LOGGER.info("Can't insert List", ex);
            throw ex;
    }
    }
}
