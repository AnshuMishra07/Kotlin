package com.learn.kotlin

import java.util.concurrent.atomic.AtomicLong
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.stereotype.Component
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody

@RestController
open class UserController {
	@Autowired
	lateinit var customerRepo: CustomerRepository


	@PostMapping("/regsiter")
	fun regsiterUser(@RequestBody user: User): String {
		customerRepo.save(Customer(user.id, user.firstName, user.lastName, user.country, user.accountNumber, user.routingNumber))
		return "User has been registered"
	}

	@GetMapping("/findall")
	fun findAllCustomer(): String {
		var result = ""

		for (cust in customerRepo.findAll()) {
			result += cust.toString() + "****************"
		}

		return result
	}

	@GetMapping("/findbyid")
	fun findAllCustomerById(@RequestParam("id") id: Long): String {

		return customerRepo.findById(id).toString()
	}

	@GetMapping("/findbylastname")
	fun fetchDataByLastName(@RequestParam("lastname") lastName: String): String {
		var result = ""

		for (cust in customerRepo.findByLastName(lastName)) {
			result += cust.toString() + "****************"
		}

		return result
	}
}