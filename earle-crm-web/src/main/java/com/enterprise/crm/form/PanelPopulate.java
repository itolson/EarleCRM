/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.enterprise.crm.form;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateful;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import org.primefaces.component.row.Row;

@Named
@Stateful
@SessionScoped
public class PanelPopulate {

    private List<Column> rows;
    private Row selectedRow;

    static public class Column {

        private List<String> columns;

        public Column(String string1, String string2, String string3, String string4, String string5) {
            this.columns = new ArrayList<String>();
            this.columns.add(string1);
            this.columns.add(string2);
            this.columns.add(string3);
            this.columns.add(string4);
            this.columns.add(string5);        
        }

        public List<String> getColumns() {
            return columns;
        }

        public void setColumns(List<String> columns) {
            this.columns = columns;
        }
    }

    public PanelPopulate() {
        this.rows = new ArrayList<Column>();
        this.rows.add(new Column("ACME Insurance", "230 The Old Mill, Gloucester, GL4 8DC", "01242 624332","A J Smith","aj_smith@ACME.com"));
        this.rows.add(new Column("Go Compare", "100 The Kings Square, Bristol, BS54 6RE", "01179 322322","Mr A N Other","another@gocompare.com"));        
        this.rows.add(new Column("A N Other Insurance Ltd", "300 Another Address, Plymouth, PL7 3SJ", "01752 443334","R K Rowling","rkrowling@ANother.com"));     
        this.rows.add(new Column("Insurance R Us", "230 The New Shop, London, SA1 3EW", "04533 624332","Someone Else","some.oneelse@Insurancerus.com"));
        this.rows.add(new Column("Dont Claim Insurance", "999 No Claims Road, London, LA32 8DC", "01242 624332","Mr Lee Dollar","lee_dollar@ACME.com"));        
        this.rows.add(new Column("ACME Insurance", "230 The Old Mill, Gloucester, GL4 8DC", "01242 624332","A J Smith","aj_smith@ACME.com"));
        this.rows.add(new Column("Go Compare", "100 The Kings Square, Bristol, BS54 6RE", "01179 322322","Mr A N Other","another@gocompare.com"));        
        this.rows.add(new Column("A N Other Insurance Ltd", "300 Another Address, Plymouth, PL7 3SJ", "01752 443334","R K Rowling","rkrowling@ANother.com"));     
        this.rows.add(new Column("Insurance R Us", "230 The New Shop, London, SA1 3EW", "04533 624332","Someone Else","some.oneelse@Insurancerus.com"));
        this.rows.add(new Column("Dont Claim Insurance", "999 No Claims Road, London, LA32 8DC", "01242 624332","Mr Lee Dollar","lee_dollar@ACME.com"));        
        this.rows.add(new Column("ACME Insurance", "230 The Old Mill, Gloucester, GL4 8DC", "01242 624332","A J Smith","aj_smith@ACME.com"));
        this.rows.add(new Column("Go Compare", "100 The Kings Square, Bristol, BS54 6RE", "01179 322322","Mr A N Other","another@gocompare.com"));        
        this.rows.add(new Column("A N Other Insurance Ltd", "300 Another Address, Plymouth, PL7 3SJ", "01752 443334","R K Rowling","rkrowling@ANother.com"));     
        this.rows.add(new Column("Insurance R Us", "230 The New Shop, London, SA1 3EW", "04533 624332","Someone Else","some.oneelse@Insurancerus.com"));
        this.rows.add(new Column("Dont Claim Insurance", "999 No Claims Road, London, LA32 8DC", "01242 624332","Mr Lee Dollar","lee_dollar@ACME.com"));
        this.rows.add(new Column("ACME Insurance", "230 The Old Mill, Gloucester, GL4 8DC", "01242 624332","A J Smith","aj_smith@ACME.com"));
        this.rows.add(new Column("Go Compare", "100 The Kings Square, Bristol, BS54 6RE", "01179 322322","Mr A N Other","another@gocompare.com"));        
        this.rows.add(new Column("A N Other Insurance Ltd", "300 Another Address, Plymouth, PL7 3SJ", "01752 443334","R K Rowling","rkrowling@ANother.com"));     
        this.rows.add(new Column("Insurance R Us", "230 The New Shop, London, SA1 3EW", "04533 624332","Someone Else","some.oneelse@Insurancerus.com"));
        this.rows.add(new Column("Dont Claim Insurance", "999 No Claims Road, London, LA32 8DC", "01242 624332","Mr Lee Dollar","lee_dollar@ACME.com"));        
    }

    public List<Column> getRows() {
        return rows;
    }

    public void setRows(List<Column> rows) {
        this.rows = rows;
    }

    public Row getSelectedRow() {
        return selectedRow;
    }

    public void setSelectedRow(Row selectedRow) {
        this.selectedRow = selectedRow;
    }
}
