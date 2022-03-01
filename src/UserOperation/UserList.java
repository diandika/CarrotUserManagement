package UserOperation;

import java.util.ArrayList;
import java.util.List;

public class UserList {
    private List<User> userList;

    /**
     * make new user list
     */
    public UserList(){

    }

    /** show user list information
     *
     * @return string of user information
     */
    public String toString(){
        return "string";
    }

    public static void main(String []args){

        ArrayList<User> users = new ArrayList<>();
        users.add(new User("Adimas", 1, 50));
        users.add(new User("Dicky", 2, 50));

        for (User user: users) {
            System.out.println(user);
        }
    }
}
