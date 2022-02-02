public class Test {
    public static void main(String[] args){
        Person[] people = new Person[4];
        people[0] = new Person("Helen Brown", "222 10th Street Bethlehem", "610-334-2288", "hbrown@gmail.com");
        people[1] = new Student("Paul Leister", "972 4th Street Allentown", "610-331-7177", "pleister@gmail.com", 12345, "CSE");
        people[2] = new Employee("Beth Down", "234 Main Street Philadelphia", "484-222-4433", "bdown@gmail.com", 33442, "Systems Administrator", 75000);
        people[3] = new Faculty("Mark Jones", "21 Orchid Street Bethlehem", "610-333-2211", "mjones@gmail.com", 22222, "Faculty", 90000, "Associate Professor");
        System.out.println("=======Original List=======");
        printArray(people);
        System.out.println("=======Sorted Array!=======");
        sortArray(people);
        printArray(people);
    }

    //Sorts people by name length
    public static void sortArray(Person[] list){
        for(int i=0; i<list.length; i++){
          int minIndex = i;
          for(int j=i+1; j<list.length; j++)     
               if(list[j].getName().length() < list[minIndex].getName().length())
                     minIndex=j;
          Person temp = list[i];
          list[i] = list[minIndex];
          list[minIndex] = temp;
        }
}


    public static void printArray(Person[] list){
        for(int i = 0; i<list.length; i++){
            System.out.println(list[i].toString());
        }
    }

    
}
