package com.keyin.qap1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QAPExampleTest {

    @Test
    public void QAPExampleTest1(){
        QAPExample qapExample = new QAPExample();

        Assertions.assertTrue(qapExample.findSequenceInWord("find", "is_find_in_this_char_sequence"));
        // Ensures return statement is true that "find" is in the charSequence
        Assertions.assertFalse(qapExample.findSequenceInWord("find_me", "is_find_in_this_char_sequence"));
        // Ensures return statement is false that "find_me" is NOT in the charSequence
        Assertions.assertNotEquals(false, qapExample.findSequenceInWord("find_me", "find_me_in_your_dreams"));
        // Ensures return statement does NOT equal false so if the test is successful "find_me" is in the charSequence
    }

    @Test
    public void QAPExampleTest2(){
        QAPExample qapExample = new QAPExample();

        Assertions.assertTrue(qapExample.doesEqual(7,3, 10));
        // Ensures return statement is true that 7 + 3 = 10
        Assertions.assertFalse(qapExample.doesEqual(7,7, 10));
        // Ensures return statement is false because 7 + 7 != 10
        Assertions.assertSame(qapExample.doesEqual(40,5, 45), true);
        // Ensures return statement is the same as true. (40 + 5 = 45)
    }
    @Test
    public void QAPExampleTest3(){
        QAPExample qapExample = new QAPExample();
        Assertions.assertEquals("BANG", qapExample.russianRoulette(2));
        // Ensures return statement is String ("BANG")
        Assertions.assertEquals("Click", qapExample.russianRoulette(5));
        // Ensures return statement is String ("Click")
        Assertions.assertNotEquals("BANG", qapExample.russianRoulette(1) );
        // Ensures return statement != String ("BANG")
    }

}
