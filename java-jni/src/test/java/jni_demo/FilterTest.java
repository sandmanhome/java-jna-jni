/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package jni_demo;

import org.junit.Test;
import static org.junit.Assert.*;

public class FilterTest {
    @Test public void testFilter() throws Exception {
        assertNull(Filter.create("should not exist"));
        Filter filter = Filter.create("i64_gt");
        assertNotNull(filter);
    }
}