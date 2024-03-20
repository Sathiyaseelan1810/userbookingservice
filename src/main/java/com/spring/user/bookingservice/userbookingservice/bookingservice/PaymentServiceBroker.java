package com.spring.user.bookingservice.userbookingservice.bookingservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
@FeignClient(name = "userpamentservice", url = "http://localhost:9092/payments")

// FeignClient - used to call between the services...
// Call the booking service in the URL and it automatically calls the Payment Service.

//URL is not required if we are using the Eureka Server
public interface PaymentServiceBroker {

    @GetMapping("/pay")
    public String makePayment();



}
