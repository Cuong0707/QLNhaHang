/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helper;

/**
 *
 * @author admin
 */
public class Edit {

    public void deLete(String nameEntity,String nameCol, String giatriSosanh)
    {
        String sql = "DELETE FROM "+nameEntity+" WHERE "+nameCol+" = ? ";
        ConnectDatabase.updateData(sql, giatriSosanh);
    }
}
