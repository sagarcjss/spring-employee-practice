package com.cjss.model;

public class BenefitsModel {
    private int benefitId;
    private String benefitName;
    private String description;

    public int getBenefitId() {
        return benefitId;
    }

    public void setBenefitId(int benefitId) {
        this.benefitId = benefitId;
    }

    public String getBenefitName() {
        return benefitName;
    }

    public void setBenefitName(String benefitName) {
        this.benefitName = benefitName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Benefits{" +
                "benefitId=" + benefitId +
                ", benefitName='" + benefitName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
