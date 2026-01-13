package LW03;

public class Owner {
    private String ownerName;
    private String phoneNo;

    public Owner (){
        ownerName = "unknown";
        phoneNo = "unknown";
    }
    public Owner(String ownerName,String phoneNo){
        this.ownerName = ownerName;
        this.phoneNo = phoneNo;
    }

    public String getOwnerName(){
        return ownerName;
    }
    public String getPhoneNo(){
        return phoneNo;
    }
    public void setOwnername(String ownerName){
        this.ownerName = ownerName;
    }
    public void setPhoneNo(String phoneNo){
        this.phoneNo = phoneNo;
    }
}
