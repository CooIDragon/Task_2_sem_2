package ru.vsu.cs.baturin_v_a;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.vsu.cs.baturin_v_a.util.LinkedListUtils;

public class RemovingNeighborsOfPrimesTest {

    RemovingNeighborsOfPrimes removingNeighborsOfPrimes = new RemovingNeighborsOfPrimes();

    @Test
    public void testFirstPrime() throws IllegalStateException {
        int[] arr = {3, 4, 6, 8, 10};

        SimpleLinkedList<Integer> list = LinkedListUtils.intArrayToList(arr);

        removingNeighborsOfPrimes.removeNeighborsOfPrimes(list);

        int[] expectedResult = {3, 6, 8, 10};
        int[] factualResultInArray = LinkedListUtils.intListToArray(list);

        Assertions.assertArrayEquals(expectedResult, factualResultInArray);
    }

    @Test
    public void testLastPrime() throws IllegalStateException {
        int[] arr = {4, 6, 8, 10, 3};

        SimpleLinkedList<Integer> list = LinkedListUtils.intArrayToList(arr);

        removingNeighborsOfPrimes.removeNeighborsOfPrimes(list);

        int[] expectedResult = {4, 6, 8, 3};
        int[] factualResultInArray = LinkedListUtils.intListToArray(list);

        Assertions.assertArrayEquals(expectedResult, factualResultInArray);
    }

    @Test
    public void testAllPrime() throws IllegalStateException {
        int[] arr = {3, 5, 7, 11, 13};

        SimpleLinkedList<Integer> list = LinkedListUtils.intArrayToList(arr);

        removingNeighborsOfPrimes.removeNeighborsOfPrimes(list);

        int[] expectedResult = {3, 5, 7, 11, 13};
        int[] factualResultInArray = LinkedListUtils.intListToArray(list);

        Assertions.assertArrayEquals(expectedResult, factualResultInArray);
    }

    @Test
    public void testLeftNotPrime() throws IllegalStateException {
        int[] arr = {8, 4, 6, 3, 5};

        SimpleLinkedList<Integer> list = LinkedListUtils.intArrayToList(arr);

        removingNeighborsOfPrimes.removeNeighborsOfPrimes(list);

        int[] expectedResult = {8, 4, 3, 5};
        int[] factualResultInArray = LinkedListUtils.intListToArray(list);

        Assertions.assertArrayEquals(expectedResult, factualResultInArray);
    }

    @Test
    public void testRightNotPrime() throws IllegalStateException {
        int[] arr = {5, 3, 6, 8, 10};

        SimpleLinkedList<Integer> list = LinkedListUtils.intArrayToList(arr);

        removingNeighborsOfPrimes.removeNeighborsOfPrimes(list);

        int[] expectedResult = {5, 3, 8, 10};
        int[] factualResultInArray = LinkedListUtils.intListToArray(list);

        Assertions.assertArrayEquals(expectedResult, factualResultInArray);
    }

}