package mingroup.AnalysisSys.entity;

public class MajorInfo {
    private int collegeID;
    private int majorID;

    private MajorInfo(Builder builder) {
        this.collegeID = builder.collegeID;
        this.majorID = builder.majorID;
    }

    public void setCollegeID(int collegeID) {
        this.collegeID = collegeID;
    }
    public void setMajorID(int majorID) {
        this.majorID = majorID;
    }

    public static class Builder {
        private int collegeID;
        private int majorID;

        public Builder collegeID(int collegeID) {
            this.collegeID = collegeID;
            return this;
        }
        public Builder majorID(int majorID) {
            this.majorID = majorID;
            return this;
        }

        public MajorInfo build() {
            return new MajorInfo(this);
        }
    }
}
