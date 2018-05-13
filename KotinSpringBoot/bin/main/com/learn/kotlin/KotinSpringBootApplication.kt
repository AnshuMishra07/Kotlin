package com.learn.kotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.SpringApplication

@SpringBootApplication
 open class KotinSpringBootApplication

 fun main(args: Array<String>) {
     SpringApplication.run(KotinSpringBootApplication::class.java, *args);
	
}
