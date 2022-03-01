package UserOperation;

import java.util.List;

public class User {
    private String name;
    private int ID;
    private int point;
    private List<PointHistory> pointHistory;

    /**
     * make new user
     */
    public User(String name, int ID, int point){

    }

    /** subtract own point, make history log and store to history list
     *
     * @param recipient
     * @param sumPoints
     */
    public void sendPoint(User recipient, int sumPoints){

    }

    /** add own point, make history log and store to history list
     *
     * @param sender
     * @param sumPoints
     */
    public void getPoint(User sender, int sumPoints){

    }

    /**
     *
     * @return get point history information
     */
    public List<PointHistory> getPointHistory(){


        return pointHistory;
    }

    /**
     * @return print users data to output
     */
    public String toString(){


        return "string";
    }
}
