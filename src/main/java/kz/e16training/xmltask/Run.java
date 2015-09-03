package kz.e16training.xmltask;

import kz.e16training.xmltask.validator.XSDValidatorOfDance;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author DK
 * @version 1.0.0
 *
 */
public class Run {
    private static final String XML = ".\\src\\main\\resources\\Dance.xml";
    private static final String SCHEME = ".\\src\\main\\resources\\xmldance.xsd";
    private static Logger log = LogManager.getLogger(Run.class.getName());
    public static void main(String[] args) {
        log.debug("program started");
        if (XSDValidatorOfDance.validate(XML, SCHEME)) {
            System.out.println("DOM:");
            /*ListView.print(new DOMParserOfDance().parseDocument(XML));*/
            System.out.println("SAX:");
            /*ListView.print(new SAXParserOfDance().parseDocument(XML));*/
            System.out.println("StAX:");
            /*ListView.print(new StAXParserOfDance().parseDocument(XML));*/
            System.out.println();
        }
        log.debug("program ended");
    }
}
