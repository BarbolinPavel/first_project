package guru.qa.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

public class ManyTests {
    @Test
    void successedTest1(){
        Assertions.assertEquals("Good","Good");
    }
    @Test
    void successedTest2(){
        Assertions.assertEquals("Good","Good");
    }
    @Test
    void successedTest3(){
        Assertions.assertEquals("Good","Good");
    }
    @Test
    void successedTest4(){
        Assertions.assertEquals("Good","Good");
    }
    @Test
    void successedTest5(){
        Assertions.assertEquals("Good","Good");
    }
    @Test
//    @Disabled
    void failTest5(){
        Assertions.assertEquals("Good","Bad");
    }

}
