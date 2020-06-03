<?php

// biasa
//$manager1 = new Employee('Eko', 'manager', 10000000);
//$manager2 = new Employee('Eko', 'manager', 10000000);
//$staff1 = new Employee('Joko', 'Staff', 500000);
//$staff3 = new Employee('Udin', 'Staff', 500000);

// factory

$manager1 = EmployeeFactory::createManager('Usup');
$manager2 = EmployeeFactory::createManager('Joko');

$staff1 = EmployeeFactory::createStaff('Suparma');

// cara biasa
$tiger = new Tiger();

// cara menggunakan factory
$tiger = AnimalFactory::create('tiger');
$cat = AnimalFactory::create('cat');