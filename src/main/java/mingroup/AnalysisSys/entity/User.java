package mingroup.AnalysisSys.entity;

public class User {
    private int userID;
    private String userName;
    private String password;
    private String sex;
    private float grade;
    private String provinceName;
    private String desMajor;
    private String desProvince;
    private String desCollege;

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getDesMajor() {
        return desMajor;
    }

    public void setDesMajor(String desMajor) {
        this.desMajor = desMajor;
    }

    public String getDesProvince() {
        return desProvince;
    }

    public void setDesProvince(String desProvince) {
        this.desProvince = desProvince;
    }

    public String getDesCollege() {
        return desCollege;
    }

    public void setDesCollege(String desCollege) {
        this.desCollege = desCollege;
    }

}
