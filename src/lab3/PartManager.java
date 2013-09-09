/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Andy
 */
public class PartManager {
    private final int MAX_RECS = 10;
    private final int NOT_FOUND = -1;

    private String partNo;
    private int foundIndex = NOT_FOUND;
    private String partDesc;
    private double partPrice;

    private String[] partNums = new String[10];
    private String[] partDescs = new String[10];
    private double[] partPrices = new double[10];

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

    public String getPartNums(int index) {
        return partNums[index];
    }

    public void setPartNums(String partNum, int index) {
        this.partNums[index] = partNum;
    }

    public String getPartDescs(int index) {
        return partDescs[index];
    }

    public void setPartDescs(String partDesc, int index) {
        this.partDescs[index] = partDesc;
    }

    public double[] getPartPrices() {
        return partPrices;
    }

    public void setPartPrices(double partPrice, int index) {
        this.partPrices[index] = partPrice;
    }

    public int getFoundIndex() {
        return foundIndex;
    }
    
    public void enterRecord(int index){
        foundIndex = NOT_FOUND;
        partNums[index] = partNo;
        partDescs[index] = partDesc;
        partPrices[index] = partPrice;
    }
    
    public void searchParts(String searchNum){
        if (searchNum != null && searchNum.length() > 0) {
            for (int i = 0; i < partNums.length; i++) {
                if (searchNum.equalsIgnoreCase(partNums[i])) {
                    foundIndex = i;
                    break;
                }
            }
        }
    }
}