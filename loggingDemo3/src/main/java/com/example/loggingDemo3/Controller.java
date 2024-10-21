package com.example.loggingDemo3;

import org.apache.logging.log4j.ThreadContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private static final ResultGenLogger logger = new ResultGenLogger(Controller.class);

    @GetMapping("/logs/faculty")
    private String faculty() {

        String userType = "faculty";

        // import org.apache.logging.log4j.ThreadContext;
        ThreadContext.put("userType",userType);

        try {
            logger.infoLogger("Started processing request for ", userType);

        } finally {
            ThreadContext.clearAll();
        }

        return userType;
    }

    @GetMapping("/logs/cv")
    private String cv() {

        String userType = "cv";

        ThreadContext.put("userType",userType);

        try {
            logger.infoLogger("Started processing request for ", userType);

        } finally {

            ThreadContext.clearAll();
        }

        return userType;
    }

    @GetMapping("/logs/edp")
    private String edp() {

        String userType = "edp";

        ThreadContext.put("userType",userType);

        try {
            logger.infoLogger("Started processing request for ", userType);
            logger.warnLogger("Warning.....", userType);

        } finally {

            ThreadContext.clearAll();
        }

        return userType;
    }

    @GetMapping("/logs/panel")
    private String panel() {

        String userType = "panel";

        ThreadContext.put("userType",userType);

        try {
            logger.infoLogger("Started processing request for ", userType);


        } finally {

            ThreadContext.clearAll();
        }

        return userType;
    }

    @GetMapping("/logs/exam")
    private String exam() {

        String userType = "exam";

        ThreadContext.put("userType",userType);

        try {
            logger.infoLogger("Started processing request for ", userType);

        } finally {

            ThreadContext.clearAll();
        }

        return userType;
    }

}
