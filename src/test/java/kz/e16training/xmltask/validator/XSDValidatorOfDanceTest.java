package kz.e16training.xmltask.validator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Validation Test.
 *
 */
public class XSDValidatorOfDanceTest {

    private static final String VALID_XML = ".\\src\\main\\resources\\Dance.xml";
    private static final String INVALID_XML = ".\\src\\main\\resources\\AnyDance.xml";
    private static final String SCHEME = ".\\src\\main\\resources\\xmldance.xsd";

    @Test
    public void testXSDValidatorOfDanceWithValidXML() throws Exception {
        assertTrue(XSDValidatorOfDance.validate(VALID_XML, SCHEME));
    }

    @Test
    public void testInvalidXSDValidatorOfDanceWithInvalidXML() throws Exception {
        assertFalse(XSDValidatorOfDance.validate(INVALID_XML, SCHEME));
    }
}