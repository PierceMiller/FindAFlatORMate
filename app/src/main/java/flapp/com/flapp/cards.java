package flapp.com.flapp;

public class cards {

    private String userID;
    private String name;

    public cards(String userID, String name){
        this.userID = userID;
        this.name = name;
    }

    public String getUserID(){
        return userID;
    }

    public void setUserID(String userID){

        this.userID = userID;
    }
    public String getName(){
        return name;
    }

    public void setName(String name){

        this.name = name;
    }


}
