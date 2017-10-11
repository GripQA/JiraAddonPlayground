package ut.qa.grip.jiraplugin;

import org.junit.Test;
import qa.grip.jiraplugin.api.MyPluginComponent;
import qa.grip.jiraplugin.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}