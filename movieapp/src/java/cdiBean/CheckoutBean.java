
package cdiBean;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author noahacosta
 */
@Named(value = "checkoutBean")
@SessionScoped
public class CheckoutBean implements Serializable {

    // create local variables to store our information
    private String numOfTickets;
    private String ccnumber;
    private String monthEntered;
    private String yearEntered;
    private String csvEntered;
    private String result;
    private String totalCost;
    
    /**
     * Creates a new instance of CheckoutBean
     */
    public CheckoutBean() {
    }

    // GETTERS AND SETTERS
    public String getNumOfTickets() {
        return numOfTickets;
    }
    public void setNumOfTickets(String numOfTickets) {
        this.numOfTickets = numOfTickets;
    }

    public String getCcnumber() {
        return ccnumber;
    }
    public void setCcnumber(String ccnumber) {
        this.ccnumber = ccnumber;
    }

    public String getMonthEntered() {
        return monthEntered;
    }
    public void setMonthEntered(String monthEntered) {
        this.monthEntered = monthEntered;
    }

    public String getYearEntered() {
        return yearEntered;
    }
    public void setYearEntered(String yearEntered) {
        this.yearEntered = yearEntered;
    }

    public String getCsvEntered() {
        return csvEntered;
    }
    public void setCsvEntered(String csvEntered) {
        this.csvEntered = csvEntered;
    }

    public String getResult() {
        return result;
    }
    public void setResult(String result) {
        this.result = result;
    }

    public String getTotalCost() {
        return totalCost;
    }
    public void setTotalCost(String totalCost) {
        this.totalCost = totalCost;
    }

    /**
     * validates to make sure the user entered a correct cc number
     * 
     * first: try and cast the string into a long number. if it fails, the user
     * entered something other than digits. return error message
     * 
     * second: validate to make sure the user entered 16 digits. if they did not
     * return an error message
     * 
     * finally: if all passes
     * @return the thank you page
     */
    public String validateInfo()
    {
        result = "";
        try{
            long testcc = Long.parseLong(ccnumber);

            if(ccnumber.length() != 16)
            {
                result = "INVALID CARD NUMBER LENGTH!";
                return "";
            }
            else
            {
                return "Thankyou.xhtml";
            }
        }catch(Exception ex){
            result = "PLEASE ONLY ENTER DIGITS 0-9";
            return "";
        }
    }
    
    /**
     * Calculate the charges to display on the screen
     * 
     * First, parse the number of tickets selected to a number
     * 
     * Then, multiply that number by 10 and 
     * @return the total cost of tickets
     */
    public String calculateCharges()
    {
        int tickets = Integer.parseInt(numOfTickets);
        
        int cost = 10;
        
        int total = tickets * cost;
        
        totalCost = "" + total;
        
        return "$" + totalCost;
    }
}
