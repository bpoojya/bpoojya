package com.problems.exercises;

import com.problems.exercises.random.CustomCacheWithList;
import com.problems.exercises.testObjects.ChildClass;
import com.problems.exercises.testObjects.SuperClass;
import org.junit.Assert;
import org.junit.Test;

public class CustomCacheWithListTest {

    @Test
    public void testPositive() throws Exception {
        CustomCacheWithList customCache = new CustomCacheWithList();
        customCache.insert("name", "Poojya");
        customCache.insert(12, 15);
        customCache.insert(15, 1);
        Assert.assertEquals(1, customCache.getkey(15));
        Assert.assertEquals(15, customCache.getkey(12));
        Assert.assertEquals("Poojya", customCache.getkey("name"));

    }

    @Test
    public void testNegative() throws Exception {
        CustomCacheWithList customCache = new CustomCacheWithList();
        try {
            customCache.insert("name", "Poojya");
            customCache.insert("peace", 123);
        } catch (Exception e) {
            System.out.println("Exception Occured while inserting data" + e.getMessage());
        }
        Assert.assertEquals("Poojya", customCache.getkey("name"));
        Assert.assertEquals(null, customCache.getkey("peace"));

    }

    @Test
    public void testWithObjects() throws Exception {
        CustomCacheWithList customCache = new CustomCacheWithList();
        ChildClass childObj = new ChildClass();
        ChildClass childObj1 = new ChildClass();
        SuperClass superObj = new SuperClass();
        SuperClass superObj1 = new SuperClass();
        try {
            customCache.insert(childObj, "string");
            Assert.assertEquals("string", customCache.getkey(childObj));
            customCache.insert(childObj, "string2");
            customCache.insert(superObj, "peace");
            customCache.insert(childObj1, 123);
            customCache.insert(superObj1, 456);
        } catch (Exception e) {
            System.out.println("Exception Occured while inserting data" + e.getMessage());
        }
        Assert.assertEquals("string2", customCache.getkey(childObj));
        Assert.assertEquals("peace", customCache.getkey(superObj));
        Assert.assertEquals(null, customCache.getkey(childObj1));
        Assert.assertEquals(null, customCache.getkey(superObj1));


    }

    @Test(expected = RuntimeException.class)
    public void testException() throws Exception {
        CustomCacheWithList customCache = new CustomCacheWithList();
        ChildClass childObj = new ChildClass();
        ChildClass childObj1 = new ChildClass();
        SuperClass superObj = new SuperClass();
        SuperClass superObj1 = new SuperClass();

            customCache.insert(childObj, "string");
            Assert.assertEquals("string", customCache.getkey(childObj));
            customCache.insert(childObj, "string2");
            customCache.insert(superObj, "peace");
            customCache.insert(childObj1, 123);
            customCache.insert(superObj1, 456);
            Assert.assertEquals(null, customCache.getkey(childObj1));
            Assert.assertEquals(null, customCache.getkey(superObj1));


    }

}