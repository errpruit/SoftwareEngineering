public class Linked_List<T> implements ILinkedList<T> {
    
    public T element;
    public Linked_List<T> next;
    //public Linked_List<T> head;
    
    public Linked_List(T element){
        this.next = null;
        this.element = element;
    }
    
    
    /**
     * Get the next list element
     * @return the next element
     */
    @Override
    public Linked_List<T> next(){
        return this.next;
    }

    /**
     * Gets the last element in the list
     * @return the node at the end of the list
     */
    @Override
    public Linked_List<T> last(){
        Linked_List<T> current = this;
        while(current.next != null){
            current = current.next;
        }
        return current;
    }

    /**
     * Get the element n elements down the list
     * @param n the number of elements to skip
     * @return the element n away
     */
    @Override
    public Linked_List<T> after(int n){
        Linked_List<T> current = this;
        for(int i = 0; i < n; i++){
            current = current.next;
        }
        return current;
    }

    /**
     * Removes the next element (sets null)
     * @return the previously next element
     */
    @Override
    public Linked_List<T> detach(){
        Linked_List<T> x = this.next;
        this.next = null;
        return x;
    }

    /**
     * Gets the current value
     * @return the current value
     */
    @Override
    public T get(){
        T value = this.element;
        return value;
    }

    /**
     * Sets the value of this node
     * @param value the new value
     */
    @Override
    public void set(T value){
        this.element = value;
    }

    /**
     * Sets the next element in the list
     * @param next the next element
	 *
	 * Example: (1->2->3).setNext(4) => 1->4
     */
    @Override
    public void setNext(Linked_List<T> next){
        this.next = next;
    }

    /**
     * Sets the next element after this current element
     * @param next the next element
	 *
	 * Example: (1->2->3).append(4) => 1->2->3->4
     */
    @Override
    public void append(Linked_List<T> next){
        Linked_List<T> current = this;
        while(current.next != null){
            current = current.next;
        }
        current.next = next;
    }

    /**
     * Adds the current list as the next of newFirst
     * @param newFirst the new head of the list
	 *
	 * Example: (1->2->3).insert(4) => 4->1->2->3
     */
    @Override
    public void insert(Linked_List<T> newFirst){
        newFirst.next = this;
    }
    
}

