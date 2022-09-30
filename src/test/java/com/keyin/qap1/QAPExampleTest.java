package com.keyin.qap1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QAPExampleTest {

    @Test
    public void QAPExampleTest1(){
        QAPExample qapExample = new QAPExample();

        Assertions.assertTrue(qapExample.findSequenceInWord("find", "is_find_in_this_char_sequence"));
        Assertions.assertFalse(qapExample.findSequenceInWord("find_me", "is_find_in_this_char_sequence"));
        Assertions.assertNotEquals(false, qapExample.findSequenceInWord("find_me", "find_me_in_your_dreams"));

    }

    @Test
    public void QAPExampleTest2(){
        QAPExample qapExample = new QAPExample();

        Assertions.assertTrue(qapExample.doesEqual(7,3, 10));
        Assertions.assertFalse(qapExample.doesEqual(7,7, 10));
        Assertions.assertSame(qapExample.doesEqual(40,5, 45), true);




    }
    @Test
    public void QAPExampleTest3(){
        QAPExample qapExample = new QAPExample();


    }

}
