package ru.vsu.cs.baturin_v_a;

public class RemovingNeighborsOfPrimes {

    private boolean isNumPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void removeNeighborsOfPrimes(SimpleLinkedList<Integer> list) {
        if (isNumPrime(list.getLast()) && !isNumPrime(list.get(list.size() - 2))) {
            list.remove(list.size() - 2);
        }

        if (isNumPrime(list.getFirst()) && !isNumPrime(list.get(1))) {
            list.remove(1);
        }

        for (int i = 1; i < list.size() - 1; i++) {
            if (!isNumPrime(list.get(i - 1)) && isNumPrime(list.get(i)) && !isNumPrime(list.get(i + 1))) {
                list.remove(i - 1);
                list.remove(i);
                i--; //Сдвигаем очередь, так как иначе пропустим элемент(индекс сдвигается)
            } else if (!isNumPrime(list.get(i - 1)) && isNumPrime(list.get(i)) && isNumPrime(list.get(i + 1))) {
                list.remove(i - 1);
                i--; //Сдвигаем очередь, так как иначе пропустим элемент(индекс сдвигается)
            } else if (isNumPrime(list.get(i - 1)) && isNumPrime(list.get(i)) && !isNumPrime(list.get(i + 1))) {
                list.remove(i + 1);
            }
        }
    }
}
