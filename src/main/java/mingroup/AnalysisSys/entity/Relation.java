package mingroup.AnalysisSys.entity;

public class Relation {
    private int collegeID;
    private String provinceName;
    private int year;
    private float lowestGrade;
    private int lowestRanking;
    private int enrollNum;

    public int getCollegeID() {
        return collegeID;
    }

    public void setCollegeID(int collegeID) {
        this.collegeID = collegeID;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getLowestGrade() {
        return lowestGrade;
    }

    public void setLowestGrade(float lowestGrade) {
        this.lowestGrade = lowestGrade;
    }

    public int getLowestRanking() {
        return lowestRanking;
    }

    public void setLowestRanking(int lowestRanking) {
        this.lowestRanking = lowestRanking;
    }

    public int getEnrollNum() {
        return enrollNum;
    }

    public void setEnrollNum(int enrollNum) {
        this.enrollNum = enrollNum;
    }

}
