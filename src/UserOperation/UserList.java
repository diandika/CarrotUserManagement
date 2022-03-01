package UserOperation;

import java.util.ArrayList;

public class UserList {
    private static ArrayList<User> userList = new ArrayList<>();
    private static ArrayList<PointHistory> pointHistoryList = new ArrayList<>();

    public static void transaction(User sender, User recipient, int points){
        sender.sendPoint(recipient, points);
        PointHistory pointHistory = new PointHistory(sender, recipient, points);
        pointHistoryList.add(pointHistory);
    }

    public static void main(String []args){
        System.out.println("Hello World");
    }
}
