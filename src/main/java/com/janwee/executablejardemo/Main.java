package com.janwee.executablejardemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger LOG = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        LOG.debug("debug message");
        LOG.info("info message");
        LOG.error("error message");
    }
}
