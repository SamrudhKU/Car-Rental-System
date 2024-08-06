public class Customer {
    private String userId;
    private String userName;
    private int userPhone;
    private int userAdharCard;

    Customer(String userId, String userName, int userPhone, int userAdharCard){
        this.userId = userId;
        this.userName = userName;
        this.userPhone = userPhone;
        this.userAdharCard = userAdharCard;
    }

    public String getUserId(){
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public int getUserPhone() {
        return userPhone;
    }

    public int getUserAdharCard() {
        return userAdharCard;
    }

}
