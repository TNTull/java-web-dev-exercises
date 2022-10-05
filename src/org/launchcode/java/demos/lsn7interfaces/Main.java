//Teresa Tull worked on this on 10-5-2022

package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        ArrayList<Topping> toppings = menu.getToppings();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.
        System.out.println("\nFlavors before sort ");
        for (int i = 0; i < flavors.size(); i++)
        {
            System.out.println(flavors.get(i).getName());
        }

        Comparator comparator = new FlavorComparator();
        flavors.sort(comparator);

        System.out.println("\nFlavors after alphabetical sort ");
        for (int i = 0; i < flavors.size(); i++)
        {
            System.out.println(flavors.get(i).getName());
        }

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.
        System.out.println("\nCones before sort ");
        for (int i = 0; i < cones.size(); i++)
        {
            System.out.println(cones.get(i).getName());
        }

        cones.sort(new ConeComparator());

        System.out.println("\nCones after sort by cost ");
        for (int i = 0; i < cones.size(); i++)
        {
            System.out.println(cones.get(i).getName());
        }

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.


        System.out.println("\nToppings before sort by cost ");
        for (int i = 0; i < toppings.size(); i++)
        {
            System.out.println(toppings.get(i).getName());
        }

        toppings.sort(new ToppingComparator());
        System.out.println("\nToppings after sort ");
        for (int i = 0; i < toppings.size(); i++)
        {
            System.out.println(toppings.get(i).getName());
        }

    }
}
