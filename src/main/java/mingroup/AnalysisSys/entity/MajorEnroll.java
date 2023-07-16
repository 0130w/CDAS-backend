package mingroup.AnalysisSys.entity;

public class MajorEnroll {
    private int collegeID;
    private String provinceName;
    private int majorID;
    private int year;
    private float grade;

    private MajorEnroll(Builder builder) {
        this.collegeID = builder.collegeID;
        this.provinceName = builder.provinceName;
        this.majorID = builder.majorID;
        this.year = builder.year;
        this.grade = builder.grade;
    }

    public void setCollegeID(int collegeID) {
        this.collegeID = collegeID;
    }
    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }
    public void setMajorID(int majorID) {
        this.majorID = majorID;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setGrade(float grade) {
        this.grade = grade;
    }

    public static class Builder {
        private int collegeID;
        private String provinceName;
        private int majorID;
        private int year;
        private float grade;

        public Builder collegeID(int collegeID) {
            this.collegeID = collegeID;
            return this;
        }
        public Builder provinceName(String provinceName) {
            this.provinceName = provinceName;
            return this;
        }
        public Builder majorID(int majorID) {
            this.majorID = majorID;
            return this;
        }
        public Builder year(int year) {
            this.year = year;
            return this;
        }
        public Builder grade(float grade) {
            this.grade = grade;
            return this;
        }

        public MajorEnroll build() {
            return new MajorEnroll(this);
        }
    }
}
