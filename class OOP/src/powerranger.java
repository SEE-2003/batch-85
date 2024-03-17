import javax.naming.Name;
import javax.xml.namespace.QName;
import java.awt.*;
import java.util.jar.Attributes;

public class powerranger {

    private String name;

    private String color;

    private String helmet;

    private String weapon;

    public powerranger(String name, String color, String helmet, String weapon){

        this.name = name;
        this.color = color;
        this.helmet = helmet;
        this.weapon = weapon;

    }

    void powerranger() {
        System.out.println("the" + name + "is the excellent");
        System.out.println(color + "is attractive");
        System.out.println(helmet + " fullface");
        System.out.println(weapon + " ready to fire");
    }

    public static void main(String [] args) {
        powerranger obj1 = new powerranger("Gloria ", "red", "fireproof", "firespary");
        obj1.powerranger();
    }


}
