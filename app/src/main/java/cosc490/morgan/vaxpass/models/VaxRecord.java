package cosc490.morgan.vaxpass.models;

import java.util.Date;

public class VaxRecord {

    //either pfizer, moderna, or johnson&johnson
    public String manufacturer;
    //date of first dose
    public Date dose1;
    //lot number of first dose
    public String lotNum1;
    //date of second dose
    public Date dose2;
    //lot number of second dose
    public String lotNum2;
    //health care professional or clinic site
    public String site;
    //optional notes section for patient to enter any additional details
    public String notes;


}
