package com.spring.user.bookingservice.userbookingservice.bookingcontroller;

import com.spring.user.bookingservice.userbookingservice.bookingservice.PaymentServiceBroker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("bookings")
public class BookingApi {

    @Autowired
    //Controller - Service Connection Established....
    private PaymentServiceBroker paymentServiceBroker;

    @GetMapping("/book")
    public String reserveBookingTicket()
    {
        return this.paymentServiceBroker.makePayment();
    }




}
