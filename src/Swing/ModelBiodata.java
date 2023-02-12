/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Swing;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author Muh Ikhsan M
 */
public class ModelBiodata extends AbstractTableModel{

    public ArrayList<Biodata> listData = new ArrayList<>();
    public String[] colName = {"ID", "Nama", "Gender"};
    
    public void setListData(ArrayList<Biodata> listData){
        this.listData = listData;
        fireTableDataChanged();
    }
    
    @Override
    public int getRowCount() {
        return listData.size();
    }

    @Override
    public int getColumnCount() {
        return colName.length;
    }

    @Override
    public Object getValueAt(int row, int col) {
        switch (col) {
            case 0:
                return listData.get(row).getNomor();
            case 1:
                return listData.get(row).getNama();
            case 2:
                return listData.get(row).getGender();
            default:
                return null;
        }
    }

}
