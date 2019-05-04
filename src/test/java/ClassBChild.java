import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "USER_ACCOUNT")

public class ClassBChild extends ClassAParent {
    public ClassBChild(String value) {
        super(value);
    }

    /*public ClassBChild(final String value, final String name) {
        super(value, name);
        //super("1", "2");
        System.out.println("class ClassBChild init");

    }
*/


    public void test() {
        String value = getName("sds");
    }

    public static void main(String[] args) {
        /*List<? super ClassBChild> list = new ArrayList<>()
        list.add(new ClassAParent());
        list.add(new ClassBChild());*/
        ClassBChild child = new ClassBChild("123");
    }


}
