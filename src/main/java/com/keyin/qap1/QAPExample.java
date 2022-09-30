package com.keyin.qap1;

public class QAPExample {
    public boolean findSequenceInWord(String wordToFind, String charSequence) {
    return charSequence.contains(wordToFind);
    }

    public boolean doesEqual(int firstNumber, int numToAdd, int numToEqual) {
        return ((firstNumber + numToAdd) == numToEqual);
    }


}
