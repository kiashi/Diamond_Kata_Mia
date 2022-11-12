/*
 * Copyright (c) 2022. Miahinantenaina RAFEHIVOLA
 * All rights reserved.
 *
 */

package org.kata.diamond.record;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toCollection;

public record Diamond() {

    public static String buildDiamond(String a) {
        var alphabetSequence = getSequence.apply(a);
        var diamonds = initDiamond.apply(alphabetSequence);
        return testExtraction
                .andThen(toDiamond)
                .apply(alphabetSequence,diamonds);
    }

    private static final Function<String, String> getSequence = character ->
            Pattern.compile("").splitAsStream("abcdefghijklmnopqrstuvwxyz")
                .limit((long) Character.toLowerCase(character.charAt(0)) -96)
                .collect(Collectors.joining()).toUpperCase();

    private static final Function<String, List<String[]>> initDiamond = tab ->
            IntStream.range(0 , tab.length() *2)
                .mapToObj(s -> new String[tab.length() *2])
                    .collect(toCollection(ArrayList::new));

    private static final Function<List<String[]>, String> toDiamond = arrays ->
            arrays.stream()
                    .peek(r -> Arrays.asList(r).replaceAll(a -> Objects.isNull(a) ? " " : a))
                    .map(s -> String.join("", s) + "\n")
                    .collect(Collectors.joining());

    private static final BiFunction<String, List<String[]>, List<String[]>> testExtraction = (alphabetSequence, diamonds) -> {
        var diamondList = new ArrayList<>(diamonds);
        var diamondLength = alphabetSequence.length() *2;
        var lastPosition = diamondLength - 1;
        var firstPosition = lastPosition / 2;

        IntStream.range(0 , diamondLength / 2).forEachOrdered(s ->{
            var firstArray = new String[lastPosition];
            firstArray[firstPosition -s] = String.valueOf(alphabetSequence.charAt(s));
            firstArray[firstPosition +s] = String.valueOf(alphabetSequence.charAt(s));
            diamondList.set(s,firstArray);
            diamondList.set(lastPosition -s,firstArray);
        });

        diamondList.remove(firstPosition + 1);
        return diamondList;
    };
}
