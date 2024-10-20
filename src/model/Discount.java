package model;

public class Discount {
    private String discountId;
    private String discountCode;
    private double percentageOff;
    private String validFrom;
    private String validUntil;

    public String getDiscountId() {
        return discountId;
    }

    public void setDiscountId(String discountId) {
        this.discountId = discountId;
    }

    public String getDiscountCode() {
        return discountCode;
    }

    public void setDiscountCode(String discountCode) {
        this.discountCode = discountCode;
    }

    public double getPercentageOff() {
        return percentageOff;
    }

    public void setPercentageOff(double percentageOff) {
        this.percentageOff = percentageOff;
    }

    public String getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(String validFrom) {
        this.validFrom = validFrom;
    }

    public String getValidUntil() {
        return validUntil;
    }

    public void setValidUntil(String validUntil) {
        this.validUntil = validUntil;
    }
}
