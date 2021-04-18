package hello.springmvc.basic

import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class LogTestController {

    private final val log = LoggerFactory.getLogger(javaClass);

    @GetMapping("/log-test")
    fun logTest(): String {
        val name = "Spring"

        log.trace("trace log = {}", name);
        log.debug("debug log = {}", name);
        log.info("info log = {}", name);
        log.warn("warn log = {}", name);
        log.error("error log = {}", name);

        return "ok"
    }
}
