package com.lokesh.spring.coupon.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lokesh.spring.coupon.model.Coupon;
import com.lokesh.spring.coupon.repository.CouponRepository;

@RestController
@RequestMapping("/coupon/api")
public class CouponController {

	@Autowired
	private CouponRepository couponRepository;

	@PostMapping("/createcoupon")
	public Coupon createCoupon(@RequestBody Coupon coupon) {
		return couponRepository.save(coupon);
	}

	@GetMapping("/getcoupon/{code}")
	public Optional<Coupon> getCoupon(@PathVariable String code) {
		return couponRepository.findByCode(code);
	}
}
