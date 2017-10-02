package com.example.demo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan

@EnableAutoConfiguration
@ComponentScan("my.app.*")
class BootApplication{
	
}
	fun main(args: Array<String>) {
		SpringApplication.run(BootApplication::class.java, *args)
	}



