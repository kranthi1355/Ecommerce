package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.UserDao;
import model.User;

@Service
public class UserServicesImpl implements UserServices {

	@Autowired
	UserDao userDao;
	
	public void saveUser(User user) {
		
		userDao.saveUser(user);
		
	}

	public List< User> showUser() {
		
		return userDao.showUser();
	}

	public void updateUser(User user) {
		userDao.updateUser(user);
	}
	public void deleteUser(long id) {
	userDao.deleteUser(id);
		
	}

	public User findUserbyID(long id) {
		return userDao.findUserbyID(id);
		
	}

	public boolean validateLogin(User user) {
		
		return userDao.validateLogin(user);
	}

}
