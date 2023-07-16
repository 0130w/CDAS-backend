package mingroup.AnalysisSys.entity;

public class Relation {
    private int collegeID;
    private String provinceName;
    private int year;
    private float lowestGrade;
    private int lowestRanking;
    private int enrollNum;

    private Relation(Builder builder) {
        this.collegeID = builder.collegeID;
        this.provinceName = builder.provinceName;
        this.year = builder.year;
        this.lowestGrade = builder.lowestGrade;
        this.lowestRanking = builder.lowestRanking;
        this.enrollNum = builder.enrollNum;
    }

    public void setCollegeID(int collegeID) {
        this.collegeID = collegeID;
    }
    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setLowestGrade(float lowestGrade) {
        this.lowestGrade = lowestGrade;
    }
    public void setLowestRanking(int lowestRanking) {
        this.lowestRanking = lowestRanking;
    }
    public void setEnrollNum(int enrollNum) {
        this.enrollNum = enrollNum;
    }

    public static class Builder{
        private int collegeID;
        private String provinceName;
        private int year;
        private float lowestGrade;
        private int lowestRanking;
        private int enrollNum;

        public Builder collegeID(int collegeID) {
            this.collegeID = collegeID;
            return this;
        }
        public Builder provinceName(String provinceName) {
            this.provinceName = provinceName;
            return this;
        }
        public Builder year(int year) {
            this.year = year;
            return this;
        }
        public Builder lowestGrade(float lowestGrade) {
            this.lowestGrade = lowestGrade;
            return this;
        }
        public Builder lowestRanking(int lowestRanking) {
            this.lowestRanking = lowestRanking;
            return this;
        }
        public Builder enrollNum(int enrollNum) {
            this.enrollNum = enrollNum;
            return this;
        }

        public Relation build() {
            return new Relation(this);
        }

    }
}
