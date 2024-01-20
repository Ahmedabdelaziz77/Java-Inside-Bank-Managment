/*
    Elzoz
 */
package Database;

import atm.MainMenu;
import java.sql.*;
import javax.swing.*;

public class MyDb {
    private static final String DATABASE_NAME = "atmdb";
    private static final String DATABASE_USER_NAME = "root";
    private static final String DATABASE_PASSWORD = "";
    private static final String URL = "jdbc:mysql://localhost:3306/" + DATABASE_NAME + "?useUnicode=yes&characterEncoding=UTF-8";//FOR ENTER ARABIC DATA
    private static Connection conn;
    private static ResultSet resultSet;
    private static PreparedStatement pstatement;
    private static Statement st;
    private Object frame;

    private Connection connectToDB() throws SQLException {  
         
        conn = DriverManager.getConnection(URL, DATABASE_USER_NAME, DATABASE_PASSWORD);//i made it private because can't all class make access to it , make it more secure
      
        return conn;
    }
       //in function there 9 parameters 
    
    public  int InsertATM(String ACCNUMTb, String ACCNAMETb, String FANAMETb, String Dob, String PHONETb, String ADDRESSTb, String EDUTb, String OCCUPATIONTb, int PINTb) throws SQLException {
        int updated=0;
        try {
            pstatement = connectToDB().prepareStatement("INSERT INTO accounttbl (AccNum, AccName, FaName,Dob, Phone,Address,Education, Occupation,Balance,PIN)  VALUES ( ?, ?, ?, ? , ? , ? , ? , ? , ?, ?)");
            pstatement.setInt(1, Integer.valueOf(ACCNUMTb));
            pstatement.setString(2, ACCNAMETb);
            pstatement.setString(3, FANAMETb);
            pstatement.setString(4, Dob);
            pstatement.setString(5, PHONETb);
            pstatement.setString(6, ADDRESSTb);
            pstatement.setString(7, EDUTb);
            pstatement.setString(8, OCCUPATIONTb);
            pstatement.setInt(9, 0);
            pstatement.setInt(10, PINTb);
            
           updated =pstatement.executeUpdate();
        } 
        catch (NumberFormatException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } 
        finally {
            pstatement.close();
            connectToDB().close();
        }
        return updated;
    }
    //------
    /*
    public int LoginPage(String UNAMETb, int PASSWORDTb)
    {
        int updated =0;
        String query = "select * from accounttbl where AccName = ? and PIN = ?";
        try{    
            pstatement = connectToDB().prepareStatement(query);
            pstatement.setString(1, UNAMETb);
            pstatement.setInt(2, PASSWORDTb);
            resultSet = pstatement.executeQuery();
            if(resultSet.next())
            {
                new MainMenu().setVisible(true);
                frame.dispose();
            }
            else
            {
                JOptionPane.showMessageDialog(null, " Wrong Account Number Or PIN ");
            }
        }
        catch (NumberFormatException | SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } 
        catch (Exception ex) 
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        finally 
        {
            pstatement.close();
            connectToDB().close();
        }
        return updated;
    }

    */
    
    
    
    
    
    
    

}
