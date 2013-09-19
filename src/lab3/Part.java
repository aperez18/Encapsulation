/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Andy
 */
public class Part {
    private String partNo;
    private String partDesc;
    private double partPrice;
    
    public Part(double partPrice, String partNo, String partDesc){
        this.partPrice = partPrice;
        this.partNo = partNo;
        this.partDesc = partDesc;
    }
    
    public String getPartNo() {
        return partNo;
    }

    public void setPartNo(String partNo) {
        this.partNo = partNo;
    }

    public String getPartDesc() {
        return partDesc;
    }

    public void setPartDesc(String partDesc) {
        this.partDesc = partDesc;
    }

    public double getPartPrice() {
        return partPrice;
    }

    public void setPartPrice(double partPrice) {
        this.partPrice = partPrice;
    }
    
}
