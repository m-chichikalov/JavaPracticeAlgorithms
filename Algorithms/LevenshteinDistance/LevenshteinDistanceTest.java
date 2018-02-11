package Algorithms.LevenshteinDistance;

import org.junit.Assert;
import org.junit.Test;

public class LevenshteinDistanceTest extends Assert{

     /*
     * apply(null, *)             = IllegalArgumentException
     * apply(*, null)             = IllegalArgumentException
     * apply("rv9yw","rv9yw")     = 0
     * apply("","")               = 0
     * apply("","a")              = 1
     * apply("aaapppp", "")       = 7
     * apply("frog", "fog")       = 1
     * apply("fly", "ant")        = 3
     * apply("elephant", "hippo") = 7
     * apply("hippo", "elephant") = 7
     * apply("hippo", "zzzzzzzz") = 8
     * apply("hello", "hallo")    = 1
     */

    @Test(expected = IllegalArgumentException.class)
    public void oneOfThemNull () {

        int result = LevenshteinDistance.apply("rv9yw", null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void otherOfThemNull () {

        int result = LevenshteinDistance.apply(null, "rv9yw");
    }

    @Test
    public void emptyStringAsParameter () {

        int result = LevenshteinDistance.apply("", "rv9yw");
        assertEquals(result, 5);

        result = LevenshteinDistance.apply("rv9yw_ra9ylx", "");
        assertEquals(result, 12);
    }

    @Test
    public void equalStringAsParameter () {

        int result = LevenshteinDistance.apply("rv9yw", "rv9yw");
        assertEquals(result, 0);

        result = LevenshteinDistance.apply("", "");
        assertEquals(result, 0);
    }

    @Test
    public void insertCharacter () {

        int result = LevenshteinDistance.apply("frog", "fog");
        assertEquals(result, 1);

        result = LevenshteinDistance.apply("rv9", "rv9yw");
        assertEquals(result, 2);

        result = LevenshteinDistance.apply("9yw", "rv9yw");
        assertEquals(result, 2);
    }

    @Test
    public void substitutionCharacter () {

        int result = LevenshteinDistance.apply("cap", "map");
        assertEquals(result, 1);

        result = LevenshteinDistance.apply("rv9yw", "rv9zz");
        assertEquals(result, 2);

        result = LevenshteinDistance.apply("fly", "ant");
        assertEquals(result, 3);
    }

    @Test
    public void deletionCharacter () {

        int result = LevenshteinDistance.apply("1cap", "cap");
        assertEquals(result, 1);

        result = LevenshteinDistance.apply("rv9yw", "rv9yww");
        assertEquals(result, 1);

        result = LevenshteinDistance.apply("abcde", "cdef");
        assertEquals(result, 3);

//        result = LevenshteinDistance.apply("abcde", "cFeG");
//        assertEquals(result, 4);
    }

    @Test
    public void extraTest () {

        int result = LevenshteinDistance.apply("elephant", "hippo");
        assertEquals(result, 7);

        result = LevenshteinDistance.apply("hippo", "elephant");
        assertEquals(result, 7);

        result = LevenshteinDistance.apply("hippo", "elephippoant");
        assertEquals(result, 7);

//        result = LevenshteinDistance.apply("hippoooo", "elephant");
//        assertEquals(result, 8);

    }


}
