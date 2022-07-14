import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedListDema {
    public static void main(String[] args) {
        LinkedList<String> placeToVisit = new LinkedList<String>();
//        placeToVisit.add("Los Angeles");
//        placeToVisit.add("Bay Area");
//        placeToVisit.add("Santa Monica");
//        placeToVisit.add("Santa Babara");
//        placeToVisit.add("San Diege");
//        placeToVisit.add("Irvine");

        addInOrder(placeToVisit, "Los Angeles");
        addInOrder(placeToVisit, "San Diego");
        addInOrder(placeToVisit, "Irvine");
        addInOrder(placeToVisit, "Arcadia");
        addInOrder(placeToVisit, "Pasadena");

        printList(placeToVisit);
        visit(placeToVisit);




    }

    public static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()){
            System.out.println("Now visiting: " + i.next());
        }
        System.out.println("=============================");
    }
    public static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while(stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity);
            if(comparison == 0){
                //equal do not add
                System.out.println(newCity + " is already included.");
                return false;
            } else if (comparison > 0) {
                //new city should appear before this one
                //Brisbane -> Adelaide
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }
            else if(comparison < 0){
                //move on next city
            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities) {
        Scanner scanner = new Scanner(System.in);
        ListIterator<String> listIterator = cities.listIterator();

        boolean quit = false;
        boolean goingForward = true;
        while(!quit){
            int opt = scanner.nextInt();
            scanner.nextLine();
            switch (opt){
                case 0:
                    System.out.println("To quit");
                    quit = true;
                    break;

                case 1:
                    if(!goingForward) {
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Visiting: "+listIterator.next());
                    }
                    else{
                        System.out.println("It's the last city.");
                        goingForward = false;
                    }
                    break;

                case 2:
                    if(goingForward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Visiting: " + listIterator.previous());
                    }
                    else {
                        System.out.println("It's the first city");
                        goingForward = true;
                    }
                    break;

                default:
                    break;
            }
        }
    }
}
