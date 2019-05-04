import com.sun.istack.internal.NotNull;

import javax.transaction.Transactional;
import java.util.Objects;

public class ClassAParent implements Parent{

    private  String name;
    private Object value;
    private final String data;
    //String data;

    public ClassAParent(final String value) {
        System.out.println("class ClassAParent is init");
        this.data = value;
    }

    public Integer casting(ClassBChild s) {
        return 123;
    }

    public void callCasting() {
        Object b = new ClassBChild("123");
        if (b instanceof ClassBChild) {
            casting((ClassBChild)b);
        }
    }

    /*public ClassAParent(final String value, final String name) {
        System.out.println("class ClassAParent is init");
        this.name = name;
        this.value = value;
    }*/

    @Transactional
    public void addNewValue(@NotNull final String data) {
        if (Objects.isNull(data)) throw new IllegalArgumentException("data must be a set");
    }

    public String getName() {
        return name;
    }

    private final String constant = "const";

    public final String getName(final String str) {

        return "test";
    }

    @Override
    public String toString() {
        return "ClassAParent{" +
                "name='" + name + '\'' +
                ", value=" + value +
                ", data='" + data + '\'' +
                ", constant='" + constant + '\'' +
                '}';
    }
}
