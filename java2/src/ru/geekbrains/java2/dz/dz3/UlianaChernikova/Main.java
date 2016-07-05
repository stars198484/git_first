//package UlianaChernikova;
package ru.geekbrains.java2.dz.dz3.UlianaChernikova;

import java.util.*;

/**
 * Created by Uliana on 15.06.2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        int i = 0;

        boolean quite = true;
        List<Passanger> passangers = new ArrayList();
        Map<String, ArrayList<Passanger>> flightMap = new TreeMap();

        while (quite) {
            Passanger p1 = new Passanger();
            System.out.println("Input passengers name");
            String name = sc.next();
            System.out.println("Input passport number");
            Integer passport = sc.nextInt();
            System.out.println("Input flight number");
            String flight = sc.next();
            p1.setpName(name);

            p1.setpPassport(passport);
            ArrayList<Passanger> lst;
            if (flightMap.containsKey(flight)) {
                lst = flightMap.get(flight);
            } else {
                lst = new ArrayList<>();
                flightMap.put(flight, lst);
            }
            lst.add(p1);

            i++;
            if (i == 2) quite = false;
        }


        for (Map.Entry<String, ArrayList<Passanger>> entry : flightMap.entrySet()) {
            String key = entry.getKey();
            ArrayList<Passanger> value = entry.getValue();
            value.sort(new Comparator<Passanger>() {
                @Override
                public int compare(Passanger o1, Passanger o2) {
                    return (o1.getpName().compareToIgnoreCase(o2.getpName()));

                }
            });
            System.out.println(key + "\t" + Arrays.toString(value.toArray()));

        }

    }
}


