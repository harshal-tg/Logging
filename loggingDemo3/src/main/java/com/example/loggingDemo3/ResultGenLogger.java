package com.example.loggingDemo3;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ResultGenLogger {

    private final Logger logger;

    public ResultGenLogger(Class<?> class1) {
        this.logger = LogManager.getLogger(class1);
    }

    public void infoLogger(String message,String userType) {

        /*********/
            int userId = 1; // Will come from user's session
        /*********/

        // Any meta-data
        logger.info(message + userType + " user with user ID : " + userId);

    }

    public void warnLogger(String message,String userType) {

        /*********/
            int userId = 1;
        /*********/

        logger.warn(message + userType + " user with user ID : " + userId);

    }

    public void errorLogger(String message,String userType) {

        /*********/
            int userId = 1;
        /*********/

        logger.error(message + userType + " user with user ID : " + userId);


    }

}
