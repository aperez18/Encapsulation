/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import javax.swing.JOptionPane;
/**
 *
 * @author Andy
 */
public class PartManager {
    private final int MAX_RECS = 10;
    private final int MIN_RECS = 0;
    private final int NOT_FOUND = -1;
    private final String MAX_LENGTH_ERROR = 
            "Sorry, you have reached the maximum of 10 items.\nNo more items can be saved.";
    private final String INCOMPLETE_ENTRY_ERROR =
            "Sorry, you must complete all fields. Please try again.\n";
    private int foundIndex = NOT_FOUND;
    
    private Part[] parts;

    public PartManager(){
        parts = new Part[MIN_RECS];
    }
    
    public int getFoundIndex() {
        return foundIndex;
    }
    
    public void enterRecord(double partPrice, String partNo, String partDesc){
        //validation needed for partNo
        foundIndex = NOT_FOUND;
        
        if (parts.length > 10) {
            JOptionPane.showMessageDialog(null, MAX_LENGTH_ERROR);
        } else if (partNo.length() == 0 || partDesc.length() == 0 || partPrice == 0){
            JOptionPane.showMessageDialog(null, INCOMPLETE_ENTRY_ERROR);
        } else {
            
            pmanager.enterRecord(emptyRow);
            this.emptyRow += 1;
        }
        parts[index].setPartNo(partNo);
        
        //partNums[index] = partNo;
        //partDescs[index] = partDesc;
        //partPrices[index] = partPrice;
    }
    
    public void searchParts(String searchNum){
        if (searchNum != null && searchNum.length() > 0) {
            for (int i = 0; i < parts.length; i++) {
                if (searchNum.equalsIgnoreCase(parts[i].getPartNo())) {
                    foundIndex = i;
                    break;
                }
            }
        }
    }
    
    public void sortParts(){
        
    }
    
    public void addNewPart(){
        //Download Jim's example, STUDY .arraycopy() METHOD!!
        Part temp[] = new Part[10];
    }
}