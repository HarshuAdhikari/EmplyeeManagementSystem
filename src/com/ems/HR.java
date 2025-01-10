package com.ems;

public class HR extends Employee {
    private int recruitmentTargets;

    public HR(int id, String name, double salary, int recruitmentTargets) {
        super(id, name, salary);
        this.recruitmentTargets = recruitmentTargets;
    }

    public int getRecruitmentTargets() {
        return recruitmentTargets;
    }

    public void setRecruitmentTargets(int recruitmentTargets) {
        this.recruitmentTargets = recruitmentTargets;
    }

    @Override
    public String toString() {
        return super.toString() + ", Recruitment Targets: " + recruitmentTargets;
    }
}
