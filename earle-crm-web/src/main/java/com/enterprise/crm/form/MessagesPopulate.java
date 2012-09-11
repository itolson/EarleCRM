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
public class MessagesPopulate {

    private List<DiaryPopulate.Column> rows;
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

    public MessagesPopulate() {
        this.rows = new ArrayList<DiaryPopulate.Column>();
        this.rows.add(new DiaryPopulate.Column("18/07/2012", "Joe Bloggs", "make sure we send out that letter for claim BE343434"));
        this.rows.add(new DiaryPopulate.Column("10/07/2012", "Anne Hathaway", "Send an email to get the reports for ACME out on time"));
        this.rows.add(new DiaryPopulate.Column("18/07/2012", "Joe Bloggs", "make sure we send out that letter for claim BE343434"));
        this.rows.add(new DiaryPopulate.Column("10/07/2012", "Anne Hathaway", "Send an email to get the reports for ACME out on time"));
        this.rows.add(new DiaryPopulate.Column("18/07/2012", "Joe Bloggs", "make sure we send out that letter for claim BE343434"));
        this.rows.add(new DiaryPopulate.Column("10/07/2012", "Anne Hathaway", "Send an email to get the reports for ACME out on time"));
        this.rows.add(new DiaryPopulate.Column("18/07/2012", "Joe Bloggs", "make sure we send out that letter for claim BE343434"));
        this.rows.add(new DiaryPopulate.Column("10/07/2012", "Anne Hathaway", "Send an email to get the reports for ACME out on time"));        
        this.rows.add(new DiaryPopulate.Column("12/07/2012", "Harry Potter", "Assign a Claims Handler for Case "));
    }

    public List<DiaryPopulate.Column> getRows() {
        return rows;
    }

    public void setRows(List<DiaryPopulate.Column> rows) {
        this.rows = rows;
    }

    public Row getSelectedRow() {
        return selectedRow;
    }

    public void setSelectedRow(Row selectedRow) {
        this.selectedRow = selectedRow;
    }
}
