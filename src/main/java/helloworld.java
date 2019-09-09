import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class helloworld {
    public helloworld() {


        System.out.println("ksiazka telefoniczna");

        String imie = "ImieTestowe";
        int numer = 12345;

        System.out.println("wprowadz imie");
        Scanner objosoba = new Scanner(System.in);
        String nameUser = objosoba.nextLine();
        System.out.println("wprwadz numer");
        Scanner numOsoboa = new Scanner(System.in);
        Integer numerOsoba = numOsoboa.nextInt();

        System.out.println("Wprowadz imie " + imie);

        System.out.println("user name " + nameUser + '\n'+ " numer " + numerOsoba);





        //lista

        LinkedList<String> object = new LinkedList<String>();

        // Adding elements to the linked list
        object.add("Asia 345");
        object.add("Basia 567");
        object.addLast("Marysia 6");
        object.addFirst("Darek");
        object.add(2, "Edward");
        object.add("Filip");
        object.add("Grzegorz");
        System.out.println("Linked list : " + object);

        // Removing elements from the linked list
        //object.remove("B");
        //object.remove(3);
       // object.removeFirst();
       // object.removeLast();
      //  System.out.println("Linked list after deletion: " + object);

        // Finding elements in the linked list
        String nazwaszukana = "F";
        System.out.println("czego szukasz");
        Scanner objosoba2 = new Scanner(System.in);
        System.out.println(objosoba2);
        Scanner nazwaszukana2 = new Scanner(System.in);
        String nowa = nazwaszukana2.nextLine();

        boolean status = object.contains(nowa);

        if(status)
            System.out.println("List contains the element " + nowa);
        else
            System.out.println("List doesn't contain the element " + nowa);

        // Number of elements in the linked list
        int size = object.size();
        System.out.println("Size of linked list = " + size);

        // Get and set elements from linked list
        Object element = object.get(2);
        System.out.println("Element returned by get() : " + element);
        object.set(2, "Y");
        System.out.println("Linked list after change : " + object);
    }



    public static void main(String[] args) {

        // test
// czas wykonywania sie metody

        Date now = new Date();
        System.out.println(now);

        new helloworld();
        Date lStop = new Date();
            System.out.println("Time of execution in seconds:" + ((lStop.getTime() - now.getTime()) / 1000));


    }

    }


