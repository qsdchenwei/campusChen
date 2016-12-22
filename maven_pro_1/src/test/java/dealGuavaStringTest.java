import junit.framework.TestCase;

/**
 * Created by yangyening on 2016/11/8.
 */
public class dealGuavaStringTest extends TestCase {
    public void testDealJoinerString() throws Exception {
        dealGuavaString deal=new dealGuavaString();
        String a=deal.dealJoinerString();
        assertEquals("ac;a;a0",a);

    }

}