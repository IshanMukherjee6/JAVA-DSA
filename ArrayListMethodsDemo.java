import java.util.*;

public class ArrayListMethodsDemo {
    public static void main(String[] args) {

        // 1️⃣ Create an ArrayList
        ArrayList<String> list = new ArrayList<>();

        // ----- Adding Elements -----
        list.add("Apple");                  // add(E e)
        list.add("Banana");
        list.add(1, "Mango");               // add(int index, E e)
        System.out.println("After add: " + list);

        ArrayList<String> extra = new ArrayList<>();
        extra.add("Cherry");
        extra.add("Orange");
        list.addAll(extra);                 // addAll(Collection)
        list.addAll(2, Collections.singleton("Kiwi")); // addAll(int, Collection)
        System.out.println("After addAll: " + list);

        // ----- Accessing Elements -----
        System.out.println("Get index 2: " + list.get(2)); // get(int)
        System.out.println("Contains Mango? " + list.contains("Mango")); // contains(Object)
        System.out.println("Index of Mango: " + list.indexOf("Mango"));  // indexOf(Object)
        System.out.println("Last index of Banana: " + list.lastIndexOf("Banana")); // lastIndexOf(Object)
        System.out.println("Is Empty? " + list.isEmpty()); // isEmpty()
        System.out.println("Size: " + list.size());        // size()

        // ----- Updating Elements -----
        list.set(2, "Grapes");           // set(int, E)
        System.out.println("After set: " + list);

        // ----- Removing Elements -----
        list.remove("Kiwi");             // remove(Object)
        list.remove(3);                  // remove(int)
        System.out.println("After remove: " + list);

        list.removeAll(Collections.singleton("Banana"));  // removeAll(Collection)
        System.out.println("After removeAll: " + list);

        list.retainAll(Collections.singleton("Apple"));   // retainAll(Collection)
        System.out.println("After retainAll: " + list);

        // Add elements back for further methods
        list.clear();                    // clear()
        System.out.println("After clear: " + list);

        list.addAll(Arrays.asList("A", "B", "C", "D"));
        System.out.println("New List: " + list);

        // ----- Iteration -----
        System.out.print("Using iterator: ");
        Iterator<String> it = list.iterator();     // iterator()
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // ListIterator (forward & backward)
        ListIterator<String> litr = list.listIterator();  // listIterator()
        System.out.print("ListIterator forward: ");
        while (litr.hasNext()) {
            System.out.print(litr.next() + " ");
        }
        System.out.println();

        System.out.print("ListIterator backward: ");
        while (litr.hasPrevious()) {
            System.out.print(litr.previous() + " ");
        }
        System.out.println();

        // ----- Sublist -----
        System.out.println("SubList(1,3): " + list.subList(1, 3)); // subList(from, to)

        // ----- Array Conversion -----
        Object[] arr = list.toArray();             // toArray()
        System.out.println("toArray: " + Arrays.toString(arr));

        String[] arr2 = list.toArray(new String[0]); // toArray(T[])
        System.out.println("toArray(T[]): " + Arrays.toString(arr2));

        // ----- Utility Methods -----
        Collections.sort(list);                    // Sorting
        System.out.println("Sorted: " + list);

        list.ensureCapacity(20);   // ensureCapacity(int)
        list.trimToSize();         // trimToSize()
        list.removeIf(s -> s.equals("B")); // removeIf(Predicate)
        System.out.println("After removeIf: " + list);

        list.replaceAll(s -> s + "!");  // replaceAll(UnaryOperator)
        System.out.println("After replaceAll: " + list);

        list.forEach(System.out::println); // forEach(Consumer)
    }
}
