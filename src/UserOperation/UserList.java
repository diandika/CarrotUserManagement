package UserOperation;

import java.util.ArrayList;

import java.util.List;

public class UserList {
    //private static ArrayList<User> userList = new ArrayList<>();
    private static ArrayList<PointHistory> pointHistoryList = new ArrayList<>();

    /** create transaction between two user and store it to history log
     *
     * @param sender user sending points
     * @param recipient user gets points
     * @param points points sent
     */
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
        transaction(users.get(0), users.get(1), 30);
        transaction(users.get(1), users.get(0), 50);

        for (User user: users) {
            System.out.println(user);
        }

        for (PointHistory pointHistory:pointHistoryList){
            System.out.println(pointHistory);
        }
    }
}
