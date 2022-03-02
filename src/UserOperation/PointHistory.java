package UserOperation;

import java.sql.Timestamp;
import java.util.Date;

public class PointHistory {
    private Timestamp timestamp;
    private User senderUser;
    private User recipientUser;
    private int point;

    /** create new history log
     *
     * @param recipientUser
     * @param senderUser
     * @param point
     */
    public PointHistory(User senderUser, User recipientUser, int point){
        this.timestamp = new Timestamp(new Date().getTime());
        this.senderUser = senderUser;
        this.recipientUser = recipientUser;
        this.point = point;
    }

    public String toString(){

        return this.timestamp + ":: " + senderUser.getName() + " send " + this.point + " carrots to " + recipientUser.getName();
    }
}
