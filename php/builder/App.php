<?php

// cara biasa tidak pake builder pattern
//$customer1 = new Customer('1', "usup", "suparma", "usup@mail.com", "1234");
//
//$customer2 = new Customer('1', "usup", "suparma", "usup@mail.com", "1234", "maja");
//
//$customer3 = new Customer('1', "usup", "suparma", "usup@mail.com", "1234", "maja", 30);
//
//$customer4 = new Customer('1', "usup", "suparma", "usup@mail.com", "1234", "", 30);
//


$customer1 = (new CustomerBuilder())
    ->setFirstName('Usup')
    ->setLastName('Suparma')
    ->build();

$customer2 = (new CustomerBuilder())
    ->setFirstName('Eko')
    ->setAge(20)
    ->setAddress('Jakarta')
    ->build();

$customer3 = (new CustomerBuilder())
    ->setFirstName('Wina')
    ->setId('001')
    ->setLastName("Ningsih")
    ->setHoby('Tiduran')
    ->build();

// bisa milih mau apa saja di dalam objeck nya
