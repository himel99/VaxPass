package cosc490.morgan.vaxpass.models;

import android.widget.ImageView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VaxRecord {

    //either pfizer, moderna, or johnson&johnson
    public String manufacturer;
    //date of first dose
    public String dose1;
    //lot number of first dose
    public String lotNum1;
    //date of second dose
    public String dose2;
    //lot number of second dose
    public String lotNum2;
    //health care professional or clinic site
    public String site;
    //optional notes section for patient to enter any additional details
    public String notes;

    //add image view for vaccination card picture upload(s)
    //public ImageView vaxCardPic;

    //creating json object to hold vaccination record
    public static VaxRecord fromJson(JSONObject jsonObject) throws JSONException{
        VaxRecord vaxRecord = new VaxRecord();
        vaxRecord.manufacturer = jsonObject.getString("text");
        vaxRecord.dose1 = jsonObject.getString("date");
        vaxRecord.lotNum1 = jsonObject.getString("lot number");
        vaxRecord.dose2 = jsonObject.getString("date2");
        vaxRecord.lotNum2 = jsonObject.getString("lot number2");
        vaxRecord.site = jsonObject.getString("site");
        vaxRecord.notes = jsonObject.getString("notes");
        return vaxRecord;
    }

    //list vaccination records for recycler view
    public static List<VaxRecord> fromJsonArray(JSONArray jsonArray) throws JSONException {
        List<VaxRecord> vaxRecords = new ArrayList<>();
        for(int i=0; i < jsonArray.length(); i++){
            vaxRecords.add(fromJson(jsonArray.getJSONObject(i)));
        }
        return vaxRecords;
    }
}
