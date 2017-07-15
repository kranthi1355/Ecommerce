package dao;

import java.util.List;

import model.User;

public interface UserDao {
	
	public void saveUser(User user);
	public List<User> showUser();
	public void deleteUser(long id);
	public User findUserbyID(long id);
	public void updateUser(User user);
	public boolean validateLogin(User user);	
}
