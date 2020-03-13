import java.util.ArrayList;

class main {
    public static void main(String[] args) {
        ArrayList<Integer>[] hashtable = new ArrayList[10];
        for (int i = 0; i < hashtable.length; i++) hashtable[i] = new ArrayList<Integer>();
        int key =  hash(5, hashtable);
        addtotable(key, 10, hashtable);
        addtotable(key, 12, hashtable);
        System.out.println(searchintable(key, 12, hashtable));

        ArrayList<Integer> cells = new ArrayList<Integer>();

    }


        public static int hash(int k, ArrayList<Integer>[] arr) {
            return k % arr.length;
        }

        public static void addtotable(int key, int value, ArrayList<Integer>[] arr) {
            arr[key].add(value);
        }

        public static int searchintable(int key, int value, ArrayList<Integer>[] item) {
            for (int i = 0; i < item[key].size(); i++) if (item[key].get(i) == value) return item[key].get(i);
            return -1;
        }




}