import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.CellStyle;
import org.nocrala.tools.texttablefmt.ShownBorders;
import org.nocrala.tools.texttablefmt.Table;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

public class Person implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
     String name;
     String address;
     String gender;
     int age;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAgs(int ags) {
        this.age = ags;
    }

    public  Person(String name, String address, String gender, int ags ){
        final long serialVersionUID = -5566079514347513916L;
         this.address = address;
         this.name = name;
         this.gender = gender;
         this.age = ags;
     }



}
