package Class27_Wrapper;

public class Demo2 {
    public static void main(String[] args) {
        String findName="Nat";
        String []names={"Hiral", "Nima","Nat"};

        System.out.println(contains(names,findName));
    }
    public static boolean contains(String[] names, String FindName) {
        for (String name : names) {
            if (name.equals(FindName)) {
                return true;
            }
        }
        return false;
    }
}
