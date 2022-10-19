
package Model;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author HP
 */
public class CaTruc {
    String MacaTruc;
    Time giobatdau;
    Time Gioketca;

    public CaTruc() {
    }

    public CaTruc(String MacaTruc, Time giobatdau, Time Gioketca) {
        this.MacaTruc = MacaTruc;
        this.giobatdau = giobatdau;
        this.Gioketca = Gioketca;
    }

    public String getMacaTruc() {
        return MacaTruc;
    }

    public void setMacaTruc(String MacaTruc) {
        this.MacaTruc = MacaTruc;
    }

    public Time getGiobatdau() {
        return giobatdau;
    }

    public void setGiobatdau(Time giobatdau) {
        this.giobatdau = giobatdau;
    }

    public Time getGioketca() {
        return Gioketca;
    }

    public void setGioketca(Time Gioketca) {
        this.Gioketca = Gioketca;
    }
    public List<String> getEntity()
    {
        List<String> list = new ArrayList<>();
        list.add("MaCaTruc");
        list.add("GioDatDau");
        list.add("GioKetCa");
        return list;
    }
   
   
}
