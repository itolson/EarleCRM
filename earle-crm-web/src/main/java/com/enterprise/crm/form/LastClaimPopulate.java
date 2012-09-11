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
public class LastClaimPopulate {

    private List<Column> rows;
    private Row selectedRow;

    static public class Column {

        private List<String> columns;

        public Column(String string1, String string2, String string3) {
            this.columns = new ArrayList<String>();
            this.columns.add(string1);
            this.columns.add(string2);
            this.columns.add(string3);
        }

        public List<String> getColumns() {
            return columns;
        }

        public void setColumns(List<String> columns) {
            this.columns = columns;
        }
    }

    public LastClaimPopulate() {
        this.rows = new ArrayList<Column>();
        this.rows.add(new Column("18/07/2012", "BE/121212", "Letter receied from insured please make sure its get sent back on time"));
        this.rows.add(new Column("10/07/2012", "ZD/342222", "PAP tetter sent, awaiting new details please amend as per request"));
        this.rows.add(new Column("12/07/2012", "EE/333333", "Escalate to partner level as its way over dur now and going to cause a loads of agro."));
        this.rows.add(new Column("01/12/2011", "XX/121212", "Sort this now please as its giving me a headache"));
        this.rows.add(new Column("07/12/2010", "BB/999999", "Lets go down the pub"));        
        this.rows.add(new Column("18/07/2012", "BE/121212", "Letter receied from insured please make sure its get sent back on time"));
        this.rows.add(new Column("10/07/2012", "ZD/342222", "PAP tetter sent, awaiting new details please amend as per request"));
        this.rows.add(new Column("12/07/2012", "EE/333333", "Escalate to partner level as its way over dur now and going to cause a loads of agro."));
        this.rows.add(new Column("01/12/2011", "XX/121212", "Sort this now please as its giving me a headache"));        
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
