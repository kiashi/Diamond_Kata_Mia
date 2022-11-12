/*
 * Copyright (c) 2022. Miahinantenaina RAFEHIVOLA
 * All rights reserved.
 *
 */

package org.kata.diamond;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.kata.diamond.record.Diamond;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("#- Test Build Diamond")
public class DiamondTests {

    @Test
    @DisplayName("A Diamond")
    public void testDiamondA(){
        var diamondsA = Diamond.buildDiamond("a");

        assertEquals(diamondsA,
                """        
                         A
                         """);
    }

    @Test
    @DisplayName("B Diamond")
    public void testDiamondB(){
        var diamondsB = Diamond.buildDiamond("B");

        assertEquals(diamondsB,
                """        
                         A\s
                        B B
                         A\s
                         """);
    }

    @Test
    @DisplayName("E Diamond")
    public void testDiamondE(){
        var diamondsE = Diamond.buildDiamond("e");

        assertEquals(diamondsE,
        """        
                    A   \s
                   B B  \s
                  C   C \s
                 D     D\s
                E       E
                 D     D\s
                  C   C \s
                   B B  \s
                    A   \s
                    """);
    }

    @Test
    @DisplayName("T Diamond")
    public void testDiamondT(){
        var diamondsT = Diamond.buildDiamond("T");

        assertEquals(diamondsT,
                """        
                                           A                  \s
                                          B B                 \s
                                         C   C                \s
                                        D     D               \s
                                       E       E              \s
                                      F         F             \s
                                     G           G            \s
                                    H             H           \s
                                   I               I          \s
                                  J                 J         \s
                                 K                   K        \s
                                L                     L       \s
                               M                       M      \s
                              N                         N     \s
                             O                           O    \s
                            P                             P   \s
                           Q                               Q  \s
                          R                                 R \s
                         S                                   S\s
                        T                                     T
                         S                                   S\s
                          R                                 R \s
                           Q                               Q  \s
                            P                             P   \s
                             O                           O    \s
                              N                         N     \s
                               M                       M      \s
                                L                     L       \s
                                 K                   K        \s
                                  J                 J         \s
                                   I               I          \s
                                    H             H           \s
                                     G           G            \s
                                      F         F             \s
                                       E       E              \s
                                        D     D               \s
                                         C   C                \s
                                          B B                 \s
                                           A                  \s
                         """);
    }
}
