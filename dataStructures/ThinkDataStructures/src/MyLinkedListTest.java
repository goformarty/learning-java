import java.util.ArrayList;
import java.util.List;

import org.junit.Before;

public class MyLinkedListTest extends MyArrayListTest{

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {

        list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        mylist = new MyLinkedList<Integer>();
        mylist.addAll(list);
    }
}
