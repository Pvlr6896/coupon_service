package com.lokesh.spring.coupon.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.lokesh.spring.coupon.model.Coupon;

@Repository
public interface CouponRepository extends MongoRepository<Coupon, String> {

	Optional<Coupon> findByCode(String code);

}
