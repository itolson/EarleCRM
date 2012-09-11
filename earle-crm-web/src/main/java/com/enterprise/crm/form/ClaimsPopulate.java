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
public class ClaimsPopulate {

    private List<Column> rows;
    private Row selectedRow;

    static public class Column {

        private List<String> columns;

        public Column(String string1, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
            this.columns = new ArrayList<String>();
            this.columns.add(string1);
            this.columns.add(string2);
            this.columns.add(string3);
            this.columns.add(string4);
            this.columns.add(string5);
            this.columns.add(string6);
            this.columns.add(string7);
            this.columns.add(string8);
        }

        public List<String> getColumns() {
            return columns;
        }

        public void setColumns(List<String> columns) {
            this.columns = columns;
        }
    }

    public ClaimsPopulate() {
        this.rows = new ArrayList<Column>();

        this.rows.add(new Column("A852/9", "Kingsbridge Risk Solutions", "KRS/11/5642", "666 Motor Trade (CMT)", "1/7/2011", "5,000.00 / 10,000,00", "The Insured allegedly mis-sold payment", "A Letter of Claim has been received and loss is put at £1,240"));
        this.rows.add(new Column("A852/9", "Kingsbridge Risk Solutions", "KRS/11/5642", "666 Motor Trade (CMT)", "1/7/2011", "5,000.00 / 10,000,00", "The Insured allegedly mis-sold payment", "A Letter of Claim has been received and loss is put at £1,240"));
        this.rows.add(new Column("A852/9", "Kingsbridge Risk Solutions", "KRS/11/5642", "666 Motor Trade (CMT)", "1/7/2011", "5,000.00 / 10,000,00", "The Insured allegedly mis-sold payment", "A Letter of Claim has been received and loss is put at £1,240"));
        this.rows.add(new Column("A852/9", "Kingsbridge Risk Solutions", "KRS/11/5642", "666 Motor Trade (CMT)", "1/7/2011", "5,000.00 / 10,000,00", "The Insured allegedly mis-sold payment", "A Letter of Claim has been received and loss is put at £1,240"));
        this.rows.add(new Column("A852/9", "Kingsbridge Risk Solutions", "KRS/11/5642", "666 Motor Trade (CMT)", "1/7/2011", "5,000.00 / 10,000,00", "The Insured allegedly mis-sold payment", "A Letter of Claim has been received and loss is put at £1,240"));
        this.rows.add(new Column("A852/9", "Kingsbridge Risk Solutions", "KRS/11/5642", "666 Motor Trade (CMT)", "1/7/2011", "5,000.00 / 10,000,00", "The Insured allegedly mis-sold payment", "A Letter of Claim has been received and loss is put at £1,240"));
        this.rows.add(new Column("A852/9", "Kingsbridge Risk Solutions", "KRS/11/5642", "666 Motor Trade (CMT)", "1/7/2011", "5,000.00 / 10,000,00", "The Insured allegedly mis-sold payment", "A Letter of Claim has been received and loss is put at £1,240"));
        this.rows.add(new Column("A852/9", "Kingsbridge Risk Solutions", "KRS/11/5642", "666 Motor Trade (CMT)", "1/7/2011", "5,000.00 / 10,000,00", "The Insured allegedly mis-sold payment", "A Letter of Claim has been received and loss is put at £1,240"));
        this.rows.add(new Column("A852/9", "Kingsbridge Risk Solutions", "KRS/11/5642", "666 Motor Trade (CMT)", "1/7/2011", "5,000.00 / 10,000,00", "The Insured allegedly mis-sold payment", "A Letter of Claim has been received and loss is put at £1,240"));
        this.rows.add(new Column("A852/9", "Kingsbridge Risk Solutions", "KRS/11/5642", "666 Motor Trade (CMT)", "1/7/2011", "5,000.00 / 10,000,00", "The Insured allegedly mis-sold payment", "A Letter of Claim has been received and loss is put at £1,240"));
        this.rows.add(new Column("A852/9", "Kingsbridge Risk Solutions", "KRS/11/5642", "666 Motor Trade (CMT)", "1/7/2011", "5,000.00 / 10,000,00", "The Insured allegedly mis-sold payment", "A Letter of Claim has been received and loss is put at £1,240"));
        this.rows.add(new Column("A852/9", "Kingsbridge Risk Solutions", "KRS/11/5642", "666 Motor Trade (CMT)", "1/7/2011", "5,000.00 / 10,000,00", "The Insured allegedly mis-sold payment", "A Letter of Claim has been received and loss is put at £1,240"));
        this.rows.add(new Column("A852/9", "Kingsbridge Risk Solutions", "KRS/11/5642", "666 Motor Trade (CMT)", "1/7/2011", "5,000.00 / 10,000,00", "The Insured allegedly mis-sold payment", "A Letter of Claim has been received and loss is put at £1,240"));


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
