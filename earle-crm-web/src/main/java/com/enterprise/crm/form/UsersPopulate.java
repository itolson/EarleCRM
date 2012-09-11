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
public class UsersPopulate {

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

    public UsersPopulate() {
        this.rows = new ArrayList<Column>();
        this.rows.add(new Column("Ian", "Smith", "01242 624332","82.00","aj_smith@ACME.com"));
        this.rows.add(new Column("Joanne", "Dismay", "01242 624332","99.00","j.dismay@anywhere.com"));
        this.rows.add(new Column("Dan", "Blaster", "01242 624332","54.00","dan_blasters@gocompare.com"));
        this.rows.add(new Column("Stan", "Windows", "01242 624332","182.00","stanwindows@whoareyou.com"));
        this.rows.add(new Column("Brendon", "Walsh", "01242 624332","282.00","bwalsh@youtube.com"));
        this.rows.add(new Column("Joe", "Anglegrinder", "01242 624332","482.00","janglegrnder@metal.com"));
        this.rows.add(new Column("Test", "Whocares", "01242 624332","32.00","twhocares_1@thebestplace.com"));
        this.rows.add(new Column("Another", "Person", "01242 624332","92.00","a_n_other@another.co.uk"));        
        this.rows.add(new Column("Gwinith", "Lastone", "01242 624332","12.00","glastone@whereami.co.uk"));
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
