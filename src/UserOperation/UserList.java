package UserOperation;

import java.util.ArrayList;

import java.util.List;

public class UserList {
    private static ArrayList<User> userList = new ArrayList<>();
    private static ArrayList<PointHistory> pointHistoryList = new ArrayList<>();

    public static void transaction(User sender, User recipient, int points){
        sender.sendPoint(recipient, points);
        PointHistory pointHistory = new PointHistory(sender, recipient, points);
        pointHistoryList.add(pointHistory);
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
