public interface Parent {
    public final static String param1 = "valu";

    default String getName() {
     return "name";
    }

}
