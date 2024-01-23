/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package userManagement;

import java.util.ArrayList;
import userInterface.SearchandUpdateUserJPanel;
import userInterface.CreateUser;

/**
 *
 * @author rohan
 */
public class Directory {
    private ArrayList<User> userArrayList;
    private ArrayList<User> passwordHistory ;

    public Directory() {
        this.userArrayList = new ArrayList<User>();
        this.passwordHistory = new ArrayList<User>(); 
    }

    public ArrayList<User> getPasswordHistory() {
        return userArrayList;
    }

    public void setPasswordHistory(ArrayList<User> passwordHistory) {
        this.passwordHistory = passwordHistory;
    }
    public ArrayList<User> getUserArrayList() {
        return userArrayList;
    }

    public void setUserArrayList(ArrayList<User> userArrayList) {
        this.userArrayList = userArrayList;
    }
    
    public User addUser(){
        User user = new User();
        userArrayList.add(user);
        return user;
    }
    
    public void deleteUser (User user){
        userArrayList.remove(user);
    }
    private String hashPassword(String newPassword) {
        String N;
        N=SearchandUpdateUserJPanel.hashPassword(newPassword);
        System.out.println(N);
        return N;
        
    }
    
    private String hashedPassword(String password) {
        return CreateUser.hashedPassword(password);
        
    }
    
    public User searchUser(String nuid){
        for(User user: userArrayList){
            if (user.getNUID().equals(nuid)){
                return user;
            }
        }
        return null;
    }
    
    public User searchPassword(String password){
        for(User user: userArrayList){
            if (user.getPassword().equals(password)){
                return user;
            }
        }
        return null;
    }
    
    public User searchEnteredUsernameandPassword(String username, String password){
        for(User user: userArrayList){
            if (user.getUsername().equals(username) && user.getPassword().equals(password)){
                return user;
            }
        }
        return null;
    }
    
        public void updatePassword(String password, String newPassword) {
        for (User user : userArrayList) {
        if (user.getUsername().equals(password)) {
            user.setPassword(newPassword);
            break; // Exit the loop once the user is found
        }
    }
}
    
    
    public User findUserByUsername(String username) {
    for (User user : userArrayList) {
        if (user.getUsername().equals(username)) {
            return user; // User found
        }
    }
    return null; 
}
    


    
}
    

