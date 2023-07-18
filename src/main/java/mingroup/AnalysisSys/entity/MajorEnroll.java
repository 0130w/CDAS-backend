package mingroup.AnalysisSys.entity;

public class MajorEnroll {
    private int collegeID;
    private String provinceName;
    private int majorID;
    private int year;
    private float majorGrade;
    private int majorRanking;

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

    public int getMajorID() {
        return majorID;
    }

    public void setMajorID(int majorID) {
        this.majorID = majorID;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getMajorGrade() {
        return majorGrade;
    }

    public void setMajorGrade(float majorGrade) {
        this.majorGrade = majorGrade;
    }

    public int getMajorRanking() {
        return majorRanking;
    }

    public void setMajorRanking(int majorRanking) {
        this.majorRanking = majorRanking;
    }

}
