package com.learn.kotlin

import javax.persistence.Entity
import javax.persistence.Table
import javax.persistence.Id
import javax.persistence.Column

@Entity
@Table(name = "customer")
class Customer(
		@Id
		val Id: Long = 1,
		@Column(name = "firstName")
		val firstName: String = "",
		@Column(name = "lastName")
		val lastName: String = "",
		@Column(name = "country")
		val country: String = "",
		@Column(name = "accountNumber")
		val accountNumber: String = "",
		@Column(name = "routingNumber")
		val routingNumber: String = ""

) {
	override fun toString(): String {
		return "Customer[id=${Id}, firstName=${firstName}, lastName=${lastName},country=${country},accountNumber=${accountNumber},routingNumber=${routingNumber}]"
	}
}