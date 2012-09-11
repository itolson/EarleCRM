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
public class DiaryPopulate {

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

    public DiaryPopulate() {
        this.rows = new ArrayList<Column>();
        this.rows.add(new Column("18/07/2012 - 14:45", "BE/121212", "make sure we send out that letter for claim BE343434"));
        this.rows.add(new Column("10/07/2012 - 22:20", "ZD/342222", "Send an email to get the reports for ACME out on time"));
        this.rows.add(new Column("12/07/2012 - 09:30", "EE/333333", "Assign a Claims Handler for Case "));
        this.rows.add(new Column("18/07/2012 - 11:45", "BE/121212", "make sure we send out that letter for claim BE343434"));
        this.rows.add(new Column("10/07/2012 - 12:15", "ZD/342222", "Send an email to get the reports for ACME out on time"));
        this.rows.add(new Column("18/07/2012 - 13:30", "BE/121212", "make sure we send out that letter for claim BE343434"));
        this.rows.add(new Column("10/07/2012 - 23:45", "ZD/342222", "Send an email to get the reports for ACME out on time"));
        this.rows.add(new Column("18/07/2012 - 10:15", "BE/121212", "make sure we send out that letter for claim BE343434"));
        this.rows.add(new Column("10/07/2012 - 13:40", "ZD/342222", "Send an email to get the reports for ACME out on time"));        
        this.rows.add(new Column("18/07/2012 - 14:45", "BE/121212", "make sure we send out that letter for claim BE343434"));
        this.rows.add(new Column("10/07/2012 - 22:20", "ZD/342222", "Send an email to get the reports for ACME out on time"));
        
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
