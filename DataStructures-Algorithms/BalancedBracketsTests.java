import static org.junit.Assert.*;

import org.junit.Test;

public class BalancedBracketsTests {
    BalancedBrackets bb = new BalancedBrackets();

    @Test
    public void testBalancedBrackets_balancedParens() {
        assertTrue(bb.balancedBrackets("(1)"));
    }

    @Test
    public void testBalancedBrackets_tooManyOpenParens() {
        assertFalse(bb.balancedBrackets("({1)"));
    }

    @Test
    public void testBalancedBrackets_tooManyOpenParens1() {
        assertFalse(bb.balancedBrackets("(1)("));
    }

    @Test
    public void testBalancedBrackets_tooManyClosedParens() {
        assertFalse(bb.balancedBrackets("(1))"));
    }

    @Test
    public void testBalancedBrackets_startClosedParens() {
        assertFalse(bb.balancedBrackets(")("));
    }

    @Test
    public void testBalancedBrackets_emptyString() {
        assertTrue(bb.balancedBrackets(""));
    }

    @Test
    public void testBalancedBrackets_balancedAngleBrackets() {
        assertTrue(bb.balancedBrackets("<<>>"));
    }

    @Test
    public void testBalancedBrackets_balancedComboBrackets() {
        assertTrue(bb.balancedBrackets("<({})>"));
    }

    @Test
    public void testBalancedBrackets_mismatchedBrackets() {
        assertFalse(bb.balancedBrackets("<({)}>>"));
    }

    @Test
    public void testBalancedParentheses_balancedParens() {
        assertTrue(bb.balancedParentheses("(())"));
    }

    @Test
    public void testBalancedParentheses_tooManyClosedParens() {
        assertFalse(bb.balancedParentheses("(())))"));
    }
}
