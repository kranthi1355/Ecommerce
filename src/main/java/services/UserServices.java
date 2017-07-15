package services;

import java.util.List;

import model.User;

public interface UserServices {
	
	public void saveUser(User user);
	public List<User> showUser();
	public void updateUser(User user);
	public void deleteUser(long id);
	public User findUserbyID(long id);
	public boolean validateLogin(User user);	
}
