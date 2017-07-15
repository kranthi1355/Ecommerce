package dao;

import java.util.HashMap;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import model.User;

@Repository
@Transactional
public class UserDaoImpl implements UserDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@PersistenceContext
	private EntityManager em;

	HashMap<Integer, User> hashMap = new HashMap<Integer, User>();

	public void saveUser(User user) {

		em.persist(user);

	}

	public List<User> showUser() {

		List<User> list = em.createQuery("SELECT a FROM User a", User.class).getResultList();
		return list;
	}

	public User findUserbyID(long id) {
		String sql = "select * from user where id=?";
		return jdbcTemplate.queryForObject(sql, new Object[] { id }, new BeanPropertyRowMapper<User>(User.class));
	}

	public void updateUser(User user) {

		String sql = "update user set userName =? where id=?";
		jdbcTemplate.update(sql, new Object[] { user.getUserName(), user.getId() });
	}

	public void deleteUser(long id) {

		User del = em.getReference(User.class, id);
		em.remove(del);

	}

	public boolean validateLogin(User user) {
		boolean userFound = false;
		String SQL_QUERY = " from User as o where o.userName='" + user.getUserName() + "'";
		List<User> list = em.createQuery(SQL_QUERY, User.class).getResultList();
		if ((list != null) && (list.size() > 0)) {
			userFound = true;
		}
		return userFound;
	}
}
