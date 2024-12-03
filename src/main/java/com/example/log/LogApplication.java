package com.example.log;




import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@Slf4j
public class LogApplication {
	private static Logger log = LoggerFactory.getLogger(LogApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(LogApplication.class, args);

		String msn = "deu certo";
		log.info("Mensagem: " + msn);
		//log.error("Mensagem error");
		//log.warn("Mensagem warn");
		//log.trace("Mensagem trace");
		//log.debug("Mensagem debug");
	}
}


