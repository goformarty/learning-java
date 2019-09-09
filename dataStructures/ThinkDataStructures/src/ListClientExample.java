import java.util.LinkedList;
import java.util.List;

public class ListClientExample {

    private List list;

    public ListClientExample() {
        list = new LinkedList();
    }

    public List getList() {
        return list;
    }

    public static void main(String[] Args) {
        ListClientExample lce = new ListClientExample();
        List list = lce.getList();
        System.out.println(list);
    }
}

