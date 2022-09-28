package com.keyin.qap1;

public class QAPExample {
    public boolean findSequenceInWord(String wordToFind, String charSequence) {
    return charSequence.contains(wordToFind);
    }

    public boolean doesEqualTen(int firstNumber, int numToAdd) {
        return ((firstNumber + numToAdd) == 10);
    }
}
