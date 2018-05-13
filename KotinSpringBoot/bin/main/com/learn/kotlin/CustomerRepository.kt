package com.learn.kotlin

import org.springframework.data.repository.CrudRepository

interface CustomerRepository : CrudRepository <Customer, Long> {
	fun findByLastName(lastname:String):List<Customer>
}