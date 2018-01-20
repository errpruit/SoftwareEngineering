import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class Linked_ListTest {
    
    public Linked_ListTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }

    /**
     * Test of next method, of class Linked_List.
     */
    @Test
    public void testNext() {
        Linked_List<Integer> myList = new Linked_List<>(1);
        assertEquals(null, myList.next());
        Linked_List<Integer> myList2 = new Linked_List<>(2);
        myList.append(myList2);
        assertEquals(myList2, myList.next());
        assertEquals(null, myList2.next());
    }

    /**
     * Test of last method, of class Linked_List.
     */
    @Test
    public void testLast() {
        Linked_List<Integer> myList = new Linked_List<>(1);
        Linked_List<Integer> myList2 = new Linked_List<>(2);
        Linked_List<Integer> myList3 = new Linked_List<>(3);
        assertEquals(myList, myList.last());
        myList.append(myList2);
        assertEquals(myList2, myList.last());
        myList.append(myList3);
        assertEquals(myList3, myList.last());
    }

    /**
     * Test of after method, of class Linked_List.
     */
    @Test
    public void testAfter() {
        Linked_List<Integer> myList = new Linked_List<>(1);
        Linked_List<Integer> myList2 = new Linked_List<>(2);
        Linked_List<Integer> myList3 = new Linked_List<>(3);
        Linked_List<Integer> myList4 = new Linked_List<>(4);
        Linked_List<Integer> myList5 = new Linked_List<>(5);
        Linked_List<Integer> myList6 = new Linked_List<>(6);
        myList.append(myList2);
        myList.append(myList3);
        myList.append(myList4);
        myList.append(myList5);
        myList.append(myList6);
        assertEquals(myList4, myList.after(3));
    }

    /**
     * Test of detach method, of class Linked_List.
     */
    @Test
    public void testDetach() {
        Linked_List<Integer> myList = new Linked_List<>(1);
        Linked_List<Integer> myList2 = new Linked_List<>(2);
        Linked_List<Integer> myList3 = new Linked_List<>(3);
        Linked_List<Integer> myList4 = new Linked_List<>(4);
        Linked_List<Integer> myList5 = new Linked_List<>(5);
        Linked_List<Integer> myList6 = new Linked_List<>(6);
        myList.append(myList2);
        myList.append(myList3);
        myList.append(myList4);
        myList.append(myList5);
        myList.append(myList6);
        assertEquals(myList2, myList.detach());
    }

    /**
     * Test of get method, of class Linked_List.
     */
    @Test
    public void testGet() {
        Linked_List<Integer> myList = new Linked_List<>(1);
        Linked_List<Integer> myList2 = new Linked_List<>(2);
        Linked_List<Integer> myList3 = new Linked_List<>(3);
        Linked_List<Integer> myList4 = new Linked_List<>(4);
        Linked_List<Integer> myList5 = new Linked_List<>(5);
        Linked_List<Integer> myList6 = new Linked_List<>(6);
        myList.append(myList2);
        myList.append(myList3);
        myList.append(myList4);
        myList.append(myList5);
        myList.append(myList6);
        assertEquals(myList.element, myList.get());
        assertEquals(myList.next.element, myList2.get());
        assertEquals(myList.next.next.element, myList3.get());
    }

    /**
     * Test of set method, of class Linked_List.
     */
    @Test
    public void testSet() {
        Linked_List<Integer> myList = new Linked_List<>(1);
        myList.set(2);
        int expected = 2;
        assertEquals((Object)2, myList.get());
        
    }

    /**
     * Test of setNext method, of class Linked_List.
     */
    @Test
    public void testSetNext() {
        Linked_List<Integer> myList = new Linked_List<>(1);
        Linked_List<Integer> myList2 = new Linked_List<>(2);
        Linked_List<Integer> myList3 = new Linked_List<>(3);
        Linked_List<Integer> myList4 = new Linked_List<>(4);
        Linked_List<Integer> myList5 = new Linked_List<>(5);
        Linked_List<Integer> myList6 = new Linked_List<>(6);
        myList.append(myList2);
        myList.append(myList3);
        myList.append(myList4);
        myList.append(myList5);
        myList.append(myList6);
        myList.setNext(myList6);
        assertEquals(myList6, myList.next);
    }

    /**
     * Test of append method, of class Linked_List.
     */
    @Test
    public void testAppend() {
        Linked_List<Integer> myList = new Linked_List<>(1);
        Linked_List<Integer> myList2 = new Linked_List<>(2);
        myList.append(myList2);
        assertEquals(myList2, myList.next());
    }

    /**
     * Test of insert method, of class Linked_List.
     */
    @Test
    public void testInsert() {
        Linked_List<Integer> myList = new Linked_List<>(1);
        Linked_List<Integer> myList2 = new Linked_List<>(2);
        Linked_List<Integer> myList3 = new Linked_List<>(3);
        Linked_List<Integer> myList4 = new Linked_List<>(4);
        Linked_List<Integer> myList5 = new Linked_List<>(5);
        Linked_List<Integer> myList6 = new Linked_List<>(6);
        myList.append(myList2);
        myList.append(myList3);
        myList.append(myList4);
        myList.append(myList5);
        myList.insert(myList6);
        assertEquals((Object)6, myList6.get());
        assertEquals(myList, myList6.next());
        assertEquals(myList5, myList6.last());
        
    }
    
}
