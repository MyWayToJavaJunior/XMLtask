package kz.e16training.xmltask.parsers;

import kz.e16training.xmltask.entity.Dance;

import java.util.ArrayList;
import java.util.List;

/**
 * Abstract parser.
 *
 */
public abstract class AbstractParser {
    protected List<Dance> danceList = new ArrayList<>();
    public abstract List<Dance> parseDocument(String xml);
}
