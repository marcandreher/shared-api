package de.marcandreher;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Shared API for the application.
 */
public class App 
{
    private static Logger logger = LoggerFactory.getLogger("SharedAPI");

    public static void main( String[] args )
    {
        logger.error("This shouldn't be run");

    }
}
