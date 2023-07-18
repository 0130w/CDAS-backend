package mingroup.AnalysisSys.entity;

public class College {

    private int collegeId;
    private String collegeName;
    private float employRate;
    private float sexRatio;
    private float der;
    private float oer;
    private String keyword;
    private int studentNum;
    private String province;
    private float popularity;
    private boolean displayAd;

    public int getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(int collegeId) {
        this.collegeId = collegeId;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public float getEmployRate() {
        return employRate;
    }

    public void setEmployRate(float employRate) {
        this.employRate = employRate;
    }

    public float getSexRatio() {
        return sexRatio;
    }

    public void setSexRatio(float sexRatio) {
        this.sexRatio = sexRatio;
    }

    public float getDer() {
        return der;
    }

    public void setDer(float der) {
        this.der = der;
    }

    public float getOer() {
        return oer;
    }

    public void setOer(float oer) {
        this.oer = oer;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public float getPopularity() {
        return popularity;
    }

    public void setPopularity(float popularity) {
        this.popularity = popularity;
    }

    public boolean isDisplayAd() {
        return displayAd;
    }

    public void setDisplayAd(boolean displayAd) {
        this.displayAd = displayAd;
    }

}
