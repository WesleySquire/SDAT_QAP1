package com.keyin.qap1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QAPExampleTest {

    @Test
    public void QAPExampleTest1(){
        QAPExample qapExample = new QAPExample();

        Assertions.assertTrue(qapExample.findSequenceInWord("find", "is_find_in_this_char_sequence"));
        Assertions.assertFalse(qapExample.findSequenceInWord("find_me", "is_find_in_this_char_sequence"));
        Assertions.assertNotNull(qapExample.findSequenceInWord("find_me", "is_find_in_this_char_sequence"));

    }

    @Test
    public void QAPExampleTest2(){
        QAPExample qapExample = new QAPExample();

        Assertions.assertTrue(qapExample.doesEqualTen(7,3));
        Assertions.assertFalse(qapExample.doesEqualTen(7,7));



    }
    @Test
    public void QAPExampleTest3(){

    }

}
