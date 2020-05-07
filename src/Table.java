
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class Table {
    private String app_id;
    private String app_date;
    private String app_time;
    private String doc_id;
    private String eld_id;
    private String inv_id;
    
    public Table (String app_id, String app_date, String app_time, String doc_id, String eld_id, String inv_id){
        this.app_id = app_id;
        this.app_date = app_date;
        this.app_time = app_time;
        this.doc_id = doc_id;
        this.eld_id = eld_id;
        this.inv_id = inv_id;
    }
    
    String getapp_id() {
        return this.app_id;
    }
    String getapp_date() {
        return this.app_date;
    }
    String getapp_time() {
        return this.app_time;
    }
    String getdoc_id() {
        return this.doc_id;
    }
    String geteld_id() {
        return this.eld_id;
    }
    String getinv_id() {
        return this.inv_id;
    }
}