package kz.e16training.xmltask.validator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;

/**
 * Simple XSD Validator.
 *
 */
public class XSDValidatorOfDance {
    private static Logger log = LogManager.getLogger(XSDValidatorOfDance.class.getName());
    public static boolean validate(String xmlPath, String xsdPath) {
        boolean result = false;
        SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        try {
            Schema schema = factory.newSchema(new File(xsdPath));
            Validator validator = schema.newValidator();
            validator.validate(new StreamSource(new File(xmlPath)));
            result = true;
        } catch (SAXException | IOException e) {
            log.error(e.getMessage());
        }
        return result;
    }
}
