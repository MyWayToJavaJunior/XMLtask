package kz.e16training.xmltask;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author DK
 * @version 1.0.0
 *
 */
public class Run {
    static Logger log = LogManager.getLogger(Run.class.getName());
    public static void main(String[] args) {
        log.debug("program started");
        log.debug("program ended");
    }
}
