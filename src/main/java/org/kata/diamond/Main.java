/*
 * Copyright (c) 2022. Miahinantenaina RAFEHIVOLA
 * All rights reserved.
 *
 */

package org.kata.diamond;

import org.kata.diamond.record.Diamond;

public class Main {
    public static void main(String[] args) {

        System.out.println("--------------START MAIN DIAMOND KATA---------------");

        var diamondsI = Diamond.buildDiamond("I");
        System.out.println(diamondsI);

        /* RESULT Diamond I
                 A
                B B
               C   C
              D     D
             E       E
            F         F
           G           G
          H             H
         I               I
          H             H
           G           G
            F         F
             E       E
              D     D
               C   C
                B B
                 A

         */

        System.out.println("--------------X---------------");


        var diamondsG = Diamond.buildDiamond("g");
        System.out.println(diamondsG);

        /* RESULT Diamond G
                 A
                B B
               C   C
              D     D
             E       E
            F         F
           G           G
            F         F
             E       E
              D     D
               C   C
                B B
                 A
         */

        System.out.println("--------------THANKS---------------");
    }
}