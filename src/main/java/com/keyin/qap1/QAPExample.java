package com.keyin.qap1;

public class QAPExample {
    public boolean findSequenceInWord(String wordToFind, String charSequence) {
        return charSequence.contains(wordToFind);
    }

    public boolean doesEqual(int firstNumber, int numToAdd, int numToEqual) {
        return ((firstNumber + numToAdd) == numToEqual);
    }

    public String russianRoulette(int chamber){

        switch (chamber) {
            case 2 -> {
                System.out.println("BANG, You're Dead");
                return ("BANG");
            }
            case 1, 3, 4, 5, 6 -> {
                System.out.println("Click, You're Alive");
                return ("Click");
            }
        }
        return ("Please Enter Number 1-6");
    }


}
