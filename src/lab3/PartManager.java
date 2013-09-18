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
            "Sorry, you must complete all fields. Please try again.";
    private final String NOT_FOUND_ERROR = 
            "Part Number not found. Please try again.";
    private int foundIndex = NOT_FOUND;
    
    private Part[] parts;
    private int index = 0;

    public PartManager(){
        parts = new Part[MIN_RECS];
    }
    
    public int getFoundIndex() {
        return foundIndex;
    }
    
    public void enterRecord(double partPrice, String partNo, String partDesc){
        //validation needed
        foundIndex = NOT_FOUND;
        
        if (parts.length > 10) {
            JOptionPane.showMessageDialog(null, MAX_LENGTH_ERROR);
        } else if (partNo.length() == 0 || partDesc.length() == 0 || partPrice == 0){
            JOptionPane.showMessageDialog(null, INCOMPLETE_ENTRY_ERROR);
        } else {
            
            parts[index].setPartPrice(partPrice);
            parts[index].setPartNo(partNo);
            parts[index].setPartDesc(partDesc);
            index++;
        }
    }
    
    public void updateRecord(double partPrice, String partNo, String partDesc){
        //validation needed
        parts[foundIndex].setPartPrice(partPrice);
        parts[foundIndex].setPartNo(partNo);
        parts[foundIndex].setPartDesc(partDesc);
    }
    
    public void searchParts(String searchNum){
        //validation needed
        if (searchNum != null && searchNum.length() > 0) {
            for (int i = 0; i < parts.length; i++) {
                if (searchNum.equalsIgnoreCase(parts[i].getPartNo())) {
                    foundIndex = i;
                    break;
                }
            }
            if (foundIndex == NOT_FOUND) {
                JOptionPane.showMessageDialog(null, NOT_FOUND_ERROR);
            }
        }
    }
    
    public void sortParts(){
        //working logic goes here
    }
    
    public void addNewPart(){
        //Download Jim's example, STUDY .arraycopy() METHOD!!
        Part temp[] = new Part[parts.length];
    }
    
    public double getPartPrice(int index){
        return parts[index].getPartPrice();
    }
    public String getPartNo(int index){
        return parts[index].getPartNo();
    }
    public String getPartDesc(int index){
        return parts[index].getPartDesc();
    }
}