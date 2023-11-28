package com.imax.pojo;

public class SuperAdministratorTable {
    private String UserUid;
    private String UserName;
    private String UserPhone;
    private String UserPassword;
    private String UserSecret;

    public SuperAdministratorTable(SuperAdministratorTable superAdministratorTable){
        UserUid = superAdministratorTable.getUserUid();
        UserName = superAdministratorTable.getUserName();
        UserPhone = superAdministratorTable.getUserPhone();
        UserPassword = superAdministratorTable.getUserPassword();
        UserSecret = superAdministratorTable.getUserSecret();
    }

    public SuperAdministratorTable(String userUid, String userName, String userPhone, String userPassword, String userSecret) {
        UserUid = userUid;
        UserName = userName;
        UserPhone = userPhone;
        UserPassword = userPassword;
        UserSecret = userSecret;
    }

    public String getUserUid() {
        return UserUid;
    }

    public void setUserUid(String userUid) {
        UserUid = userUid;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getUserPhone() {
        return UserPhone;
    }

    public void setUserPhone(String userPhone) {
        UserPhone = userPhone;
    }

    public String getUserPassword() {
        return UserPassword;
    }

    public void setUserPassword(String userPassword) {
        UserPassword = userPassword;
    }

    public String getUserSecret() {
        return UserSecret;
    }

    public void setUserSecret(String userSecret) {
        UserSecret = userSecret;
    }

    @Override
    public String toString() {
        return "UserTablePojo{" +
                "UserUid='" + UserUid + '\'' +
                ", UserName='" + UserName + '\'' +
                ", UserPhone='" + UserPhone + '\'' +
                ", UserPassword='" + UserPassword + '\'' +
                ", UserSecret='" + UserSecret + '\'' +
                '}';
    }
}
