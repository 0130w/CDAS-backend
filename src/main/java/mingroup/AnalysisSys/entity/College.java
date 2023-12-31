package mingroup.AnalysisSys.entity;

public class College {

    private int collegeId;
    private String collegeName;
    private float employRate;
    private float sexRatio;
    private float der;
    private float oer;
    private String keyword;
    private String collegeProvince;
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

    public String getProvince() {
        return collegeProvince;
    }

    public void setProvince(String collegeProvince) {
        this.collegeProvince = collegeProvince;
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
